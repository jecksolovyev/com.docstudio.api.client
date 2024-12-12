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

import com.docstudio.client.model.FilterSettingsCreateDTO;
import com.docstudio.client.model.FilterSettingsDTO;
import com.docstudio.client.model.SingleUuidDTO;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for FilterSettingsControllerApi
 */
@Ignore
public class FilterSettingsControllerApiTest {

    private final FilterSettingsControllerApi api = new FilterSettingsControllerApi();

    /**
     * Create FilterSettings for mailbox
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createFilterSettingsTest() throws Exception {
        FilterSettingsCreateDTO body = null;
        UUID mailbox = null;
        SingleUuidDTO response = api.createFilterSettings(body, mailbox);

        // TODO: test validations
    }
    /**
     * Delete FilterSettings
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteFilterSettingsTest() throws Exception {
        UUID uuid = null;
        UUID mailbox = null;
        api.deleteFilterSettings(uuid, mailbox);

        // TODO: test validations
    }
    /**
     * Read all by mailbox
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllFilterSettingsTest() throws Exception {
        UUID mailbox = null;
        List<FilterSettingsDTO> response = api.getAllFilterSettings(mailbox);

        // TODO: test validations
    }
    /**
     * Get by UUID
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getByUuidTest() throws Exception {
        UUID uuid = null;
        UUID mailbox = null;
        FilterSettingsDTO response = api.getByUuid(uuid, mailbox);

        // TODO: test validations
    }
    /**
     * Update FilterSettings for mailbox
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateFilterSettingsTest() throws Exception {
        FilterSettingsDTO body = null;
        UUID mailbox = null;
        UUID uuid = null;
        api.updateFilterSettings(body, mailbox, uuid);

        // TODO: test validations
    }
}
