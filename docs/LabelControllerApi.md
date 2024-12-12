# LabelControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignments**](LabelControllerApi.md#assignments) | **POST** /api/v1/label/assignments | Assign label to envelopes
[**createLabel**](LabelControllerApi.md#createLabel) | **POST** /api/v1/label | Save label to DB
[**deAssignments**](LabelControllerApi.md#deAssignments) | **DELETE** /api/v1/label/assignments | Unassign label from envelopes
[**deleteLabel**](LabelControllerApi.md#deleteLabel) | **DELETE** /api/v1/label/{uuid} | Delete label
[**getAll**](LabelControllerApi.md#getAll) | **GET** /api/v1/label | Retrieve all labels for mailbox for authorized user
[**updateLabel**](LabelControllerApi.md#updateLabel) | **PUT** /api/v1/label/{uuid} | Update label

<a name="assignments"></a>
# **assignments**
> assignments(body, mailbox)

Assign label to envelopes

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.LabelControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LabelControllerApi apiInstance = new LabelControllerApi();
LabelAssociationDTO body = new LabelAssociationDTO(); // LabelAssociationDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.assignments(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelControllerApi#assignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LabelAssociationDTO**](LabelAssociationDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createLabel"></a>
# **createLabel**
> LabelDTO createLabel(body, mailbox)

Save label to DB

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.LabelControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LabelControllerApi apiInstance = new LabelControllerApi();
LabelDTO body = new LabelDTO(); // LabelDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    LabelDTO result = apiInstance.createLabel(body, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelControllerApi#createLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LabelDTO**](LabelDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**LabelDTO**](LabelDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deAssignments"></a>
# **deAssignments**
> deAssignments(body, mailbox)

Unassign label from envelopes

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.LabelControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LabelControllerApi apiInstance = new LabelControllerApi();
LabelAssociationDTO body = new LabelAssociationDTO(); // LabelAssociationDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.deAssignments(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelControllerApi#deAssignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LabelAssociationDTO**](LabelAssociationDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteLabel"></a>
# **deleteLabel**
> deleteLabel(uuid, mailbox)

Delete label

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.LabelControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LabelControllerApi apiInstance = new LabelControllerApi();
UUID uuid = new UUID(); // UUID | UUID of label to delete
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.deleteLabel(uuid, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelControllerApi#deleteLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| UUID of label to delete |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAll"></a>
# **getAll**
> List&lt;LabelDTO&gt; getAll(mailbox)

Retrieve all labels for mailbox for authorized user

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.LabelControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LabelControllerApi apiInstance = new LabelControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<LabelDTO> result = apiInstance.getAll(mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelControllerApi#getAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;LabelDTO&gt;**](LabelDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLabel"></a>
# **updateLabel**
> LabelDTO updateLabel(body, mailbox, uuid)

Update label

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.LabelControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LabelControllerApi apiInstance = new LabelControllerApi();
LabelDTO body = new LabelDTO(); // LabelDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID uuid = new UUID(); // UUID | UUID of label to update
try {
    LabelDTO result = apiInstance.updateLabel(body, mailbox, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelControllerApi#updateLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LabelDTO**](LabelDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **uuid** | [**UUID**](.md)| UUID of label to update |

### Return type

[**LabelDTO**](LabelDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

