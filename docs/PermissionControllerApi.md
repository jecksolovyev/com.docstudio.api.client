# PermissionControllerApi

All URIs are relative to *https://api.centredo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resendInvitation**](PermissionControllerApi.md#resendInvitation) | **POST** /api/v1/permission/invite/{accountUuid}/{userUuid}/resend | Resend invitation for user to account
[**revokeInvitation**](PermissionControllerApi.md#revokeInvitation) | **DELETE** /api/v1/permission/invite/{accountUuid}/{userUuid} | Revoke invitation for user to account

<a name="resendInvitation"></a>
# **resendInvitation**
> resendInvitation(accountUuid, userUuid)

Resend invitation for user to account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PermissionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PermissionControllerApi apiInstance = new PermissionControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID userUuid = new UUID(); // UUID | User UUID
try {
    apiInstance.resendInvitation(accountUuid, userUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionControllerApi#resendInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **userUuid** | [**UUID**](.md)| User UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="revokeInvitation"></a>
# **revokeInvitation**
> revokeInvitation(accountUuid, userUuid)

Revoke invitation for user to account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PermissionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PermissionControllerApi apiInstance = new PermissionControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID userUuid = new UUID(); // UUID | User UUID
try {
    apiInstance.revokeInvitation(accountUuid, userUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionControllerApi#revokeInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **userUuid** | [**UUID**](.md)| User UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

