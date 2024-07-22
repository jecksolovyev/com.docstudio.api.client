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

import java.util.*;

/**
 * API tests for DictionaryControllerApi
 */
@Disabled
public class DictionaryControllerApiTest {

    private final DictionaryControllerApi api = new DictionaryControllerApi();

    /**
     * Archive dictionary
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void archiveDictionaryTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID mailbox = null;
        api.archiveDictionary(dictionaryUuid, mailbox);
        // TODO: test validations
    }

    /**
     * Check dictionary column. Check access, existence, etc.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkColumnValuesTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID columnUuid = null;
        UUID mailbox = null;
        DictionaryCheckResponseDTO response = api.checkColumnValues(dictionaryUuid, columnUuid, mailbox);
        // TODO: test validations
    }

    /**
     * Check dictionary. Check access, existence, etc.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkDictionaryTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID mailbox = null;
        DictionaryCheckResponseDTO response = api.checkDictionary(dictionaryUuid, mailbox);
        // TODO: test validations
    }

    /**
     * Create dictionary column
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createColumnTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID mailbox = null;
        DictionaryColumnRequestDTO dictionaryColumnRequestDTO = null;
        SingleUuidDTO response = api.createColumn(dictionaryUuid, mailbox, dictionaryColumnRequestDTO);
        // TODO: test validations
    }

    /**
     * Create empty dictionary
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDictionaryTest() throws ApiException {
        UUID mailbox = null;
        SingleUuidDTO response = api.createDictionary(mailbox);
        // TODO: test validations
    }

    /**
     * Create record(s)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRecordTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID mailbox = null;
        List<List<DictionaryColumnValueRequestDTO>> dictionaryColumnValueRequestDTO = null;
        CreateRecordsResponseDTO response = api.createRecord(dictionaryUuid, mailbox, dictionaryColumnValueRequestDTO);
        // TODO: test validations
    }

    /**
     * Delete column. Will return deleted column UUID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteColumnDictionaryTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID columnUuid = null;
        UUID mailbox = null;
        SingleUuidDTO response = api.deleteColumnDictionary(dictionaryUuid, columnUuid, mailbox);
        // TODO: test validations
    }

    /**
     * Delete record(s). Will return deleted records UUID(s)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRecordsTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID mailbox = null;
        List<SingleUuidDTO> singleUuidDTO = null;
        List<SingleUuidDTO> response = api.deleteRecords(dictionaryUuid, mailbox, singleUuidDTO);
        // TODO: test validations
    }

    /**
     * Download the dictionary
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID mailbox = null;
        DictionaryDownloadParamsDTO dictionaryDownloadParamsDTO = null;
        ExportTaskStatusDTO response = api.download(dictionaryUuid, mailbox, dictionaryDownloadParamsDTO);
        // TODO: test validations
    }

    /**
     * Download the dictionary
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadStatusTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID taskUuid = null;
        UUID mailbox = null;
        ExportTaskStatusDTO response = api.downloadStatus(dictionaryUuid, taskUuid, mailbox);
        // TODO: test validations
    }

    /**
     * Retrieve column value for specific record
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getColumnValueTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID recordUuid = null;
        UUID columnUuid = null;
        UUID mailbox = null;
        DictionaryColumnValueResponseDTO response = api.getColumnValue(dictionaryUuid, recordUuid, columnUuid, mailbox);
        // TODO: test validations
    }

    /**
     * Retrieve column values from dictionary
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getColumnValuesTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID columnUuid = null;
        DictionaryColumnValueSearchDTO dictionaryColumnValueSearchDTO = null;
        Integer offset = null;
        Integer limit = null;
        UUID mailbox = null;
        PageDTODictionaryColumnValueResponseDTO response = api.getColumnValues(dictionaryUuid, columnUuid, dictionaryColumnValueSearchDTO, offset, limit, mailbox);
        // TODO: test validations
    }

    /**
     * Retrieve record
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDictionaryRecordTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID recordUuid = null;
        UUID mailbox = null;
        DictionaryRecordValuesResponseDTO response = api.getDictionaryRecord(dictionaryUuid, recordUuid, mailbox);
        // TODO: test validations
    }

    /**
     * Get dictionary record uuids by values
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDictionaryRecordUuidsTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID mailbox = null;
        DictionaryRecordsRequestDTO dictionaryRecordsRequestDTO = null;
        Map<String, UUID> response = api.getDictionaryRecordUuids(dictionaryUuid, mailbox, dictionaryRecordsRequestDTO);
        // TODO: test validations
    }

    /**
     * Get dictionary records
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDictionaryRecordsTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID mailbox = null;
        DictionaryFiltersRequestDTO dictionaryFiltersRequestDTO = null;
        Integer offset = null;
        Integer limit = null;
        PageDTODictionaryRecordValuesResponseDTO response = api.getDictionaryRecords(dictionaryUuid, mailbox, dictionaryFiltersRequestDTO, offset, limit);
        // TODO: test validations
    }

    /**
     * Update dictionary
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchDictionaryTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID mailbox = null;
        DictionaryRequestDTO dictionaryRequestDTO = null;
        DictionaryResponseDTO response = api.patchDictionary(dictionaryUuid, mailbox, dictionaryRequestDTO);
        // TODO: test validations
    }

    /**
     * Update record column values
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchRecordTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID recordUuid = null;
        UUID mailbox = null;
        List<DictionaryColumnValueRequestDTO> dictionaryColumnValueRequestDTO = null;
        api.patchRecord(dictionaryUuid, recordUuid, mailbox, dictionaryColumnValueRequestDTO);
        // TODO: test validations
    }

    /**
     * Read/get dictionary
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void readDictionaryTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID mailbox = null;
        Boolean withColumns = null;
        Boolean withRecordsCount = null;
        DictionaryResponseDTO response = api.readDictionary(dictionaryUuid, mailbox, withColumns, withRecordsCount);
        // TODO: test validations
    }

    /**
     * Get paged dictionary list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchDictionariesTest() throws ApiException {
        UUID mailbox = null;
        String level = null;
        String keyword = null;
        Boolean withColumns = null;
        Integer offset = null;
        Integer limit = null;
        PageDTODictionaryResponseDTO response = api.searchDictionaries(mailbox, level, keyword, withColumns, offset, limit);
        // TODO: test validations
    }

    /**
     * Update dictionary column
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateColumnDictionaryTest() throws ApiException {
        UUID dictionaryUuid = null;
        UUID columnUuid = null;
        UUID mailbox = null;
        DictionaryColumnRequestDTO dictionaryColumnRequestDTO = null;
        DictionaryColumnResponseDTO response = api.updateColumnDictionary(dictionaryUuid, columnUuid, mailbox, dictionaryColumnRequestDTO);
        // TODO: test validations
    }

}
