# EnvelopeCollaborationControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEnvelopesIntoChain**](EnvelopeCollaborationControllerApi.md#addEnvelopesIntoChain) | **PUT** /api/v1/envelope/chain/{chainId} | Add envelopes into chain |
| [**createEnvelopeComment**](EnvelopeCollaborationControllerApi.md#createEnvelopeComment) | **POST** /api/v1/envelope/{id}/comment | Create envelope comment thread |
| [**deleteEnvelopeComment**](EnvelopeCollaborationControllerApi.md#deleteEnvelopeComment) | **DELETE** /api/v1/envelope/{id}/comment | Delete envelope comment in thread or the whole thread |
| [**getChainEnvelopes**](EnvelopeCollaborationControllerApi.md#getChainEnvelopes) | **GET** /api/v1/envelope/chain/{chainId} | Get chain envelopes list |
| [**getEnvelopeComments**](EnvelopeCollaborationControllerApi.md#getEnvelopeComments) | **GET** /api/v1/envelope/{id}/comment | Get envelope comments for each document |
| [**mergeEnvelopesIntoChain**](EnvelopeCollaborationControllerApi.md#mergeEnvelopesIntoChain) | **POST** /api/v1/envelope/chain | Merge envelopes into chain |
| [**removeEnvelopeFromChain**](EnvelopeCollaborationControllerApi.md#removeEnvelopeFromChain) | **DELETE** /api/v1/envelope/{id}/chain | Remove envelope from chain |
| [**removeEnvelopesFromChain**](EnvelopeCollaborationControllerApi.md#removeEnvelopesFromChain) | **PUT** /api/v1/envelope/unchain | Remove envelopes from chain |
| [**resolvedEnvelopeComment**](EnvelopeCollaborationControllerApi.md#resolvedEnvelopeComment) | **POST** /api/v1/envelope/{id}/resolve-comment | Set Resolved Flag for comment thread |
| [**revokeEnvelopeSharing**](EnvelopeCollaborationControllerApi.md#revokeEnvelopeSharing) | **DELETE** /api/v1/envelope/share-copy | Revoke sharing an envelope copy |
| [**shareEnvelopesCopy**](EnvelopeCollaborationControllerApi.md#shareEnvelopesCopy) | **POST** /api/v1/envelope/share-copy | Share envelopes copies |
| [**updateEnvelopeComment**](EnvelopeCollaborationControllerApi.md#updateEnvelopeComment) | **PUT** /api/v1/envelope/{id}/comment | Add/Update envelope comment in thread |
| [**updateEnvelopeCommentAccess**](EnvelopeCollaborationControllerApi.md#updateEnvelopeCommentAccess) | **PUT** /api/v1/envelope/{id}/comment-access | Update envelope comment thread access level |


<a id="addEnvelopesIntoChain"></a>
# **addEnvelopesIntoChain**
> addEnvelopesIntoChain(chainId, mailbox, UUID)

Add envelopes into chain

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCollaborationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeCollaborationControllerApi apiInstance = new EnvelopeCollaborationControllerApi(defaultClient);
    UUID chainId = UUID.randomUUID(); // UUID | Chain UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Set<UUID> UUID = new LinkedHashSet<>(); // Set<UUID> | 
    try {
      apiInstance.addEnvelopesIntoChain(chainId, mailbox, UUID);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCollaborationControllerApi#addEnvelopesIntoChain");
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
| **chainId** | **UUID**| Chain UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **UUID** | [**Set&lt;UUID&gt;**](UUID.md)|  | |

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

<a id="createEnvelopeComment"></a>
# **createEnvelopeComment**
> CommentThreadDTO createEnvelopeComment(id, mailbox, commentPostDTO)

Create envelope comment thread

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCollaborationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeCollaborationControllerApi apiInstance = new EnvelopeCollaborationControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    CommentPostDTO commentPostDTO = new CommentPostDTO(); // CommentPostDTO | 
    try {
      CommentThreadDTO result = apiInstance.createEnvelopeComment(id, mailbox, commentPostDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCollaborationControllerApi#createEnvelopeComment");
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
| **commentPostDTO** | [**CommentPostDTO**](CommentPostDTO.md)|  | |

### Return type

[**CommentThreadDTO**](CommentThreadDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteEnvelopeComment"></a>
# **deleteEnvelopeComment**
> CommentThreadDTO deleteEnvelopeComment(id, threadUuid, mailbox, messageId)

Delete envelope comment in thread or the whole thread

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCollaborationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeCollaborationControllerApi apiInstance = new EnvelopeCollaborationControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID threadUuid = UUID.randomUUID(); // UUID | Thread UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Integer messageId = 56; // Integer | Message ID (optional)
    try {
      CommentThreadDTO result = apiInstance.deleteEnvelopeComment(id, threadUuid, mailbox, messageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCollaborationControllerApi#deleteEnvelopeComment");
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
| **threadUuid** | **UUID**| Thread UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **messageId** | **Integer**| Message ID (optional) | [optional] |

### Return type

[**CommentThreadDTO**](CommentThreadDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getChainEnvelopes"></a>
# **getChainEnvelopes**
> List&lt;ChainEnvelopeDTO&gt; getChainEnvelopes(chainId, mailbox)

Get chain envelopes list

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCollaborationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeCollaborationControllerApi apiInstance = new EnvelopeCollaborationControllerApi(defaultClient);
    UUID chainId = UUID.randomUUID(); // UUID | Chain UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<ChainEnvelopeDTO> result = apiInstance.getChainEnvelopes(chainId, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCollaborationControllerApi#getChainEnvelopes");
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
| **chainId** | **UUID**| Chain UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**List&lt;ChainEnvelopeDTO&gt;**](ChainEnvelopeDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEnvelopeComments"></a>
# **getEnvelopeComments**
> List&lt;DocumentCommentsDTO&gt; getEnvelopeComments(id, mailbox)

Get envelope comments for each document

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCollaborationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeCollaborationControllerApi apiInstance = new EnvelopeCollaborationControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<DocumentCommentsDTO> result = apiInstance.getEnvelopeComments(id, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCollaborationControllerApi#getEnvelopeComments");
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

[**List&lt;DocumentCommentsDTO&gt;**](DocumentCommentsDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="mergeEnvelopesIntoChain"></a>
# **mergeEnvelopesIntoChain**
> SingleUuidDTO mergeEnvelopesIntoChain(mailbox, UUID)

Merge envelopes into chain

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCollaborationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeCollaborationControllerApi apiInstance = new EnvelopeCollaborationControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Set<UUID> UUID = new LinkedHashSet<>(); // Set<UUID> | 
    try {
      SingleUuidDTO result = apiInstance.mergeEnvelopesIntoChain(mailbox, UUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCollaborationControllerApi#mergeEnvelopesIntoChain");
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
| **UUID** | [**Set&lt;UUID&gt;**](UUID.md)|  | |

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

<a id="removeEnvelopeFromChain"></a>
# **removeEnvelopeFromChain**
> removeEnvelopeFromChain(id, mailbox)

Remove envelope from chain

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCollaborationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeCollaborationControllerApi apiInstance = new EnvelopeCollaborationControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.removeEnvelopeFromChain(id, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCollaborationControllerApi#removeEnvelopeFromChain");
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="removeEnvelopesFromChain"></a>
# **removeEnvelopesFromChain**
> removeEnvelopesFromChain(mailbox, UUID)

Remove envelopes from chain

Remove one or more envelopes from chain. Send list of envelope UUIDs in the request body to be removed from the chain. 

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCollaborationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeCollaborationControllerApi apiInstance = new EnvelopeCollaborationControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Set<UUID> UUID = new LinkedHashSet<>(); // Set<UUID> | 
    try {
      apiInstance.removeEnvelopesFromChain(mailbox, UUID);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCollaborationControllerApi#removeEnvelopesFromChain");
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
| **UUID** | [**Set&lt;UUID&gt;**](UUID.md)|  | |

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

<a id="resolvedEnvelopeComment"></a>
# **resolvedEnvelopeComment**
> resolvedEnvelopeComment(id, mailbox, resolveCommentThreadDTO)

Set Resolved Flag for comment thread

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCollaborationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeCollaborationControllerApi apiInstance = new EnvelopeCollaborationControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    ResolveCommentThreadDTO resolveCommentThreadDTO = new ResolveCommentThreadDTO(); // ResolveCommentThreadDTO | 
    try {
      apiInstance.resolvedEnvelopeComment(id, mailbox, resolveCommentThreadDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCollaborationControllerApi#resolvedEnvelopeComment");
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
| **resolveCommentThreadDTO** | [**ResolveCommentThreadDTO**](ResolveCommentThreadDTO.md)|  | |

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

<a id="revokeEnvelopeSharing"></a>
# **revokeEnvelopeSharing**
> revokeEnvelopeSharing(mailbox, envelopeSharedCopyRequestDTO)

Revoke sharing an envelope copy

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCollaborationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeCollaborationControllerApi apiInstance = new EnvelopeCollaborationControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvelopeSharedCopyRequestDTO envelopeSharedCopyRequestDTO = new EnvelopeSharedCopyRequestDTO(); // EnvelopeSharedCopyRequestDTO | 
    try {
      apiInstance.revokeEnvelopeSharing(mailbox, envelopeSharedCopyRequestDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCollaborationControllerApi#revokeEnvelopeSharing");
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
| **envelopeSharedCopyRequestDTO** | [**EnvelopeSharedCopyRequestDTO**](EnvelopeSharedCopyRequestDTO.md)|  | |

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

<a id="shareEnvelopesCopy"></a>
# **shareEnvelopesCopy**
> ShareEnvelopesResult shareEnvelopesCopy(mailbox, envelopeSharedCopyRequestDTO)

Share envelopes copies

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCollaborationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeCollaborationControllerApi apiInstance = new EnvelopeCollaborationControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvelopeSharedCopyRequestDTO envelopeSharedCopyRequestDTO = new EnvelopeSharedCopyRequestDTO(); // EnvelopeSharedCopyRequestDTO | 
    try {
      ShareEnvelopesResult result = apiInstance.shareEnvelopesCopy(mailbox, envelopeSharedCopyRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCollaborationControllerApi#shareEnvelopesCopy");
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
| **envelopeSharedCopyRequestDTO** | [**EnvelopeSharedCopyRequestDTO**](EnvelopeSharedCopyRequestDTO.md)|  | |

### Return type

[**ShareEnvelopesResult**](ShareEnvelopesResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateEnvelopeComment"></a>
# **updateEnvelopeComment**
> CommentThreadDTO updateEnvelopeComment(id, mailbox, commentPutDTO)

Add/Update envelope comment in thread

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCollaborationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeCollaborationControllerApi apiInstance = new EnvelopeCollaborationControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    CommentPutDTO commentPutDTO = new CommentPutDTO(); // CommentPutDTO | 
    try {
      CommentThreadDTO result = apiInstance.updateEnvelopeComment(id, mailbox, commentPutDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCollaborationControllerApi#updateEnvelopeComment");
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
| **commentPutDTO** | [**CommentPutDTO**](CommentPutDTO.md)|  | |

### Return type

[**CommentThreadDTO**](CommentThreadDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateEnvelopeCommentAccess"></a>
# **updateEnvelopeCommentAccess**
> CommentThreadDTO updateEnvelopeCommentAccess(id, mailbox, commentAccessDTO)

Update envelope comment thread access level

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeCollaborationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeCollaborationControllerApi apiInstance = new EnvelopeCollaborationControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    CommentAccessDTO commentAccessDTO = new CommentAccessDTO(); // CommentAccessDTO | 
    try {
      CommentThreadDTO result = apiInstance.updateEnvelopeCommentAccess(id, mailbox, commentAccessDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeCollaborationControllerApi#updateEnvelopeCommentAccess");
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
| **commentAccessDTO** | [**CommentAccessDTO**](CommentAccessDTO.md)|  | |

### Return type

[**CommentThreadDTO**](CommentThreadDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

