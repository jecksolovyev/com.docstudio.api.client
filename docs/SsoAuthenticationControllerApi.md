# SsoAuthenticationControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginOauth2**](SsoAuthenticationControllerApi.md#loginOauth2) | **GET** /oauth2/authorization/{registrationId} | Login with oAuth2
[**loginSaml2**](SsoAuthenticationControllerApi.md#loginSaml2) | **GET** /saml2/authenticate/{registrationId} | Login with SAML2
[**samlMetadata**](SsoAuthenticationControllerApi.md#samlMetadata) | **GET** /saml/metadata | Returns SAML Metadata
[**samlRegistrationIdByDomain**](SsoAuthenticationControllerApi.md#samlRegistrationIdByDomain) | **GET** /saml/registrationId | Returns EntityID by domain

<a name="loginOauth2"></a>
# **loginOauth2**
> loginOauth2(registrationId, redirectUrl)

Login with oAuth2

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import com.docstudio.client.api.SsoAuthenticationControllerApi;


SsoAuthenticationControllerApi apiInstance = new SsoAuthenticationControllerApi();
String registrationId = "registrationId_example"; // String | 
String redirectUrl = "redirectUrl_example"; // String | 
try {
    apiInstance.loginOauth2(registrationId, redirectUrl);
} catch (ApiException e) {
    System.err.println("Exception when calling SsoAuthenticationControllerApi#loginOauth2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**|  |
 **redirectUrl** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="loginSaml2"></a>
# **loginSaml2**
> loginSaml2(registrationId, redirectUrl)

Login with SAML2

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import com.docstudio.client.api.SsoAuthenticationControllerApi;


SsoAuthenticationControllerApi apiInstance = new SsoAuthenticationControllerApi();
String registrationId = "registrationId_example"; // String | 
String redirectUrl = "redirectUrl_example"; // String | 
try {
    apiInstance.loginSaml2(registrationId, redirectUrl);
} catch (ApiException e) {
    System.err.println("Exception when calling SsoAuthenticationControllerApi#loginSaml2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**|  |
 **redirectUrl** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="samlMetadata"></a>
# **samlMetadata**
> String samlMetadata()

Returns SAML Metadata

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import com.docstudio.client.api.SsoAuthenticationControllerApi;


SsoAuthenticationControllerApi apiInstance = new SsoAuthenticationControllerApi();
try {
    String result = apiInstance.samlMetadata();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsoAuthenticationControllerApi#samlMetadata");
    e.printStackTrace();
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

<a name="samlRegistrationIdByDomain"></a>
# **samlRegistrationIdByDomain**
> SsoEntityDTO samlRegistrationIdByDomain(domain)

Returns EntityID by domain

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import com.docstudio.client.api.SsoAuthenticationControllerApi;


SsoAuthenticationControllerApi apiInstance = new SsoAuthenticationControllerApi();
String domain = "domain_example"; // String | 
try {
    SsoEntityDTO result = apiInstance.samlRegistrationIdByDomain(domain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsoAuthenticationControllerApi#samlRegistrationIdByDomain");
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

