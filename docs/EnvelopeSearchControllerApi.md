# EnvelopeSearchControllerApi

All URIs are relative to *https://api.centredo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewColumn**](EnvelopeSearchControllerApi.md#addNewColumn) | **POST** /api/v1/envelope/column | Add a new column to display
[**createReport**](EnvelopeSearchControllerApi.md#createReport) | **POST** /api/v1/envelope/report | Request envelopes report
[**deleteColumn**](EnvelopeSearchControllerApi.md#deleteColumn) | **DELETE** /api/v1/envelope/column | Delete columns from displaying
[**getSearchFields**](EnvelopeSearchControllerApi.md#getSearchFields) | **POST** /api/v1/envelope/fields | Get search fields
[**getTemplateRoles**](EnvelopeSearchControllerApi.md#getTemplateRoles) | **POST** /api/v1/envelope/search/roles | Retrieve all template roles
[**searchEnvelopes**](EnvelopeSearchControllerApi.md#searchEnvelopes) | **POST** /api/v1/envelope/search | Search envelopes
[**searchEnvelopesForApproval**](EnvelopeSearchControllerApi.md#searchEnvelopesForApproval) | **POST** /api/v1/envelope/search-approvals | Search envelopes for approval
[**updateColumn**](EnvelopeSearchControllerApi.md#updateColumn) | **PUT** /api/v1/envelope/column/{uuid} | Update column to display

<a name="addNewColumn"></a>
# **addNewColumn**
> SingleUuidDTO addNewColumn(body, mailbox)

Add a new column to display

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeSearchControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi();
NewEnvColumnDTO body = new NewEnvColumnDTO(); // NewEnvColumnDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    SingleUuidDTO result = apiInstance.addNewColumn(body, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeSearchControllerApi#addNewColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewEnvColumnDTO**](NewEnvColumnDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createReport"></a>
# **createReport**
> createReport(body, mailbox)

Request envelopes report

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeSearchControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi();
ReportEnvelopeRequestDTO body = new ReportEnvelopeRequestDTO(); // ReportEnvelopeRequestDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.createReport(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeSearchControllerApi#createReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportEnvelopeRequestDTO**](ReportEnvelopeRequestDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteColumn"></a>
# **deleteColumn**
> deleteColumn(body, mailbox)

Delete columns from displaying

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeSearchControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi();
DeleteEnvColumnDTO body = new DeleteEnvColumnDTO(); // DeleteEnvColumnDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.deleteColumn(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeSearchControllerApi#deleteColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteEnvColumnDTO**](DeleteEnvColumnDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getSearchFields"></a>
# **getSearchFields**
> List&lt;EnvelopeSearchField&gt; getSearchFields(body, mailbox, name)

Get search fields

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeSearchControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi();
SearchEnvelopesDTO body = new SearchEnvelopesDTO(); // SearchEnvelopesDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
String name = "name_example"; // String | Field name term
try {
    List<EnvelopeSearchField> result = apiInstance.getSearchFields(body, mailbox, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeSearchControllerApi#getSearchFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchEnvelopesDTO**](SearchEnvelopesDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **name** | **String**| Field name term |

### Return type

[**List&lt;EnvelopeSearchField&gt;**](EnvelopeSearchField.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTemplateRoles"></a>
# **getTemplateRoles**
> TemplateRolesDTO getTemplateRoles(body, mailbox)

Retrieve all template roles

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeSearchControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi();
List<UUID> body = Arrays.asList(new UUID()); // List<UUID> | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    TemplateRolesDTO result = apiInstance.getTemplateRoles(body, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeSearchControllerApi#getTemplateRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;UUID&gt;**](UUID.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**TemplateRolesDTO**](TemplateRolesDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchEnvelopes"></a>
# **searchEnvelopes**
> EnvelopePageDTO searchEnvelopes(body, mailbox, offset, limit, uuidOnly)

Search envelopes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeSearchControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi();
SearchEnvelopesDTO body = new SearchEnvelopesDTO(); // SearchEnvelopesDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
Integer offset = 0; // Integer | Offset, how many envelopes to skip
Integer limit = 25; // Integer | Limit, how many envelopes to retrieve
Boolean uuidOnly = true; // Boolean | Retrieve only UUID of envelope
try {
    EnvelopePageDTO result = apiInstance.searchEnvelopes(body, mailbox, offset, limit, uuidOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeSearchControllerApi#searchEnvelopes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchEnvelopesDTO**](SearchEnvelopesDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **offset** | **Integer**| Offset, how many envelopes to skip | [optional] [default to 0]
 **limit** | **Integer**| Limit, how many envelopes to retrieve | [optional] [default to 25]
 **uuidOnly** | **Boolean**| Retrieve only UUID of envelope | [optional]

### Return type

[**EnvelopePageDTO**](EnvelopePageDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchEnvelopesForApproval"></a>
# **searchEnvelopesForApproval**
> EnvelopeApprovalPageDTO searchEnvelopesForApproval(body, mailbox, offset, limit)

Search envelopes for approval

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeSearchControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi();
SearchApprovalsDTO body = new SearchApprovalsDTO(); // SearchApprovalsDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
Integer offset = 0; // Integer | Offset, how many envelopes to skip
Integer limit = 25; // Integer | Limit, how many envelopes to retrieve
try {
    EnvelopeApprovalPageDTO result = apiInstance.searchEnvelopesForApproval(body, mailbox, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeSearchControllerApi#searchEnvelopesForApproval");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchApprovalsDTO**](SearchApprovalsDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **offset** | **Integer**| Offset, how many envelopes to skip | [optional] [default to 0]
 **limit** | **Integer**| Limit, how many envelopes to retrieve | [optional] [default to 25]

### Return type

[**EnvelopeApprovalPageDTO**](EnvelopeApprovalPageDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateColumn"></a>
# **updateColumn**
> updateColumn(body, mailbox, uuid)

Update column to display

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeSearchControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi();
UpdateEnvColumnDTO body = new UpdateEnvColumnDTO(); // UpdateEnvColumnDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID uuid = new UUID(); // UUID | 
try {
    apiInstance.updateColumn(body, mailbox, uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeSearchControllerApi#updateColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateEnvColumnDTO**](UpdateEnvColumnDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **uuid** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

