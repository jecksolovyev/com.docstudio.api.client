/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R86.31
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.api;

import com.docstudio.client.model.LoginResponseDTO;
import com.docstudio.client.model.SsoEntityDTO;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for SsoAuthenticationControllerApi
 */
@Ignore
public class SsoAuthenticationControllerApiTest {

    private final SsoAuthenticationControllerApi api = new SsoAuthenticationControllerApi();

    /**
     * Returns EntityID by domain
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void idpByDomainTest() throws Exception {
        String domain = null;
        SsoEntityDTO response = api.idpByDomain(domain);

        // TODO: test validations
    }
    /**
     * Login with SSO, redirect to UI after login
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void loginGetSsoTest() throws Exception {
        String idp = null;
        api.loginGetSso(idp);

        // TODO: test validations
    }
    /**
     * Login with SSO, token is in response
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void loginPostSsoTest() throws Exception {
        LoginResponseDTO response = api.loginPostSso();

        // TODO: test validations
    }
    /**
     * Logout
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void logoutTest() throws Exception {
        api.logout();

        // TODO: test validations
    }
}
