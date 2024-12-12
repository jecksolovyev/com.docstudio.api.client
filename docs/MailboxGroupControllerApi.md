# MailboxGroupControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMailboxesToGroup**](MailboxGroupControllerApi.md#addMailboxesToGroup) | **POST** /api/v1/account/{accountUuid}/mailbox-group/{groupUuid}/mailbox | Add mailboxes to group
[**createMailboxGroup**](MailboxGroupControllerApi.md#createMailboxGroup) | **POST** /api/v1/account/{accountUuid}/mailbox-group | Create mailbox group
[**getMailboxGroup**](MailboxGroupControllerApi.md#getMailboxGroup) | **GET** /api/v1/account/{accountUuid}/mailbox-group/{groupUuid} | Get mailbox group
[**getMailboxGroupsNames**](MailboxGroupControllerApi.md#getMailboxGroupsNames) | **POST** /api/v1/account/{accountUuid}/mailbox-group/info | Get groups names
[**removeMailboxesFromGroup**](MailboxGroupControllerApi.md#removeMailboxesFromGroup) | **DELETE** /api/v1/account/{accountUuid}/mailbox-group/{groupUuid}/mailbox | Remove mailboxes from group
[**searchGroups**](MailboxGroupControllerApi.md#searchGroups) | **GET** /api/v1/account/{accountUuid}/mailbox-group | List/search groups
[**updateMailboxGroup**](MailboxGroupControllerApi.md#updateMailboxGroup) | **PATCH** /api/v1/account/{accountUuid}/mailbox-group/{groupUuid} | Update mailbox group
[**updateMailboxGroupMailboxGroup**](MailboxGroupControllerApi.md#updateMailboxGroupMailboxGroup) | **DELETE** /api/v1/account/{accountUuid}/mailbox-group/{groupUuid} | Delete mailbox group

<a name="addMailboxesToGroup"></a>
# **addMailboxesToGroup**
> GroupInfoDTO addMailboxesToGroup(body, accountUuid, groupUuid)

Add mailboxes to group

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxGroupControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi();
List<UUID> body = Arrays.asList(new UUID()); // List<UUID> | 
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID groupUuid = new UUID(); // UUID | Group UUID
try {
    GroupInfoDTO result = apiInstance.addMailboxesToGroup(body, accountUuid, groupUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxGroupControllerApi#addMailboxesToGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;UUID&gt;**](UUID.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **groupUuid** | [**UUID**](.md)| Group UUID |

### Return type

[**GroupInfoDTO**](GroupInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMailboxGroup"></a>
# **createMailboxGroup**
> GroupInfoDTO createMailboxGroup(body, accountUuid)

Create mailbox group

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxGroupControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi();
UpdateGroupDTO body = new UpdateGroupDTO(); // UpdateGroupDTO | 
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    GroupInfoDTO result = apiInstance.createMailboxGroup(body, accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxGroupControllerApi#createMailboxGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateGroupDTO**](UpdateGroupDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

[**GroupInfoDTO**](GroupInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMailboxGroup"></a>
# **getMailboxGroup**
> GroupInfoDTO getMailboxGroup(accountUuid, groupUuid)

Get mailbox group

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxGroupControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID groupUuid = new UUID(); // UUID | Group UUID
try {
    GroupInfoDTO result = apiInstance.getMailboxGroup(accountUuid, groupUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxGroupControllerApi#getMailboxGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **groupUuid** | [**UUID**](.md)| Group UUID |

### Return type

[**GroupInfoDTO**](GroupInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMailboxGroupsNames"></a>
# **getMailboxGroupsNames**
> List&lt;NameUuidDTO&gt; getMailboxGroupsNames(body, mailbox, accountUuid)

Get groups names

Search groups by UUID list and return list of name and uuid

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxGroupControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi();
List<UUID> body = Arrays.asList(new UUID()); // List<UUID> | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    List<NameUuidDTO> result = apiInstance.getMailboxGroupsNames(body, mailbox, accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxGroupControllerApi#getMailboxGroupsNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;UUID&gt;**](UUID.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

[**List&lt;NameUuidDTO&gt;**](NameUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeMailboxesFromGroup"></a>
# **removeMailboxesFromGroup**
> GroupInfoDTO removeMailboxesFromGroup(body, accountUuid, groupUuid)

Remove mailboxes from group

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxGroupControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi();
List<UUID> body = Arrays.asList(new UUID()); // List<UUID> | 
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID groupUuid = new UUID(); // UUID | Group UUID
try {
    GroupInfoDTO result = apiInstance.removeMailboxesFromGroup(body, accountUuid, groupUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxGroupControllerApi#removeMailboxesFromGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;UUID&gt;**](UUID.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **groupUuid** | [**UUID**](.md)| Group UUID |

### Return type

[**GroupInfoDTO**](GroupInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchGroups"></a>
# **searchGroups**
> PageDTOGroupListInfoDTO searchGroups(accountUuid, keyword, offset, limit, asc, mailbox)

List/search groups

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxGroupControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
String keyword = "keyword_example"; // String | Keyword to search group by or group UUID
Integer offset = 0; // Integer | Offset records
Integer limit = 25; // Integer | Limit records, max is 1000
Boolean asc = true; // Boolean | Sort by name in ASC order
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    PageDTOGroupListInfoDTO result = apiInstance.searchGroups(accountUuid, keyword, offset, limit, asc, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxGroupControllerApi#searchGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **keyword** | **String**| Keyword to search group by or group UUID | [optional]
 **offset** | **Integer**| Offset records | [optional] [default to 0]
 **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25]
 **asc** | **Boolean**| Sort by name in ASC order | [optional] [default to true]
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID | [optional]

### Return type

[**PageDTOGroupListInfoDTO**](PageDTOGroupListInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMailboxGroup"></a>
# **updateMailboxGroup**
> GroupInfoDTO updateMailboxGroup(body, accountUuid, groupUuid)

Update mailbox group

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxGroupControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi();
UpdateGroupDTO body = new UpdateGroupDTO(); // UpdateGroupDTO | 
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID groupUuid = new UUID(); // UUID | Group UUID
try {
    GroupInfoDTO result = apiInstance.updateMailboxGroup(body, accountUuid, groupUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxGroupControllerApi#updateMailboxGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateGroupDTO**](UpdateGroupDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **groupUuid** | [**UUID**](.md)| Group UUID |

### Return type

[**GroupInfoDTO**](GroupInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMailboxGroupMailboxGroup"></a>
# **updateMailboxGroupMailboxGroup**
> updateMailboxGroupMailboxGroup(accountUuid, groupUuid)

Delete mailbox group

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import com.docstudio.client.api.MailboxGroupControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID groupUuid = new UUID(); // UUID | Group UUID
try {
    apiInstance.updateMailboxGroupMailboxGroup(accountUuid, groupUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxGroupControllerApi#updateMailboxGroupMailboxGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **groupUuid** | [**UUID**](.md)| Group UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

