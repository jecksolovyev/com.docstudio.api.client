# RegistrationControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserPasswordPolicy**](RegistrationControllerApi.md#getUserPasswordPolicy) | **GET** /registration/passwordPolicy | Get user password policy
[**register**](RegistrationControllerApi.md#register) | **POST** /registration | Register a user with validation code
[**renewPassword**](RegistrationControllerApi.md#renewPassword) | **POST** /registration/renewPassword | Renew user&#x27;s password
[**requestResendValidationCode**](RegistrationControllerApi.md#requestResendValidationCode) | **POST** /registration/sendRegistrationCode | Send email validation code
[**requestResetPassword**](RegistrationControllerApi.md#requestResetPassword) | **POST** /registration/requestPasswordReset | Request password reset
[**resetPassword**](RegistrationControllerApi.md#resetPassword) | **POST** /registration/resetPassword | Reset password
[**validation**](RegistrationControllerApi.md#validation) | **GET** /registration/validate | Validate user code from email

<a name="getUserPasswordPolicy"></a>
# **getUserPasswordPolicy**
> PasswordPolicy getUserPasswordPolicy(email)

Get user password policy

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import api.com.docstudio.client.RegistrationControllerApi;


RegistrationControllerApi apiInstance = new RegistrationControllerApi();
String email = "email_example"; // String | Email of user
try {
    PasswordPolicy result = apiInstance.getUserPasswordPolicy(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationControllerApi#getUserPasswordPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| Email of user |

### Return type

[**PasswordPolicy**](PasswordPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="register"></a>
# **register**
> LoginResponseDTO register(body, code, codeType)

Register a user with validation code

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import api.com.docstudio.client.RegistrationControllerApi;


RegistrationControllerApi apiInstance = new RegistrationControllerApi();
UserCreateDTO body = new UserCreateDTO(); // UserCreateDTO | 
String code = "code_example"; // String | Validation code
String codeType = "codeType_example"; // String | Type of code
try {
    LoginResponseDTO result = apiInstance.register(body, code, codeType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationControllerApi#register");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserCreateDTO**](UserCreateDTO.md)|  |
 **code** | **String**| Validation code |
 **codeType** | **String**| Type of code | [optional] [enum: envelopeInvite, accountInvite, emailValidation, sharedByEmail]

### Return type

[**LoginResponseDTO**](LoginResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="renewPassword"></a>
# **renewPassword**
> renewPassword(body)

Renew user&#x27;s password

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import api.com.docstudio.client.RegistrationControllerApi;


RegistrationControllerApi apiInstance = new RegistrationControllerApi();
RenewPasswordDTO body = new RenewPasswordDTO(); // RenewPasswordDTO | 
try {
    apiInstance.renewPassword(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationControllerApi#renewPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RenewPasswordDTO**](RenewPasswordDTO.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="requestResendValidationCode"></a>
# **requestResendValidationCode**
> Object requestResendValidationCode(body)

Send email validation code

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import api.com.docstudio.client.RegistrationControllerApi;


RegistrationControllerApi apiInstance = new RegistrationControllerApi();
RequestValCodeDTO body = new RequestValCodeDTO(); // RequestValCodeDTO | 
try {
    Object result = apiInstance.requestResendValidationCode(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationControllerApi#requestResendValidationCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestValCodeDTO**](RequestValCodeDTO.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="requestResetPassword"></a>
# **requestResetPassword**
> Object requestResetPassword(body)

Request password reset

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import api.com.docstudio.client.RegistrationControllerApi;


RegistrationControllerApi apiInstance = new RegistrationControllerApi();
RequestValCodeDTO body = new RequestValCodeDTO(); // RequestValCodeDTO | 
try {
    Object result = apiInstance.requestResetPassword(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationControllerApi#requestResetPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestValCodeDTO**](RequestValCodeDTO.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetPassword"></a>
# **resetPassword**
> resetPassword(body)

Reset password

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import api.com.docstudio.client.RegistrationControllerApi;


RegistrationControllerApi apiInstance = new RegistrationControllerApi();
ResetPasswordDTO body = new ResetPasswordDTO(); // ResetPasswordDTO | 
try {
    apiInstance.resetPassword(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationControllerApi#resetPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResetPasswordDTO**](ResetPasswordDTO.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="validation"></a>
# **validation**
> validation(code, type)

Validate user code from email

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import api.com.docstudio.client.RegistrationControllerApi;


RegistrationControllerApi apiInstance = new RegistrationControllerApi();
String code = "code_example"; // String | Validation code from email
String type = "type_example"; // String | Verification type
try {
    apiInstance.validation(code, type);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationControllerApi#validation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Validation code from email |
 **type** | **String**| Verification type | [enum: validation, resetPassword, corporateNewPassword, newPassword]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

