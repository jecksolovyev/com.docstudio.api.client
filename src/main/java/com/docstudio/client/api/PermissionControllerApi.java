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

import java.util.*;

public class PermissionControllerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PermissionControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PermissionControllerApi(ApiClient apiClient) {
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
     * Build call for resendInvitation
     * @param accountUuid Account UUID (required)
     * @param userUuid User UUID (required)
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
    public okhttp3.Call resendInvitationCall(UUID accountUuid, UUID userUuid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/permission/invite/{accountUuid}/{userUuid}/resend"
            .replace("{" + "accountUuid" + "}", localVarApiClient.escapeString(accountUuid.toString()))
            .replace("{" + "userUuid" + "}", localVarApiClient.escapeString(userUuid.toString()));

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

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call resendInvitationValidateBeforeCall(UUID accountUuid, UUID userUuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountUuid' is set
        if (accountUuid == null) {
            throw new ApiException("Missing the required parameter 'accountUuid' when calling resendInvitation(Async)");
        }

        // verify the required parameter 'userUuid' is set
        if (userUuid == null) {
            throw new ApiException("Missing the required parameter 'userUuid' when calling resendInvitation(Async)");
        }

        return resendInvitationCall(accountUuid, userUuid, _callback);

    }

    /**
     * Resend invitation for user to account
     *
     * @param accountUuid Account UUID (required)
     * @param userUuid User UUID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void resendInvitation(UUID accountUuid, UUID userUuid) throws ApiException {
        resendInvitationWithHttpInfo(accountUuid, userUuid);
    }

    /**
     * Resend invitation for user to account
     *
     * @param accountUuid Account UUID (required)
     * @param userUuid User UUID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> resendInvitationWithHttpInfo(UUID accountUuid, UUID userUuid) throws ApiException {
        okhttp3.Call localVarCall = resendInvitationValidateBeforeCall(accountUuid, userUuid, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Resend invitation for user to account (asynchronously)
     *
     * @param accountUuid Account UUID (required)
     * @param userUuid User UUID (required)
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
    public okhttp3.Call resendInvitationAsync(UUID accountUuid, UUID userUuid, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = resendInvitationValidateBeforeCall(accountUuid, userUuid, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for revokeInvitation
     * @param accountUuid Account UUID (required)
     * @param userUuid User UUID (required)
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
    public okhttp3.Call revokeInvitationCall(UUID accountUuid, UUID userUuid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/permission/invite/{accountUuid}/{userUuid}"
            .replace("{" + "accountUuid" + "}", localVarApiClient.escapeString(accountUuid.toString()))
            .replace("{" + "userUuid" + "}", localVarApiClient.escapeString(userUuid.toString()));

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

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call revokeInvitationValidateBeforeCall(UUID accountUuid, UUID userUuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountUuid' is set
        if (accountUuid == null) {
            throw new ApiException("Missing the required parameter 'accountUuid' when calling revokeInvitation(Async)");
        }

        // verify the required parameter 'userUuid' is set
        if (userUuid == null) {
            throw new ApiException("Missing the required parameter 'userUuid' when calling revokeInvitation(Async)");
        }

        return revokeInvitationCall(accountUuid, userUuid, _callback);

    }

    /**
     * Revoke invitation for user to account
     *
     * @param accountUuid Account UUID (required)
     * @param userUuid User UUID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void revokeInvitation(UUID accountUuid, UUID userUuid) throws ApiException {
        revokeInvitationWithHttpInfo(accountUuid, userUuid);
    }

    /**
     * Revoke invitation for user to account
     *
     * @param accountUuid Account UUID (required)
     * @param userUuid User UUID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> revokeInvitationWithHttpInfo(UUID accountUuid, UUID userUuid) throws ApiException {
        okhttp3.Call localVarCall = revokeInvitationValidateBeforeCall(accountUuid, userUuid, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Revoke invitation for user to account (asynchronously)
     *
     * @param accountUuid Account UUID (required)
     * @param userUuid User UUID (required)
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
    public okhttp3.Call revokeInvitationAsync(UUID accountUuid, UUID userUuid, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = revokeInvitationValidateBeforeCall(accountUuid, userUuid, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
