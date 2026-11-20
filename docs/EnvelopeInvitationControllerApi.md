# EnvelopeInvitationControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptUserPendingInvitations**](EnvelopeInvitationControllerApi.md#acceptUserPendingInvitations) | **POST** /api/v1/envelope/invitations | Accept user&#39;s pending invitations |
| [**checkUserHasInvitations**](EnvelopeInvitationControllerApi.md#checkUserHasInvitations) | **HEAD** /api/v1/envelope/invitations | Check user has pending invitations |
| [**confirmInvite**](EnvelopeInvitationControllerApi.md#confirmInvite) | **POST** /api/v1/envelope/confirm-invite | Accept/confirm invitations |
| [**getActionLinkForUser**](EnvelopeInvitationControllerApi.md#getActionLinkForUser) | **GET** /api/v1/envelope/{id}/action-link |  |
| [**getEnvelopeInviteAuthorized**](EnvelopeInvitationControllerApi.md#getEnvelopeInviteAuthorized) | **GET** /api/v1/envelope/invite-authorized-info | Get information about envelope by the invitation code (by already registered user) |
| [**getEnvelopeInviteUnauthorized**](EnvelopeInvitationControllerApi.md#getEnvelopeInviteUnauthorized) | **GET** /api/v1/envelope/invite-info | Get information about envelope by the invitation code (by unauthenticated user) |
| [**getUserPendingInvitations**](EnvelopeInvitationControllerApi.md#getUserPendingInvitations) | **GET** /api/v1/envelope/invitations | Get user&#39;s pending invitations |


<a id="acceptUserPendingInvitations"></a>
# **acceptUserPendingInvitations**
> acceptUserPendingInvitations(mailbox, UUID, type)

Accept user&#39;s pending invitations

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeInvitationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeInvitationControllerApi apiInstance = new EnvelopeInvitationControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    String type = "envelope-invite"; // String | Type of the invitations
    try {
      apiInstance.acceptUserPendingInvitations(mailbox, UUID, type);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeInvitationControllerApi#acceptUserPendingInvitations");
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
| **type** | **String**| Type of the invitations | [optional] [enum: envelope-invite, approval-invite, review-invite] |

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

<a id="checkUserHasInvitations"></a>
# **checkUserHasInvitations**
> checkUserHasInvitations()

Check user has pending invitations

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeInvitationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeInvitationControllerApi apiInstance = new EnvelopeInvitationControllerApi(defaultClient);
    try {
      apiInstance.checkUserHasInvitations();
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeInvitationControllerApi#checkUserHasInvitations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

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

<a id="confirmInvite"></a>
# **confirmInvite**
> confirmInvite(envelopeConfirmInviteDTO)

Accept/confirm invitations

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeInvitationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeInvitationControllerApi apiInstance = new EnvelopeInvitationControllerApi(defaultClient);
    EnvelopeConfirmInviteDTO envelopeConfirmInviteDTO = new EnvelopeConfirmInviteDTO(); // EnvelopeConfirmInviteDTO | 
    try {
      apiInstance.confirmInvite(envelopeConfirmInviteDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeInvitationControllerApi#confirmInvite");
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
| **envelopeConfirmInviteDTO** | [**EnvelopeConfirmInviteDTO**](EnvelopeConfirmInviteDTO.md)|  | |

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

<a id="getActionLinkForUser"></a>
# **getActionLinkForUser**
> ActionLinkResponse getActionLinkForUser(id, email, mailbox)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeInvitationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeInvitationControllerApi apiInstance = new EnvelopeInvitationControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | UUID of envelope
    String email = "email_example"; // String | Email of user assigned to a role
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      ActionLinkResponse result = apiInstance.getActionLinkForUser(id, email, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeInvitationControllerApi#getActionLinkForUser");
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
| **id** | **UUID**| UUID of envelope | |
| **email** | **String**| Email of user assigned to a role | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**ActionLinkResponse**](ActionLinkResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEnvelopeInviteAuthorized"></a>
# **getEnvelopeInviteAuthorized**
> InvitedEnvelopeInfoDTO getEnvelopeInviteAuthorized(code)

Get information about envelope by the invitation code (by already registered user)

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeInvitationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeInvitationControllerApi apiInstance = new EnvelopeInvitationControllerApi(defaultClient);
    String code = "code_example"; // String | Invitation code from email
    try {
      InvitedEnvelopeInfoDTO result = apiInstance.getEnvelopeInviteAuthorized(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeInvitationControllerApi#getEnvelopeInviteAuthorized");
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
| **code** | **String**| Invitation code from email | |

### Return type

[**InvitedEnvelopeInfoDTO**](InvitedEnvelopeInfoDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEnvelopeInviteUnauthorized"></a>
# **getEnvelopeInviteUnauthorized**
> InvitedEnvelopeInfoDTO getEnvelopeInviteUnauthorized(code)

Get information about envelope by the invitation code (by unauthenticated user)

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeInvitationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeInvitationControllerApi apiInstance = new EnvelopeInvitationControllerApi(defaultClient);
    String code = "code_example"; // String | Invitation code from email
    try {
      InvitedEnvelopeInfoDTO result = apiInstance.getEnvelopeInviteUnauthorized(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeInvitationControllerApi#getEnvelopeInviteUnauthorized");
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
| **code** | **String**| Invitation code from email | |

### Return type

[**InvitedEnvelopeInfoDTO**](InvitedEnvelopeInfoDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getUserPendingInvitations"></a>
# **getUserPendingInvitations**
> PageDTOEnvelopeToMailboxDTO getUserPendingInvitations(type, offset, limit)

Get user&#39;s pending invitations

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeInvitationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeInvitationControllerApi apiInstance = new EnvelopeInvitationControllerApi(defaultClient);
    String type = "envelope-invite"; // String | Invitation type
    Integer offset = 0; // Integer | Offset, how much envelopes to skip
    Integer limit = 25; // Integer | Limit, how much envelopes to retrieve
    try {
      PageDTOEnvelopeToMailboxDTO result = apiInstance.getUserPendingInvitations(type, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeInvitationControllerApi#getUserPendingInvitations");
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
| **type** | **String**| Invitation type | [optional] [enum: envelope-invite, approval-invite, review-invite] |
| **offset** | **Integer**| Offset, how much envelopes to skip | [optional] [default to 0] |
| **limit** | **Integer**| Limit, how much envelopes to retrieve | [optional] [default to 25] |

### Return type

[**PageDTOEnvelopeToMailboxDTO**](PageDTOEnvelopeToMailboxDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

