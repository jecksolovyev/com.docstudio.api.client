# DictionaryControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archive1**](DictionaryControllerApi.md#archive1) | **PATCH** /api/v1/dictionary/{dictionaryUuid}/archive | Archive dictionary |
| [**checkColumnValues**](DictionaryControllerApi.md#checkColumnValues) | **GET** /api/v1/dictionary/{dictionaryUuid}/column/{columnUuid}/check | Check dictionary column. Check access, existence, etc. |
| [**checkDictionary**](DictionaryControllerApi.md#checkDictionary) | **GET** /api/v1/dictionary/{dictionaryUuid}/check | Check dictionary. Check access, existence, etc. |
| [**createColumn**](DictionaryControllerApi.md#createColumn) | **POST** /api/v1/dictionary/{dictionaryUuid}/column | Create dictionary column |
| [**createDictionary**](DictionaryControllerApi.md#createDictionary) | **POST** /api/v1/dictionary | Create empty dictionary |
| [**createRecord**](DictionaryControllerApi.md#createRecord) | **POST** /api/v1/dictionary/{dictionaryUuid}/record | Create record(s) |
| [**deleteColumn**](DictionaryControllerApi.md#deleteColumn) | **DELETE** /api/v1/dictionary/{dictionaryUuid}/column/{columnUuid} | Delete column. Will return deleted column UUID |
| [**deleteRecords**](DictionaryControllerApi.md#deleteRecords) | **DELETE** /api/v1/dictionary/{dictionaryUuid}/record | Delete record(s). Will return deleted records UUID(s) |
| [**download**](DictionaryControllerApi.md#download) | **POST** /api/v1/dictionary/{dictionaryUuid}/download | Download the dictionary |
| [**downloadStatus**](DictionaryControllerApi.md#downloadStatus) | **GET** /api/v1/dictionary/{dictionaryUuid}/download/status/{taskUuid} | Download the dictionary |
| [**getColumnValue**](DictionaryControllerApi.md#getColumnValue) | **GET** /api/v1/dictionary/{dictionaryUuid}/record/{recordUuid}/column/{columnUuid} | Retrieve column value for specific record |
| [**getColumnValues**](DictionaryControllerApi.md#getColumnValues) | **POST** /api/v1/dictionary/{dictionaryUuid}/column/{columnUuid} | Retrieve column values from dictionary |
| [**getDictionaryRecord**](DictionaryControllerApi.md#getDictionaryRecord) | **GET** /api/v1/dictionary/{dictionaryUuid}/record/{recordUuid} | Retrieve record |
| [**getDictionaryRecordUuids**](DictionaryControllerApi.md#getDictionaryRecordUuids) | **POST** /api/v1/dictionary/{dictionaryUuid}/record-uuids | Get dictionary record uuids by values |
| [**getDictionaryRecords**](DictionaryControllerApi.md#getDictionaryRecords) | **POST** /api/v1/dictionary/{dictionaryUuid}/records | Get dictionary records |
| [**patchDictionary**](DictionaryControllerApi.md#patchDictionary) | **PATCH** /api/v1/dictionary/{dictionaryUuid} | Update dictionary |
| [**patchRecord**](DictionaryControllerApi.md#patchRecord) | **PATCH** /api/v1/dictionary/{dictionaryUuid}/record/{recordUuid} | Update record column values |
| [**readDictionary**](DictionaryControllerApi.md#readDictionary) | **GET** /api/v1/dictionary/{dictionaryUuid} | Read/get dictionary |
| [**searchDictionaries**](DictionaryControllerApi.md#searchDictionaries) | **GET** /api/v1/dictionary | Get paged dictionary list |
| [**updateColumn1**](DictionaryControllerApi.md#updateColumn1) | **PUT** /api/v1/dictionary/{dictionaryUuid}/column/{columnUuid} | Update dictionary column |


<a id="archive1"></a>
# **archive1**
> archive1(dictionaryUuid, mailbox)

Archive dictionary

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | Dictionary UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.archive1(dictionaryUuid, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#archive1");
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
| **dictionaryUuid** | **UUID**| Dictionary UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="checkColumnValues"></a>
# **checkColumnValues**
> DictionaryCheckResponseDTO checkColumnValues(dictionaryUuid, columnUuid, mailbox)

Check dictionary column. Check access, existence, etc.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | Dictionary UUID
    UUID columnUuid = UUID.randomUUID(); // UUID | Column UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      DictionaryCheckResponseDTO result = apiInstance.checkColumnValues(dictionaryUuid, columnUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#checkColumnValues");
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
| **dictionaryUuid** | **UUID**| Dictionary UUID | |
| **columnUuid** | **UUID**| Column UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**DictionaryCheckResponseDTO**](DictionaryCheckResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="checkDictionary"></a>
# **checkDictionary**
> DictionaryCheckResponseDTO checkDictionary(dictionaryUuid, mailbox)

Check dictionary. Check access, existence, etc.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | UUID of dictionary
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      DictionaryCheckResponseDTO result = apiInstance.checkDictionary(dictionaryUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#checkDictionary");
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
| **dictionaryUuid** | **UUID**| UUID of dictionary | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**DictionaryCheckResponseDTO**](DictionaryCheckResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createColumn"></a>
# **createColumn**
> SingleUuidDTO createColumn(dictionaryUuid, mailbox, dictionaryColumnRequestDTO)

Create dictionary column

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | Dictionary UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    DictionaryColumnRequestDTO dictionaryColumnRequestDTO = new DictionaryColumnRequestDTO(); // DictionaryColumnRequestDTO | 
    try {
      SingleUuidDTO result = apiInstance.createColumn(dictionaryUuid, mailbox, dictionaryColumnRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#createColumn");
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
| **dictionaryUuid** | **UUID**| Dictionary UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **dictionaryColumnRequestDTO** | [**DictionaryColumnRequestDTO**](DictionaryColumnRequestDTO.md)|  | |

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

<a id="createDictionary"></a>
# **createDictionary**
> SingleUuidDTO createDictionary(mailbox)

Create empty dictionary

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      SingleUuidDTO result = apiInstance.createDictionary(mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#createDictionary");
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

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createRecord"></a>
# **createRecord**
> CreateRecordsResponseDTO createRecord(dictionaryUuid, mailbox, dictionaryColumnValueRequestDTO)

Create record(s)

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | Dictionary UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    List<List<DictionaryColumnValueRequestDTO>> dictionaryColumnValueRequestDTO = Arrays.asList(new ArrayList<>()); // List<List<DictionaryColumnValueRequestDTO>> | 
    try {
      CreateRecordsResponseDTO result = apiInstance.createRecord(dictionaryUuid, mailbox, dictionaryColumnValueRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#createRecord");
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
| **dictionaryUuid** | **UUID**| Dictionary UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **dictionaryColumnValueRequestDTO** | [**List&lt;List&lt;DictionaryColumnValueRequestDTO&gt;&gt;**](List.md)|  | |

### Return type

[**CreateRecordsResponseDTO**](CreateRecordsResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteColumn"></a>
# **deleteColumn**
> SingleUuidDTO deleteColumn(dictionaryUuid, columnUuid, mailbox)

Delete column. Will return deleted column UUID

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | Dictionary UUID
    UUID columnUuid = UUID.randomUUID(); // UUID | Column UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      SingleUuidDTO result = apiInstance.deleteColumn(dictionaryUuid, columnUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#deleteColumn");
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
| **dictionaryUuid** | **UUID**| Dictionary UUID | |
| **columnUuid** | **UUID**| Column UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deleteRecords"></a>
# **deleteRecords**
> List&lt;SingleUuidDTO&gt; deleteRecords(dictionaryUuid, mailbox, singleUuidDTO)

Delete record(s). Will return deleted records UUID(s)

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | Dictionary UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    List<SingleUuidDTO> singleUuidDTO = Arrays.asList(); // List<SingleUuidDTO> | 
    try {
      List<SingleUuidDTO> result = apiInstance.deleteRecords(dictionaryUuid, mailbox, singleUuidDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#deleteRecords");
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
| **dictionaryUuid** | **UUID**| Dictionary UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **singleUuidDTO** | [**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)|  | |

### Return type

[**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="download"></a>
# **download**
> ExportTaskStatusDTO download(dictionaryUuid, mailbox, dictionaryDownloadParamsDTO)

Download the dictionary

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | UUID of dictionary
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    DictionaryDownloadParamsDTO dictionaryDownloadParamsDTO = new DictionaryDownloadParamsDTO(); // DictionaryDownloadParamsDTO | 
    try {
      ExportTaskStatusDTO result = apiInstance.download(dictionaryUuid, mailbox, dictionaryDownloadParamsDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#download");
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
| **dictionaryUuid** | **UUID**| UUID of dictionary | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **dictionaryDownloadParamsDTO** | [**DictionaryDownloadParamsDTO**](DictionaryDownloadParamsDTO.md)|  | |

### Return type

[**ExportTaskStatusDTO**](ExportTaskStatusDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="downloadStatus"></a>
# **downloadStatus**
> ExportTaskStatusDTO downloadStatus(dictionaryUuid, taskUuid, mailbox)

Download the dictionary

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | UUID of dictionary
    UUID taskUuid = UUID.randomUUID(); // UUID | UUID of task
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      ExportTaskStatusDTO result = apiInstance.downloadStatus(dictionaryUuid, taskUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#downloadStatus");
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
| **dictionaryUuid** | **UUID**| UUID of dictionary | |
| **taskUuid** | **UUID**| UUID of task | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**ExportTaskStatusDTO**](ExportTaskStatusDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getColumnValue"></a>
# **getColumnValue**
> DictionaryColumnValueResponseDTO getColumnValue(dictionaryUuid, recordUuid, columnUuid, mailbox)

Retrieve column value for specific record

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | Dictionary UUID
    UUID recordUuid = UUID.randomUUID(); // UUID | Record UUID
    UUID columnUuid = UUID.randomUUID(); // UUID | Column UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      DictionaryColumnValueResponseDTO result = apiInstance.getColumnValue(dictionaryUuid, recordUuid, columnUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#getColumnValue");
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
| **dictionaryUuid** | **UUID**| Dictionary UUID | |
| **recordUuid** | **UUID**| Record UUID | |
| **columnUuid** | **UUID**| Column UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | [optional] |

### Return type

[**DictionaryColumnValueResponseDTO**](DictionaryColumnValueResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getColumnValues"></a>
# **getColumnValues**
> PageDTODictionaryColumnValueResponseDTO getColumnValues(dictionaryUuid, columnUuid, dictionaryColumnValueSearchDTO, offset, limit, mailbox)

Retrieve column values from dictionary

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | Dictionary UUID
    UUID columnUuid = UUID.randomUUID(); // UUID | Column UUID
    DictionaryColumnValueSearchDTO dictionaryColumnValueSearchDTO = new DictionaryColumnValueSearchDTO(); // DictionaryColumnValueSearchDTO | 
    Integer offset = 0; // Integer | Offset records
    Integer limit = 25; // Integer | Limit records, max is 1000
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      PageDTODictionaryColumnValueResponseDTO result = apiInstance.getColumnValues(dictionaryUuid, columnUuid, dictionaryColumnValueSearchDTO, offset, limit, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#getColumnValues");
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
| **dictionaryUuid** | **UUID**| Dictionary UUID | |
| **columnUuid** | **UUID**| Column UUID | |
| **dictionaryColumnValueSearchDTO** | [**DictionaryColumnValueSearchDTO**](DictionaryColumnValueSearchDTO.md)|  | |
| **offset** | **Integer**| Offset records | [optional] [default to 0] |
| **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25] |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | [optional] |

### Return type

[**PageDTODictionaryColumnValueResponseDTO**](PageDTODictionaryColumnValueResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDictionaryRecord"></a>
# **getDictionaryRecord**
> DictionaryRecordValuesResponseDTO getDictionaryRecord(dictionaryUuid, recordUuid, mailbox)

Retrieve record

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | Dictionary UUID
    UUID recordUuid = UUID.randomUUID(); // UUID | Record UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      DictionaryRecordValuesResponseDTO result = apiInstance.getDictionaryRecord(dictionaryUuid, recordUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#getDictionaryRecord");
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
| **dictionaryUuid** | **UUID**| Dictionary UUID | |
| **recordUuid** | **UUID**| Record UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | [optional] |

### Return type

[**DictionaryRecordValuesResponseDTO**](DictionaryRecordValuesResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDictionaryRecordUuids"></a>
# **getDictionaryRecordUuids**
> Map&lt;String, UUID&gt; getDictionaryRecordUuids(dictionaryUuid, mailbox, dictionaryRecordsRequestDTO)

Get dictionary record uuids by values

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | UUID of dictionary
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    DictionaryRecordsRequestDTO dictionaryRecordsRequestDTO = new DictionaryRecordsRequestDTO(); // DictionaryRecordsRequestDTO | 
    try {
      Map<String, UUID> result = apiInstance.getDictionaryRecordUuids(dictionaryUuid, mailbox, dictionaryRecordsRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#getDictionaryRecordUuids");
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
| **dictionaryUuid** | **UUID**| UUID of dictionary | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **dictionaryRecordsRequestDTO** | [**DictionaryRecordsRequestDTO**](DictionaryRecordsRequestDTO.md)|  | |

### Return type

[**Map&lt;String, UUID&gt;**](UUID.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDictionaryRecords"></a>
# **getDictionaryRecords**
> PageDTODictionaryRecordValuesResponseDTO getDictionaryRecords(dictionaryUuid, mailbox, dictionaryFiltersRequestDTO, offset, limit)

Get dictionary records

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | UUID of dictionary
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    DictionaryFiltersRequestDTO dictionaryFiltersRequestDTO = new DictionaryFiltersRequestDTO(); // DictionaryFiltersRequestDTO | 
    Integer offset = 0; // Integer | Offset records
    Integer limit = 25; // Integer | Limit records, max is 1000
    try {
      PageDTODictionaryRecordValuesResponseDTO result = apiInstance.getDictionaryRecords(dictionaryUuid, mailbox, dictionaryFiltersRequestDTO, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#getDictionaryRecords");
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
| **dictionaryUuid** | **UUID**| UUID of dictionary | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **dictionaryFiltersRequestDTO** | [**DictionaryFiltersRequestDTO**](DictionaryFiltersRequestDTO.md)|  | |
| **offset** | **Integer**| Offset records | [optional] [default to 0] |
| **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25] |

### Return type

[**PageDTODictionaryRecordValuesResponseDTO**](PageDTODictionaryRecordValuesResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="patchDictionary"></a>
# **patchDictionary**
> DictionaryResponseDTO patchDictionary(dictionaryUuid, mailbox, dictionaryRequestDTO)

Update dictionary

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | UUID of dictionary
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    DictionaryRequestDTO dictionaryRequestDTO = new DictionaryRequestDTO(); // DictionaryRequestDTO | 
    try {
      DictionaryResponseDTO result = apiInstance.patchDictionary(dictionaryUuid, mailbox, dictionaryRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#patchDictionary");
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
| **dictionaryUuid** | **UUID**| UUID of dictionary | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **dictionaryRequestDTO** | [**DictionaryRequestDTO**](DictionaryRequestDTO.md)|  | |

### Return type

[**DictionaryResponseDTO**](DictionaryResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="patchRecord"></a>
# **patchRecord**
> patchRecord(dictionaryUuid, recordUuid, mailbox, dictionaryColumnValueRequestDTO)

Update record column values

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | Dictionary UUID
    UUID recordUuid = UUID.randomUUID(); // UUID | Record UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    List<DictionaryColumnValueRequestDTO> dictionaryColumnValueRequestDTO = Arrays.asList(); // List<DictionaryColumnValueRequestDTO> | 
    try {
      apiInstance.patchRecord(dictionaryUuid, recordUuid, mailbox, dictionaryColumnValueRequestDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#patchRecord");
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
| **dictionaryUuid** | **UUID**| Dictionary UUID | |
| **recordUuid** | **UUID**| Record UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **dictionaryColumnValueRequestDTO** | [**List&lt;DictionaryColumnValueRequestDTO&gt;**](DictionaryColumnValueRequestDTO.md)|  | |

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

<a id="readDictionary"></a>
# **readDictionary**
> DictionaryResponseDTO readDictionary(dictionaryUuid, mailbox, withColumns, withRecordsCount)

Read/get dictionary

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | UUID of dictionary
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Boolean withColumns = false; // Boolean | Add columns description to each dictionary
    Boolean withRecordsCount = false; // Boolean | Add records count value to each dictionary
    try {
      DictionaryResponseDTO result = apiInstance.readDictionary(dictionaryUuid, mailbox, withColumns, withRecordsCount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#readDictionary");
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
| **dictionaryUuid** | **UUID**| UUID of dictionary | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **withColumns** | **Boolean**| Add columns description to each dictionary | [optional] [default to false] |
| **withRecordsCount** | **Boolean**| Add records count value to each dictionary | [optional] [default to false] |

### Return type

[**DictionaryResponseDTO**](DictionaryResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="searchDictionaries"></a>
# **searchDictionaries**
> PageDTODictionaryResponseDTO searchDictionaries(mailbox, level, keyword, withColumns, offset, limit)

Get paged dictionary list

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    String level = "mailbox"; // String | Dictionary access level
    String keyword = "keyword_example"; // String | Keyword to search dictionary by or dictionary UUID
    Boolean withColumns = false; // Boolean | Add columns description to each dictionary
    Integer offset = 0; // Integer | Offset records
    Integer limit = 25; // Integer | Limit records, max is 1000
    try {
      PageDTODictionaryResponseDTO result = apiInstance.searchDictionaries(mailbox, level, keyword, withColumns, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#searchDictionaries");
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
| **level** | **String**| Dictionary access level | [optional] [enum: mailbox, account, public, official, shared, public-hidden] |
| **keyword** | **String**| Keyword to search dictionary by or dictionary UUID | [optional] |
| **withColumns** | **Boolean**| Add columns description to each dictionary | [optional] [default to false] |
| **offset** | **Integer**| Offset records | [optional] [default to 0] |
| **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25] |

### Return type

[**PageDTODictionaryResponseDTO**](PageDTODictionaryResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateColumn1"></a>
# **updateColumn1**
> DictionaryColumnResponseDTO updateColumn1(dictionaryUuid, columnUuid, mailbox, dictionaryColumnRequestDTO)

Update dictionary column

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.DictionaryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DictionaryControllerApi apiInstance = new DictionaryControllerApi(defaultClient);
    UUID dictionaryUuid = UUID.randomUUID(); // UUID | Dictionary UUID
    UUID columnUuid = UUID.randomUUID(); // UUID | Column UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    DictionaryColumnRequestDTO dictionaryColumnRequestDTO = new DictionaryColumnRequestDTO(); // DictionaryColumnRequestDTO | 
    try {
      DictionaryColumnResponseDTO result = apiInstance.updateColumn1(dictionaryUuid, columnUuid, mailbox, dictionaryColumnRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryControllerApi#updateColumn1");
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
| **dictionaryUuid** | **UUID**| Dictionary UUID | |
| **columnUuid** | **UUID**| Column UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **dictionaryColumnRequestDTO** | [**DictionaryColumnRequestDTO**](DictionaryColumnRequestDTO.md)|  | |

### Return type

[**DictionaryColumnResponseDTO**](DictionaryColumnResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

