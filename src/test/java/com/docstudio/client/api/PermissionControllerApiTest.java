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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 * API tests for PermissionControllerApi
 */
@Disabled
public class PermissionControllerApiTest {

    private final PermissionControllerApi api = new PermissionControllerApi();

    /**
     * Resend invitation for user to account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resendInvitationTest() throws ApiException {
        UUID accountUuid = null;
        UUID userUuid = null;
        api.resendInvitation(accountUuid, userUuid);
        // TODO: test validations
    }

    /**
     * Revoke invitation for user to account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revokeInvitationTest() throws ApiException {
        UUID accountUuid = null;
        UUID userUuid = null;
        api.revokeInvitation(accountUuid, userUuid);
        // TODO: test validations
    }

}
