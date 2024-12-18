# CategoryControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create6**](CategoryControllerApi.md#create6) | **POST** /api/v1/category | Save a category in DB |
| [**delete4**](CategoryControllerApi.md#delete4) | **DELETE** /api/v1/category/{id} | Delete category by Id |
| [**getAllByType**](CategoryControllerApi.md#getAllByType) | **GET** /api/v1/category/{access} | Retrieve all categories by id of specified &#39;access&#39; type |
| [**update6**](CategoryControllerApi.md#update6) | **PUT** /api/v1/category/{id} | Update the category in DB |


<a id="create6"></a>
# **create6**
> CategoryDTO create6(mailbox, categoryDTO)

Save a category in DB

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.CategoryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    CategoryControllerApi apiInstance = new CategoryControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    CategoryDTO categoryDTO = new CategoryDTO(); // CategoryDTO | 
    try {
      CategoryDTO result = apiInstance.create6(mailbox, categoryDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoryControllerApi#create6");
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
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **categoryDTO** | [**CategoryDTO**](CategoryDTO.md)|  | |

### Return type

[**CategoryDTO**](CategoryDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="delete4"></a>
# **delete4**
> delete4(id, mailbox, moveTo, keepChildren)

Delete category by Id

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.CategoryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    CategoryControllerApi apiInstance = new CategoryControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Category Id
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UUID moveTo = UUID.randomUUID(); // UUID | Optional id of category to move all subordinated (if any)
    Boolean keepChildren = true; // Boolean | Optional, if true and moveTo is null all children will become root categories
    try {
      apiInstance.delete4(id, mailbox, moveTo, keepChildren);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoryControllerApi#delete4");
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
| **id** | **UUID**| Category Id | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **moveTo** | **UUID**| Optional id of category to move all subordinated (if any) | [optional] |
| **keepChildren** | **Boolean**| Optional, if true and moveTo is null all children will become root categories | [optional] |

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

<a id="getAllByType"></a>
# **getAllByType**
> List&lt;CategoryDTO&gt; getAllByType(access, mailbox)

Retrieve all categories by id of specified &#39;access&#39; type

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.CategoryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    CategoryControllerApi apiInstance = new CategoryControllerApi(defaultClient);
    String access = "mailbox"; // String | Type of level to retrieve categories by
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<CategoryDTO> result = apiInstance.getAllByType(access, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoryControllerApi#getAllByType");
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
| **access** | **String**| Type of level to retrieve categories by | [enum: mailbox, account, pub, official, shared] |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**List&lt;CategoryDTO&gt;**](CategoryDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="update6"></a>
# **update6**
> CategoryDTO update6(id, mailbox, categoryDTO)

Update the category in DB

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.CategoryControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    CategoryControllerApi apiInstance = new CategoryControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Category Id
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    CategoryDTO categoryDTO = new CategoryDTO(); // CategoryDTO | 
    try {
      CategoryDTO result = apiInstance.update6(id, mailbox, categoryDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoryControllerApi#update6");
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
| **id** | **UUID**| Category Id | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **categoryDTO** | [**CategoryDTO**](CategoryDTO.md)|  | |

### Return type

[**CategoryDTO**](CategoryDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

