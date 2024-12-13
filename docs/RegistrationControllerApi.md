# RegistrationControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserPasswordPolicy**](RegistrationControllerApi.md#getUserPasswordPolicy) | **GET** /registration/passwordPolicy | Get user password policy |
| [**register**](RegistrationControllerApi.md#register) | **POST** /registration | Register a user with validation code |
| [**renewPassword**](RegistrationControllerApi.md#renewPassword) | **POST** /registration/renewPassword | Renew user&#39;s password |
| [**requestResendValidationCode**](RegistrationControllerApi.md#requestResendValidationCode) | **POST** /registration/sendRegistrationCode | Send email validation code |
| [**requestResetPassword**](RegistrationControllerApi.md#requestResetPassword) | **POST** /registration/requestPasswordReset | Request password reset |
| [**resetPassword**](RegistrationControllerApi.md#resetPassword) | **POST** /registration/resetPassword | Reset password |
| [**validation**](RegistrationControllerApi.md#validation) | **GET** /registration/validate | Validate user code from email |


<a id="getUserPasswordPolicy"></a>
# **getUserPasswordPolicy**
> PasswordPolicy getUserPasswordPolicy(email)

Get user password policy

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.RegistrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    RegistrationControllerApi apiInstance = new RegistrationControllerApi(defaultClient);
    String email = "email_example"; // String | Email of user
    try {
      PasswordPolicy result = apiInstance.getUserPasswordPolicy(email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationControllerApi#getUserPasswordPolicy");
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
| **email** | **String**| Email of user | |

### Return type

[**PasswordPolicy**](PasswordPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="register"></a>
# **register**
> LoginResponseDTO register(code, userCreateDTO, codeType)

Register a user with validation code

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.RegistrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    RegistrationControllerApi apiInstance = new RegistrationControllerApi(defaultClient);
    String code = "code_example"; // String | Validation code
    UserCreateDTO userCreateDTO = new UserCreateDTO(); // UserCreateDTO | 
    String codeType = "envelopeInvite"; // String | Type of code
    try {
      LoginResponseDTO result = apiInstance.register(code, userCreateDTO, codeType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationControllerApi#register");
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
| **code** | **String**| Validation code | |
| **userCreateDTO** | [**UserCreateDTO**](UserCreateDTO.md)|  | |
| **codeType** | **String**| Type of code | [optional] [enum: envelopeInvite, accountInvite, emailValidation, sharedByEmail, externalAuth] |

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
| **201** | OK |  -  |
| **405** | Method disabled by configuration |  -  |

<a id="renewPassword"></a>
# **renewPassword**
> renewPassword(renewPasswordDTO)

Renew user&#39;s password

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.RegistrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    RegistrationControllerApi apiInstance = new RegistrationControllerApi(defaultClient);
    RenewPasswordDTO renewPasswordDTO = new RenewPasswordDTO(); // RenewPasswordDTO | 
    try {
      apiInstance.renewPassword(renewPasswordDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationControllerApi#renewPassword");
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
| **renewPasswordDTO** | [**RenewPasswordDTO**](RenewPasswordDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="requestResendValidationCode"></a>
# **requestResendValidationCode**
> Object requestResendValidationCode(requestValCodeDTO)

Send email validation code

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.RegistrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    RegistrationControllerApi apiInstance = new RegistrationControllerApi(defaultClient);
    RequestValCodeDTO requestValCodeDTO = new RequestValCodeDTO(); // RequestValCodeDTO | 
    try {
      Object result = apiInstance.requestResendValidationCode(requestValCodeDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationControllerApi#requestResendValidationCode");
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
| **requestValCodeDTO** | [**RequestValCodeDTO**](RequestValCodeDTO.md)|  | |

### Return type

**Object**

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

<a id="requestResetPassword"></a>
# **requestResetPassword**
> Object requestResetPassword(requestValCodeDTO)

Request password reset

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.RegistrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    RegistrationControllerApi apiInstance = new RegistrationControllerApi(defaultClient);
    RequestValCodeDTO requestValCodeDTO = new RequestValCodeDTO(); // RequestValCodeDTO | 
    try {
      Object result = apiInstance.requestResetPassword(requestValCodeDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationControllerApi#requestResetPassword");
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
| **requestValCodeDTO** | [**RequestValCodeDTO**](RequestValCodeDTO.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="resetPassword"></a>
# **resetPassword**
> resetPassword(resetPasswordDTO)

Reset password

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.RegistrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    RegistrationControllerApi apiInstance = new RegistrationControllerApi(defaultClient);
    ResetPasswordDTO resetPasswordDTO = new ResetPasswordDTO(); // ResetPasswordDTO | 
    try {
      apiInstance.resetPassword(resetPasswordDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationControllerApi#resetPassword");
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
| **resetPasswordDTO** | [**ResetPasswordDTO**](ResetPasswordDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="validation"></a>
# **validation**
> Object validation(code, type)

Validate user code from email

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.RegistrationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    RegistrationControllerApi apiInstance = new RegistrationControllerApi(defaultClient);
    String code = "code_example"; // String | Validation code from email
    String type = "validation"; // String | Verification type
    try {
      Object result = apiInstance.validation(code, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationControllerApi#validation");
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
| **code** | **String**| Validation code from email | |
| **type** | **String**| Verification type | [enum: validation, resetPassword, corporateNewPassword, newPassword, externalAuthentication, changeEmail] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

