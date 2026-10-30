# MailboxControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMailbox**](MailboxControllerApi.md#createMailbox) | **POST** /api/v1/mailbox/account/{uuid} | Create mailbox |
| [**customizeDashboard**](MailboxControllerApi.md#customizeDashboard) | **PUT** /api/v1/mailbox/{mailboxUuid}/dashboard | Customize mailbox dashboard |
| [**deleteMailbox**](MailboxControllerApi.md#deleteMailbox) | **DELETE** /api/v1/mailbox | Delete mailbox by UUID in the header. |
| [**deleteMailboxUsers**](MailboxControllerApi.md#deleteMailboxUsers) | **DELETE** /api/v1/mailbox/{mailboxUuid}/users | Delete mailbox users except requester |
| [**deleteViewPreferences**](MailboxControllerApi.md#deleteViewPreferences) | **DELETE** /api/v1/mailbox/view-preferences | Delete mailbox view preferences |
| [**getAccountLogoByMailbox**](MailboxControllerApi.md#getAccountLogoByMailbox) | **GET** /api/v1/mailbox/{mailboxUuid}/logo | Retrieve mailbox account logo |
| [**getActivityLog**](MailboxControllerApi.md#getActivityLog) | **GET** /api/v1/mailbox/activity-log | Audit trail feed for mailbox |
| [**getAllForUserWithPagination**](MailboxControllerApi.md#getAllForUserWithPagination) | **GET** /api/v1/mailbox | Retrieve user&#39;s mailbox list with pagination |
| [**getAutoDelegation**](MailboxControllerApi.md#getAutoDelegation) | **GET** /api/v1/mailbox/{mailboxUuid}/auto-delegation | Get auto delegation settings |
| [**getCustomizedDashboard**](MailboxControllerApi.md#getCustomizedDashboard) | **GET** /api/v1/mailbox/{mailboxUuid}/dashboard | Get mailbox dashboard |
| [**getCustomizedDashboardHtml**](MailboxControllerApi.md#getCustomizedDashboardHtml) | **GET** /api/v1/mailbox/dashboard.html | Get mailbox dashboard html |
| [**getMailboxEssentials**](MailboxControllerApi.md#getMailboxEssentials) | **GET** /api/v1/mailbox/essentials | Get mailbox essentials |
| [**getMailboxesForUserView**](MailboxControllerApi.md#getMailboxesForUserView) | **GET** /api/v1/mailbox/user-view | Retrieve the mailboxes of the user&#39;s sidebar view |
| [**getMailboxesInfo**](MailboxControllerApi.md#getMailboxesInfo) | **POST** /api/v1/mailbox/info | Retrieve mailboxes info |
| [**getStat**](MailboxControllerApi.md#getStat) | **GET** /api/v1/mailbox/stat | Get number of unread envelopes in every scope |
| [**getUsedTemplates**](MailboxControllerApi.md#getUsedTemplates) | **GET** /api/v1/mailbox/templates/used | List of used templates |
| [**getViewPreferences**](MailboxControllerApi.md#getViewPreferences) | **GET** /api/v1/mailbox/view-preferences | Get mailbox view preferences |
| [**leaveMailbox**](MailboxControllerApi.md#leaveMailbox) | **DELETE** /api/v1/mailbox/{mailboxUuid}/leave | Leave mailbox if possible |
| [**patchMailbox**](MailboxControllerApi.md#patchMailbox) | **PATCH** /api/v1/mailbox/{mailboxUuid} | Patch mailbox, return patched mailbox w/o users count |
| [**pinMailbox**](MailboxControllerApi.md#pinMailbox) | **PUT** /api/v1/mailbox/{mailboxUuid}/pin | Mark mailbox as pinned |
| [**searchMailboxes**](MailboxControllerApi.md#searchMailboxes) | **GET** /api/v1/mailbox/search | Search mailboxes by name, contact, alias, user |
| [**unpinMailbox**](MailboxControllerApi.md#unpinMailbox) | **DELETE** /api/v1/mailbox/{mailboxUuid}/pin | Unmark mailbox as pinned |
| [**updateAutoDelegation**](MailboxControllerApi.md#updateAutoDelegation) | **PUT** /api/v1/mailbox/{mailboxUuid}/auto-delegation | Update auto delegation settings |
| [**updateMailbox**](MailboxControllerApi.md#updateMailbox) | **PUT** /api/v1/mailbox/{mailboxUuid} | Update mailbox |
| [**updateViewPreferences**](MailboxControllerApi.md#updateViewPreferences) | **PUT** /api/v1/mailbox/view-preferences | Save mailbox view preferences |


<a id="createMailbox"></a>
# **createMailbox**
> User2MailboxDTO createMailbox(uuid, mailboxCreateDTO, code, codeType)

Create mailbox

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of account for which to create a mailbox
    MailboxCreateDTO mailboxCreateDTO = new MailboxCreateDTO(); // MailboxCreateDTO | 
    String code = "code_example"; // String | Invitation code from email
    String codeType = "envelopeInvite"; // String | Type of code
    try {
      User2MailboxDTO result = apiInstance.createMailbox(uuid, mailboxCreateDTO, code, codeType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#createMailbox");
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
| **uuid** | **UUID**| UUID of account for which to create a mailbox | |
| **mailboxCreateDTO** | [**MailboxCreateDTO**](MailboxCreateDTO.md)|  | |
| **code** | **String**| Invitation code from email | [optional] |
| **codeType** | **String**| Type of code | [optional] [enum: envelopeInvite, accountInvite, emailValidation, sharedByEmail, externalAuth] |

### Return type

[**User2MailboxDTO**](User2MailboxDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="customizeDashboard"></a>
# **customizeDashboard**
> customizeDashboard(mailboxUuid, mailboxDashboardDTO)

Customize mailbox dashboard

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailboxUuid = UUID.randomUUID(); // UUID | 
    MailboxDashboardDTO mailboxDashboardDTO = new MailboxDashboardDTO(); // MailboxDashboardDTO | 
    try {
      apiInstance.customizeDashboard(mailboxUuid, mailboxDashboardDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#customizeDashboard");
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
| **mailboxUuid** | **UUID**|  | |
| **mailboxDashboardDTO** | [**MailboxDashboardDTO**](MailboxDashboardDTO.md)|  | |

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

<a id="deleteMailbox"></a>
# **deleteMailbox**
> deleteMailbox(checkMessage, mailbox, moveEntitiesToMailbox)

Delete mailbox by UUID in the header.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    String checkMessage = "checkMessage_example"; // String | Proof message
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UUID moveEntitiesToMailbox = UUID.randomUUID(); // UUID | Move entities to chosen mailbox
    try {
      apiInstance.deleteMailbox(checkMessage, mailbox, moveEntitiesToMailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#deleteMailbox");
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
| **checkMessage** | **String**| Proof message | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **moveEntitiesToMailbox** | **UUID**| Move entities to chosen mailbox | [optional] |

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
| **204** | No Content |  -  |

<a id="deleteMailboxUsers"></a>
# **deleteMailboxUsers**
> deleteMailboxUsers(mailboxUuid)

Delete mailbox users except requester

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailboxUuid = UUID.randomUUID(); // UUID | Mailbox UUID
    try {
      apiInstance.deleteMailboxUsers(mailboxUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#deleteMailboxUsers");
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
| **mailboxUuid** | **UUID**| Mailbox UUID | |

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

<a id="deleteViewPreferences"></a>
# **deleteViewPreferences**
> deleteViewPreferences(mailbox, key)

Delete mailbox view preferences

Deletes specified keys from mailbox view preferences. If no keys are provided, all preferences will be deleted.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Set<String> key = new LinkedHashSet<>(); // Set<String> | Keys of preferences to delete
    try {
      apiInstance.deleteViewPreferences(mailbox, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#deleteViewPreferences");
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
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **key** | [**Set&lt;String&gt;**](String.md)| Keys of preferences to delete | [optional] |

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

<a id="getAccountLogoByMailbox"></a>
# **getAccountLogoByMailbox**
> File getAccountLogoByMailbox(mailboxUuid)

Retrieve mailbox account logo

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailboxUuid = UUID.randomUUID(); // UUID | 
    try {
      File result = apiInstance.getAccountLogoByMailbox(mailboxUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getAccountLogoByMailbox");
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
| **mailboxUuid** | **UUID**|  | |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getActivityLog"></a>
# **getActivityLog**
> PageDTOActivityLogRecordDTO getActivityLog(mailbox, from, to, offset, limit)

Audit trail feed for mailbox

Records sorted by date in descending order

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    String from = "from_example"; // String | A datetime value in 'ISO-8601' format, lowest record date, default - 3 days ago
    String to = "to_example"; // String | A datetime value in 'ISO-8601' format, highest record date, default - now
    Integer offset = 0; // Integer | Offset, how much records to skip
    Integer limit = 25; // Integer | Limit, how much records to retrieve, max is 1000
    try {
      PageDTOActivityLogRecordDTO result = apiInstance.getActivityLog(mailbox, from, to, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getActivityLog");
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
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **from** | **String**| A datetime value in &#39;ISO-8601&#39; format, lowest record date, default - 3 days ago | [optional] |
| **to** | **String**| A datetime value in &#39;ISO-8601&#39; format, highest record date, default - now | [optional] |
| **offset** | **Integer**| Offset, how much records to skip | [optional] [default to 0] |
| **limit** | **Integer**| Limit, how much records to retrieve, max is 1000 | [optional] [default to 25] |

### Return type

[**PageDTOActivityLogRecordDTO**](PageDTOActivityLogRecordDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAllForUserWithPagination"></a>
# **getAllForUserWithPagination**
> PageDTOUser2MailboxDTO getAllForUserWithPagination(invited, accountId, keyword, permission, offset, limit)

Retrieve user&#39;s mailbox list with pagination

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    Boolean invited = true; // Boolean | Filter mailboxes user was invited to
    UUID accountId = UUID.randomUUID(); // UUID | Filter by account UUID
    String keyword = "keyword_example"; // String | Search by mailbox name or alias
    Integer permission = 56; // Integer | Required mailbox permission in a specific account
    Integer offset = 0; // Integer | Offset, how much mailboxes to skip
    Integer limit = 25; // Integer | Limit, how much mailboxes to retrieve
    try {
      PageDTOUser2MailboxDTO result = apiInstance.getAllForUserWithPagination(invited, accountId, keyword, permission, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getAllForUserWithPagination");
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
| **invited** | **Boolean**| Filter mailboxes user was invited to | [optional] |
| **accountId** | **UUID**| Filter by account UUID | [optional] |
| **keyword** | **String**| Search by mailbox name or alias | [optional] |
| **permission** | **Integer**| Required mailbox permission in a specific account | [optional] |
| **offset** | **Integer**| Offset, how much mailboxes to skip | [optional] [default to 0] |
| **limit** | **Integer**| Limit, how much mailboxes to retrieve | [optional] [default to 25] |

### Return type

[**PageDTOUser2MailboxDTO**](PageDTOUser2MailboxDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAutoDelegation"></a>
# **getAutoDelegation**
> MailboxDelegationDTO getAutoDelegation(mailboxUuid)

Get auto delegation settings

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailboxUuid = UUID.randomUUID(); // UUID | 
    try {
      MailboxDelegationDTO result = apiInstance.getAutoDelegation(mailboxUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getAutoDelegation");
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
| **mailboxUuid** | **UUID**|  | |

### Return type

[**MailboxDelegationDTO**](MailboxDelegationDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCustomizedDashboard"></a>
# **getCustomizedDashboard**
> MailboxDashboardDTO getCustomizedDashboard(mailboxUuid)

Get mailbox dashboard

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailboxUuid = UUID.randomUUID(); // UUID | 
    try {
      MailboxDashboardDTO result = apiInstance.getCustomizedDashboard(mailboxUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getCustomizedDashboard");
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
| **mailboxUuid** | **UUID**|  | |

### Return type

[**MailboxDashboardDTO**](MailboxDashboardDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCustomizedDashboardHtml"></a>
# **getCustomizedDashboardHtml**
> String getCustomizedDashboardHtml(mailbox)

Get mailbox dashboard html

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      String result = apiInstance.getCustomizedDashboardHtml(mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getCustomizedDashboardHtml");
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
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMailboxEssentials"></a>
# **getMailboxEssentials**
> MailboxEssentialsDTO getMailboxEssentials(mailbox)

Get mailbox essentials

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      MailboxEssentialsDTO result = apiInstance.getMailboxEssentials(mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getMailboxEssentials");
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
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**MailboxEssentialsDTO**](MailboxEssentialsDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMailboxesForUserView"></a>
# **getMailboxesForUserView**
> List&lt;User2MailboxDTO&gt; getMailboxesForUserView(pinned, mailboxesForAccount, requiredMailboxId)

Retrieve the mailboxes of the user&#39;s sidebar view

Returns only the mailboxes the selectors below ask for; GET /api/v1/mailbox lists every mailbox the user can reach.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    Boolean pinned = true; // Boolean | Return all pinned mailboxes
    Integer mailboxesForAccount = 56; // Integer | Return mailboxes for each account (max 5)
    UUID requiredMailboxId = UUID.randomUUID(); // UUID | Required mailbox in the response
    try {
      List<User2MailboxDTO> result = apiInstance.getMailboxesForUserView(pinned, mailboxesForAccount, requiredMailboxId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getMailboxesForUserView");
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
| **pinned** | **Boolean**| Return all pinned mailboxes | [optional] |
| **mailboxesForAccount** | **Integer**| Return mailboxes for each account (max 5) | [optional] |
| **requiredMailboxId** | **UUID**| Required mailbox in the response | [optional] |

### Return type

[**List&lt;User2MailboxDTO&gt;**](User2MailboxDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMailboxesInfo"></a>
# **getMailboxesInfo**
> Map&lt;String, MailboxInfoDTO&gt; getMailboxesInfo(UUID, accountName, accountITN)

Retrieve mailboxes info

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    Boolean accountName = false; // Boolean | Including account name
    Boolean accountITN = false; // Boolean | Including account ITN
    try {
      Map<String, MailboxInfoDTO> result = apiInstance.getMailboxesInfo(UUID, accountName, accountITN);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getMailboxesInfo");
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
| **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  | |
| **accountName** | **Boolean**| Including account name | [optional] [default to false] |
| **accountITN** | **Boolean**| Including account ITN | [optional] [default to false] |

### Return type

[**Map&lt;String, MailboxInfoDTO&gt;**](MailboxInfoDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getStat"></a>
# **getStat**
> StatDTO getStat(mailbox)

Get number of unread envelopes in every scope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      StatDTO result = apiInstance.getStat(mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getStat");
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
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**StatDTO**](StatDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getUsedTemplates"></a>
# **getUsedTemplates**
> PageDTOUsedTemplateDTO getUsedTemplates(mailbox, name, offset, limit)

List of used templates

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    String name = "name_example"; // String | Template name to search by
    Integer offset = 0; // Integer | Offset, how much envelopes to skip
    Integer limit = 25; // Integer | Limit, how much envelopes to retrieve
    try {
      PageDTOUsedTemplateDTO result = apiInstance.getUsedTemplates(mailbox, name, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getUsedTemplates");
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
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **name** | **String**| Template name to search by | [optional] |
| **offset** | **Integer**| Offset, how much envelopes to skip | [optional] [default to 0] |
| **limit** | **Integer**| Limit, how much envelopes to retrieve | [optional] [default to 25] |

### Return type

[**PageDTOUsedTemplateDTO**](PageDTOUsedTemplateDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getViewPreferences"></a>
# **getViewPreferences**
> Map&lt;String, String&gt; getViewPreferences(key, mailbox)

Get mailbox view preferences

Retrieve preferences for mailbox view, such as templates view mode. If preferences are not set or keys are not found, returns empty preferences.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    Set<String> key = new LinkedHashSet<>(); // Set<String> | Keys of preferences to retrieve
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      Map<String, String> result = apiInstance.getViewPreferences(key, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getViewPreferences");
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
| **key** | [**Set&lt;String&gt;**](String.md)| Keys of preferences to retrieve | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

**Map&lt;String, String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="leaveMailbox"></a>
# **leaveMailbox**
> leaveMailbox(mailboxUuid)

Leave mailbox if possible

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailboxUuid = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.leaveMailbox(mailboxUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#leaveMailbox");
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
| **mailboxUuid** | **UUID**|  | |

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

<a id="patchMailbox"></a>
# **patchMailbox**
> AccountMailboxInfoDTO patchMailbox(mailboxUuid, mailboxPatchRequestDTO)

Patch mailbox, return patched mailbox w/o users count

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailboxUuid = UUID.randomUUID(); // UUID | UUID of mailbox
    MailboxPatchRequestDTO mailboxPatchRequestDTO = new MailboxPatchRequestDTO(); // MailboxPatchRequestDTO | 
    try {
      AccountMailboxInfoDTO result = apiInstance.patchMailbox(mailboxUuid, mailboxPatchRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#patchMailbox");
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
| **mailboxUuid** | **UUID**| UUID of mailbox | |
| **mailboxPatchRequestDTO** | [**MailboxPatchRequestDTO**](MailboxPatchRequestDTO.md)|  | |

### Return type

[**AccountMailboxInfoDTO**](AccountMailboxInfoDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="pinMailbox"></a>
# **pinMailbox**
> pinMailbox(mailboxUuid)

Mark mailbox as pinned

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailboxUuid = UUID.randomUUID(); // UUID | UUID of mailbox
    try {
      apiInstance.pinMailbox(mailboxUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#pinMailbox");
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
| **mailboxUuid** | **UUID**| UUID of mailbox | |

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

<a id="searchMailboxes"></a>
# **searchMailboxes**
> List&lt;MailboxSearchResultDTO&gt; searchMailboxes(q, mailbox, type)

Search mailboxes by name, contact, alias, user

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    String q = ""; // String | String to search by alias, contact, user email, mailbox name or UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    String type = "ALIAS"; // String | Search type: name, alias or uuid. Default - all values
    try {
      List<MailboxSearchResultDTO> result = apiInstance.searchMailboxes(q, mailbox, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#searchMailboxes");
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
| **q** | **String**| String to search by alias, contact, user email, mailbox name or UUID | [default to ] |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **type** | **String**| Search type: name, alias or uuid. Default - all values | [optional] [enum: ALIAS, UUID] |

### Return type

[**List&lt;MailboxSearchResultDTO&gt;**](MailboxSearchResultDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="unpinMailbox"></a>
# **unpinMailbox**
> unpinMailbox(mailboxUuid)

Unmark mailbox as pinned

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailboxUuid = UUID.randomUUID(); // UUID | UUID of mailbox
    try {
      apiInstance.unpinMailbox(mailboxUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#unpinMailbox");
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
| **mailboxUuid** | **UUID**| UUID of mailbox | |

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

<a id="updateAutoDelegation"></a>
# **updateAutoDelegation**
> updateAutoDelegation(mailboxUuid, mailboxDelegationDTO)

Update auto delegation settings

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailboxUuid = UUID.randomUUID(); // UUID | 
    MailboxDelegationDTO mailboxDelegationDTO = new MailboxDelegationDTO(); // MailboxDelegationDTO | 
    try {
      apiInstance.updateAutoDelegation(mailboxUuid, mailboxDelegationDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#updateAutoDelegation");
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
| **mailboxUuid** | **UUID**|  | |
| **mailboxDelegationDTO** | [**MailboxDelegationDTO**](MailboxDelegationDTO.md)|  | |

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

<a id="updateMailbox"></a>
# **updateMailbox**
> AccountMailboxInfoDTO updateMailbox(mailboxUuid, mailboxUpdateRequestDTO)

Update mailbox

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailboxUuid = UUID.randomUUID(); // UUID | UUID of mailbox
    MailboxUpdateRequestDTO mailboxUpdateRequestDTO = new MailboxUpdateRequestDTO(); // MailboxUpdateRequestDTO | 
    try {
      AccountMailboxInfoDTO result = apiInstance.updateMailbox(mailboxUuid, mailboxUpdateRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#updateMailbox");
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
| **mailboxUuid** | **UUID**| UUID of mailbox | |
| **mailboxUpdateRequestDTO** | [**MailboxUpdateRequestDTO**](MailboxUpdateRequestDTO.md)|  | |

### Return type

[**AccountMailboxInfoDTO**](AccountMailboxInfoDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateViewPreferences"></a>
# **updateViewPreferences**
> Map&lt;String, String&gt; updateViewPreferences(mailbox, requestBody)

Save mailbox view preferences

Saves preferences for mailbox view, such as templates view mode. If preferences are not set, creates new preferences with provided values.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Map<String, String> requestBody = new HashMap(); // Map<String, String> | 
    try {
      Map<String, String> result = apiInstance.updateViewPreferences(mailbox, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#updateViewPreferences");
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
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **requestBody** | [**Map&lt;String, String&gt;**](String.md)|  | |

### Return type

**Map&lt;String, String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

