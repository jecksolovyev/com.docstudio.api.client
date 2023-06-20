/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R82.8
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


import com.docstudio.client.model.CreateEnvelopeCallbackDTO;
import com.docstudio.client.model.EnvelopeCallbackDTO;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnvelopeCallbackControllerApi {
    private ApiClient apiClient;

    public EnvelopeCallbackControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EnvelopeCallbackControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createCallback
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCallbackCall(CreateEnvelopeCallbackDTO body, UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v1/envelope/callback/add";

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createCallbackValidateBeforeCall(CreateEnvelopeCallbackDTO body, UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createCallback(Async)");
        }
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling createCallback(Async)");
        }
        
        com.squareup.okhttp.Call call = createCallbackCall(body, mailbox, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add new callback
     * 
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return EnvelopeCallbackDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EnvelopeCallbackDTO createCallback(CreateEnvelopeCallbackDTO body, UUID mailbox) throws ApiException {
        ApiResponse<EnvelopeCallbackDTO> resp = createCallbackWithHttpInfo(body, mailbox);
        return resp.getData();
    }

    /**
     * Add new callback
     * 
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;EnvelopeCallbackDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EnvelopeCallbackDTO> createCallbackWithHttpInfo(CreateEnvelopeCallbackDTO body, UUID mailbox) throws ApiException {
        com.squareup.okhttp.Call call = createCallbackValidateBeforeCall(body, mailbox, null, null);
        Type localVarReturnType = new TypeToken<EnvelopeCallbackDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add new callback (asynchronously)
     * 
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createCallbackAsync(CreateEnvelopeCallbackDTO body, UUID mailbox, final ApiCallback<EnvelopeCallbackDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createCallbackValidateBeforeCall(body, mailbox, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EnvelopeCallbackDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listCallbacks
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCallbacksCall(UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/envelope/callback/list";

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listCallbacksValidateBeforeCall(UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling listCallbacks(Async)");
        }
        
        com.squareup.okhttp.Call call = listCallbacksCall(mailbox, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List callbacks
     * 
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return List&lt;EnvelopeCallbackDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<EnvelopeCallbackDTO> listCallbacks(UUID mailbox) throws ApiException {
        ApiResponse<List<EnvelopeCallbackDTO>> resp = listCallbacksWithHttpInfo(mailbox);
        return resp.getData();
    }

    /**
     * List callbacks
     * 
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;List&lt;EnvelopeCallbackDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<EnvelopeCallbackDTO>> listCallbacksWithHttpInfo(UUID mailbox) throws ApiException {
        com.squareup.okhttp.Call call = listCallbacksValidateBeforeCall(mailbox, null, null);
        Type localVarReturnType = new TypeToken<List<EnvelopeCallbackDTO>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List callbacks (asynchronously)
     * 
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listCallbacksAsync(UUID mailbox, final ApiCallback<List<EnvelopeCallbackDTO>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listCallbacksValidateBeforeCall(mailbox, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<EnvelopeCallbackDTO>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for removeCallback
     * @param callbackUuid Callback id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removeCallbackCall(UUID callbackUuid, UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/envelope/callback/{callbackUuid}/remove"
            .replaceAll("\\{" + "callbackUuid" + "\\}", apiClient.escapeString(callbackUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call removeCallbackValidateBeforeCall(UUID callbackUuid, UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'callbackUuid' is set
        if (callbackUuid == null) {
            throw new ApiException("Missing the required parameter 'callbackUuid' when calling removeCallback(Async)");
        }
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling removeCallback(Async)");
        }
        
        com.squareup.okhttp.Call call = removeCallbackCall(callbackUuid, mailbox, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete callback
     * 
     * @param callbackUuid Callback id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
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
     */
    public ApiResponse<Void> removeCallbackWithHttpInfo(UUID callbackUuid, UUID mailbox) throws ApiException {
        com.squareup.okhttp.Call call = removeCallbackValidateBeforeCall(callbackUuid, mailbox, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete callback (asynchronously)
     * 
     * @param callbackUuid Callback id (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removeCallbackAsync(UUID callbackUuid, UUID mailbox, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = removeCallbackValidateBeforeCall(callbackUuid, mailbox, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
