# EnvelopeDocumentControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cloneAttachment**](EnvelopeDocumentControllerApi.md#cloneAttachment) | **POST** /api/v1/envelope/clone-attachment | Clone an existing attachment |
| [**createAttachment**](EnvelopeDocumentControllerApi.md#createAttachment) | **POST** /api/v1/envelope/attachment | Create/upload new attachment |
| [**createPdfAttachment**](EnvelopeDocumentControllerApi.md#createPdfAttachment) | **POST** /api/v1/envelope/pdf-attachment | Create/upload new PDF attachment |
| [**downloadEnvelopeAttachment**](EnvelopeDocumentControllerApi.md#downloadEnvelopeAttachment) | **GET** /api/v1/envelope/attachment | Download attachment with specific type or raw |
| [**downloadFinalPdf**](EnvelopeDocumentControllerApi.md#downloadFinalPdf) | **GET** /api/v1/envelope/{id}/download-final-pdf | Download final PDF |
| [**downloadSharedAttachment**](EnvelopeDocumentControllerApi.md#downloadSharedAttachment) | **GET** /api/v1/envelope/shared-attachment | Download shared attachment for specific provider |
| [**getArchiveInfo**](EnvelopeDocumentControllerApi.md#getArchiveInfo) | **GET** /api/v1/envelope/attachment/archive-info | Get attachment archive info (p7s, asice, pdf) |
| [**getAttachmentPageSizes**](EnvelopeDocumentControllerApi.md#getAttachmentPageSizes) | **GET** /api/v1/envelope/attachment/page-sizes | Get attachment page sizes |
| [**getDocumentPrintVersion**](EnvelopeDocumentControllerApi.md#getDocumentPrintVersion) | **GET** /api/v1/envelope/{id}/for-print | Get document PDF for printing |
| [**getEnvelopeSharedZip**](EnvelopeDocumentControllerApi.md#getEnvelopeSharedZip) | **GET** /api/v1/envelope/download-shared | Get shared zip archive |
| [**getEnvelopeZip**](EnvelopeDocumentControllerApi.md#getEnvelopeZip) | **GET** /api/v1/envelope/{id}/zip | Get envelope or document zip archive |
| [**shareEnvelopesByEmail**](EnvelopeDocumentControllerApi.md#shareEnvelopesByEmail) | **POST** /api/v1/envelope/share-archive | Share envelopes by email |


<a id="cloneAttachment"></a>
# **cloneAttachment**
> UploadedAttachmentDTO cloneAttachment(attachmentUuid, mailbox)

Clone an existing attachment

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeDocumentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeDocumentControllerApi apiInstance = new EnvelopeDocumentControllerApi(defaultClient);
    UUID attachmentUuid = UUID.randomUUID(); // UUID | 
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      UploadedAttachmentDTO result = apiInstance.cloneAttachment(attachmentUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeDocumentControllerApi#cloneAttachment");
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
| **attachmentUuid** | **UUID**|  | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**UploadedAttachmentDTO**](UploadedAttachmentDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createAttachment"></a>
# **createAttachment**
> UploadedAttachmentDTO createAttachment(_file, type, mailbox)

Create/upload new attachment

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeDocumentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeDocumentControllerApi apiInstance = new EnvelopeDocumentControllerApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    String type = "all"; // String | 
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      UploadedAttachmentDTO result = apiInstance.createAttachment(_file, type, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeDocumentControllerApi#createAttachment");
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
| **_file** | **File**|  | |
| **type** | **String**|  | [optional] [enum: all, document, file, image, archive] |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | [optional] |

### Return type

[**UploadedAttachmentDTO**](UploadedAttachmentDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createPdfAttachment"></a>
# **createPdfAttachment**
> UploadedAttachmentDTO createPdfAttachment(_file, action, mailbox)

Create/upload new PDF attachment

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeDocumentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeDocumentControllerApi apiInstance = new EnvelopeDocumentControllerApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    String action = "DELETE"; // String | Action for fields inside the PDF file
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      UploadedAttachmentDTO result = apiInstance.createPdfAttachment(_file, action, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeDocumentControllerApi#createPdfAttachment");
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
| **_file** | **File**|  | |
| **action** | **String**| Action for fields inside the PDF file | [optional] [enum: DELETE, KEEP, KEEP_SAFE] |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | [optional] |

### Return type

[**UploadedAttachmentDTO**](UploadedAttachmentDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="downloadEnvelopeAttachment"></a>
# **downloadEnvelopeAttachment**
> File downloadEnvelopeAttachment(accept, attachmentUuid, mailbox, envelopeUuid)

Download attachment with specific type or raw

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeDocumentControllerApi;

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

    EnvelopeDocumentControllerApi apiInstance = new EnvelopeDocumentControllerApi(defaultClient);
    String accept = "accept_example"; // String | 
    UUID attachmentUuid = UUID.randomUUID(); // UUID | Attachment UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UUID envelopeUuid = UUID.randomUUID(); // UUID | Envelope UUID
    try {
      File result = apiInstance.downloadEnvelopeAttachment(accept, attachmentUuid, mailbox, envelopeUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeDocumentControllerApi#downloadEnvelopeAttachment");
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
| **accept** | **String**|  | |
| **attachmentUuid** | **UUID**| Attachment UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **envelopeUuid** | **UUID**| Envelope UUID | [optional] |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="downloadFinalPdf"></a>
# **downloadFinalPdf**
> File downloadFinalPdf(id, documentId, mailbox, wait)

Download final PDF

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeDocumentControllerApi;

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

    EnvelopeDocumentControllerApi apiInstance = new EnvelopeDocumentControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    String documentId = "documentId_example"; // String | Document ID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Boolean wait = true; // Boolean | Wait for a file instead of 425 error
    try {
      File result = apiInstance.downloadFinalPdf(id, documentId, mailbox, wait);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeDocumentControllerApi#downloadFinalPdf");
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
| **wait** | **Boolean**| Wait for a file instead of 425 error | [optional] |

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

<a id="downloadSharedAttachment"></a>
# **downloadSharedAttachment**
> File downloadSharedAttachment(provider, attachmentUuid)

Download shared attachment for specific provider

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeDocumentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeDocumentControllerApi apiInstance = new EnvelopeDocumentControllerApi(defaultClient);
    String provider = "provider_example"; // String | Sharing provider name
    UUID attachmentUuid = UUID.randomUUID(); // UUID | Attachment UUID
    try {
      File result = apiInstance.downloadSharedAttachment(provider, attachmentUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeDocumentControllerApi#downloadSharedAttachment");
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
| **provider** | **String**| Sharing provider name | |
| **attachmentUuid** | **UUID**| Attachment UUID | |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getArchiveInfo"></a>
# **getArchiveInfo**
> ArchiveAttachmentInfo getArchiveInfo(attachmentId, mailbox, envelopeId, convert2Pdf)

Get attachment archive info (p7s, asice, pdf)

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeDocumentControllerApi;

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

    EnvelopeDocumentControllerApi apiInstance = new EnvelopeDocumentControllerApi(defaultClient);
    UUID attachmentId = UUID.randomUUID(); // UUID | Attachment UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UUID envelopeId = UUID.randomUUID(); // UUID | Envelope UUID
    Boolean convert2Pdf = true; // Boolean | Convert to PDF
    try {
      ArchiveAttachmentInfo result = apiInstance.getArchiveInfo(attachmentId, mailbox, envelopeId, convert2Pdf);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeDocumentControllerApi#getArchiveInfo");
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
| **attachmentId** | **UUID**| Attachment UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **envelopeId** | **UUID**| Envelope UUID | [optional] |
| **convert2Pdf** | **Boolean**| Convert to PDF | [optional] |

### Return type

[**ArchiveAttachmentInfo**](ArchiveAttachmentInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAttachmentPageSizes"></a>
# **getAttachmentPageSizes**
> PdfPageSizes getAttachmentPageSizes(attachmentUuid, mailbox, envelopeUuid)

Get attachment page sizes

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeDocumentControllerApi;

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

    EnvelopeDocumentControllerApi apiInstance = new EnvelopeDocumentControllerApi(defaultClient);
    UUID attachmentUuid = UUID.randomUUID(); // UUID | Attachment UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UUID envelopeUuid = UUID.randomUUID(); // UUID | Envelope UUID
    try {
      PdfPageSizes result = apiInstance.getAttachmentPageSizes(attachmentUuid, mailbox, envelopeUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeDocumentControllerApi#getAttachmentPageSizes");
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
| **attachmentUuid** | **UUID**| Attachment UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **envelopeUuid** | **UUID**| Envelope UUID | [optional] |

### Return type

[**PdfPageSizes**](PdfPageSizes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDocumentPrintVersion"></a>
# **getDocumentPrintVersion**
> File getDocumentPrintVersion(id, documentId, mailbox, wait)

Get document PDF for printing

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeDocumentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeDocumentControllerApi apiInstance = new EnvelopeDocumentControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    String documentId = "documentId_example"; // String | Document id
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Boolean wait = true; // Boolean | Wait for a file instead of 425 error
    try {
      File result = apiInstance.getDocumentPrintVersion(id, documentId, mailbox, wait);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeDocumentControllerApi#getDocumentPrintVersion");
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
| **documentId** | **String**| Document id | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **wait** | **Boolean**| Wait for a file instead of 425 error | [optional] |

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

<a id="getEnvelopeSharedZip"></a>
# **getEnvelopeSharedZip**
> File getEnvelopeSharedZip(code)

Get shared zip archive

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeDocumentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeDocumentControllerApi apiInstance = new EnvelopeDocumentControllerApi(defaultClient);
    String code = "code_example"; // String | Code for downloading
    try {
      File result = apiInstance.getEnvelopeSharedZip(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeDocumentControllerApi#getEnvelopeSharedZip");
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
| **code** | **String**| Code for downloading | |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEnvelopeZip"></a>
# **getEnvelopeZip**
> File getEnvelopeZip(id, documentId, excludeFiles, zipStructureName, wait, accessCode, mailbox)

Get envelope or document zip archive

Anonymous users download it with the access code of a payment link; files visible only to some roles are not included

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeDocumentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeDocumentControllerApi apiInstance = new EnvelopeDocumentControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    String documentId = "documentId_example"; // String | Document ID
    String excludeFiles = "excludeFiles_example"; // String | Mask to exclude some files. c - for signature/processing Certificate, p - for Printable version, a - for Audit trail
    String zipStructureName = "zipStructureName_example"; // String | The name of pre-saved zip structure in the template
    Boolean wait = true; // Boolean | Wait for a file instead of 425 error
    String accessCode = "accessCode_example"; // String | Access code of a payment link, for anonymous users
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      File result = apiInstance.getEnvelopeZip(id, documentId, excludeFiles, zipStructureName, wait, accessCode, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeDocumentControllerApi#getEnvelopeZip");
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
| **documentId** | **String**| Document ID | [optional] |
| **excludeFiles** | **String**| Mask to exclude some files. c - for signature/processing Certificate, p - for Printable version, a - for Audit trail | [optional] |
| **zipStructureName** | **String**| The name of pre-saved zip structure in the template | [optional] |
| **wait** | **Boolean**| Wait for a file instead of 425 error | [optional] |
| **accessCode** | **String**| Access code of a payment link, for anonymous users | [optional] |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | [optional] |

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

<a id="shareEnvelopesByEmail"></a>
# **shareEnvelopesByEmail**
> shareEnvelopesByEmail(mailbox, envelopeSharedArchiveRequestDTO)

Share envelopes by email

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeDocumentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeDocumentControllerApi apiInstance = new EnvelopeDocumentControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvelopeSharedArchiveRequestDTO envelopeSharedArchiveRequestDTO = new EnvelopeSharedArchiveRequestDTO(); // EnvelopeSharedArchiveRequestDTO | 
    try {
      apiInstance.shareEnvelopesByEmail(mailbox, envelopeSharedArchiveRequestDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeDocumentControllerApi#shareEnvelopesByEmail");
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
| **envelopeSharedArchiveRequestDTO** | [**EnvelopeSharedArchiveRequestDTO**](EnvelopeSharedArchiveRequestDTO.md)|  | |

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
| **201** | Created |  -  |

