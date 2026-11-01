# Examples

Runnable examples for the DocStudio Java client. This directory is its own Maven project
and depends on the published artifact, so it exercises exactly what you would depend on.

```shell
cd examples
mvn compile
```

Java 17 or later for the examples themselves. The client is built for Java 8 and runs on
anything newer.

The dependency resolves through JitPack, which builds it from the public repository's tag
and needs no credentials. GitHub Packages serves the same code as
`com.docstudio:docstudio-api-client`; see the repository README if you prefer that route.

## Credentials

The examples read their configuration from the environment:

| variable | |
|---|---|
| `DOCSTUDIO_BASE_URL` | defaults to `https://api.docstudio.com` |
| `DOCSTUDIO_TOKEN` | application token, used as the bearer credential |
| `DOCSTUDIO_EMAIL`, `DOCSTUDIO_PASSWORD` | used instead if no token is set |
| `DOCSTUDIO_MAILBOX` | optional; defaults to your first mailbox |
| `DOCSTUDIO_SIGNER_EMAIL` | required by example 04 |

Example 05 mints a token you can put in `DOCSTUDIO_TOKEN`. Keep credentials out of the
repository — a `.env` file here is gitignored.

```shell
export DOCSTUDIO_TOKEN=...
mvn -q exec:java -Dexec.mainClass=com.docstudio.examples.E01Authenticate
```

## The examples

| | | |
|---|---|---|
| 01 | `E01Authenticate` | authenticate, then read your own profile |
| 02 | `E02Mailboxes` | list mailboxes and pick the UUID the rest need |
| 03 | `E03Browse` | templates, labels and envelopes in one mailbox |
| 04 | `E04SendForSignature` | send a PDF for signature, follow it, download, clean up |
| 05 | `E05ApplicationToken` | mint and revoke a long-lived token |
| 06 | `E06FormAuth` | the form credential (wiring only, see below) |

Run them in order; each assumes the previous one worked. Example 04 reads
`example-document.pdf` from the working directory, so run it from here.

**Example 04 sends real email** to `DOCSTUDIO_SIGNER_EMAIL` and creates a real envelope. It
cancels the envelope and moves it to the recycle bin when it finishes, including after a
failure. Set `DOCSTUDIO_KEEP_ENVELOPE=1` to keep it instead.

It stops short of `COMPLETED`: the signature is the recipient's to make, in their browser
or with their key, and no operation mints one. The final PDF is assembled on completion, so
an envelope still at `SENT` has none and asking for it answers `403 Wrong envelope status`.
The example reports that and cleans up.

**Example 06 does not call the API.** No endpoint issues a form token; one arrives inside
the link `createNewForm` returns. The class shows how the credential is configured.

## Server and client behaviour these examples had to account for

Verified against a live backend; each one is commented where it bites.

**`getMailboxesForUserView` returns an empty list unless you pass `mailboxesForAccount`.** It is
`GET /api/v1/mailbox/user-view`, which builds the sidebar view rather than listing
everything, so the obvious no-argument call looks like an account with no mailboxes at
all. Use `getAllForUserWithPagination` (`GET /api/v1/mailbox`) to enumerate, as the
helper in `Examples.java` does. Example 02 shows both side by side.

**A sender cannot get a `documentId` from a typed call.** Every authenticated download
needs one. `getDocumentsForSign` is the only operation that returns one and it is the
signer's call — it answers the sender `403 No active role for mailbox`. `getEnvelopeZip`
would need neither, but it carries no security requirement in the OpenAPI document, so
the client sends it unauthenticated and the server rejects it; it belongs to the public
access-code flow. The ids a sender can use are in `envelope.data`, typed as a plain
string but holding the envelope XML. Example 04 reads them from there, the one place in
these examples that parses an undescribed format.

**Which signature you may ask for belongs to the deployment, not the account.**
`api.docstudio.com` runs the AMERICA region, where `crypto.signatureProviders` is empty: a
quick-send recipient marked `signer` is refused with `422 No signature provider for digital
signing`. What a signer there draws is an eInk signature, `eInkSignature`. Example 04 reads
`appSettings()` and picks the role the region supports.

**Date-times must carry milliseconds.** The API parses them with
`yyyy-MM-dd'T'HH:mm:ss.SSSXXX`, so a timestamp without a fractional part is answered
`400 ... not a valid representation`. This client's serialization satisfies that as it stands.

**This client validates response JSON; the PHP and Node ones do not.** A field the
document marks required but the server sends as `null` fails here alone, with `Expected
the field '...' to be a primitive type in the JSON string but got 'null'`. R168.21 cleared
the two schemas this hit, `SearchTemplateDTO.description` among them, so example 03 now
reads templates the same way in all three languages.
