# NotificationControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccountPreferences**](NotificationControllerApi.md#getAccountPreferences) | **GET** /api/v1/notification/account-preferences | Get account related notification preferences |
| [**getCorporateUserAccountPreferences**](NotificationControllerApi.md#getCorporateUserAccountPreferences) | **GET** /api/v1/notification/user/{userUuid}/account/{accountUuid}/account-preferences | Get corporate user account related notification preferences |
| [**getMailboxPreferences**](NotificationControllerApi.md#getMailboxPreferences) | **GET** /api/v1/notification/user/{userUuid}/account/{accountUuid}/mailbox-preferences | Get corporate user mailbox related notification preferences |
| [**getMailboxPreferences1**](NotificationControllerApi.md#getMailboxPreferences1) | **GET** /api/v1/notification/mailbox-preferences | Get mailbox related notification preferences |
| [**getUnreadNotifications**](NotificationControllerApi.md#getUnreadNotifications) | **GET** /api/v1/notification | Get unread notifications |
| [**markAllNotificationRead**](NotificationControllerApi.md#markAllNotificationRead) | **POST** /api/v1/notification/read-all | Mark notifications as read |
| [**markNotificationRead**](NotificationControllerApi.md#markNotificationRead) | **POST** /api/v1/notification/read | Mark notifications as read |
| [**saveAccountPreferences**](NotificationControllerApi.md#saveAccountPreferences) | **POST** /api/v1/notification/account-preferences | Update account related notification preferences |
| [**saveMailboxPreferences**](NotificationControllerApi.md#saveMailboxPreferences) | **POST** /api/v1/notification/mailbox-preferences | Update mailbox related notification preferences |
| [**setCorporateUserAccountPreferences**](NotificationControllerApi.md#setCorporateUserAccountPreferences) | **POST** /api/v1/notification/user/{userUuid}/account/{accountUuid}/account-preferences | Update corporate user account related notification preferences |
| [**setMailboxPreferences**](NotificationControllerApi.md#setMailboxPreferences) | **POST** /api/v1/notification/user/{userUuid}/account/{accountUuid}/mailbox-preferences | Update corporate user mailbox related notification preferences |


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
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCorporateUserAccountPreferences"></a>
# **getCorporateUserAccountPreferences**
> Map&lt;String, List&lt;Integer&gt;&gt; getCorporateUserAccountPreferences(userUuid, accountUuid)

Get corporate user account related notification preferences

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
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | User uuid
    UUID accountUuid = UUID.randomUUID(); // UUID | Account uuid
    try {
      Map<String, List<Integer>> result = apiInstance.getCorporateUserAccountPreferences(userUuid, accountUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationControllerApi#getCorporateUserAccountPreferences");
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
| **userUuid** | **UUID**| User uuid | |
| **accountUuid** | **UUID**| Account uuid | |

### Return type

[**Map&lt;String, List&lt;Integer&gt;&gt;**](List.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMailboxPreferences"></a>
# **getMailboxPreferences**
> Map&lt;String, List&lt;Integer&gt;&gt; getMailboxPreferences(userUuid, accountUuid, mailbox)

Get corporate user mailbox related notification preferences

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
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | User uuid
    UUID accountUuid = UUID.randomUUID(); // UUID | Account uuid
    UUID mailbox = UUID.randomUUID(); // UUID | 
    try {
      Map<String, List<Integer>> result = apiInstance.getMailboxPreferences(userUuid, accountUuid, mailbox);
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
| **userUuid** | **UUID**| User uuid | |
| **accountUuid** | **UUID**| Account uuid | |
| **mailbox** | **UUID**|  | [optional] |

### Return type

[**Map&lt;String, List&lt;Integer&gt;&gt;**](List.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMailboxPreferences1"></a>
# **getMailboxPreferences1**
> Map&lt;String, List&lt;Integer&gt;&gt; getMailboxPreferences1(mailbox)

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
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | 
    try {
      Map<String, List<Integer>> result = apiInstance.getMailboxPreferences1(mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationControllerApi#getMailboxPreferences1");
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

[bearerAuth](../README.md#bearerAuth)

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
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

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

[bearerAuth](../README.md#bearerAuth)

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
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

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

[bearerAuth](../README.md#bearerAuth)

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
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

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

[bearerAuth](../README.md#bearerAuth)

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

Update account related notification preferences

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
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

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

[bearerAuth](../README.md#bearerAuth)

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

Update mailbox related notification preferences

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
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="setCorporateUserAccountPreferences"></a>
# **setCorporateUserAccountPreferences**
> setCorporateUserAccountPreferences(userUuid, accountUuid, requestBody)

Update corporate user account related notification preferences

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
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | User uuid
    UUID accountUuid = UUID.randomUUID(); // UUID | Account uuid
    Map<String, List<Integer>> requestBody = new HashMap(); // Map<String, List<Integer>> | 
    try {
      apiInstance.setCorporateUserAccountPreferences(userUuid, accountUuid, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationControllerApi#setCorporateUserAccountPreferences");
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
| **userUuid** | **UUID**| User uuid | |
| **accountUuid** | **UUID**| Account uuid | |
| **requestBody** | [**Map&lt;String, List&lt;Integer&gt;&gt;**](List.md)|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="setMailboxPreferences"></a>
# **setMailboxPreferences**
> setMailboxPreferences(userUuid, accountUuid, requestBody, mailbox)

Update corporate user mailbox related notification preferences

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
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | User uuid
    UUID accountUuid = UUID.randomUUID(); // UUID | Account uuid
    Map<String, List<Integer>> requestBody = new HashMap(); // Map<String, List<Integer>> | 
    UUID mailbox = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.setMailboxPreferences(userUuid, accountUuid, requestBody, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationControllerApi#setMailboxPreferences");
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
| **userUuid** | **UUID**| User uuid | |
| **accountUuid** | **UUID**| Account uuid | |
| **requestBody** | [**Map&lt;String, List&lt;Integer&gt;&gt;**](List.md)|  | |
| **mailbox** | **UUID**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

