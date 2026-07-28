# AccountDomainControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**actionAccountDomain**](AccountDomainControllerApi.md#actionAccountDomain) | **PATCH** /api/v1/account/{accountUuid}/domain/{domainUuid}/{action} | Change account domain status |
| [**createAccountDomain**](AccountDomainControllerApi.md#createAccountDomain) | **POST** /api/v1/account/{accountUuid}/domain | Create account domain |
| [**createAccountOauthProvider**](AccountDomainControllerApi.md#createAccountOauthProvider) | **POST** /api/v1/account/{accountId}/oauth-provider | Create account OAuth2 Provider |
| [**createAccountSsoIdp**](AccountDomainControllerApi.md#createAccountSsoIdp) | **POST** /api/v1/account/{accountId}/saml-provider | Create account SAML2 Identity Provider |
| [**deleteAccountDomain**](AccountDomainControllerApi.md#deleteAccountDomain) | **DELETE** /api/v1/account/{accountUuid}/domain/{domainUuid} | Delete account domain |
| [**deleteAccountIdp**](AccountDomainControllerApi.md#deleteAccountIdp) | **DELETE** /api/v1/account/{accountId}/saml-provider/{id} | Delete account SAML2 IdP |
| [**deleteAccountOauthProvider**](AccountDomainControllerApi.md#deleteAccountOauthProvider) | **DELETE** /api/v1/account/{accountId}/oauth-provider/{id} | Delete account OAuth2 Provider |
| [**getAccountDomain**](AccountDomainControllerApi.md#getAccountDomain) | **GET** /api/v1/account/{accountUuid}/domain/{domainUuid} | Get account domain |
| [**getAccountDomains**](AccountDomainControllerApi.md#getAccountDomains) | **GET** /api/v1/account/{accountUuid}/domain | Get paged account domains list |
| [**getAccountIdp**](AccountDomainControllerApi.md#getAccountIdp) | **GET** /api/v1/account/{accountId}/saml-provider/{id} | Get account SAML2 IdP |
| [**getAccountOauthProvider**](AccountDomainControllerApi.md#getAccountOauthProvider) | **GET** /api/v1/account/{accountId}/oauth-provider/{id} | Get account OAuth2 Provider |
| [**getAllAccountIdps**](AccountDomainControllerApi.md#getAllAccountIdps) | **GET** /api/v1/account/{accountId}/saml-provider | Get all account SAML2 IdPs |
| [**getAllAccountOauthProviders**](AccountDomainControllerApi.md#getAllAccountOauthProviders) | **GET** /api/v1/account/{accountId}/oauth-provider | Get all account OAuth2 Providers |
| [**updateAccountDomain**](AccountDomainControllerApi.md#updateAccountDomain) | **PUT** /api/v1/account/{accountUuid}/domain/{domainUuid} | Update account domain |
| [**updateAccountOauthProvider**](AccountDomainControllerApi.md#updateAccountOauthProvider) | **PUT** /api/v1/account/{accountId}/oauth-provider/{id} | Update account OAuth2 Provider |
| [**updateAccountSsoIdp**](AccountDomainControllerApi.md#updateAccountSsoIdp) | **PUT** /api/v1/account/{accountId}/saml-provider/{id} | Update account SAML2 Identity Provider |


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
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createAccountDomain"></a>
# **createAccountDomain**
> AccountDomainDTO createAccountDomain(accountUuid, accountDomainCreate)

Create account domain

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    AccountDomainCreate accountDomainCreate = new AccountDomainCreate(); // AccountDomainCreate | 
    try {
      AccountDomainDTO result = apiInstance.createAccountDomain(accountUuid, accountDomainCreate);
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
| **accountDomainCreate** | [**AccountDomainCreate**](AccountDomainCreate.md)|  | |

### Return type

[**AccountDomainDTO**](AccountDomainDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createAccountOauthProvider"></a>
# **createAccountOauthProvider**
> AccountOauthProviderDTO createAccountOauthProvider(accountId, accountOauthProviderUpdateDTO)

Create account OAuth2 Provider

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    AccountOauthProviderUpdateDTO accountOauthProviderUpdateDTO = new AccountOauthProviderUpdateDTO(); // AccountOauthProviderUpdateDTO | 
    try {
      AccountOauthProviderDTO result = apiInstance.createAccountOauthProvider(accountId, accountOauthProviderUpdateDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#createAccountOauthProvider");
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
| **accountId** | **UUID**| Account UUID | |
| **accountOauthProviderUpdateDTO** | [**AccountOauthProviderUpdateDTO**](AccountOauthProviderUpdateDTO.md)|  | |

### Return type

[**AccountOauthProviderDTO**](AccountOauthProviderDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createAccountSsoIdp"></a>
# **createAccountSsoIdp**
> AccountSamlProviderDTO createAccountSsoIdp(accountId, accountSamlProviderUpdateDTO)

Create account SAML2 Identity Provider

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    AccountSamlProviderUpdateDTO accountSamlProviderUpdateDTO = new AccountSamlProviderUpdateDTO(); // AccountSamlProviderUpdateDTO | 
    try {
      AccountSamlProviderDTO result = apiInstance.createAccountSsoIdp(accountId, accountSamlProviderUpdateDTO);
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
| **accountId** | **UUID**| Account UUID | |
| **accountSamlProviderUpdateDTO** | [**AccountSamlProviderUpdateDTO**](AccountSamlProviderUpdateDTO.md)|  | |

### Return type

[**AccountSamlProviderDTO**](AccountSamlProviderDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

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
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteAccountIdp"></a>
# **deleteAccountIdp**
> deleteAccountIdp(accountId, id)

Delete account SAML2 IdP

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    UUID id = UUID.randomUUID(); // UUID | IdP UUID
    try {
      apiInstance.deleteAccountIdp(accountId, id);
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
| **accountId** | **UUID**| Account UUID | |
| **id** | **UUID**| IdP UUID | |

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

<a id="deleteAccountOauthProvider"></a>
# **deleteAccountOauthProvider**
> deleteAccountOauthProvider(accountId, id)

Delete account OAuth2 Provider

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    UUID id = UUID.randomUUID(); // UUID | OAuth2 Provider UUID
    try {
      apiInstance.deleteAccountOauthProvider(accountId, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#deleteAccountOauthProvider");
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
| **accountId** | **UUID**| Account UUID | |
| **id** | **UUID**| OAuth2 Provider UUID | |

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
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

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

[bearerAuth](../README.md#bearerAuth)

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
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAccountIdp"></a>
# **getAccountIdp**
> AccountSamlProviderDTO getAccountIdp(accountId, id)

Get account SAML2 IdP

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    UUID id = UUID.randomUUID(); // UUID | IdP UUID
    try {
      AccountSamlProviderDTO result = apiInstance.getAccountIdp(accountId, id);
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
| **accountId** | **UUID**| Account UUID | |
| **id** | **UUID**| IdP UUID | |

### Return type

[**AccountSamlProviderDTO**](AccountSamlProviderDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAccountOauthProvider"></a>
# **getAccountOauthProvider**
> AccountOauthProviderDTO getAccountOauthProvider(accountId, id)

Get account OAuth2 Provider

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    UUID id = UUID.randomUUID(); // UUID | OAuth2 Provider UUID
    try {
      AccountOauthProviderDTO result = apiInstance.getAccountOauthProvider(accountId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#getAccountOauthProvider");
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
| **accountId** | **UUID**| Account UUID | |
| **id** | **UUID**| OAuth2 Provider UUID | |

### Return type

[**AccountOauthProviderDTO**](AccountOauthProviderDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAllAccountIdps"></a>
# **getAllAccountIdps**
> List&lt;AccountSsoIdProviderShortDTO&gt; getAllAccountIdps(accountId)

Get all account SAML2 IdPs

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    try {
      List<AccountSsoIdProviderShortDTO> result = apiInstance.getAllAccountIdps(accountId);
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
| **accountId** | **UUID**| Account UUID | |

### Return type

[**List&lt;AccountSsoIdProviderShortDTO&gt;**](AccountSsoIdProviderShortDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAllAccountOauthProviders"></a>
# **getAllAccountOauthProviders**
> List&lt;AccountSsoIdProviderShortDTO&gt; getAllAccountOauthProviders(accountId)

Get all account OAuth2 Providers

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account ID
    try {
      List<AccountSsoIdProviderShortDTO> result = apiInstance.getAllAccountOauthProviders(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#getAllAccountOauthProviders");
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
| **accountId** | **UUID**| Account ID | |

### Return type

[**List&lt;AccountSsoIdProviderShortDTO&gt;**](AccountSsoIdProviderShortDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateAccountDomain"></a>
# **updateAccountDomain**
> AccountDomainDTO updateAccountDomain(accountUuid, domainUuid, accountDomainUpdate)

Update account domain

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID domainUuid = UUID.randomUUID(); // UUID | Domain UUID
    AccountDomainUpdate accountDomainUpdate = new AccountDomainUpdate(); // AccountDomainUpdate | 
    try {
      AccountDomainDTO result = apiInstance.updateAccountDomain(accountUuid, domainUuid, accountDomainUpdate);
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
| **accountDomainUpdate** | [**AccountDomainUpdate**](AccountDomainUpdate.md)|  | |

### Return type

[**AccountDomainDTO**](AccountDomainDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateAccountOauthProvider"></a>
# **updateAccountOauthProvider**
> AccountOauthProviderDTO updateAccountOauthProvider(accountId, id, accountOauthProviderUpdateDTO)

Update account OAuth2 Provider

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    UUID id = UUID.randomUUID(); // UUID | OAuth2 Provider UUID
    AccountOauthProviderUpdateDTO accountOauthProviderUpdateDTO = new AccountOauthProviderUpdateDTO(); // AccountOauthProviderUpdateDTO | 
    try {
      AccountOauthProviderDTO result = apiInstance.updateAccountOauthProvider(accountId, id, accountOauthProviderUpdateDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDomainControllerApi#updateAccountOauthProvider");
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
| **accountId** | **UUID**| Account UUID | |
| **id** | **UUID**| OAuth2 Provider UUID | |
| **accountOauthProviderUpdateDTO** | [**AccountOauthProviderUpdateDTO**](AccountOauthProviderUpdateDTO.md)|  | |

### Return type

[**AccountOauthProviderDTO**](AccountOauthProviderDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateAccountSsoIdp"></a>
# **updateAccountSsoIdp**
> AccountSamlProviderDTO updateAccountSsoIdp(accountId, id, accountSamlProviderUpdateDTO)

Update account SAML2 Identity Provider

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountDomainControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountDomainControllerApi apiInstance = new AccountDomainControllerApi(defaultClient);
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID
    UUID id = UUID.randomUUID(); // UUID | IdP UUID
    AccountSamlProviderUpdateDTO accountSamlProviderUpdateDTO = new AccountSamlProviderUpdateDTO(); // AccountSamlProviderUpdateDTO | 
    try {
      AccountSamlProviderDTO result = apiInstance.updateAccountSsoIdp(accountId, id, accountSamlProviderUpdateDTO);
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
| **accountId** | **UUID**| Account UUID | |
| **id** | **UUID**| IdP UUID | |
| **accountSamlProviderUpdateDTO** | [**AccountSamlProviderUpdateDTO**](AccountSamlProviderUpdateDTO.md)|  | |

### Return type

[**AccountSamlProviderDTO**](AccountSamlProviderDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

