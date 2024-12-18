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
import com.docstudio.client.model.AppTokenDTO;
import com.docstudio.client.model.CreateAppTokenDTO;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;

public class ApplicationTokenControllerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ApplicationTokenControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationTokenControllerApi(ApiClient apiClient) {
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
     * Build call for createToken
     * @param createAppTokenDTO  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method disabled by configuration </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTokenCall(CreateAppTokenDTO createAppTokenDTO, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createAppTokenDTO;

        // create path and map variables
        String localVarPath = "/api/v1/token";

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

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createTokenValidateBeforeCall(CreateAppTokenDTO createAppTokenDTO, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createAppTokenDTO' is set
        if (createAppTokenDTO == null) {
            throw new ApiException("Missing the required parameter 'createAppTokenDTO' when calling createToken(Async)");
        }

        return createTokenCall(createAppTokenDTO, _callback);

    }

    /**
     * Create application token
     *
     * @param createAppTokenDTO  (required)
     * @return AppTokenDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method disabled by configuration </td><td>  -  </td></tr>
     </table>
     */
    public AppTokenDTO createToken(CreateAppTokenDTO createAppTokenDTO) throws ApiException {
        ApiResponse<AppTokenDTO> localVarResp = createTokenWithHttpInfo(createAppTokenDTO);
        return localVarResp.getData();
    }

    /**
     * Create application token
     *
     * @param createAppTokenDTO  (required)
     * @return ApiResponse&lt;AppTokenDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method disabled by configuration </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AppTokenDTO> createTokenWithHttpInfo(CreateAppTokenDTO createAppTokenDTO) throws ApiException {
        okhttp3.Call localVarCall = createTokenValidateBeforeCall(createAppTokenDTO, null);
        Type localVarReturnType = new TypeToken<AppTokenDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create application token (asynchronously)
     *
     * @param createAppTokenDTO  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method disabled by configuration </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTokenAsync(CreateAppTokenDTO createAppTokenDTO, final ApiCallback<AppTokenDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTokenValidateBeforeCall(createAppTokenDTO, _callback);
        Type localVarReturnType = new TypeToken<AppTokenDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUserTokens
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method disabled by configuration </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserTokensCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/token";

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

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUserTokensValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getUserTokensCall(_callback);

    }

    /**
     * List application tokens
     *
     * @return List&lt;AppTokenDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method disabled by configuration </td><td>  -  </td></tr>
     </table>
     */
    public List<AppTokenDTO> getUserTokens() throws ApiException {
        ApiResponse<List<AppTokenDTO>> localVarResp = getUserTokensWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * List application tokens
     *
     * @return ApiResponse&lt;List&lt;AppTokenDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method disabled by configuration </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AppTokenDTO>> getUserTokensWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getUserTokensValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<AppTokenDTO>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List application tokens (asynchronously)
     *
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method disabled by configuration </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserTokensAsync(final ApiCallback<List<AppTokenDTO>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserTokensValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<AppTokenDTO>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for revokeToken
     * @param id Token id (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method disabled by configuration </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call revokeTokenCall(UUID id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/token/{id}"
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

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call revokeTokenValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling revokeToken(Async)");
        }

        return revokeTokenCall(id, _callback);

    }

    /**
     * Revoke application token
     *
     * @param id Token id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method disabled by configuration </td><td>  -  </td></tr>
     </table>
     */
    public void revokeToken(UUID id) throws ApiException {
        revokeTokenWithHttpInfo(id);
    }

    /**
     * Revoke application token
     *
     * @param id Token id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method disabled by configuration </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> revokeTokenWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = revokeTokenValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Revoke application token (asynchronously)
     *
     * @param id Token id (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method disabled by configuration </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call revokeTokenAsync(UUID id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = revokeTokenValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
