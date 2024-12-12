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

import com.docstudio.client.model.CreateEnvelopeCallbackDTO;
import com.docstudio.client.model.EnvelopeCallbackDTO;
import com.docstudio.client.model.EnvelopeCheckResultDTO;
import com.docstudio.client.model.EnvelopeSendResultDTO;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for EnvelopeCallbackControllerApi
 */
@Ignore
public class EnvelopeCallbackControllerApiTest {

    private final EnvelopeCallbackControllerApi api = new EnvelopeCallbackControllerApi();

    /**
     * Check callback with certain envelope
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void checkCallbackTest() throws Exception {
        UUID callbackUuid = null;
        UUID envelopeUuid = null;
        UUID mailboxUuid = null;
        EnvelopeCheckResultDTO response = api.checkCallback(callbackUuid, envelopeUuid, mailboxUuid);

        // TODO: test validations
    }
    /**
     * Add new callback
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createCallbackTest() throws Exception {
        CreateEnvelopeCallbackDTO body = null;
        UUID mailbox = null;
        EnvelopeCallbackDTO response = api.createCallback(body, mailbox);

        // TODO: test validations
    }
    /**
     * List callbacks
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listCallbacksTest() throws Exception {
        UUID mailbox = null;
        List<EnvelopeCallbackDTO> response = api.listCallbacks(mailbox);

        // TODO: test validations
    }
    /**
     * Delete callback
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeCallbackTest() throws Exception {
        UUID callbackUuid = null;
        UUID mailbox = null;
        api.removeCallback(callbackUuid, mailbox);

        // TODO: test validations
    }
    /**
     * Send callback with certain envelope
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sendCallbackTest() throws Exception {
        UUID callbackUuid = null;
        UUID envelopeUuid = null;
        UUID mailboxUuid = null;
        EnvelopeSendResultDTO response = api.sendCallback(callbackUuid, envelopeUuid, mailboxUuid);

        // TODO: test validations
    }
}
