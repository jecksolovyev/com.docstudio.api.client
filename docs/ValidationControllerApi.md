# ValidationControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEnvelopeInvite**](ValidationControllerApi.md#getEnvelopeInvite) | **GET** /api/v1/validation/envelope-authorized-invite | Get invitation info by already registered user |
| [**getEnvelopeInviteNotRegistered**](ValidationControllerApi.md#getEnvelopeInviteNotRegistered) | **GET** /api/v1/validation/envelope-invite | Get invitation info by not authenticated user |


<a id="getEnvelopeInvite"></a>
# **getEnvelopeInvite**
> GetEnvelopeInviteInfoDTO getEnvelopeInvite(code)

Get invitation info by already registered user

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ValidationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ValidationControllerApi apiInstance = new ValidationControllerApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      GetEnvelopeInviteInfoDTO result = apiInstance.getEnvelopeInvite(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationControllerApi#getEnvelopeInvite");
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
| **code** | **String**|  | |

### Return type

[**GetEnvelopeInviteInfoDTO**](GetEnvelopeInviteInfoDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEnvelopeInviteNotRegistered"></a>
# **getEnvelopeInviteNotRegistered**
> GetEnvelopeInviteInfoDTO getEnvelopeInviteNotRegistered(code)

Get invitation info by not authenticated user

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ValidationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ValidationControllerApi apiInstance = new ValidationControllerApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      GetEnvelopeInviteInfoDTO result = apiInstance.getEnvelopeInviteNotRegistered(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationControllerApi#getEnvelopeInviteNotRegistered");
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
| **code** | **String**|  | |

### Return type

[**GetEnvelopeInviteInfoDTO**](GetEnvelopeInviteInfoDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

