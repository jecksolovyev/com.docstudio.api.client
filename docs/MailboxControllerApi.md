# MailboxControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMailbox**](MailboxControllerApi.md#createMailbox) | **POST** /api/v1/mailbox/account/{uuid} | Create mailbox
[**customizeDashboard**](MailboxControllerApi.md#customizeDashboard) | **PUT** /api/v1/mailbox/{mailboxUuid}/dashboard | Customize mailbox dashboard
[**deleteMailbox**](MailboxControllerApi.md#deleteMailbox) | **DELETE** /api/v1/mailbox | Delete mailbox by UUID in the header.
[**deleteMailboxUsers**](MailboxControllerApi.md#deleteMailboxUsers) | **DELETE** /api/v1/mailbox/{mailboxUuid}/users | Delete mailbox users except requester
[**getAccountLogo**](MailboxControllerApi.md#getAccountLogo) | **GET** /api/v1/mailbox/{mailboxUuid}/logo | Retrieve mailbox account logo
[**getActivityLog**](MailboxControllerApi.md#getActivityLog) | **GET** /api/v1/mailbox/activity-log | Audit trail feed for mailbox
[**getAllForUser**](MailboxControllerApi.md#getAllForUser) | **GET** /api/v1/mailbox | Retrieve user&#x27;s mailboxes list
[**getAutoDelegation**](MailboxControllerApi.md#getAutoDelegation) | **GET** /api/v1/mailbox/{mailboxUuid}/auto-delegation | Get auto delegation settings
[**getCustomizedDashboard**](MailboxControllerApi.md#getCustomizedDashboard) | **GET** /api/v1/mailbox/{mailboxUuid}/dashboard | Get mailbox dashboard
[**getCustomizedDashboardHtml**](MailboxControllerApi.md#getCustomizedDashboardHtml) | **GET** /api/v1/mailbox/dashboard.html | Get mailbox dashboard html
[**getMailboxEssentials**](MailboxControllerApi.md#getMailboxEssentials) | **GET** /api/v1/mailbox/essentials | Get mailbox essentials
[**getMailboxesByAccount**](MailboxControllerApi.md#getMailboxesByAccount) | **GET** /api/v1/mailbox/account/{uuid} | Read list of account mailboxes
[**getMailboxesInfoMailbox**](MailboxControllerApi.md#getMailboxesInfoMailbox) | **POST** /api/v1/mailbox/info | Retrieve mailboxes info
[**getStat**](MailboxControllerApi.md#getStat) | **GET** /api/v1/mailbox/stat | Get number of unread envelopes in every scope
[**getUsedTemplates**](MailboxControllerApi.md#getUsedTemplates) | **GET** /api/v1/mailbox/templates/used | List of used templates
[**leaveMailbox**](MailboxControllerApi.md#leaveMailbox) | **DELETE** /api/v1/mailbox/{mailboxUuid}/leave | Leave mailbox if possible
[**patchMailbox**](MailboxControllerApi.md#patchMailbox) | **PATCH** /api/v1/mailbox/{mailboxUuid} | Patch mailbox, return patched mailbox w/o users count
[**searchMailboxes**](MailboxControllerApi.md#searchMailboxes) | **GET** /api/v1/mailbox/search | Search mailboxes by name, contact, alias, user
[**searchMailboxesAsParticipants**](MailboxControllerApi.md#searchMailboxesAsParticipants) | **GET** /api/v1/mailbox/search-participants | Search mailboxes by name, contact, alias, user
[**updateAutoDelegation**](MailboxControllerApi.md#updateAutoDelegation) | **PUT** /api/v1/mailbox/{mailboxUuid}/auto-delegation | Update auto delegation settings
[**updateMailbox**](MailboxControllerApi.md#updateMailbox) | **PUT** /api/v1/mailbox/{mailboxUuid} | Update mailbox

<a name="createMailbox"></a>
# **createMailbox**
> User2MailboxDTO createMailbox(body, uuid, code, codeType)

Create mailbox

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
MailboxCreateDTO body = new MailboxCreateDTO(); // MailboxCreateDTO | 
UUID uuid = new UUID(); // UUID | UUID of account for which to create a mailbox
String code = "code_example"; // String | Invitation code from email
String codeType = "codeType_example"; // String | Type of code
try {
    User2MailboxDTO result = apiInstance.createMailbox(body, uuid, code, codeType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#createMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MailboxCreateDTO**](MailboxCreateDTO.md)|  |
 **uuid** | [**UUID**](.md)| UUID of account for which to create a mailbox |
 **code** | **String**| Invitation code from email | [optional]
 **codeType** | **String**| Type of code | [optional] [enum: envelopeInvite, accountInvite, emailValidation, sharedByEmail, externalAuth]

### Return type

[**User2MailboxDTO**](User2MailboxDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customizeDashboard"></a>
# **customizeDashboard**
> customizeDashboard(body, mailboxUuid)

Customize mailbox dashboard

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
MailboxDashboardDTO body = new MailboxDashboardDTO(); // MailboxDashboardDTO | 
UUID mailboxUuid = new UUID(); // UUID | 
try {
    apiInstance.customizeDashboard(body, mailboxUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#customizeDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MailboxDashboardDTO**](MailboxDashboardDTO.md)|  |
 **mailboxUuid** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteMailbox"></a>
# **deleteMailbox**
> deleteMailbox(checkMessage, mailbox, moveEntitiesToMailbox)

Delete mailbox by UUID in the header.

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
String checkMessage = "checkMessage_example"; // String | Proof message
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID moveEntitiesToMailbox = new UUID(); // UUID | Move entities to chosen mailbox
try {
    apiInstance.deleteMailbox(checkMessage, mailbox, moveEntitiesToMailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#deleteMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkMessage** | **String**| Proof message |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **moveEntitiesToMailbox** | [**UUID**](.md)| Move entities to chosen mailbox | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteMailboxUsers"></a>
# **deleteMailboxUsers**
> deleteMailboxUsers(mailboxUuid)

Delete mailbox users except requester

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
UUID mailboxUuid = new UUID(); // UUID | Mailbox UUID
try {
    apiInstance.deleteMailboxUsers(mailboxUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#deleteMailboxUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailboxUuid** | [**UUID**](.md)| Mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAccountLogo"></a>
# **getAccountLogo**
> File getAccountLogo(mailboxUuid)

Retrieve mailbox account logo

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
UUID mailboxUuid = new UUID(); // UUID | 
try {
    File result = apiInstance.getAccountLogo(mailboxUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#getAccountLogo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailboxUuid** | [**UUID**](.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActivityLog"></a>
# **getActivityLog**
> PageDTOActivityLogRecordDTO getActivityLog(mailbox, from, to, offset, limit)

Audit trail feed for mailbox

Records sorted by date in descending order

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
String from = "from_example"; // String | A datetime value in 'ISO-8601' format, lowest record date, default - 3 days ago
String to = "to_example"; // String | A datetime value in 'ISO-8601' format, highest record date, default - now
Integer offset = 0; // Integer | Offset, how much records to skip
Integer limit = 25; // Integer | Limit, how much records to retrieve, max is 1000
try {
    PageDTOActivityLogRecordDTO result = apiInstance.getActivityLog(mailbox, from, to, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#getActivityLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **from** | **String**| A datetime value in &#x27;ISO-8601&#x27; format, lowest record date, default - 3 days ago | [optional]
 **to** | **String**| A datetime value in &#x27;ISO-8601&#x27; format, highest record date, default - now | [optional]
 **offset** | **Integer**| Offset, how much records to skip | [optional] [default to 0]
 **limit** | **Integer**| Limit, how much records to retrieve, max is 1000 | [optional] [default to 25]

### Return type

[**PageDTOActivityLogRecordDTO**](PageDTOActivityLogRecordDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllForUser"></a>
# **getAllForUser**
> List&lt;User2MailboxDTO&gt; getAllForUser()

Retrieve user&#x27;s mailboxes list

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
try {
    List<User2MailboxDTO> result = apiInstance.getAllForUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#getAllForUser");
    e.printStackTrace();
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

<a name="getAutoDelegation"></a>
# **getAutoDelegation**
> MailboxDelegationDTO getAutoDelegation(mailboxUuid)

Get auto delegation settings

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
UUID mailboxUuid = new UUID(); // UUID | 
try {
    MailboxDelegationDTO result = apiInstance.getAutoDelegation(mailboxUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#getAutoDelegation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailboxUuid** | [**UUID**](.md)|  |

### Return type

[**MailboxDelegationDTO**](MailboxDelegationDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomizedDashboard"></a>
# **getCustomizedDashboard**
> MailboxDashboardDTO getCustomizedDashboard(mailboxUuid)

Get mailbox dashboard

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
UUID mailboxUuid = new UUID(); // UUID | 
try {
    MailboxDashboardDTO result = apiInstance.getCustomizedDashboard(mailboxUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#getCustomizedDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailboxUuid** | [**UUID**](.md)|  |

### Return type

[**MailboxDashboardDTO**](MailboxDashboardDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomizedDashboardHtml"></a>
# **getCustomizedDashboardHtml**
> String getCustomizedDashboardHtml(mailbox)

Get mailbox dashboard html

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    String result = apiInstance.getCustomizedDashboardHtml(mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#getCustomizedDashboardHtml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html, application/json

<a name="getMailboxEssentials"></a>
# **getMailboxEssentials**
> MailboxEssentialsDTO getMailboxEssentials(mailbox)

Get mailbox essentials

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    MailboxEssentialsDTO result = apiInstance.getMailboxEssentials(mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#getMailboxEssentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**MailboxEssentialsDTO**](MailboxEssentialsDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMailboxesByAccount"></a>
# **getMailboxesByAccount**
> List&lt;MailboxNameUuidDTO&gt; getMailboxesByAccount(uuid)

Read list of account mailboxes

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
UUID uuid = new UUID(); // UUID | Account UUID
try {
    List<MailboxNameUuidDTO> result = apiInstance.getMailboxesByAccount(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#getMailboxesByAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| Account UUID |

### Return type

[**List&lt;MailboxNameUuidDTO&gt;**](MailboxNameUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMailboxesInfoMailbox"></a>
# **getMailboxesInfoMailbox**
> Map&lt;String, MailboxInfoDTO&gt; getMailboxesInfoMailbox(body, accountName, accountITN)

Retrieve mailboxes info

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
List<UUID> body = Arrays.asList(new UUID()); // List<UUID> | 
Boolean accountName = false; // Boolean | Including account name
Boolean accountITN = false; // Boolean | Including account ITN
try {
    Map<String, MailboxInfoDTO> result = apiInstance.getMailboxesInfoMailbox(body, accountName, accountITN);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#getMailboxesInfoMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;UUID&gt;**](UUID.md)|  |
 **accountName** | **Boolean**| Including account name | [optional] [default to false]
 **accountITN** | **Boolean**| Including account ITN | [optional] [default to false]

### Return type

[**Map&lt;String, MailboxInfoDTO&gt;**](MailboxInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStat"></a>
# **getStat**
> StatDTO getStat(mailbox)

Get number of unread envelopes in every scope

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    StatDTO result = apiInstance.getStat(mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#getStat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**StatDTO**](StatDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsedTemplates"></a>
# **getUsedTemplates**
> PageDTOUsedTemplateDTO getUsedTemplates(mailbox, name, offset, limit)

List of used templates

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
String name = "name_example"; // String | Template name to search by
Integer offset = 0; // Integer | Offset, how much envelopes to skip
Integer limit = 25; // Integer | Limit, how much envelopes to retrieve
try {
    PageDTOUsedTemplateDTO result = apiInstance.getUsedTemplates(mailbox, name, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#getUsedTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **name** | **String**| Template name to search by | [optional]
 **offset** | **Integer**| Offset, how much envelopes to skip | [optional] [default to 0]
 **limit** | **Integer**| Limit, how much envelopes to retrieve | [optional] [default to 25]

### Return type

[**PageDTOUsedTemplateDTO**](PageDTOUsedTemplateDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leaveMailbox"></a>
# **leaveMailbox**
> leaveMailbox(mailboxUuid)

Leave mailbox if possible

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
UUID mailboxUuid = new UUID(); // UUID | 
try {
    apiInstance.leaveMailbox(mailboxUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#leaveMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailboxUuid** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="patchMailbox"></a>
# **patchMailbox**
> AccountMailboxInfoDTO patchMailbox(body, mailboxUuid)

Patch mailbox, return patched mailbox w/o users count

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
MailboxPatchRequestDTO body = new MailboxPatchRequestDTO(); // MailboxPatchRequestDTO | 
UUID mailboxUuid = new UUID(); // UUID | UUID of mailbox
try {
    AccountMailboxInfoDTO result = apiInstance.patchMailbox(body, mailboxUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#patchMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MailboxPatchRequestDTO**](MailboxPatchRequestDTO.md)|  |
 **mailboxUuid** | [**UUID**](.md)| UUID of mailbox |

### Return type

[**AccountMailboxInfoDTO**](AccountMailboxInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchMailboxes"></a>
# **searchMailboxes**
> List&lt;MailboxSearchResultDTO&gt; searchMailboxes(q, mailbox, type)

Search mailboxes by name, contact, alias, user

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
String q = ""; // String | String to search by alias, contact, user email, mailbox name or UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
String type = "type_example"; // String | Search type: name, alias or uuid. Default - all values
try {
    List<MailboxSearchResultDTO> result = apiInstance.searchMailboxes(q, mailbox, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#searchMailboxes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| String to search by alias, contact, user email, mailbox name or UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **type** | **String**| Search type: name, alias or uuid. Default - all values | [optional] [enum: ALIAS, UUID]

### Return type

[**List&lt;MailboxSearchResultDTO&gt;**](MailboxSearchResultDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchMailboxesAsParticipants"></a>
# **searchMailboxesAsParticipants**
> List&lt;MailboxSearchResultDTO&gt; searchMailboxesAsParticipants(q, type, mailbox)

Search mailboxes by name, contact, alias, user

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
String q = ""; // String | String to search by alias, contact, user email, mailbox name or UUID
String type = "type_example"; // String | Participant type
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<MailboxSearchResultDTO> result = apiInstance.searchMailboxesAsParticipants(q, type, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#searchMailboxesAsParticipants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| String to search by alias, contact, user email, mailbox name or UUID |
 **type** | **String**| Participant type | [enum: SENDER, RECIPIENT]
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;MailboxSearchResultDTO&gt;**](MailboxSearchResultDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAutoDelegation"></a>
# **updateAutoDelegation**
> updateAutoDelegation(body, mailboxUuid)

Update auto delegation settings

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
MailboxDelegationDTO body = new MailboxDelegationDTO(); // MailboxDelegationDTO | 
UUID mailboxUuid = new UUID(); // UUID | 
try {
    apiInstance.updateAutoDelegation(body, mailboxUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#updateAutoDelegation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MailboxDelegationDTO**](MailboxDelegationDTO.md)|  |
 **mailboxUuid** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateMailbox"></a>
# **updateMailbox**
> AccountMailboxInfoDTO updateMailbox(body, mailboxUuid)

Update mailbox

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxControllerApi apiInstance = new MailboxControllerApi();
MailboxUpdateRequestDTO body = new MailboxUpdateRequestDTO(); // MailboxUpdateRequestDTO | 
UUID mailboxUuid = new UUID(); // UUID | UUID of mailbox
try {
    AccountMailboxInfoDTO result = apiInstance.updateMailbox(body, mailboxUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxControllerApi#updateMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MailboxUpdateRequestDTO**](MailboxUpdateRequestDTO.md)|  |
 **mailboxUuid** | [**UUID**](.md)| UUID of mailbox |

### Return type

[**AccountMailboxInfoDTO**](AccountMailboxInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

