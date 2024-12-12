# RoleControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRole**](RoleControllerApi.md#createRole) | **POST** /api/v1/permission/role | Create a role
[**delete**](RoleControllerApi.md#delete) | **DELETE** /api/v1/permission/role/{uuid} | 
[**read**](RoleControllerApi.md#read) | **GET** /api/v1/permission/role/{uuid} | Read role by UUID
[**readAll**](RoleControllerApi.md#readAll) | **GET** /api/v1/permission/role | Read all system roles
[**readAllWithAccount**](RoleControllerApi.md#readAllWithAccount) | **GET** /api/v1/permission/role/account/{uuid} | Read all roles for account including system predefined
[**updateRole**](RoleControllerApi.md#updateRole) | **PUT** /api/v1/permission/role/{uuid} | Update role, allow to change name and permissions

<a name="createRole"></a>
# **createRole**
> RoleGetDTO createRole(body)

Create a role

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.RoleControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RoleControllerApi apiInstance = new RoleControllerApi();
RoleCreateDTO body = new RoleCreateDTO(); // RoleCreateDTO | 
try {
    RoleGetDTO result = apiInstance.createRole(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#createRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleCreateDTO**](RoleCreateDTO.md)|  |

### Return type

[**RoleGetDTO**](RoleGetDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> delete(uuid)



### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.RoleControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RoleControllerApi apiInstance = new RoleControllerApi();
UUID uuid = new UUID(); // UUID | 
try {
    apiInstance.delete(uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="read"></a>
# **read**
> RoleGetDTO read(uuid)

Read role by UUID

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.RoleControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RoleControllerApi apiInstance = new RoleControllerApi();
UUID uuid = new UUID(); // UUID | 
try {
    RoleGetDTO result = apiInstance.read(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  |

### Return type

[**RoleGetDTO**](RoleGetDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readAll"></a>
# **readAll**
> PageDTORoleGetDTO readAll(offset, limit)

Read all system roles

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.RoleControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RoleControllerApi apiInstance = new RoleControllerApi();
Integer offset = 0; // Integer | Offset, how much roles to skip
Integer limit = 25; // Integer | Limit, how much roles to retrieve
try {
    PageDTORoleGetDTO result = apiInstance.readAll(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#readAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| Offset, how much roles to skip | [optional] [default to 0]
 **limit** | **Integer**| Limit, how much roles to retrieve | [optional] [default to 25]

### Return type

[**PageDTORoleGetDTO**](PageDTORoleGetDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readAllWithAccount"></a>
# **readAllWithAccount**
> PageDTORoleGetDTO readAllWithAccount(uuid, type, name, permissions, offset, limit)

Read all roles for account including system predefined

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.RoleControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RoleControllerApi apiInstance = new RoleControllerApi();
UUID uuid = new UUID(); // UUID | 
String type = "type_example"; // String | 
String name = "name_example"; // String | Name to search by
List<Integer> permissions = Arrays.asList(56); // List<Integer> | Permissions to search by
Integer offset = 0; // Integer | Offset, how much roles to skip
Integer limit = 25; // Integer | Limit, how much roles to retrieve
try {
    PageDTORoleGetDTO result = apiInstance.readAllWithAccount(uuid, type, name, permissions, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#readAllWithAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  |
 **type** | **String**|  | [optional] [enum: account, mailbox]
 **name** | **String**| Name to search by | [optional]
 **permissions** | [**List&lt;Integer&gt;**](Integer.md)| Permissions to search by | [optional]
 **offset** | **Integer**| Offset, how much roles to skip | [optional] [default to 0]
 **limit** | **Integer**| Limit, how much roles to retrieve | [optional] [default to 25]

### Return type

[**PageDTORoleGetDTO**](PageDTORoleGetDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRole"></a>
# **updateRole**
> RoleGetDTO updateRole(body, uuid)

Update role, allow to change name and permissions

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.RoleControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RoleControllerApi apiInstance = new RoleControllerApi();
RoleCreateDTO body = new RoleCreateDTO(); // RoleCreateDTO | 
UUID uuid = new UUID(); // UUID | 
try {
    RoleGetDTO result = apiInstance.updateRole(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#updateRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleCreateDTO**](RoleCreateDTO.md)|  |
 **uuid** | [**UUID**](.md)|  |

### Return type

[**RoleGetDTO**](RoleGetDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

