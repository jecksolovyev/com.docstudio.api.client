# ApprovalFlowControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create7**](ApprovalFlowControllerApi.md#create7) | **POST** /api/v1/approvalFlow | Create approval flow |
| [**delete5**](ApprovalFlowControllerApi.md#delete5) | **DELETE** /api/v1/approvalFlow | Delete approval flows |
| [**retrieve**](ApprovalFlowControllerApi.md#retrieve) | **GET** /api/v1/approvalFlow/{flowUuid} | Retrieve approval flow |
| [**search**](ApprovalFlowControllerApi.md#search) | **GET** /api/v1/approvalFlow | Retrieve approval flows |
| [**update7**](ApprovalFlowControllerApi.md#update7) | **PUT** /api/v1/approvalFlow/{flowUuid} | Update approval flow |


<a id="create7"></a>
# **create7**
> SingleUuidDTO create7(mailbox, mailboxApprovalFlowDTO)

Create approval flow

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ApprovalFlowControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    ApprovalFlowControllerApi apiInstance = new ApprovalFlowControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    MailboxApprovalFlowDTO mailboxApprovalFlowDTO = new MailboxApprovalFlowDTO(); // MailboxApprovalFlowDTO | 
    try {
      SingleUuidDTO result = apiInstance.create7(mailbox, mailboxApprovalFlowDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalFlowControllerApi#create7");
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
| **mailboxApprovalFlowDTO** | [**MailboxApprovalFlowDTO**](MailboxApprovalFlowDTO.md)|  | |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="delete5"></a>
# **delete5**
> delete5(mailbox, UUID)

Delete approval flows

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ApprovalFlowControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    ApprovalFlowControllerApi apiInstance = new ApprovalFlowControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    try {
      apiInstance.delete5(mailbox, UUID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalFlowControllerApi#delete5");
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
| **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="retrieve"></a>
# **retrieve**
> MailboxApprovalFlowGetDTO retrieve(flowUuid, mailbox)

Retrieve approval flow

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ApprovalFlowControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    ApprovalFlowControllerApi apiInstance = new ApprovalFlowControllerApi(defaultClient);
    UUID flowUuid = UUID.randomUUID(); // UUID | UUID of the approval flow
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      MailboxApprovalFlowGetDTO result = apiInstance.retrieve(flowUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalFlowControllerApi#retrieve");
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
| **flowUuid** | **UUID**| UUID of the approval flow | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**MailboxApprovalFlowGetDTO**](MailboxApprovalFlowGetDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="search"></a>
# **search**
> PageDTOMailboxApprovalFlowGetDTO search(mailbox, keyword, offset, limit)

Retrieve approval flows

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ApprovalFlowControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    ApprovalFlowControllerApi apiInstance = new ApprovalFlowControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    String keyword = "keyword_example"; // String | Keyword to search approval flow by name
    Integer offset = 0; // Integer | Offset records
    Integer limit = 25; // Integer | Limit records, max is 1000
    try {
      PageDTOMailboxApprovalFlowGetDTO result = apiInstance.search(mailbox, keyword, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalFlowControllerApi#search");
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
| **keyword** | **String**| Keyword to search approval flow by name | [optional] |
| **offset** | **Integer**| Offset records | [optional] [default to 0] |
| **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25] |

### Return type

[**PageDTOMailboxApprovalFlowGetDTO**](PageDTOMailboxApprovalFlowGetDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="update7"></a>
# **update7**
> update7(flowUuid, mailbox, mailboxApprovalFlowDTO)

Update approval flow

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ApprovalFlowControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    ApprovalFlowControllerApi apiInstance = new ApprovalFlowControllerApi(defaultClient);
    UUID flowUuid = UUID.randomUUID(); // UUID | UUID of the approval flow
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    MailboxApprovalFlowDTO mailboxApprovalFlowDTO = new MailboxApprovalFlowDTO(); // MailboxApprovalFlowDTO | 
    try {
      apiInstance.update7(flowUuid, mailbox, mailboxApprovalFlowDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApprovalFlowControllerApi#update7");
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
| **flowUuid** | **UUID**| UUID of the approval flow | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **mailboxApprovalFlowDTO** | [**MailboxApprovalFlowDTO**](MailboxApprovalFlowDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

