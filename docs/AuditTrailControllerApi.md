# AuditTrailControllerApi

All URIs are relative to *https://api.centredo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateAuditTrailPdf**](AuditTrailControllerApi.md#generateAuditTrailPdf) | **GET** /api/v1/audittrail/pdf/{uuid} | Download audit trail pdf for envelope
[**getAuditTrailByEnvelope**](AuditTrailControllerApi.md#getAuditTrailByEnvelope) | **GET** /api/v1/audittrail/envelope/{uuid} | 

<a name="generateAuditTrailPdf"></a>
# **generateAuditTrailPdf**
> File generateAuditTrailPdf(uuid, mailbox)

Download audit trail pdf for envelope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditTrailControllerApi;

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
 - **Accept**: application/octet-stream

<a name="getAuditTrailByEnvelope"></a>
# **getAuditTrailByEnvelope**
> List&lt;AuditTrailDTO&gt; getAuditTrailByEnvelope(uuid, mailbox)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditTrailControllerApi;

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

