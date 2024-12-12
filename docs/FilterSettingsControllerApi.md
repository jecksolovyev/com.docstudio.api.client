# FilterSettingsControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFilterSettings**](FilterSettingsControllerApi.md#createFilterSettings) | **POST** /api/v1/filterSettings | Create FilterSettings for mailbox
[**deleteFilterSettings**](FilterSettingsControllerApi.md#deleteFilterSettings) | **DELETE** /api/v1/filterSettings/{uuid} | Delete FilterSettings
[**getAllFilterSettings**](FilterSettingsControllerApi.md#getAllFilterSettings) | **GET** /api/v1/filterSettings | Read all by mailbox
[**getByUuid**](FilterSettingsControllerApi.md#getByUuid) | **GET** /api/v1/filterSettings/{uuid} | Get by UUID
[**updateFilterSettings**](FilterSettingsControllerApi.md#updateFilterSettings) | **PUT** /api/v1/filterSettings/{uuid} | Update FilterSettings for mailbox

<a name="createFilterSettings"></a>
# **createFilterSettings**
> SingleUuidDTO createFilterSettings(body, mailbox)

Create FilterSettings for mailbox

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.FilterSettingsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilterSettingsControllerApi apiInstance = new FilterSettingsControllerApi();
FilterSettingsCreateDTO body = new FilterSettingsCreateDTO(); // FilterSettingsCreateDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    SingleUuidDTO result = apiInstance.createFilterSettings(body, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterSettingsControllerApi#createFilterSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilterSettingsCreateDTO**](FilterSettingsCreateDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFilterSettings"></a>
# **deleteFilterSettings**
> deleteFilterSettings(uuid, mailbox)

Delete FilterSettings

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.FilterSettingsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilterSettingsControllerApi apiInstance = new FilterSettingsControllerApi();
UUID uuid = new UUID(); // UUID | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.deleteFilterSettings(uuid, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterSettingsControllerApi#deleteFilterSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllFilterSettings"></a>
# **getAllFilterSettings**
> List&lt;FilterSettingsDTO&gt; getAllFilterSettings(mailbox)

Read all by mailbox

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.FilterSettingsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilterSettingsControllerApi apiInstance = new FilterSettingsControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<FilterSettingsDTO> result = apiInstance.getAllFilterSettings(mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterSettingsControllerApi#getAllFilterSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;FilterSettingsDTO&gt;**](FilterSettingsDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getByUuid"></a>
# **getByUuid**
> FilterSettingsDTO getByUuid(uuid, mailbox)

Get by UUID

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.FilterSettingsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilterSettingsControllerApi apiInstance = new FilterSettingsControllerApi();
UUID uuid = new UUID(); // UUID | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    FilterSettingsDTO result = apiInstance.getByUuid(uuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterSettingsControllerApi#getByUuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**FilterSettingsDTO**](FilterSettingsDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFilterSettings"></a>
# **updateFilterSettings**
> updateFilterSettings(body, mailbox, uuid)

Update FilterSettings for mailbox

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.FilterSettingsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilterSettingsControllerApi apiInstance = new FilterSettingsControllerApi();
FilterSettingsDTO body = new FilterSettingsDTO(); // FilterSettingsDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID uuid = new UUID(); // UUID | 
try {
    apiInstance.updateFilterSettings(body, mailbox, uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterSettingsControllerApi#updateFilterSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilterSettingsDTO**](FilterSettingsDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **uuid** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

