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
import com.docstudio.client.model.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 * API tests for ScenarioControllerApi
 */
@Disabled
public class ScenarioControllerApiTest {

    private final ScenarioControllerApi api = new ScenarioControllerApi();

    /**
     * Clone scenario
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cloneScenarioTest() throws ApiException {
        UUID scenarioUuid = null;
        UUID mailbox = null;
        ScenarioDTO response = api.cloneScenario(scenarioUuid, mailbox);
        // TODO: test validations
    }

    /**
     * Create new scenario
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewScenarioTest() throws ApiException {
        UUID mailbox = null;
        ScenarioDTO scenarioDTO = null;
        ScenarioDTO response = api.createNewScenario(mailbox, scenarioDTO);
        // TODO: test validations
    }

    /**
     * Delete scenario
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteScenarioTest() throws ApiException {
        UUID scenarioUuid = null;
        UUID mailbox = null;
        api.deleteScenario(scenarioUuid, mailbox);
        // TODO: test validations
    }

    /**
     * Get scenario
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getScenarioTest() throws ApiException {
        UUID scenarioUuid = null;
        UUID mailbox = null;
        ScenarioDTO response = api.getScenario(scenarioUuid, mailbox);
        // TODO: test validations
    }

    /**
     * Run scenario
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void runScenarioTest() throws ApiException {
        UUID scenarioUuid = null;
        UUID mailbox = null;
        SingleUuidDTO response = api.runScenario(scenarioUuid, mailbox);
        // TODO: test validations
    }

    /**
     * Get paged scenario list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchScenariosTest() throws ApiException {
        UUID mailbox = null;
        String level = null;
        String keyword = null;
        Integer offset = null;
        Integer limit = null;
        PageDTOScenarioShortDTO response = api.searchScenarios(mailbox, level, keyword, offset, limit);
        // TODO: test validations
    }

    /**
     * Update scenario
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateScenarioTest() throws ApiException {
        UUID scenarioUuid = null;
        UUID mailbox = null;
        ScenarioDTO scenarioDTO = null;
        ScenarioDTO response = api.updateScenario(scenarioUuid, mailbox, scenarioDTO);
        // TODO: test validations
    }

}
