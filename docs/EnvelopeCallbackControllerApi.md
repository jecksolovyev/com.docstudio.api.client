# EnvelopeCallbackControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkCallback**](EnvelopeCallbackControllerApi.md#checkCallback) | **GET** /api/v1/envelope/callback/{callbackUuid}/check | Check callback with certain envelope
[**createCallback**](EnvelopeCallbackControllerApi.md#createCallback) | **POST** /api/v1/envelope/callback/add | Add new callback
[**listCallbacks**](EnvelopeCallbackControllerApi.md#listCallbacks) | **GET** /api/v1/envelope/callback/list | List callbacks
[**removeCallback**](EnvelopeCallbackControllerApi.md#removeCallback) | **DELETE** /api/v1/envelope/callback/{callbackUuid}/remove | Delete callback
[**sendCallback**](EnvelopeCallbackControllerApi.md#sendCallback) | **GET** /api/v1/envelope/callback/{callbackUuid}/send | Send callback with certain envelope

<a name="checkCallback"></a>
# **checkCallback**
> EnvelopeCheckResultDTO checkCallback(callbackUuid, envelopeUuid, mailboxUuid)

Check callback with certain envelope

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.EnvelopeCallbackControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeCallbackControllerApi apiInstance = new EnvelopeCallbackControllerApi();
UUID callbackUuid = new UUID(); // UUID | Callback id
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
UUID mailboxUuid = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    EnvelopeCheckResultDTO result = apiInstance.checkCallback(callbackUuid, envelopeUuid, mailboxUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeCallbackControllerApi#checkCallback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callbackUuid** | [**UUID**](.md)| Callback id |
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID |
 **mailboxUuid** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**EnvelopeCheckResultDTO**](EnvelopeCheckResultDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCallback"></a>
# **createCallback**
> EnvelopeCallbackDTO createCallback(body, mailbox)

Add new callback

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.EnvelopeCallbackControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeCallbackControllerApi apiInstance = new EnvelopeCallbackControllerApi();
CreateEnvelopeCallbackDTO body = new CreateEnvelopeCallbackDTO(); // CreateEnvelopeCallbackDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    EnvelopeCallbackDTO result = apiInstance.createCallback(body, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeCallbackControllerApi#createCallback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateEnvelopeCallbackDTO**](CreateEnvelopeCallbackDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**EnvelopeCallbackDTO**](EnvelopeCallbackDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCallbacks"></a>
# **listCallbacks**
> List&lt;EnvelopeCallbackDTO&gt; listCallbacks(mailbox)

List callbacks

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.EnvelopeCallbackControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeCallbackControllerApi apiInstance = new EnvelopeCallbackControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<EnvelopeCallbackDTO> result = apiInstance.listCallbacks(mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeCallbackControllerApi#listCallbacks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;EnvelopeCallbackDTO&gt;**](EnvelopeCallbackDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeCallback"></a>
# **removeCallback**
> removeCallback(callbackUuid, mailbox)

Delete callback

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.EnvelopeCallbackControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeCallbackControllerApi apiInstance = new EnvelopeCallbackControllerApi();
UUID callbackUuid = new UUID(); // UUID | Callback id
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.removeCallback(callbackUuid, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeCallbackControllerApi#removeCallback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callbackUuid** | [**UUID**](.md)| Callback id |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="sendCallback"></a>
# **sendCallback**
> EnvelopeSendResultDTO sendCallback(callbackUuid, envelopeUuid, mailboxUuid)

Send callback with certain envelope

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.EnvelopeCallbackControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeCallbackControllerApi apiInstance = new EnvelopeCallbackControllerApi();
UUID callbackUuid = new UUID(); // UUID | Callback id
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
UUID mailboxUuid = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    EnvelopeSendResultDTO result = apiInstance.sendCallback(callbackUuid, envelopeUuid, mailboxUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeCallbackControllerApi#sendCallback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callbackUuid** | [**UUID**](.md)| Callback id |
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID |
 **mailboxUuid** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**EnvelopeSendResultDTO**](EnvelopeSendResultDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

