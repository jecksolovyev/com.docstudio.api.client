# AccountDomainControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**actionAccountDomain**](AccountDomainControllerApi.md#actionAccountDomain) | **PATCH** /api/v1/account/{accountUuid}/domain/{domainUuid}/{action} | Change account domain status |
| [**createAccountDomain**](AccountDomainControllerApi.md#createAccountDomain) | **POST** /api/v1/account/{accountUuid}/domain | Create account domain |
| [**createAccountSsoIdp**](AccountDomainControllerApi.md#createAccountSsoIdp) | **POST** /api/v1/account/{accountUuid}/idp | Create account SSO Identity Provider |
| [**deleteAccountDomain**](AccountDomainControllerApi.md#deleteAccountDomain) | **DELETE** /api/v1/account/{accountUuid}/domain/{domainUuid} | Delete account domain |
| [**deleteAccountIdp**](AccountDomainControllerApi.md#deleteAccountIdp) | **DELETE** /api/v1/account/{accountUuid}/idp/{idpUuid} | Delete account SSO IdP |
| [**getAccountDomain**](AccountDomainControllerApi.md#getAccountDomain) | **GET** /api/v1/account/{accountUuid}/domain/{domainUuid} | Get account domain |
| [**getAccountDomains**](AccountDomainControllerApi.md#getAccountDomains) | **GET** /api/v1/account/{accountUuid}/domain | Get paged account domains list |
| [**getAccountIdp**](AccountDomainControllerApi.md#getAccountIdp) | **GET** /api/v1/account/{accountUuid}/idp/{idpUuid} | Get account SSO IdP |
| [**getAllAccountIdps**](AccountDomainControllerApi.md#getAllAccountIdps) | **GET** /api/v1/account/{accountUuid}/idp | Get all account SSO IdPs |
| [**updateAccountDomain**](AccountDomainControllerApi.md#updateAccountDomain) | **PUT** /api/v1/account/{accountUuid}/domain/{domainUuid} | Update account domain |
| [**updateAccountSsoIdp**](AccountDomainControllerApi.md#updateAccountSsoIdp) | **PUT** /api/v1/account/{accountUuid}/idp/{idpUuid} | Update account SSO Identity Provider |


<a id="actionAccountDomain"></a>
# **actionAccountDomain**
> AccountDomainDTO actionAccountDomain(accountUuid, domainUuid, action, changeDomainStatusDTO)

Change account domain status

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID domainUuid = UUID.randomUUID(); // UUID | Domain UUID
    String action = "verify"; // String | Action
    ChangeDomainStatusDTO changeDomainStatusDTO = new ChangeDomainStatusDTO(); // ChangeDomainStatusDTO | 
    try {
      AccountDomainDTO result = apiInstance.actionAccountDomain(accountUuid, domainUuid, action, changeDomainStatusDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#actionAccountDomain");
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
| **domainUuid** | **UUID**| Domain UUID | |
| **action** | **String**| Action | [enum: verify, activate, deactivate, confirm, check] |
| **changeDomainStatusDTO** | [**ChangeDomainStatusDTO**](ChangeDomainStatusDTO.md)|  | [optional] |

### Return type

[**AccountDomainDTO**](AccountDomainDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createAccountDomain"></a>
# **createAccountDomain**
> AccountDomainDTO createAccountDomain(accountUuid, accountDomainCreateDTO)

Create account domain

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    AccountDomainCreateDTO accountDomainCreateDTO = new AccountDomainCreateDTO(); // AccountDomainCreateDTO | 
    try {
      AccountDomainDTO result = apiInstance.createAccountDomain(accountUuid, accountDomainCreateDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#createAccountDomain");
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
| **accountDomainCreateDTO** | [**AccountDomainCreateDTO**](AccountDomainCreateDTO.md)|  | |

### Return type

[**AccountDomainDTO**](AccountDomainDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createAccountSsoIdp"></a>
# **createAccountSsoIdp**
> AccountSsoIdProviderDTO createAccountSsoIdp(accountUuid, accountSsoIdProviderUpdateDTO)

Create account SSO Identity Provider

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    AccountSsoIdProviderUpdateDTO accountSsoIdProviderUpdateDTO = new AccountSsoIdProviderUpdateDTO(); // AccountSsoIdProviderUpdateDTO | 
    try {
      AccountSsoIdProviderDTO result = apiInstance.createAccountSsoIdp(accountUuid, accountSsoIdProviderUpdateDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#createAccountSsoIdp");
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
| **accountSsoIdProviderUpdateDTO** | [**AccountSsoIdProviderUpdateDTO**](AccountSsoIdProviderUpdateDTO.md)|  | |

### Return type

[**AccountSsoIdProviderDTO**](AccountSsoIdProviderDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteAccountDomain"></a>
# **deleteAccountDomain**
> deleteAccountDomain(accountUuid, domainUuid)

Delete account domain

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID domainUuid = UUID.randomUUID(); // UUID | Domain UUID
    try {
      apiInstance.deleteAccountDomain(accountUuid, domainUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#deleteAccountDomain");
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
| **domainUuid** | **UUID**| Domain UUID | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteAccountIdp"></a>
# **deleteAccountIdp**
> deleteAccountIdp(accountUuid, idpUuid)

Delete account SSO IdP

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID idpUuid = UUID.randomUUID(); // UUID | IdP UUID
    try {
      apiInstance.deleteAccountIdp(accountUuid, idpUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#deleteAccountIdp");
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
| **idpUuid** | **UUID**| IdP UUID | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAccountDomain"></a>
# **getAccountDomain**
> AccountDomainDTO getAccountDomain(accountUuid, domainUuid)

Get account domain

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID domainUuid = UUID.randomUUID(); // UUID | Domain UUID
    try {
      AccountDomainDTO result = apiInstance.getAccountDomain(accountUuid, domainUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#getAccountDomain");
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
| **domainUuid** | **UUID**| Domain UUID | |

### Return type

[**AccountDomainDTO**](AccountDomainDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAccountDomains"></a>
# **getAccountDomains**
> PageDTOAccountDomainDTO getAccountDomains(accountUuid, offset, limit, keyword, status)

Get paged account domains list

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    Integer offset = 0; // Integer | Offset records
    Integer limit = 25; // Integer | Limit records, max is 1000
    String keyword = "keyword_example"; // String | Domain name or part of name
    String status = "UNVERIFIED"; // String | Domain status
    try {
      PageDTOAccountDomainDTO result = apiInstance.getAccountDomains(accountUuid, offset, limit, keyword, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#getAccountDomains");
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
| **offset** | **Integer**| Offset records | [optional] [default to 0] |
| **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25] |
| **keyword** | **String**| Domain name or part of name | [optional] |
| **status** | **String**| Domain status | [optional] [enum: UNVERIFIED, ACTIVE, INACTIVE, VERIFIED] |

### Return type

[**PageDTOAccountDomainDTO**](PageDTOAccountDomainDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAccountIdp"></a>
# **getAccountIdp**
> AccountSsoIdProviderDTO getAccountIdp(accountUuid, idpUuid)

Get account SSO IdP

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID idpUuid = UUID.randomUUID(); // UUID | IdP UUID
    try {
      AccountSsoIdProviderDTO result = apiInstance.getAccountIdp(accountUuid, idpUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#getAccountIdp");
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
| **idpUuid** | **UUID**| IdP UUID | |

### Return type

[**AccountSsoIdProviderDTO**](AccountSsoIdProviderDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAllAccountIdps"></a>
# **getAllAccountIdps**
> List&lt;AccountSsoIdProviderShortDTO&gt; getAllAccountIdps(accountUuid)

Get all account SSO IdPs

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    try {
      List<AccountSsoIdProviderShortDTO> result = apiInstance.getAllAccountIdps(accountUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#getAllAccountIdps");
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

### Return type

[**List&lt;AccountSsoIdProviderShortDTO&gt;**](AccountSsoIdProviderShortDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateAccountDomain"></a>
# **updateAccountDomain**
> AccountDomainDTO updateAccountDomain(accountUuid, domainUuid, accountDomainUpdateDTO)

Update account domain

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID domainUuid = UUID.randomUUID(); // UUID | Domain UUID
    AccountDomainUpdateDTO accountDomainUpdateDTO = new AccountDomainUpdateDTO(); // AccountDomainUpdateDTO | 
    try {
      AccountDomainDTO result = apiInstance.updateAccountDomain(accountUuid, domainUuid, accountDomainUpdateDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#updateAccountDomain");
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
| **domainUuid** | **UUID**| Domain UUID | |
| **accountDomainUpdateDTO** | [**AccountDomainUpdateDTO**](AccountDomainUpdateDTO.md)|  | |

### Return type

[**AccountDomainDTO**](AccountDomainDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateAccountSsoIdp"></a>
# **updateAccountSsoIdp**
> AccountSsoIdProviderDTO updateAccountSsoIdp(accountUuid, idpUuid, accountSsoIdProviderUpdateDTO)

Update account SSO Identity Provider

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID idpUuid = UUID.randomUUID(); // UUID | IdP UUID
    AccountSsoIdProviderUpdateDTO accountSsoIdProviderUpdateDTO = new AccountSsoIdProviderUpdateDTO(); // AccountSsoIdProviderUpdateDTO | 
    try {
      AccountSsoIdProviderDTO result = apiInstance.updateAccountSsoIdp(accountUuid, idpUuid, accountSsoIdProviderUpdateDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#updateAccountSsoIdp");
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
| **idpUuid** | **UUID**| IdP UUID | |
| **accountSsoIdProviderUpdateDTO** | [**AccountSsoIdProviderUpdateDTO**](AccountSsoIdProviderUpdateDTO.md)|  | |

### Return type

[**AccountSsoIdProviderDTO**](AccountSsoIdProviderDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

