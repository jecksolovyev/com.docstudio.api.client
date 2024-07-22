# SsoAuthenticationControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**loginGetSso**](SsoAuthenticationControllerApi.md#loginGetSso) | **GET** /saml2/authenticate/{registrationId} | Login with SSO, redirects to UI after login |
| [**samlMetadata**](SsoAuthenticationControllerApi.md#samlMetadata) | **GET** /saml/metadata | Returns SAML Metadata |
| [**samlRegistrationIdByDomain**](SsoAuthenticationControllerApi.md#samlRegistrationIdByDomain) | **GET** /saml/registrationId | Returns EntityID by domain |


<a id="loginGetSso"></a>
# **loginGetSso**
> loginGetSso(registrationId)

Login with SSO, redirects to UI after login

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.SsoAuthenticationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    SsoAuthenticationControllerApi apiInstance = new SsoAuthenticationControllerApi(defaultClient);
    String registrationId = "registrationId_example"; // String | 
    try {
      apiInstance.loginGetSso(registrationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SsoAuthenticationControllerApi#loginGetSso");
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
| **registrationId** | **String**|  | |

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
| **302** | Found |  -  |

<a id="samlMetadata"></a>
# **samlMetadata**
> String samlMetadata()

Returns SAML Metadata

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.SsoAuthenticationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    SsoAuthenticationControllerApi apiInstance = new SsoAuthenticationControllerApi(defaultClient);
    try {
      String result = apiInstance.samlMetadata();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SsoAuthenticationControllerApi#samlMetadata");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="samlRegistrationIdByDomain"></a>
# **samlRegistrationIdByDomain**
> SsoEntityDTO samlRegistrationIdByDomain(domain)

Returns EntityID by domain

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.SsoAuthenticationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    SsoAuthenticationControllerApi apiInstance = new SsoAuthenticationControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    try {
      SsoEntityDTO result = apiInstance.samlRegistrationIdByDomain(domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SsoAuthenticationControllerApi#samlRegistrationIdByDomain");
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
| **domain** | **String**|  | |

### Return type

[**SsoEntityDTO**](SsoEntityDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

