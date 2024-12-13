# MailboxGroupControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addMailboxesToGroup**](MailboxGroupControllerApi.md#addMailboxesToGroup) | **POST** /api/v1/account/{accountUuid}/mailbox-group/{groupUuid}/mailbox | Add mailboxes to group |
| [**createMailboxGroup**](MailboxGroupControllerApi.md#createMailboxGroup) | **POST** /api/v1/account/{accountUuid}/mailbox-group | Create mailbox group |
| [**getMailboxGroup**](MailboxGroupControllerApi.md#getMailboxGroup) | **GET** /api/v1/account/{accountUuid}/mailbox-group/{groupUuid} | Get mailbox group |
| [**getMailboxGroupsNames**](MailboxGroupControllerApi.md#getMailboxGroupsNames) | **POST** /api/v1/account/{accountUuid}/mailbox-group/info | Get groups names |
| [**removeMailboxesFromGroup**](MailboxGroupControllerApi.md#removeMailboxesFromGroup) | **DELETE** /api/v1/account/{accountUuid}/mailbox-group/{groupUuid}/mailbox | Remove mailboxes from group |
| [**searchGroups**](MailboxGroupControllerApi.md#searchGroups) | **GET** /api/v1/account/{accountUuid}/mailbox-group | List/search groups |
| [**updateMailboxGroup**](MailboxGroupControllerApi.md#updateMailboxGroup) | **PATCH** /api/v1/account/{accountUuid}/mailbox-group/{groupUuid} | Update mailbox group |
| [**updateMailboxGroupMailboxGroup**](MailboxGroupControllerApi.md#updateMailboxGroupMailboxGroup) | **DELETE** /api/v1/account/{accountUuid}/mailbox-group/{groupUuid} | Delete mailbox group |


<a id="addMailboxesToGroup"></a>
# **addMailboxesToGroup**
> GroupInfoDTO addMailboxesToGroup(accountUuid, groupUuid, UUID)

Add mailboxes to group

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxGroupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID groupUuid = UUID.randomUUID(); // UUID | Group UUID
    Set<UUID> UUID = Arrays.asList(); // Set<UUID> | 
    try {
      GroupInfoDTO result = apiInstance.addMailboxesToGroup(accountUuid, groupUuid, UUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxGroupControllerApi#addMailboxesToGroup");
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
| **accountUuid** | **UUID**| Account UUID | |
| **groupUuid** | **UUID**| Group UUID | |
| **UUID** | [**Set&lt;UUID&gt;**](UUID.md)|  | |

### Return type

[**GroupInfoDTO**](GroupInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createMailboxGroup"></a>
# **createMailboxGroup**
> GroupInfoDTO createMailboxGroup(accountUuid, updateGroupDTO)

Create mailbox group

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxGroupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UpdateGroupDTO updateGroupDTO = new UpdateGroupDTO(); // UpdateGroupDTO | 
    try {
      GroupInfoDTO result = apiInstance.createMailboxGroup(accountUuid, updateGroupDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxGroupControllerApi#createMailboxGroup");
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
| **accountUuid** | **UUID**| Account UUID | |
| **updateGroupDTO** | [**UpdateGroupDTO**](UpdateGroupDTO.md)|  | |

### Return type

[**GroupInfoDTO**](GroupInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="getMailboxGroup"></a>
# **getMailboxGroup**
> GroupInfoDTO getMailboxGroup(accountUuid, groupUuid)

Get mailbox group

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxGroupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID groupUuid = UUID.randomUUID(); // UUID | Group UUID
    try {
      GroupInfoDTO result = apiInstance.getMailboxGroup(accountUuid, groupUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxGroupControllerApi#getMailboxGroup");
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
| **accountUuid** | **UUID**| Account UUID | |
| **groupUuid** | **UUID**| Group UUID | |

### Return type

[**GroupInfoDTO**](GroupInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMailboxGroupsNames"></a>
# **getMailboxGroupsNames**
> List&lt;NameUuidDTO&gt; getMailboxGroupsNames(accountUuid, mailbox, UUID)

Get groups names

Search groups by UUID list and return list of name and uuid

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxGroupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Set<UUID> UUID = Arrays.asList(); // Set<UUID> | 
    try {
      List<NameUuidDTO> result = apiInstance.getMailboxGroupsNames(accountUuid, mailbox, UUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxGroupControllerApi#getMailboxGroupsNames");
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
| **accountUuid** | **UUID**| Account UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **UUID** | [**Set&lt;UUID&gt;**](UUID.md)|  | |

### Return type

[**List&lt;NameUuidDTO&gt;**](NameUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="removeMailboxesFromGroup"></a>
# **removeMailboxesFromGroup**
> GroupInfoDTO removeMailboxesFromGroup(accountUuid, groupUuid, UUID)

Remove mailboxes from group

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxGroupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID groupUuid = UUID.randomUUID(); // UUID | Group UUID
    Set<UUID> UUID = Arrays.asList(); // Set<UUID> | 
    try {
      GroupInfoDTO result = apiInstance.removeMailboxesFromGroup(accountUuid, groupUuid, UUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxGroupControllerApi#removeMailboxesFromGroup");
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
| **accountUuid** | **UUID**| Account UUID | |
| **groupUuid** | **UUID**| Group UUID | |
| **UUID** | [**Set&lt;UUID&gt;**](UUID.md)|  | |

### Return type

[**GroupInfoDTO**](GroupInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="searchGroups"></a>
# **searchGroups**
> PageDTOGroupListInfoDTO searchGroups(accountUuid, keyword, offset, limit, asc, mailbox)

List/search groups

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxGroupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    String keyword = "keyword_example"; // String | Keyword to search group by or group UUID
    Integer offset = 0; // Integer | Offset records
    Integer limit = 25; // Integer | Limit records, max is 1000
    Boolean asc = true; // Boolean | Sort by name in ASC order
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      PageDTOGroupListInfoDTO result = apiInstance.searchGroups(accountUuid, keyword, offset, limit, asc, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxGroupControllerApi#searchGroups");
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
| **accountUuid** | **UUID**| Account UUID | |
| **keyword** | **String**| Keyword to search group by or group UUID | [optional] |
| **offset** | **Integer**| Offset records | [optional] [default to 0] |
| **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25] |
| **asc** | **Boolean**| Sort by name in ASC order | [optional] [default to true] |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | [optional] |

### Return type

[**PageDTOGroupListInfoDTO**](PageDTOGroupListInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateMailboxGroup"></a>
# **updateMailboxGroup**
> GroupInfoDTO updateMailboxGroup(accountUuid, groupUuid, updateGroupDTO)

Update mailbox group

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxGroupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID groupUuid = UUID.randomUUID(); // UUID | Group UUID
    UpdateGroupDTO updateGroupDTO = new UpdateGroupDTO(); // UpdateGroupDTO | 
    try {
      GroupInfoDTO result = apiInstance.updateMailboxGroup(accountUuid, groupUuid, updateGroupDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxGroupControllerApi#updateMailboxGroup");
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
| **accountUuid** | **UUID**| Account UUID | |
| **groupUuid** | **UUID**| Group UUID | |
| **updateGroupDTO** | [**UpdateGroupDTO**](UpdateGroupDTO.md)|  | |

### Return type

[**GroupInfoDTO**](GroupInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateMailboxGroupMailboxGroup"></a>
# **updateMailboxGroupMailboxGroup**
> updateMailboxGroupMailboxGroup(accountUuid, groupUuid)

Delete mailbox group

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.MailboxGroupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    MailboxGroupControllerApi apiInstance = new MailboxGroupControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID groupUuid = UUID.randomUUID(); // UUID | Group UUID
    try {
      apiInstance.updateMailboxGroupMailboxGroup(accountUuid, groupUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailboxGroupControllerApi#updateMailboxGroupMailboxGroup");
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
| **accountUuid** | **UUID**| Account UUID | |
| **groupUuid** | **UUID**| Group UUID | |

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

