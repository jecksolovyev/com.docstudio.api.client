/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R75.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.api;

import com.docstudio.client.model.DeleteEnvColumnDTO;
import com.docstudio.client.model.EnvelopeApprovalPageDTO;
import com.docstudio.client.model.EnvelopePageDTO;
import com.docstudio.client.model.EnvelopeSearchField;
import com.docstudio.client.model.NewEnvColumnDTO;
import com.docstudio.client.model.ReportEnvelopeRequestDTO;
import com.docstudio.client.model.SearchApprovalsDTO;
import com.docstudio.client.model.SearchEnvelopesDTO;
import com.docstudio.client.model.SingleUuidDTO;
import com.docstudio.client.model.TemplateRolesDTO;
import java.util.UUID;
import com.docstudio.client.model.UpdateEnvColumnDTO;
import org.junit.Test;
import org.junit.Ignore;


import java.util.List;


/**
 * API tests for EnvelopeSearchControllerApi
 */
@Ignore
public class EnvelopeSearchControllerApiTest {

    private final EnvelopeSearchControllerApi api = new EnvelopeSearchControllerApi();

    /**
     * Add a new column to display
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addNewColumnTest() throws Exception {
        NewEnvColumnDTO body = null;
        UUID mailbox = null;
        SingleUuidDTO response = api.addNewColumn(body, mailbox);

        // TODO: test validations
    }
    /**
     * Request envelopes report
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createReportTest() throws Exception {
        ReportEnvelopeRequestDTO body = null;
        UUID mailbox = null;
        api.createReport(body, mailbox);

        // TODO: test validations
    }
    /**
     * Delete columns from displaying
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteColumnTest() throws Exception {
        DeleteEnvColumnDTO body = null;
        UUID mailbox = null;
        api.deleteColumn(body, mailbox);

        // TODO: test validations
    }
    /**
     * Get search fields
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSearchFieldsTest() throws Exception {
        SearchEnvelopesDTO body = null;
        UUID mailbox = null;
        String name = null;
        List<EnvelopeSearchField> response = api.getSearchFields(body, mailbox, name);

        // TODO: test validations
    }
    /**
     * Retrieve all template roles
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTemplateRolesTest() throws Exception {
        List<UUID> body = null;
        UUID mailbox = null;
        TemplateRolesDTO response = api.getTemplateRoles(body, mailbox);

        // TODO: test validations
    }
    /**
     * Search envelopes
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchEnvelopesTest() throws Exception {
        SearchEnvelopesDTO body = null;
        UUID mailbox = null;
        Integer offset = null;
        Integer limit = null;
        Boolean uuidOnly = null;
        EnvelopePageDTO response = api.searchEnvelopes(body, mailbox, offset, limit, uuidOnly);

        // TODO: test validations
    }
    /**
     * Search envelopes for approval
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchEnvelopesForApprovalTest() throws Exception {
        SearchApprovalsDTO body = null;
        UUID mailbox = null;
        Integer offset = null;
        Integer limit = null;
        EnvelopeApprovalPageDTO response = api.searchEnvelopesForApproval(body, mailbox, offset, limit);

        // TODO: test validations
    }
    /**
     * Update column to display
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateColumnTest() throws Exception {
        UpdateEnvColumnDTO body = null;
        UUID mailbox = null;
        UUID uuid = null;
        api.updateColumn(body, mailbox, uuid);

        // TODO: test validations
    }
}