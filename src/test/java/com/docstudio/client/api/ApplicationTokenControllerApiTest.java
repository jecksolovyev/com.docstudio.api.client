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
import com.docstudio.client.model.AppTokenDTO;
import com.docstudio.client.model.CreateAppTokenDTO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

/**
 * API tests for ApplicationTokenControllerApi
 */
@Disabled
public class ApplicationTokenControllerApiTest {

    private final ApplicationTokenControllerApi api = new ApplicationTokenControllerApi();

    /**
     * Create application token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTokenTest() throws ApiException {
        CreateAppTokenDTO createAppTokenDTO = null;
        AppTokenDTO response = api.createToken(createAppTokenDTO);
        // TODO: test validations
    }

    /**
     * List application tokens
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserTokensTest() throws ApiException {
        List<AppTokenDTO> response = api.getUserTokens();
        // TODO: test validations
    }

    /**
     * Revoke application token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revokeTokenTest() throws ApiException {
        UUID id = null;
        api.revokeToken(id);
        // TODO: test validations
    }

}
