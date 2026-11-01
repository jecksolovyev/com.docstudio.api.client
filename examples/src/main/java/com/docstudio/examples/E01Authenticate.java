package com.docstudio.examples;

import com.docstudio.client.ApiClient;
import com.docstudio.client.api.UserControllerApi;
import com.docstudio.client.model.ProfileDTO;

/**
 * 01 - authenticate and read your own profile.
 *
 * <p>getProfile takes no parameters and no mailbox, so it is the shortest proof a token works.
 */
public final class E01Authenticate {

    public static void main(String[] args) {
        Examples.run(() -> {
            System.out.println("base path: " + Examples.basePath());

            ApiClient client = Examples.authenticated();
            ProfileDTO profile = new UserControllerApi(client).getProfile();

            System.out.printf("signed in as %s %s <%s>%n",
                    profile.getFirstName(), profile.getLastName(), profile.getEmail());
            System.out.printf("uuid        %s%n", profile.getUuid());
            System.out.printf("locale      %s, timezone %s%n",
                    profile.getLocale(), profile.getTimezone());
            System.out.printf("accounts    %d%n",
                    profile.getAccounts() == null ? 0 : profile.getAccounts().size());
        });
    }
}
