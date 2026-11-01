package com.docstudio.examples;

import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.api.AuthenticationControllerApi;
import com.docstudio.client.api.MailboxControllerApi;
import com.docstudio.client.model.LoginDTO;
import com.docstudio.client.model.LoginResponseDTO;
import com.docstudio.client.model.User2MailboxDTO;

import java.util.List;
import java.util.UUID;

/** Shared setup, so each example class contains only the calls it demonstrates. */
final class Examples {

    static final String DEFAULT_BASE_PATH = "https://api.docstudio.com";

    private Examples() {
    }

    static String basePath() {
        String value = System.getenv("DOCSTUDIO_BASE_URL");
        return isBlank(value) ? DEFAULT_BASE_PATH : value.replaceAll("/+$", "");
    }

    private static boolean isBlank(String value) {
        return value == null || value.isEmpty();
    }

    private static String required(String name, String hint) {
        String value = System.getenv(name);
        if (isBlank(value)) {
            throw new IllegalStateException(name + " is not set - " + hint);
        }
        return value;
    }

    /**
     * An application token is what a server-to-server integration should hold; email and
     * password are the fallback so the examples run before you have minted one.
     */
    static String accessToken() throws ApiException {
        String token = System.getenv("DOCSTUDIO_TOKEN");
        if (!isBlank(token)) {
            return token;
        }

        String login = required("DOCSTUDIO_EMAIL", "set it, or set DOCSTUDIO_TOKEN instead");
        String password = required("DOCSTUDIO_PASSWORD", "needed alongside DOCSTUDIO_EMAIL");

        ApiClient anonymous = new ApiClient().setBasePath(basePath());
        LoginResponseDTO session = new AuthenticationControllerApi(anonymous)
                .login(new LoginDTO().login(login).password(password), null);

        if (session.getToken() == null) {
            throw new IllegalStateException("login succeeded but returned no token");
        }
        // The model types the token as a UUID; the Authorization header wants its text form.
        return session.getToken().toString();
    }

    static ApiClient authenticated() throws ApiException {
        ApiClient client = new ApiClient().setBasePath(basePath());
        client.setBearerToken(accessToken());
        return client;
    }

    /** Most endpoints are mailbox-scoped and reject the call without this header. */
    static UUID mailboxUuid(ApiClient client) throws ApiException {
        String pinned = System.getenv("DOCSTUDIO_MAILBOX");
        if (!isBlank(pinned)) {
            return UUID.fromString(pinned);
        }

        // GET /api/v1/mailbox, not getMailboxesForUserView: the user-view endpoint behind that call
        // answers [] unless it is given mailboxesForAccount, so a bare call to it reads
        // as an account with no mailboxes at all. E02Mailboxes shows both.
        List<User2MailboxDTO> mailboxes = new MailboxControllerApi(client)
                .getAllForUserWithPagination(null, null, null, null, 0, 1)
                .getData();
        if (mailboxes == null || mailboxes.isEmpty()) {
            throw new IllegalStateException("this account has no mailboxes");
        }
        return mailboxes.get(0).getMailboxUuid();
    }

    /** ApiException's message is the status line; the body says what the server objected to. */
    static String describe(Exception error) {
        if (error instanceof ApiException) {
            ApiException api = (ApiException) error;
            return "HTTP " + api.getCode() + " - " + api.getResponseBody();
        }
        return error.getMessage();
    }

    interface Body {
        void run() throws Exception;
    }

    static void run(Body body) {
        try {
            body.run();
        } catch (Exception error) {
            System.err.println(describe(error));
            System.exit(1);
        }
    }
}
