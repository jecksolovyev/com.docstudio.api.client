/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R86.33
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.api;

import com.docstudio.client.model.AccountMailboxInfoDTO;
import java.io.File;
import com.docstudio.client.model.MailboxCreateDTO;
import com.docstudio.client.model.MailboxDashboardDTO;
import com.docstudio.client.model.MailboxEssentialsDTO;
import com.docstudio.client.model.MailboxInfoDTO;
import com.docstudio.client.model.MailboxNameUuidDTO;
import com.docstudio.client.model.MailboxPatchRequestDTO;
import com.docstudio.client.model.MailboxSearchResultDTO;
import com.docstudio.client.model.MailboxUpdateRequestDTO;
import com.docstudio.client.model.PageDTOActivityLogRecordDTO;
import com.docstudio.client.model.PageDTOUsedTemplateDTO;
import com.docstudio.client.model.StatDTO;
import java.util.UUID;
import com.docstudio.client.model.User2MailboxDTO;
import org.junit.Test;
import org.junit.Ignore;


import java.util.List;
import java.util.Map;


/**
 * API tests for MailboxControllerApi
 */
@Ignore
public class MailboxControllerApiTest {

    private final MailboxControllerApi api = new MailboxControllerApi();

    /**
     * Create mailbox
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createMailboxTest() throws Exception {
        MailboxCreateDTO body = null;
        UUID uuid = null;
        String code = null;
        String codeType = null;
        User2MailboxDTO response = api.createMailbox(body, uuid, code, codeType);

        // TODO: test validations
    }
    /**
     * Customize mailbox dashboard
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void customizeDashboardTest() throws Exception {
        MailboxDashboardDTO body = null;
        UUID mailboxUuid = null;
        api.customizeDashboard(body, mailboxUuid);

        // TODO: test validations
    }
    /**
     * Delete mailbox by UUID in the header.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteMailboxTest() throws Exception {
        String checkMessage = null;
        UUID mailbox = null;
        api.deleteMailbox(checkMessage, mailbox);

        // TODO: test validations
    }
    /**
     * Delete mailbox users except requester
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteMailboxUsersTest() throws Exception {
        UUID mailboxUuid = null;
        api.deleteMailboxUsers(mailboxUuid);

        // TODO: test validations
    }
    /**
     * Retrieve mailbox account logo
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountLogoTest() throws Exception {
        UUID mailboxUuid = null;
        File response = api.getAccountLogo(mailboxUuid);

        // TODO: test validations
    }
    /**
     * Audit trail feed for mailbox
     *
     * Records sorted by date in descending order
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getActivityLogTest() throws Exception {
        UUID mailbox = null;
        String from = null;
        String to = null;
        Integer offset = null;
        Integer limit = null;
        PageDTOActivityLogRecordDTO response = api.getActivityLog(mailbox, from, to, offset, limit);

        // TODO: test validations
    }
    /**
     * Retrieve user&#x27;s mailboxes list
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllForUserTest() throws Exception {
        List<User2MailboxDTO> response = api.getAllForUser();

        // TODO: test validations
    }
    /**
     * Get mailbox dashboard
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCustomizedDashboardTest() throws Exception {
        UUID mailboxUuid = null;
        MailboxDashboardDTO response = api.getCustomizedDashboard(mailboxUuid);

        // TODO: test validations
    }
    /**
     * Get mailbox dashboard html
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCustomizedDashboardHtmlTest() throws Exception {
        UUID mailbox = null;
        String response = api.getCustomizedDashboardHtml(mailbox);

        // TODO: test validations
    }
    /**
     * Get mailbox essentials
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMailboxEssentialsTest() throws Exception {
        UUID mailbox = null;
        MailboxEssentialsDTO response = api.getMailboxEssentials(mailbox);

        // TODO: test validations
    }
    /**
     * Read list of mailboxes
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMailboxesByAccountTest() throws Exception {
        UUID uuid = null;
        List<MailboxNameUuidDTO> response = api.getMailboxesByAccount(uuid);

        // TODO: test validations
    }
    /**
     * Retrieve mailboxes info
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMailboxesInfoMailboxTest() throws Exception {
        List<UUID> body = null;
        Boolean accountName = null;
        Boolean accountITN = null;
        Map<String, MailboxInfoDTO> response = api.getMailboxesInfoMailbox(body, accountName, accountITN);

        // TODO: test validations
    }
    /**
     * Get number of unread envelopes in every scope
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getStatTest() throws Exception {
        UUID mailbox = null;
        StatDTO response = api.getStat(mailbox);

        // TODO: test validations
    }
    /**
     * List of used templates
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsedTemplatesTest() throws Exception {
        UUID mailbox = null;
        String name = null;
        Integer offset = null;
        Integer limit = null;
        PageDTOUsedTemplateDTO response = api.getUsedTemplates(mailbox, name, offset, limit);

        // TODO: test validations
    }
    /**
     * Patch mailbox, return patched mailbox w/o users count
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchMailboxTest() throws Exception {
        MailboxPatchRequestDTO body = null;
        UUID mailboxUuid = null;
        AccountMailboxInfoDTO response = api.patchMailbox(body, mailboxUuid);

        // TODO: test validations
    }
    /**
     * Search mailboxes by name, contact, alias, user
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchMailboxesTest() throws Exception {
        UUID mailbox = null;
        String q = null;
        String type = null;
        List<MailboxSearchResultDTO> response = api.searchMailboxes(mailbox, q, type);

        // TODO: test validations
    }
    /**
     * Update mailbox
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateMailboxTest() throws Exception {
        MailboxUpdateRequestDTO body = null;
        UUID mailboxUuid = null;
        AccountMailboxInfoDTO response = api.updateMailbox(body, mailboxUuid);

        // TODO: test validations
    }
}
