# UserInviteControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptInvite**](UserInviteControllerApi.md#acceptInvite) | **POST** /api/v1/user/invite/accept/{inviteCode} | Accept invite
[**createInvitation**](UserInviteControllerApi.md#createInvitation) | **POST** /api/v1/user/invite | Create invitation to join account or mailbox with defined permissions
[**declineInvite**](UserInviteControllerApi.md#declineInvite) | **DELETE** /api/v1/user/invite/decline/{inviteCode} | Decline invite
[**getInvites**](UserInviteControllerApi.md#getInvites) | **GET** /api/v1/user/invites | Get paged invites list
[**updateInvitation**](UserInviteControllerApi.md#updateInvitation) | **PUT** /api/v1/user/invite/{uuid} | Update invitation by userUuid

<a name="acceptInvite"></a>
# **acceptInvite**
> acceptInvite(inviteCode)

Accept invite

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserInviteControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserInviteControllerApi apiInstance = new UserInviteControllerApi();
String inviteCode = "inviteCode_example"; // String | Invite code
try {
    apiInstance.acceptInvite(inviteCode);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInviteControllerApi#acceptInvite");
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

<a name="createInvitation"></a>
# **createInvitation**
> SingleUuidDTO createInvitation(body)

Create invitation to join account or mailbox with defined permissions

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserInviteControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserInviteControllerApi apiInstance = new UserInviteControllerApi();
InvitationPostDTO body = new InvitationPostDTO(); // InvitationPostDTO | 
try {
    SingleUuidDTO result = apiInstance.createInvitation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInviteControllerApi#createInvitation");
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
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserInviteControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserInviteControllerApi apiInstance = new UserInviteControllerApi();
String inviteCode = "inviteCode_example"; // String | Invite code
try {
    apiInstance.declineInvite(inviteCode);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInviteControllerApi#declineInvite");
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

<a name="getInvites"></a>
# **getInvites**
> PageDTOUserInvitationDTO getInvites(offset, limit)

Get paged invites list

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserInviteControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserInviteControllerApi apiInstance = new UserInviteControllerApi();
Integer offset = 0; // Integer | Offset records
Integer limit = 25; // Integer | Limit records, max is 1000
try {
    PageDTOUserInvitationDTO result = apiInstance.getInvites(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInviteControllerApi#getInvites");
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

<a name="updateInvitation"></a>
# **updateInvitation**
> updateInvitation(body, uuid)

Update invitation by userUuid

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.UserInviteControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserInviteControllerApi apiInstance = new UserInviteControllerApi();
InvitationPutDTO body = new InvitationPutDTO(); // InvitationPutDTO | 
UUID uuid = new UUID(); // UUID | 
try {
    apiInstance.updateInvitation(body, uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInviteControllerApi#updateInvitation");
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

