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


import com.docstudio.client.model.PermissionsDTO;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermissionMailboxControllerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PermissionMailboxControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PermissionMailboxControllerApi(ApiClient apiClient) {
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
     * Build call for deleteAllPermissions
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
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
    public okhttp3.Call deleteAllPermissionsCall(UUID userUuid, UUID mailboxUuid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/permission/{userUuid}/mailbox/{mailboxUuid}"
            .replace("{" + "userUuid" + "}", localVarApiClient.escapeString(userUuid.toString()))
            .replace("{" + "mailboxUuid" + "}", localVarApiClient.escapeString(mailboxUuid.toString()));

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
    private okhttp3.Call deleteAllPermissionsValidateBeforeCall(UUID userUuid, UUID mailboxUuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userUuid' is set
        if (userUuid == null) {
            throw new ApiException("Missing the required parameter 'userUuid' when calling deleteAllPermissions(Async)");
        }

        // verify the required parameter 'mailboxUuid' is set
        if (mailboxUuid == null) {
            throw new ApiException("Missing the required parameter 'mailboxUuid' when calling deleteAllPermissions(Async)");
        }

        return deleteAllPermissionsCall(userUuid, mailboxUuid, _callback);

    }

    /**
     * Delete all permissions and roles for selected user-to-mailbox relation
     * 
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public void deleteAllPermissions(UUID userUuid, UUID mailboxUuid) throws ApiException {
        deleteAllPermissionsWithHttpInfo(userUuid, mailboxUuid);
    }

    /**
     * Delete all permissions and roles for selected user-to-mailbox relation
     * 
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteAllPermissionsWithHttpInfo(UUID userUuid, UUID mailboxUuid) throws ApiException {
        okhttp3.Call localVarCall = deleteAllPermissionsValidateBeforeCall(userUuid, mailboxUuid, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete all permissions and roles for selected user-to-mailbox relation (asynchronously)
     * 
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
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
    public okhttp3.Call deleteAllPermissionsAsync(UUID userUuid, UUID mailboxUuid, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteAllPermissionsValidateBeforeCall(userUuid, mailboxUuid, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePermission
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param permissionId Permission Id (required)
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
    public okhttp3.Call deletePermissionCall(UUID userUuid, UUID mailboxUuid, Integer permissionId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/permission/{userUuid}/mailbox/{mailboxUuid}/{permissionId}"
            .replace("{" + "userUuid" + "}", localVarApiClient.escapeString(userUuid.toString()))
            .replace("{" + "mailboxUuid" + "}", localVarApiClient.escapeString(mailboxUuid.toString()))
            .replace("{" + "permissionId" + "}", localVarApiClient.escapeString(permissionId.toString()));

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
    private okhttp3.Call deletePermissionValidateBeforeCall(UUID userUuid, UUID mailboxUuid, Integer permissionId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userUuid' is set
        if (userUuid == null) {
            throw new ApiException("Missing the required parameter 'userUuid' when calling deletePermission(Async)");
        }

        // verify the required parameter 'mailboxUuid' is set
        if (mailboxUuid == null) {
            throw new ApiException("Missing the required parameter 'mailboxUuid' when calling deletePermission(Async)");
        }

        // verify the required parameter 'permissionId' is set
        if (permissionId == null) {
            throw new ApiException("Missing the required parameter 'permissionId' when calling deletePermission(Async)");
        }

        return deletePermissionCall(userUuid, mailboxUuid, permissionId, _callback);

    }

    /**
     * Delete permission for specific user-to-mailbox relation
     * 
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param permissionId Permission Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public void deletePermission(UUID userUuid, UUID mailboxUuid, Integer permissionId) throws ApiException {
        deletePermissionWithHttpInfo(userUuid, mailboxUuid, permissionId);
    }

    /**
     * Delete permission for specific user-to-mailbox relation
     * 
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param permissionId Permission Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deletePermissionWithHttpInfo(UUID userUuid, UUID mailboxUuid, Integer permissionId) throws ApiException {
        okhttp3.Call localVarCall = deletePermissionValidateBeforeCall(userUuid, mailboxUuid, permissionId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete permission for specific user-to-mailbox relation (asynchronously)
     * 
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param permissionId Permission Id (required)
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
    public okhttp3.Call deletePermissionAsync(UUID userUuid, UUID mailboxUuid, Integer permissionId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePermissionValidateBeforeCall(userUuid, mailboxUuid, permissionId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteRoleFromMailbox
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param roleUuid UUID of role (required)
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
    public okhttp3.Call deleteRoleFromMailboxCall(UUID userUuid, UUID mailboxUuid, UUID roleUuid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/permission/{userUuid}/mailbox/{mailboxUuid}/role/{roleUuid}"
            .replace("{" + "userUuid" + "}", localVarApiClient.escapeString(userUuid.toString()))
            .replace("{" + "mailboxUuid" + "}", localVarApiClient.escapeString(mailboxUuid.toString()))
            .replace("{" + "roleUuid" + "}", localVarApiClient.escapeString(roleUuid.toString()));

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
    private okhttp3.Call deleteRoleFromMailboxValidateBeforeCall(UUID userUuid, UUID mailboxUuid, UUID roleUuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userUuid' is set
        if (userUuid == null) {
            throw new ApiException("Missing the required parameter 'userUuid' when calling deleteRoleFromMailbox(Async)");
        }

        // verify the required parameter 'mailboxUuid' is set
        if (mailboxUuid == null) {
            throw new ApiException("Missing the required parameter 'mailboxUuid' when calling deleteRoleFromMailbox(Async)");
        }

        // verify the required parameter 'roleUuid' is set
        if (roleUuid == null) {
            throw new ApiException("Missing the required parameter 'roleUuid' when calling deleteRoleFromMailbox(Async)");
        }

        return deleteRoleFromMailboxCall(userUuid, mailboxUuid, roleUuid, _callback);

    }

    /**
     * Delete role
     * 
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param roleUuid UUID of role (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public void deleteRoleFromMailbox(UUID userUuid, UUID mailboxUuid, UUID roleUuid) throws ApiException {
        deleteRoleFromMailboxWithHttpInfo(userUuid, mailboxUuid, roleUuid);
    }

    /**
     * Delete role
     * 
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param roleUuid UUID of role (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteRoleFromMailboxWithHttpInfo(UUID userUuid, UUID mailboxUuid, UUID roleUuid) throws ApiException {
        okhttp3.Call localVarCall = deleteRoleFromMailboxValidateBeforeCall(userUuid, mailboxUuid, roleUuid, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete role (asynchronously)
     * 
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param roleUuid UUID of role (required)
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
    public okhttp3.Call deleteRoleFromMailboxAsync(UUID userUuid, UUID mailboxUuid, UUID roleUuid, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteRoleFromMailboxValidateBeforeCall(userUuid, mailboxUuid, roleUuid, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchMbPermissions
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param permissionsDTO  (required)
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
    public okhttp3.Call patchMbPermissionsCall(UUID userUuid, UUID mailboxUuid, PermissionsDTO permissionsDTO, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = permissionsDTO;

        // create path and map variables
        String localVarPath = "/api/v1/permission/{userUuid}/mailbox/{mailboxUuid}"
            .replace("{" + "userUuid" + "}", localVarApiClient.escapeString(userUuid.toString()))
            .replace("{" + "mailboxUuid" + "}", localVarApiClient.escapeString(mailboxUuid.toString()));

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

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchMbPermissionsValidateBeforeCall(UUID userUuid, UUID mailboxUuid, PermissionsDTO permissionsDTO, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userUuid' is set
        if (userUuid == null) {
            throw new ApiException("Missing the required parameter 'userUuid' when calling patchMbPermissions(Async)");
        }

        // verify the required parameter 'mailboxUuid' is set
        if (mailboxUuid == null) {
            throw new ApiException("Missing the required parameter 'mailboxUuid' when calling patchMbPermissions(Async)");
        }

        // verify the required parameter 'permissionsDTO' is set
        if (permissionsDTO == null) {
            throw new ApiException("Missing the required parameter 'permissionsDTO' when calling patchMbPermissions(Async)");
        }

        return patchMbPermissionsCall(userUuid, mailboxUuid, permissionsDTO, _callback);

    }

    /**
     * Add exact permissions/roles leaving existing as is. Ignore if already present.
     * 
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param permissionsDTO  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void patchMbPermissions(UUID userUuid, UUID mailboxUuid, PermissionsDTO permissionsDTO) throws ApiException {
        patchMbPermissionsWithHttpInfo(userUuid, mailboxUuid, permissionsDTO);
    }

    /**
     * Add exact permissions/roles leaving existing as is. Ignore if already present.
     * 
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param permissionsDTO  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> patchMbPermissionsWithHttpInfo(UUID userUuid, UUID mailboxUuid, PermissionsDTO permissionsDTO) throws ApiException {
        okhttp3.Call localVarCall = patchMbPermissionsValidateBeforeCall(userUuid, mailboxUuid, permissionsDTO, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Add exact permissions/roles leaving existing as is. Ignore if already present. (asynchronously)
     * 
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param permissionsDTO  (required)
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
    public okhttp3.Call patchMbPermissionsAsync(UUID userUuid, UUID mailboxUuid, PermissionsDTO permissionsDTO, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchMbPermissionsValidateBeforeCall(userUuid, mailboxUuid, permissionsDTO, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for replaceAllPermissions
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param permissionsDTO  (required)
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
    public okhttp3.Call replaceAllPermissionsCall(UUID userUuid, UUID mailboxUuid, PermissionsDTO permissionsDTO, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = permissionsDTO;

        // create path and map variables
        String localVarPath = "/api/v1/permission/{userUuid}/mailbox/{mailboxUuid}"
            .replace("{" + "userUuid" + "}", localVarApiClient.escapeString(userUuid.toString()))
            .replace("{" + "mailboxUuid" + "}", localVarApiClient.escapeString(mailboxUuid.toString()));

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

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call replaceAllPermissionsValidateBeforeCall(UUID userUuid, UUID mailboxUuid, PermissionsDTO permissionsDTO, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userUuid' is set
        if (userUuid == null) {
            throw new ApiException("Missing the required parameter 'userUuid' when calling replaceAllPermissions(Async)");
        }

        // verify the required parameter 'mailboxUuid' is set
        if (mailboxUuid == null) {
            throw new ApiException("Missing the required parameter 'mailboxUuid' when calling replaceAllPermissions(Async)");
        }

        // verify the required parameter 'permissionsDTO' is set
        if (permissionsDTO == null) {
            throw new ApiException("Missing the required parameter 'permissionsDTO' when calling replaceAllPermissions(Async)");
        }

        return replaceAllPermissionsCall(userUuid, mailboxUuid, permissionsDTO, _callback);

    }

    /**
     * Replace all permissions for selected user-to-mailbox relation
     * 
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param permissionsDTO  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void replaceAllPermissions(UUID userUuid, UUID mailboxUuid, PermissionsDTO permissionsDTO) throws ApiException {
        replaceAllPermissionsWithHttpInfo(userUuid, mailboxUuid, permissionsDTO);
    }

    /**
     * Replace all permissions for selected user-to-mailbox relation
     * 
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param permissionsDTO  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> replaceAllPermissionsWithHttpInfo(UUID userUuid, UUID mailboxUuid, PermissionsDTO permissionsDTO) throws ApiException {
        okhttp3.Call localVarCall = replaceAllPermissionsValidateBeforeCall(userUuid, mailboxUuid, permissionsDTO, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Replace all permissions for selected user-to-mailbox relation (asynchronously)
     * 
     * @param userUuid UUID of User (required)
     * @param mailboxUuid UUID of mailbox (required)
     * @param permissionsDTO  (required)
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
    public okhttp3.Call replaceAllPermissionsAsync(UUID userUuid, UUID mailboxUuid, PermissionsDTO permissionsDTO, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceAllPermissionsValidateBeforeCall(userUuid, mailboxUuid, permissionsDTO, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
