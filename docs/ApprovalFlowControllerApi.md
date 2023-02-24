# ApprovalFlowControllerApi

All URIs are relative to *https://api.centredo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApprovalFlow**](ApprovalFlowControllerApi.md#createApprovalFlow) | **POST** /api/v1/approvalFlow | Create approval flow
[**deleteApprovalFlow**](ApprovalFlowControllerApi.md#deleteApprovalFlow) | **DELETE** /api/v1/approvalFlow | Delete approval flows
[**retrieve**](ApprovalFlowControllerApi.md#retrieve) | **GET** /api/v1/approvalFlow/{flowUuid} | Retrieve approval flow
[**search**](ApprovalFlowControllerApi.md#search) | **GET** /api/v1/approvalFlow | Retrieve approval flows
[**updateApprovalFlow**](ApprovalFlowControllerApi.md#updateApprovalFlow) | **PUT** /api/v1/approvalFlow/{flowUuid} | Update approval flow

<a name="createApprovalFlow"></a>
# **createApprovalFlow**
> SingleUuidDTO createApprovalFlow(body, mailbox)

Create approval flow

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApprovalFlowControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApprovalFlowControllerApi apiInstance = new ApprovalFlowControllerApi();
MailboxApprovalFlowDTO body = new MailboxApprovalFlowDTO(); // MailboxApprovalFlowDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    SingleUuidDTO result = apiInstance.createApprovalFlow(body, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalFlowControllerApi#createApprovalFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MailboxApprovalFlowDTO**](MailboxApprovalFlowDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteApprovalFlow"></a>
# **deleteApprovalFlow**
> deleteApprovalFlow(body, mailbox)

Delete approval flows

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApprovalFlowControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApprovalFlowControllerApi apiInstance = new ApprovalFlowControllerApi();
List<UUID> body = Arrays.asList(new UUID()); // List<UUID> | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.deleteApprovalFlow(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalFlowControllerApi#deleteApprovalFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;UUID&gt;**](UUID.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="retrieve"></a>
# **retrieve**
> MailboxApprovalFlowGetDTO retrieve(flowUuid, mailbox)

Retrieve approval flow

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApprovalFlowControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApprovalFlowControllerApi apiInstance = new ApprovalFlowControllerApi();
UUID flowUuid = new UUID(); // UUID | UUID of the approval flow
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    MailboxApprovalFlowGetDTO result = apiInstance.retrieve(flowUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalFlowControllerApi#retrieve");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowUuid** | [**UUID**](.md)| UUID of the approval flow |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**MailboxApprovalFlowGetDTO**](MailboxApprovalFlowGetDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="search"></a>
# **search**
> PageDTOMailboxApprovalFlowGetDTO search(mailbox, keyword, offset, limit)

Retrieve approval flows

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApprovalFlowControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApprovalFlowControllerApi apiInstance = new ApprovalFlowControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
String keyword = "keyword_example"; // String | Keyword to search approval flow by name
Integer offset = 0; // Integer | Offset records
Integer limit = 25; // Integer | Limit records, max is 1000
try {
    PageDTOMailboxApprovalFlowGetDTO result = apiInstance.search(mailbox, keyword, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalFlowControllerApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **keyword** | **String**| Keyword to search approval flow by name | [optional]
 **offset** | **Integer**| Offset records | [optional] [default to 0]
 **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25]

### Return type

[**PageDTOMailboxApprovalFlowGetDTO**](PageDTOMailboxApprovalFlowGetDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateApprovalFlow"></a>
# **updateApprovalFlow**
> updateApprovalFlow(body, mailbox, flowUuid)

Update approval flow

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApprovalFlowControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApprovalFlowControllerApi apiInstance = new ApprovalFlowControllerApi();
MailboxApprovalFlowDTO body = new MailboxApprovalFlowDTO(); // MailboxApprovalFlowDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID flowUuid = new UUID(); // UUID | UUID of the approval flow
try {
    apiInstance.updateApprovalFlow(body, mailbox, flowUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalFlowControllerApi#updateApprovalFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MailboxApprovalFlowDTO**](MailboxApprovalFlowDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **flowUuid** | [**UUID**](.md)| UUID of the approval flow |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

