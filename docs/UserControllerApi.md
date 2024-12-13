# UserControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeInitials**](UserControllerApi.md#changeInitials) | **PUT** /api/v1/user/initials | Update user&#39;s initials in base64 format |
| [**changePassword**](UserControllerApi.md#changePassword) | **PUT** /api/v1/user/password | Update user&#39;s password |
| [**changeSignature**](UserControllerApi.md#changeSignature) | **PUT** /api/v1/user/signature | Update user&#39;s eink signature in base64 format |
| [**confirmOauthEmailAndGetToken**](UserControllerApi.md#confirmOauthEmailAndGetToken) | **GET** /api/v1/user/confirm-oauth-email-get-token | Confirm email from OAuth2 Identity Provider |
| [**deleteUser**](UserControllerApi.md#deleteUser) | **DELETE** /api/v1/user | Delete user himself |
| [**findUser**](UserControllerApi.md#findUser) | **GET** /api/v1/user/search | Find user |
| [**getAvatar**](UserControllerApi.md#getAvatar) | **GET** /api/v1/user/avatar/{uuid} | Retrieve user avatar |
| [**getCorporateUserProfile**](UserControllerApi.md#getCorporateUserProfile) | **GET** /api/v1/user/profile/{uuid}/account/{accountUuid} | Retrieve corporate user profile |
| [**getMailboxesInfo**](UserControllerApi.md#getMailboxesInfo) | **POST** /api/v1/user/info | Retrieve users info |
| [**getProfile**](UserControllerApi.md#getProfile) | **GET** /api/v1/user/profile | Retrieve self profile |
| [**updateCorporateUserProfile**](UserControllerApi.md#updateCorporateUserProfile) | **PUT** /api/v1/user/profile/{uuid}/account/{accountUuid} | Update corporate user&#39;s profile |
| [**updateProfile**](UserControllerApi.md#updateProfile) | **PUT** /api/v1/user/profile | Update self profile |


<a id="changeInitials"></a>
# **changeInitials**
> changeInitials(body)

Update user&#39;s initials in base64 format

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    String body = "body_example"; // String | 
    try {
      apiInstance.changeInitials(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#changeInitials");
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
| **body** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="changePassword"></a>
# **changePassword**
> changePassword(updatePasswordDTO)

Update user&#39;s password

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    UpdatePasswordDTO updatePasswordDTO = new UpdatePasswordDTO(); // UpdatePasswordDTO | 
    try {
      apiInstance.changePassword(updatePasswordDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#changePassword");
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
| **updatePasswordDTO** | [**UpdatePasswordDTO**](UpdatePasswordDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="changeSignature"></a>
# **changeSignature**
> changeSignature(body)

Update user&#39;s eink signature in base64 format

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    String body = "body_example"; // String | 
    try {
      apiInstance.changeSignature(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#changeSignature");
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
| **body** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="confirmOauthEmailAndGetToken"></a>
# **confirmOauthEmailAndGetToken**
> LoginResponseDTO confirmOauthEmailAndGetToken(code, emailToMatch)

Confirm email from OAuth2 Identity Provider

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    String code = "code_example"; // String | Verification code
    String emailToMatch = "emailToMatch_example"; // String | Check email matches
    try {
      LoginResponseDTO result = apiInstance.confirmOauthEmailAndGetToken(code, emailToMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#confirmOauthEmailAndGetToken");
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
| **code** | **String**| Verification code | |
| **emailToMatch** | **String**| Check email matches | [optional] |

### Return type

[**LoginResponseDTO**](LoginResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteUser"></a>
# **deleteUser**
> deleteUser(checkMessage, leaveExisting)

Delete user himself

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    String checkMessage = "checkMessage_example"; // String | Proof message
    Boolean leaveExisting = true; // Boolean | Leave existing account and mailbox. In this case mailbox and account should have other owners, otherwise error will be returned.
    try {
      apiInstance.deleteUser(checkMessage, leaveExisting);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#deleteUser");
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
| **checkMessage** | **String**| Proof message | |
| **leaveExisting** | **Boolean**| Leave existing account and mailbox. In this case mailbox and account should have other owners, otherwise error will be returned. | |

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
| **204** | No Content |  -  |

<a id="findUser"></a>
# **findUser**
> List&lt;UserDTO&gt; findUser(keyword, exclude)

Find user

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    String keyword = "keyword_example"; // String | 
    UUID exclude = UUID.randomUUID(); // UUID | 
    try {
      List<UserDTO> result = apiInstance.findUser(keyword, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#findUser");
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
| **keyword** | **String**|  | |
| **exclude** | **UUID**|  | [optional] |

### Return type

[**List&lt;UserDTO&gt;**](UserDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAvatar"></a>
# **getAvatar**
> File getAvatar(uuid, initials)

Retrieve user avatar

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | 
    Boolean initials = true; // Boolean | Get default avatar
    try {
      File result = apiInstance.getAvatar(uuid, initials);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getAvatar");
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
| **uuid** | **UUID**|  | |
| **initials** | **Boolean**| Get default avatar | [optional] |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCorporateUserProfile"></a>
# **getCorporateUserProfile**
> CorporateProfileDTO getCorporateUserProfile(uuid, accountUuid)

Retrieve corporate user profile

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | 
    UUID accountUuid = UUID.randomUUID(); // UUID | 
    try {
      CorporateProfileDTO result = apiInstance.getCorporateUserProfile(uuid, accountUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getCorporateUserProfile");
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
| **uuid** | **UUID**|  | |
| **accountUuid** | **UUID**|  | |

### Return type

[**CorporateProfileDTO**](CorporateProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMailboxesInfo"></a>
# **getMailboxesInfo**
> Map&lt;String, UserInfoDTO&gt; getMailboxesInfo(UUID)

Retrieve users info

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    try {
      Map<String, UserInfoDTO> result = apiInstance.getMailboxesInfo(UUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getMailboxesInfo");
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
| **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  | |

### Return type

[**Map&lt;String, UserInfoDTO&gt;**](UserInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProfile"></a>
# **getProfile**
> ProfileDTO getProfile()

Retrieve self profile

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    try {
      ProfileDTO result = apiInstance.getProfile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getProfile");
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

[**ProfileDTO**](ProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateCorporateUserProfile"></a>
# **updateCorporateUserProfile**
> CorporateProfileDTO updateCorporateUserProfile(uuid, accountUuid, updateProfileDTO)

Update corporate user&#39;s profile

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | 
    UUID accountUuid = UUID.randomUUID(); // UUID | 
    UpdateProfileDTO updateProfileDTO = new UpdateProfileDTO(); // UpdateProfileDTO | 
    try {
      CorporateProfileDTO result = apiInstance.updateCorporateUserProfile(uuid, accountUuid, updateProfileDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#updateCorporateUserProfile");
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
| **uuid** | **UUID**|  | |
| **accountUuid** | **UUID**|  | |
| **updateProfileDTO** | [**UpdateProfileDTO**](UpdateProfileDTO.md)|  | |

### Return type

[**CorporateProfileDTO**](CorporateProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateProfile"></a>
# **updateProfile**
> ProfileDTO updateProfile(updateProfileDTO)

Update self profile

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    UpdateProfileDTO updateProfileDTO = new UpdateProfileDTO(); // UpdateProfileDTO | 
    try {
      ProfileDTO result = apiInstance.updateProfile(updateProfileDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#updateProfile");
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
| **updateProfileDTO** | [**UpdateProfileDTO**](UpdateProfileDTO.md)|  | |

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

