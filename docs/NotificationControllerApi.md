# NotificationControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccountPreferences**](NotificationControllerApi.md#getAccountPreferences) | **GET** /api/v1/notification/account-preferences | Get account related notification preferences |
| [**getMailboxPreferences**](NotificationControllerApi.md#getMailboxPreferences) | **GET** /api/v1/notification/mailbox-preferences | Get mailbox related notification preferences |
| [**getUnreadNotifications**](NotificationControllerApi.md#getUnreadNotifications) | **GET** /api/v1/notification | Get unread notifications |
| [**markAllNotificationRead**](NotificationControllerApi.md#markAllNotificationRead) | **POST** /api/v1/notification/read-all | Mark notifications as read |
| [**markNotificationRead**](NotificationControllerApi.md#markNotificationRead) | **POST** /api/v1/notification/read | Mark notifications as read |
| [**saveAccountPreferences**](NotificationControllerApi.md#saveAccountPreferences) | **POST** /api/v1/notification/account-preferences | Save account related notification preferences |
| [**saveMailboxPreferences**](NotificationControllerApi.md#saveMailboxPreferences) | **POST** /api/v1/notification/mailbox-preferences | Save mailbox related notification preferences |


<a id="getAccountPreferences"></a>
# **getAccountPreferences**
> Map&lt;String, List&lt;Integer&gt;&gt; getAccountPreferences()

Get account related notification preferences

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.NotificationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
    try {
      Map<String, List<Integer>> result = apiInstance.getAccountPreferences();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationControllerApi#getAccountPreferences");
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

[**Map&lt;String, List&lt;Integer&gt;&gt;**](List.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMailboxPreferences"></a>
# **getMailboxPreferences**
> Map&lt;String, List&lt;Integer&gt;&gt; getMailboxPreferences(mailbox)

Get mailbox related notification preferences

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.NotificationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | 
    try {
      Map<String, List<Integer>> result = apiInstance.getMailboxPreferences(mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationControllerApi#getMailboxPreferences");
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
| **mailbox** | **UUID**|  | [optional] |

### Return type

[**Map&lt;String, List&lt;Integer&gt;&gt;**](List.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getUnreadNotifications"></a>
# **getUnreadNotifications**
> PageDTOUserNotificationResponseDTO getUnreadNotifications(offset, limit)

Get unread notifications

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.NotificationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
    Integer offset = 0; // Integer | Offset records
    Integer limit = 25; // Integer | Limit records, max is 1000
    try {
      PageDTOUserNotificationResponseDTO result = apiInstance.getUnreadNotifications(offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationControllerApi#getUnreadNotifications");
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
| **offset** | **Integer**| Offset records | [optional] [default to 0] |
| **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25] |

### Return type

[**PageDTOUserNotificationResponseDTO**](PageDTOUserNotificationResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="markAllNotificationRead"></a>
# **markAllNotificationRead**
> markAllNotificationRead()

Mark notifications as read

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.NotificationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
    try {
      apiInstance.markAllNotificationRead();
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationControllerApi#markAllNotificationRead");
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

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="markNotificationRead"></a>
# **markNotificationRead**
> markNotificationRead(singleUuidDTO)

Mark notifications as read

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.NotificationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
    List<SingleUuidDTO> singleUuidDTO = Arrays.asList(); // List<SingleUuidDTO> | 
    try {
      apiInstance.markNotificationRead(singleUuidDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationControllerApi#markNotificationRead");
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
| **singleUuidDTO** | [**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="saveAccountPreferences"></a>
# **saveAccountPreferences**
> saveAccountPreferences(requestBody)

Save account related notification preferences

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.NotificationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
    Map<String, List<Integer>> requestBody = new HashMap(); // Map<String, List<Integer>> | 
    try {
      apiInstance.saveAccountPreferences(requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationControllerApi#saveAccountPreferences");
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
| **requestBody** | [**Map&lt;String, List&lt;Integer&gt;&gt;**](List.md)|  | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="saveMailboxPreferences"></a>
# **saveMailboxPreferences**
> saveMailboxPreferences(requestBody, mailbox)

Save mailbox related notification preferences

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.NotificationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
    Map<String, List<Integer>> requestBody = new HashMap(); // Map<String, List<Integer>> | 
    UUID mailbox = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.saveMailboxPreferences(requestBody, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationControllerApi#saveMailboxPreferences");
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
| **requestBody** | [**Map&lt;String, List&lt;Integer&gt;&gt;**](List.md)|  | |
| **mailbox** | **UUID**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

