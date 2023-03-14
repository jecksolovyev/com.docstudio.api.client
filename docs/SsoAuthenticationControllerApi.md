# SsoAuthenticationControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**idpByDomain**](SsoAuthenticationControllerApi.md#idpByDomain) | **GET** /saml/findIdp | Returns EntityID by domain
[**loginGetSso**](SsoAuthenticationControllerApi.md#loginGetSso) | **GET** /saml/login | Login with SSO, redirect to UI after login
[**loginPostSso**](SsoAuthenticationControllerApi.md#loginPostSso) | **POST** /saml/login | Login with SSO, token is in response
[**logout**](SsoAuthenticationControllerApi.md#logout) | **POST** /saml/logout | Logout

<a name="idpByDomain"></a>
# **idpByDomain**
> SsoEntityDTO idpByDomain(domain)

Returns EntityID by domain

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import api.com.docstudio.client.SsoAuthenticationControllerApi;


SsoAuthenticationControllerApi apiInstance = new SsoAuthenticationControllerApi();
String domain = "domain_example"; // String | 
try {
    SsoEntityDTO result = apiInstance.idpByDomain(domain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsoAuthenticationControllerApi#idpByDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**|  |

### Return type

[**SsoEntityDTO**](SsoEntityDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loginGetSso"></a>
# **loginGetSso**
> loginGetSso(idp)

Login with SSO, redirect to UI after login

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import api.com.docstudio.client.SsoAuthenticationControllerApi;


SsoAuthenticationControllerApi apiInstance = new SsoAuthenticationControllerApi();
String idp = "idp_example"; // String | 
try {
    apiInstance.loginGetSso(idp);
} catch (ApiException e) {
    System.err.println("Exception when calling SsoAuthenticationControllerApi#loginGetSso");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idp** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="loginPostSso"></a>
# **loginPostSso**
> LoginResponseDTO loginPostSso()

Login with SSO, token is in response

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import api.com.docstudio.client.SsoAuthenticationControllerApi;


SsoAuthenticationControllerApi apiInstance = new SsoAuthenticationControllerApi();
try {
    LoginResponseDTO result = apiInstance.loginPostSso();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsoAuthenticationControllerApi#loginPostSso");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LoginResponseDTO**](LoginResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logout"></a>
# **logout**
> logout()

Logout

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import api.com.docstudio.client.SsoAuthenticationControllerApi;


SsoAuthenticationControllerApi apiInstance = new SsoAuthenticationControllerApi();
try {
    apiInstance.logout();
} catch (ApiException e) {
    System.err.println("Exception when calling SsoAuthenticationControllerApi#logout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

