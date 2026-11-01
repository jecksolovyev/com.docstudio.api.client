package com.docstudio.examples;

import com.docstudio.client.ApiClient;
import com.docstudio.client.api.EnvelopeControllerApi;
import com.docstudio.client.api.MiscControllerApi;
import com.docstudio.client.model.BulkEnvelopeActionDTO;
import com.docstudio.client.model.CryptoProperties;
import com.docstudio.client.model.EnvCancellationRequestDTO;
import com.docstudio.client.model.EnvGetDTO;
import com.docstudio.client.model.QuickSendDTO;
import com.docstudio.client.model.QuickSendRecipientDTO;
import com.docstudio.client.model.SingleUuidDTO;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 04 - the full lifecycle: send a PDF for signature, follow it, fetch the result, clean up.
 *
 * <p>quick-send is the one route that is fully typed in the OpenAPI document: it uploads the
 * file and attaches the recipients in a single call, and creates no template to clean up
 * afterwards. The alternative route (upload -&gt; template -&gt; envelope -&gt; send) carries
 * the document layout as an XML string the document does not describe.
 *
 * <p>The envelope cannot reach COMPLETED here: the signature is made by the recipient,
 * in their browser or with their key. The example follows it as far as a sender can.
 *
 * <p>Note where the documentId comes from. Every authenticated download needs one, and
 * the only typed source is getDocumentsForSign - the signer's call, which answers the
 * sender 403 "No active role for mailbox". getEnvelopeZip carries no security
 * requirement at all, so the client sends it unauthenticated and the server rejects it;
 * it belongs to the public access-code flow. What a sender has is envelope.data.
 */
public final class E04SendForSignature {

    private static final Pattern DOCUMENT_ID = Pattern.compile("<document\\s+id=\"([^\"]+)\"");

    private static final int POLL_ATTEMPTS = 5;
    private static final long POLL_INTERVAL_MS = 2000L;

    public static void main(String[] args) {
        Examples.run(() -> {
            String signer = System.getenv("DOCSTUDIO_SIGNER_EMAIL");
            if (signer == null || signer.isEmpty()) {
                throw new IllegalStateException(
                        "DOCSTUDIO_SIGNER_EMAIL is not set - this example emails a real address");
            }

            ApiClient client = Examples.authenticated();
            UUID mailbox = Examples.mailboxUuid(client);
            EnvelopeControllerApi envelopes = new EnvelopeControllerApi(client);

            File document = new File("example-document.pdf");
            if (!document.isFile()) {
                throw new IllegalStateException(
                        "run this from the examples directory - " + document.getAbsolutePath()
                                + " does not exist");
            }

            // Which signature a recipient can be asked for belongs to the deployment,
            // not to the account. api.docstudio.com runs the AMERICA region, which has no
            // cryptographic signature providers at all, so asking for a signer there is
            // answered 422 "No signature provider for digital signing". What a signer
            // draws instead is an eInk signature. A region with providers configured
            // takes the digital route.
            CryptoProperties crypto = new MiscControllerApi(client).appSettings().getCrypto();
            boolean digital = crypto.getSignatureProviders() != null
                    && !crypto.getSignatureProviders().isEmpty();
            if (!digital && !Boolean.TRUE.equals(crypto.getEinkSupported())) {
                throw new IllegalStateException("region " + crypto.getRegion()
                        + " offers neither a digital nor an eInk signature");
            }
            System.out.printf("region %s: asking for %s signature%n",
                    crypto.getRegion(), digital ? "a digital" : "an eInk");

            // With neither flag the recipient is only copied in. There is no role enum.
            QuickSendRecipientDTO recipient = new QuickSendRecipientDTO().recipient(signer);
            if (digital) {
                recipient.signer(true);
            } else {
                recipient.eInkSignature(true);
            }

            QuickSendDTO request = new QuickSendDTO()
                    .subject("API client example " + OffsetDateTime.now())
                    .message("Sent by the DocStudio API client example. No action needed.")
                    .recipients(List.of(recipient));

            SingleUuidDTO created = envelopes.quickSendExternalDocuments(
                    mailbox, request, List.of(document));

            UUID envelopeUuid = created.getUuid();
            System.out.printf("sent %s to %s%n", envelopeUuid, signer);

            try {
                EnvGetDTO envelope = null;
                String status = null;
                for (int attempt = 1; attempt <= POLL_ATTEMPTS; attempt++) {
                    envelope = envelopes.getEnvelopeByUuid(envelopeUuid, mailbox).getEnvelope();
                    System.out.printf("  %d/%d  %s  %d/%d participants done%n",
                            attempt, POLL_ATTEMPTS, envelope.getStatus(),
                            envelope.getCompleted() == null ? 0 : envelope.getCompleted(),
                            envelope.getTotal() == null ? 0 : envelope.getTotal());

                    status = String.valueOf(envelope.getStatus());
                    if ("COMPLETED".equals(status) || "CANCELLED".equals(status)) {
                        break;
                    }
                    if (attempt < POLL_ATTEMPTS) {
                        Thread.sleep(POLL_INTERVAL_MS);
                    }
                }

                // envelope.data is typed as a plain string, but it is the envelope XML,
                // and the document ids a sender needs are the only place they appear.
                // The OpenAPI document describes nothing inside it, so this is the one
                // spot in these examples that reads an undescribed format.
                Matcher matcher = DOCUMENT_ID.matcher(
                        envelope.getData() == null ? "" : envelope.getData());
                List<String> ids = new ArrayList<>();
                while (matcher.find()) {
                    ids.add(matcher.group(1));
                }
                System.out.printf("%n%d document(s): %s%n", ids.size(), String.join(", ", ids));

                // The final PDF is assembled when the last participant has signed. Asking
                // a SENT envelope for it is answered 403 "Wrong envelope status", so an
                // envelope nobody has signed yet - as far as an example can drive one -
                // has none.
                if ("COMPLETED".equals(status)) {
                    // Binary responses arrive as a temporary File.
                    File pdf = envelopes.downloadFinalPdf(envelopeUuid, ids.get(0), mailbox, false);
                    Path target = Path.of("envelope-final.pdf");
                    Files.copy(pdf.toPath(), target, StandardCopyOption.REPLACE_EXISTING);
                    System.out.printf("wrote %s (%d bytes)%n", target, Files.size(target));
                } else {
                    System.out.printf(
                            "no final PDF while the envelope is %s: it is built on completion%n",
                            status);
                }
            } finally {
                String keep = System.getenv("DOCSTUDIO_KEEP_ENVELOPE");
                if (keep != null && !keep.isEmpty()) {
                    System.out.printf("%nleaving %s in place (DOCSTUDIO_KEEP_ENVELOPE is set)%n",
                            envelopeUuid);
                } else {
                    // A sent envelope is voided, not deleted, and the comment is mandatory.
                    envelopes.cancelEnvelopes(mailbox, new EnvCancellationRequestDTO()
                            .uuids(Collections.singleton(envelopeUuid))
                            .comment("API client example cleanup"));
                    envelopes.recycleBin(true, mailbox, new BulkEnvelopeActionDTO()
                            .uuids(Collections.singleton(envelopeUuid)));

                    EnvGetDTO envelope =
                            envelopes.getEnvelopeByUuid(envelopeUuid, mailbox).getEnvelope();
                    System.out.printf("%ncleaned up: status %s, in recycle bin %s%n",
                            envelope.getStatus(), envelope.getDeleted());
                }
            }
        });
    }
}
