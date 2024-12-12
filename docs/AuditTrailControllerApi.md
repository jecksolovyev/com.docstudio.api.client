# AuditTrailControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAuditTrailRecord**](AuditTrailControllerApi.md#addAuditTrailRecord) | **PUT** /api/v1/audittrail/envelope/{uuid} | 
[**generateAuditTrailPdf**](AuditTrailControllerApi.md#generateAuditTrailPdf) | **GET** /api/v1/audittrail/pdf/{uuid} | Download audit trail pdf for envelope
[**getAuditTrailByEnvelope**](AuditTrailControllerApi.md#getAuditTrailByEnvelope) | **GET** /api/v1/audittrail/envelope/{uuid} | 

<a name="addAuditTrailRecord"></a>
# **addAuditTrailRecord**
> addAuditTrailRecord(body, mailbox, uuid)



### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.AuditTrailControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuditTrailControllerApi apiInstance = new AuditTrailControllerApi();
AuditTrailInfoRecordDTO body = new AuditTrailInfoRecordDTO(); // AuditTrailInfoRecordDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID uuid = new UUID(); // UUID | Envelope UUID
try {
    apiInstance.addAuditTrailRecord(body, mailbox, uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditTrailControllerApi#addAuditTrailRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuditTrailInfoRecordDTO**](AuditTrailInfoRecordDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **uuid** | [**UUID**](.md)| Envelope UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="generateAuditTrailPdf"></a>
# **generateAuditTrailPdf**
> File generateAuditTrailPdf(uuid, mailbox)

Download audit trail pdf for envelope

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.AuditTrailControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuditTrailControllerApi apiInstance = new AuditTrailControllerApi();
UUID uuid = new UUID(); // UUID | Envelope UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    File result = apiInstance.generateAuditTrailPdf(uuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditTrailControllerApi#generateAuditTrailPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| Envelope UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

<a name="getAuditTrailByEnvelope"></a>
# **getAuditTrailByEnvelope**
> List&lt;AuditTrailDTO&gt; getAuditTrailByEnvelope(uuid, mailbox)



### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.AuditTrailControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuditTrailControllerApi apiInstance = new AuditTrailControllerApi();
UUID uuid = new UUID(); // UUID | Envelope UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<AuditTrailDTO> result = apiInstance.getAuditTrailByEnvelope(uuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditTrailControllerApi#getAuditTrailByEnvelope");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| Envelope UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;AuditTrailDTO&gt;**](AuditTrailDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

