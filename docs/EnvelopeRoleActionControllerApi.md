# EnvelopeRoleActionControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approve**](EnvelopeRoleActionControllerApi.md#approve) | **POST** /api/v1/envelope/approve | Approve envelope |
| [**fill**](EnvelopeRoleActionControllerApi.md#fill) | **PUT** /api/v1/envelope/fill | Fill envelope |
| [**generateStamp**](EnvelopeRoleActionControllerApi.md#generateStamp) | **POST** /api/v1/envelope/generate-stamp | Generate stamp by certificate |
| [**getDocumentFileForSign**](EnvelopeRoleActionControllerApi.md#getDocumentFileForSign) | **GET** /api/v1/envelope/{id}/for-sign-file | Get BINARY or XML for signing |
| [**getDocumentsForSign**](EnvelopeRoleActionControllerApi.md#getDocumentsForSign) | **POST** /api/v1/envelope/{id}/for-sign | BINARYs and XMLs for signing |
| [**getMassSigningReport**](EnvelopeRoleActionControllerApi.md#getMassSigningReport) | **GET** /api/v1/envelope/signing-report/{sessionId} | Get mass signing report |
| [**signEnvelope**](EnvelopeRoleActionControllerApi.md#signEnvelope) | **PUT** /api/v1/envelope/{id}/sign | Sign envelope documents |
| [**signSES**](EnvelopeRoleActionControllerApi.md#signSES) | **POST** /api/v1/envelope/{id}/sign-ses | Sign envelope with SES |


<a id="approve"></a>
# **approve**
> SingleUuidDTO approve(mailbox, bulkEnvelopeActionDTO)

Approve envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeRoleActionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeRoleActionControllerApi apiInstance = new EnvelopeRoleActionControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    BulkEnvelopeActionDTO bulkEnvelopeActionDTO = new BulkEnvelopeActionDTO(); // BulkEnvelopeActionDTO | 
    try {
      SingleUuidDTO result = apiInstance.approve(mailbox, bulkEnvelopeActionDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeRoleActionControllerApi#approve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **bulkEnvelopeActionDTO** | [**BulkEnvelopeActionDTO**](BulkEnvelopeActionDTO.md)|  | |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fill"></a>
# **fill**
> fill(mailbox, envDTO)

Fill envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeRoleActionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeRoleActionControllerApi apiInstance = new EnvelopeRoleActionControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvDTO envDTO = new EnvDTO(); // EnvDTO | 
    try {
      apiInstance.fill(mailbox, envDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeRoleActionControllerApi#fill");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **envDTO** | [**EnvDTO**](EnvDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="generateStamp"></a>
# **generateStamp**
> File generateStamp(mailbox, stampRequestDTO)

Generate stamp by certificate

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeRoleActionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    EnvelopeRoleActionControllerApi apiInstance = new EnvelopeRoleActionControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    StampRequestDTO stampRequestDTO = new StampRequestDTO(); // StampRequestDTO | 
    try {
      File result = apiInstance.generateStamp(mailbox, stampRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeRoleActionControllerApi#generateStamp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **stampRequestDTO** | [**StampRequestDTO**](StampRequestDTO.md)|  | |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDocumentFileForSign"></a>
# **getDocumentFileForSign**
> File getDocumentFileForSign(id, documentId, mailbox, xml)

Get BINARY or XML for signing

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeRoleActionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    EnvelopeRoleActionControllerApi apiInstance = new EnvelopeRoleActionControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    String documentId = "documentId_example"; // String | Document ID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Boolean xml = true; // Boolean | Is XML?
    try {
      File result = apiInstance.getDocumentFileForSign(id, documentId, mailbox, xml);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeRoleActionControllerApi#getDocumentFileForSign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Envelope UUID | |
| **documentId** | **String**| Document ID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **xml** | **Boolean**| Is XML? | [optional] |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDocumentsForSign"></a>
# **getDocumentsForSign**
> List&lt;DocumentForSigningDTO&gt; getDocumentsForSign(id, mailbox, documentsForSignRequestDTO, sessionId, wait, forceGost)

BINARYs and XMLs for signing

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeRoleActionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    EnvelopeRoleActionControllerApi apiInstance = new EnvelopeRoleActionControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    DocumentsForSignRequestDTO documentsForSignRequestDTO = new DocumentsForSignRequestDTO(); // DocumentsForSignRequestDTO | 
    UUID sessionId = UUID.randomUUID(); // UUID | Mass signing session UUID
    Boolean wait = true; // Boolean | Wait for a file instead of 425 error
    Boolean forceGost = true; // Boolean | 
    try {
      List<DocumentForSigningDTO> result = apiInstance.getDocumentsForSign(id, mailbox, documentsForSignRequestDTO, sessionId, wait, forceGost);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeRoleActionControllerApi#getDocumentsForSign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Envelope UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **documentsForSignRequestDTO** | [**DocumentsForSignRequestDTO**](DocumentsForSignRequestDTO.md)|  | |
| **sessionId** | **UUID**| Mass signing session UUID | [optional] |
| **wait** | **Boolean**| Wait for a file instead of 425 error | [optional] |
| **forceGost** | **Boolean**|  | [optional] |

### Return type

[**List&lt;DocumentForSigningDTO&gt;**](DocumentForSigningDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMassSigningReport"></a>
# **getMassSigningReport**
> File getMassSigningReport(sessionId, mailbox)

Get mass signing report

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeRoleActionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeRoleActionControllerApi apiInstance = new EnvelopeRoleActionControllerApi(defaultClient);
    UUID sessionId = UUID.randomUUID(); // UUID | Mass signing session UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      File result = apiInstance.getMassSigningReport(sessionId, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeRoleActionControllerApi#getMassSigningReport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **UUID**| Mass signing session UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="signEnvelope"></a>
# **signEnvelope**
> signEnvelope(id, mailbox, envelopeDocumentSignaturesDTO, sessionId)

Sign envelope documents

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeRoleActionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    EnvelopeRoleActionControllerApi apiInstance = new EnvelopeRoleActionControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope to update
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    List<EnvelopeDocumentSignaturesDTO> envelopeDocumentSignaturesDTO = Arrays.asList(); // List<EnvelopeDocumentSignaturesDTO> | 
    UUID sessionId = UUID.randomUUID(); // UUID | Mass signing session UUID
    try {
      apiInstance.signEnvelope(id, mailbox, envelopeDocumentSignaturesDTO, sessionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeRoleActionControllerApi#signEnvelope");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Envelope to update | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **envelopeDocumentSignaturesDTO** | [**List&lt;EnvelopeDocumentSignaturesDTO&gt;**](EnvelopeDocumentSignaturesDTO.md)|  | |
| **sessionId** | **UUID**| Mass signing session UUID | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="signSES"></a>
# **signSES**
> signSES(id, mailbox, body, sessionId)

Sign envelope with SES

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeRoleActionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeRoleActionControllerApi apiInstance = new EnvelopeRoleActionControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope to fill
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    String body = "body_example"; // String | 
    UUID sessionId = UUID.randomUUID(); // UUID | Mass signing session UUID
    try {
      apiInstance.signSES(id, mailbox, body, sessionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeRoleActionControllerApi#signSES");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Envelope to fill | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **body** | **String**|  | |
| **sessionId** | **UUID**| Mass signing session UUID | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

