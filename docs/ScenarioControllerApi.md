# ScenarioControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cloneScenario**](ScenarioControllerApi.md#cloneScenario) | **PUT** /api/v1/scenario/{scenarioUuid}/clone | Clone scenario |
| [**createNewScenario**](ScenarioControllerApi.md#createNewScenario) | **POST** /api/v1/scenario | Create new scenario |
| [**deleteScenario**](ScenarioControllerApi.md#deleteScenario) | **DELETE** /api/v1/scenario/{scenarioUuid} | Delete scenario |
| [**getRecommendations**](ScenarioControllerApi.md#getRecommendations) | **GET** /api/v1/scenario/recommendations | Get up to 6 recommended folders and scenarios per access level |
| [**getScenario**](ScenarioControllerApi.md#getScenario) | **GET** /api/v1/scenario/{scenarioUuid} | Get scenario |
| [**removeScenarioFavoriteFlag**](ScenarioControllerApi.md#removeScenarioFavoriteFlag) | **DELETE** /api/v1/scenario/{id}/favorite | Remove favorite flag |
| [**runScenario**](ScenarioControllerApi.md#runScenario) | **POST** /api/v1/scenario/{scenarioUuid} | Run scenario |
| [**searchScenarios**](ScenarioControllerApi.md#searchScenarios) | **GET** /api/v1/scenario | Get paged scenario list |
| [**setScenarioFavoriteFlag**](ScenarioControllerApi.md#setScenarioFavoriteFlag) | **PUT** /api/v1/scenario/{id}/favorite | Mark scenario as favorite |
| [**updateScenario**](ScenarioControllerApi.md#updateScenario) | **PUT** /api/v1/scenario/{scenarioUuid} | Update scenario |
| [**updateScenarioCategories**](ScenarioControllerApi.md#updateScenarioCategories) | **PATCH** /api/v1/scenario/{id}/categories | Update categories in scenario |


<a id="cloneScenario"></a>
# **cloneScenario**
> ScenarioDTO cloneScenario(scenarioUuid, mailbox)

Clone scenario

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ScenarioControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ScenarioControllerApi apiInstance = new ScenarioControllerApi(defaultClient);
    UUID scenarioUuid = UUID.randomUUID(); // UUID | Scenario uuid
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      ScenarioDTO result = apiInstance.cloneScenario(scenarioUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioControllerApi#cloneScenario");
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
| **scenarioUuid** | **UUID**| Scenario uuid | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**ScenarioDTO**](ScenarioDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createNewScenario"></a>
# **createNewScenario**
> ScenarioDTO createNewScenario(mailbox, scenarioDTO)

Create new scenario

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ScenarioControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ScenarioControllerApi apiInstance = new ScenarioControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    ScenarioDTO scenarioDTO = new ScenarioDTO(); // ScenarioDTO | 
    try {
      ScenarioDTO result = apiInstance.createNewScenario(mailbox, scenarioDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioControllerApi#createNewScenario");
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
| **scenarioDTO** | [**ScenarioDTO**](ScenarioDTO.md)|  | |

### Return type

[**ScenarioDTO**](ScenarioDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteScenario"></a>
# **deleteScenario**
> deleteScenario(scenarioUuid, mailbox)

Delete scenario

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ScenarioControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ScenarioControllerApi apiInstance = new ScenarioControllerApi(defaultClient);
    UUID scenarioUuid = UUID.randomUUID(); // UUID | Scenario uuid
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.deleteScenario(scenarioUuid, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioControllerApi#deleteScenario");
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
| **scenarioUuid** | **UUID**| Scenario uuid | |
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

<a id="getRecommendations"></a>
# **getRecommendations**
> ScenarioRecommendationsResponse getRecommendations(mailbox)

Get up to 6 recommended folders and scenarios per access level

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ScenarioControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ScenarioControllerApi apiInstance = new ScenarioControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      ScenarioRecommendationsResponse result = apiInstance.getRecommendations(mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioControllerApi#getRecommendations");
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

[**ScenarioRecommendationsResponse**](ScenarioRecommendationsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getScenario"></a>
# **getScenario**
> ScenarioDTO getScenario(scenarioUuid, mailbox)

Get scenario

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ScenarioControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ScenarioControllerApi apiInstance = new ScenarioControllerApi(defaultClient);
    UUID scenarioUuid = UUID.randomUUID(); // UUID | Scenario uuid
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      ScenarioDTO result = apiInstance.getScenario(scenarioUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioControllerApi#getScenario");
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
| **scenarioUuid** | **UUID**| Scenario uuid | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**ScenarioDTO**](ScenarioDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="removeScenarioFavoriteFlag"></a>
# **removeScenarioFavoriteFlag**
> removeScenarioFavoriteFlag(id, mailbox)

Remove favorite flag

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ScenarioControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ScenarioControllerApi apiInstance = new ScenarioControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | UUID of scenario
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.removeScenarioFavoriteFlag(id, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioControllerApi#removeScenarioFavoriteFlag");
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
| **id** | **UUID**| UUID of scenario | |
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

<a id="runScenario"></a>
# **runScenario**
> SingleUuidDTO runScenario(scenarioUuid, mailbox)

Run scenario

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ScenarioControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ScenarioControllerApi apiInstance = new ScenarioControllerApi(defaultClient);
    UUID scenarioUuid = UUID.randomUUID(); // UUID | Scenario uuid
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      SingleUuidDTO result = apiInstance.runScenario(scenarioUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioControllerApi#runScenario");
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
| **scenarioUuid** | **UUID**| Scenario uuid | |
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
| **200** | OK |  -  |

<a id="searchScenarios"></a>
# **searchScenarios**
> PageDTOScenarioShortDTO searchScenarios(mailbox, level, category, favorite, excludeCategorized, keyword, offset, limit)

Get paged scenario list

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ScenarioControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ScenarioControllerApi apiInstance = new ScenarioControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    String level = "mailbox"; // String | Scenario access level
    UUID category = UUID.randomUUID(); // UUID | Category id to search scenario in
    Boolean favorite = true; // Boolean | Filter only favorite or not favorite scenarios
    Boolean excludeCategorized = true; // Boolean | Exclude scenarios if they are located in any other category, except categoryId, within same access level
    String keyword = "keyword_example"; // String | Keyword to search scenario by or scenario UUID
    Integer offset = 0; // Integer | Offset records
    Integer limit = 25; // Integer | Limit records, max is 1000
    try {
      PageDTOScenarioShortDTO result = apiInstance.searchScenarios(mailbox, level, category, favorite, excludeCategorized, keyword, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioControllerApi#searchScenarios");
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
| **level** | **String**| Scenario access level | [optional] [enum: mailbox, account, public, official, shared, public-hidden] |
| **category** | **UUID**| Category id to search scenario in | [optional] |
| **favorite** | **Boolean**| Filter only favorite or not favorite scenarios | [optional] |
| **excludeCategorized** | **Boolean**| Exclude scenarios if they are located in any other category, except categoryId, within same access level | [optional] |
| **keyword** | **String**| Keyword to search scenario by or scenario UUID | [optional] |
| **offset** | **Integer**| Offset records | [optional] [default to 0] |
| **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25] |

### Return type

[**PageDTOScenarioShortDTO**](PageDTOScenarioShortDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="setScenarioFavoriteFlag"></a>
# **setScenarioFavoriteFlag**
> setScenarioFavoriteFlag(id, mailbox)

Mark scenario as favorite

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ScenarioControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ScenarioControllerApi apiInstance = new ScenarioControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | UUID of scenario
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.setScenarioFavoriteFlag(id, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioControllerApi#setScenarioFavoriteFlag");
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
| **id** | **UUID**| UUID of scenario | |
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

<a id="updateScenario"></a>
# **updateScenario**
> ScenarioDTO updateScenario(scenarioUuid, mailbox, scenarioDTO)

Update scenario

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ScenarioControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ScenarioControllerApi apiInstance = new ScenarioControllerApi(defaultClient);
    UUID scenarioUuid = UUID.randomUUID(); // UUID | Scenario uuid
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    ScenarioDTO scenarioDTO = new ScenarioDTO(); // ScenarioDTO | 
    try {
      ScenarioDTO result = apiInstance.updateScenario(scenarioUuid, mailbox, scenarioDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioControllerApi#updateScenario");
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
| **scenarioUuid** | **UUID**| Scenario uuid | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **scenarioDTO** | [**ScenarioDTO**](ScenarioDTO.md)|  | |

### Return type

[**ScenarioDTO**](ScenarioDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateScenarioCategories"></a>
# **updateScenarioCategories**
> updateScenarioCategories(id, mailbox, UUID)

Update categories in scenario

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ScenarioControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ScenarioControllerApi apiInstance = new ScenarioControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Scenario UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    try {
      apiInstance.updateScenarioCategories(id, mailbox, UUID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioControllerApi#updateScenarioCategories");
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
| **id** | **UUID**| Scenario UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  | |

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

