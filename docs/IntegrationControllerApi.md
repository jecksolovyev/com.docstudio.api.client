# IntegrationControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateIntegrationRule**](IntegrationControllerApi.md#activateIntegrationRule) | **POST** /api/v1/integration/rule/{integrationRuleUuid}/activate/{flag} | Activate integration rule |
| [**conversionLog**](IntegrationControllerApi.md#conversionLog) | **GET** /api/v1/integration/conversion-log | Get conversion log |
| [**convertBinaryToXML**](IntegrationControllerApi.md#convertBinaryToXML) | **POST** /api/v1/integration/convert-binary | Convert incoming file to XML view |
| [**createIntegrationRule**](IntegrationControllerApi.md#createIntegrationRule) | **POST** /api/v1/integration/rule | Create integration rule |
| [**deleteIntegrationRule**](IntegrationControllerApi.md#deleteIntegrationRule) | **DELETE** /api/v1/integration/rule/{integrationRuleUuid} | Delete integration rule |
| [**execute**](IntegrationControllerApi.md#execute) | **POST** /api/v1/integration/rule/execute | Execute conversion map and generate file name (if pattern rule defined) |
| [**generate**](IntegrationControllerApi.md#generate) | **GET** /api/v1/integration/source/{templateUuid}/{mailboxUuid} | Generate envelope XML by template |
| [**getExchangeCertificate**](IntegrationControllerApi.md#getExchangeCertificate) | **GET** /api/v1/integration/exchange-certificate | Get public exchange certificate |
| [**getIntegrationRule**](IntegrationControllerApi.md#getIntegrationRule) | **GET** /api/v1/integration/rule/{integrationRuleUuid} | Get integration rule |
| [**getIntegrationRules**](IntegrationControllerApi.md#getIntegrationRules) | **GET** /api/v1/integration/rules/{accountUuid} | Get account integration rules |
| [**getMailboxIntegration**](IntegrationControllerApi.md#getMailboxIntegration) | **GET** /api/v1/integration/{mailboxUuid} | Get Mailbox integration |
| [**loadLogFile**](IntegrationControllerApi.md#loadLogFile) | **GET** /api/v1/integration/conversion-log/{logId}/file | Download input/output conversion file |
| [**newPassword**](IntegrationControllerApi.md#newPassword) | **POST** /api/v1/integration/new-password/{mailboxUuid} | Generate and save new password |
| [**reprocessLogRecord**](IntegrationControllerApi.md#reprocessLogRecord) | **POST** /api/v1/integration/conversion-log/reprocess | Reprocess log record |
| [**saveMailboxIntegration**](IntegrationControllerApi.md#saveMailboxIntegration) | **POST** /api/v1/integration/{mailboxUuid} | Create/update Mailbox integration |
| [**updateIntegrationRule**](IntegrationControllerApi.md#updateIntegrationRule) | **PUT** /api/v1/integration/rule/{integrationRuleUuid} | Update integration rule |


<a id="activateIntegrationRule"></a>
# **activateIntegrationRule**
> activateIntegrationRule(integrationRuleUuid, flag)

Activate integration rule

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    UUID integrationRuleUuid = UUID.randomUUID(); // UUID | UUID of integration rule
    Boolean flag = true; // Boolean | Active state
    try {
      apiInstance.activateIntegrationRule(integrationRuleUuid, flag);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#activateIntegrationRule");
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
| **integrationRuleUuid** | **UUID**| UUID of integration rule | |
| **flag** | **Boolean**| Active state | |

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
| **200** | OK |  -  |

<a id="conversionLog"></a>
# **conversionLog**
> PageDTOConversionLogRecord conversionLog(accountId, ruleId, status, keyword, offset, limit, uuidOnly, noRule, mailboxId)

Get conversion log

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    UUID ruleId = UUID.randomUUID(); // UUID | UUID of integration rule
    String status = "SUCCEED"; // String | Conversion Status
    String keyword = "keyword_example"; // String | Filter by Filename/Envelope subject/Envelope UUID
    Integer offset = 0; // Integer | Offset, how many records to skip
    Integer limit = 25; // Integer | Limit, how many records to retrieve
    Boolean uuidOnly = true; // Boolean | Retrieve only UUID of record
    Boolean noRule = true; // Boolean | Retrieve only records with no rule
    UUID mailboxId = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      PageDTOConversionLogRecord result = apiInstance.conversionLog(accountId, ruleId, status, keyword, offset, limit, uuidOnly, noRule, mailboxId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#conversionLog");
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
| **accountId** | **UUID**| Account UUID | |
| **ruleId** | **UUID**| UUID of integration rule | [optional] |
| **status** | **String**| Conversion Status | [optional] [enum: SUCCEED, FAILED] |
| **keyword** | **String**| Filter by Filename/Envelope subject/Envelope UUID | [optional] |
| **offset** | **Integer**| Offset, how many records to skip | [optional] [default to 0] |
| **limit** | **Integer**| Limit, how many records to retrieve | [optional] [default to 25] |
| **uuidOnly** | **Boolean**| Retrieve only UUID of record | [optional] |
| **noRule** | **Boolean**| Retrieve only records with no rule | [optional] |
| **mailboxId** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | [optional] |

### Return type

[**PageDTOConversionLogRecord**](PageDTOConversionLogRecord.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="convertBinaryToXML"></a>
# **convertBinaryToXML**
> String convertBinaryToXML(filename, mailboxUuid, body)

Convert incoming file to XML view

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    String filename = "filename_example"; // String | filename, for type detection
    UUID mailboxUuid = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    byte[] body = null; // byte[] | 
    try {
      String result = apiInstance.convertBinaryToXML(filename, mailboxUuid, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#convertBinaryToXML");
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
| **filename** | **String**| filename, for type detection | |
| **mailboxUuid** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **body** | **byte[]**|  | [optional] |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createIntegrationRule"></a>
# **createIntegrationRule**
> IntegrationRule createIntegrationRule(integrationRule)

Create integration rule

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    IntegrationRule integrationRule = new IntegrationRule(); // IntegrationRule | 
    try {
      IntegrationRule result = apiInstance.createIntegrationRule(integrationRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#createIntegrationRule");
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
| **integrationRule** | [**IntegrationRule**](IntegrationRule.md)|  | |

### Return type

[**IntegrationRule**](IntegrationRule.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteIntegrationRule"></a>
# **deleteIntegrationRule**
> deleteIntegrationRule(integrationRuleUuid)

Delete integration rule

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    UUID integrationRuleUuid = UUID.randomUUID(); // UUID | UUID of integration rule
    try {
      apiInstance.deleteIntegrationRule(integrationRuleUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#deleteIntegrationRule");
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
| **integrationRuleUuid** | **UUID**| UUID of integration rule | |

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
| **200** | OK |  -  |

<a id="execute"></a>
# **execute**
> IntegrationRuleResponseDTO execute(integrationRuleRequestDTO)

Execute conversion map and generate file name (if pattern rule defined)

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    IntegrationRuleRequestDTO integrationRuleRequestDTO = new IntegrationRuleRequestDTO(); // IntegrationRuleRequestDTO | 
    try {
      IntegrationRuleResponseDTO result = apiInstance.execute(integrationRuleRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#execute");
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
| **integrationRuleRequestDTO** | [**IntegrationRuleRequestDTO**](IntegrationRuleRequestDTO.md)|  | |

### Return type

[**IntegrationRuleResponseDTO**](IntegrationRuleResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="generate"></a>
# **generate**
> GeneratedEnvelope generate(templateUuid, mailboxUuid, versionUuid)

Generate envelope XML by template

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    UUID templateUuid = UUID.randomUUID(); // UUID | Template UUID
    UUID mailboxUuid = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UUID versionUuid = UUID.randomUUID(); // UUID | Template version UUID
    try {
      GeneratedEnvelope result = apiInstance.generate(templateUuid, mailboxUuid, versionUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#generate");
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
| **templateUuid** | **UUID**| Template UUID | |
| **mailboxUuid** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **versionUuid** | **UUID**| Template version UUID | [optional] |

### Return type

[**GeneratedEnvelope**](GeneratedEnvelope.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getExchangeCertificate"></a>
# **getExchangeCertificate**
> byte[] getExchangeCertificate()

Get public exchange certificate

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    try {
      byte[] result = apiInstance.getExchangeCertificate();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#getExchangeCertificate");
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

**byte[]**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getIntegrationRule"></a>
# **getIntegrationRule**
> IntegrationRule getIntegrationRule(integrationRuleUuid, baseFields)

Get integration rule

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    UUID integrationRuleUuid = UUID.randomUUID(); // UUID | UUID of integration rule
    Boolean baseFields = true; // Boolean | Get only based fields (skip large ones)
    try {
      IntegrationRule result = apiInstance.getIntegrationRule(integrationRuleUuid, baseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#getIntegrationRule");
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
| **integrationRuleUuid** | **UUID**| UUID of integration rule | |
| **baseFields** | **Boolean**| Get only based fields (skip large ones) | [optional] |

### Return type

[**IntegrationRule**](IntegrationRule.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getIntegrationRules"></a>
# **getIntegrationRules**
> List&lt;IntegrationRuleListItem&gt; getIntegrationRules(accountUuid, mailboxUuid)

Get account integration rules

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID mailboxUuid = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<IntegrationRuleListItem> result = apiInstance.getIntegrationRules(accountUuid, mailboxUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#getIntegrationRules");
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
| **accountUuid** | **UUID**| Account UUID | |
| **mailboxUuid** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | [optional] |

### Return type

[**List&lt;IntegrationRuleListItem&gt;**](IntegrationRuleListItem.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMailboxIntegration"></a>
# **getMailboxIntegration**
> IntegrationDTO getMailboxIntegration(mailboxUuid)

Get Mailbox integration

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    UUID mailboxUuid = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      IntegrationDTO result = apiInstance.getMailboxIntegration(mailboxUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#getMailboxIntegration");
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
| **mailboxUuid** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**IntegrationDTO**](IntegrationDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="loadLogFile"></a>
# **loadLogFile**
> File loadLogFile(logId)

Download input/output conversion file

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    UUID logId = UUID.randomUUID(); // UUID | UUID of conversion log
    try {
      File result = apiInstance.loadLogFile(logId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#loadLogFile");
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
| **logId** | **UUID**| UUID of conversion log | |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="newPassword"></a>
# **newPassword**
> Object newPassword(mailboxUuid)

Generate and save new password

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    UUID mailboxUuid = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      Object result = apiInstance.newPassword(mailboxUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#newPassword");
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
| **mailboxUuid** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="reprocessLogRecord"></a>
# **reprocessLogRecord**
> reprocessLogRecord(integrationReprocessRequest)

Reprocess log record

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    IntegrationReprocessRequest integrationReprocessRequest = new IntegrationReprocessRequest(); // IntegrationReprocessRequest | 
    try {
      apiInstance.reprocessLogRecord(integrationReprocessRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#reprocessLogRecord");
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
| **integrationReprocessRequest** | [**IntegrationReprocessRequest**](IntegrationReprocessRequest.md)|  | |

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

<a id="saveMailboxIntegration"></a>
# **saveMailboxIntegration**
> IntegrationDTO saveMailboxIntegration(mailboxUuid, integrationDTO)

Create/update Mailbox integration

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    UUID mailboxUuid = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    IntegrationDTO integrationDTO = new IntegrationDTO(); // IntegrationDTO | 
    try {
      IntegrationDTO result = apiInstance.saveMailboxIntegration(mailboxUuid, integrationDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#saveMailboxIntegration");
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
| **mailboxUuid** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **integrationDTO** | [**IntegrationDTO**](IntegrationDTO.md)|  | |

### Return type

[**IntegrationDTO**](IntegrationDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateIntegrationRule"></a>
# **updateIntegrationRule**
> IntegrationRule updateIntegrationRule(integrationRuleUuid, integrationRule)

Update integration rule

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    UUID integrationRuleUuid = UUID.randomUUID(); // UUID | UUID of integration rule
    IntegrationRule integrationRule = new IntegrationRule(); // IntegrationRule | 
    try {
      IntegrationRule result = apiInstance.updateIntegrationRule(integrationRuleUuid, integrationRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationControllerApi#updateIntegrationRule");
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
| **integrationRuleUuid** | **UUID**| UUID of integration rule | |
| **integrationRule** | [**IntegrationRule**](IntegrationRule.md)|  | |

### Return type

[**IntegrationRule**](IntegrationRule.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

