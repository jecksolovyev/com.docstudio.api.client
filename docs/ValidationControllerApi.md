# ValidationControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEnvelopeInvite**](ValidationControllerApi.md#getEnvelopeInvite) | **GET** /api/v1/validation/envelope-authorized-invite | Get invitation info by already registered user
[**getEnvelopeInviteNotRegistered**](ValidationControllerApi.md#getEnvelopeInviteNotRegistered) | **GET** /api/v1/validation/envelope-invite | Get invitation info by not authenticated user

<a name="getEnvelopeInvite"></a>
# **getEnvelopeInvite**
> GetEnvelopeInviteInfoDTO getEnvelopeInvite(code)

Get invitation info by already registered user

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.ValidationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ValidationControllerApi apiInstance = new ValidationControllerApi();
String code = "code_example"; // String | 
try {
    GetEnvelopeInviteInfoDTO result = apiInstance.getEnvelopeInvite(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ValidationControllerApi#getEnvelopeInvite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**|  |

### Return type

[**GetEnvelopeInviteInfoDTO**](GetEnvelopeInviteInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvelopeInviteNotRegistered"></a>
# **getEnvelopeInviteNotRegistered**
> GetEnvelopeInviteInfoDTO getEnvelopeInviteNotRegistered(code)

Get invitation info by not authenticated user

### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import com.docstudio.client.api.ValidationControllerApi;


ValidationControllerApi apiInstance = new ValidationControllerApi();
String code = "code_example"; // String | 
try {
    GetEnvelopeInviteInfoDTO result = apiInstance.getEnvelopeInviteNotRegistered(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ValidationControllerApi#getEnvelopeInviteNotRegistered");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**|  |

### Return type

[**GetEnvelopeInviteInfoDTO**](GetEnvelopeInviteInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

