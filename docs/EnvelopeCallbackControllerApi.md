# EnvelopeCallbackControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkCallback**](EnvelopeCallbackControllerApi.md#checkCallback) | **GET** /api/v1/envelope/callback/{callbackUuid}/check | Check callback with certain envelope |
| [**createCallback**](EnvelopeCallbackControllerApi.md#createCallback) | **POST** /api/v1/envelope/callback/add | Add new callback |
| [**listCallbacks**](EnvelopeCallbackControllerApi.md#listCallbacks) | **GET** /api/v1/envelope/callback/list | List callbacks |
| [**removeCallback**](EnvelopeCallbackControllerApi.md#removeCallback) | **DELETE** /api/v1/envelope/callback/{callbackUuid}/remove | Delete callback |
| [**sendCallback**](EnvelopeCallbackControllerApi.md#sendCallback) | **GET** /api/v1/envelope/callback/{callbackUuid}/send | Send callback with certain envelope |


<a id="checkCallback"></a>
# **checkCallback**
> EnvelopeCheckResultDTO checkCallback(callbackUuid, envelopeUuid, mailboxUuid)

Check callback with certain envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCallbackControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeCallbackControllerApi apiInstance = new EnvelopeCallbackControllerApi(defaultClient);
    UUID callbackUuid = UUID.randomUUID(); // UUID | Callback id
    UUID envelopeUuid = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailboxUuid = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      EnvelopeCheckResultDTO result = apiInstance.checkCallback(callbackUuid, envelopeUuid, mailboxUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCallbackControllerApi#checkCallback");
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
| **callbackUuid** | **UUID**| Callback id | |
| **envelopeUuid** | **UUID**| Envelope UUID | |
| **mailboxUuid** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**EnvelopeCheckResultDTO**](EnvelopeCheckResultDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createCallback"></a>
# **createCallback**
> EnvelopeCallbackDTO createCallback(mailbox, createEnvelopeCallbackDTO)

Add new callback

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCallbackControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeCallbackControllerApi apiInstance = new EnvelopeCallbackControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    CreateEnvelopeCallbackDTO createEnvelopeCallbackDTO = new CreateEnvelopeCallbackDTO(); // CreateEnvelopeCallbackDTO | 
    try {
      EnvelopeCallbackDTO result = apiInstance.createCallback(mailbox, createEnvelopeCallbackDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCallbackControllerApi#createCallback");
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
| **createEnvelopeCallbackDTO** | [**CreateEnvelopeCallbackDTO**](CreateEnvelopeCallbackDTO.md)|  | |

### Return type

[**EnvelopeCallbackDTO**](EnvelopeCallbackDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="listCallbacks"></a>
# **listCallbacks**
> List&lt;EnvelopeCallbackDTO&gt; listCallbacks(mailbox)

List callbacks

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCallbackControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeCallbackControllerApi apiInstance = new EnvelopeCallbackControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<EnvelopeCallbackDTO> result = apiInstance.listCallbacks(mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCallbackControllerApi#listCallbacks");
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

[**List&lt;EnvelopeCallbackDTO&gt;**](EnvelopeCallbackDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="removeCallback"></a>
# **removeCallback**
> removeCallback(callbackUuid, mailbox)

Delete callback

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCallbackControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeCallbackControllerApi apiInstance = new EnvelopeCallbackControllerApi(defaultClient);
    UUID callbackUuid = UUID.randomUUID(); // UUID | Callback id
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.removeCallback(callbackUuid, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCallbackControllerApi#removeCallback");
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
| **callbackUuid** | **UUID**| Callback id | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

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

<a id="sendCallback"></a>
# **sendCallback**
> EnvelopeSendResultDTO sendCallback(callbackUuid, envelopeUuid, mailboxUuid)

Send callback with certain envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCallbackControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeCallbackControllerApi apiInstance = new EnvelopeCallbackControllerApi(defaultClient);
    UUID callbackUuid = UUID.randomUUID(); // UUID | Callback id
    UUID envelopeUuid = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailboxUuid = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      EnvelopeSendResultDTO result = apiInstance.sendCallback(callbackUuid, envelopeUuid, mailboxUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCallbackControllerApi#sendCallback");
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
| **callbackUuid** | **UUID**| Callback id | |
| **envelopeUuid** | **UUID**| Envelope UUID | |
| **mailboxUuid** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**EnvelopeSendResultDTO**](EnvelopeSendResultDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

