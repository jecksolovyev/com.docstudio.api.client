# IntegrationTestControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearContext**](IntegrationTestControllerApi.md#clearContext) | **POST** /integ/clearContext | 

<a name="clearContext"></a>
# **clearContext**
> clearContext()



### Example
```java
// Import classes:
//import com.docstudio.client.ApiException;
//import api.com.docstudio.client.IntegrationTestControllerApi;


IntegrationTestControllerApi apiInstance = new IntegrationTestControllerApi();
try {
    apiInstance.clearContext();
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationTestControllerApi#clearContext");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

