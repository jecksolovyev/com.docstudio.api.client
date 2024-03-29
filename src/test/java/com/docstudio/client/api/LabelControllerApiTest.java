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

import com.docstudio.client.model.LabelAssociationDTO;
import com.docstudio.client.model.LabelDTO;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


import java.util.List;


/**
 * API tests for LabelControllerApi
 */
@Ignore
public class LabelControllerApiTest {

    private final LabelControllerApi api = new LabelControllerApi();

    /**
     * Assign label to envelopes
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void assignmentsTest() throws Exception {
        LabelAssociationDTO body = null;
        UUID mailbox = null;
        api.assignments(body, mailbox);

        // TODO: test validations
    }
    /**
     * Save label to DB
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createLabelTest() throws Exception {
        LabelDTO body = null;
        UUID mailbox = null;
        LabelDTO response = api.createLabel(body, mailbox);

        // TODO: test validations
    }
    /**
     * Unassign label from envelopes
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deAssignmentsTest() throws Exception {
        LabelAssociationDTO body = null;
        UUID mailbox = null;
        api.deAssignments(body, mailbox);

        // TODO: test validations
    }
    /**
     * Delete label
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteLabelTest() throws Exception {
        UUID uuid = null;
        UUID mailbox = null;
        api.deleteLabel(uuid, mailbox);

        // TODO: test validations
    }
    /**
     * Retrieve all labels for mailbox for authorized user
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllTest() throws Exception {
        UUID mailbox = null;
        List<LabelDTO> response = api.getAll(mailbox);

        // TODO: test validations
    }
    /**
     * Update label
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateLabelTest() throws Exception {
        LabelDTO body = null;
        UUID mailbox = null;
        UUID uuid = null;
        LabelDTO response = api.updateLabel(body, mailbox, uuid);

        // TODO: test validations
    }
}
