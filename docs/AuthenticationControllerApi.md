# AuthenticationControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**login**](AuthenticationControllerApi.md#login) | **POST** /api/login | Login with email/password |
| [**loginByCode**](AuthenticationControllerApi.md#loginByCode) | **POST** /api/login/by-code | Login with the code from email (for non-existing user) |
| [**logout**](AuthenticationControllerApi.md#logout) | **POST** /api/logout | Logout |
| [**userExistsByCode**](AuthenticationControllerApi.md#userExistsByCode) | **GET** /api/login/check-by-code/{code} | Check login ability with the code from email (for non-existing user) |


<a id="login"></a>
# **login**
> LoginResponseDTO login(loginDTO)

Login with email/password

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AuthenticationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    AuthenticationControllerApi apiInstance = new AuthenticationControllerApi(defaultClient);
    LoginDTO loginDTO = new LoginDTO(); // LoginDTO | 
    try {
      LoginResponseDTO result = apiInstance.login(loginDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationControllerApi#login");
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
| **loginDTO** | [**LoginDTO**](LoginDTO.md)|  | |

### Return type

[**LoginResponseDTO**](LoginResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="loginByCode"></a>
# **loginByCode**
> LoginEnvelopeResponseDTO loginByCode(userCreateByCodeDTO)

Login with the code from email (for non-existing user)

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AuthenticationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    AuthenticationControllerApi apiInstance = new AuthenticationControllerApi(defaultClient);
    UserCreateByCodeDTO userCreateByCodeDTO = new UserCreateByCodeDTO(); // UserCreateByCodeDTO | 
    try {
      LoginEnvelopeResponseDTO result = apiInstance.loginByCode(userCreateByCodeDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationControllerApi#loginByCode");
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
| **userCreateByCodeDTO** | [**UserCreateByCodeDTO**](UserCreateByCodeDTO.md)|  | |

### Return type

[**LoginEnvelopeResponseDTO**](LoginEnvelopeResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="logout"></a>
# **logout**
> logout()

Logout

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AuthenticationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AuthenticationControllerApi apiInstance = new AuthenticationControllerApi(defaultClient);
    try {
      apiInstance.logout();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationControllerApi#logout");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="userExistsByCode"></a>
# **userExistsByCode**
> LoginCheckResponseDTO userExistsByCode()

Check login ability with the code from email (for non-existing user)

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AuthenticationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    AuthenticationControllerApi apiInstance = new AuthenticationControllerApi(defaultClient);
    try {
      LoginCheckResponseDTO result = apiInstance.userExistsByCode();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationControllerApi#userExistsByCode");
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

[**LoginCheckResponseDTO**](LoginCheckResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

