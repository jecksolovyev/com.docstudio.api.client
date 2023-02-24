# MiscControllerApi

All URIs are relative to *https://api.centredo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appSettings**](MiscControllerApi.md#appSettings) | **GET** /api/v1/settings | 
[**auditLog**](MiscControllerApi.md#auditLog) | **POST** /api/v1/audit | Audit log
[**calculateFormula**](MiscControllerApi.md#calculateFormula) | **POST** /api/v1/formula | Calculate excel formulas for documents
[**createAuditReport**](MiscControllerApi.md#createAuditReport) | **POST** /api/v1/audit/report | Request audit report
[**detectCountry**](MiscControllerApi.md#detectCountry) | **GET** /api/v1/detect-country | 
[**recalculateMailboxStat**](MiscControllerApi.md#recalculateMailboxStat) | **GET** /api/v1/recalculate-mailbox-stat | Recalculate all mailbox counters

<a name="appSettings"></a>
# **appSettings**
> SettingsDTO appSettings()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MiscControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


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

[Authorization](../README.md#Authorization)

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
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MiscControllerApi;

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
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MiscControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


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

[Authorization](../README.md#Authorization)

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
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MiscControllerApi;

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
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MiscControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="recalculateMailboxStat"></a>
# **recalculateMailboxStat**
> StatDTO recalculateMailboxStat(mailbox)

Recalculate all mailbox counters

development use only

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MiscControllerApi;

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

