# ScenarioControllerApi

All URIs are relative to *https://api.centredo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneScenario**](ScenarioControllerApi.md#cloneScenario) | **PUT** /api/v1/scenario/{scenarioUuid}/clone | Clone scenario
[**createNewScenario**](ScenarioControllerApi.md#createNewScenario) | **POST** /api/v1/scenario | Create new scenario
[**deleteScenario**](ScenarioControllerApi.md#deleteScenario) | **DELETE** /api/v1/scenario/{scenarioUuid} | Delete scenario
[**getScenario**](ScenarioControllerApi.md#getScenario) | **GET** /api/v1/scenario/{scenarioUuid} | Get scenario
[**runScenario**](ScenarioControllerApi.md#runScenario) | **POST** /api/v1/scenario/{scenarioUuid} | Run scenario
[**searchScenarios**](ScenarioControllerApi.md#searchScenarios) | **GET** /api/v1/scenario | Get paged scenario list
[**updateScenario**](ScenarioControllerApi.md#updateScenario) | **PUT** /api/v1/scenario/{scenarioUuid} | Update scenario

<a name="cloneScenario"></a>
# **cloneScenario**
> ScenarioDTO cloneScenario(scenarioUuid, mailbox)

Clone scenario

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScenarioControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ScenarioControllerApi apiInstance = new ScenarioControllerApi();
UUID scenarioUuid = new UUID(); // UUID | Scenario uuid
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    ScenarioDTO result = apiInstance.cloneScenario(scenarioUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenarioControllerApi#cloneScenario");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scenarioUuid** | [**UUID**](.md)| Scenario uuid |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**ScenarioDTO**](ScenarioDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNewScenario"></a>
# **createNewScenario**
> ScenarioDTO createNewScenario(body, mailbox)

Create new scenario

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScenarioControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ScenarioControllerApi apiInstance = new ScenarioControllerApi();
ScenarioDTO body = new ScenarioDTO(); // ScenarioDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    ScenarioDTO result = apiInstance.createNewScenario(body, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenarioControllerApi#createNewScenario");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScenarioDTO**](ScenarioDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**ScenarioDTO**](ScenarioDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteScenario"></a>
# **deleteScenario**
> deleteScenario(scenarioUuid, mailbox)

Delete scenario

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScenarioControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ScenarioControllerApi apiInstance = new ScenarioControllerApi();
UUID scenarioUuid = new UUID(); // UUID | Scenario uuid
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.deleteScenario(scenarioUuid, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenarioControllerApi#deleteScenario");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scenarioUuid** | [**UUID**](.md)| Scenario uuid |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getScenario"></a>
# **getScenario**
> ScenarioDTO getScenario(scenarioUuid, mailbox)

Get scenario

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScenarioControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ScenarioControllerApi apiInstance = new ScenarioControllerApi();
UUID scenarioUuid = new UUID(); // UUID | Scenario uuid
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    ScenarioDTO result = apiInstance.getScenario(scenarioUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenarioControllerApi#getScenario");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scenarioUuid** | [**UUID**](.md)| Scenario uuid |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**ScenarioDTO**](ScenarioDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="runScenario"></a>
# **runScenario**
> SingleUuidDTO runScenario(scenarioUuid, mailbox)

Run scenario

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScenarioControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ScenarioControllerApi apiInstance = new ScenarioControllerApi();
UUID scenarioUuid = new UUID(); // UUID | Scenario uuid
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    SingleUuidDTO result = apiInstance.runScenario(scenarioUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenarioControllerApi#runScenario");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scenarioUuid** | [**UUID**](.md)| Scenario uuid |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchScenarios"></a>
# **searchScenarios**
> PageDTOScenarioShortDTO searchScenarios(mailbox, level, keyword, offset, limit)

Get paged scenario list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScenarioControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ScenarioControllerApi apiInstance = new ScenarioControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
String level = "pub"; // String | Scenario access level, 'pub' by default.
String keyword = "keyword_example"; // String | Keyword to search scenario by or scenario UUID
Integer offset = 0; // Integer | Offset records
Integer limit = 25; // Integer | Limit records, max is 1000
try {
    PageDTOScenarioShortDTO result = apiInstance.searchScenarios(mailbox, level, keyword, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenarioControllerApi#searchScenarios");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **level** | **String**| Scenario access level, &#x27;pub&#x27; by default. | [optional] [default to pub] [enum: mailbox, account, pub, official, shared]
 **keyword** | **String**| Keyword to search scenario by or scenario UUID | [optional]
 **offset** | **Integer**| Offset records | [optional] [default to 0]
 **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25]

### Return type

[**PageDTOScenarioShortDTO**](PageDTOScenarioShortDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateScenario"></a>
# **updateScenario**
> ScenarioDTO updateScenario(body, mailbox, scenarioUuid)

Update scenario

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScenarioControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ScenarioControllerApi apiInstance = new ScenarioControllerApi();
ScenarioDTO body = new ScenarioDTO(); // ScenarioDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID scenarioUuid = new UUID(); // UUID | Scenario uuid
try {
    ScenarioDTO result = apiInstance.updateScenario(body, mailbox, scenarioUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenarioControllerApi#updateScenario");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScenarioDTO**](ScenarioDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **scenarioUuid** | [**UUID**](.md)| Scenario uuid |

### Return type

[**ScenarioDTO**](ScenarioDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

