# ContactControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContact**](ContactControllerApi.md#createContact) | **POST** /api/v1/contact | Save a contact in DB
[**deleteContact**](ContactControllerApi.md#deleteContact) | **DELETE** /api/v1/contact/{uuid} | Delete contact by Id
[**searchOrList**](ContactControllerApi.md#searchOrList) | **GET** /api/v1/contact/list | Retrieve all contacts by id of specified &#x27;access&#x27; type and name
[**updateContact**](ContactControllerApi.md#updateContact) | **PUT** /api/v1/contact/{uuid} | Update the contact in DB

<a name="createContact"></a>
# **createContact**
> ContactResponseDTO createContact(body, mailbox)

Save a contact in DB

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.ContactControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactControllerApi apiInstance = new ContactControllerApi();
ContactDTO body = new ContactDTO(); // ContactDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    ContactResponseDTO result = apiInstance.createContact(body, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactControllerApi#createContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactDTO**](ContactDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**ContactResponseDTO**](ContactResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContact"></a>
# **deleteContact**
> deleteContact(uuid, mailbox)

Delete contact by Id

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.ContactControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactControllerApi apiInstance = new ContactControllerApi();
UUID uuid = new UUID(); // UUID | Contact UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.deleteContact(uuid, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactControllerApi#deleteContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| Contact UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="searchOrList"></a>
# **searchOrList**
> PageDTOContactResponseDTO searchOrList(mailbox, keyword, offset, limit)

Retrieve all contacts by id of specified &#x27;access&#x27; type and name

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.ContactControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactControllerApi apiInstance = new ContactControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
String keyword = "keyword_example"; // String | Request parameter, term to search template by
Integer offset = 0; // Integer | Offset, how much TemplateInfo to skip
Integer limit = 25; // Integer | Limit, how much TemplateInfo to retrieve
try {
    PageDTOContactResponseDTO result = apiInstance.searchOrList(mailbox, keyword, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactControllerApi#searchOrList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **keyword** | **String**| Request parameter, term to search template by | [optional]
 **offset** | **Integer**| Offset, how much TemplateInfo to skip | [optional] [default to 0]
 **limit** | **Integer**| Limit, how much TemplateInfo to retrieve | [optional] [default to 25]

### Return type

[**PageDTOContactResponseDTO**](PageDTOContactResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateContact"></a>
# **updateContact**
> ContactResponseDTO updateContact(body, mailbox, uuid)

Update the contact in DB

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.ContactControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactControllerApi apiInstance = new ContactControllerApi();
ContactDTO body = new ContactDTO(); // ContactDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID uuid = new UUID(); // UUID | Contact UUID
try {
    ContactResponseDTO result = apiInstance.updateContact(body, mailbox, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactControllerApi#updateContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactDTO**](ContactDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **uuid** | [**UUID**](.md)| Contact UUID |

### Return type

[**ContactResponseDTO**](ContactResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

