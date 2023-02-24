# UserControllerApi

All URIs are relative to *https://api.centredo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptInvite**](UserControllerApi.md#acceptInvite) | **POST** /api/v1/user/invite/accept/{inviteCode} | Accept invite
[**changePassword**](UserControllerApi.md#changePassword) | **PUT** /api/v1/user/password | Update user&#x27;s password
[**changeSignature**](UserControllerApi.md#changeSignature) | **PUT** /api/v1/user/signature | Update user&#x27;s eink signature in base64 format
[**createInvitation**](UserControllerApi.md#createInvitation) | **POST** /api/v1/user/invite | Create invitation to join account or mailbox with defined permissions.
[**declineInvite**](UserControllerApi.md#declineInvite) | **DELETE** /api/v1/user/invite/decline/{inviteCode} | Decline invite
[**deleteUser**](UserControllerApi.md#deleteUser) | **DELETE** /api/v1/user | Delete user himself
[**findUser**](UserControllerApi.md#findUser) | **GET** /api/v1/user/search | Find user
[**getAvatar**](UserControllerApi.md#getAvatar) | **GET** /api/v1/user/avatar/{userUuid} | Retrieve user avatar
[**getInvites**](UserControllerApi.md#getInvites) | **GET** /api/v1/user/invites | Get paged invites list
[**getMailboxesInfo**](UserControllerApi.md#getMailboxesInfo) | **POST** /api/v1/user/info | Retrieve users info
[**getProfile**](UserControllerApi.md#getProfile) | **GET** /api/v1/user/profile | Retrieve user profile
[**updateInvitation**](UserControllerApi.md#updateInvitation) | **PUT** /api/v1/user/invite/{uuid} | Update invitation by userUuid.
[**updateProfile**](UserControllerApi.md#updateProfile) | **PUT** /api/v1/user/profile | Update user&#x27;s profile

<a name="acceptInvite"></a>
# **acceptInvite**
> acceptInvite(inviteCode)

Accept invite

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
String inviteCode = "inviteCode_example"; // String | Invite code
try {
    apiInstance.acceptInvite(inviteCode);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#acceptInvite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteCode** | **String**| Invite code |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="changePassword"></a>
# **changePassword**
> changePassword(body)

Update user&#x27;s password

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

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
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

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

<a name="createInvitation"></a>
# **createInvitation**
> SingleUuidDTO createInvitation(body)

Create invitation to join account or mailbox with defined permissions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
InvitationPostDTO body = new InvitationPostDTO(); // InvitationPostDTO | 
try {
    SingleUuidDTO result = apiInstance.createInvitation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#createInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvitationPostDTO**](InvitationPostDTO.md)|  |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="declineInvite"></a>
# **declineInvite**
> declineInvite(inviteCode)

Decline invite

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
String inviteCode = "inviteCode_example"; // String | Invite code
try {
    apiInstance.declineInvite(inviteCode);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#declineInvite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteCode** | **String**| Invite code |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(checkMessage, leaveExisting)

Delete user himself

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

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
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

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
> File getAvatar(userUuid, initials)

Retrieve user avatar

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
UUID userUuid = new UUID(); // UUID | 
Boolean initials = true; // Boolean | Get default avatar
try {
    File result = apiInstance.getAvatar(userUuid, initials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#getAvatar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | [**UUID**](.md)|  |
 **initials** | **Boolean**| Get default avatar | [optional]

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvites"></a>
# **getInvites**
> PageDTOUserInvitationDTO getInvites(offset, limit)

Get paged invites list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
Integer offset = 0; // Integer | Offset records
Integer limit = 25; // Integer | Limit records, max is 1000
try {
    PageDTOUserInvitationDTO result = apiInstance.getInvites(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#getInvites");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| Offset records | [optional] [default to 0]
 **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25]

### Return type

[**PageDTOUserInvitationDTO**](PageDTOUserInvitationDTO.md)

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
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

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

Retrieve user profile

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

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

<a name="updateInvitation"></a>
# **updateInvitation**
> updateInvitation(body, uuid)

Update invitation by userUuid.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserControllerApi apiInstance = new UserControllerApi();
InvitationPutDTO body = new InvitationPutDTO(); // InvitationPutDTO | 
UUID uuid = new UUID(); // UUID | 
try {
    apiInstance.updateInvitation(body, uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#updateInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvitationPutDTO**](InvitationPutDTO.md)|  |
 **uuid** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateProfile"></a>
# **updateProfile**
> ProfileDTO updateProfile(body)

Update user&#x27;s profile

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

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

