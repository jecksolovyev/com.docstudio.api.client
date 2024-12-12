# UploadControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](UploadControllerApi.md#cancel) | **DELETE** /api/v1/upload/{uploadUuid} | Cancel import process
[**confirm**](UploadControllerApi.md#confirm) | **PUT** /api/v1/upload/{uploadUuid}/confirm | Approve import process
[**getImportTask**](UploadControllerApi.md#getImportTask) | **GET** /api/v1/upload/{uploadUuid} | Get import processing task
[**uploadDictionary**](UploadControllerApi.md#uploadDictionary) | **POST** /api/v1/upload/dictionary/{dictionaryUuid} | Upload dictionary file for importing

<a name="cancel"></a>
# **cancel**
> cancel(uploadUuid)

Cancel import process

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UploadControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UploadControllerApi apiInstance = new UploadControllerApi();
UUID uploadUuid = new UUID(); // UUID | 
try {
    apiInstance.cancel(uploadUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadControllerApi#cancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadUuid** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="confirm"></a>
# **confirm**
> confirm(body, uploadUuid)

Approve import process

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UploadControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UploadControllerApi apiInstance = new UploadControllerApi();
ConfirmUploadDTO body = new ConfirmUploadDTO(); // ConfirmUploadDTO | 
UUID uploadUuid = new UUID(); // UUID | 
try {
    apiInstance.confirm(body, uploadUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadControllerApi#confirm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfirmUploadDTO**](ConfirmUploadDTO.md)|  |
 **uploadUuid** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getImportTask"></a>
# **getImportTask**
> ImportTaskDTO getImportTask(uploadUuid)

Get import processing task

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UploadControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UploadControllerApi apiInstance = new UploadControllerApi();
UUID uploadUuid = new UUID(); // UUID | 
try {
    ImportTaskDTO result = apiInstance.getImportTask(uploadUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadControllerApi#getImportTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadUuid** | [**UUID**](.md)|  |

### Return type

[**ImportTaskDTO**](ImportTaskDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadDictionary"></a>
# **uploadDictionary**
> SingleUuidDTO uploadDictionary(mailbox, dictionaryUuid, file)

Upload dictionary file for importing

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UploadControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UploadControllerApi apiInstance = new UploadControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID dictionaryUuid = new UUID(); // UUID | 
File file = new File("file_example"); // File | 
try {
    SingleUuidDTO result = apiInstance.uploadDictionary(mailbox, dictionaryUuid, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadControllerApi#uploadDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **dictionaryUuid** | [**UUID**](.md)|  |
 **file** | **File**|  | [optional]

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

