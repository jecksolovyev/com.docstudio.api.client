# IntegrationControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertBinaryToXML**](IntegrationControllerApi.md#convertBinaryToXML) | **POST** /api/v1/integration/convert-binary | Convert incoming file to XML view
[**createIntegrationRule**](IntegrationControllerApi.md#createIntegrationRule) | **POST** /api/v1/integration/rule | Create integration rule
[**deleteIntegrationRule**](IntegrationControllerApi.md#deleteIntegrationRule) | **DELETE** /api/v1/integration/rule/{integrationRuleUuid} | Delete integration rule
[**execute**](IntegrationControllerApi.md#execute) | **POST** /api/v1/integration/rule/execute | Execute conversion map and generate file name (if pattern rule defined)
[**generate**](IntegrationControllerApi.md#generate) | **GET** /api/v1/integration/source/{templateUuid}/{mailboxUuid} | Generate envelope XML by template
[**getExchangeCertificate**](IntegrationControllerApi.md#getExchangeCertificate) | **GET** /api/v1/integration/exchange-certificate | Get public exchange certificate
[**getIntegrationRule**](IntegrationControllerApi.md#getIntegrationRule) | **GET** /api/v1/integration/rule/{integrationRuleUuid} | Get integration rule
[**getIntegrationRules**](IntegrationControllerApi.md#getIntegrationRules) | **GET** /api/v1/integration/rules/{accountUuid} | Get account integration rules
[**getMailboxIntegration**](IntegrationControllerApi.md#getMailboxIntegration) | **GET** /api/v1/integration/{mailboxUuid} | Get Mailbox integration
[**newPassword**](IntegrationControllerApi.md#newPassword) | **POST** /api/v1/integration/new-password/{mailboxUuid} | Generate and save new password
[**saveMailboxIntegration**](IntegrationControllerApi.md#saveMailboxIntegration) | **POST** /api/v1/integration/{mailboxUuid} | Create/update Mailbox integration
[**updateIntegrationRule**](IntegrationControllerApi.md#updateIntegrationRule) | **PUT** /api/v1/integration/rule/{integrationRuleUuid} | Update integration rule

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
//import com.docstudio.client.api.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
String filename = "filename_example"; // String | filename, for type detection
UUID mailboxUuid = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
byte[] body = null; // byte[] | 
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
 **body** | [**byte[]**](byte[].md)|  | [optional]

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIntegrationRule"></a>
# **createIntegrationRule**
> IntegrationRuleDTO createIntegrationRule(body)

Create integration rule

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
IntegrationRuleDTO body = new IntegrationRuleDTO(); // IntegrationRuleDTO | 
try {
    IntegrationRuleDTO result = apiInstance.createIntegrationRule(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#createIntegrationRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IntegrationRuleDTO**](IntegrationRuleDTO.md)|  |

### Return type

[**IntegrationRuleDTO**](IntegrationRuleDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIntegrationRule"></a>
# **deleteIntegrationRule**
> deleteIntegrationRule(integrationRuleUuid)

Delete integration rule

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
UUID integrationRuleUuid = new UUID(); // UUID | UUID of integration rule
try {
    apiInstance.deleteIntegrationRule(integrationRuleUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#deleteIntegrationRule");
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
//import com.docstudio.client.api.IntegrationControllerApi;

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
//import com.docstudio.client.api.IntegrationControllerApi;

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

<a name="getExchangeCertificate"></a>
# **getExchangeCertificate**
> byte[] getExchangeCertificate()

Get public exchange certificate

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
try {
    byte[] result = apiInstance.getExchangeCertificate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#getExchangeCertificate");
    e.printStackTrace();
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

<a name="getIntegrationRule"></a>
# **getIntegrationRule**
> IntegrationRuleDTO getIntegrationRule(integrationRuleUuid)

Get integration rule

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
UUID integrationRuleUuid = new UUID(); // UUID | UUID of integration rule
try {
    IntegrationRuleDTO result = apiInstance.getIntegrationRule(integrationRuleUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#getIntegrationRule");
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

<a name="getIntegrationRules"></a>
# **getIntegrationRules**
> List&lt;IntegrationRuleDTO&gt; getIntegrationRules(accountUuid, mailboxUuid)

Get account integration rules

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
UUID accountUuid = new UUID(); // UUID | 
UUID mailboxUuid = new UUID(); // UUID | Mailbox UUID
try {
    List<IntegrationRuleDTO> result = apiInstance.getIntegrationRules(accountUuid, mailboxUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#getIntegrationRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)|  |
 **mailboxUuid** | [**UUID**](.md)| Mailbox UUID |

### Return type

[**List&lt;IntegrationRuleDTO&gt;**](IntegrationRuleDTO.md)

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
//import com.docstudio.client.api.IntegrationControllerApi;

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
//import com.docstudio.client.api.IntegrationControllerApi;

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
> IntegrationDTO saveMailboxIntegration(body, mailboxUuid)

Create/update Mailbox integration

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
IntegrationDTO body = new IntegrationDTO(); // IntegrationDTO | 
UUID mailboxUuid = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    IntegrationDTO result = apiInstance.saveMailboxIntegration(body, mailboxUuid);
    System.out.println(result);
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

[**IntegrationDTO**](IntegrationDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIntegrationRule"></a>
# **updateIntegrationRule**
> IntegrationRuleDTO updateIntegrationRule(body, integrationRuleUuid)

Update integration rule

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.IntegrationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationControllerApi apiInstance = new IntegrationControllerApi();
IntegrationRuleDTO body = new IntegrationRuleDTO(); // IntegrationRuleDTO | 
UUID integrationRuleUuid = new UUID(); // UUID | UUID of integration rule
try {
    IntegrationRuleDTO result = apiInstance.updateIntegrationRule(body, integrationRuleUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationControllerApi#updateIntegrationRule");
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

