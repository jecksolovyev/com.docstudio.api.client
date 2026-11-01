package com.docstudio.examples;

import com.docstudio.client.ApiClient;
import com.docstudio.client.api.MailboxControllerApi;
import com.docstudio.client.model.PageDTOUser2MailboxDTO;
import com.docstudio.client.model.User2MailboxDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * 02 - list the mailboxes this user can act in.
 *
 * <p>Every mailbox-scoped endpoint needs one of these UUIDs, so this is the call that
 * follows authentication in any real integration.
 */
public final class E02Mailboxes {

    public static void main(String[] args) {
        Examples.run(() -> {
            ApiClient client = Examples.authenticated();
            MailboxControllerApi mailboxes = new MailboxControllerApi(client);

            // GET /api/v1/mailbox. Paging is offset/limit and the response carries no
            // "next" flag - compare what you have against totalElements.
            PageDTOUser2MailboxDTO page =
                    mailboxes.getAllForUserWithPagination(null, null, null, null, 0, 25);
            System.out.printf("%d of %d mailbox(es)%n",
                    page.getNumberOfElements(), page.getTotalElements());
            for (User2MailboxDTO mailbox : page.getData()) {
                List<String> flags = new ArrayList<>();
                if (Boolean.TRUE.equals(mailbox.getPinned())) {
                    flags.add("pinned");
                }
                if (Boolean.TRUE.equals(mailbox.getInvited())) {
                    flags.add("invited");
                }
                System.out.printf("  %s  %s  [%s]%s%n",
                        mailbox.getMailboxUuid(), mailbox.getName(), mailbox.getAccountName(),
                        flags.isEmpty() ? "" : " (" + String.join(", ", flags) + ")");
            }

            // getMailboxesForUserView is GET /api/v1/mailbox/user-view, which builds the sidebar
            // view rather than listing everything. It answers [] unless
            // mailboxesForAccount says how many to show per account (1-5), so calling it
            // with no arguments looks like an account with no mailboxes.
            List<User2MailboxDTO> sidebar = mailboxes.getMailboxesForUserView(null, 5, null);
            List<User2MailboxDTO> bare = mailboxes.getMailboxesForUserView(null, null, null);
            System.out.printf("%nuser-view, mailboxesForAccount=5: %d%n", sidebar.size());
            System.out.printf("user-view, no arguments:          %d%n", bare.size());
        });
    }
}
