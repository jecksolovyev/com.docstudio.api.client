/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R82.8
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.api;

import com.docstudio.client.model.PageDTOScenarioShortDTO;
import com.docstudio.client.model.ScenarioDTO;
import com.docstudio.client.model.SingleUuidDTO;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for ScenarioControllerApi
 */
@Ignore
public class ScenarioControllerApiTest {

    private final ScenarioControllerApi api = new ScenarioControllerApi();

    /**
     * Clone scenario
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cloneScenarioTest() throws Exception {
        UUID scenarioUuid = null;
        UUID mailbox = null;
        ScenarioDTO response = api.cloneScenario(scenarioUuid, mailbox);

        // TODO: test validations
    }
    /**
     * Create new scenario
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createNewScenarioTest() throws Exception {
        ScenarioDTO body = null;
        UUID mailbox = null;
        ScenarioDTO response = api.createNewScenario(body, mailbox);

        // TODO: test validations
    }
    /**
     * Delete scenario
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteScenarioTest() throws Exception {
        UUID scenarioUuid = null;
        UUID mailbox = null;
        api.deleteScenario(scenarioUuid, mailbox);

        // TODO: test validations
    }
    /**
     * Get scenario
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getScenarioTest() throws Exception {
        UUID scenarioUuid = null;
        UUID mailbox = null;
        ScenarioDTO response = api.getScenario(scenarioUuid, mailbox);

        // TODO: test validations
    }
    /**
     * Run scenario
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void runScenarioTest() throws Exception {
        UUID scenarioUuid = null;
        UUID mailbox = null;
        SingleUuidDTO response = api.runScenario(scenarioUuid, mailbox);

        // TODO: test validations
    }
    /**
     * Get paged scenario list
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchScenariosTest() throws Exception {
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
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateScenarioTest() throws Exception {
        ScenarioDTO body = null;
        UUID mailbox = null;
        UUID scenarioUuid = null;
        ScenarioDTO response = api.updateScenario(body, mailbox, scenarioUuid);

        // TODO: test validations
    }
}
