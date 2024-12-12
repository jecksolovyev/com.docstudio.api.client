# PermissionMailboxControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAllPermissions**](PermissionMailboxControllerApi.md#deleteAllPermissions) | **DELETE** /api/v1/permission/{userUuid}/mailbox/{mailboxUuid} | Delete all permissions and roles for selected user-to-mailbox relation
[**deletePermission**](PermissionMailboxControllerApi.md#deletePermission) | **DELETE** /api/v1/permission/{userUuid}/mailbox/{mailboxUuid}/{permissionId} | Delete permission for specific user-to-mailbox relation
[**deleteRoleFromMailbox**](PermissionMailboxControllerApi.md#deleteRoleFromMailbox) | **DELETE** /api/v1/permission/{userUuid}/mailbox/{mailboxUuid}/role/{roleUuid} | Delete role
[**patchMbPermissions**](PermissionMailboxControllerApi.md#patchMbPermissions) | **PATCH** /api/v1/permission/{userUuid}/mailbox/{mailboxUuid} | Add exact permissions/roles leaving existing as is. Ignore if already present.
[**replaceAllPermissions**](PermissionMailboxControllerApi.md#replaceAllPermissions) | **PUT** /api/v1/permission/{userUuid}/mailbox/{mailboxUuid} | Replace all permissions for selected user-to-mailbox relation

<a name="deleteAllPermissions"></a>
# **deleteAllPermissions**
> deleteAllPermissions(userUuid, mailboxUuid)

Delete all permissions and roles for selected user-to-mailbox relation

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.PermissionMailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PermissionMailboxControllerApi apiInstance = new PermissionMailboxControllerApi();
UUID userUuid = new UUID(); // UUID | UUID of User
UUID mailboxUuid = new UUID(); // UUID | UUID of mailbox
try {
    apiInstance.deleteAllPermissions(userUuid, mailboxUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionMailboxControllerApi#deleteAllPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | [**UUID**](.md)| UUID of User |
 **mailboxUuid** | [**UUID**](.md)| UUID of mailbox |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deletePermission"></a>
# **deletePermission**
> deletePermission(userUuid, mailboxUuid, permissionId)

Delete permission for specific user-to-mailbox relation

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.PermissionMailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PermissionMailboxControllerApi apiInstance = new PermissionMailboxControllerApi();
UUID userUuid = new UUID(); // UUID | UUID of User
UUID mailboxUuid = new UUID(); // UUID | UUID of mailbox
Integer permissionId = 56; // Integer | Permission Id
try {
    apiInstance.deletePermission(userUuid, mailboxUuid, permissionId);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionMailboxControllerApi#deletePermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | [**UUID**](.md)| UUID of User |
 **mailboxUuid** | [**UUID**](.md)| UUID of mailbox |
 **permissionId** | **Integer**| Permission Id |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteRoleFromMailbox"></a>
# **deleteRoleFromMailbox**
> deleteRoleFromMailbox(userUuid, mailboxUuid, roleUuid)

Delete role

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.PermissionMailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PermissionMailboxControllerApi apiInstance = new PermissionMailboxControllerApi();
UUID userUuid = new UUID(); // UUID | UUID of User
UUID mailboxUuid = new UUID(); // UUID | UUID of mailbox
UUID roleUuid = new UUID(); // UUID | UUID of role
try {
    apiInstance.deleteRoleFromMailbox(userUuid, mailboxUuid, roleUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionMailboxControllerApi#deleteRoleFromMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | [**UUID**](.md)| UUID of User |
 **mailboxUuid** | [**UUID**](.md)| UUID of mailbox |
 **roleUuid** | [**UUID**](.md)| UUID of role |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="patchMbPermissions"></a>
# **patchMbPermissions**
> patchMbPermissions(body, userUuid, mailboxUuid)

Add exact permissions/roles leaving existing as is. Ignore if already present.

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.PermissionMailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PermissionMailboxControllerApi apiInstance = new PermissionMailboxControllerApi();
PermissionsDTO body = new PermissionsDTO(); // PermissionsDTO | 
UUID userUuid = new UUID(); // UUID | UUID of User
UUID mailboxUuid = new UUID(); // UUID | UUID of mailbox
try {
    apiInstance.patchMbPermissions(body, userUuid, mailboxUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionMailboxControllerApi#patchMbPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PermissionsDTO**](PermissionsDTO.md)|  |
 **userUuid** | [**UUID**](.md)| UUID of User |
 **mailboxUuid** | [**UUID**](.md)| UUID of mailbox |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="replaceAllPermissions"></a>
# **replaceAllPermissions**
> replaceAllPermissions(body, userUuid, mailboxUuid)

Replace all permissions for selected user-to-mailbox relation

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.PermissionMailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PermissionMailboxControllerApi apiInstance = new PermissionMailboxControllerApi();
PermissionsDTO body = new PermissionsDTO(); // PermissionsDTO | 
UUID userUuid = new UUID(); // UUID | UUID of User
UUID mailboxUuid = new UUID(); // UUID | UUID of mailbox
try {
    apiInstance.replaceAllPermissions(body, userUuid, mailboxUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionMailboxControllerApi#replaceAllPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PermissionsDTO**](PermissionsDTO.md)|  |
 **userUuid** | [**UUID**](.md)| UUID of User |
 **mailboxUuid** | [**UUID**](.md)| UUID of mailbox |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

