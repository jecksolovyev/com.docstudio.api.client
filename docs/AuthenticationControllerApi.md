# AuthenticationControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](AuthenticationControllerApi.md#login) | **POST** /api/login | Login with email/password
[**loginByCode**](AuthenticationControllerApi.md#loginByCode) | **POST** /api/login/by-code | Login with the code from email (for non-existing user)
[**logout**](AuthenticationControllerApi.md#logout) | **POST** /api/logout | Logout
[**userExistsByCode**](AuthenticationControllerApi.md#userExistsByCode) | **GET** /api/login/check-by-code/{code} | Check login ability with the code from email (for non-existing user)

<a name="login"></a>
# **login**
> LoginResponseDTO login(body)

Login with email/password

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import com.docstudio.client.api.AuthenticationControllerApi;


AuthenticationControllerApi apiInstance = new AuthenticationControllerApi();
LoginDTO body = new LoginDTO(); // LoginDTO | 
try {
    LoginResponseDTO result = apiInstance.login(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationControllerApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginDTO**](LoginDTO.md)|  |

### Return type

[**LoginResponseDTO**](LoginResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loginByCode"></a>
# **loginByCode**
> LoginEnvelopeResponseDTO loginByCode(body)

Login with the code from email (for non-existing user)

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import com.docstudio.client.api.AuthenticationControllerApi;


AuthenticationControllerApi apiInstance = new AuthenticationControllerApi();
UserCreateByCodeDTO body = new UserCreateByCodeDTO(); // UserCreateByCodeDTO | 
try {
    LoginEnvelopeResponseDTO result = apiInstance.loginByCode(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationControllerApi#loginByCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserCreateByCodeDTO**](UserCreateByCodeDTO.md)|  |

### Return type

[**LoginEnvelopeResponseDTO**](LoginEnvelopeResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logout"></a>
# **logout**
> logout()

Logout

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.AuthenticationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuthenticationControllerApi apiInstance = new AuthenticationControllerApi();
try {
    apiInstance.logout();
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationControllerApi#logout");
    e.printStackTrace();
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

<a name="userExistsByCode"></a>
# **userExistsByCode**
> LoginCheckResponseDTO userExistsByCode()

Check login ability with the code from email (for non-existing user)

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import com.docstudio.client.api.AuthenticationControllerApi;


AuthenticationControllerApi apiInstance = new AuthenticationControllerApi();
try {
    LoginCheckResponseDTO result = apiInstance.userExistsByCode();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationControllerApi#userExistsByCode");
    e.printStackTrace();
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

