package com.docstudio.examples;

import com.docstudio.client.ApiClient;
import com.docstudio.client.api.ApplicationTokenControllerApi;
import com.docstudio.client.model.AppTokenDTO;
import com.docstudio.client.model.CreateAppTokenDTO;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * 05 - mint a long-lived application token, then revoke it.
 *
 * <p>This is the credential a server-to-server integration should hold: log in with a
 * password once, mint a token, and never send the password again. Set the result as
 * DOCSTUDIO_TOKEN and the other examples use it.
 *
 * <p>A tenant may have this feature switched off, in which case every call here answers
 * 405 "Method disabled by configuration".
 */
public final class E05ApplicationToken {

    public static void main(String[] args) {
        Examples.run(() -> {
            ApiClient client = Examples.authenticated();
            ApplicationTokenControllerApi tokens = new ApplicationTokenControllerApi(client);

            List<AppTokenDTO> existing = tokens.getUserTokens();
            System.out.printf("%d existing token(s)%n", existing.size());
            for (AppTokenDTO token : existing) {
                System.out.printf("  %s  %s  expires %s  last used %s%n",
                        token.getId(), token.getName(), token.getExpireAt(),
                        token.getLastUsedAt() == null ? "never" : token.getLastUsedAt());
            }

            CreateAppTokenDTO request = new CreateAppTokenDTO()
                    .name("api-client-example " + OffsetDateTime.now())
                    .expireAt(OffsetDateTime.now().plusDays(30));

            AppTokenDTO created;
            try {
                created = tokens.createToken(request);
            } catch (Exception error) {
                System.out.printf("%ncould not create a token: %s%n", Examples.describe(error));
                return;
            }

            // The token value is returned once, at creation, and never again.
            String value = String.valueOf(created.getToken());
            System.out.printf("%ncreated %s (%s)%n", created.getId(), created.getName());
            System.out.printf("token    %s... (%d chars)%n",
                    value.substring(0, Math.min(8, value.length())), value.length());

            tokens.revokeToken(created.getId());
            System.out.printf("revoked  %s%n", created.getId());
        });
    }
}
