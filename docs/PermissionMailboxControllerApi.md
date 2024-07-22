# PermissionMailboxControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAllPermissions**](PermissionMailboxControllerApi.md#deleteAllPermissions) | **DELETE** /api/v1/permission/{userUuid}/mailbox/{mailboxUuid} | Delete all permissions and roles for selected user-to-mailbox relation |
| [**deletePermission**](PermissionMailboxControllerApi.md#deletePermission) | **DELETE** /api/v1/permission/{userUuid}/mailbox/{mailboxUuid}/{permissionId} | Delete permission for specific user-to-mailbox relation |
| [**deleteRoleFromMailbox**](PermissionMailboxControllerApi.md#deleteRoleFromMailbox) | **DELETE** /api/v1/permission/{userUuid}/mailbox/{mailboxUuid}/role/{roleUuid} | Delete role |
| [**patchMbPermissions**](PermissionMailboxControllerApi.md#patchMbPermissions) | **PATCH** /api/v1/permission/{userUuid}/mailbox/{mailboxUuid} | Add exact permissions/roles leaving existing as is. Ignore if already present. |
| [**replaceAllPermissions**](PermissionMailboxControllerApi.md#replaceAllPermissions) | **PUT** /api/v1/permission/{userUuid}/mailbox/{mailboxUuid} | Replace all permissions for selected user-to-mailbox relation |


<a id="deleteAllPermissions"></a>
# **deleteAllPermissions**
> deleteAllPermissions(userUuid, mailboxUuid)

Delete all permissions and roles for selected user-to-mailbox relation

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.PermissionMailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    PermissionMailboxControllerApi apiInstance = new PermissionMailboxControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | UUID of User
    UUID mailboxUuid = UUID.randomUUID(); // UUID | UUID of mailbox
    try {
      apiInstance.deleteAllPermissions(userUuid, mailboxUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionMailboxControllerApi#deleteAllPermissions");
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
| **userUuid** | **UUID**| UUID of User | |
| **mailboxUuid** | **UUID**| UUID of mailbox | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deletePermission"></a>
# **deletePermission**
> deletePermission(userUuid, mailboxUuid, permissionId)

Delete permission for specific user-to-mailbox relation

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.PermissionMailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    PermissionMailboxControllerApi apiInstance = new PermissionMailboxControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | UUID of User
    UUID mailboxUuid = UUID.randomUUID(); // UUID | UUID of mailbox
    Integer permissionId = 56; // Integer | Permission Id
    try {
      apiInstance.deletePermission(userUuid, mailboxUuid, permissionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionMailboxControllerApi#deletePermission");
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
| **userUuid** | **UUID**| UUID of User | |
| **mailboxUuid** | **UUID**| UUID of mailbox | |
| **permissionId** | **Integer**| Permission Id | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deleteRoleFromMailbox"></a>
# **deleteRoleFromMailbox**
> deleteRoleFromMailbox(userUuid, mailboxUuid, roleUuid)

Delete role

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.PermissionMailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    PermissionMailboxControllerApi apiInstance = new PermissionMailboxControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | UUID of User
    UUID mailboxUuid = UUID.randomUUID(); // UUID | UUID of mailbox
    UUID roleUuid = UUID.randomUUID(); // UUID | UUID of role
    try {
      apiInstance.deleteRoleFromMailbox(userUuid, mailboxUuid, roleUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionMailboxControllerApi#deleteRoleFromMailbox");
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
| **userUuid** | **UUID**| UUID of User | |
| **mailboxUuid** | **UUID**| UUID of mailbox | |
| **roleUuid** | **UUID**| UUID of role | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="patchMbPermissions"></a>
# **patchMbPermissions**
> patchMbPermissions(userUuid, mailboxUuid, permissionsDTO)

Add exact permissions/roles leaving existing as is. Ignore if already present.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.PermissionMailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    PermissionMailboxControllerApi apiInstance = new PermissionMailboxControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | UUID of User
    UUID mailboxUuid = UUID.randomUUID(); // UUID | UUID of mailbox
    PermissionsDTO permissionsDTO = new PermissionsDTO(); // PermissionsDTO | 
    try {
      apiInstance.patchMbPermissions(userUuid, mailboxUuid, permissionsDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionMailboxControllerApi#patchMbPermissions");
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
| **userUuid** | **UUID**| UUID of User | |
| **mailboxUuid** | **UUID**| UUID of mailbox | |
| **permissionsDTO** | [**PermissionsDTO**](PermissionsDTO.md)|  | |

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

<a id="replaceAllPermissions"></a>
# **replaceAllPermissions**
> replaceAllPermissions(userUuid, mailboxUuid, permissionsDTO)

Replace all permissions for selected user-to-mailbox relation

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.PermissionMailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    PermissionMailboxControllerApi apiInstance = new PermissionMailboxControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | UUID of User
    UUID mailboxUuid = UUID.randomUUID(); // UUID | UUID of mailbox
    PermissionsDTO permissionsDTO = new PermissionsDTO(); // PermissionsDTO | 
    try {
      apiInstance.replaceAllPermissions(userUuid, mailboxUuid, permissionsDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionMailboxControllerApi#replaceAllPermissions");
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
| **userUuid** | **UUID**| UUID of User | |
| **mailboxUuid** | **UUID**| UUID of mailbox | |
| **permissionsDTO** | [**PermissionsDTO**](PermissionsDTO.md)|  | |

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

