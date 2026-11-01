package com.docstudio.examples;

import com.docstudio.client.ApiClient;
import com.docstudio.client.api.EnvelopeSearchControllerApi;
import com.docstudio.client.api.LabelControllerApi;
import com.docstudio.client.api.TemplateControllerApi;
import com.docstudio.client.model.EnvelopePageDTO;
import com.docstudio.client.model.EnvelopeToMailboxDTO;
import com.docstudio.client.model.LabelDTO;
import com.docstudio.client.model.PageDTOSearchTemplateDTO;
import com.docstudio.client.model.SearchEnvelopesDTO;
import com.docstudio.client.model.SearchTemplateDTO;

import java.util.List;
import java.util.UUID;

/**
 * 03 - read what is in a mailbox: templates, labels, envelopes.
 *
 * <p>All three take the mailbox UUID as their first argument, which the client sends as the
 * Mailbox header. Envelope search is a POST because the filter is a body, but it only reads.
 */
public final class E03Browse {

    public static void main(String[] args) {
        Examples.run(() -> {
            ApiClient client = Examples.authenticated();
            UUID mailbox = Examples.mailboxUuid(client);
            System.out.printf("mailbox %s%n%n", mailbox);

            PageDTOSearchTemplateDTO templates = new TemplateControllerApi(client)
                    .searchTemplates(mailbox, null, null, null, null, null, null, 0, 10);
            System.out.printf("templates: %d of %d%n",
                    templates.getNumberOfElements(), templates.getTotalElements());
            if (templates.getData() != null) {
                for (SearchTemplateDTO template : templates.getData()) {
                    System.out.printf("  %s  %s%n", template.getUuid(), template.getName());
                }
            }

            List<LabelDTO> labels = new LabelControllerApi(client).getAllLabels(mailbox);
            System.out.printf("%nlabels: %d%n", labels.size());
            for (LabelDTO label : labels) {
                System.out.printf("  %s  %s%n", label.getUuid(), label.getName());
            }

            // An empty filter is valid and means "everything this mailbox can see".
            EnvelopePageDTO envelopes = new EnvelopeSearchControllerApi(client)
                    .searchEnvelopes(mailbox, new SearchEnvelopesDTO(), 0, 10, null);
            System.out.printf("%nenvelopes: %d of %d%n",
                    envelopes.getNumberOfElements(), envelopes.getTotalElements());
            if (envelopes.getData() != null) {
                for (EnvelopeToMailboxDTO envelope : envelopes.getData()) {
                    System.out.printf("  %s  %-11s  %d/%d done%n",
                            envelope.getEnvelopeUuid(), envelope.getStatus(),
                            envelope.getCompleted() == null ? 0 : envelope.getCompleted(),
                            envelope.getTotal() == null ? 0 : envelope.getTotal());
                }
            }
        });
    }
}
