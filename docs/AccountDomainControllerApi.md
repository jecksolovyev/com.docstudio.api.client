# AccountDomainControllerApi

All URIs are relative to *https://api.centredo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionAccountDomain**](AccountDomainControllerApi.md#actionAccountDomain) | **PATCH** /api/v1/account/{accountUuid}/domain/{domainUuid}/{action} | Change account domain status
[**createAccountDomain**](AccountDomainControllerApi.md#createAccountDomain) | **POST** /api/v1/account/{accountUuid}/domain | Create account domain
[**createAccountSsoIdp**](AccountDomainControllerApi.md#createAccountSsoIdp) | **POST** /api/v1/account/{accountUuid}/idp | Create account SSO Identity Provider
[**deleteAccountDomain**](AccountDomainControllerApi.md#deleteAccountDomain) | **DELETE** /api/v1/account/{accountUuid}/domain/{domainUuid} | Delete account domain
[**deleteAccountIdp**](AccountDomainControllerApi.md#deleteAccountIdp) | **DELETE** /api/v1/account/{accountUuid}/idp/{idpUuid} | Delete account SSO IdP
[**getAccountDomain**](AccountDomainControllerApi.md#getAccountDomain) | **GET** /api/v1/account/{accountUuid}/domain/{domainUuid} | Get account domain
[**getAccountDomains**](AccountDomainControllerApi.md#getAccountDomains) | **GET** /api/v1/account/{accountUuid}/domain | Get paged account domains list
[**getAccountIdp**](AccountDomainControllerApi.md#getAccountIdp) | **GET** /api/v1/account/{accountUuid}/idp/{idpUuid} | Get account SSO IdP
[**getAllAccountIdps**](AccountDomainControllerApi.md#getAllAccountIdps) | **GET** /api/v1/account/{accountUuid}/idp | Get all account SSO IdPs
[**updateAccountDomain**](AccountDomainControllerApi.md#updateAccountDomain) | **PUT** /api/v1/account/{accountUuid}/domain/{domainUuid} | Update account domain
[**updateAccountSsoIdp**](AccountDomainControllerApi.md#updateAccountSsoIdp) | **PUT** /api/v1/account/{accountUuid}/idp/{idpUuid} | Update account SSO Identity Provider

<a name="actionAccountDomain"></a>
# **actionAccountDomain**
> AccountDomainDTO actionAccountDomain(accountUuid, domainUuid, action, body)

Change account domain status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountDomainControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountDomainControllerApi apiInstance = new AccountDomainControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID domainUuid = new UUID(); // UUID | Domain UUID
String action = "action_example"; // String | Action
ChangeDomainStatusDTO body = new ChangeDomainStatusDTO(); // ChangeDomainStatusDTO | 
try {
    AccountDomainDTO result = apiInstance.actionAccountDomain(accountUuid, domainUuid, action, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountDomainControllerApi#actionAccountDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **domainUuid** | [**UUID**](.md)| Domain UUID |
 **action** | **String**| Action | [enum: verify, activate, deactivate, confirm, check]
 **body** | [**ChangeDomainStatusDTO**](ChangeDomainStatusDTO.md)|  | [optional]

### Return type

[**AccountDomainDTO**](AccountDomainDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAccountDomain"></a>
# **createAccountDomain**
> AccountDomainDTO createAccountDomain(body, accountUuid)

Create account domain

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountDomainControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountDomainControllerApi apiInstance = new AccountDomainControllerApi();
AccountDomainCreateDTO body = new AccountDomainCreateDTO(); // AccountDomainCreateDTO | 
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    AccountDomainDTO result = apiInstance.createAccountDomain(body, accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountDomainControllerApi#createAccountDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountDomainCreateDTO**](AccountDomainCreateDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

[**AccountDomainDTO**](AccountDomainDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAccountSsoIdp"></a>
# **createAccountSsoIdp**
> AccountSsoIdProviderDTO createAccountSsoIdp(body, accountUuid)

Create account SSO Identity Provider

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountDomainControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountDomainControllerApi apiInstance = new AccountDomainControllerApi();
AccountSsoIdProviderUpdateDTO body = new AccountSsoIdProviderUpdateDTO(); // AccountSsoIdProviderUpdateDTO | 
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    AccountSsoIdProviderDTO result = apiInstance.createAccountSsoIdp(body, accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountDomainControllerApi#createAccountSsoIdp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountSsoIdProviderUpdateDTO**](AccountSsoIdProviderUpdateDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

[**AccountSsoIdProviderDTO**](AccountSsoIdProviderDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountDomain"></a>
# **deleteAccountDomain**
> deleteAccountDomain(accountUuid, domainUuid)

Delete account domain

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountDomainControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountDomainControllerApi apiInstance = new AccountDomainControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID domainUuid = new UUID(); // UUID | Domain UUID
try {
    apiInstance.deleteAccountDomain(accountUuid, domainUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountDomainControllerApi#deleteAccountDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **domainUuid** | [**UUID**](.md)| Domain UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAccountIdp"></a>
# **deleteAccountIdp**
> deleteAccountIdp(accountUuid, idpUuid)

Delete account SSO IdP

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountDomainControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountDomainControllerApi apiInstance = new AccountDomainControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID idpUuid = new UUID(); // UUID | IdP UUID
try {
    apiInstance.deleteAccountIdp(accountUuid, idpUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountDomainControllerApi#deleteAccountIdp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **idpUuid** | [**UUID**](.md)| IdP UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAccountDomain"></a>
# **getAccountDomain**
> AccountDomainDTO getAccountDomain(accountUuid, domainUuid)

Get account domain

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountDomainControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountDomainControllerApi apiInstance = new AccountDomainControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID domainUuid = new UUID(); // UUID | Domain UUID
try {
    AccountDomainDTO result = apiInstance.getAccountDomain(accountUuid, domainUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountDomainControllerApi#getAccountDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **domainUuid** | [**UUID**](.md)| Domain UUID |

### Return type

[**AccountDomainDTO**](AccountDomainDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountDomains"></a>
# **getAccountDomains**
> PageDTOAccountDomainDTO getAccountDomains(accountUuid, offset, limit, keyword, status)

Get paged account domains list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountDomainControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountDomainControllerApi apiInstance = new AccountDomainControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
Integer offset = 0; // Integer | Offset records
Integer limit = 25; // Integer | Limit records, max is 1000
String keyword = "keyword_example"; // String | Domain name or part of name
String status = "status_example"; // String | Domain status
try {
    PageDTOAccountDomainDTO result = apiInstance.getAccountDomains(accountUuid, offset, limit, keyword, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountDomainControllerApi#getAccountDomains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **offset** | **Integer**| Offset records | [optional] [default to 0]
 **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25]
 **keyword** | **String**| Domain name or part of name | [optional]
 **status** | **String**| Domain status | [optional] [enum: UNVERIFIED, ACTIVE, INACTIVE, VERIFIED]

### Return type

[**PageDTOAccountDomainDTO**](PageDTOAccountDomainDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountIdp"></a>
# **getAccountIdp**
> AccountSsoIdProviderDTO getAccountIdp(accountUuid, idpUuid)

Get account SSO IdP

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountDomainControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountDomainControllerApi apiInstance = new AccountDomainControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID idpUuid = new UUID(); // UUID | IdP UUID
try {
    AccountSsoIdProviderDTO result = apiInstance.getAccountIdp(accountUuid, idpUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountDomainControllerApi#getAccountIdp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **idpUuid** | [**UUID**](.md)| IdP UUID |

### Return type

[**AccountSsoIdProviderDTO**](AccountSsoIdProviderDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllAccountIdps"></a>
# **getAllAccountIdps**
> List&lt;AccountSsoIdProviderShortDTO&gt; getAllAccountIdps(accountUuid)

Get all account SSO IdPs

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountDomainControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountDomainControllerApi apiInstance = new AccountDomainControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    List<AccountSsoIdProviderShortDTO> result = apiInstance.getAllAccountIdps(accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountDomainControllerApi#getAllAccountIdps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

[**List&lt;AccountSsoIdProviderShortDTO&gt;**](AccountSsoIdProviderShortDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAccountDomain"></a>
# **updateAccountDomain**
> AccountDomainDTO updateAccountDomain(body, accountUuid, domainUuid)

Update account domain

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountDomainControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountDomainControllerApi apiInstance = new AccountDomainControllerApi();
AccountDomainUpdateDTO body = new AccountDomainUpdateDTO(); // AccountDomainUpdateDTO | 
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID domainUuid = new UUID(); // UUID | Domain UUID
try {
    AccountDomainDTO result = apiInstance.updateAccountDomain(body, accountUuid, domainUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountDomainControllerApi#updateAccountDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountDomainUpdateDTO**](AccountDomainUpdateDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **domainUuid** | [**UUID**](.md)| Domain UUID |

### Return type

[**AccountDomainDTO**](AccountDomainDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccountSsoIdp"></a>
# **updateAccountSsoIdp**
> AccountSsoIdProviderDTO updateAccountSsoIdp(body, accountUuid, idpUuid)

Update account SSO Identity Provider

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountDomainControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountDomainControllerApi apiInstance = new AccountDomainControllerApi();
AccountSsoIdProviderUpdateDTO body = new AccountSsoIdProviderUpdateDTO(); // AccountSsoIdProviderUpdateDTO | 
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID idpUuid = new UUID(); // UUID | IdP UUID
try {
    AccountSsoIdProviderDTO result = apiInstance.updateAccountSsoIdp(body, accountUuid, idpUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountDomainControllerApi#updateAccountSsoIdp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountSsoIdProviderUpdateDTO**](AccountSsoIdProviderUpdateDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **idpUuid** | [**UUID**](.md)| IdP UUID |

### Return type

[**AccountSsoIdProviderDTO**](AccountSsoIdProviderDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

