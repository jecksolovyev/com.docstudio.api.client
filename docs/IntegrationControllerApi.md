# IntegrationControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertBinaryToXML**](IntegrationControllerApi.md#convertBinaryToXML) | **POST** /api/v1/integration/convert-binary | Convert incoming file to XML view
[**createMailboxIntegrationRule**](IntegrationControllerApi.md#createMailboxIntegrationRule) | **POST** /api/v1/integration/rule/{mailboxUuid} | Create Mailbox integration rule
[**deleteMailboxIntegrationRule**](IntegrationControllerApi.md#deleteMailboxIntegrationRule) | **DELETE** /api/v1/integration/rule/{integrationRuleUuid} | Delete Mailbox integration rule
[**execute**](IntegrationControllerApi.md#execute) | **POST** /api/v1/integration/rule/execute | Execute conversion map and generate file name (if pattern rule defined)
[**generate**](IntegrationControllerApi.md#generate) | **GET** /api/v1/integration/source/{templateUuid}/{mailboxUuid} | Generate envelope XML by template
[**getMailboxIntegration**](IntegrationControllerApi.md#getMailboxIntegration) | **GET** /api/v1/integration/{mailboxUuid} | Get Mailbox integration
[**getMailboxIntegrationRule**](IntegrationControllerApi.md#getMailboxIntegrationRule) | **GET** /api/v1/integration/rule/{integrationRuleUuid} | Get Mailbox integration rule
[**getMailboxIntegrationRules**](IntegrationControllerApi.md#getMailboxIntegrationRules) | **GET** /api/v1/integration/rules/{mailboxUuid} | Get Mailbox integration rules
[**newPassword**](IntegrationControllerApi.md#newPassword) | **POST** /api/v1/integration/new-password/{mailboxUuid} | Generate and save new password
[**saveMailboxIntegration**](IntegrationControllerApi.md#saveMailboxIntegration) | **POST** /api/v1/integration/{mailboxUuid} | Create/update Mailbox integration
[**updateMailboxIntegrationRule**](IntegrationControllerApi.md#updateMailboxIntegrationRule) | **PUT** /api/v1/integration/rule/{integrationRuleUuid} | Update Mailbox integration rule

<a name="convertBinaryToXML"></a>
# **convertBinaryToXML**
> String convertBinaryToXML(filename, mailboxUuid, body)

Convert incoming file to XML view

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
String filename = "filename_example"; // String | filename, for type detection
UUID mailboxUuid = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
IntegrationConvertbinaryBody body = new IntegrationConvertbinaryBody(); // IntegrationConvertbinaryBody | 
try {
    String result = apiInstance.convertBinaryToXML(filename, mailboxUuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#convertBinaryToXML");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **String**| filename, for type detection |
 **mailboxUuid** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **body** | [**IntegrationConvertbinaryBody**](IntegrationConvertbinaryBody.md)|  | [optional]

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMailboxIntegrationRule"></a>
# **createMailboxIntegrationRule**
> IntegrationRuleDTO createMailboxIntegrationRule(body, mailboxUuid)

Create Mailbox integration rule

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
IntegrationRuleDTO body = new IntegrationRuleDTO(); // IntegrationRuleDTO | 
UUID mailboxUuid = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    IntegrationRuleDTO result = apiInstance.createMailboxIntegrationRule(body, mailboxUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#createMailboxIntegrationRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IntegrationRuleDTO**](IntegrationRuleDTO.md)|  |
 **mailboxUuid** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**IntegrationRuleDTO**](IntegrationRuleDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMailboxIntegrationRule"></a>
# **deleteMailboxIntegrationRule**
> deleteMailboxIntegrationRule(integrationRuleUuid)

Delete Mailbox integration rule

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
UUID integrationRuleUuid = new UUID(); // UUID | UUID of integration rule
try {
    apiInstance.deleteMailboxIntegrationRule(integrationRuleUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#deleteMailboxIntegrationRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationRuleUuid** | [**UUID**](.md)| UUID of integration rule |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="execute"></a>
# **execute**
> IntegrationRuleResponseDTO execute(body)

Execute conversion map and generate file name (if pattern rule defined)

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
IntegrationRuleRequestDTO body = new IntegrationRuleRequestDTO(); // IntegrationRuleRequestDTO | 
try {
    IntegrationRuleResponseDTO result = apiInstance.execute(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#execute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IntegrationRuleRequestDTO**](IntegrationRuleRequestDTO.md)|  |

### Return type

[**IntegrationRuleResponseDTO**](IntegrationRuleResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="generate"></a>
# **generate**
> DataMap generate(templateUuid, mailboxUuid, versionUuid)

Generate envelope XML by template

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
UUID templateUuid = new UUID(); // UUID | Template UUID
UUID mailboxUuid = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID versionUuid = new UUID(); // UUID | Template version UUID
try {
    DataMap result = apiInstance.generate(templateUuid, mailboxUuid, versionUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#generate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateUuid** | [**UUID**](.md)| Template UUID |
 **mailboxUuid** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **versionUuid** | [**UUID**](.md)| Template version UUID | [optional]

### Return type

[**DataMap**](DataMap.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMailboxIntegration"></a>
# **getMailboxIntegration**
> IntegrationDTO getMailboxIntegration(mailboxUuid)

Get Mailbox integration

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
UUID mailboxUuid = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    IntegrationDTO result = apiInstance.getMailboxIntegration(mailboxUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#getMailboxIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailboxUuid** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**IntegrationDTO**](IntegrationDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMailboxIntegrationRule"></a>
# **getMailboxIntegrationRule**
> IntegrationRuleDTO getMailboxIntegrationRule(integrationRuleUuid)

Get Mailbox integration rule

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
UUID integrationRuleUuid = new UUID(); // UUID | UUID of integration rule
try {
    IntegrationRuleDTO result = apiInstance.getMailboxIntegrationRule(integrationRuleUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#getMailboxIntegrationRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationRuleUuid** | [**UUID**](.md)| UUID of integration rule |

### Return type

[**IntegrationRuleDTO**](IntegrationRuleDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMailboxIntegrationRules"></a>
# **getMailboxIntegrationRules**
> List&lt;IntegrationRuleDTO&gt; getMailboxIntegrationRules(mailboxUuid)

Get Mailbox integration rules

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
UUID mailboxUuid = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<IntegrationRuleDTO> result = apiInstance.getMailboxIntegrationRules(mailboxUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#getMailboxIntegrationRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailboxUuid** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;IntegrationRuleDTO&gt;**](IntegrationRuleDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="newPassword"></a>
# **newPassword**
> Object newPassword(mailboxUuid)

Generate and save new password

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
UUID mailboxUuid = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    Object result = apiInstance.newPassword(mailboxUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#newPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailboxUuid** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="saveMailboxIntegration"></a>
# **saveMailboxIntegration**
> saveMailboxIntegration(body, mailboxUuid)

Create/update Mailbox integration

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
IntegrationDTO body = new IntegrationDTO(); // IntegrationDTO | 
UUID mailboxUuid = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.saveMailboxIntegration(body, mailboxUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#saveMailboxIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IntegrationDTO**](IntegrationDTO.md)|  |
 **mailboxUuid** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateMailboxIntegrationRule"></a>
# **updateMailboxIntegrationRule**
> IntegrationRuleDTO updateMailboxIntegrationRule(body, integrationRuleUuid)

Update Mailbox integration rule

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
IntegrationRuleDTO body = new IntegrationRuleDTO(); // IntegrationRuleDTO | 
UUID integrationRuleUuid = new UUID(); // UUID | UUID of integration rule
try {
    IntegrationRuleDTO result = apiInstance.updateMailboxIntegrationRule(body, integrationRuleUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#updateMailboxIntegrationRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IntegrationRuleDTO**](IntegrationRuleDTO.md)|  |
 **integrationRuleUuid** | [**UUID**](.md)| UUID of integration rule |

### Return type

[**IntegrationRuleDTO**](IntegrationRuleDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

