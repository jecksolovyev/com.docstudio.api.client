# ExternalLinkControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createExternalLink**](ExternalLinkControllerApi.md#createExternalLink) | **POST** /api/v1/account/{accountUuid}/external-link | Create external link |
| [**deleteExternalLink**](ExternalLinkControllerApi.md#deleteExternalLink) | **DELETE** /api/v1/account/{accountUuid}/external-link/{linkUuid} | Delete external link |
| [**getAccountExternalLinks**](ExternalLinkControllerApi.md#getAccountExternalLinks) | **GET** /api/v1/account/{accountUuid}/external-link | Get account external links |
| [**getMailboxList**](ExternalLinkControllerApi.md#getMailboxList) | **GET** /api/v1/external-link | Get mailbox visible link list |
| [**updateExternalLink**](ExternalLinkControllerApi.md#updateExternalLink) | **PUT** /api/v1/account/{accountUuid}/external-link/{linkUuid} | Update external link |


<a id="createExternalLink"></a>
# **createExternalLink**
> ExternalLinkResponseDTO createExternalLink(accountUuid, externalLinkRequestDTO)

Create external link

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ExternalLinkControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    ExternalLinkControllerApi apiInstance = new ExternalLinkControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    ExternalLinkRequestDTO externalLinkRequestDTO = new ExternalLinkRequestDTO(); // ExternalLinkRequestDTO | 
    try {
      ExternalLinkResponseDTO result = apiInstance.createExternalLink(accountUuid, externalLinkRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalLinkControllerApi#createExternalLink");
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
| **accountUuid** | **UUID**| Account UUID | |
| **externalLinkRequestDTO** | [**ExternalLinkRequestDTO**](ExternalLinkRequestDTO.md)|  | |

### Return type

[**ExternalLinkResponseDTO**](ExternalLinkResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteExternalLink"></a>
# **deleteExternalLink**
> deleteExternalLink(accountUuid, linkUuid)

Delete external link

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ExternalLinkControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    ExternalLinkControllerApi apiInstance = new ExternalLinkControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID linkUuid = UUID.randomUUID(); // UUID | Link UUID
    try {
      apiInstance.deleteExternalLink(accountUuid, linkUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalLinkControllerApi#deleteExternalLink");
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
| **accountUuid** | **UUID**| Account UUID | |
| **linkUuid** | **UUID**| Link UUID | |

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
| **204** | No Content |  -  |

<a id="getAccountExternalLinks"></a>
# **getAccountExternalLinks**
> List&lt;ExternalLinkResponseDTO&gt; getAccountExternalLinks(accountUuid)

Get account external links

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ExternalLinkControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    ExternalLinkControllerApi apiInstance = new ExternalLinkControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    try {
      List<ExternalLinkResponseDTO> result = apiInstance.getAccountExternalLinks(accountUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalLinkControllerApi#getAccountExternalLinks");
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
| **accountUuid** | **UUID**| Account UUID | |

### Return type

[**List&lt;ExternalLinkResponseDTO&gt;**](ExternalLinkResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMailboxList"></a>
# **getMailboxList**
> List&lt;ExternalLinkShortResponseDTO&gt; getMailboxList(mailbox)

Get mailbox visible link list

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ExternalLinkControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    ExternalLinkControllerApi apiInstance = new ExternalLinkControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<ExternalLinkShortResponseDTO> result = apiInstance.getMailboxList(mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalLinkControllerApi#getMailboxList");
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

[**List&lt;ExternalLinkShortResponseDTO&gt;**](ExternalLinkShortResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateExternalLink"></a>
# **updateExternalLink**
> ExternalLinkResponseDTO updateExternalLink(accountUuid, linkUuid, externalLinkRequestDTO)

Update external link

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ExternalLinkControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    ExternalLinkControllerApi apiInstance = new ExternalLinkControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID linkUuid = UUID.randomUUID(); // UUID | Link UUID
    ExternalLinkRequestDTO externalLinkRequestDTO = new ExternalLinkRequestDTO(); // ExternalLinkRequestDTO | 
    try {
      ExternalLinkResponseDTO result = apiInstance.updateExternalLink(accountUuid, linkUuid, externalLinkRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalLinkControllerApi#updateExternalLink");
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
| **accountUuid** | **UUID**| Account UUID | |
| **linkUuid** | **UUID**| Link UUID | |
| **externalLinkRequestDTO** | [**ExternalLinkRequestDTO**](ExternalLinkRequestDTO.md)|  | |

### Return type

[**ExternalLinkResponseDTO**](ExternalLinkResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

