# EnvelopeSendControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**oneTimeSend**](EnvelopeSendControllerApi.md#oneTimeSend) | **POST** /api/v1/envelope/one-time-send | The envelope will be sent just once (template will be marked as deleted) |
| [**publicQuickSendWithOneExternalDocument**](EnvelopeSendControllerApi.md#publicQuickSendWithOneExternalDocument) | **POST** /api/v1/envelope/public-quick-send | Public quick send envelope with one external document |
| [**quickSendExternalDocuments**](EnvelopeSendControllerApi.md#quickSendExternalDocuments) | **POST** /api/v1/envelope/quick-send | Quick send envelope with external documents only |
| [**send**](EnvelopeSendControllerApi.md#send) | **POST** /api/v1/envelope/send | Send envelope |
| [**sendByTemplateCode**](EnvelopeSendControllerApi.md#sendByTemplateCode) | **POST** /api/v1/envelope/send-by-share-code | Send envelope by template code |


<a id="oneTimeSend"></a>
# **oneTimeSend**
> SingleUuidDTO oneTimeSend(mailbox, oneTimeSendDTO)

The envelope will be sent just once (template will be marked as deleted)

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeSendControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeSendControllerApi apiInstance = new EnvelopeSendControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    OneTimeSendDTO oneTimeSendDTO = new OneTimeSendDTO(); // OneTimeSendDTO | 
    try {
      SingleUuidDTO result = apiInstance.oneTimeSend(mailbox, oneTimeSendDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeSendControllerApi#oneTimeSend");
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
| **oneTimeSendDTO** | [**OneTimeSendDTO**](OneTimeSendDTO.md)|  | |

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
| **201** | Created |  -  |

<a id="publicQuickSendWithOneExternalDocument"></a>
# **publicQuickSendWithOneExternalDocument**
> IdResult publicQuickSendWithOneExternalDocument(data, _file)

Public quick send envelope with one external document

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeSendControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeSendControllerApi apiInstance = new EnvelopeSendControllerApi(defaultClient);
    PublicQuickSend data = new PublicQuickSend(); // PublicQuickSend | 
    File _file = new File("/path/to/file"); // File | File for external document
    try {
      IdResult result = apiInstance.publicQuickSendWithOneExternalDocument(data, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeSendControllerApi#publicQuickSendWithOneExternalDocument");
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
| **data** | [**PublicQuickSend**](PublicQuickSend.md)|  | |
| **_file** | **File**| File for external document | |

### Return type

[**IdResult**](IdResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="quickSendExternalDocuments"></a>
# **quickSendExternalDocuments**
> SingleUuidDTO quickSendExternalDocuments(mailbox, data, files)

Quick send envelope with external documents only

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeSendControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeSendControllerApi apiInstance = new EnvelopeSendControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    QuickSendDTO data = new QuickSendDTO(); // QuickSendDTO | 
    List<File> files = Arrays.asList(); // List<File> | Files for external documents
    try {
      SingleUuidDTO result = apiInstance.quickSendExternalDocuments(mailbox, data, files);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeSendControllerApi#quickSendExternalDocuments");
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
| **data** | [**QuickSendDTO**](QuickSendDTO.md)|  | |
| **files** | **List&lt;File&gt;**| Files for external documents | |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="send"></a>
# **send**
> SingleUuidDTO send(mailbox, envPostDTO)

Send envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeSendControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeSendControllerApi apiInstance = new EnvelopeSendControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvPostDTO envPostDTO = new EnvPostDTO(); // EnvPostDTO | 
    try {
      SingleUuidDTO result = apiInstance.send(mailbox, envPostDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeSendControllerApi#send");
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
| **envPostDTO** | [**EnvPostDTO**](EnvPostDTO.md)|  | |

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
| **201** | Created |  -  |

<a id="sendByTemplateCode"></a>
# **sendByTemplateCode**
> LoginEnvelopeResponseDTO sendByTemplateCode(sendEnvByCodeDTO)

Send envelope by template code

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeSendControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeSendControllerApi apiInstance = new EnvelopeSendControllerApi(defaultClient);
    SendEnvByCodeDTO sendEnvByCodeDTO = new SendEnvByCodeDTO(); // SendEnvByCodeDTO | 
    try {
      LoginEnvelopeResponseDTO result = apiInstance.sendByTemplateCode(sendEnvByCodeDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeSendControllerApi#sendByTemplateCode");
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
| **sendEnvByCodeDTO** | [**SendEnvByCodeDTO**](SendEnvByCodeDTO.md)|  | |

### Return type

[**LoginEnvelopeResponseDTO**](LoginEnvelopeResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **405** | Method disabled by configuration |  -  |

