# IntegrationControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**convertBinaryToXML**](IntegrationControllerApi.md#convertBinaryToXML) | **POST** /api/v1/integration/convert-binary | Convert incoming file to XML view |
| [**createIntegrationRule**](IntegrationControllerApi.md#createIntegrationRule) | **POST** /api/v1/integration/rule | Create integration rule |
| [**deleteIntegrationRule**](IntegrationControllerApi.md#deleteIntegrationRule) | **DELETE** /api/v1/integration/rule/{integrationRuleUuid} | Delete integration rule |
| [**execute**](IntegrationControllerApi.md#execute) | **POST** /api/v1/integration/rule/execute | Execute conversion map and generate file name (if pattern rule defined) |
| [**generate**](IntegrationControllerApi.md#generate) | **GET** /api/v1/integration/source/{templateUuid}/{mailboxUuid} | Generate envelope XML by template |
| [**getExchangeCertificate**](IntegrationControllerApi.md#getExchangeCertificate) | **GET** /api/v1/integration/exchange-certificate | Get public exchange certificate |
| [**getIntegrationRule**](IntegrationControllerApi.md#getIntegrationRule) | **GET** /api/v1/integration/rule/{integrationRuleUuid} | Get integration rule |
| [**getIntegrationRules**](IntegrationControllerApi.md#getIntegrationRules) | **GET** /api/v1/integration/rules/{accountUuid} | Get account integration rules |
| [**getMailboxIntegration**](IntegrationControllerApi.md#getMailboxIntegration) | **GET** /api/v1/integration/{mailboxUuid} | Get Mailbox integration |
| [**newPassword**](IntegrationControllerApi.md#newPassword) | **POST** /api/v1/integration/new-password/{mailboxUuid} | Generate and save new password |
| [**saveMailboxIntegration**](IntegrationControllerApi.md#saveMailboxIntegration) | **POST** /api/v1/integration/{mailboxUuid} | Create/update Mailbox integration |
| [**updateIntegrationRule**](IntegrationControllerApi.md#updateIntegrationRule) | **PUT** /api/v1/integration/rule/{integrationRuleUuid} | Update integration rule |


<a id="convertBinaryToXML"></a>
# **convertBinaryToXML**
> String convertBinaryToXML(filename, mailboxUuid, requestBody)

Convert incoming file to XML view

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    String filename = "filename_example"; // String | filename, for type detection
    UUID mailboxUuid = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    List<byte[]> requestBody = null; // List<byte[]> | 
    try {
      String result = apiInstance.convertBinaryToXML(filename, mailboxUuid, requestBody);
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
| **requestBody** | [**List&lt;byte[]&gt;**](byte[].md)|  | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createIntegrationRule"></a>
# **createIntegrationRule**
> IntegrationRuleDTO createIntegrationRule(integrationRuleDTO)

Create integration rule

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    IntegrationRuleDTO integrationRuleDTO = new IntegrationRuleDTO(); // IntegrationRuleDTO | 
    try {
      IntegrationRuleDTO result = apiInstance.createIntegrationRule(integrationRuleDTO);
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
| **integrationRuleDTO** | [**IntegrationRuleDTO**](IntegrationRuleDTO.md)|  | |

### Return type

[**IntegrationRuleDTO**](IntegrationRuleDTO.md)

### Authorization

No authorization required

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
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

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

No authorization required

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
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="generate"></a>
# **generate**
> DataMap generate(templateUuid, mailboxUuid, versionUuid)

Generate envelope XML by template

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    UUID templateUuid = UUID.randomUUID(); // UUID | Template UUID
    UUID mailboxUuid = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UUID versionUuid = UUID.randomUUID(); // UUID | Template version UUID
    try {
      DataMap result = apiInstance.generate(templateUuid, mailboxUuid, versionUuid);
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

[**DataMap**](DataMap.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getExchangeCertificate"></a>
# **getExchangeCertificate**
> List&lt;byte[]&gt; getExchangeCertificate()

Get public exchange certificate

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    try {
      List<byte[]> result = apiInstance.getExchangeCertificate();
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

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getIntegrationRule"></a>
# **getIntegrationRule**
> IntegrationRuleDTO getIntegrationRule(integrationRuleUuid)

Get integration rule

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    UUID integrationRuleUuid = UUID.randomUUID(); // UUID | UUID of integration rule
    try {
      IntegrationRuleDTO result = apiInstance.getIntegrationRule(integrationRuleUuid);
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

### Return type

[**IntegrationRuleDTO**](IntegrationRuleDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getIntegrationRules"></a>
# **getIntegrationRules**
> List&lt;IntegrationRuleDTO&gt; getIntegrationRules(accountUuid, mailboxUuid)

Get account integration rules

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | 
    UUID mailboxUuid = UUID.randomUUID(); // UUID | Mailbox UUID
    try {
      List<IntegrationRuleDTO> result = apiInstance.getIntegrationRules(accountUuid, mailboxUuid);
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
| **accountUuid** | **UUID**|  | |
| **mailboxUuid** | **UUID**| Mailbox UUID | |

### Return type

[**List&lt;IntegrationRuleDTO&gt;**](IntegrationRuleDTO.md)

### Authorization

No authorization required

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
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

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

No authorization required

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
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateIntegrationRule"></a>
# **updateIntegrationRule**
> IntegrationRuleDTO updateIntegrationRule(integrationRuleUuid, integrationRuleDTO)

Update integration rule

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.IntegrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    IntegrationControllerApi apiInstance = new IntegrationControllerApi(defaultClient);
    UUID integrationRuleUuid = UUID.randomUUID(); // UUID | UUID of integration rule
    IntegrationRuleDTO integrationRuleDTO = new IntegrationRuleDTO(); // IntegrationRuleDTO | 
    try {
      IntegrationRuleDTO result = apiInstance.updateIntegrationRule(integrationRuleUuid, integrationRuleDTO);
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
| **integrationRuleDTO** | [**IntegrationRuleDTO**](IntegrationRuleDTO.md)|  | |

### Return type

[**IntegrationRuleDTO**](IntegrationRuleDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

