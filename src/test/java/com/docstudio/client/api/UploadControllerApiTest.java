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

import com.docstudio.client.model.ConfirmUploadDTO;
import com.docstudio.client.model.ImportTaskDTO;
import com.docstudio.client.model.SingleUuidDTO;

import java.io.File;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for UploadControllerApi
 */
@Ignore
public class UploadControllerApiTest {

    private final UploadControllerApi api = new UploadControllerApi();

    /**
     * Cancel import process
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cancelTest() throws Exception {
        UUID uploadUuid = null;
        api.cancel(uploadUuid);

        // TODO: test validations
    }
    /**
     * Approve import process
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void confirmTest() throws Exception {
        ConfirmUploadDTO body = null;
        UUID uploadUuid = null;
        api.confirm(body, uploadUuid);

        // TODO: test validations
    }
    /**
     * Get import processing task
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImportTaskTest() throws Exception {
        UUID uploadUuid = null;
        ImportTaskDTO response = api.getImportTask(uploadUuid);

        // TODO: test validations
    }
    /**
     * Upload dictionary file for importing
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void uploadDictionaryTest() throws Exception {
        UUID mailbox = null;
        UUID dictionaryUuid = null;
        File file = null;
        SingleUuidDTO response = api.uploadDictionary(mailbox, dictionaryUuid, file);

        // TODO: test validations
    }
}