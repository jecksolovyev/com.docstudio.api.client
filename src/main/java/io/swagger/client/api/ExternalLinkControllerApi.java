/*
 * Docstudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R74.21
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ExternalLinkRequestDTO;
import io.swagger.client.model.ExternalLinkResponseDTO;
import io.swagger.client.model.ExternalLinkShortResponseDTO;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExternalLinkControllerApi {
    private ApiClient apiClient;

    public ExternalLinkControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ExternalLinkControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createExternalLink
     * @param body  (required)
     * @param accountUuid Account UUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createExternalLinkCall(ExternalLinkRequestDTO body, UUID accountUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v1/account/{accountUuid}/external-link"
            .replaceAll("\\{" + "accountUuid" + "\\}", apiClient.escapeString(accountUuid.toString()));

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
    private com.squareup.okhttp.Call createExternalLinkValidateBeforeCall(ExternalLinkRequestDTO body, UUID accountUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createExternalLink(Async)");
        }
        // verify the required parameter 'accountUuid' is set
        if (accountUuid == null) {
            throw new ApiException("Missing the required parameter 'accountUuid' when calling createExternalLink(Async)");
        }
        
        com.squareup.okhttp.Call call = createExternalLinkCall(body, accountUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create external link
     * 
     * @param body  (required)
     * @param accountUuid Account UUID (required)
     * @return ExternalLinkResponseDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExternalLinkResponseDTO createExternalLink(ExternalLinkRequestDTO body, UUID accountUuid) throws ApiException {
        ApiResponse<ExternalLinkResponseDTO> resp = createExternalLinkWithHttpInfo(body, accountUuid);
        return resp.getData();
    }

    /**
     * Create external link
     * 
     * @param body  (required)
     * @param accountUuid Account UUID (required)
     * @return ApiResponse&lt;ExternalLinkResponseDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExternalLinkResponseDTO> createExternalLinkWithHttpInfo(ExternalLinkRequestDTO body, UUID accountUuid) throws ApiException {
        com.squareup.okhttp.Call call = createExternalLinkValidateBeforeCall(body, accountUuid, null, null);
        Type localVarReturnType = new TypeToken<ExternalLinkResponseDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create external link (asynchronously)
     * 
     * @param body  (required)
     * @param accountUuid Account UUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createExternalLinkAsync(ExternalLinkRequestDTO body, UUID accountUuid, final ApiCallback<ExternalLinkResponseDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createExternalLinkValidateBeforeCall(body, accountUuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExternalLinkResponseDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteExternalLink
     * @param accountUuid Account UUID (required)
     * @param linkUuid Link UUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteExternalLinkCall(UUID accountUuid, UUID linkUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/account/{accountUuid}/external-link/{linkUuid}"
            .replaceAll("\\{" + "accountUuid" + "\\}", apiClient.escapeString(accountUuid.toString()))
            .replaceAll("\\{" + "linkUuid" + "\\}", apiClient.escapeString(linkUuid.toString()));

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
    private com.squareup.okhttp.Call deleteExternalLinkValidateBeforeCall(UUID accountUuid, UUID linkUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accountUuid' is set
        if (accountUuid == null) {
            throw new ApiException("Missing the required parameter 'accountUuid' when calling deleteExternalLink(Async)");
        }
        // verify the required parameter 'linkUuid' is set
        if (linkUuid == null) {
            throw new ApiException("Missing the required parameter 'linkUuid' when calling deleteExternalLink(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteExternalLinkCall(accountUuid, linkUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete external link
     * 
     * @param accountUuid Account UUID (required)
     * @param linkUuid Link UUID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteExternalLink(UUID accountUuid, UUID linkUuid) throws ApiException {
        deleteExternalLinkWithHttpInfo(accountUuid, linkUuid);
    }

    /**
     * Delete external link
     * 
     * @param accountUuid Account UUID (required)
     * @param linkUuid Link UUID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteExternalLinkWithHttpInfo(UUID accountUuid, UUID linkUuid) throws ApiException {
        com.squareup.okhttp.Call call = deleteExternalLinkValidateBeforeCall(accountUuid, linkUuid, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete external link (asynchronously)
     * 
     * @param accountUuid Account UUID (required)
     * @param linkUuid Link UUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteExternalLinkAsync(UUID accountUuid, UUID linkUuid, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteExternalLinkValidateBeforeCall(accountUuid, linkUuid, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAccountExternalLinks
     * @param accountUuid Account UUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAccountExternalLinksCall(UUID accountUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/account/{accountUuid}/external-link"
            .replaceAll("\\{" + "accountUuid" + "\\}", apiClient.escapeString(accountUuid.toString()));

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
    private com.squareup.okhttp.Call getAccountExternalLinksValidateBeforeCall(UUID accountUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accountUuid' is set
        if (accountUuid == null) {
            throw new ApiException("Missing the required parameter 'accountUuid' when calling getAccountExternalLinks(Async)");
        }
        
        com.squareup.okhttp.Call call = getAccountExternalLinksCall(accountUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get account external links
     * 
     * @param accountUuid Account UUID (required)
     * @return List&lt;ExternalLinkResponseDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ExternalLinkResponseDTO> getAccountExternalLinks(UUID accountUuid) throws ApiException {
        ApiResponse<List<ExternalLinkResponseDTO>> resp = getAccountExternalLinksWithHttpInfo(accountUuid);
        return resp.getData();
    }

    /**
     * Get account external links
     * 
     * @param accountUuid Account UUID (required)
     * @return ApiResponse&lt;List&lt;ExternalLinkResponseDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ExternalLinkResponseDTO>> getAccountExternalLinksWithHttpInfo(UUID accountUuid) throws ApiException {
        com.squareup.okhttp.Call call = getAccountExternalLinksValidateBeforeCall(accountUuid, null, null);
        Type localVarReturnType = new TypeToken<List<ExternalLinkResponseDTO>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get account external links (asynchronously)
     * 
     * @param accountUuid Account UUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountExternalLinksAsync(UUID accountUuid, final ApiCallback<List<ExternalLinkResponseDTO>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAccountExternalLinksValidateBeforeCall(accountUuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ExternalLinkResponseDTO>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMailboxList
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMailboxListCall(UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/external-link";

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
    private com.squareup.okhttp.Call getMailboxListValidateBeforeCall(UUID mailbox, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new ApiException("Missing the required parameter 'mailbox' when calling getMailboxList(Async)");
        }
        
        com.squareup.okhttp.Call call = getMailboxListCall(mailbox, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get mailbox visible link list
     * 
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return List&lt;ExternalLinkShortResponseDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ExternalLinkShortResponseDTO> getMailboxList(UUID mailbox) throws ApiException {
        ApiResponse<List<ExternalLinkShortResponseDTO>> resp = getMailboxListWithHttpInfo(mailbox);
        return resp.getData();
    }

    /**
     * Get mailbox visible link list
     * 
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @return ApiResponse&lt;List&lt;ExternalLinkShortResponseDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ExternalLinkShortResponseDTO>> getMailboxListWithHttpInfo(UUID mailbox) throws ApiException {
        com.squareup.okhttp.Call call = getMailboxListValidateBeforeCall(mailbox, null, null);
        Type localVarReturnType = new TypeToken<List<ExternalLinkShortResponseDTO>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get mailbox visible link list (asynchronously)
     * 
     * @param mailbox Mailbox context, HTTP Header with current mailbox UUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMailboxListAsync(UUID mailbox, final ApiCallback<List<ExternalLinkShortResponseDTO>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMailboxListValidateBeforeCall(mailbox, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ExternalLinkShortResponseDTO>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateExternalLink
     * @param body  (required)
     * @param accountUuid Account UUID (required)
     * @param linkUuid Link UUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateExternalLinkCall(ExternalLinkRequestDTO body, UUID accountUuid, UUID linkUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v1/account/{accountUuid}/external-link/{linkUuid}"
            .replaceAll("\\{" + "accountUuid" + "\\}", apiClient.escapeString(accountUuid.toString()))
            .replaceAll("\\{" + "linkUuid" + "\\}", apiClient.escapeString(linkUuid.toString()));

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
    private com.squareup.okhttp.Call updateExternalLinkValidateBeforeCall(ExternalLinkRequestDTO body, UUID accountUuid, UUID linkUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateExternalLink(Async)");
        }
        // verify the required parameter 'accountUuid' is set
        if (accountUuid == null) {
            throw new ApiException("Missing the required parameter 'accountUuid' when calling updateExternalLink(Async)");
        }
        // verify the required parameter 'linkUuid' is set
        if (linkUuid == null) {
            throw new ApiException("Missing the required parameter 'linkUuid' when calling updateExternalLink(Async)");
        }
        
        com.squareup.okhttp.Call call = updateExternalLinkCall(body, accountUuid, linkUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update external link
     * 
     * @param body  (required)
     * @param accountUuid Account UUID (required)
     * @param linkUuid Link UUID (required)
     * @return ExternalLinkResponseDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExternalLinkResponseDTO updateExternalLink(ExternalLinkRequestDTO body, UUID accountUuid, UUID linkUuid) throws ApiException {
        ApiResponse<ExternalLinkResponseDTO> resp = updateExternalLinkWithHttpInfo(body, accountUuid, linkUuid);
        return resp.getData();
    }

    /**
     * Update external link
     * 
     * @param body  (required)
     * @param accountUuid Account UUID (required)
     * @param linkUuid Link UUID (required)
     * @return ApiResponse&lt;ExternalLinkResponseDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExternalLinkResponseDTO> updateExternalLinkWithHttpInfo(ExternalLinkRequestDTO body, UUID accountUuid, UUID linkUuid) throws ApiException {
        com.squareup.okhttp.Call call = updateExternalLinkValidateBeforeCall(body, accountUuid, linkUuid, null, null);
        Type localVarReturnType = new TypeToken<ExternalLinkResponseDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update external link (asynchronously)
     * 
     * @param body  (required)
     * @param accountUuid Account UUID (required)
     * @param linkUuid Link UUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateExternalLinkAsync(ExternalLinkRequestDTO body, UUID accountUuid, UUID linkUuid, final ApiCallback<ExternalLinkResponseDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateExternalLinkValidateBeforeCall(body, accountUuid, linkUuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExternalLinkResponseDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
