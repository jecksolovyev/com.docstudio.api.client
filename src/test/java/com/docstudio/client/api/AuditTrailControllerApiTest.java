/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R120.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.api;

import com.docstudio.client.model.AuditTrailDTO;
import com.docstudio.client.model.AuditTrailInfoRecordDTO;
import java.io.File;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AuditTrailControllerApi
 */
@Ignore
public class AuditTrailControllerApiTest {

    private final AuditTrailControllerApi api = new AuditTrailControllerApi();

    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addAuditTrailRecordTest() throws Exception {
        AuditTrailInfoRecordDTO body = null;
        UUID mailbox = null;
        UUID uuid = null;
        api.addAuditTrailRecord(body, mailbox, uuid);

        // TODO: test validations
    }
    /**
     * Download audit trail pdf for envelope
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateAuditTrailPdfTest() throws Exception {
        UUID uuid = null;
        UUID mailbox = null;
        File response = api.generateAuditTrailPdf(uuid, mailbox);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAuditTrailByEnvelopeTest() throws Exception {
        UUID uuid = null;
        UUID mailbox = null;
        List<AuditTrailDTO> response = api.getAuditTrailByEnvelope(uuid, mailbox);

        // TODO: test validations
    }
}