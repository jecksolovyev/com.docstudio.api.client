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

import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PermissionControllerApi
 */
@Ignore
public class PermissionControllerApiTest {

    private final PermissionControllerApi api = new PermissionControllerApi();

    /**
     * Resend invitation for user to account
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void resendInvitationTest() throws Exception {
        UUID accountUuid = null;
        UUID userUuid = null;
        api.resendInvitation(accountUuid, userUuid);

        // TODO: test validations
    }
    /**
     * Revoke invitation for user to account
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void revokeInvitationTest() throws Exception {
        UUID accountUuid = null;
        UUID userUuid = null;
        api.revokeInvitation(accountUuid, userUuid);

        // TODO: test validations
    }
}
