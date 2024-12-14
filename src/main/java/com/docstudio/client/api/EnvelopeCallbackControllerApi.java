/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R120.9
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


import com.docstudio.client.model.CreateEnvelopeCallbackDTO;
import com.docstudio.client.model.EnvelopeCallbackDTO;
import com.docstudio.client.model.EnvelopeCheckResultDTO;
import com.docstudio.client.model.EnvelopeSendResultDTO;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnvelopeCallbackControllerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EnvelopeCallbackControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EnvelopeCallbackControllerApi(ApiClient apiClient) {
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
     * Build call for checkCallback
     * @param callbackUuid Callback id (required)
     * @param envelopeUuid Envelope UUID (required)
     * @param mailboxUuid Mailbox context, HTTP Header with current mailbox UUID (required)
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
    public okhttp3.Call checkCallbackCall(UUID callbackUuid, UUID envelopeUuid, UUID mailboxUuid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/envelope/callback/{callbackUuid}/check"
            .replace("{" + "callbackUuid" + "}", localVarApiClient.escapeString(callbackUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (envelopeUuid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("envelopeUuid", envelopeUuid));
        }

        if (mailboxUuid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mailboxUuid", mailboxUuid));
        }

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

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call checkCallbackValidateBeforeCall(UUID callbackUuid, UUID envelopeUuid, UUID mailboxUuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'callbackUuid' is set
        if (callbackUuid == null) {
            throw new ApiException("Missing the required parameter 'callbackUuid' when calling checkCallback(Async)");
        }

        // verify the required parameter 'envelopeUuid' is set
        if (envelopeUuid == null) {
            throw new ApiException("Missing the required parameter 'envelopeUuid' when calling checkCallback(Async)");
        }

        // verify the required parameter 'mailboxUuid' is set
        if (mailboxUuid == null) {
            throw new ApiException("Missing the required parameter 'mailboxUuid' when calling checkCallback(Async)");
        }

        return checkCallbackCall(callbackUuid, envelopeUuid, mailboxUuid, _callback);

    }

    /**
     * Check callback with certain envelope
     * 
     * @param callbackUuid Callback id (required)
     * @param envelopeUuid Envelope UUID (required)
     * @param mailboxUuid Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return EnvelopeCheckResultDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public EnvelopeCheckResultDTO checkCallback(UUID callbackUuid, UUID envelopeUuid, UUID mailboxUuid) throws ApiException {
        ApiResponse<EnvelopeCheckResultDTO> localVarResp = checkCallbackWithHttpInfo(callbackUuid, envelopeUuid, mailboxUuid);
        return localVarResp.getData();
    }

    /**
     * Check callback with certain envelope
     * 
     * @param callbackUuid Callback id (required)
     * @param envelopeUuid Envelope UUID (required)
     * @param mailboxUuid Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;EnvelopeCheckResultDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EnvelopeCheckResultDTO> checkCallbackWithHttpInfo(UUID callbackUuid, UUID envelopeUuid, UUID mailboxUuid) throws ApiException {
        okhttp3.Call localVarCall = checkCallbackValidateBeforeCall(callbackUuid, envelopeUuid, mailboxUuid, null);
        Type localVarReturnType = new TypeToken<EnvelopeCheckResultDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check callback with certain envelope (asynchronously)
     * 
     * @param callbackUuid Callback id (required)
     * @param envelopeUuid Envelope UUID (required)
     * @param mailboxUuid Mailbox context, HTTP Header with current mailbox UUID (required)
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
    public okhttp3.Call checkCallbackAsync(UUID callbackUuid, UUID envelopeUuid, UUID mailboxUuid, final ApiCallback<EnvelopeCheckResultDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = checkCallbackValidateBeforeCall(callbackUuid, envelopeUuid, mailboxUuid, _callback);
        Type localVarReturnType = new TypeToken<EnvelopeCheckResultDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createCallback
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param createEnvelopeCallbackDTO  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCallbackCall(UUID mailbox, CreateEnvelopeCallbackDTO createEnvelopeCallbackDTO, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createEnvelopeCallbackDTO;

        // create path and map variables
        String localVarPath = "/api/v1/envelope/callback/add";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (mailbox != null) {
            localVarHeaderParams.put("Mailbox", localVarApiClient.parameterToString(mailbox));
        }


        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createCallbackValidateBeforeCall(UUID mailbox, CreateEnvelopeCallbackDTO createEnvelopeCallbackDTO, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling createCallback(Async)");
        }

        // verify the required parameter 'createEnvelopeCallbackDTO' is set
        if (createEnvelopeCallbackDTO == null) {
            throw new ApiException("Missing the required parameter 'createEnvelopeCallbackDTO' when calling createCallback(Async)");
        }

        return createCallbackCall(mailbox, createEnvelopeCallbackDTO, _callback);

    }

    /**
     * Add new callback
     * 
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param createEnvelopeCallbackDTO  (required)
     * @return EnvelopeCallbackDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public EnvelopeCallbackDTO createCallback(UUID mailbox, CreateEnvelopeCallbackDTO createEnvelopeCallbackDTO) throws ApiException {
        ApiResponse<EnvelopeCallbackDTO> localVarResp = createCallbackWithHttpInfo(mailbox, createEnvelopeCallbackDTO);
        return localVarResp.getData();
    }

    /**
     * Add new callback
     * 
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param createEnvelopeCallbackDTO  (required)
     * @return ApiResponse&lt;EnvelopeCallbackDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EnvelopeCallbackDTO> createCallbackWithHttpInfo(UUID mailbox, CreateEnvelopeCallbackDTO createEnvelopeCallbackDTO) throws ApiException {
        okhttp3.Call localVarCall = createCallbackValidateBeforeCall(mailbox, createEnvelopeCallbackDTO, null);
        Type localVarReturnType = new TypeToken<EnvelopeCallbackDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add new callback (asynchronously)
     * 
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param createEnvelopeCallbackDTO  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCallbackAsync(UUID mailbox, CreateEnvelopeCallbackDTO createEnvelopeCallbackDTO, final ApiCallback<EnvelopeCallbackDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = createCallbackValidateBeforeCall(mailbox, createEnvelopeCallbackDTO, _callback);
        Type localVarReturnType = new TypeToken<EnvelopeCallbackDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listCallbacks
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
    public okhttp3.Call listCallbacksCall(UUID mailbox, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/envelope/callback/list";

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


        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listCallbacksValidateBeforeCall(UUID mailbox, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling listCallbacks(Async)");
        }

        return listCallbacksCall(mailbox, _callback);

    }

    /**
     * List callbacks
     * 
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return List&lt;EnvelopeCallbackDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<EnvelopeCallbackDTO> listCallbacks(UUID mailbox) throws ApiException {
        ApiResponse<List<EnvelopeCallbackDTO>> localVarResp = listCallbacksWithHttpInfo(mailbox);
        return localVarResp.getData();
    }

    /**
     * List callbacks
     * 
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;List&lt;EnvelopeCallbackDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<EnvelopeCallbackDTO>> listCallbacksWithHttpInfo(UUID mailbox) throws ApiException {
        okhttp3.Call localVarCall = listCallbacksValidateBeforeCall(mailbox, null);
        Type localVarReturnType = new TypeToken<List<EnvelopeCallbackDTO>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List callbacks (asynchronously)
     * 
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
    public okhttp3.Call listCallbacksAsync(UUID mailbox, final ApiCallback<List<EnvelopeCallbackDTO>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listCallbacksValidateBeforeCall(mailbox, _callback);
        Type localVarReturnType = new TypeToken<List<EnvelopeCallbackDTO>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeCallback
     * @param callbackUuid Callback id (required)
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
    public okhttp3.Call removeCallbackCall(UUID callbackUuid, UUID mailbox, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/envelope/callback/{callbackUuid}/remove"
            .replace("{" + "callbackUuid" + "}", localVarApiClient.escapeString(callbackUuid.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (mailbox != null) {
            localVarHeaderParams.put("Mailbox", localVarApiClient.parameterToString(mailbox));
        }


        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeCallbackValidateBeforeCall(UUID callbackUuid, UUID mailbox, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'callbackUuid' is set
        if (callbackUuid == null) {
            throw new ApiException("Missing the required parameter 'callbackUuid' when calling removeCallback(Async)");
        }

        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling removeCallback(Async)");
        }

        return removeCallbackCall(callbackUuid, mailbox, _callback);

    }

    /**
     * Delete callback
     * 
     * @param callbackUuid Callback id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void removeCallback(UUID callbackUuid, UUID mailbox) throws ApiException {
        removeCallbackWithHttpInfo(callbackUuid, mailbox);
    }

    /**
     * Delete callback
     * 
     * @param callbackUuid Callback id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> removeCallbackWithHttpInfo(UUID callbackUuid, UUID mailbox) throws ApiException {
        okhttp3.Call localVarCall = removeCallbackValidateBeforeCall(callbackUuid, mailbox, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete callback (asynchronously)
     * 
     * @param callbackUuid Callback id (required)
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
    public okhttp3.Call removeCallbackAsync(UUID callbackUuid, UUID mailbox, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeCallbackValidateBeforeCall(callbackUuid, mailbox, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendCallback
     * @param callbackUuid Callback id (required)
     * @param envelopeUuid Envelope UUID (required)
     * @param mailboxUuid Mailbox context, HTTP Header with current mailbox UUID (required)
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
    public okhttp3.Call sendCallbackCall(UUID callbackUuid, UUID envelopeUuid, UUID mailboxUuid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/envelope/callback/{callbackUuid}/send"
            .replace("{" + "callbackUuid" + "}", localVarApiClient.escapeString(callbackUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (envelopeUuid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("envelopeUuid", envelopeUuid));
        }

        if (mailboxUuid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mailboxUuid", mailboxUuid));
        }

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

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendCallbackValidateBeforeCall(UUID callbackUuid, UUID envelopeUuid, UUID mailboxUuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'callbackUuid' is set
        if (callbackUuid == null) {
            throw new ApiException("Missing the required parameter 'callbackUuid' when calling sendCallback(Async)");
        }

        // verify the required parameter 'envelopeUuid' is set
        if (envelopeUuid == null) {
            throw new ApiException("Missing the required parameter 'envelopeUuid' when calling sendCallback(Async)");
        }

        // verify the required parameter 'mailboxUuid' is set
        if (mailboxUuid == null) {
            throw new ApiException("Missing the required parameter 'mailboxUuid' when calling sendCallback(Async)");
        }

        return sendCallbackCall(callbackUuid, envelopeUuid, mailboxUuid, _callback);

    }

    /**
     * Send callback with certain envelope
     * 
     * @param callbackUuid Callback id (required)
     * @param envelopeUuid Envelope UUID (required)
     * @param mailboxUuid Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return EnvelopeSendResultDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public EnvelopeSendResultDTO sendCallback(UUID callbackUuid, UUID envelopeUuid, UUID mailboxUuid) throws ApiException {
        ApiResponse<EnvelopeSendResultDTO> localVarResp = sendCallbackWithHttpInfo(callbackUuid, envelopeUuid, mailboxUuid);
        return localVarResp.getData();
    }

    /**
     * Send callback with certain envelope
     * 
     * @param callbackUuid Callback id (required)
     * @param envelopeUuid Envelope UUID (required)
     * @param mailboxUuid Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;EnvelopeSendResultDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EnvelopeSendResultDTO> sendCallbackWithHttpInfo(UUID callbackUuid, UUID envelopeUuid, UUID mailboxUuid) throws ApiException {
        okhttp3.Call localVarCall = sendCallbackValidateBeforeCall(callbackUuid, envelopeUuid, mailboxUuid, null);
        Type localVarReturnType = new TypeToken<EnvelopeSendResultDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send callback with certain envelope (asynchronously)
     * 
     * @param callbackUuid Callback id (required)
     * @param envelopeUuid Envelope UUID (required)
     * @param mailboxUuid Mailbox context, HTTP Header with current mailbox UUID (required)
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
    public okhttp3.Call sendCallbackAsync(UUID callbackUuid, UUID envelopeUuid, UUID mailboxUuid, final ApiCallback<EnvelopeSendResultDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendCallbackValidateBeforeCall(callbackUuid, envelopeUuid, mailboxUuid, _callback);
        Type localVarReturnType = new TypeToken<EnvelopeSendResultDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
