/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R135.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.api;

import com.docstudio.client.ApiCallback;
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.ApiResponse;
import com.docstudio.client.Configuration;
import com.docstudio.client.Pair;
import com.docstudio.client.ProgressRequestBody;
import com.docstudio.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.docstudio.client.model.AuditTrailDTO;
import com.docstudio.client.model.AuditTrailInfoRecordDTO;
import java.io.File;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuditTrailControllerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuditTrailControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuditTrailControllerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for addAuditTrailRecord
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param auditTrailInfoRecordDTO  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addAuditTrailRecordCall(@javax.annotation.Nonnull UUID uuid, @javax.annotation.Nonnull UUID mailbox, @javax.annotation.Nonnull AuditTrailInfoRecordDTO auditTrailInfoRecordDTO, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = auditTrailInfoRecordDTO;

        // create path and map variables
        String localVarPath = "/api/v1/audittrail/envelope/{uuid}"
            .replace("{" + "uuid" + "}", localVarApiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (mailbox != null) {
            localVarHeaderParams.put("Mailbox", localVarApiClient.parameterToString(mailbox));
        }


        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addAuditTrailRecordValidateBeforeCall(@javax.annotation.Nonnull UUID uuid, @javax.annotation.Nonnull UUID mailbox, @javax.annotation.Nonnull AuditTrailInfoRecordDTO auditTrailInfoRecordDTO, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling addAuditTrailRecord(Async)");
        }

        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling addAuditTrailRecord(Async)");
        }

        // verify the required parameter 'auditTrailInfoRecordDTO' is set
        if (auditTrailInfoRecordDTO == null) {
            throw new ApiException("Missing the required parameter 'auditTrailInfoRecordDTO' when calling addAuditTrailRecord(Async)");
        }

        return addAuditTrailRecordCall(uuid, mailbox, auditTrailInfoRecordDTO, _callback);

    }

    /**
     * 
     * 
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param auditTrailInfoRecordDTO  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void addAuditTrailRecord(@javax.annotation.Nonnull UUID uuid, @javax.annotation.Nonnull UUID mailbox, @javax.annotation.Nonnull AuditTrailInfoRecordDTO auditTrailInfoRecordDTO) throws ApiException {
        addAuditTrailRecordWithHttpInfo(uuid, mailbox, auditTrailInfoRecordDTO);
    }

    /**
     * 
     * 
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param auditTrailInfoRecordDTO  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> addAuditTrailRecordWithHttpInfo(@javax.annotation.Nonnull UUID uuid, @javax.annotation.Nonnull UUID mailbox, @javax.annotation.Nonnull AuditTrailInfoRecordDTO auditTrailInfoRecordDTO) throws ApiException {
        okhttp3.Call localVarCall = addAuditTrailRecordValidateBeforeCall(uuid, mailbox, auditTrailInfoRecordDTO, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param auditTrailInfoRecordDTO  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addAuditTrailRecordAsync(@javax.annotation.Nonnull UUID uuid, @javax.annotation.Nonnull UUID mailbox, @javax.annotation.Nonnull AuditTrailInfoRecordDTO auditTrailInfoRecordDTO, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addAuditTrailRecordValidateBeforeCall(uuid, mailbox, auditTrailInfoRecordDTO, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for generateAuditTrailPdf
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call generateAuditTrailPdfCall(@javax.annotation.Nonnull UUID uuid, @javax.annotation.Nonnull UUID mailbox, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/audittrail/pdf/{uuid}"
            .replace("{" + "uuid" + "}", localVarApiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (mailbox != null) {
            localVarHeaderParams.put("Mailbox", localVarApiClient.parameterToString(mailbox));
        }


        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call generateAuditTrailPdfValidateBeforeCall(@javax.annotation.Nonnull UUID uuid, @javax.annotation.Nonnull UUID mailbox, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling generateAuditTrailPdf(Async)");
        }

        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling generateAuditTrailPdf(Async)");
        }

        return generateAuditTrailPdfCall(uuid, mailbox, _callback);

    }

    /**
     * Download audit trail pdf for envelope
     * 
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public File generateAuditTrailPdf(@javax.annotation.Nonnull UUID uuid, @javax.annotation.Nonnull UUID mailbox) throws ApiException {
        ApiResponse<File> localVarResp = generateAuditTrailPdfWithHttpInfo(uuid, mailbox);
        return localVarResp.getData();
    }

    /**
     * Download audit trail pdf for envelope
     * 
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> generateAuditTrailPdfWithHttpInfo(@javax.annotation.Nonnull UUID uuid, @javax.annotation.Nonnull UUID mailbox) throws ApiException {
        okhttp3.Call localVarCall = generateAuditTrailPdfValidateBeforeCall(uuid, mailbox, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Download audit trail pdf for envelope (asynchronously)
     * 
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call generateAuditTrailPdfAsync(@javax.annotation.Nonnull UUID uuid, @javax.annotation.Nonnull UUID mailbox, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateAuditTrailPdfValidateBeforeCall(uuid, mailbox, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAuditTrailByEnvelope
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAuditTrailByEnvelopeCall(@javax.annotation.Nonnull UUID uuid, @javax.annotation.Nonnull UUID mailbox, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/audittrail/envelope/{uuid}"
            .replace("{" + "uuid" + "}", localVarApiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (mailbox != null) {
            localVarHeaderParams.put("Mailbox", localVarApiClient.parameterToString(mailbox));
        }


        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAuditTrailByEnvelopeValidateBeforeCall(@javax.annotation.Nonnull UUID uuid, @javax.annotation.Nonnull UUID mailbox, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getAuditTrailByEnvelope(Async)");
        }

        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling getAuditTrailByEnvelope(Async)");
        }

        return getAuditTrailByEnvelopeCall(uuid, mailbox, _callback);

    }

    /**
     * 
     * 
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return List&lt;AuditTrailDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<AuditTrailDTO> getAuditTrailByEnvelope(@javax.annotation.Nonnull UUID uuid, @javax.annotation.Nonnull UUID mailbox) throws ApiException {
        ApiResponse<List<AuditTrailDTO>> localVarResp = getAuditTrailByEnvelopeWithHttpInfo(uuid, mailbox);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;List&lt;AuditTrailDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AuditTrailDTO>> getAuditTrailByEnvelopeWithHttpInfo(@javax.annotation.Nonnull UUID uuid, @javax.annotation.Nonnull UUID mailbox) throws ApiException {
        okhttp3.Call localVarCall = getAuditTrailByEnvelopeValidateBeforeCall(uuid, mailbox, null);
        Type localVarReturnType = new TypeToken<List<AuditTrailDTO>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAuditTrailByEnvelopeAsync(@javax.annotation.Nonnull UUID uuid, @javax.annotation.Nonnull UUID mailbox, final ApiCallback<List<AuditTrailDTO>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAuditTrailByEnvelopeValidateBeforeCall(uuid, mailbox, _callback);
        Type localVarReturnType = new TypeToken<List<AuditTrailDTO>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
