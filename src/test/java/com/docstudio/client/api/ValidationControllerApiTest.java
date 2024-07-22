/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R110.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.api;

import com.docstudio.client.ApiException;
import com.docstudio.client.model.GetEnvelopeInviteInfoDTO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ValidationControllerApi
 */
@Disabled
public class ValidationControllerApiTest {

    private final ValidationControllerApi api = new ValidationControllerApi();

    /**
     * Get invitation info by already registered user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEnvelopeInviteTest() throws ApiException {
        String code = null;
        GetEnvelopeInviteInfoDTO response = api.getEnvelopeInvite(code);
        // TODO: test validations
    }

    /**
     * Get invitation info by not authenticated user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEnvelopeInviteNotRegisteredTest() throws ApiException {
        String code = null;
        GetEnvelopeInviteInfoDTO response = api.getEnvelopeInviteNotRegistered(code);
        // TODO: test validations
    }

}