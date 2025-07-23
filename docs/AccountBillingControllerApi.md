# AccountBillingControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkEventAbility**](AccountBillingControllerApi.md#checkEventAbility) | **GET** /api/v1/account/{accountUuid}/check/{type}/{action} |  |
| [**downloadInvoice**](AccountBillingControllerApi.md#downloadInvoice) | **GET** /api/v1/account/{accountUuid}/invoice/{invoiceId}/pdf |  |
| [**getAccount**](AccountBillingControllerApi.md#getAccount) | **GET** /api/v1/account/{accountUuid}/billing |  |
| [**getAccountBillingStateHeader**](AccountBillingControllerApi.md#getAccountBillingStateHeader) | **GET** /api/v1/account/{accountUuid}/billing-state |  |
| [**getCurrencyRates**](AccountBillingControllerApi.md#getCurrencyRates) | **GET** /api/v1/account/currency-rates |  |
| [**getInvoiceStatus**](AccountBillingControllerApi.md#getInvoiceStatus) | **GET** /api/v1/account/{accountUuid}/invoice-status/{invoiceId} |  |
| [**getInvoices**](AccountBillingControllerApi.md#getInvoices) | **GET** /api/v1/account/{accountUuid}/invoice |  |
| [**getPaymentMethodInfo**](AccountBillingControllerApi.md#getPaymentMethodInfo) | **GET** /api/v1/account/{accountUuid}/payment-method |  |
| [**getPaymentMethodInitKey**](AccountBillingControllerApi.md#getPaymentMethodInitKey) | **GET** /api/v1/account/{accountUuid}/payment-method-init |  |
| [**getTariffs**](AccountBillingControllerApi.md#getTariffs) | **GET** /api/v1/account/{accountUuid}/tariff |  |
| [**makeInvoicePayment**](AccountBillingControllerApi.md#makeInvoicePayment) | **POST** /api/v1/account/{accountUuid}/billing-payment |  |
| [**replaceAccountTariff**](AccountBillingControllerApi.md#replaceAccountTariff) | **POST** /api/v1/account/{accountUuid}/tariff |  |


<a id="checkEventAbility"></a>
# **checkEventAbility**
> checkEventAbility(accountUuid, type, action)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountBillingControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountBillingControllerApi apiInstance = new AccountBillingControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | 
    BillingEventType type = BillingEventType.fromValue("new-corp-user"); // BillingEventType | 
    String action = "create"; // String | 
    try {
      apiInstance.checkEventAbility(accountUuid, type, action);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountBillingControllerApi#checkEventAbility");
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
| **accountUuid** | **UUID**|  | |
| **type** | [**BillingEventType**](.md)|  | [enum: new-corp-user, new-account-invite, income-envelope, sent-envelope, archive-envelope, unarchive-envelope, delete-envelope, restore-envelope, account-mailbox, dig-sign-envelope, account-domain, integration-rule, envelope-scenario, cloud-signature, envelope-approval, password-policy, callback-sent, create-template, delete-template, allow-template, verify-signature, envelope-ai-assist] |
| **action** | **String**|  | [enum: create, access] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="downloadInvoice"></a>
# **downloadInvoice**
> File downloadInvoice(accountUuid, invoiceId, details)



Download invoice

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountBillingControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountBillingControllerApi apiInstance = new AccountBillingControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account uuid
    String invoiceId = "invoiceId_example"; // String | Invoice id
    String details = "withoutDetails"; // String | Include details
    try {
      File result = apiInstance.downloadInvoice(accountUuid, invoiceId, details);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountBillingControllerApi#downloadInvoice");
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
| **accountUuid** | **UUID**| Account uuid | |
| **invoiceId** | **String**| Invoice id | |
| **details** | **String**| Include details | [optional] [enum: withoutDetails, withZeroDetails, withDetails] |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAccount"></a>
# **getAccount**
> AccountBillingInfoDTO getAccount(accountUuid)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountBillingControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountBillingControllerApi apiInstance = new AccountBillingControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | 
    try {
      AccountBillingInfoDTO result = apiInstance.getAccount(accountUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountBillingControllerApi#getAccount");
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
| **accountUuid** | **UUID**|  | |

### Return type

[**AccountBillingInfoDTO**](AccountBillingInfoDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAccountBillingStateHeader"></a>
# **getAccountBillingStateHeader**
> BillingHeaderState getAccountBillingStateHeader(accountUuid)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountBillingControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountBillingControllerApi apiInstance = new AccountBillingControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | 
    try {
      BillingHeaderState result = apiInstance.getAccountBillingStateHeader(accountUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountBillingControllerApi#getAccountBillingStateHeader");
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
| **accountUuid** | **UUID**|  | |

### Return type

[**BillingHeaderState**](BillingHeaderState.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCurrencyRates"></a>
# **getCurrencyRates**
> List&lt;CurrencyRateDTO&gt; getCurrencyRates()



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountBillingControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountBillingControllerApi apiInstance = new AccountBillingControllerApi(defaultClient);
    try {
      List<CurrencyRateDTO> result = apiInstance.getCurrencyRates();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountBillingControllerApi#getCurrencyRates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CurrencyRateDTO&gt;**](CurrencyRateDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInvoiceStatus"></a>
# **getInvoiceStatus**
> BillingInvoiceStatusDTO getInvoiceStatus(accountUuid, invoiceId)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountBillingControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountBillingControllerApi apiInstance = new AccountBillingControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | 
    UUID invoiceId = UUID.randomUUID(); // UUID | 
    try {
      BillingInvoiceStatusDTO result = apiInstance.getInvoiceStatus(accountUuid, invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountBillingControllerApi#getInvoiceStatus");
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
| **accountUuid** | **UUID**|  | |
| **invoiceId** | **UUID**|  | |

### Return type

[**BillingInvoiceStatusDTO**](BillingInvoiceStatusDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInvoices"></a>
# **getInvoices**
> PageDTOObject getInvoices(accountUuid, offset, limit)



Get invoice list

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountBillingControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountBillingControllerApi apiInstance = new AccountBillingControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account uuid
    Integer offset = 0; // Integer | Offset, how many records to skip
    Integer limit = 25; // Integer | Limit, how many records to retrieve
    try {
      PageDTOObject result = apiInstance.getInvoices(accountUuid, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountBillingControllerApi#getInvoices");
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
| **accountUuid** | **UUID**| Account uuid | |
| **offset** | **Integer**| Offset, how many records to skip | [optional] [default to 0] |
| **limit** | **Integer**| Limit, how many records to retrieve | [optional] [default to 25] |

### Return type

[**PageDTOObject**](PageDTOObject.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPaymentMethodInfo"></a>
# **getPaymentMethodInfo**
> PaymentMethodInfo getPaymentMethodInfo(accountUuid)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountBillingControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountBillingControllerApi apiInstance = new AccountBillingControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | 
    try {
      PaymentMethodInfo result = apiInstance.getPaymentMethodInfo(accountUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountBillingControllerApi#getPaymentMethodInfo");
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
| **accountUuid** | **UUID**|  | |

### Return type

[**PaymentMethodInfo**](PaymentMethodInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPaymentMethodInitKey"></a>
# **getPaymentMethodInitKey**
> String getPaymentMethodInitKey(accountUuid)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountBillingControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountBillingControllerApi apiInstance = new AccountBillingControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | 
    try {
      String result = apiInstance.getPaymentMethodInitKey(accountUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountBillingControllerApi#getPaymentMethodInitKey");
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
| **accountUuid** | **UUID**|  | |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTariffs"></a>
# **getTariffs**
> List&lt;DetailedTariffInfoDTO&gt; getTariffs(accountUuid)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountBillingControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountBillingControllerApi apiInstance = new AccountBillingControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | 
    try {
      List<DetailedTariffInfoDTO> result = apiInstance.getTariffs(accountUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountBillingControllerApi#getTariffs");
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
| **accountUuid** | **UUID**|  | |

### Return type

[**List&lt;DetailedTariffInfoDTO&gt;**](DetailedTariffInfoDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="makeInvoicePayment"></a>
# **makeInvoicePayment**
> BillingRedirectDTO makeInvoicePayment(accountUuid, billingPaymentDTO)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountBillingControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountBillingControllerApi apiInstance = new AccountBillingControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | 
    BillingPaymentDTO billingPaymentDTO = new BillingPaymentDTO(); // BillingPaymentDTO | 
    try {
      BillingRedirectDTO result = apiInstance.makeInvoicePayment(accountUuid, billingPaymentDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountBillingControllerApi#makeInvoicePayment");
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
| **accountUuid** | **UUID**|  | |
| **billingPaymentDTO** | [**BillingPaymentDTO**](BillingPaymentDTO.md)|  | |

### Return type

[**BillingRedirectDTO**](BillingRedirectDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="replaceAccountTariff"></a>
# **replaceAccountTariff**
> ChangeAccountTariffResponse replaceAccountTariff(accountUuid, replaceAccountTariffDTO)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountBillingControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountBillingControllerApi apiInstance = new AccountBillingControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | 
    ReplaceAccountTariffDTO replaceAccountTariffDTO = new ReplaceAccountTariffDTO(); // ReplaceAccountTariffDTO | 
    try {
      ChangeAccountTariffResponse result = apiInstance.replaceAccountTariff(accountUuid, replaceAccountTariffDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountBillingControllerApi#replaceAccountTariff");
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
| **accountUuid** | **UUID**|  | |
| **replaceAccountTariffDTO** | [**ReplaceAccountTariffDTO**](ReplaceAccountTariffDTO.md)|  | |

### Return type

[**ChangeAccountTariffResponse**](ChangeAccountTariffResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

