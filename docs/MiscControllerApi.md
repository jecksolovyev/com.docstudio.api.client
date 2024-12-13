# MiscControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appSettings**](MiscControllerApi.md#appSettings) | **GET** /api/v1/settings |  |
| [**auditLog**](MiscControllerApi.md#auditLog) | **POST** /api/v1/audit | Audit log |
| [**calculateFormula**](MiscControllerApi.md#calculateFormula) | **POST** /api/v1/formula | Calculate excel formulas for documents |
| [**createAuditReport**](MiscControllerApi.md#createAuditReport) | **POST** /api/v1/audit/report | Request audit report |
| [**detectCountry**](MiscControllerApi.md#detectCountry) | **GET** /api/v1/detect-country |  |
| [**getBarcode**](MiscControllerApi.md#getBarcode) | **GET** /api/v1/barcode |  |
| [**getProcessStatus**](MiscControllerApi.md#getProcessStatus) | **GET** /api/v1/process-status/{id} | Process status |
| [**parseCsv**](MiscControllerApi.md#parseCsv) | **POST** /api/v1/csv-parser | Parse CSV text (5 rows max) |
| [**recalculateMailboxStat**](MiscControllerApi.md#recalculateMailboxStat) | **GET** /api/v1/recalculate-mailbox-stat | Recalculate all mailbox counters |
| [**returnNoFavicon**](MiscControllerApi.md#returnNoFavicon) | **GET** /favicon.ico |  |
| [**webhook**](MiscControllerApi.md#webhook) | **POST** /api/v1/account/webhook |  |


<a id="appSettings"></a>
# **appSettings**
> SettingsDTO appSettings()



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MiscControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    MiscControllerApi apiInstance = new MiscControllerApi(defaultClient);
    try {
      SettingsDTO result = apiInstance.appSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscControllerApi#appSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="auditLog"></a>
# **auditLog**
> PageDTOActivityLogRecordDTO auditLog(searchActivityLogDTO, offset, limit)

Audit log

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MiscControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MiscControllerApi apiInstance = new MiscControllerApi(defaultClient);
    SearchActivityLogDTO searchActivityLogDTO = new SearchActivityLogDTO(); // SearchActivityLogDTO | 
    Integer offset = 0; // Integer | Offset, how many records to skip
    Integer limit = 25; // Integer | Limit, how many records to retrieve
    try {
      PageDTOActivityLogRecordDTO result = apiInstance.auditLog(searchActivityLogDTO, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscControllerApi#auditLog");
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
| **searchActivityLogDTO** | [**SearchActivityLogDTO**](SearchActivityLogDTO.md)|  | |
| **offset** | **Integer**| Offset, how many records to skip | [optional] [default to 0] |
| **limit** | **Integer**| Limit, how many records to retrieve | [optional] [default to 25] |

### Return type

[**PageDTOActivityLogRecordDTO**](PageDTOActivityLogRecordDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="calculateFormula"></a>
# **calculateFormula**
> Map&lt;String, Map&lt;String, Object&gt;&gt; calculateFormula(docFormulaRequestDTO)

Calculate excel formulas for documents

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MiscControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    MiscControllerApi apiInstance = new MiscControllerApi(defaultClient);
    List<DocFormulaRequestDTO> docFormulaRequestDTO = Arrays.asList(); // List<DocFormulaRequestDTO> | 
    try {
      Map<String, Map<String, Object>> result = apiInstance.calculateFormula(docFormulaRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscControllerApi#calculateFormula");
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
| **docFormulaRequestDTO** | [**List&lt;DocFormulaRequestDTO&gt;**](DocFormulaRequestDTO.md)|  | |

### Return type

[**Map&lt;String, Map&lt;String, Object&gt;&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createAuditReport"></a>
# **createAuditReport**
> createAuditReport(searchActivityLogDTO)

Request audit report

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MiscControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MiscControllerApi apiInstance = new MiscControllerApi(defaultClient);
    SearchActivityLogDTO searchActivityLogDTO = new SearchActivityLogDTO(); // SearchActivityLogDTO | 
    try {
      apiInstance.createAuditReport(searchActivityLogDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscControllerApi#createAuditReport");
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
| **searchActivityLogDTO** | [**SearchActivityLogDTO**](SearchActivityLogDTO.md)|  | |

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
| **201** | Created |  -  |

<a id="detectCountry"></a>
# **detectCountry**
> DetectedCountryDTO detectCountry()



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MiscControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    MiscControllerApi apiInstance = new MiscControllerApi(defaultClient);
    try {
      DetectedCountryDTO result = apiInstance.detectCountry();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscControllerApi#detectCountry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getBarcode"></a>
# **getBarcode**
> String getBarcode(type, value)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MiscControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    MiscControllerApi apiInstance = new MiscControllerApi(defaultClient);
    String type = "upca"; // String | Barcode type
    String value = "value_example"; // String | Barcode value
    try {
      String result = apiInstance.getBarcode(type, value);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscControllerApi#getBarcode");
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
| **type** | **String**| Barcode type | [enum: upca, upce, ean8, ean13, code39, code128, itf14, code93, rationalizedCodabar, databarexpandedstacked, qrcode, datamatrix, pdf417] |
| **value** | **String**| Barcode value | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/svg+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProcessStatus"></a>
# **getProcessStatus**
> ProcessStatus getProcessStatus(id, details)

Process status

Getting async bulk process status details by id

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MiscControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MiscControllerApi apiInstance = new MiscControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Process id
    Boolean details = true; // Boolean | Return details
    try {
      ProcessStatus result = apiInstance.getProcessStatus(id, details);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscControllerApi#getProcessStatus");
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
| **id** | **UUID**| Process id | |
| **details** | **Boolean**| Return details | [optional] |

### Return type

[**ProcessStatus**](ProcessStatus.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="parseCsv"></a>
# **parseCsv**
> List&lt;List&lt;String&gt;&gt; parseCsv(csvData)

Parse CSV text (5 rows max)

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MiscControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MiscControllerApi apiInstance = new MiscControllerApi(defaultClient);
    CsvData csvData = new CsvData(); // CsvData | 
    try {
      List<List<String>> result = apiInstance.parseCsv(csvData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscControllerApi#parseCsv");
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
| **csvData** | [**CsvData**](CsvData.md)|  | |

### Return type

[**List&lt;List&lt;String&gt;&gt;**](List.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recalculateMailboxStat"></a>
# **recalculateMailboxStat**
> StatDTO recalculateMailboxStat(mailbox)

Recalculate all mailbox counters

development use only

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MiscControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MiscControllerApi apiInstance = new MiscControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      StatDTO result = apiInstance.recalculateMailboxStat(mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscControllerApi#recalculateMailboxStat");
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

[**StatDTO**](StatDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="returnNoFavicon"></a>
# **returnNoFavicon**
> returnNoFavicon()



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MiscControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    MiscControllerApi apiInstance = new MiscControllerApi(defaultClient);
    try {
      apiInstance.returnNoFavicon();
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscControllerApi#returnNoFavicon");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="webhook"></a>
# **webhook**
> webhook(authorization, accountKey, type, body)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MiscControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    MiscControllerApi apiInstance = new MiscControllerApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    String accountKey = "accountKey_example"; // String | 
    String type = "type_example"; // String | 
    String body = "body_example"; // String | 
    try {
      apiInstance.webhook(authorization, accountKey, type, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscControllerApi#webhook");
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
| **authorization** | **String**|  | |
| **accountKey** | **String**|  | |
| **type** | **String**|  | |
| **body** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

