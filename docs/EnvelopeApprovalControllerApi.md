# EnvelopeApprovalControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addReviewers**](EnvelopeApprovalControllerApi.md#addReviewers) | **PUT** /api/v1/envelope/editorial-review/{id}/flow | Add reviewers to a running editorial review |
| [**cancelApprovalFlow**](EnvelopeApprovalControllerApi.md#cancelApprovalFlow) | **DELETE** /api/v1/envelope/{id}/approval/{flowUuid} | Cancel envelope approval |
| [**envelopeApproval**](EnvelopeApprovalControllerApi.md#envelopeApproval) | **PUT** /api/v1/envelope/approval | Approve or Reject envelopes |
| [**envelopeApprovalHistory**](EnvelopeApprovalControllerApi.md#envelopeApprovalHistory) | **GET** /api/v1/envelope/{id}/approval-history | Get approval history |
| [**getApprovalFlow**](EnvelopeApprovalControllerApi.md#getApprovalFlow) | **GET** /api/v1/envelope/{id}/approval/{flowUuid} | Get envelope approval |
| [**reworkEditorialReview**](EnvelopeApprovalControllerApi.md#reworkEditorialReview) | **POST** /api/v1/envelope/editorial-review/{id}/rework | Send editorial review back for rework |
| [**sendForApproval**](EnvelopeApprovalControllerApi.md#sendForApproval) | **PUT** /api/v1/envelope/send-for-approval | Send envelope for approval |
| [**startEditorialReviewForExternalDocuments**](EnvelopeApprovalControllerApi.md#startEditorialReviewForExternalDocuments) | **POST** /api/v1/envelope/editorial-review | Start editorial review of DOC, DOCX |


<a id="addReviewers"></a>
# **addReviewers**
> addReviewers(id, mailbox, reviewFlowUpdateRequest)

Add reviewers to a running editorial review

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeApprovalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeApprovalControllerApi apiInstance = new EnvelopeApprovalControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope of the editorial review
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    ReviewFlowUpdateRequest reviewFlowUpdateRequest = new ReviewFlowUpdateRequest(); // ReviewFlowUpdateRequest | 
    try {
      apiInstance.addReviewers(id, mailbox, reviewFlowUpdateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeApprovalControllerApi#addReviewers");
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
| **id** | **UUID**| Envelope of the editorial review | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **reviewFlowUpdateRequest** | [**ReviewFlowUpdateRequest**](ReviewFlowUpdateRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="cancelApprovalFlow"></a>
# **cancelApprovalFlow**
> cancelApprovalFlow(id, flowUuid, mailbox)

Cancel envelope approval

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeApprovalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeApprovalControllerApi apiInstance = new EnvelopeApprovalControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope to approve
    UUID flowUuid = UUID.randomUUID(); // UUID | Flow to approve
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.cancelApprovalFlow(id, flowUuid, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeApprovalControllerApi#cancelApprovalFlow");
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
| **id** | **UUID**| Envelope to approve | |
| **flowUuid** | **UUID**| Flow to approve | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="envelopeApproval"></a>
# **envelopeApproval**
> envelopeApproval(mailbox, approvalStatusDTO)

Approve or Reject envelopes

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeApprovalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeApprovalControllerApi apiInstance = new EnvelopeApprovalControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    ApprovalStatusDTO approvalStatusDTO = new ApprovalStatusDTO(); // ApprovalStatusDTO | 
    try {
      apiInstance.envelopeApproval(mailbox, approvalStatusDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeApprovalControllerApi#envelopeApproval");
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
| **approvalStatusDTO** | [**ApprovalStatusDTO**](ApprovalStatusDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="envelopeApprovalHistory"></a>
# **envelopeApprovalHistory**
> List&lt;EnvelopeApprovalHistoryDTO&gt; envelopeApprovalHistory(id, mailbox)

Get approval history

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeApprovalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeApprovalControllerApi apiInstance = new EnvelopeApprovalControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<EnvelopeApprovalHistoryDTO> result = apiInstance.envelopeApprovalHistory(id, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeApprovalControllerApi#envelopeApprovalHistory");
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
| **id** | **UUID**| Envelope UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**List&lt;EnvelopeApprovalHistoryDTO&gt;**](EnvelopeApprovalHistoryDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApprovalFlow"></a>
# **getApprovalFlow**
> EnvelopeApprovalHistoryDTO getApprovalFlow(id, flowUuid, mailbox)

Get envelope approval

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeApprovalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeApprovalControllerApi apiInstance = new EnvelopeApprovalControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope to approve
    UUID flowUuid = UUID.randomUUID(); // UUID | Flow to approve
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      EnvelopeApprovalHistoryDTO result = apiInstance.getApprovalFlow(id, flowUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeApprovalControllerApi#getApprovalFlow");
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
| **id** | **UUID**| Envelope to approve | |
| **flowUuid** | **UUID**| Flow to approve | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**EnvelopeApprovalHistoryDTO**](EnvelopeApprovalHistoryDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="reworkEditorialReview"></a>
# **reworkEditorialReview**
> reworkEditorialReview(id, mailbox, reviewReworkRequest)

Send editorial review back for rework

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeApprovalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeApprovalControllerApi apiInstance = new EnvelopeApprovalControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Id of envelope
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    ReviewReworkRequest reviewReworkRequest = new ReviewReworkRequest(); // ReviewReworkRequest | 
    try {
      apiInstance.reworkEditorialReview(id, mailbox, reviewReworkRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeApprovalControllerApi#reworkEditorialReview");
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
| **id** | **UUID**| Id of envelope | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **reviewReworkRequest** | [**ReviewReworkRequest**](ReviewReworkRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="sendForApproval"></a>
# **sendForApproval**
> SingleUuidDTO sendForApproval(mailbox, envelopeApprovalRequestDTO)

Send envelope for approval

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeApprovalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeApprovalControllerApi apiInstance = new EnvelopeApprovalControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvelopeApprovalRequestDTO envelopeApprovalRequestDTO = new EnvelopeApprovalRequestDTO(); // EnvelopeApprovalRequestDTO | 
    try {
      SingleUuidDTO result = apiInstance.sendForApproval(mailbox, envelopeApprovalRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeApprovalControllerApi#sendForApproval");
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
| **envelopeApprovalRequestDTO** | [**EnvelopeApprovalRequestDTO**](EnvelopeApprovalRequestDTO.md)|  | |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="startEditorialReviewForExternalDocuments"></a>
# **startEditorialReviewForExternalDocuments**
> SingleUuidDTO startEditorialReviewForExternalDocuments(mailbox, data, files)

Start editorial review of DOC, DOCX

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeApprovalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeApprovalControllerApi apiInstance = new EnvelopeApprovalControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EditorialReviewInitRequest data = new EditorialReviewInitRequest(); // EditorialReviewInitRequest | 
    List<File> files = Arrays.asList(); // List<File> | Files for external documents
    try {
      SingleUuidDTO result = apiInstance.startEditorialReviewForExternalDocuments(mailbox, data, files);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeApprovalControllerApi#startEditorialReviewForExternalDocuments");
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
| **data** | [**EditorialReviewInitRequest**](EditorialReviewInitRequest.md)|  | |
| **files** | **List&lt;File&gt;**| Files for external documents | |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

