# PermissionAccountControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAccAllPermissions**](PermissionAccountControllerApi.md#deleteAccAllPermissions) | **DELETE** /api/v1/permission/{userUuid}/account/{accountUuid} | Delete user from account totally
[**deleteAccPermission**](PermissionAccountControllerApi.md#deleteAccPermission) | **DELETE** /api/v1/permission/{userUuid}/account/{accountUuid}/{permissionId} | Delete permission for specific &#x27;user-to-account&#x27; relation
[**deleteAccRole**](PermissionAccountControllerApi.md#deleteAccRole) | **DELETE** /api/v1/permission/{userUuid}/account/{accountUuid}/role/{roleUuid} | Delete role
[**getUserAccountPermissions**](PermissionAccountControllerApi.md#getUserAccountPermissions) | **GET** /api/v1/permission/{userUuid}/account/{accountUuid} | Read all user permissions
[**patchMbPermissionsPermissionAccount**](PermissionAccountControllerApi.md#patchMbPermissionsPermissionAccount) | **PATCH** /api/v1/permission/{userUuid}/account/{accountUuid} | Add exact permission for selected user-to-account relation. Add if absent or ignore if already present.
[**replaceAllPermissionsPermissionAccount**](PermissionAccountControllerApi.md#replaceAllPermissionsPermissionAccount) | **PUT** /api/v1/permission/{userUuid}/account/{accountUuid} | Replace all permissions for selected user-to-account relation
[**setUserAccountPermissions**](PermissionAccountControllerApi.md#setUserAccountPermissions) | **POST** /api/v1/permission/{userUuid}/account/{accountUuid} | Write user permissions

<a name="deleteAccAllPermissions"></a>
# **deleteAccAllPermissions**
> deleteAccAllPermissions(userUuid, accountUuid)

Delete user from account totally

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.PermissionAccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PermissionAccountControllerApi apiInstance = new PermissionAccountControllerApi();
UUID userUuid = new UUID(); // UUID | UUID of User
UUID accountUuid = new UUID(); // UUID | UUID of account
try {
    apiInstance.deleteAccAllPermissions(userUuid, accountUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionAccountControllerApi#deleteAccAllPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | [**UUID**](.md)| UUID of User |
 **accountUuid** | [**UUID**](.md)| UUID of account |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAccPermission"></a>
# **deleteAccPermission**
> deleteAccPermission(userUuid, accountUuid, permissionId)

Delete permission for specific &#x27;user-to-account&#x27; relation

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.PermissionAccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PermissionAccountControllerApi apiInstance = new PermissionAccountControllerApi();
UUID userUuid = new UUID(); // UUID | UUID of User
UUID accountUuid = new UUID(); // UUID | UUID of account
Integer permissionId = 56; // Integer | Permission Id
try {
    apiInstance.deleteAccPermission(userUuid, accountUuid, permissionId);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionAccountControllerApi#deleteAccPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | [**UUID**](.md)| UUID of User |
 **accountUuid** | [**UUID**](.md)| UUID of account |
 **permissionId** | **Integer**| Permission Id |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAccRole"></a>
# **deleteAccRole**
> deleteAccRole(userUuid, accountUuid, roleUuid)

Delete role

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.PermissionAccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PermissionAccountControllerApi apiInstance = new PermissionAccountControllerApi();
UUID userUuid = new UUID(); // UUID | UUID of User
UUID accountUuid = new UUID(); // UUID | UUID of account
UUID roleUuid = new UUID(); // UUID | UUID of role
try {
    apiInstance.deleteAccRole(userUuid, accountUuid, roleUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionAccountControllerApi#deleteAccRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | [**UUID**](.md)| UUID of User |
 **accountUuid** | [**UUID**](.md)| UUID of account |
 **roleUuid** | [**UUID**](.md)| UUID of role |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUserAccountPermissions"></a>
# **getUserAccountPermissions**
> AccountPermissionsDTO getUserAccountPermissions(userUuid, accountUuid)

Read all user permissions

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.PermissionAccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PermissionAccountControllerApi apiInstance = new PermissionAccountControllerApi();
UUID userUuid = new UUID(); // UUID | UUID of User
UUID accountUuid = new UUID(); // UUID | UUID of account
try {
    AccountPermissionsDTO result = apiInstance.getUserAccountPermissions(userUuid, accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionAccountControllerApi#getUserAccountPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | [**UUID**](.md)| UUID of User |
 **accountUuid** | [**UUID**](.md)| UUID of account |

### Return type

[**AccountPermissionsDTO**](AccountPermissionsDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchMbPermissionsPermissionAccount"></a>
# **patchMbPermissionsPermissionAccount**
> patchMbPermissionsPermissionAccount(body, userUuid, accountUuid)

Add exact permission for selected user-to-account relation. Add if absent or ignore if already present.

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.PermissionAccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PermissionAccountControllerApi apiInstance = new PermissionAccountControllerApi();
PermissionsDTO body = new PermissionsDTO(); // PermissionsDTO | 
UUID userUuid = new UUID(); // UUID | UUID of User
UUID accountUuid = new UUID(); // UUID | UUID of account
try {
    apiInstance.patchMbPermissionsPermissionAccount(body, userUuid, accountUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionAccountControllerApi#patchMbPermissionsPermissionAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PermissionsDTO**](PermissionsDTO.md)|  |
 **userUuid** | [**UUID**](.md)| UUID of User |
 **accountUuid** | [**UUID**](.md)| UUID of account |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="replaceAllPermissionsPermissionAccount"></a>
# **replaceAllPermissionsPermissionAccount**
> replaceAllPermissionsPermissionAccount(body, userUuid, accountUuid)

Replace all permissions for selected user-to-account relation

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.PermissionAccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PermissionAccountControllerApi apiInstance = new PermissionAccountControllerApi();
PermissionsDTO body = new PermissionsDTO(); // PermissionsDTO | 
UUID userUuid = new UUID(); // UUID | UUID of User
UUID accountUuid = new UUID(); // UUID | UUID of account
try {
    apiInstance.replaceAllPermissionsPermissionAccount(body, userUuid, accountUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionAccountControllerApi#replaceAllPermissionsPermissionAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PermissionsDTO**](PermissionsDTO.md)|  |
 **userUuid** | [**UUID**](.md)| UUID of User |
 **accountUuid** | [**UUID**](.md)| UUID of account |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="setUserAccountPermissions"></a>
# **setUserAccountPermissions**
> setUserAccountPermissions(body, userUuid, accountUuid)

Write user permissions

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.PermissionAccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PermissionAccountControllerApi apiInstance = new PermissionAccountControllerApi();
BasePermissionsDTO body = new BasePermissionsDTO(); // BasePermissionsDTO | 
UUID userUuid = new UUID(); // UUID | UUID of User
UUID accountUuid = new UUID(); // UUID | UUID of account
try {
    apiInstance.setUserAccountPermissions(body, userUuid, accountUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionAccountControllerApi#setUserAccountPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BasePermissionsDTO**](BasePermissionsDTO.md)|  |
 **userUuid** | [**UUID**](.md)| UUID of User |
 **accountUuid** | [**UUID**](.md)| UUID of account |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

