# PermissionAccountControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAccAllPermissions**](PermissionAccountControllerApi.md#deleteAccAllPermissions) | **DELETE** /api/v1/permission/{userUuid}/account/{accountUuid} | Delete user from account totally |
| [**deleteAccPermission**](PermissionAccountControllerApi.md#deleteAccPermission) | **DELETE** /api/v1/permission/{userUuid}/account/{accountUuid}/{permissionId} | Delete permission for specific &#39;user-to-account&#39; relation |
| [**deleteAccRole**](PermissionAccountControllerApi.md#deleteAccRole) | **DELETE** /api/v1/permission/{userUuid}/account/{accountUuid}/role/{roleUuid} | Delete role |
| [**getUserAccountPermissions**](PermissionAccountControllerApi.md#getUserAccountPermissions) | **GET** /api/v1/permission/{userUuid}/account/{accountUuid} | Read all user permissions |
| [**patchMbPermissions1**](PermissionAccountControllerApi.md#patchMbPermissions1) | **PATCH** /api/v1/permission/{userUuid}/account/{accountUuid} | Add exact permission for selected user-to-account relation. Add if absent or ignore if already present. |
| [**replaceAllPermissions1**](PermissionAccountControllerApi.md#replaceAllPermissions1) | **PUT** /api/v1/permission/{userUuid}/account/{accountUuid} | Replace all permissions for selected user-to-account relation |
| [**setUserAccountPermissions**](PermissionAccountControllerApi.md#setUserAccountPermissions) | **POST** /api/v1/permission/{userUuid}/account/{accountUuid} | Write user permissions |


<a id="deleteAccAllPermissions"></a>
# **deleteAccAllPermissions**
> deleteAccAllPermissions(userUuid, accountUuid)

Delete user from account totally

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.PermissionAccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PermissionAccountControllerApi apiInstance = new PermissionAccountControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | UUID of User
    UUID accountUuid = UUID.randomUUID(); // UUID | UUID of account
    try {
      apiInstance.deleteAccAllPermissions(userUuid, accountUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionAccountControllerApi#deleteAccAllPermissions");
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
| **accountUuid** | **UUID**| UUID of account | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deleteAccPermission"></a>
# **deleteAccPermission**
> deleteAccPermission(userUuid, accountUuid, permissionId)

Delete permission for specific &#39;user-to-account&#39; relation

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.PermissionAccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PermissionAccountControllerApi apiInstance = new PermissionAccountControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | UUID of User
    UUID accountUuid = UUID.randomUUID(); // UUID | UUID of account
    Integer permissionId = 56; // Integer | Permission Id
    try {
      apiInstance.deleteAccPermission(userUuid, accountUuid, permissionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionAccountControllerApi#deleteAccPermission");
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
| **accountUuid** | **UUID**| UUID of account | |
| **permissionId** | **Integer**| Permission Id | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deleteAccRole"></a>
# **deleteAccRole**
> deleteAccRole(userUuid, accountUuid, roleUuid)

Delete role

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.PermissionAccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PermissionAccountControllerApi apiInstance = new PermissionAccountControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | UUID of User
    UUID accountUuid = UUID.randomUUID(); // UUID | UUID of account
    UUID roleUuid = UUID.randomUUID(); // UUID | UUID of role
    try {
      apiInstance.deleteAccRole(userUuid, accountUuid, roleUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionAccountControllerApi#deleteAccRole");
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
| **accountUuid** | **UUID**| UUID of account | |
| **roleUuid** | **UUID**| UUID of role | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="getUserAccountPermissions"></a>
# **getUserAccountPermissions**
> AccountPermissionsDTO getUserAccountPermissions(userUuid, accountUuid)

Read all user permissions

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.PermissionAccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PermissionAccountControllerApi apiInstance = new PermissionAccountControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | UUID of User
    UUID accountUuid = UUID.randomUUID(); // UUID | UUID of account
    try {
      AccountPermissionsDTO result = apiInstance.getUserAccountPermissions(userUuid, accountUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionAccountControllerApi#getUserAccountPermissions");
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
| **accountUuid** | **UUID**| UUID of account | |

### Return type

[**AccountPermissionsDTO**](AccountPermissionsDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="patchMbPermissions1"></a>
# **patchMbPermissions1**
> patchMbPermissions1(userUuid, accountUuid, permissionsDTO)

Add exact permission for selected user-to-account relation. Add if absent or ignore if already present.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.PermissionAccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PermissionAccountControllerApi apiInstance = new PermissionAccountControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | UUID of User
    UUID accountUuid = UUID.randomUUID(); // UUID | UUID of account
    PermissionsDTO permissionsDTO = new PermissionsDTO(); // PermissionsDTO | 
    try {
      apiInstance.patchMbPermissions1(userUuid, accountUuid, permissionsDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionAccountControllerApi#patchMbPermissions1");
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
| **accountUuid** | **UUID**| UUID of account | |
| **permissionsDTO** | [**PermissionsDTO**](PermissionsDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="replaceAllPermissions1"></a>
# **replaceAllPermissions1**
> replaceAllPermissions1(userUuid, accountUuid, permissionsDTO)

Replace all permissions for selected user-to-account relation

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.PermissionAccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PermissionAccountControllerApi apiInstance = new PermissionAccountControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | UUID of User
    UUID accountUuid = UUID.randomUUID(); // UUID | UUID of account
    PermissionsDTO permissionsDTO = new PermissionsDTO(); // PermissionsDTO | 
    try {
      apiInstance.replaceAllPermissions1(userUuid, accountUuid, permissionsDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionAccountControllerApi#replaceAllPermissions1");
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
| **accountUuid** | **UUID**| UUID of account | |
| **permissionsDTO** | [**PermissionsDTO**](PermissionsDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="setUserAccountPermissions"></a>
# **setUserAccountPermissions**
> setUserAccountPermissions(userUuid, accountUuid, basePermissionsDTO)

Write user permissions

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.PermissionAccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PermissionAccountControllerApi apiInstance = new PermissionAccountControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | UUID of User
    UUID accountUuid = UUID.randomUUID(); // UUID | UUID of account
    BasePermissionsDTO basePermissionsDTO = new BasePermissionsDTO(); // BasePermissionsDTO | 
    try {
      apiInstance.setUserAccountPermissions(userUuid, accountUuid, basePermissionsDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionAccountControllerApi#setUserAccountPermissions");
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
| **accountUuid** | **UUID**| UUID of account | |
| **basePermissionsDTO** | [**BasePermissionsDTO**](BasePermissionsDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

