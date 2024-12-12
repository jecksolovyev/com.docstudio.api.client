# UserControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeInitials**](UserControllerApi.md#changeInitials) | **PUT** /api/v1/user/initials | Update user&#x27;s initials in base64 format
[**changePassword**](UserControllerApi.md#changePassword) | **PUT** /api/v1/user/password | Update user&#x27;s password
[**changeSignature**](UserControllerApi.md#changeSignature) | **PUT** /api/v1/user/signature | Update user&#x27;s eink signature in base64 format
[**confirmOauthEmailAndGetToken**](UserControllerApi.md#confirmOauthEmailAndGetToken) | **GET** /api/v1/user/confirm-oauth-email-get-token | Confirm email from OAuth2 Identity Provider
[**deleteUser**](UserControllerApi.md#deleteUser) | **DELETE** /api/v1/user | Delete user himself
[**findUser**](UserControllerApi.md#findUser) | **GET** /api/v1/user/search | Find user
[**getAvatar**](UserControllerApi.md#getAvatar) | **GET** /api/v1/user/avatar/{uuid} | Retrieve user avatar
[**getCorporateUserProfile**](UserControllerApi.md#getCorporateUserProfile) | **GET** /api/v1/user/profile/{uuid}/account/{accountUuid} | Retrieve corporate user profile
[**getMailboxesInfo**](UserControllerApi.md#getMailboxesInfo) | **POST** /api/v1/user/info | Retrieve users info
[**getProfile**](UserControllerApi.md#getProfile) | **GET** /api/v1/user/profile | Retrieve self profile
[**updateCorporateUserProfile**](UserControllerApi.md#updateCorporateUserProfile) | **PUT** /api/v1/user/profile/{uuid}/account/{accountUuid} | Update corporate user&#x27;s profile
[**updateProfile**](UserControllerApi.md#updateProfile) | **PUT** /api/v1/user/profile | Update self profile

<a name="changeInitials"></a>
# **changeInitials**
> changeInitials(body)

Update user&#x27;s initials in base64 format

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
String body = "body_example"; // String | 
try {
    apiInstance.changeInitials(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#changeInitials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="changePassword"></a>
# **changePassword**
> changePassword(body)

Update user&#x27;s password

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
UpdatePasswordDTO body = new UpdatePasswordDTO(); // UpdatePasswordDTO | 
try {
    apiInstance.changePassword(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdatePasswordDTO**](UpdatePasswordDTO.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="changeSignature"></a>
# **changeSignature**
> changeSignature(body)

Update user&#x27;s eink signature in base64 format

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
String body = "body_example"; // String | 
try {
    apiInstance.changeSignature(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#changeSignature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="confirmOauthEmailAndGetToken"></a>
# **confirmOauthEmailAndGetToken**
> LoginResponseDTO confirmOauthEmailAndGetToken(code, emailToMatch)

Confirm email from OAuth2 Identity Provider

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import com.docstudio.client.api.UserControllerApi;


UserControllerApi apiInstance = new UserControllerApi();
String code = "code_example"; // String | Verification code
String emailToMatch = "emailToMatch_example"; // String | Check email matches
try {
    LoginResponseDTO result = apiInstance.confirmOauthEmailAndGetToken(code, emailToMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#confirmOauthEmailAndGetToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Verification code |
 **emailToMatch** | **String**| Check email matches | [optional]

### Return type

[**LoginResponseDTO**](LoginResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(checkMessage, leaveExisting)

Delete user himself

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
String checkMessage = "checkMessage_example"; // String | Proof message
Boolean leaveExisting = true; // Boolean | Leave existing account and mailbox. In this case mailbox and account should have other owners, otherwise error will be returned.
try {
    apiInstance.deleteUser(checkMessage, leaveExisting);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkMessage** | **String**| Proof message |
 **leaveExisting** | **Boolean**| Leave existing account and mailbox. In this case mailbox and account should have other owners, otherwise error will be returned. |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findUser"></a>
# **findUser**
> List&lt;UserDTO&gt; findUser(keyword, exclude)

Find user

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
String keyword = "keyword_example"; // String | 
UUID exclude = new UUID(); // UUID | 
try {
    List<UserDTO> result = apiInstance.findUser(keyword, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#findUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyword** | **String**|  |
 **exclude** | [**UUID**](.md)|  | [optional]

### Return type

[**List&lt;UserDTO&gt;**](UserDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAvatar"></a>
# **getAvatar**
> File getAvatar(uuid, initials)

Retrieve user avatar

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
UUID uuid = new UUID(); // UUID | 
Boolean initials = true; // Boolean | Get default avatar
try {
    File result = apiInstance.getAvatar(uuid, initials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#getAvatar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  |
 **initials** | **Boolean**| Get default avatar | [optional]

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporateUserProfile"></a>
# **getCorporateUserProfile**
> CorporateProfileDTO getCorporateUserProfile(uuid, accountUuid)

Retrieve corporate user profile

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
UUID uuid = new UUID(); // UUID | 
UUID accountUuid = new UUID(); // UUID | 
try {
    CorporateProfileDTO result = apiInstance.getCorporateUserProfile(uuid, accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#getCorporateUserProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  |
 **accountUuid** | [**UUID**](.md)|  |

### Return type

[**CorporateProfileDTO**](CorporateProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMailboxesInfo"></a>
# **getMailboxesInfo**
> Map&lt;String, UserInfoDTO&gt; getMailboxesInfo(body)

Retrieve users info

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
List<UUID> body = Arrays.asList(new UUID()); // List<UUID> | 
try {
    Map<String, UserInfoDTO> result = apiInstance.getMailboxesInfo(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#getMailboxesInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;UUID&gt;**](UUID.md)|  |

### Return type

[**Map&lt;String, UserInfoDTO&gt;**](UserInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProfile"></a>
# **getProfile**
> ProfileDTO getProfile()

Retrieve self profile

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
try {
    ProfileDTO result = apiInstance.getProfile();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#getProfile");
    e.printStackTrace();
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

<a name="updateCorporateUserProfile"></a>
# **updateCorporateUserProfile**
> CorporateProfileDTO updateCorporateUserProfile(body, uuid, accountUuid)

Update corporate user&#x27;s profile

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
UpdateProfileDTO body = new UpdateProfileDTO(); // UpdateProfileDTO | 
UUID uuid = new UUID(); // UUID | 
UUID accountUuid = new UUID(); // UUID | 
try {
    CorporateProfileDTO result = apiInstance.updateCorporateUserProfile(body, uuid, accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#updateCorporateUserProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateProfileDTO**](UpdateProfileDTO.md)|  |
 **uuid** | [**UUID**](.md)|  |
 **accountUuid** | [**UUID**](.md)|  |

### Return type

[**CorporateProfileDTO**](CorporateProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProfile"></a>
# **updateProfile**
> ProfileDTO updateProfile(body)

Update self profile

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
UpdateProfileDTO body = new UpdateProfileDTO(); // UpdateProfileDTO | 
try {
    ProfileDTO result = apiInstance.updateProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#updateProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateProfileDTO**](UpdateProfileDTO.md)|  |

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

