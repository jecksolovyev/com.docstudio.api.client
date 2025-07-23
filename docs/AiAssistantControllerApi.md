# AiAssistantControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**envelopeAssistConversationGet**](AiAssistantControllerApi.md#envelopeAssistConversationGet) | **GET** /api/v1/ai-assistant/envelope/{id}/history | Retrieve existing chat with AI assistant for envelope |
| [**envelopeAssistRequest**](AiAssistantControllerApi.md#envelopeAssistRequest) | **GET** /api/v1/ai-assistant/envelope/{id} | Chat with AI assistant |


<a id="envelopeAssistConversationGet"></a>
# **envelopeAssistConversationGet**
> AiAssistantConversation envelopeAssistConversationGet(id, mailbox)

Retrieve existing chat with AI assistant for envelope

Empty conversation will be returned if no conversation exists

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AiAssistantControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AiAssistantControllerApi apiInstance = new AiAssistantControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | UUID of Envelope
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      AiAssistantConversation result = apiInstance.envelopeAssistConversationGet(id, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiAssistantControllerApi#envelopeAssistConversationGet");
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
| **id** | **UUID**| UUID of Envelope | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**AiAssistantConversation**](AiAssistantConversation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="envelopeAssistRequest"></a>
# **envelopeAssistRequest**
> String envelopeAssistRequest(id, mailbox, message)

Chat with AI assistant

Ask question or request summary about envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AiAssistantControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AiAssistantControllerApi apiInstance = new AiAssistantControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | UUID of Envelope
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    String message = "message_example"; // String | User message
    try {
      String result = apiInstance.envelopeAssistRequest(id, mailbox, message);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiAssistantControllerApi#envelopeAssistRequest");
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
| **id** | **UUID**| UUID of Envelope | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **message** | **String**| User message | [optional] |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/event-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Server sent events stream |  -  |

