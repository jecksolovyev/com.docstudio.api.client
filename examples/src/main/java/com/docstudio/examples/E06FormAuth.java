package com.docstudio.examples;

import com.docstudio.client.ApiClient;
import com.docstudio.client.auth.ApiKeyAuth;

/**
 * 06 - the form credential, for the signing surface.
 *
 * <p>Not runnable: the API issues no form token. One reaches a signer inside the link that
 * createNewForm returns (FormGet.link), and the signer's browser presents it. This class
 * exists to show the wiring, which differs from the bearer credential in two ways.
 */
public final class E06FormAuth {

    public static void main(String[] args) {
        String formToken = System.getenv("DOCSTUDIO_FORM_TOKEN");
        if (formToken == null || formToken.isEmpty()) {
            formToken = "<token from the form link>";
        }

        // The scheme is registered under its OpenAPI name, and the prefix is set separately.
        ApiClient form = new ApiClient().setBasePath(Examples.basePath());
        ApiKeyAuth formAuth = (ApiKeyAuth) form.getAuthentication("formAuth");
        formAuth.setApiKey(formToken);
        formAuth.setApiKeyPrefix("Form");

        // Both credentials travel in the same header, so a client carries one or the other.
        ApiClient bearer = new ApiClient().setBasePath(Examples.basePath());
        bearer.setBearerToken("<access token>");

        System.out.printf("form credential   -> %s %s%n",
                formAuth.getApiKeyPrefix(), formAuth.getApiKey());
        System.out.printf("bearer credential -> Bearer <access token>%n");
        System.out.println("""

                Nine operations accept only this credential, all of them on FormControllerApi:
                getFormView, sendFormEnvelope, fillFormEnvelope, signFormEnvelope,
                approveFormEnvelope, rejectFormEnvelope, getFormDocumentPrintVersion,
                getFormDocumentsForSign, forSignFile.

                Eleven more accept either, among them downloadFinalPdf and signEnvelope, so the
                same code serves a signed-in user and a form recipient by swapping the client.""");
    }
}
