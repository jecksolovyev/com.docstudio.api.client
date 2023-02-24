# DictionaryControllerApi

All URIs are relative to *https://api.centredo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveDictionary**](DictionaryControllerApi.md#archiveDictionary) | **PATCH** /api/v1/dictionary/{dictionaryUuid}/archive | Archive dictionary
[**checkColumnValues**](DictionaryControllerApi.md#checkColumnValues) | **GET** /api/v1/dictionary/{dictionaryUuid}/column/{columnUuid}/check | Check dictionary column. Check access, existence, etc.
[**checkDictionary**](DictionaryControllerApi.md#checkDictionary) | **GET** /api/v1/dictionary/{dictionaryUuid}/check | Check dictionary. Check access, existence, etc.
[**createColumn**](DictionaryControllerApi.md#createColumn) | **POST** /api/v1/dictionary/{dictionaryUuid}/column | Create dictionary column
[**createDictionary**](DictionaryControllerApi.md#createDictionary) | **POST** /api/v1/dictionary | Create empty dictionary
[**createRecord**](DictionaryControllerApi.md#createRecord) | **POST** /api/v1/dictionary/{dictionaryUuid}/record | Create record(s)
[**deleteColumnDictionary**](DictionaryControllerApi.md#deleteColumnDictionary) | **DELETE** /api/v1/dictionary/{dictionaryUuid}/column/{columnUuid} | Delete column. Will return deleted column UUID
[**deleteRecords**](DictionaryControllerApi.md#deleteRecords) | **DELETE** /api/v1/dictionary/{dictionaryUuid}/record | Delete record(s). Will return deleted records UUID(s)
[**download**](DictionaryControllerApi.md#download) | **POST** /api/v1/dictionary/{dictionaryUuid}/download | Download the dictionary
[**downloadStatus**](DictionaryControllerApi.md#downloadStatus) | **GET** /api/v1/dictionary/{dictionaryUuid}/download/status/{taskUuid} | Download the dictionary
[**getColumnValue**](DictionaryControllerApi.md#getColumnValue) | **GET** /api/v1/dictionary/{dictionaryUuid}/record/{recordUuid}/column/{columnUuid} | Retrieve column value for specific record
[**getColumnValues**](DictionaryControllerApi.md#getColumnValues) | **GET** /api/v1/dictionary/{dictionaryUuid}/column/{columnUuid} | Retrieve column values from dictionary
[**getDictionaryRecord**](DictionaryControllerApi.md#getDictionaryRecord) | **GET** /api/v1/dictionary/{dictionaryUuid}/record/{recordUuid} | Retrieve record
[**getDictionaryRecords**](DictionaryControllerApi.md#getDictionaryRecords) | **POST** /api/v1/dictionary/{dictionaryUuid}/records | Get dictionary records
[**patchDictionary**](DictionaryControllerApi.md#patchDictionary) | **PATCH** /api/v1/dictionary/{dictionaryUuid} | Update dictionary
[**patchRecord**](DictionaryControllerApi.md#patchRecord) | **PATCH** /api/v1/dictionary/{dictionaryUuid}/record/{recordUuid} | Update record column values
[**readDictionary**](DictionaryControllerApi.md#readDictionary) | **GET** /api/v1/dictionary/{dictionaryUuid} | Read/get dictionary
[**searchDictionaries**](DictionaryControllerApi.md#searchDictionaries) | **GET** /api/v1/dictionary | Get paged dictionary list
[**updateColumnDictionary**](DictionaryControllerApi.md#updateColumnDictionary) | **PUT** /api/v1/dictionary/{dictionaryUuid}/column/{columnUuid} | Update dictionary column

<a name="archiveDictionary"></a>
# **archiveDictionary**
> archiveDictionary(dictionaryUuid, mailbox)

Archive dictionary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
UUID dictionaryUuid = new UUID(); // UUID | Dictionary UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.archiveDictionary(dictionaryUuid, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#archiveDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dictionaryUuid** | [**UUID**](.md)| Dictionary UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="checkColumnValues"></a>
# **checkColumnValues**
> DictionaryCheckResponseDTO checkColumnValues(dictionaryUuid, columnUuid, mailbox)

Check dictionary column. Check access, existence, etc.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
UUID dictionaryUuid = new UUID(); // UUID | Dictionary UUID
UUID columnUuid = new UUID(); // UUID | Column UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    DictionaryCheckResponseDTO result = apiInstance.checkColumnValues(dictionaryUuid, columnUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#checkColumnValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dictionaryUuid** | [**UUID**](.md)| Dictionary UUID |
 **columnUuid** | [**UUID**](.md)| Column UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**DictionaryCheckResponseDTO**](DictionaryCheckResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="checkDictionary"></a>
# **checkDictionary**
> DictionaryCheckResponseDTO checkDictionary(dictionaryUuid, mailbox)

Check dictionary. Check access, existence, etc.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
UUID dictionaryUuid = new UUID(); // UUID | UUID of dictionary
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    DictionaryCheckResponseDTO result = apiInstance.checkDictionary(dictionaryUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#checkDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dictionaryUuid** | [**UUID**](.md)| UUID of dictionary |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**DictionaryCheckResponseDTO**](DictionaryCheckResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createColumn"></a>
# **createColumn**
> SingleUuidDTO createColumn(body, mailbox, dictionaryUuid)

Create dictionary column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
DictionaryColumnRequestDTO body = new DictionaryColumnRequestDTO(); // DictionaryColumnRequestDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID dictionaryUuid = new UUID(); // UUID | Dictionary UUID
try {
    SingleUuidDTO result = apiInstance.createColumn(body, mailbox, dictionaryUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#createColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DictionaryColumnRequestDTO**](DictionaryColumnRequestDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **dictionaryUuid** | [**UUID**](.md)| Dictionary UUID |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDictionary"></a>
# **createDictionary**
> SingleUuidDTO createDictionary(mailbox)

Create empty dictionary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    SingleUuidDTO result = apiInstance.createDictionary(mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#createDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRecord"></a>
# **createRecord**
> CreateRecordsResponseDTO createRecord(body, mailbox, dictionaryUuid)

Create record(s)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
List<List<DictionaryColumnValueRequestDTO>> body = Arrays.asList(new List()); // List<List<DictionaryColumnValueRequestDTO>> | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID dictionaryUuid = new UUID(); // UUID | Dictionary UUID
try {
    CreateRecordsResponseDTO result = apiInstance.createRecord(body, mailbox, dictionaryUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#createRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;List&lt;DictionaryColumnValueRequestDTO&gt;&gt;**](List.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **dictionaryUuid** | [**UUID**](.md)| Dictionary UUID |

### Return type

[**CreateRecordsResponseDTO**](CreateRecordsResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteColumnDictionary"></a>
# **deleteColumnDictionary**
> SingleUuidDTO deleteColumnDictionary(dictionaryUuid, columnUuid, mailbox)

Delete column. Will return deleted column UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
UUID dictionaryUuid = new UUID(); // UUID | Dictionary UUID
UUID columnUuid = new UUID(); // UUID | Column UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    SingleUuidDTO result = apiInstance.deleteColumnDictionary(dictionaryUuid, columnUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#deleteColumnDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dictionaryUuid** | [**UUID**](.md)| Dictionary UUID |
 **columnUuid** | [**UUID**](.md)| Column UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteRecords"></a>
# **deleteRecords**
> List&lt;SingleUuidDTO&gt; deleteRecords(body, mailbox, dictionaryUuid)

Delete record(s). Will return deleted records UUID(s)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
List<SingleUuidDTO> body = Arrays.asList(new SingleUuidDTO()); // List<SingleUuidDTO> | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID dictionaryUuid = new UUID(); // UUID | Dictionary UUID
try {
    List<SingleUuidDTO> result = apiInstance.deleteRecords(body, mailbox, dictionaryUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#deleteRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **dictionaryUuid** | [**UUID**](.md)| Dictionary UUID |

### Return type

[**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="download"></a>
# **download**
> ExportTaskStatusDTO download(body, mailbox, dictionaryUuid)

Download the dictionary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
DictionaryDownloadParamsDTO body = new DictionaryDownloadParamsDTO(); // DictionaryDownloadParamsDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID dictionaryUuid = new UUID(); // UUID | UUID of dictionary
try {
    ExportTaskStatusDTO result = apiInstance.download(body, mailbox, dictionaryUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#download");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DictionaryDownloadParamsDTO**](DictionaryDownloadParamsDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **dictionaryUuid** | [**UUID**](.md)| UUID of dictionary |

### Return type

[**ExportTaskStatusDTO**](ExportTaskStatusDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadStatus"></a>
# **downloadStatus**
> ExportTaskStatusDTO downloadStatus(dictionaryUuid, taskUuid, mailbox)

Download the dictionary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
UUID dictionaryUuid = new UUID(); // UUID | UUID of dictionary
UUID taskUuid = new UUID(); // UUID | UUID of task
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    ExportTaskStatusDTO result = apiInstance.downloadStatus(dictionaryUuid, taskUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#downloadStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dictionaryUuid** | [**UUID**](.md)| UUID of dictionary |
 **taskUuid** | [**UUID**](.md)| UUID of task |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**ExportTaskStatusDTO**](ExportTaskStatusDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getColumnValue"></a>
# **getColumnValue**
> DictionaryColumnValueResponseDTO getColumnValue(dictionaryUuid, recordUuid, columnUuid, mailbox)

Retrieve column value for specific record

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
UUID dictionaryUuid = new UUID(); // UUID | Dictionary UUID
UUID recordUuid = new UUID(); // UUID | Record UUID
UUID columnUuid = new UUID(); // UUID | Column UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    DictionaryColumnValueResponseDTO result = apiInstance.getColumnValue(dictionaryUuid, recordUuid, columnUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#getColumnValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dictionaryUuid** | [**UUID**](.md)| Dictionary UUID |
 **recordUuid** | [**UUID**](.md)| Record UUID |
 **columnUuid** | [**UUID**](.md)| Column UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**DictionaryColumnValueResponseDTO**](DictionaryColumnValueResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getColumnValues"></a>
# **getColumnValues**
> PageDTODictionaryColumnValueResponseDTO getColumnValues(dictionaryUuid, columnUuid, mailbox, offset, limit, keyword)

Retrieve column values from dictionary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
UUID dictionaryUuid = new UUID(); // UUID | Dictionary UUID
UUID columnUuid = new UUID(); // UUID | Column UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
Integer offset = 0; // Integer | Offset records
Integer limit = 25; // Integer | Limit records, max is 1000
String keyword = "keyword_example"; // String | Keyword to search by
try {
    PageDTODictionaryColumnValueResponseDTO result = apiInstance.getColumnValues(dictionaryUuid, columnUuid, mailbox, offset, limit, keyword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#getColumnValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dictionaryUuid** | [**UUID**](.md)| Dictionary UUID |
 **columnUuid** | [**UUID**](.md)| Column UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **offset** | **Integer**| Offset records | [optional] [default to 0]
 **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25]
 **keyword** | **String**| Keyword to search by | [optional]

### Return type

[**PageDTODictionaryColumnValueResponseDTO**](PageDTODictionaryColumnValueResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDictionaryRecord"></a>
# **getDictionaryRecord**
> DictionaryRecordValuesResponseDTO getDictionaryRecord(dictionaryUuid, recordUuid, mailbox)

Retrieve record

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
UUID dictionaryUuid = new UUID(); // UUID | Dictionary UUID
UUID recordUuid = new UUID(); // UUID | Record UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    DictionaryRecordValuesResponseDTO result = apiInstance.getDictionaryRecord(dictionaryUuid, recordUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#getDictionaryRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dictionaryUuid** | [**UUID**](.md)| Dictionary UUID |
 **recordUuid** | [**UUID**](.md)| Record UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**DictionaryRecordValuesResponseDTO**](DictionaryRecordValuesResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDictionaryRecords"></a>
# **getDictionaryRecords**
> PageDTODictionaryRecordValuesResponseDTO getDictionaryRecords(body, mailbox, dictionaryUuid, offset, limit)

Get dictionary records

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
DictionaryFiltersRequestDTO body = new DictionaryFiltersRequestDTO(); // DictionaryFiltersRequestDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID dictionaryUuid = new UUID(); // UUID | UUID of dictionary
Integer offset = 0; // Integer | Offset records
Integer limit = 25; // Integer | Limit records, max is 1000
try {
    PageDTODictionaryRecordValuesResponseDTO result = apiInstance.getDictionaryRecords(body, mailbox, dictionaryUuid, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#getDictionaryRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DictionaryFiltersRequestDTO**](DictionaryFiltersRequestDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **dictionaryUuid** | [**UUID**](.md)| UUID of dictionary |
 **offset** | **Integer**| Offset records | [optional] [default to 0]
 **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25]

### Return type

[**PageDTODictionaryRecordValuesResponseDTO**](PageDTODictionaryRecordValuesResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchDictionary"></a>
# **patchDictionary**
> DictionaryResponseDTO patchDictionary(body, mailbox, dictionaryUuid)

Update dictionary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
DictionaryRequestDTO body = new DictionaryRequestDTO(); // DictionaryRequestDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID dictionaryUuid = new UUID(); // UUID | UUID of dictionary
try {
    DictionaryResponseDTO result = apiInstance.patchDictionary(body, mailbox, dictionaryUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#patchDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DictionaryRequestDTO**](DictionaryRequestDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **dictionaryUuid** | [**UUID**](.md)| UUID of dictionary |

### Return type

[**DictionaryResponseDTO**](DictionaryResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchRecord"></a>
# **patchRecord**
> patchRecord(body, mailbox, dictionaryUuid, recordUuid)

Update record column values

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
List<DictionaryColumnValueRequestDTO> body = Arrays.asList(new DictionaryColumnValueRequestDTO()); // List<DictionaryColumnValueRequestDTO> | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID dictionaryUuid = new UUID(); // UUID | Dictionary UUID
UUID recordUuid = new UUID(); // UUID | Record UUID
try {
    apiInstance.patchRecord(body, mailbox, dictionaryUuid, recordUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#patchRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;DictionaryColumnValueRequestDTO&gt;**](DictionaryColumnValueRequestDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **dictionaryUuid** | [**UUID**](.md)| Dictionary UUID |
 **recordUuid** | [**UUID**](.md)| Record UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="readDictionary"></a>
# **readDictionary**
> DictionaryResponseDTO readDictionary(dictionaryUuid, mailbox, withColumns, withRecordsCount)

Read/get dictionary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
UUID dictionaryUuid = new UUID(); // UUID | UUID of dictionary
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
Boolean withColumns = false; // Boolean | Add columns description to each dictionary
Boolean withRecordsCount = false; // Boolean | Add records count value to each dictionary
try {
    DictionaryResponseDTO result = apiInstance.readDictionary(dictionaryUuid, mailbox, withColumns, withRecordsCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#readDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dictionaryUuid** | [**UUID**](.md)| UUID of dictionary |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **withColumns** | **Boolean**| Add columns description to each dictionary | [optional] [default to false]
 **withRecordsCount** | **Boolean**| Add records count value to each dictionary | [optional] [default to false]

### Return type

[**DictionaryResponseDTO**](DictionaryResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchDictionaries"></a>
# **searchDictionaries**
> PageDTODictionaryResponseDTO searchDictionaries(mailbox, level, keyword, withColumns, offset, limit)

Get paged dictionary list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
String level = "pub"; // String | Dictionary access level, 'pub' by default.
String keyword = "keyword_example"; // String | Keyword to search dictionary by or dictionary UUID
Boolean withColumns = false; // Boolean | Add columns description to each dictionary
Integer offset = 0; // Integer | Offset records
Integer limit = 25; // Integer | Limit records, max is 1000
try {
    PageDTODictionaryResponseDTO result = apiInstance.searchDictionaries(mailbox, level, keyword, withColumns, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#searchDictionaries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **level** | **String**| Dictionary access level, &#x27;pub&#x27; by default. | [optional] [default to pub] [enum: mailbox, account, pub, official, shared]
 **keyword** | **String**| Keyword to search dictionary by or dictionary UUID | [optional]
 **withColumns** | **Boolean**| Add columns description to each dictionary | [optional] [default to false]
 **offset** | **Integer**| Offset records | [optional] [default to 0]
 **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25]

### Return type

[**PageDTODictionaryResponseDTO**](PageDTODictionaryResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateColumnDictionary"></a>
# **updateColumnDictionary**
> DictionaryColumnResponseDTO updateColumnDictionary(body, mailbox, dictionaryUuid, columnUuid)

Update dictionary column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionaryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DictionaryControllerApi apiInstance = new DictionaryControllerApi();
DictionaryColumnRequestDTO body = new DictionaryColumnRequestDTO(); // DictionaryColumnRequestDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID dictionaryUuid = new UUID(); // UUID | Dictionary UUID
UUID columnUuid = new UUID(); // UUID | Column UUID
try {
    DictionaryColumnResponseDTO result = apiInstance.updateColumnDictionary(body, mailbox, dictionaryUuid, columnUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionaryControllerApi#updateColumnDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DictionaryColumnRequestDTO**](DictionaryColumnRequestDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **dictionaryUuid** | [**UUID**](.md)| Dictionary UUID |
 **columnUuid** | [**UUID**](.md)| Column UUID |

### Return type

[**DictionaryColumnResponseDTO**](DictionaryColumnResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

