# MiscControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appSettings**](MiscControllerApi.md#appSettings) | **GET** /api/v1/settings | 
[**auditLog**](MiscControllerApi.md#auditLog) | **POST** /api/v1/audit | Audit log
[**calculateFormula**](MiscControllerApi.md#calculateFormula) | **POST** /api/v1/formula | Calculate excel formulas for documents
[**createAuditReport**](MiscControllerApi.md#createAuditReport) | **POST** /api/v1/audit/report | Request audit report
[**detectCountry**](MiscControllerApi.md#detectCountry) | **GET** /api/v1/detect-country | 
[**getBarcode**](MiscControllerApi.md#getBarcode) | **GET** /api/v1/barcode | 
[**getProcessStatus**](MiscControllerApi.md#getProcessStatus) | **GET** /api/v1/process-status/{id} | Process status
[**parseCsv**](MiscControllerApi.md#parseCsv) | **POST** /api/v1/csv-parser | Parse CSV text (5 rows max)
[**recalculateMailboxStat**](MiscControllerApi.md#recalculateMailboxStat) | **GET** /api/v1/recalculate-mailbox-stat | Recalculate all mailbox counters
[**returnNoFavicon**](MiscControllerApi.md#returnNoFavicon) | **GET** /favicon.ico | 
[**webhook**](MiscControllerApi.md#webhook) | **POST** /api/v1/account/webhook | 

<a name="appSettings"></a>
# **appSettings**
> SettingsDTO appSettings()



### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import com.docstudio.client.api.MiscControllerApi;


MiscControllerApi apiInstance = new MiscControllerApi();
try {
    SettingsDTO result = apiInstance.appSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscControllerApi#appSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SettingsDTO**](SettingsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="auditLog"></a>
# **auditLog**
> PageDTOActivityLogRecordDTO auditLog(body, offset, limit)

Audit log

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MiscControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MiscControllerApi apiInstance = new MiscControllerApi();
SearchActivityLogDTO body = new SearchActivityLogDTO(); // SearchActivityLogDTO | 
Integer offset = 0; // Integer | Offset, how many records to skip
Integer limit = 25; // Integer | Limit, how many records to retrieve
try {
    PageDTOActivityLogRecordDTO result = apiInstance.auditLog(body, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscControllerApi#auditLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchActivityLogDTO**](SearchActivityLogDTO.md)|  |
 **offset** | **Integer**| Offset, how many records to skip | [optional] [default to 0]
 **limit** | **Integer**| Limit, how many records to retrieve | [optional] [default to 25]

### Return type

[**PageDTOActivityLogRecordDTO**](PageDTOActivityLogRecordDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="calculateFormula"></a>
# **calculateFormula**
> Map&lt;String, Map&lt;String, Object&gt;&gt; calculateFormula(body)

Calculate excel formulas for documents

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import com.docstudio.client.api.MiscControllerApi;


MiscControllerApi apiInstance = new MiscControllerApi();
List<DocFormulaRequestDTO> body = Arrays.asList(new DocFormulaRequestDTO()); // List<DocFormulaRequestDTO> | 
try {
    Map<String, Map<String, Object>> result = apiInstance.calculateFormula(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscControllerApi#calculateFormula");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;DocFormulaRequestDTO&gt;**](DocFormulaRequestDTO.md)|  |

### Return type

[**Map&lt;String, Map&lt;String, Object&gt;&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAuditReport"></a>
# **createAuditReport**
> createAuditReport(body)

Request audit report

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MiscControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MiscControllerApi apiInstance = new MiscControllerApi();
SearchActivityLogDTO body = new SearchActivityLogDTO(); // SearchActivityLogDTO | 
try {
    apiInstance.createAuditReport(body);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscControllerApi#createAuditReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchActivityLogDTO**](SearchActivityLogDTO.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="detectCountry"></a>
# **detectCountry**
> DetectedCountryDTO detectCountry()



### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import com.docstudio.client.api.MiscControllerApi;


MiscControllerApi apiInstance = new MiscControllerApi();
try {
    DetectedCountryDTO result = apiInstance.detectCountry();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscControllerApi#detectCountry");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DetectedCountryDTO**](DetectedCountryDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBarcode"></a>
# **getBarcode**
> String getBarcode(type, value)



### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import com.docstudio.client.api.MiscControllerApi;


MiscControllerApi apiInstance = new MiscControllerApi();
String type = "type_example"; // String | Barcode type
String value = "value_example"; // String | Barcode value
try {
    String result = apiInstance.getBarcode(type, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscControllerApi#getBarcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Barcode type | [enum: upca, upce, ean8, ean13, code39, code128, itf14, code93, rationalizedCodabar, databarexpandedstacked, qrcode, datamatrix, pdf417]
 **value** | **String**| Barcode value |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/svg+xml

<a name="getProcessStatus"></a>
# **getProcessStatus**
> ProcessStatus getProcessStatus(id, details)

Process status

Getting async bulk process status details by id

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MiscControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MiscControllerApi apiInstance = new MiscControllerApi();
UUID id = new UUID(); // UUID | Process id
Boolean details = true; // Boolean | Return details
try {
    ProcessStatus result = apiInstance.getProcessStatus(id, details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscControllerApi#getProcessStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Process id |
 **details** | **Boolean**| Return details | [optional]

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="parseCsv"></a>
# **parseCsv**
> List&lt;List&lt;String&gt;&gt; parseCsv(body)

Parse CSV text (5 rows max)

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MiscControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MiscControllerApi apiInstance = new MiscControllerApi();
CsvData body = new CsvData(); // CsvData | 
try {
    List<List<String>> result = apiInstance.parseCsv(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscControllerApi#parseCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CsvData**](CsvData.md)|  |

### Return type

[**List&lt;List&lt;String&gt;&gt;**](List.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="recalculateMailboxStat"></a>
# **recalculateMailboxStat**
> StatDTO recalculateMailboxStat(mailbox)

Recalculate all mailbox counters

development use only

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MiscControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MiscControllerApi apiInstance = new MiscControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    StatDTO result = apiInstance.recalculateMailboxStat(mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscControllerApi#recalculateMailboxStat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**StatDTO**](StatDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="returnNoFavicon"></a>
# **returnNoFavicon**
> returnNoFavicon()



### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import com.docstudio.client.api.MiscControllerApi;


MiscControllerApi apiInstance = new MiscControllerApi();
try {
    apiInstance.returnNoFavicon();
} catch (ApiException e) {
    System.err.println("Exception when calling MiscControllerApi#returnNoFavicon");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="webhook"></a>
# **webhook**
> webhook(body, authorization, accountKey, type)



### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import com.docstudio.client.api.MiscControllerApi;


MiscControllerApi apiInstance = new MiscControllerApi();
String body = "body_example"; // String | 
String authorization = "authorization_example"; // String | 
String accountKey = "accountKey_example"; // String | 
String type = "type_example"; // String | 
try {
    apiInstance.webhook(body, authorization, accountKey, type);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscControllerApi#webhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  |
 **authorization** | **String**|  |
 **accountKey** | **String**|  |
 **type** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

