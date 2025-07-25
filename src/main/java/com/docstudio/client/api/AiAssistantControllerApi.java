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


import com.docstudio.client.model.AiAssistantConversation;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AiAssistantControllerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AiAssistantControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AiAssistantControllerApi(ApiClient apiClient) {
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
     * Build call for envelopeAssistConversationGet
     * @param id UUID of Envelope (required)
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
    public okhttp3.Call envelopeAssistConversationGetCall(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull UUID mailbox, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/ai-assistant/envelope/{id}/history"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

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
    private okhttp3.Call envelopeAssistConversationGetValidateBeforeCall(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull UUID mailbox, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling envelopeAssistConversationGet(Async)");
        }

        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling envelopeAssistConversationGet(Async)");
        }

        return envelopeAssistConversationGetCall(id, mailbox, _callback);

    }

    /**
     * Retrieve existing chat with AI assistant for envelope
     * Empty conversation will be returned if no conversation exists
     * @param id UUID of Envelope (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return AiAssistantConversation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AiAssistantConversation envelopeAssistConversationGet(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull UUID mailbox) throws ApiException {
        ApiResponse<AiAssistantConversation> localVarResp = envelopeAssistConversationGetWithHttpInfo(id, mailbox);
        return localVarResp.getData();
    }

    /**
     * Retrieve existing chat with AI assistant for envelope
     * Empty conversation will be returned if no conversation exists
     * @param id UUID of Envelope (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;AiAssistantConversation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AiAssistantConversation> envelopeAssistConversationGetWithHttpInfo(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull UUID mailbox) throws ApiException {
        okhttp3.Call localVarCall = envelopeAssistConversationGetValidateBeforeCall(id, mailbox, null);
        Type localVarReturnType = new TypeToken<AiAssistantConversation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve existing chat with AI assistant for envelope (asynchronously)
     * Empty conversation will be returned if no conversation exists
     * @param id UUID of Envelope (required)
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
    public okhttp3.Call envelopeAssistConversationGetAsync(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull UUID mailbox, final ApiCallback<AiAssistantConversation> _callback) throws ApiException {

        okhttp3.Call localVarCall = envelopeAssistConversationGetValidateBeforeCall(id, mailbox, _callback);
        Type localVarReturnType = new TypeToken<AiAssistantConversation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for envelopeAssistRequest
     * @param id UUID of Envelope (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param message User message (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Server sent events stream </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call envelopeAssistRequestCall(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull UUID mailbox, @javax.annotation.Nullable String message, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/ai-assistant/envelope/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (message != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("message", message));
        }

        final String[] localVarAccepts = {
            "text/event-stream"
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
    private okhttp3.Call envelopeAssistRequestValidateBeforeCall(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull UUID mailbox, @javax.annotation.Nullable String message, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling envelopeAssistRequest(Async)");
        }

        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling envelopeAssistRequest(Async)");
        }

        return envelopeAssistRequestCall(id, mailbox, message, _callback);

    }

    /**
     * Chat with AI assistant
     * Ask question or request summary about envelope
     * @param id UUID of Envelope (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param message User message (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Server sent events stream </td><td>  -  </td></tr>
     </table>
     */
    public String envelopeAssistRequest(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull UUID mailbox, @javax.annotation.Nullable String message) throws ApiException {
        ApiResponse<String> localVarResp = envelopeAssistRequestWithHttpInfo(id, mailbox, message);
        return localVarResp.getData();
    }

    /**
     * Chat with AI assistant
     * Ask question or request summary about envelope
     * @param id UUID of Envelope (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param message User message (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Server sent events stream </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> envelopeAssistRequestWithHttpInfo(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull UUID mailbox, @javax.annotation.Nullable String message) throws ApiException {
        okhttp3.Call localVarCall = envelopeAssistRequestValidateBeforeCall(id, mailbox, message, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Chat with AI assistant (asynchronously)
     * Ask question or request summary about envelope
     * @param id UUID of Envelope (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param message User message (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Server sent events stream </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call envelopeAssistRequestAsync(@javax.annotation.Nonnull UUID id, @javax.annotation.Nonnull UUID mailbox, @javax.annotation.Nullable String message, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = envelopeAssistRequestValidateBeforeCall(id, mailbox, message, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
