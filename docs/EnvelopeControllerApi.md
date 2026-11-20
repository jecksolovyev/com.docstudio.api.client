# EnvelopeControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archiveEnvelope**](EnvelopeControllerApi.md#archiveEnvelope) | **PATCH** /api/v1/envelope/archive/{flag} | Archive envelopes |
| [**cancelEnvelopeDelegation**](EnvelopeControllerApi.md#cancelEnvelopeDelegation) | **DELETE** /api/v1/envelope/delegate | Cancel envelope delegation |
| [**cancelEnvelopes**](EnvelopeControllerApi.md#cancelEnvelopes) | **DELETE** /api/v1/envelope/cancel | Cancel envelopes |
| [**check**](EnvelopeControllerApi.md#check) | **POST** /api/v1/envelope/check | Check an envelope |
| [**checkEnvelopeHasActiveRole**](EnvelopeControllerApi.md#checkEnvelopeHasActiveRole) | **HEAD** /api/v1/envelope/{id}/has-active-role | Check envelope has active role |
| [**continueScenarioStep**](EnvelopeControllerApi.md#continueScenarioStep) | **POST** /api/v1/envelope/{id}/scenario/{stepId} | Continue scenario flow with step |
| [**createEnvelope**](EnvelopeControllerApi.md#createEnvelope) | **POST** /api/v1/envelope | Create draft envelope |
| [**delegateEnvelopes**](EnvelopeControllerApi.md#delegateEnvelopes) | **POST** /api/v1/envelope/delegate | Delegate envelopes |
| [**deleteDrafts**](EnvelopeControllerApi.md#deleteDrafts) | **DELETE** /api/v1/envelope | Delete draft envelopes |
| [**deleteEnvelopeMetadata**](EnvelopeControllerApi.md#deleteEnvelopeMetadata) | **DELETE** /api/v1/envelope/{id}/metadata | Delete envelope metadata |
| [**getActiveRoles**](EnvelopeControllerApi.md#getActiveRoles) | **GET** /api/v1/envelope/{id}/activeRoles | Get active roles by Envelope UUID |
| [**getEnvelopeByUuid**](EnvelopeControllerApi.md#getEnvelopeByUuid) | **GET** /api/v1/envelope/{envelopeUuid} | Retrieve envelope by UUID |
| [**getPaymentDetails**](EnvelopeControllerApi.md#getPaymentDetails) | **GET** /api/v1/envelope/payment-details/{accessCode} | Get payment details of a payment link for the checkout page |
| [**getPaymentLink**](EnvelopeControllerApi.md#getPaymentLink) | **POST** /api/v1/envelope/{id}/payment-link | Get the public checkout link of a QR pay field; the role of the field must be completed |
| [**markEnvelopesAsRead**](EnvelopeControllerApi.md#markEnvelopesAsRead) | **POST** /api/v1/envelope/mark-as-read | Mark envelopes as read by mailbox |
| [**numberToText**](EnvelopeControllerApi.md#numberToText) | **POST** /api/v1/envelope/number-to-text | Convert a numeric amount to words |
| [**recycleBin**](EnvelopeControllerApi.md#recycleBin) | **PATCH** /api/v1/envelope/recycle-bin/{flag} | Archive envelopes |
| [**resendNotifications**](EnvelopeControllerApi.md#resendNotifications) | **POST** /api/v1/envelope/notify | Resend notifications for active roles |
| [**updateEnvelope**](EnvelopeControllerApi.md#updateEnvelope) | **PUT** /api/v1/envelope | Update envelope without sending |
| [**updateEnvelopeMetadata**](EnvelopeControllerApi.md#updateEnvelopeMetadata) | **PUT** /api/v1/envelope/{id}/metadata | Update envelope metadata. Will be saved on the account level |
| [**updateFlow**](EnvelopeControllerApi.md#updateFlow) | **POST** /api/v1/envelope/{id}/flow-update | Update recipient email/mailbox for not finished roles in a sent envelope |


<a id="archiveEnvelope"></a>
# **archiveEnvelope**
> archiveEnvelope(flag, mailbox, bulkEnvelopeActionDTO)

Archive envelopes

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    Boolean flag = true; // Boolean | 
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    BulkEnvelopeActionDTO bulkEnvelopeActionDTO = new BulkEnvelopeActionDTO(); // BulkEnvelopeActionDTO | 
    try {
      apiInstance.archiveEnvelope(flag, mailbox, bulkEnvelopeActionDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#archiveEnvelope");
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
| **flag** | **Boolean**|  | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **bulkEnvelopeActionDTO** | [**BulkEnvelopeActionDTO**](BulkEnvelopeActionDTO.md)|  | |

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

<a id="cancelEnvelopeDelegation"></a>
# **cancelEnvelopeDelegation**
> cancelEnvelopeDelegation(mailbox, envelopeCancelDelegationDTO)

Cancel envelope delegation

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvelopeCancelDelegationDTO envelopeCancelDelegationDTO = new EnvelopeCancelDelegationDTO(); // EnvelopeCancelDelegationDTO | 
    try {
      apiInstance.cancelEnvelopeDelegation(mailbox, envelopeCancelDelegationDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#cancelEnvelopeDelegation");
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
| **envelopeCancelDelegationDTO** | [**EnvelopeCancelDelegationDTO**](EnvelopeCancelDelegationDTO.md)|  | |

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

<a id="cancelEnvelopes"></a>
# **cancelEnvelopes**
> SingleUuidDTO cancelEnvelopes(mailbox, envCancellationRequestDTO)

Cancel envelopes

One envelope is processed synchronously and the response carries that envelope&#39;s uuid; several are handed to a background process and the response carries the process uuid.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvCancellationRequestDTO envCancellationRequestDTO = new EnvCancellationRequestDTO(); // EnvCancellationRequestDTO | 
    try {
      SingleUuidDTO result = apiInstance.cancelEnvelopes(mailbox, envCancellationRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#cancelEnvelopes");
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
| **envCancellationRequestDTO** | [**EnvCancellationRequestDTO**](EnvCancellationRequestDTO.md)|  | |

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

<a id="check"></a>
# **check**
> ValidationResponseDTO check(mailbox, envDTO)

Check an envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvDTO envDTO = new EnvDTO(); // EnvDTO | 
    try {
      ValidationResponseDTO result = apiInstance.check(mailbox, envDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#check");
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
| **envDTO** | [**EnvDTO**](EnvDTO.md)|  | |

### Return type

[**ValidationResponseDTO**](ValidationResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="checkEnvelopeHasActiveRole"></a>
# **checkEnvelopeHasActiveRole**
> checkEnvelopeHasActiveRole(id, mailbox)

Check envelope has active role

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | UUID of envelope
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.checkEnvelopeHasActiveRole(id, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#checkEnvelopeHasActiveRole");
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

<a id="continueScenarioStep"></a>
# **continueScenarioStep**
> List&lt;SingleUuidDTO&gt; continueScenarioStep(id, stepId, mailbox)

Continue scenario flow with step

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    String stepId = "stepId_example"; // String | Step id
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<SingleUuidDTO> result = apiInstance.continueScenarioStep(id, stepId, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#continueScenarioStep");
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
| **stepId** | **String**| Step id | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createEnvelope"></a>
# **createEnvelope**
> SingleUuidDTO createEnvelope(mailbox, envPostDTO)

Create draft envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvPostDTO envPostDTO = new EnvPostDTO(); // EnvPostDTO | 
    try {
      SingleUuidDTO result = apiInstance.createEnvelope(mailbox, envPostDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#createEnvelope");
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
| **envPostDTO** | [**EnvPostDTO**](EnvPostDTO.md)|  | |

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
| **201** | Created |  -  |

<a id="delegateEnvelopes"></a>
# **delegateEnvelopes**
> SingleUuidDTO delegateEnvelopes(mailbox, envDelegationDTO)

Delegate envelopes

One envelope is processed synchronously and the response carries that envelope&#39;s uuid; several are handed to a background process and the response carries the process uuid.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvDelegationDTO envDelegationDTO = new EnvDelegationDTO(); // EnvDelegationDTO | 
    try {
      SingleUuidDTO result = apiInstance.delegateEnvelopes(mailbox, envDelegationDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#delegateEnvelopes");
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
| **envDelegationDTO** | [**EnvDelegationDTO**](EnvDelegationDTO.md)|  | |

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

<a id="deleteDrafts"></a>
# **deleteDrafts**
> deleteDrafts(mailbox, bulkEnvelopeActionDTO)

Delete draft envelopes

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    BulkEnvelopeActionDTO bulkEnvelopeActionDTO = new BulkEnvelopeActionDTO(); // BulkEnvelopeActionDTO | 
    try {
      apiInstance.deleteDrafts(mailbox, bulkEnvelopeActionDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#deleteDrafts");
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
| **bulkEnvelopeActionDTO** | [**BulkEnvelopeActionDTO**](BulkEnvelopeActionDTO.md)|  | |

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

<a id="deleteEnvelopeMetadata"></a>
# **deleteEnvelopeMetadata**
> deleteEnvelopeMetadata(id, mailbox, key)

Delete envelope metadata

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Set<String> key = new LinkedHashSet<>(); // Set<String> | 
    try {
      apiInstance.deleteEnvelopeMetadata(id, mailbox, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#deleteEnvelopeMetadata");
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
| **id** | **UUID**|  | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **key** | [**Set&lt;String&gt;**](String.md)|  | [optional] |

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

<a id="getActiveRoles"></a>
# **getActiveRoles**
> List&lt;SingleUuidDTO&gt; getActiveRoles(id, mailbox)

Get active roles by Envelope UUID

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | UUID of envelope to get active roles from
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<SingleUuidDTO> result = apiInstance.getActiveRoles(id, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getActiveRoles");
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
| **id** | **UUID**| UUID of envelope to get active roles from | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEnvelopeByUuid"></a>
# **getEnvelopeByUuid**
> EnvelopeWithTemplateDTO getEnvelopeByUuid(envelopeUuid, mailbox)

Retrieve envelope by UUID

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID envelopeUuid = UUID.randomUUID(); // UUID | UUID of envelope to retrieve
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      EnvelopeWithTemplateDTO result = apiInstance.getEnvelopeByUuid(envelopeUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getEnvelopeByUuid");
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
| **envelopeUuid** | **UUID**| UUID of envelope to retrieve | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**EnvelopeWithTemplateDTO**](EnvelopeWithTemplateDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPaymentDetails"></a>
# **getPaymentDetails**
> PaymentDetails getPaymentDetails(accessCode)

Get payment details of a payment link for the checkout page

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    String accessCode = "accessCode_example"; // String | Access code from the payment link
    try {
      PaymentDetails result = apiInstance.getPaymentDetails(accessCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getPaymentDetails");
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
| **accessCode** | **String**| Access code from the payment link | |

### Return type

[**PaymentDetails**](PaymentDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPaymentLink"></a>
# **getPaymentLink**
> PaymentLink getPaymentLink(id, mailbox, paymentLinkRequest)

Get the public checkout link of a QR pay field; the role of the field must be completed

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    PaymentLinkRequest paymentLinkRequest = new PaymentLinkRequest(); // PaymentLinkRequest | 
    try {
      PaymentLink result = apiInstance.getPaymentLink(id, mailbox, paymentLinkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getPaymentLink");
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
| **paymentLinkRequest** | [**PaymentLinkRequest**](PaymentLinkRequest.md)|  | |

### Return type

[**PaymentLink**](PaymentLink.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="markEnvelopesAsRead"></a>
# **markEnvelopesAsRead**
> markEnvelopesAsRead(mailbox, markAsReadRequest)

Mark envelopes as read by mailbox

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    MarkAsReadRequest markAsReadRequest = new MarkAsReadRequest(); // MarkAsReadRequest | 
    try {
      apiInstance.markEnvelopesAsRead(mailbox, markAsReadRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#markEnvelopesAsRead");
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
| **markAsReadRequest** | [**MarkAsReadRequest**](MarkAsReadRequest.md)|  | |

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

<a id="numberToText"></a>
# **numberToText**
> String numberToText(numberToTextRequest)

Convert a numeric amount to words

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    NumberToTextRequest numberToTextRequest = new NumberToTextRequest(); // NumberToTextRequest | 
    try {
      String result = apiInstance.numberToText(numberToTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#numberToText");
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
| **numberToTextRequest** | [**NumberToTextRequest**](NumberToTextRequest.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recycleBin"></a>
# **recycleBin**
> recycleBin(flag, mailbox, bulkEnvelopeActionDTO)

Archive envelopes

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    Boolean flag = true; // Boolean | 
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    BulkEnvelopeActionDTO bulkEnvelopeActionDTO = new BulkEnvelopeActionDTO(); // BulkEnvelopeActionDTO | 
    try {
      apiInstance.recycleBin(flag, mailbox, bulkEnvelopeActionDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#recycleBin");
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
| **flag** | **Boolean**|  | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **bulkEnvelopeActionDTO** | [**BulkEnvelopeActionDTO**](BulkEnvelopeActionDTO.md)|  | |

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

<a id="resendNotifications"></a>
# **resendNotifications**
> resendNotifications(mailbox, reportEnvelopeRequestDTO)

Resend notifications for active roles

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    ReportEnvelopeRequestDTO reportEnvelopeRequestDTO = new ReportEnvelopeRequestDTO(); // ReportEnvelopeRequestDTO | 
    try {
      apiInstance.resendNotifications(mailbox, reportEnvelopeRequestDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#resendNotifications");
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
| **reportEnvelopeRequestDTO** | [**ReportEnvelopeRequestDTO**](ReportEnvelopeRequestDTO.md)|  | |

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

<a id="updateEnvelope"></a>
# **updateEnvelope**
> updateEnvelope(mailbox, envPutDTO)

Update envelope without sending

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvPutDTO envPutDTO = new EnvPutDTO(); // EnvPutDTO | 
    try {
      apiInstance.updateEnvelope(mailbox, envPutDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#updateEnvelope");
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
| **envPutDTO** | [**EnvPutDTO**](EnvPutDTO.md)|  | |

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

<a id="updateEnvelopeMetadata"></a>
# **updateEnvelopeMetadata**
> updateEnvelopeMetadata(id, mailbox, requestBody)

Update envelope metadata. Will be saved on the account level

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Map<String, String> requestBody = new HashMap(); // Map<String, String> | 
    try {
      apiInstance.updateEnvelopeMetadata(id, mailbox, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#updateEnvelopeMetadata");
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
| **id** | **UUID**|  | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **requestBody** | [**Map&lt;String, String&gt;**](String.md)|  | |

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

<a id="updateFlow"></a>
# **updateFlow**
> updateFlow(id, mailbox, flowUpdate)

Update recipient email/mailbox for not finished roles in a sent envelope

Sender can change addressee for any role whose invitation has not been accepted yet. Old invitation codes are revoked and new notifications are sent. Limited to one change per envelope per minute.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | UUID of envelope
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    List<FlowUpdate> flowUpdate = Arrays.asList(); // List<FlowUpdate> | 
    try {
      apiInstance.updateFlow(id, mailbox, flowUpdate);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#updateFlow");
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
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **flowUpdate** | [**List&lt;FlowUpdate&gt;**](FlowUpdate.md)|  | |

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

