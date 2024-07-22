# ApplicationTokenControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createToken**](ApplicationTokenControllerApi.md#createToken) | **POST** /api/v1/token | Create application token |
| [**getUserTokens**](ApplicationTokenControllerApi.md#getUserTokens) | **GET** /api/v1/token | List application tokens |
| [**revokeToken**](ApplicationTokenControllerApi.md#revokeToken) | **DELETE** /api/v1/token/{id} | Revoke application token |


<a id="createToken"></a>
# **createToken**
> AppTokenDTO createToken(createAppTokenDTO)

Create application token

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ApplicationTokenControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    ApplicationTokenControllerApi apiInstance = new ApplicationTokenControllerApi(defaultClient);
    CreateAppTokenDTO createAppTokenDTO = new CreateAppTokenDTO(); // CreateAppTokenDTO | 
    try {
      AppTokenDTO result = apiInstance.createToken(createAppTokenDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationTokenControllerApi#createToken");
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
| **createAppTokenDTO** | [**CreateAppTokenDTO**](CreateAppTokenDTO.md)|  | |

### Return type

[**AppTokenDTO**](AppTokenDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **405** | Method disabled by configuration |  -  |

<a id="getUserTokens"></a>
# **getUserTokens**
> List&lt;AppTokenDTO&gt; getUserTokens()

List application tokens

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ApplicationTokenControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    ApplicationTokenControllerApi apiInstance = new ApplicationTokenControllerApi(defaultClient);
    try {
      List<AppTokenDTO> result = apiInstance.getUserTokens();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationTokenControllerApi#getUserTokens");
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

[**List&lt;AppTokenDTO&gt;**](AppTokenDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **405** | Method disabled by configuration |  -  |

<a id="revokeToken"></a>
# **revokeToken**
> revokeToken(id)

Revoke application token

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ApplicationTokenControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    ApplicationTokenControllerApi apiInstance = new ApplicationTokenControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Token id
    try {
      apiInstance.revokeToken(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationTokenControllerApi#revokeToken");
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
| **id** | **UUID**| Token id | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **405** | Method disabled by configuration |  -  |

