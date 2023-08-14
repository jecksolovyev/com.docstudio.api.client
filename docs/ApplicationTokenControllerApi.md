# ApplicationTokenControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createToken**](ApplicationTokenControllerApi.md#createToken) | **POST** /api/v1/token | Create application token
[**getUserTokens**](ApplicationTokenControllerApi.md#getUserTokens) | **GET** /api/v1/token | List application tokens
[**revokeToken**](ApplicationTokenControllerApi.md#revokeToken) | **DELETE** /api/v1/token/{id} | Revoke application token

<a name="createToken"></a>
# **createToken**
> AppTokenDTO createToken(body)

Create application token

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.ApplicationTokenControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApplicationTokenControllerApi apiInstance = new ApplicationTokenControllerApi();
CreateAppTokenDTO body = new CreateAppTokenDTO(); // CreateAppTokenDTO | 
try {
    AppTokenDTO result = apiInstance.createToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationTokenControllerApi#createToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAppTokenDTO**](CreateAppTokenDTO.md)|  |

### Return type

[**AppTokenDTO**](AppTokenDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserTokens"></a>
# **getUserTokens**
> List&lt;AppTokenDTO&gt; getUserTokens()

List application tokens

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.ApplicationTokenControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApplicationTokenControllerApi apiInstance = new ApplicationTokenControllerApi();
try {
    List<AppTokenDTO> result = apiInstance.getUserTokens();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationTokenControllerApi#getUserTokens");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AppTokenDTO&gt;**](AppTokenDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="revokeToken"></a>
# **revokeToken**
> revokeToken(id)

Revoke application token

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.ApplicationTokenControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApplicationTokenControllerApi apiInstance = new ApplicationTokenControllerApi();
UUID id = new UUID(); // UUID | Token id
try {
    apiInstance.revokeToken(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationTokenControllerApi#revokeToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Token id |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

