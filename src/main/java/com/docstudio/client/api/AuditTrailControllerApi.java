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


import com.docstudio.client.model.AuditTrailDTO;
import com.docstudio.client.model.AuditTrailInfoRecordDTO;
import java.io.File;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuditTrailControllerApi {
    private ApiClient apiClient;

    public AuditTrailControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuditTrailControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addAuditTrailRecord
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param uuid Envelope UUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addAuditTrailRecordCall(AuditTrailInfoRecordDTO body, UUID mailbox, UUID uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v1/audittrail/envelope/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
    private com.squareup.okhttp.Call addAuditTrailRecordValidateBeforeCall(AuditTrailInfoRecordDTO body, UUID mailbox, UUID uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addAuditTrailRecord(Async)");
        }
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling addAuditTrailRecord(Async)");
        }
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling addAuditTrailRecord(Async)");
        }
        
        com.squareup.okhttp.Call call = addAuditTrailRecordCall(body, mailbox, uuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param uuid Envelope UUID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void addAuditTrailRecord(AuditTrailInfoRecordDTO body, UUID mailbox, UUID uuid) throws ApiException {
        addAuditTrailRecordWithHttpInfo(body, mailbox, uuid);
    }

    /**
     * 
     * 
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param uuid Envelope UUID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> addAuditTrailRecordWithHttpInfo(AuditTrailInfoRecordDTO body, UUID mailbox, UUID uuid) throws ApiException {
        com.squareup.okhttp.Call call = addAuditTrailRecordValidateBeforeCall(body, mailbox, uuid, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * 
     * @param body  (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param uuid Envelope UUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addAuditTrailRecordAsync(AuditTrailInfoRecordDTO body, UUID mailbox, UUID uuid, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addAuditTrailRecordValidateBeforeCall(body, mailbox, uuid, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for generateAuditTrailPdf
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call generateAuditTrailPdfCall(UUID uuid, UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/audittrail/pdf/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (mailbox != null)
        localVarHeaderParams.put("Mailbox", apiClient.parameterToString(mailbox));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
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
    private com.squareup.okhttp.Call generateAuditTrailPdfValidateBeforeCall(UUID uuid, UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling generateAuditTrailPdf(Async)");
        }
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling generateAuditTrailPdf(Async)");
        }
        
        com.squareup.okhttp.Call call = generateAuditTrailPdfCall(uuid, mailbox, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Download audit trail pdf for envelope
     * 
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File generateAuditTrailPdf(UUID uuid, UUID mailbox) throws ApiException {
        ApiResponse<File> resp = generateAuditTrailPdfWithHttpInfo(uuid, mailbox);
        return resp.getData();
    }

    /**
     * Download audit trail pdf for envelope
     * 
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> generateAuditTrailPdfWithHttpInfo(UUID uuid, UUID mailbox) throws ApiException {
        com.squareup.okhttp.Call call = generateAuditTrailPdfValidateBeforeCall(uuid, mailbox, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Download audit trail pdf for envelope (asynchronously)
     * 
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call generateAuditTrailPdfAsync(UUID uuid, UUID mailbox, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = generateAuditTrailPdfValidateBeforeCall(uuid, mailbox, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAuditTrailByEnvelope
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAuditTrailByEnvelopeCall(UUID uuid, UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/audittrail/envelope/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
    private com.squareup.okhttp.Call getAuditTrailByEnvelopeValidateBeforeCall(UUID uuid, UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getAuditTrailByEnvelope(Async)");
        }
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling getAuditTrailByEnvelope(Async)");
        }
        
        com.squareup.okhttp.Call call = getAuditTrailByEnvelopeCall(uuid, mailbox, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return List&lt;AuditTrailDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AuditTrailDTO> getAuditTrailByEnvelope(UUID uuid, UUID mailbox) throws ApiException {
        ApiResponse<List<AuditTrailDTO>> resp = getAuditTrailByEnvelopeWithHttpInfo(uuid, mailbox);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;List&lt;AuditTrailDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AuditTrailDTO>> getAuditTrailByEnvelopeWithHttpInfo(UUID uuid, UUID mailbox) throws ApiException {
        com.squareup.okhttp.Call call = getAuditTrailByEnvelopeValidateBeforeCall(uuid, mailbox, null, null);
        Type localVarReturnType = new TypeToken<List<AuditTrailDTO>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param uuid Envelope UUID (required)
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAuditTrailByEnvelopeAsync(UUID uuid, UUID mailbox, final ApiCallback<List<AuditTrailDTO>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAuditTrailByEnvelopeValidateBeforeCall(uuid, mailbox, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AuditTrailDTO>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
