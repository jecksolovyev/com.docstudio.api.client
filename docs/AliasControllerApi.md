# AliasControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAlias**](AliasControllerApi.md#createAlias) | **POST** /api/v1/alias | Save alias to mailbox
[**deleteAlias**](AliasControllerApi.md#deleteAlias) | **DELETE** /api/v1/alias | Delete alias
[**getAllByMailbox**](AliasControllerApi.md#getAllByMailbox) | **GET** /api/v1/alias/mailbox | Get aliases by mailbox

<a name="createAlias"></a>
# **createAlias**
> AliasDTO createAlias(body, mailbox)

Save alias to mailbox

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AliasControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AliasControllerApi apiInstance = new AliasControllerApi();
AliasDTO body = new AliasDTO(); // AliasDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    AliasDTO result = apiInstance.createAlias(body, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasControllerApi#createAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AliasDTO**](AliasDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**AliasDTO**](AliasDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAlias"></a>
# **deleteAlias**
> deleteAlias(name, mailbox)

Delete alias

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AliasControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AliasControllerApi apiInstance = new AliasControllerApi();
String name = "name_example"; // String | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.deleteAlias(name, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasControllerApi#deleteAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllByMailbox"></a>
# **getAllByMailbox**
> List&lt;AliasDTO&gt; getAllByMailbox(mailbox)

Get aliases by mailbox

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AliasControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AliasControllerApi apiInstance = new AliasControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<AliasDTO> result = apiInstance.getAllByMailbox(mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasControllerApi#getAllByMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;AliasDTO&gt;**](AliasDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

