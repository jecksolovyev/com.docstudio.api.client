# UploadControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](UploadControllerApi.md#cancel) | **DELETE** /api/v1/upload/{uploadUuid} | Cancel import process |
| [**confirm**](UploadControllerApi.md#confirm) | **PUT** /api/v1/upload/{uploadUuid}/confirm | Approve import process |
| [**getImportTask**](UploadControllerApi.md#getImportTask) | **GET** /api/v1/upload/{uploadUuid} | Get import processing task |
| [**uploadDictionary**](UploadControllerApi.md#uploadDictionary) | **POST** /api/v1/upload/dictionary/{dictionaryUuid} | Upload dictionary file for importing |


<a id="cancel"></a>
# **cancel**
> cancel(uploadUuid)

Cancel import process

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UploadControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    UploadControllerApi apiInstance = new UploadControllerApi(defaultClient);
    UUID uploadUuid = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.cancel(uploadUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadControllerApi#cancel");
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
| **uploadUuid** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="confirm"></a>
# **confirm**
> confirm(uploadUuid, confirmUploadDTO)

Approve import process

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UploadControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    UploadControllerApi apiInstance = new UploadControllerApi(defaultClient);
    UUID uploadUuid = UUID.randomUUID(); // UUID | 
    ConfirmUploadDTO confirmUploadDTO = new ConfirmUploadDTO(); // ConfirmUploadDTO | 
    try {
      apiInstance.confirm(uploadUuid, confirmUploadDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadControllerApi#confirm");
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
| **uploadUuid** | **UUID**|  | |
| **confirmUploadDTO** | [**ConfirmUploadDTO**](ConfirmUploadDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getImportTask"></a>
# **getImportTask**
> ImportTaskDTO getImportTask(uploadUuid)

Get import processing task

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UploadControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    UploadControllerApi apiInstance = new UploadControllerApi(defaultClient);
    UUID uploadUuid = UUID.randomUUID(); // UUID | 
    try {
      ImportTaskDTO result = apiInstance.getImportTask(uploadUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadControllerApi#getImportTask");
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
| **uploadUuid** | **UUID**|  | |

### Return type

[**ImportTaskDTO**](ImportTaskDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="uploadDictionary"></a>
# **uploadDictionary**
> SingleUuidDTO uploadDictionary(dictionaryUuid, mailbox, _file)

Upload dictionary file for importing

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UploadControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    UploadControllerApi apiInstance = new UploadControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | 
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    File _file = new File("/path/to/file"); // File | 
    try {
      SingleUuidDTO result = apiInstance.uploadDictionary(dictionaryUuid, mailbox, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadControllerApi#uploadDictionary");
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
| **dictionaryUuid** | **UUID**|  | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **_file** | **File**|  | |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

