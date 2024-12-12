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


import com.docstudio.client.model.CategoryDTO;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryControllerApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public CategoryControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CategoryControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setHeadersOverrides(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Build call for createCategory
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCategoryCall(CategoryDTO body, UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v1/category";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (mailbox != null)
        localVarHeaderParams.put("Mailbox", apiClient.parameterToString(mailbox));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createCategoryValidateBeforeCall(CategoryDTO body, UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createCategory(Async)");
        }
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling createCategory(Async)");
        }
        
        com.squareup.okhttp.Call call = createCategoryCall(body, mailbox, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Save a category in DB
     * 
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return CategoryDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CategoryDTO createCategory(CategoryDTO body, UUID mailbox) throws ApiException {
        ApiResponse<CategoryDTO> resp = createCategoryWithHttpInfo(body, mailbox);
        return resp.getData();
    }

    /**
     * Save a category in DB
     * 
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;CategoryDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CategoryDTO> createCategoryWithHttpInfo(CategoryDTO body, UUID mailbox) throws ApiException {
        com.squareup.okhttp.Call call = createCategoryValidateBeforeCall(body, mailbox, null, null);
        Type localVarReturnType = new TypeToken<CategoryDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Save a category in DB (asynchronously)
     * 
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createCategoryAsync(CategoryDTO body, UUID mailbox, final ApiCallback<CategoryDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createCategoryValidateBeforeCall(body, mailbox, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CategoryDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteCategory
     * @param id Category Id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param moveTo Optional id of category to move all subordinated (if any) (optional)
     * @param keepChildren Optional, if true and moveTo is null all children will become root categories (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCategoryCall(UUID id, UUID mailbox, UUID moveTo, Boolean keepChildren, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/category/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (moveTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("moveTo", moveTo));
        if (keepChildren != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("keepChildren", keepChildren));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (mailbox != null)
        localVarHeaderParams.put("Mailbox", apiClient.parameterToString(mailbox));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteCategoryValidateBeforeCall(UUID id, UUID mailbox, UUID moveTo, Boolean keepChildren, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteCategory(Async)");
        }
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling deleteCategory(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteCategoryCall(id, mailbox, moveTo, keepChildren, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete category by Id
     * 
     * @param id Category Id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param moveTo Optional id of category to move all subordinated (if any) (optional)
     * @param keepChildren Optional, if true and moveTo is null all children will become root categories (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCategory(UUID id, UUID mailbox, UUID moveTo, Boolean keepChildren) throws ApiException {
        deleteCategoryWithHttpInfo(id, mailbox, moveTo, keepChildren);
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
     */
    public ApiResponse<Void> deleteCategoryWithHttpInfo(UUID id, UUID mailbox, UUID moveTo, Boolean keepChildren) throws ApiException {
        com.squareup.okhttp.Call call = deleteCategoryValidateBeforeCall(id, mailbox, moveTo, keepChildren, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete category by Id (asynchronously)
     * 
     * @param id Category Id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param moveTo Optional id of category to move all subordinated (if any) (optional)
     * @param keepChildren Optional, if true and moveTo is null all children will become root categories (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCategoryAsync(UUID id, UUID mailbox, UUID moveTo, Boolean keepChildren, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteCategoryValidateBeforeCall(id, mailbox, moveTo, keepChildren, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAllByType
     * @param access Type of level to retrieve categories by (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllByTypeCall(String access, UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/category/{access}"
            .replaceAll("\\{" + "access" + "\\}", apiClient.escapeString(access.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (mailbox != null)
        localVarHeaderParams.put("Mailbox", apiClient.parameterToString(mailbox));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAllByTypeValidateBeforeCall(String access, UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'access' is set
        if (access == null) {
            throw new ApiException("Missing the required parameter 'access' when calling getAllByType(Async)");
        }
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling getAllByType(Async)");
        }
        
        com.squareup.okhttp.Call call = getAllByTypeCall(access, mailbox, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve all categories by id of specified &#x27;access&#x27; type
     * 
     * @param access Type of level to retrieve categories by (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return List&lt;CategoryDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CategoryDTO> getAllByType(String access, UUID mailbox) throws ApiException {
        ApiResponse<List<CategoryDTO>> resp = getAllByTypeWithHttpInfo(access, mailbox);
        return resp.getData();
    }

    /**
     * Retrieve all categories by id of specified &#x27;access&#x27; type
     * 
     * @param access Type of level to retrieve categories by (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;List&lt;CategoryDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CategoryDTO>> getAllByTypeWithHttpInfo(String access, UUID mailbox) throws ApiException {
        com.squareup.okhttp.Call call = getAllByTypeValidateBeforeCall(access, mailbox, null, null);
        Type localVarReturnType = new TypeToken<List<CategoryDTO>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve all categories by id of specified &#x27;access&#x27; type (asynchronously)
     * 
     * @param access Type of level to retrieve categories by (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllByTypeAsync(String access, UUID mailbox, final ApiCallback<List<CategoryDTO>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAllByTypeValidateBeforeCall(access, mailbox, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CategoryDTO>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateCategory
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param id Category Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCategoryCall(CategoryDTO body, UUID mailbox, UUID id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v1/category/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (mailbox != null)
        localVarHeaderParams.put("Mailbox", apiClient.parameterToString(mailbox));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateCategoryValidateBeforeCall(CategoryDTO body, UUID mailbox, UUID id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateCategory(Async)");
        }
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling updateCategory(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateCategory(Async)");
        }
        
        com.squareup.okhttp.Call call = updateCategoryCall(body, mailbox, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update the category in DB
     * 
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param id Category Id (required)
     * @return CategoryDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CategoryDTO updateCategory(CategoryDTO body, UUID mailbox, UUID id) throws ApiException {
        ApiResponse<CategoryDTO> resp = updateCategoryWithHttpInfo(body, mailbox, id);
        return resp.getData();
    }

    /**
     * Update the category in DB
     * 
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param id Category Id (required)
     * @return ApiResponse&lt;CategoryDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CategoryDTO> updateCategoryWithHttpInfo(CategoryDTO body, UUID mailbox, UUID id) throws ApiException {
        com.squareup.okhttp.Call call = updateCategoryValidateBeforeCall(body, mailbox, id, null, null);
        Type localVarReturnType = new TypeToken<CategoryDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update the category in DB (asynchronously)
     * 
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param id Category Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCategoryAsync(CategoryDTO body, UUID mailbox, UUID id, final ApiCallback<CategoryDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateCategoryValidateBeforeCall(body, mailbox, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CategoryDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
