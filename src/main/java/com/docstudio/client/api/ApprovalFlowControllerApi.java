/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R121.16
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.api;

import com.docstudio.client.*;
import com.docstudio.client.model.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;

public class ApprovalFlowControllerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ApprovalFlowControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApprovalFlowControllerApi(ApiClient apiClient) {
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
     * Build call for create7
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param mailboxApprovalFlowDTO  (required)
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
    public okhttp3.Call create7Call(UUID mailbox, MailboxApprovalFlowDTO mailboxApprovalFlowDTO, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = mailboxApprovalFlowDTO;

        // create path and map variables
        String localVarPath = "/api/v1/approvalFlow";

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
    private okhttp3.Call create7ValidateBeforeCall(UUID mailbox, MailboxApprovalFlowDTO mailboxApprovalFlowDTO, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling create7(Async)");
        }

        // verify the required parameter 'mailboxApprovalFlowDTO' is set
        if (mailboxApprovalFlowDTO == null) {
            throw new ApiException("Missing the required parameter 'mailboxApprovalFlowDTO' when calling create7(Async)");
        }

        return create7Call(mailbox, mailboxApprovalFlowDTO, _callback);

    }

    /**
     * Create approval flow
     *
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param mailboxApprovalFlowDTO  (required)
     * @return SingleUuidDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public SingleUuidDTO create7(UUID mailbox, MailboxApprovalFlowDTO mailboxApprovalFlowDTO) throws ApiException {
        ApiResponse<SingleUuidDTO> localVarResp = create7WithHttpInfo(mailbox, mailboxApprovalFlowDTO);
        return localVarResp.getData();
    }

    /**
     * Create approval flow
     *
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param mailboxApprovalFlowDTO  (required)
     * @return ApiResponse&lt;SingleUuidDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SingleUuidDTO> create7WithHttpInfo(UUID mailbox, MailboxApprovalFlowDTO mailboxApprovalFlowDTO) throws ApiException {
        okhttp3.Call localVarCall = create7ValidateBeforeCall(mailbox, mailboxApprovalFlowDTO, null);
        Type localVarReturnType = new TypeToken<SingleUuidDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create approval flow (asynchronously)
     *
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param mailboxApprovalFlowDTO  (required)
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
    public okhttp3.Call create7Async(UUID mailbox, MailboxApprovalFlowDTO mailboxApprovalFlowDTO, final ApiCallback<SingleUuidDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = create7ValidateBeforeCall(mailbox, mailboxApprovalFlowDTO, _callback);
        Type localVarReturnType = new TypeToken<SingleUuidDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for delete5
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param UUID  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call delete5Call(UUID mailbox, List<UUID> UUID, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = UUID;

        // create path and map variables
        String localVarPath = "/api/v1/approvalFlow";

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


        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call delete5ValidateBeforeCall(UUID mailbox, List<UUID> UUID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling delete5(Async)");
        }

        // verify the required parameter 'UUID' is set
        if (UUID == null) {
            throw new ApiException("Missing the required parameter 'UUID' when calling delete5(Async)");
        }

        return delete5Call(mailbox, UUID, _callback);

    }

    /**
     * Delete approval flows
     *
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param UUID  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public void delete5(UUID mailbox, List<UUID> UUID) throws ApiException {
        delete5WithHttpInfo(mailbox, UUID);
    }

    /**
     * Delete approval flows
     *
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param UUID  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> delete5WithHttpInfo(UUID mailbox, List<UUID> UUID) throws ApiException {
        okhttp3.Call localVarCall = delete5ValidateBeforeCall(mailbox, UUID, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete approval flows (asynchronously)
     *
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param UUID  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call delete5Async(UUID mailbox, List<UUID> UUID, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = delete5ValidateBeforeCall(mailbox, UUID, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for retrieve
     * @param flowUuid UUID of the approval flow (required)
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
    public okhttp3.Call retrieveCall(UUID flowUuid, UUID mailbox, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/approvalFlow/{flowUuid}"
            .replace("{" + "flowUuid" + "}", localVarApiClient.escapeString(flowUuid.toString()));

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
    private okhttp3.Call retrieveValidateBeforeCall(UUID flowUuid, UUID mailbox, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'flowUuid' is set
        if (flowUuid == null) {
            throw new ApiException("Missing the required parameter 'flowUuid' when calling retrieve(Async)");
        }

        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling retrieve(Async)");
        }

        return retrieveCall(flowUuid, mailbox, _callback);

    }

    /**
     * Retrieve approval flow
     *
     * @param flowUuid UUID of the approval flow (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return MailboxApprovalFlowGetDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public MailboxApprovalFlowGetDTO retrieve(UUID flowUuid, UUID mailbox) throws ApiException {
        ApiResponse<MailboxApprovalFlowGetDTO> localVarResp = retrieveWithHttpInfo(flowUuid, mailbox);
        return localVarResp.getData();
    }

    /**
     * Retrieve approval flow
     *
     * @param flowUuid UUID of the approval flow (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;MailboxApprovalFlowGetDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MailboxApprovalFlowGetDTO> retrieveWithHttpInfo(UUID flowUuid, UUID mailbox) throws ApiException {
        okhttp3.Call localVarCall = retrieveValidateBeforeCall(flowUuid, mailbox, null);
        Type localVarReturnType = new TypeToken<MailboxApprovalFlowGetDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve approval flow (asynchronously)
     *
     * @param flowUuid UUID of the approval flow (required)
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
    public okhttp3.Call retrieveAsync(UUID flowUuid, UUID mailbox, final ApiCallback<MailboxApprovalFlowGetDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveValidateBeforeCall(flowUuid, mailbox, _callback);
        Type localVarReturnType = new TypeToken<MailboxApprovalFlowGetDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for search
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param keyword Keyword to search approval flow by name (optional)
     * @param offset Offset records (optional, default to 0)
     * @param limit Limit records, max is 1000 (optional, default to 25)
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
    public okhttp3.Call searchCall(UUID mailbox, String keyword, Integer offset, Integer limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/approvalFlow";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (keyword != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("keyword", keyword));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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

        if (mailbox != null) {
            localVarHeaderParams.put("Mailbox", localVarApiClient.parameterToString(mailbox));
        }


        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchValidateBeforeCall(UUID mailbox, String keyword, Integer offset, Integer limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling search(Async)");
        }

        return searchCall(mailbox, keyword, offset, limit, _callback);

    }

    /**
     * Retrieve approval flows
     *
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param keyword Keyword to search approval flow by name (optional)
     * @param offset Offset records (optional, default to 0)
     * @param limit Limit records, max is 1000 (optional, default to 25)
     * @return PageDTOMailboxApprovalFlowGetDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PageDTOMailboxApprovalFlowGetDTO search(UUID mailbox, String keyword, Integer offset, Integer limit) throws ApiException {
        ApiResponse<PageDTOMailboxApprovalFlowGetDTO> localVarResp = searchWithHttpInfo(mailbox, keyword, offset, limit);
        return localVarResp.getData();
    }

    /**
     * Retrieve approval flows
     *
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param keyword Keyword to search approval flow by name (optional)
     * @param offset Offset records (optional, default to 0)
     * @param limit Limit records, max is 1000 (optional, default to 25)
     * @return ApiResponse&lt;PageDTOMailboxApprovalFlowGetDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PageDTOMailboxApprovalFlowGetDTO> searchWithHttpInfo(UUID mailbox, String keyword, Integer offset, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = searchValidateBeforeCall(mailbox, keyword, offset, limit, null);
        Type localVarReturnType = new TypeToken<PageDTOMailboxApprovalFlowGetDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve approval flows (asynchronously)
     *
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param keyword Keyword to search approval flow by name (optional)
     * @param offset Offset records (optional, default to 0)
     * @param limit Limit records, max is 1000 (optional, default to 25)
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
    public okhttp3.Call searchAsync(UUID mailbox, String keyword, Integer offset, Integer limit, final ApiCallback<PageDTOMailboxApprovalFlowGetDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchValidateBeforeCall(mailbox, keyword, offset, limit, _callback);
        Type localVarReturnType = new TypeToken<PageDTOMailboxApprovalFlowGetDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for update7
     * @param flowUuid UUID of the approval flow (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param mailboxApprovalFlowDTO  (required)
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
    public okhttp3.Call update7Call(UUID flowUuid, UUID mailbox, MailboxApprovalFlowDTO mailboxApprovalFlowDTO, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = mailboxApprovalFlowDTO;

        // create path and map variables
        String localVarPath = "/api/v1/approvalFlow/{flowUuid}"
            .replace("{" + "flowUuid" + "}", localVarApiClient.escapeString(flowUuid.toString()));

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


        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call update7ValidateBeforeCall(UUID flowUuid, UUID mailbox, MailboxApprovalFlowDTO mailboxApprovalFlowDTO, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'flowUuid' is set
        if (flowUuid == null) {
            throw new ApiException("Missing the required parameter 'flowUuid' when calling update7(Async)");
        }

        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling update7(Async)");
        }

        // verify the required parameter 'mailboxApprovalFlowDTO' is set
        if (mailboxApprovalFlowDTO == null) {
            throw new ApiException("Missing the required parameter 'mailboxApprovalFlowDTO' when calling update7(Async)");
        }

        return update7Call(flowUuid, mailbox, mailboxApprovalFlowDTO, _callback);

    }

    /**
     * Update approval flow
     *
     * @param flowUuid UUID of the approval flow (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param mailboxApprovalFlowDTO  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void update7(UUID flowUuid, UUID mailbox, MailboxApprovalFlowDTO mailboxApprovalFlowDTO) throws ApiException {
        update7WithHttpInfo(flowUuid, mailbox, mailboxApprovalFlowDTO);
    }

    /**
     * Update approval flow
     *
     * @param flowUuid UUID of the approval flow (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param mailboxApprovalFlowDTO  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> update7WithHttpInfo(UUID flowUuid, UUID mailbox, MailboxApprovalFlowDTO mailboxApprovalFlowDTO) throws ApiException {
        okhttp3.Call localVarCall = update7ValidateBeforeCall(flowUuid, mailbox, mailboxApprovalFlowDTO, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update approval flow (asynchronously)
     *
     * @param flowUuid UUID of the approval flow (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param mailboxApprovalFlowDTO  (required)
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
    public okhttp3.Call update7Async(UUID flowUuid, UUID mailbox, MailboxApprovalFlowDTO mailboxApprovalFlowDTO, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = update7ValidateBeforeCall(flowUuid, mailbox, mailboxApprovalFlowDTO, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
