# ExternalLinkControllerApi

All URIs are relative to *https://api.centredo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExternalLink**](ExternalLinkControllerApi.md#createExternalLink) | **POST** /api/v1/account/{accountUuid}/external-link | Create external link
[**deleteExternalLink**](ExternalLinkControllerApi.md#deleteExternalLink) | **DELETE** /api/v1/account/{accountUuid}/external-link/{linkUuid} | Delete external link
[**getAccountExternalLinks**](ExternalLinkControllerApi.md#getAccountExternalLinks) | **GET** /api/v1/account/{accountUuid}/external-link | Get account external links
[**getMailboxList**](ExternalLinkControllerApi.md#getMailboxList) | **GET** /api/v1/external-link | Get mailbox visible link list
[**updateExternalLink**](ExternalLinkControllerApi.md#updateExternalLink) | **PUT** /api/v1/account/{accountUuid}/external-link/{linkUuid} | Update external link

<a name="createExternalLink"></a>
# **createExternalLink**
> ExternalLinkResponseDTO createExternalLink(body, accountUuid)

Create external link

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExternalLinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExternalLinkControllerApi apiInstance = new ExternalLinkControllerApi();
ExternalLinkRequestDTO body = new ExternalLinkRequestDTO(); // ExternalLinkRequestDTO | 
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    ExternalLinkResponseDTO result = apiInstance.createExternalLink(body, accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalLinkControllerApi#createExternalLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExternalLinkRequestDTO**](ExternalLinkRequestDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

[**ExternalLinkResponseDTO**](ExternalLinkResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteExternalLink"></a>
# **deleteExternalLink**
> deleteExternalLink(accountUuid, linkUuid)

Delete external link

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExternalLinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExternalLinkControllerApi apiInstance = new ExternalLinkControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID linkUuid = new UUID(); // UUID | Link UUID
try {
    apiInstance.deleteExternalLink(accountUuid, linkUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalLinkControllerApi#deleteExternalLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **linkUuid** | [**UUID**](.md)| Link UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAccountExternalLinks"></a>
# **getAccountExternalLinks**
> List&lt;ExternalLinkResponseDTO&gt; getAccountExternalLinks(accountUuid)

Get account external links

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExternalLinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExternalLinkControllerApi apiInstance = new ExternalLinkControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    List<ExternalLinkResponseDTO> result = apiInstance.getAccountExternalLinks(accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalLinkControllerApi#getAccountExternalLinks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

[**List&lt;ExternalLinkResponseDTO&gt;**](ExternalLinkResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMailboxList"></a>
# **getMailboxList**
> List&lt;ExternalLinkShortResponseDTO&gt; getMailboxList(mailbox)

Get mailbox visible link list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExternalLinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExternalLinkControllerApi apiInstance = new ExternalLinkControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<ExternalLinkShortResponseDTO> result = apiInstance.getMailboxList(mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalLinkControllerApi#getMailboxList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;ExternalLinkShortResponseDTO&gt;**](ExternalLinkShortResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateExternalLink"></a>
# **updateExternalLink**
> ExternalLinkResponseDTO updateExternalLink(body, accountUuid, linkUuid)

Update external link

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExternalLinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExternalLinkControllerApi apiInstance = new ExternalLinkControllerApi();
ExternalLinkRequestDTO body = new ExternalLinkRequestDTO(); // ExternalLinkRequestDTO | 
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID linkUuid = new UUID(); // UUID | Link UUID
try {
    ExternalLinkResponseDTO result = apiInstance.updateExternalLink(body, accountUuid, linkUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalLinkControllerApi#updateExternalLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExternalLinkRequestDTO**](ExternalLinkRequestDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **linkUuid** | [**UUID**](.md)| Link UUID |

### Return type

[**ExternalLinkResponseDTO**](ExternalLinkResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

