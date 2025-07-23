# AutomationControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAutomation**](AutomationControllerApi.md#createAutomation) | **POST** /api/v1/automation/account/{accountId} | Create new automation |
| [**createCredentials**](AutomationControllerApi.md#createCredentials) | **POST** /api/v1/automation/account/{accountId}/credentials | Create credentials |
| [**deleteAutomation**](AutomationControllerApi.md#deleteAutomation) | **DELETE** /api/v1/automation/account/{accountId}/{id} | Delete automation |
| [**deleteCredentials**](AutomationControllerApi.md#deleteCredentials) | **DELETE** /api/v1/automation/account/{accountId}/credentials/{id} | Delete credentials |
| [**getAutomation**](AutomationControllerApi.md#getAutomation) | **GET** /api/v1/automation/account/{accountId}/{id} | Retrieve automation |
| [**getAutomationExecutionFile**](AutomationControllerApi.md#getAutomationExecutionFile) | **GET** /api/v1/automation/account/{accountId}/execution/{traceId}/log/{spanId}/file | Get automation execution result file |
| [**getAutomationExecutionLog**](AutomationControllerApi.md#getAutomationExecutionLog) | **GET** /api/v1/automation/account/{accountId}/execution/{traceId}/log | Get automation execution log |
| [**getAutomationExecutions**](AutomationControllerApi.md#getAutomationExecutions) | **GET** /api/v1/automation/account/{accountId}/executions | Get automation executions |
| [**getAutomations**](AutomationControllerApi.md#getAutomations) | **GET** /api/v1/automation/account/{accountId} | Get account/mailbox automations |
| [**getBrickTypes**](AutomationControllerApi.md#getBrickTypes) | **GET** /api/v1/automation/account/{accountId}/brick-types |  |
| [**getCredentialTypes**](AutomationControllerApi.md#getCredentialTypes) | **GET** /api/v1/automation/account/{accountId}/credential-types |  |
| [**getCredentials**](AutomationControllerApi.md#getCredentials) | **GET** /api/v1/automation/account/{accountId}/credentials | Get account/mailbox credentials |
| [**reprocessExecution**](AutomationControllerApi.md#reprocessExecution) | **POST** /api/v1/automation/account/{accountId}/execution/{traceId}/log/{spanId}/reprocess | Reprocess execution starting from the span |
| [**updateAutomation**](AutomationControllerApi.md#updateAutomation) | **PUT** /api/v1/automation/account/{accountId}/{id} | Update automation |


<a id="createAutomation"></a>
# **createAutomation**
> IdResult createAutomation(accountId, automationUpdate)

Create new automation

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AutomationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AutomationControllerApi apiInstance = new AutomationControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    AutomationUpdate automationUpdate = new AutomationUpdate(); // AutomationUpdate | 
    try {
      IdResult result = apiInstance.createAutomation(accountId, automationUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationControllerApi#createAutomation");
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
| **automationUpdate** | [**AutomationUpdate**](AutomationUpdate.md)|  | |

### Return type

[**IdResult**](IdResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createCredentials"></a>
# **createCredentials**
> IdResult createCredentials(accountId, credentialsCreate)

Create credentials

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AutomationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AutomationControllerApi apiInstance = new AutomationControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    CredentialsCreate credentialsCreate = new CredentialsCreate(); // CredentialsCreate | 
    try {
      IdResult result = apiInstance.createCredentials(accountId, credentialsCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationControllerApi#createCredentials");
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
| **credentialsCreate** | [**CredentialsCreate**](CredentialsCreate.md)|  | |

### Return type

[**IdResult**](IdResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteAutomation"></a>
# **deleteAutomation**
> deleteAutomation(accountId, id)

Delete automation

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AutomationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AutomationControllerApi apiInstance = new AutomationControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    UUID id = UUID.randomUUID(); // UUID | Automation UUID
    try {
      apiInstance.deleteAutomation(accountId, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationControllerApi#deleteAutomation");
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
| **id** | **UUID**| Automation UUID | |

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

<a id="deleteCredentials"></a>
# **deleteCredentials**
> deleteCredentials(accountId, id)

Delete credentials

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AutomationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AutomationControllerApi apiInstance = new AutomationControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    UUID id = UUID.randomUUID(); // UUID | Credentials UUID
    try {
      apiInstance.deleteCredentials(accountId, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationControllerApi#deleteCredentials");
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
| **id** | **UUID**| Credentials UUID | |

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

<a id="getAutomation"></a>
# **getAutomation**
> AutomationGet getAutomation(accountId, id, version)

Retrieve automation

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AutomationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AutomationControllerApi apiInstance = new AutomationControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    UUID id = UUID.randomUUID(); // UUID | Automation UUID
    String version = "version_example"; // String | Version
    try {
      AutomationGet result = apiInstance.getAutomation(accountId, id, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationControllerApi#getAutomation");
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
| **id** | **UUID**| Automation UUID | |
| **version** | **String**| Version | [optional] |

### Return type

[**AutomationGet**](AutomationGet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAutomationExecutionFile"></a>
# **getAutomationExecutionFile**
> File getAutomationExecutionFile(accountId, traceId, spanId)

Get automation execution result file

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AutomationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AutomationControllerApi apiInstance = new AutomationControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    String traceId = "traceId_example"; // String | Execution Trace ID
    String spanId = "spanId_example"; // String | Execution Span ID
    try {
      File result = apiInstance.getAutomationExecutionFile(accountId, traceId, spanId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationControllerApi#getAutomationExecutionFile");
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
| **traceId** | **String**| Execution Trace ID | |
| **spanId** | **String**| Execution Span ID | |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAutomationExecutionLog"></a>
# **getAutomationExecutionLog**
> List&lt;AutomationLog&gt; getAutomationExecutionLog(accountId, traceId)

Get automation execution log

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AutomationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AutomationControllerApi apiInstance = new AutomationControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    String traceId = "traceId_example"; // String | Execution Trace ID
    try {
      List<AutomationLog> result = apiInstance.getAutomationExecutionLog(accountId, traceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationControllerApi#getAutomationExecutionLog");
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
| **traceId** | **String**| Execution Trace ID | |

### Return type

[**List&lt;AutomationLog&gt;**](AutomationLog.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAutomationExecutions"></a>
# **getAutomationExecutions**
> List&lt;AutomationExecution&gt; getAutomationExecutions(accountId)

Get automation executions

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AutomationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AutomationControllerApi apiInstance = new AutomationControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    try {
      List<AutomationExecution> result = apiInstance.getAutomationExecutions(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationControllerApi#getAutomationExecutions");
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

### Return type

[**List&lt;AutomationExecution&gt;**](AutomationExecution.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAutomations"></a>
# **getAutomations**
> List&lt;AutomationGetList&gt; getAutomations(accountId)

Get account/mailbox automations

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AutomationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AutomationControllerApi apiInstance = new AutomationControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    try {
      List<AutomationGetList> result = apiInstance.getAutomations(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationControllerApi#getAutomations");
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

### Return type

[**List&lt;AutomationGetList&gt;**](AutomationGetList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getBrickTypes"></a>
# **getBrickTypes**
> List&lt;BrickTypeGet&gt; getBrickTypes(accountId)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AutomationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AutomationControllerApi apiInstance = new AutomationControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    try {
      List<BrickTypeGet> result = apiInstance.getBrickTypes(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationControllerApi#getBrickTypes");
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

### Return type

[**List&lt;BrickTypeGet&gt;**](BrickTypeGet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCredentialTypes"></a>
# **getCredentialTypes**
> List&lt;CredentialTypeGet&gt; getCredentialTypes(accountId)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AutomationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AutomationControllerApi apiInstance = new AutomationControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    try {
      List<CredentialTypeGet> result = apiInstance.getCredentialTypes(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationControllerApi#getCredentialTypes");
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

### Return type

[**List&lt;CredentialTypeGet&gt;**](CredentialTypeGet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCredentials"></a>
# **getCredentials**
> List&lt;CredentialsGetList&gt; getCredentials(accountId)

Get account/mailbox credentials

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AutomationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AutomationControllerApi apiInstance = new AutomationControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    try {
      List<CredentialsGetList> result = apiInstance.getCredentials(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationControllerApi#getCredentials");
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

### Return type

[**List&lt;CredentialsGetList&gt;**](CredentialsGetList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="reprocessExecution"></a>
# **reprocessExecution**
> reprocessExecution(accountId, traceId, spanId, version)

Reprocess execution starting from the span

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AutomationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AutomationControllerApi apiInstance = new AutomationControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    String traceId = "traceId_example"; // String | Execution Trace ID
    String spanId = "spanId_example"; // String | Execution Span ID
    String version = "version_example"; // String | Version
    try {
      apiInstance.reprocessExecution(accountId, traceId, spanId, version);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationControllerApi#reprocessExecution");
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
| **traceId** | **String**| Execution Trace ID | |
| **spanId** | **String**| Execution Span ID | |
| **version** | **String**| Version | [optional] |

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

<a id="updateAutomation"></a>
# **updateAutomation**
> updateAutomation(accountId, id, automationUpdate)

Update automation

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AutomationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AutomationControllerApi apiInstance = new AutomationControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    UUID id = UUID.randomUUID(); // UUID | Automation UUID
    AutomationUpdate automationUpdate = new AutomationUpdate(); // AutomationUpdate | 
    try {
      apiInstance.updateAutomation(accountId, id, automationUpdate);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationControllerApi#updateAutomation");
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
| **id** | **UUID**| Automation UUID | |
| **automationUpdate** | [**AutomationUpdate**](AutomationUpdate.md)|  | |

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

