# AccountBillingControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkEventAbility**](AccountBillingControllerApi.md#checkEventAbility) | **GET** /api/v1/account/{accountUuid}/check/{type}/{action} | 
[**downloadInvoice**](AccountBillingControllerApi.md#downloadInvoice) | **GET** /api/v1/account/{accountUuid}/invoice/{invoiceId}/pdf | 
[**getAccount**](AccountBillingControllerApi.md#getAccount) | **GET** /api/v1/account/{accountUuid}/billing | 
[**getInvoiceStatus**](AccountBillingControllerApi.md#getInvoiceStatus) | **GET** /api/v1/account/{accountUuid}/invoice-status/{invoiceId} | 
[**getInvoices**](AccountBillingControllerApi.md#getInvoices) | **GET** /api/v1/account/{accountUuid}/invoice | 
[**getTariffs**](AccountBillingControllerApi.md#getTariffs) | **GET** /api/v1/account/{accountUuid}/tariff | 
[**makeInvoicePayment**](AccountBillingControllerApi.md#makeInvoicePayment) | **POST** /api/v1/account/{accountUuid}/billing-payment | 
[**replaceAccountTariff**](AccountBillingControllerApi.md#replaceAccountTariff) | **POST** /api/v1/account/{accountUuid}/tariff | 

<a name="checkEventAbility"></a>
# **checkEventAbility**
> checkEventAbility(accountUuid, type, action)



### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountBillingControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountBillingControllerApi apiInstance = new AccountBillingControllerApi();
UUID accountUuid = new UUID(); // UUID | 
BillingEventType type = new BillingEventType(); // BillingEventType | 
String action = "action_example"; // String | 
try {
    apiInstance.checkEventAbility(accountUuid, type, action);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountBillingControllerApi#checkEventAbility");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)|  |
 **type** | [**BillingEventType**](.md)|  |
 **action** | **String**|  | [enum: create, access]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadInvoice"></a>
# **downloadInvoice**
> File downloadInvoice(accountUuid, invoiceId, details)



Download invoice

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountBillingControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountBillingControllerApi apiInstance = new AccountBillingControllerApi();
UUID accountUuid = new UUID(); // UUID | Account uuid
String invoiceId = "invoiceId_example"; // String | Invoice id
String details = "details_example"; // String | Include details
try {
    File result = apiInstance.downloadInvoice(accountUuid, invoiceId, details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountBillingControllerApi#downloadInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account uuid |
 **invoiceId** | **String**| Invoice id |
 **details** | **String**| Include details | [optional] [enum: withoutDetails, withZeroDetails, withDetails]

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getAccount"></a>
# **getAccount**
> AccountBillingInfoDTO getAccount(accountUuid)



### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountBillingControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountBillingControllerApi apiInstance = new AccountBillingControllerApi();
UUID accountUuid = new UUID(); // UUID | 
try {
    AccountBillingInfoDTO result = apiInstance.getAccount(accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountBillingControllerApi#getAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)|  |

### Return type

[**AccountBillingInfoDTO**](AccountBillingInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoiceStatus"></a>
# **getInvoiceStatus**
> BillingInvoiceStatusDTO getInvoiceStatus(accountUuid, invoiceId)



### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountBillingControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountBillingControllerApi apiInstance = new AccountBillingControllerApi();
UUID accountUuid = new UUID(); // UUID | 
UUID invoiceId = new UUID(); // UUID | 
try {
    BillingInvoiceStatusDTO result = apiInstance.getInvoiceStatus(accountUuid, invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountBillingControllerApi#getInvoiceStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)|  |
 **invoiceId** | [**UUID**](.md)|  |

### Return type

[**BillingInvoiceStatusDTO**](BillingInvoiceStatusDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoices"></a>
# **getInvoices**
> PageDTOObject getInvoices(accountUuid, offset, limit)



Get invoice list

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountBillingControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountBillingControllerApi apiInstance = new AccountBillingControllerApi();
UUID accountUuid = new UUID(); // UUID | Account uuid
Integer offset = 0; // Integer | Offset, how many records to skip
Integer limit = 25; // Integer | Limit, how many records to retrieve
try {
    PageDTOObject result = apiInstance.getInvoices(accountUuid, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountBillingControllerApi#getInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account uuid |
 **offset** | **Integer**| Offset, how many records to skip | [optional] [default to 0]
 **limit** | **Integer**| Limit, how many records to retrieve | [optional] [default to 25]

### Return type

[**PageDTOObject**](PageDTOObject.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTariffs"></a>
# **getTariffs**
> List&lt;DetailedTariffInfoDTO&gt; getTariffs(accountUuid)



### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountBillingControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountBillingControllerApi apiInstance = new AccountBillingControllerApi();
UUID accountUuid = new UUID(); // UUID | 
try {
    List<DetailedTariffInfoDTO> result = apiInstance.getTariffs(accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountBillingControllerApi#getTariffs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)|  |

### Return type

[**List&lt;DetailedTariffInfoDTO&gt;**](DetailedTariffInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="makeInvoicePayment"></a>
# **makeInvoicePayment**
> BillingRedirectDTO makeInvoicePayment(body, accountUuid)



### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountBillingControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountBillingControllerApi apiInstance = new AccountBillingControllerApi();
BillingPaymentDTO body = new BillingPaymentDTO(); // BillingPaymentDTO | 
UUID accountUuid = new UUID(); // UUID | 
try {
    BillingRedirectDTO result = apiInstance.makeInvoicePayment(body, accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountBillingControllerApi#makeInvoicePayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BillingPaymentDTO**](BillingPaymentDTO.md)|  |
 **accountUuid** | [**UUID**](.md)|  |

### Return type

[**BillingRedirectDTO**](BillingRedirectDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceAccountTariff"></a>
# **replaceAccountTariff**
> replaceAccountTariff(body, accountUuid)



### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountBillingControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountBillingControllerApi apiInstance = new AccountBillingControllerApi();
ReplaceAccountTariffDTO body = new ReplaceAccountTariffDTO(); // ReplaceAccountTariffDTO | 
UUID accountUuid = new UUID(); // UUID | 
try {
    apiInstance.replaceAccountTariff(body, accountUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountBillingControllerApi#replaceAccountTariff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReplaceAccountTariffDTO**](ReplaceAccountTariffDTO.md)|  |
 **accountUuid** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

