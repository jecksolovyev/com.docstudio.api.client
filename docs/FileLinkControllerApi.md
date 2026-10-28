# FileLinkControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadFileLink**](FileLinkControllerApi.md#downloadFileLink) | **GET** /api/v1/file-link/{token} | Download the file of a one-time link; the link stops working |
| [**info**](FileLinkControllerApi.md#info) | **GET** /api/v1/file-link/{token}/info | What a one-time file link is for and whether it can still be used |
| [**uploadMultipart**](FileLinkControllerApi.md#uploadMultipart) | **POST** /api/v1/file-link/{token} | Upload the file of a one-time link as multipart; the link stops working |
| [**uploadRaw**](FileLinkControllerApi.md#uploadRaw) | **PUT** /api/v1/file-link/{token} | Upload the file of a one-time link as the raw request body; the link stops working |


<a id="downloadFileLink"></a>
# **downloadFileLink**
> File downloadFileLink(token)

Download the file of a one-time link; the link stops working

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FileLinkControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    FileLinkControllerApi apiInstance = new FileLinkControllerApi(defaultClient);
    String token = "token_example"; // String | Link token
    try {
      File result = apiInstance.downloadFileLink(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileLinkControllerApi#downloadFileLink");
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
| **token** | **String**| Link token | |

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

<a id="info"></a>
# **info**
> FileLinkInfo info(token)

What a one-time file link is for and whether it can still be used

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FileLinkControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    FileLinkControllerApi apiInstance = new FileLinkControllerApi(defaultClient);
    String token = "token_example"; // String | Link token
    try {
      FileLinkInfo result = apiInstance.info(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileLinkControllerApi#info");
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
| **token** | **String**| Link token | |

### Return type

[**FileLinkInfo**](FileLinkInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="uploadMultipart"></a>
# **uploadMultipart**
> FileUploadStatus uploadMultipart(token, _file)

Upload the file of a one-time link as multipart; the link stops working

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FileLinkControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    FileLinkControllerApi apiInstance = new FileLinkControllerApi(defaultClient);
    String token = "token_example"; // String | Link token
    File _file = new File("/path/to/file"); // File | 
    try {
      FileUploadStatus result = apiInstance.uploadMultipart(token, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileLinkControllerApi#uploadMultipart");
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
| **token** | **String**| Link token | |
| **_file** | **File**|  | |

### Return type

[**FileUploadStatus**](FileUploadStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="uploadRaw"></a>
# **uploadRaw**
> FileUploadStatus uploadRaw(token, filename)

Upload the file of a one-time link as the raw request body; the link stops working

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FileLinkControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    FileLinkControllerApi apiInstance = new FileLinkControllerApi(defaultClient);
    String token = "token_example"; // String | Link token
    String filename = "filename_example"; // String | File name with its extension, when the link has none or another one is sent
    try {
      FileUploadStatus result = apiInstance.uploadRaw(token, filename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileLinkControllerApi#uploadRaw");
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
| **token** | **String**| Link token | |
| **filename** | **String**| File name with its extension, when the link has none or another one is sent | [optional] |

### Return type

[**FileUploadStatus**](FileUploadStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

