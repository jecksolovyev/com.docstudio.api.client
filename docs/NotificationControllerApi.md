# NotificationControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountPreferences**](NotificationControllerApi.md#getAccountPreferences) | **GET** /api/v1/notification/account-preferences | Get account related notification preferences
[**getMailboxPreferences**](NotificationControllerApi.md#getMailboxPreferences) | **GET** /api/v1/notification/mailbox-preferences | Get mailbox related notification preferences
[**getUnreadNotifications**](NotificationControllerApi.md#getUnreadNotifications) | **GET** /api/v1/notification | Get unread notifications
[**markAllNotificationRead**](NotificationControllerApi.md#markAllNotificationRead) | **POST** /api/v1/notification/read-all | Mark notifications as read
[**markNotificationRead**](NotificationControllerApi.md#markNotificationRead) | **POST** /api/v1/notification/read | Mark notifications as read
[**saveAccountPreferences**](NotificationControllerApi.md#saveAccountPreferences) | **POST** /api/v1/notification/account-preferences | Save account related notification preferences
[**saveMailboxPreferences**](NotificationControllerApi.md#saveMailboxPreferences) | **POST** /api/v1/notification/mailbox-preferences | Save mailbox related notification preferences

<a name="getAccountPreferences"></a>
# **getAccountPreferences**
> Map&lt;String, List&lt;Integer&gt;&gt; getAccountPreferences()

Get account related notification preferences

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.NotificationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationControllerApi apiInstance = new NotificationControllerApi();
try {
    Map<String, List<Integer>> result = apiInstance.getAccountPreferences();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationControllerApi#getAccountPreferences");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, List&lt;Integer&gt;&gt;**](List.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMailboxPreferences"></a>
# **getMailboxPreferences**
> Map&lt;String, List&lt;Integer&gt;&gt; getMailboxPreferences(mailbox)

Get mailbox related notification preferences

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.NotificationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationControllerApi apiInstance = new NotificationControllerApi();
UUID mailbox = new UUID(); // UUID | 
try {
    Map<String, List<Integer>> result = apiInstance.getMailboxPreferences(mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationControllerApi#getMailboxPreferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)|  | [optional]

### Return type

[**Map&lt;String, List&lt;Integer&gt;&gt;**](List.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUnreadNotifications"></a>
# **getUnreadNotifications**
> PageDTOUserNotificationResponseDTO getUnreadNotifications(offset, limit)

Get unread notifications

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.NotificationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationControllerApi apiInstance = new NotificationControllerApi();
Integer offset = 0; // Integer | Offset records
Integer limit = 25; // Integer | Limit records, max is 1000
try {
    PageDTOUserNotificationResponseDTO result = apiInstance.getUnreadNotifications(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationControllerApi#getUnreadNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| Offset records | [optional] [default to 0]
 **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25]

### Return type

[**PageDTOUserNotificationResponseDTO**](PageDTOUserNotificationResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="markAllNotificationRead"></a>
# **markAllNotificationRead**
> markAllNotificationRead()

Mark notifications as read

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.NotificationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationControllerApi apiInstance = new NotificationControllerApi();
try {
    apiInstance.markAllNotificationRead();
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationControllerApi#markAllNotificationRead");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="markNotificationRead"></a>
# **markNotificationRead**
> markNotificationRead(body)

Mark notifications as read

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.NotificationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationControllerApi apiInstance = new NotificationControllerApi();
List<SingleUuidDTO> body = Arrays.asList(new SingleUuidDTO()); // List<SingleUuidDTO> | 
try {
    apiInstance.markNotificationRead(body);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationControllerApi#markNotificationRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="saveAccountPreferences"></a>
# **saveAccountPreferences**
> saveAccountPreferences(body)

Save account related notification preferences

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.NotificationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationControllerApi apiInstance = new NotificationControllerApi();
Map<String, List<Integer>> body = new Map(); // Map<String, List<Integer>> | 
try {
    apiInstance.saveAccountPreferences(body);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationControllerApi#saveAccountPreferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, List&lt;Integer&gt;&gt;**](Map.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="saveMailboxPreferences"></a>
# **saveMailboxPreferences**
> saveMailboxPreferences(body, mailbox)

Save mailbox related notification preferences

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.NotificationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationControllerApi apiInstance = new NotificationControllerApi();
Map<String, List<Integer>> body = new Map(); // Map<String, List<Integer>> | 
UUID mailbox = new UUID(); // UUID | 
try {
    apiInstance.saveMailboxPreferences(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationControllerApi#saveMailboxPreferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, List&lt;Integer&gt;&gt;**](Map.md)|  |
 **mailbox** | [**UUID**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

