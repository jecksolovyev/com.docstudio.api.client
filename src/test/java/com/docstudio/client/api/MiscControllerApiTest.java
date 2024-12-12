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

import com.docstudio.client.model.CsvData;
import com.docstudio.client.model.DetectedCountryDTO;
import com.docstudio.client.model.DocFormulaRequestDTO;
import com.docstudio.client.model.PageDTOActivityLogRecordDTO;
import com.docstudio.client.model.ProcessStatus;
import com.docstudio.client.model.SearchActivityLogDTO;
import com.docstudio.client.model.SettingsDTO;
import com.docstudio.client.model.StatDTO;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for MiscControllerApi
 */
@Ignore
public class MiscControllerApiTest {

    private final MiscControllerApi api = new MiscControllerApi();

    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void appSettingsTest() throws Exception {
        SettingsDTO response = api.appSettings();

        // TODO: test validations
    }
    /**
     * Audit log
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void auditLogTest() throws Exception {
        SearchActivityLogDTO body = null;
        Integer offset = null;
        Integer limit = null;
        PageDTOActivityLogRecordDTO response = api.auditLog(body, offset, limit);

        // TODO: test validations
    }
    /**
     * Calculate excel formulas for documents
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void calculateFormulaTest() throws Exception {
        List<DocFormulaRequestDTO> body = null;
        Map<String, Map<String, Object>> response = api.calculateFormula(body);

        // TODO: test validations
    }
    /**
     * Request audit report
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createAuditReportTest() throws Exception {
        SearchActivityLogDTO body = null;
        api.createAuditReport(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void detectCountryTest() throws Exception {
        DetectedCountryDTO response = api.detectCountry();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBarcodeTest() throws Exception {
        String type = null;
        String value = null;
        String response = api.getBarcode(type, value);

        // TODO: test validations
    }
    /**
     * Process status
     *
     * Getting async bulk process status details by id
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProcessStatusTest() throws Exception {
        UUID id = null;
        Boolean details = null;
        ProcessStatus response = api.getProcessStatus(id, details);

        // TODO: test validations
    }
    /**
     * Parse CSV text (5 rows max)
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void parseCsvTest() throws Exception {
        CsvData body = null;
        List<List<String>> response = api.parseCsv(body);

        // TODO: test validations
    }
    /**
     * Recalculate all mailbox counters
     *
     * development use only
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void recalculateMailboxStatTest() throws Exception {
        UUID mailbox = null;
        StatDTO response = api.recalculateMailboxStat(mailbox);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void returnNoFaviconTest() throws Exception {
        api.returnNoFavicon();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void webhookTest() throws Exception {
        String body = null;
        String authorization = null;
        String accountKey = null;
        String type = null;
        api.webhook(body, authorization, accountKey, type);

        // TODO: test validations
    }
}