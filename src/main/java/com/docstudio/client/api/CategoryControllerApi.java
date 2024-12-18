/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R121.17
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.api;

import com.docstudio.client.*;
import com.docstudio.client.model.CategoryDTO;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;

public class CategoryControllerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CategoryControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CategoryControllerApi(ApiClient apiClient) {
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
     * Build call for create6
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param categoryDTO  (required)
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
    public okhttp3.Call create6Call(UUID mailbox, CategoryDTO categoryDTO, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = categoryDTO;

        // create path and map variables
        String localVarPath = "/api/v1/category";

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
    private okhttp3.Call create6ValidateBeforeCall(UUID mailbox, CategoryDTO categoryDTO, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling create6(Async)");
        }

        // verify the required parameter 'categoryDTO' is set
        if (categoryDTO == null) {
            throw new ApiException("Missing the required parameter 'categoryDTO' when calling create6(Async)");
        }

        return create6Call(mailbox, categoryDTO, _callback);

    }

    /**
     * Save a category in DB
     *
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param categoryDTO  (required)
     * @return CategoryDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public CategoryDTO create6(UUID mailbox, CategoryDTO categoryDTO) throws ApiException {
        ApiResponse<CategoryDTO> localVarResp = create6WithHttpInfo(mailbox, categoryDTO);
        return localVarResp.getData();
    }

    /**
     * Save a category in DB
     *
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param categoryDTO  (required)
     * @return ApiResponse&lt;CategoryDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CategoryDTO> create6WithHttpInfo(UUID mailbox, CategoryDTO categoryDTO) throws ApiException {
        okhttp3.Call localVarCall = create6ValidateBeforeCall(mailbox, categoryDTO, null);
        Type localVarReturnType = new TypeToken<CategoryDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Save a category in DB (asynchronously)
     *
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param categoryDTO  (required)
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
    public okhttp3.Call create6Async(UUID mailbox, CategoryDTO categoryDTO, final ApiCallback<CategoryDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = create6ValidateBeforeCall(mailbox, categoryDTO, _callback);
        Type localVarReturnType = new TypeToken<CategoryDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for delete4
     * @param id Category Id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param moveTo Optional id of category to move all subordinated (if any) (optional)
     * @param keepChildren Optional, if true and moveTo is null all children will become root categories (optional)
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
    public okhttp3.Call delete4Call(UUID id, UUID mailbox, UUID moveTo, Boolean keepChildren, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/category/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (moveTo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("moveTo", moveTo));
        }

        if (keepChildren != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("keepChildren", keepChildren));
        }

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
    private okhttp3.Call delete4ValidateBeforeCall(UUID id, UUID mailbox, UUID moveTo, Boolean keepChildren, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling delete4(Async)");
        }

        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling delete4(Async)");
        }

        return delete4Call(id, mailbox, moveTo, keepChildren, _callback);

    }

    /**
     * Delete category by Id
     *
     * @param id Category Id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param moveTo Optional id of category to move all subordinated (if any) (optional)
     * @param keepChildren Optional, if true and moveTo is null all children will become root categories (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public void delete4(UUID id, UUID mailbox, UUID moveTo, Boolean keepChildren) throws ApiException {
        delete4WithHttpInfo(id, mailbox, moveTo, keepChildren);
    }

    /**
     * Delete category by Id
     *
     * @param id Category Id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param moveTo Optional id of category to move all subordinated (if any) (optional)
     * @param keepChildren Optional, if true and moveTo is null all children will become root categories (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> delete4WithHttpInfo(UUID id, UUID mailbox, UUID moveTo, Boolean keepChildren) throws ApiException {
        okhttp3.Call localVarCall = delete4ValidateBeforeCall(id, mailbox, moveTo, keepChildren, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete category by Id (asynchronously)
     *
     * @param id Category Id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param moveTo Optional id of category to move all subordinated (if any) (optional)
     * @param keepChildren Optional, if true and moveTo is null all children will become root categories (optional)
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
    public okhttp3.Call delete4Async(UUID id, UUID mailbox, UUID moveTo, Boolean keepChildren, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = delete4ValidateBeforeCall(id, mailbox, moveTo, keepChildren, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllByType
     * @param access Type of level to retrieve categories by (required)
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
    public okhttp3.Call getAllByTypeCall(String access, UUID mailbox, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/category/{access}"
            .replace("{" + "access" + "}", localVarApiClient.escapeString(access.toString()));

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
    private okhttp3.Call getAllByTypeValidateBeforeCall(String access, UUID mailbox, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'access' is set
        if (access == null) {
            throw new ApiException("Missing the required parameter 'access' when calling getAllByType(Async)");
        }

        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling getAllByType(Async)");
        }

        return getAllByTypeCall(access, mailbox, _callback);

    }

    /**
     * Retrieve all categories by id of specified &#39;access&#39; type
     *
     * @param access Type of level to retrieve categories by (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return List&lt;CategoryDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<CategoryDTO> getAllByType(String access, UUID mailbox) throws ApiException {
        ApiResponse<List<CategoryDTO>> localVarResp = getAllByTypeWithHttpInfo(access, mailbox);
        return localVarResp.getData();
    }

    /**
     * Retrieve all categories by id of specified &#39;access&#39; type
     *
     * @param access Type of level to retrieve categories by (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;List&lt;CategoryDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CategoryDTO>> getAllByTypeWithHttpInfo(String access, UUID mailbox) throws ApiException {
        okhttp3.Call localVarCall = getAllByTypeValidateBeforeCall(access, mailbox, null);
        Type localVarReturnType = new TypeToken<List<CategoryDTO>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve all categories by id of specified &#39;access&#39; type (asynchronously)
     *
     * @param access Type of level to retrieve categories by (required)
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
    public okhttp3.Call getAllByTypeAsync(String access, UUID mailbox, final ApiCallback<List<CategoryDTO>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllByTypeValidateBeforeCall(access, mailbox, _callback);
        Type localVarReturnType = new TypeToken<List<CategoryDTO>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for update6
     * @param id Category Id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param categoryDTO  (required)
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
    public okhttp3.Call update6Call(UUID id, UUID mailbox, CategoryDTO categoryDTO, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = categoryDTO;

        // create path and map variables
        String localVarPath = "/api/v1/category/{id}"
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
    private okhttp3.Call update6ValidateBeforeCall(UUID id, UUID mailbox, CategoryDTO categoryDTO, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling update6(Async)");
        }

        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling update6(Async)");
        }

        // verify the required parameter 'categoryDTO' is set
        if (categoryDTO == null) {
            throw new ApiException("Missing the required parameter 'categoryDTO' when calling update6(Async)");
        }

        return update6Call(id, mailbox, categoryDTO, _callback);

    }

    /**
     * Update the category in DB
     *
     * @param id Category Id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param categoryDTO  (required)
     * @return CategoryDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CategoryDTO update6(UUID id, UUID mailbox, CategoryDTO categoryDTO) throws ApiException {
        ApiResponse<CategoryDTO> localVarResp = update6WithHttpInfo(id, mailbox, categoryDTO);
        return localVarResp.getData();
    }

    /**
     * Update the category in DB
     *
     * @param id Category Id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param categoryDTO  (required)
     * @return ApiResponse&lt;CategoryDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CategoryDTO> update6WithHttpInfo(UUID id, UUID mailbox, CategoryDTO categoryDTO) throws ApiException {
        okhttp3.Call localVarCall = update6ValidateBeforeCall(id, mailbox, categoryDTO, null);
        Type localVarReturnType = new TypeToken<CategoryDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update the category in DB (asynchronously)
     *
     * @param id Category Id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param categoryDTO  (required)
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
    public okhttp3.Call update6Async(UUID id, UUID mailbox, CategoryDTO categoryDTO, final ApiCallback<CategoryDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = update6ValidateBeforeCall(id, mailbox, categoryDTO, _callback);
        Type localVarReturnType = new TypeToken<CategoryDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
