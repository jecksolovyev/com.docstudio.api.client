# CategoryControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCategory**](CategoryControllerApi.md#createCategory) | **POST** /api/v1/category | Save a category in DB
[**deleteCategory**](CategoryControllerApi.md#deleteCategory) | **DELETE** /api/v1/category/{id} | Delete category by Id
[**getAllByType**](CategoryControllerApi.md#getAllByType) | **GET** /api/v1/category/{access} | Retrieve all categories by id of specified &#x27;access&#x27; type
[**updateCategory**](CategoryControllerApi.md#updateCategory) | **PUT** /api/v1/category/{id} | Update the category in DB

<a name="createCategory"></a>
# **createCategory**
> CategoryDTO createCategory(body, mailbox)

Save a category in DB

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.CategoryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CategoryControllerApi apiInstance = new CategoryControllerApi();
CategoryDTO body = new CategoryDTO(); // CategoryDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    CategoryDTO result = apiInstance.createCategory(body, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryControllerApi#createCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryDTO**](CategoryDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**CategoryDTO**](CategoryDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCategory"></a>
# **deleteCategory**
> deleteCategory(id, mailbox, moveTo)

Delete category by Id

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.CategoryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CategoryControllerApi apiInstance = new CategoryControllerApi();
Long id = 789L; // Long | Category Id
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
Long moveTo = 789L; // Long | Optional id of category to move all subordinated (if any)
try {
    apiInstance.deleteCategory(id, mailbox, moveTo);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryControllerApi#deleteCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Category Id |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **moveTo** | **Long**| Optional id of category to move all subordinated (if any) | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllByType"></a>
# **getAllByType**
> List&lt;CategoryDTO&gt; getAllByType(access, mailbox)

Retrieve all categories by id of specified &#x27;access&#x27; type

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.CategoryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CategoryControllerApi apiInstance = new CategoryControllerApi();
String access = "access_example"; // String | Type of level to retrieve categories by
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<CategoryDTO> result = apiInstance.getAllByType(access, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryControllerApi#getAllByType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access** | **String**| Type of level to retrieve categories by | [enum: mailbox, account, pub, official, shared]
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;CategoryDTO&gt;**](CategoryDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCategory"></a>
# **updateCategory**
> CategoryDTO updateCategory(body, mailbox, id)

Update the category in DB

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.CategoryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CategoryControllerApi apiInstance = new CategoryControllerApi();
CategoryDTO body = new CategoryDTO(); // CategoryDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
Long id = 789L; // Long | Category Id
try {
    CategoryDTO result = apiInstance.updateCategory(body, mailbox, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryControllerApi#updateCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryDTO**](CategoryDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **id** | **Long**| Category Id |

### Return type

[**CategoryDTO**](CategoryDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

