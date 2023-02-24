# AuthenticationControllerApi

All URIs are relative to *https://api.centredo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](AuthenticationControllerApi.md#login) | **POST** /api/login | Login with email/password
[**loginByCode**](AuthenticationControllerApi.md#loginByCode) | **POST** /api/login/by-code | Login with the code from email (for non-existing user)
[**logoutAuthentication**](AuthenticationControllerApi.md#logoutAuthentication) | **POST** /api/logout | Logout
[**userExistsByCode**](AuthenticationControllerApi.md#userExistsByCode) | **GET** /api/login/check-by-code/{code} | Check login ability with the code from email (for non-existing user)

<a name="login"></a>
# **login**
> LoginResponseDTO login(body)

Login with email/password

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationControllerApi;


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
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationControllerApi;


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

<a name="logoutAuthentication"></a>
# **logoutAuthentication**
> logoutAuthentication()

Logout

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuthenticationControllerApi apiInstance = new AuthenticationControllerApi();
try {
    apiInstance.logoutAuthentication();
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationControllerApi#logoutAuthentication");
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
> LoginCheckResponseDTO userExistsByCode(theInvitationCode)

Check login ability with the code from email (for non-existing user)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationControllerApi;


AuthenticationControllerApi apiInstance = new AuthenticationControllerApi();
String theInvitationCode = "theInvitationCode_example"; // String | 
try {
    LoginCheckResponseDTO result = apiInstance.userExistsByCode(theInvitationCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationControllerApi#userExistsByCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **theInvitationCode** | **String**|  |

### Return type

[**LoginCheckResponseDTO**](LoginCheckResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

