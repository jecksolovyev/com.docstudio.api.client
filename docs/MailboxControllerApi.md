# MailboxControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMailbox**](MailboxControllerApi.md#createMailbox) | **POST** /api/v1/mailbox/account/{uuid} | Create mailbox |
| [**customizeDashboard**](MailboxControllerApi.md#customizeDashboard) | **PUT** /api/v1/mailbox/{mailboxUuid}/dashboard | Customize mailbox dashboard |
| [**deleteMailbox**](MailboxControllerApi.md#deleteMailbox) | **DELETE** /api/v1/mailbox | Delete mailbox by UUID in the header. |
| [**deleteMailboxUsers**](MailboxControllerApi.md#deleteMailboxUsers) | **DELETE** /api/v1/mailbox/{mailboxUuid}/users | Delete mailbox users except requester |
| [**getAccountLogo**](MailboxControllerApi.md#getAccountLogo) | **GET** /api/v1/mailbox/{mailboxUuid}/logo | Retrieve mailbox account logo |
| [**getActivityLog**](MailboxControllerApi.md#getActivityLog) | **GET** /api/v1/mailbox/activity-log | Audit trail feed for mailbox |
| [**getAllForUser**](MailboxControllerApi.md#getAllForUser) | **GET** /api/v1/mailbox | Retrieve user&#39;s mailboxes list |
| [**getAutoDelegation**](MailboxControllerApi.md#getAutoDelegation) | **GET** /api/v1/mailbox/{mailboxUuid}/auto-delegation | Get auto delegation settings |
| [**getCustomizedDashboard**](MailboxControllerApi.md#getCustomizedDashboard) | **GET** /api/v1/mailbox/{mailboxUuid}/dashboard | Get mailbox dashboard |
| [**getCustomizedDashboardHtml**](MailboxControllerApi.md#getCustomizedDashboardHtml) | **GET** /api/v1/mailbox/dashboard.html | Get mailbox dashboard html |
| [**getMailboxEssentials**](MailboxControllerApi.md#getMailboxEssentials) | **GET** /api/v1/mailbox/essentials | Get mailbox essentials |
| [**getMailboxesByAccount**](MailboxControllerApi.md#getMailboxesByAccount) | **GET** /api/v1/mailbox/account/{uuid} | Read list of account mailboxes |
| [**getMailboxesInfoMailbox**](MailboxControllerApi.md#getMailboxesInfoMailbox) | **POST** /api/v1/mailbox/info | Retrieve mailboxes info |
| [**getStat**](MailboxControllerApi.md#getStat) | **GET** /api/v1/mailbox/stat | Get number of unread envelopes in every scope |
| [**getUsedTemplates**](MailboxControllerApi.md#getUsedTemplates) | **GET** /api/v1/mailbox/templates/used | List of used templates |
| [**leaveMailbox**](MailboxControllerApi.md#leaveMailbox) | **DELETE** /api/v1/mailbox/{mailboxUuid}/leave | Leave mailbox if possible |
| [**patchMailbox**](MailboxControllerApi.md#patchMailbox) | **PATCH** /api/v1/mailbox/{mailboxUuid} | Patch mailbox, return patched mailbox w/o users count |
| [**searchMailboxes**](MailboxControllerApi.md#searchMailboxes) | **GET** /api/v1/mailbox/search | Search mailboxes by name, contact, alias, user |
| [**searchMailboxesAsParticipants**](MailboxControllerApi.md#searchMailboxesAsParticipants) | **GET** /api/v1/mailbox/search-participants | Search mailboxes by name, contact, alias, user |
| [**updateAutoDelegation**](MailboxControllerApi.md#updateAutoDelegation) | **PUT** /api/v1/mailbox/{mailboxUuid}/auto-delegation | Update auto delegation settings |
| [**updateMailbox**](MailboxControllerApi.md#updateMailbox) | **PUT** /api/v1/mailbox/{mailboxUuid} | Update mailbox |


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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAccountLogo"></a>
# **getAccountLogo**
> File getAccountLogo(mailboxUuid)

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID mailboxUuid = UUID.randomUUID(); // UUID | 
    try {
      File result = apiInstance.getAccountLogo(mailboxUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getAccountLogo");
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

[Authorization](../README.md#Authorization)

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAllForUser"></a>
# **getAllForUser**
> List&lt;User2MailboxDTO&gt; getAllForUser()

Retrieve user&#39;s mailboxes list

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    try {
      List<User2MailboxDTO> result = apiInstance.getAllForUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getAllForUser");
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

[**List&lt;User2MailboxDTO&gt;**](User2MailboxDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html, application/json

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMailboxesByAccount"></a>
# **getMailboxesByAccount**
> List&lt;MailboxNameUuidDTO&gt; getMailboxesByAccount(uuid)

Read list of account mailboxes

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | Account UUID
    try {
      List<MailboxNameUuidDTO> result = apiInstance.getMailboxesByAccount(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getMailboxesByAccount");
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
| **uuid** | **UUID**| Account UUID | |

### Return type

[**List&lt;MailboxNameUuidDTO&gt;**](MailboxNameUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMailboxesInfoMailbox"></a>
# **getMailboxesInfoMailbox**
> Map&lt;String, MailboxInfoDTO&gt; getMailboxesInfoMailbox(UUID, accountName, accountITN)

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    Boolean accountName = false; // Boolean | Including account name
    Boolean accountITN = false; // Boolean | Including account ITN
    try {
      Map<String, MailboxInfoDTO> result = apiInstance.getMailboxesInfoMailbox(UUID, accountName, accountITN);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#getMailboxesInfoMailbox");
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

[Authorization](../README.md#Authorization)

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="searchMailboxesAsParticipants"></a>
# **searchMailboxesAsParticipants**
> List&lt;MailboxSearchResultDTO&gt; searchMailboxesAsParticipants(q, type, mailbox)

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MailboxControllerApi apiInstance = new MailboxControllerApi(defaultClient);
    String q = ""; // String | String to search by alias, contact, user email, mailbox name or UUID
    String type = "SENDER"; // String | Participant type
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<MailboxSearchResultDTO> result = apiInstance.searchMailboxesAsParticipants(q, type, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxControllerApi#searchMailboxesAsParticipants");
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
| **type** | **String**| Participant type | [enum: SENDER, RECIPIENT] |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**List&lt;MailboxSearchResultDTO&gt;**](MailboxSearchResultDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

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
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

