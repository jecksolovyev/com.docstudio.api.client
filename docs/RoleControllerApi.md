# RoleControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRole**](RoleControllerApi.md#createRole) | **POST** /api/v1/permission/role | Create a role |
| [**delete**](RoleControllerApi.md#delete) | **DELETE** /api/v1/permission/role/{uuid} |  |
| [**read**](RoleControllerApi.md#read) | **GET** /api/v1/permission/role/{uuid} | Read role by UUID |
| [**readAll**](RoleControllerApi.md#readAll) | **GET** /api/v1/permission/role | Read all system roles |
| [**readAllWithAccount**](RoleControllerApi.md#readAllWithAccount) | **GET** /api/v1/permission/role/account/{uuid} | Read all roles for account including system predefined |
| [**updateRole**](RoleControllerApi.md#updateRole) | **PUT** /api/v1/permission/role/{uuid} | Update role, allow to change name and permissions |


<a id="createRole"></a>
# **createRole**
> RoleGetDTO createRole(roleCreateDTO)

Create a role

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.RoleControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    RoleControllerApi apiInstance = new RoleControllerApi(defaultClient);
    RoleCreateDTO roleCreateDTO = new RoleCreateDTO(); // RoleCreateDTO | 
    try {
      RoleGetDTO result = apiInstance.createRole(roleCreateDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoleControllerApi#createRole");
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
| **roleCreateDTO** | [**RoleCreateDTO**](RoleCreateDTO.md)|  | |

### Return type

[**RoleGetDTO**](RoleGetDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="delete"></a>
# **delete**
> delete(uuid)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.RoleControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    RoleControllerApi apiInstance = new RoleControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.delete(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoleControllerApi#delete");
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

<a id="read"></a>
# **read**
> RoleGetDTO read(uuid)

Read role by UUID

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.RoleControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    RoleControllerApi apiInstance = new RoleControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | 
    try {
      RoleGetDTO result = apiInstance.read(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoleControllerApi#read");
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

### Return type

[**RoleGetDTO**](RoleGetDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readAll"></a>
# **readAll**
> PageDTORoleGetDTO readAll(offset, limit)

Read all system roles

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.RoleControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    RoleControllerApi apiInstance = new RoleControllerApi(defaultClient);
    Integer offset = 0; // Integer | Offset, how much roles to skip
    Integer limit = 25; // Integer | Limit, how much roles to retrieve
    try {
      PageDTORoleGetDTO result = apiInstance.readAll(offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoleControllerApi#readAll");
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
| **offset** | **Integer**| Offset, how much roles to skip | [optional] [default to 0] |
| **limit** | **Integer**| Limit, how much roles to retrieve | [optional] [default to 25] |

### Return type

[**PageDTORoleGetDTO**](PageDTORoleGetDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readAllWithAccount"></a>
# **readAllWithAccount**
> PageDTORoleGetDTO readAllWithAccount(uuid, type, name, permissions, offset, limit)

Read all roles for account including system predefined

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.RoleControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    RoleControllerApi apiInstance = new RoleControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | 
    String type = "account"; // String | 
    String name = "name_example"; // String | Name to search by
    List<Integer> permissions = Arrays.asList(); // List<Integer> | Permissions to search by
    Integer offset = 0; // Integer | Offset, how much roles to skip
    Integer limit = 25; // Integer | Limit, how much roles to retrieve
    try {
      PageDTORoleGetDTO result = apiInstance.readAllWithAccount(uuid, type, name, permissions, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoleControllerApi#readAllWithAccount");
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
| **type** | **String**|  | [optional] [enum: account, mailbox] |
| **name** | **String**| Name to search by | [optional] |
| **permissions** | [**List&lt;Integer&gt;**](Integer.md)| Permissions to search by | [optional] |
| **offset** | **Integer**| Offset, how much roles to skip | [optional] [default to 0] |
| **limit** | **Integer**| Limit, how much roles to retrieve | [optional] [default to 25] |

### Return type

[**PageDTORoleGetDTO**](PageDTORoleGetDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateRole"></a>
# **updateRole**
> RoleGetDTO updateRole(uuid, roleCreateDTO)

Update role, allow to change name and permissions

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.RoleControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    RoleControllerApi apiInstance = new RoleControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | 
    RoleCreateDTO roleCreateDTO = new RoleCreateDTO(); // RoleCreateDTO | 
    try {
      RoleGetDTO result = apiInstance.updateRole(uuid, roleCreateDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoleControllerApi#updateRole");
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
| **roleCreateDTO** | [**RoleCreateDTO**](RoleCreateDTO.md)|  | |

### Return type

[**RoleGetDTO**](RoleGetDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

