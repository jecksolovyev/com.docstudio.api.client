# ContactControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createContact**](ContactControllerApi.md#createContact) | **POST** /api/v1/contact | Save a contact in DB |
| [**deleteContact**](ContactControllerApi.md#deleteContact) | **DELETE** /api/v1/contact/{uuid} | Delete contact by Id |
| [**searchOrList**](ContactControllerApi.md#searchOrList) | **GET** /api/v1/contact/list | Retrieve all contacts by id of specified &#39;access&#39; type and name |
| [**updateContact**](ContactControllerApi.md#updateContact) | **PUT** /api/v1/contact/{uuid} | Update the contact in DB |


<a id="createContact"></a>
# **createContact**
> ContactResponseDTO createContact(mailbox, contactDTO)

Save a contact in DB

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ContactControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    ContactControllerApi apiInstance = new ContactControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    ContactDTO contactDTO = new ContactDTO(); // ContactDTO | 
    try {
      ContactResponseDTO result = apiInstance.createContact(mailbox, contactDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactControllerApi#createContact");
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
| **contactDTO** | [**ContactDTO**](ContactDTO.md)|  | |

### Return type

[**ContactResponseDTO**](ContactResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteContact"></a>
# **deleteContact**
> deleteContact(uuid, mailbox)

Delete contact by Id

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ContactControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    ContactControllerApi apiInstance = new ContactControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | Contact UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.deleteContact(uuid, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactControllerApi#deleteContact");
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
| **uuid** | **UUID**| Contact UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

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

<a id="searchOrList"></a>
# **searchOrList**
> PageDTOContactResponseDTO searchOrList(mailbox, keyword, offset, limit)

Retrieve all contacts by id of specified &#39;access&#39; type and name

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ContactControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    ContactControllerApi apiInstance = new ContactControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    String keyword = "keyword_example"; // String | Request parameter, term to search template by
    Integer offset = 0; // Integer | Offset, how much TemplateInfo to skip
    Integer limit = 25; // Integer | Limit, how much TemplateInfo to retrieve
    try {
      PageDTOContactResponseDTO result = apiInstance.searchOrList(mailbox, keyword, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactControllerApi#searchOrList");
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
| **keyword** | **String**| Request parameter, term to search template by | [optional] |
| **offset** | **Integer**| Offset, how much TemplateInfo to skip | [optional] [default to 0] |
| **limit** | **Integer**| Limit, how much TemplateInfo to retrieve | [optional] [default to 25] |

### Return type

[**PageDTOContactResponseDTO**](PageDTOContactResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateContact"></a>
# **updateContact**
> ContactResponseDTO updateContact(uuid, mailbox, contactDTO)

Update the contact in DB

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.ContactControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    ContactControllerApi apiInstance = new ContactControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | Contact UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    ContactDTO contactDTO = new ContactDTO(); // ContactDTO | 
    try {
      ContactResponseDTO result = apiInstance.updateContact(uuid, mailbox, contactDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactControllerApi#updateContact");
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
| **uuid** | **UUID**| Contact UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **contactDTO** | [**ContactDTO**](ContactDTO.md)|  | |

### Return type

[**ContactResponseDTO**](ContactResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

