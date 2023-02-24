/*
 * Docstudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R74.21
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.AccountDomainCreateDTO;
import io.swagger.client.model.AccountDomainDTO;
import io.swagger.client.model.AccountDomainUpdateDTO;
import io.swagger.client.model.AccountSsoIdProviderDTO;
import io.swagger.client.model.AccountSsoIdProviderShortDTO;
import io.swagger.client.model.AccountSsoIdProviderUpdateDTO;
import io.swagger.client.model.ChangeDomainStatusDTO;
import io.swagger.client.model.PageDTOAccountDomainDTO;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AccountDomainControllerApi
 */
@Ignore
public class AccountDomainControllerApiTest {

    private final AccountDomainControllerApi api = new AccountDomainControllerApi();

    /**
     * Change account domain status
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void actionAccountDomainTest() throws Exception {
        UUID accountUuid = null;
        UUID domainUuid = null;
        String action = null;
        ChangeDomainStatusDTO body = null;
        AccountDomainDTO response = api.actionAccountDomain(accountUuid, domainUuid, action, body);

        // TODO: test validations
    }
    /**
     * Create account domain
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createAccountDomainTest() throws Exception {
        AccountDomainCreateDTO body = null;
        UUID accountUuid = null;
        AccountDomainDTO response = api.createAccountDomain(body, accountUuid);

        // TODO: test validations
    }
    /**
     * Create account SSO Identity Provider
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createAccountSsoIdpTest() throws Exception {
        AccountSsoIdProviderUpdateDTO body = null;
        UUID accountUuid = null;
        AccountSsoIdProviderDTO response = api.createAccountSsoIdp(body, accountUuid);

        // TODO: test validations
    }
    /**
     * Delete account domain
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAccountDomainTest() throws Exception {
        UUID accountUuid = null;
        UUID domainUuid = null;
        api.deleteAccountDomain(accountUuid, domainUuid);

        // TODO: test validations
    }
    /**
     * Delete account SSO IdP
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAccountIdpTest() throws Exception {
        UUID accountUuid = null;
        UUID idpUuid = null;
        api.deleteAccountIdp(accountUuid, idpUuid);

        // TODO: test validations
    }
    /**
     * Get account domain
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountDomainTest() throws Exception {
        UUID accountUuid = null;
        UUID domainUuid = null;
        AccountDomainDTO response = api.getAccountDomain(accountUuid, domainUuid);

        // TODO: test validations
    }
    /**
     * Get paged account domains list
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountDomainsTest() throws Exception {
        UUID accountUuid = null;
        Integer offset = null;
        Integer limit = null;
        String keyword = null;
        String status = null;
        PageDTOAccountDomainDTO response = api.getAccountDomains(accountUuid, offset, limit, keyword, status);

        // TODO: test validations
    }
    /**
     * Get account SSO IdP
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountIdpTest() throws Exception {
        UUID accountUuid = null;
        UUID idpUuid = null;
        AccountSsoIdProviderDTO response = api.getAccountIdp(accountUuid, idpUuid);

        // TODO: test validations
    }
    /**
     * Get all account SSO IdPs
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllAccountIdpsTest() throws Exception {
        UUID accountUuid = null;
        List<AccountSsoIdProviderShortDTO> response = api.getAllAccountIdps(accountUuid);

        // TODO: test validations
    }
    /**
     * Update account domain
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateAccountDomainTest() throws Exception {
        AccountDomainUpdateDTO body = null;
        UUID accountUuid = null;
        UUID domainUuid = null;
        AccountDomainDTO response = api.updateAccountDomain(body, accountUuid, domainUuid);

        // TODO: test validations
    }
    /**
     * Update account SSO Identity Provider
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateAccountSsoIdpTest() throws Exception {
        AccountSsoIdProviderUpdateDTO body = null;
        UUID accountUuid = null;
        UUID idpUuid = null;
        AccountSsoIdProviderDTO response = api.updateAccountSsoIdp(body, accountUuid, idpUuid);

        // TODO: test validations
    }
}