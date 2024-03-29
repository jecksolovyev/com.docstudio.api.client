/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R86.33
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


import com.docstudio.client.model.ConfirmUploadDTO;
import java.io.File;
import com.docstudio.client.model.ImportTaskDTO;
import com.docstudio.client.model.SingleUuidDTO;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UploadControllerApi {
    private ApiClient apiClient;

    public UploadControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UploadControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for cancel
     * @param uploadUuid  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelCall(UUID uploadUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/upload/{uploadUuid}"
            .replaceAll("\\{" + "uploadUuid" + "\\}", apiClient.escapeString(uploadUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cancelValidateBeforeCall(UUID uploadUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uploadUuid' is set
        if (uploadUuid == null) {
            throw new ApiException("Missing the required parameter 'uploadUuid' when calling cancel(Async)");
        }
        
        com.squareup.okhttp.Call call = cancelCall(uploadUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Cancel import process
     * 
     * @param uploadUuid  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void cancel(UUID uploadUuid) throws ApiException {
        cancelWithHttpInfo(uploadUuid);
    }

    /**
     * Cancel import process
     * 
     * @param uploadUuid  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> cancelWithHttpInfo(UUID uploadUuid) throws ApiException {
        com.squareup.okhttp.Call call = cancelValidateBeforeCall(uploadUuid, null, null);
        return apiClient.execute(call);
    }

    /**
     * Cancel import process (asynchronously)
     * 
     * @param uploadUuid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelAsync(UUID uploadUuid, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cancelValidateBeforeCall(uploadUuid, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for confirm
     * @param body  (required)
     * @param uploadUuid  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call confirmCall(ConfirmUploadDTO body, UUID uploadUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v1/upload/{uploadUuid}/confirm"
            .replaceAll("\\{" + "uploadUuid" + "\\}", apiClient.escapeString(uploadUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call confirmValidateBeforeCall(ConfirmUploadDTO body, UUID uploadUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling confirm(Async)");
        }
        // verify the required parameter 'uploadUuid' is set
        if (uploadUuid == null) {
            throw new ApiException("Missing the required parameter 'uploadUuid' when calling confirm(Async)");
        }
        
        com.squareup.okhttp.Call call = confirmCall(body, uploadUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Approve import process
     * 
     * @param body  (required)
     * @param uploadUuid  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void confirm(ConfirmUploadDTO body, UUID uploadUuid) throws ApiException {
        confirmWithHttpInfo(body, uploadUuid);
    }

    /**
     * Approve import process
     * 
     * @param body  (required)
     * @param uploadUuid  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> confirmWithHttpInfo(ConfirmUploadDTO body, UUID uploadUuid) throws ApiException {
        com.squareup.okhttp.Call call = confirmValidateBeforeCall(body, uploadUuid, null, null);
        return apiClient.execute(call);
    }

    /**
     * Approve import process (asynchronously)
     * 
     * @param body  (required)
     * @param uploadUuid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call confirmAsync(ConfirmUploadDTO body, UUID uploadUuid, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = confirmValidateBeforeCall(body, uploadUuid, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getImportTask
     * @param uploadUuid  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getImportTaskCall(UUID uploadUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/upload/{uploadUuid}"
            .replaceAll("\\{" + "uploadUuid" + "\\}", apiClient.escapeString(uploadUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getImportTaskValidateBeforeCall(UUID uploadUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uploadUuid' is set
        if (uploadUuid == null) {
            throw new ApiException("Missing the required parameter 'uploadUuid' when calling getImportTask(Async)");
        }
        
        com.squareup.okhttp.Call call = getImportTaskCall(uploadUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get import processing task
     * 
     * @param uploadUuid  (required)
     * @return ImportTaskDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImportTaskDTO getImportTask(UUID uploadUuid) throws ApiException {
        ApiResponse<ImportTaskDTO> resp = getImportTaskWithHttpInfo(uploadUuid);
        return resp.getData();
    }

    /**
     * Get import processing task
     * 
     * @param uploadUuid  (required)
     * @return ApiResponse&lt;ImportTaskDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImportTaskDTO> getImportTaskWithHttpInfo(UUID uploadUuid) throws ApiException {
        com.squareup.okhttp.Call call = getImportTaskValidateBeforeCall(uploadUuid, null, null);
        Type localVarReturnType = new TypeToken<ImportTaskDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get import processing task (asynchronously)
     * 
     * @param uploadUuid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImportTaskAsync(UUID uploadUuid, final ApiCallback<ImportTaskDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getImportTaskValidateBeforeCall(uploadUuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImportTaskDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for uploadDictionary
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param dictionaryUuid  (required)
     * @param file  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadDictionaryCall(UUID mailbox, UUID dictionaryUuid, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/upload/dictionary/{dictionaryUuid}"
            .replaceAll("\\{" + "dictionaryUuid" + "\\}", apiClient.escapeString(dictionaryUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (mailbox != null)
        localVarHeaderParams.put("Mailbox", apiClient.parameterToString(mailbox));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null)
        localVarFormParams.put("file", file);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call uploadDictionaryValidateBeforeCall(UUID mailbox, UUID dictionaryUuid, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling uploadDictionary(Async)");
        }
        // verify the required parameter 'dictionaryUuid' is set
        if (dictionaryUuid == null) {
            throw new ApiException("Missing the required parameter 'dictionaryUuid' when calling uploadDictionary(Async)");
        }
        
        com.squareup.okhttp.Call call = uploadDictionaryCall(mailbox, dictionaryUuid, file, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Upload dictionary file for importing
     * 
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param dictionaryUuid  (required)
     * @param file  (optional)
     * @return SingleUuidDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SingleUuidDTO uploadDictionary(UUID mailbox, UUID dictionaryUuid, File file) throws ApiException {
        ApiResponse<SingleUuidDTO> resp = uploadDictionaryWithHttpInfo(mailbox, dictionaryUuid, file);
        return resp.getData();
    }

    /**
     * Upload dictionary file for importing
     * 
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param dictionaryUuid  (required)
     * @param file  (optional)
     * @return ApiResponse&lt;SingleUuidDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SingleUuidDTO> uploadDictionaryWithHttpInfo(UUID mailbox, UUID dictionaryUuid, File file) throws ApiException {
        com.squareup.okhttp.Call call = uploadDictionaryValidateBeforeCall(mailbox, dictionaryUuid, file, null, null);
        Type localVarReturnType = new TypeToken<SingleUuidDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload dictionary file for importing (asynchronously)
     * 
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param dictionaryUuid  (required)
     * @param file  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadDictionaryAsync(UUID mailbox, UUID dictionaryUuid, File file, final ApiCallback<SingleUuidDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = uploadDictionaryValidateBeforeCall(mailbox, dictionaryUuid, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SingleUuidDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
