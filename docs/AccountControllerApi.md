# AccountControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewCryptoConfigs**](AccountControllerApi.md#addNewCryptoConfigs) | **PUT** /api/v1/account/{accountUuid}/crypto-configs | Add crypto configs
[**blockUsers**](AccountControllerApi.md#blockUsers) | **PATCH** /api/v1/account/{accountUuid}/block-users/{flag} | Block/Unblock corporate users
[**createAccount**](AccountControllerApi.md#createAccount) | **POST** /api/v1/account | Create account and mailbox(es) under this account. User will be assigned with default system roles for this account and mailbox(es).
[**createCorporateUser**](AccountControllerApi.md#createCorporateUser) | **POST** /api/v1/account/{accountUuid}/user | Create corporate user
[**createMassAccountUsers**](AccountControllerApi.md#createMassAccountUsers) | **POST** /api/v1/account/{accountUuid}/create-users | Mass create corporate users
[**deleteAccount**](AccountControllerApi.md#deleteAccount) | **DELETE** /api/v1/account/{uuid} | Delete account
[**deleteCorporateUsers**](AccountControllerApi.md#deleteCorporateUsers) | **DELETE** /api/v1/account/{accountUuid}/user | Delete corporate users
[**deleteCryptoConfigs**](AccountControllerApi.md#deleteCryptoConfigs) | **DELETE** /api/v1/account/{accountUuid}/crypto-configs | Delete crypto configs
[**getAccountBillingAddress**](AccountControllerApi.md#getAccountBillingAddress) | **GET** /api/v1/account/{accountUuid}/billing/address | Get account billing address
[**getAccountBrandLogo**](AccountControllerApi.md#getAccountBrandLogo) | **GET** /api/v1/account/brand-logo/{accountUuid} | Retrieve account brand logo
[**getAccountDetails**](AccountControllerApi.md#getAccountDetails) | **GET** /api/v1/account/{uuid} | 
[**getAccountLogoAccount**](AccountControllerApi.md#getAccountLogoAccount) | **GET** /api/v1/account/logo/{accountUuid} | Retrieve account logo
[**getAccountUsersImportFileExample**](AccountControllerApi.md#getAccountUsersImportFileExample) | **GET** /api/v1/account/{accountUuid}/users/example | Get account users import file example
[**getCryptoConfigs**](AccountControllerApi.md#getCryptoConfigs) | **GET** /api/v1/account/{accountUuid}/crypto-configs | Get crypto configs
[**getMailbox**](AccountControllerApi.md#getMailbox) | **GET** /api/v1/account/mailbox/{uuid} | Users and their permissions by mailbox
[**getUserPolicies**](AccountControllerApi.md#getUserPolicies) | **GET** /api/v1/account/{accountUuid}/user-policies | Get user password/session policies
[**getUsersPermissions**](AccountControllerApi.md#getUsersPermissions) | **POST** /api/v1/account/{accountUuid}/users | Get users with permissions per account and mailboxes
[**mailboxesReport**](AccountControllerApi.md#mailboxesReport) | **POST** /api/v1/account/{accountUuid}/mailbox/report | Generate account mailboxes report
[**resendCorporateUserWelcomeMessage**](AccountControllerApi.md#resendCorporateUserWelcomeMessage) | **POST** /api/v1/account/{accountUuid}/user/{userUuid}/welcome | Resend corporate user welcome message
[**saveUserPolicies**](AccountControllerApi.md#saveUserPolicies) | **POST** /api/v1/account/{accountUuid}/user-policies | Save user password/session policies
[**searchMailboxesAccount**](AccountControllerApi.md#searchMailboxesAccount) | **GET** /api/v1/account/{accountUuid}/mailbox | Get paged account mailboxes list
[**updateAccountBillingAddress**](AccountControllerApi.md#updateAccountBillingAddress) | **POST** /api/v1/account/{accountUuid}/billing/address | Create/update account billing address
[**updateAccountDetails**](AccountControllerApi.md#updateAccountDetails) | **PUT** /api/v1/account/{uuid} | 
[**usersReport**](AccountControllerApi.md#usersReport) | **POST** /api/v1/account/{accountUuid}/users/report | Generate account users report

<a name="addNewCryptoConfigs"></a>
# **addNewCryptoConfigs**
> addNewCryptoConfigs(body, accountUuid)

Add crypto configs

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
List<CryptoConfigDTO> body = Arrays.asList(new CryptoConfigDTO()); // List<CryptoConfigDTO> | 
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    apiInstance.addNewCryptoConfigs(body, accountUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#addNewCryptoConfigs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;CryptoConfigDTO&gt;**](CryptoConfigDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="blockUsers"></a>
# **blockUsers**
> blockUsers(body, accountUuid, flag)

Block/Unblock corporate users

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
List<SingleUuidDTO> body = Arrays.asList(new SingleUuidDTO()); // List<SingleUuidDTO> | 
UUID accountUuid = new UUID(); // UUID | Account UUID
Boolean flag = true; // Boolean | Block/Unblock flag
try {
    apiInstance.blockUsers(body, accountUuid, flag);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#blockUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **flag** | **Boolean**| Block/Unblock flag |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createAccount"></a>
# **createAccount**
> User2AccountWithMailboxesDTO createAccount(body, code, codeType)

Create account and mailbox(es) under this account. User will be assigned with default system roles for this account and mailbox(es).

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
AccountCreateDTO body = new AccountCreateDTO(); // AccountCreateDTO | 
String code = "code_example"; // String | Invitation code from email
String codeType = "codeType_example"; // String | Type of code
try {
    User2AccountWithMailboxesDTO result = apiInstance.createAccount(body, code, codeType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#createAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountCreateDTO**](AccountCreateDTO.md)|  |
 **code** | **String**| Invitation code from email | [optional]
 **codeType** | **String**| Type of code | [optional] [enum: envelopeInvite, accountInvite, emailValidation, sharedByEmail]

### Return type

[**User2AccountWithMailboxesDTO**](User2AccountWithMailboxesDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCorporateUser"></a>
# **createCorporateUser**
> UserDTO createCorporateUser(body, accountUuid)

Create corporate user

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
CorporateUserCreateDTO body = new CorporateUserCreateDTO(); // CorporateUserCreateDTO | 
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    UserDTO result = apiInstance.createCorporateUser(body, accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#createCorporateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CorporateUserCreateDTO**](CorporateUserCreateDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

[**UserDTO**](UserDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMassAccountUsers"></a>
# **createMassAccountUsers**
> createMassAccountUsers(accountUuid, file)

Mass create corporate users

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
File file = new File("file_example"); // File | 
try {
    apiInstance.createMassAccountUsers(accountUuid, file);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#createMassAccountUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **file** | **File**|  | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="deleteAccount"></a>
# **deleteAccount**
> deleteAccount(checkMessage, uuid)

Delete account

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
String checkMessage = "checkMessage_example"; // String | Proof message
UUID uuid = new UUID(); // UUID | UUID of account to delete
try {
    apiInstance.deleteAccount(checkMessage, uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#deleteAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkMessage** | **String**| Proof message |
 **uuid** | [**UUID**](.md)| UUID of account to delete |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteCorporateUsers"></a>
# **deleteCorporateUsers**
> deleteCorporateUsers(body, checkMessage, accountUuid)

Delete corporate users

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
List<SingleUuidDTO> body = Arrays.asList(new SingleUuidDTO()); // List<SingleUuidDTO> | 
String checkMessage = "checkMessage_example"; // String | Proof message
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    apiInstance.deleteCorporateUsers(body, checkMessage, accountUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#deleteCorporateUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)|  |
 **checkMessage** | **String**| Proof message |
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteCryptoConfigs"></a>
# **deleteCryptoConfigs**
> deleteCryptoConfigs(body, accountUuid)

Delete crypto configs

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
List<UUID> body = Arrays.asList(new UUID()); // List<UUID> | 
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    apiInstance.deleteCryptoConfigs(body, accountUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#deleteCryptoConfigs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;UUID&gt;**](UUID.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAccountBillingAddress"></a>
# **getAccountBillingAddress**
> AccountAddressDTO getAccountBillingAddress(accountUuid)

Get account billing address

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    AccountAddressDTO result = apiInstance.getAccountBillingAddress(accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#getAccountBillingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

[**AccountAddressDTO**](AccountAddressDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountBrandLogo"></a>
# **getAccountBrandLogo**
> File getAccountBrandLogo(accountUuid, initials)

Retrieve account brand logo

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
UUID accountUuid = new UUID(); // UUID | 
Boolean initials = true; // Boolean | Get default avatar
try {
    File result = apiInstance.getAccountBrandLogo(accountUuid, initials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#getAccountBrandLogo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)|  |
 **initials** | **Boolean**| Get default avatar | [optional]

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountDetails"></a>
# **getAccountDetails**
> AccountDTO getAccountDetails(uuid, withUsers)



### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
UUID uuid = new UUID(); // UUID | 
Boolean withUsers = false; // Boolean | 
try {
    AccountDTO result = apiInstance.getAccountDetails(uuid, withUsers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#getAccountDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  |
 **withUsers** | **Boolean**|  | [optional] [default to false]

### Return type

[**AccountDTO**](AccountDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountLogoAccount"></a>
# **getAccountLogoAccount**
> File getAccountLogoAccount(accountUuid, initials)

Retrieve account logo

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
UUID accountUuid = new UUID(); // UUID | 
Boolean initials = true; // Boolean | Get default avatar
try {
    File result = apiInstance.getAccountLogoAccount(accountUuid, initials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#getAccountLogoAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)|  |
 **initials** | **Boolean**| Get default avatar | [optional]

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountUsersImportFileExample"></a>
# **getAccountUsersImportFileExample**
> File getAccountUsersImportFileExample(accountUuid)

Get account users import file example

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    File result = apiInstance.getAccountUsersImportFileExample(accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#getAccountUsersImportFileExample");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getCryptoConfigs"></a>
# **getCryptoConfigs**
> List&lt;CryptoConfigDTO&gt; getCryptoConfigs(accountUuid, mailbox)

Get crypto configs

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<CryptoConfigDTO> result = apiInstance.getCryptoConfigs(accountUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#getCryptoConfigs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;CryptoConfigDTO&gt;**](CryptoConfigDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMailbox"></a>
# **getMailbox**
> MailboxAccountSimpleDTO getMailbox(uuid)

Users and their permissions by mailbox

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
UUID uuid = new UUID(); // UUID | 
try {
    MailboxAccountSimpleDTO result = apiInstance.getMailbox(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#getMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  |

### Return type

[**MailboxAccountSimpleDTO**](MailboxAccountSimpleDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserPolicies"></a>
# **getUserPolicies**
> AccountPoliciesDTO getUserPolicies(accountUuid)

Get user password/session policies

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    AccountPoliciesDTO result = apiInstance.getUserPolicies(accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#getUserPolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

[**AccountPoliciesDTO**](AccountPoliciesDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersPermissions"></a>
# **getUsersPermissions**
> PageDTOUserMailboxPermissionsDTO getUsersPermissions(body, accountUuid, offset, limit)

Get users with permissions per account and mailboxes

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
UsersSearchFilterDTO body = new UsersSearchFilterDTO(); // UsersSearchFilterDTO | 
UUID accountUuid = new UUID(); // UUID | UUID of Account
Integer offset = 0; // Integer | Offset, how much envelopes to skip
Integer limit = 25; // Integer | Limit, how much envelopes to retrieve
try {
    PageDTOUserMailboxPermissionsDTO result = apiInstance.getUsersPermissions(body, accountUuid, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#getUsersPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UsersSearchFilterDTO**](UsersSearchFilterDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| UUID of Account |
 **offset** | **Integer**| Offset, how much envelopes to skip | [optional] [default to 0]
 **limit** | **Integer**| Limit, how much envelopes to retrieve | [optional] [default to 25]

### Return type

[**PageDTOUserMailboxPermissionsDTO**](PageDTOUserMailboxPermissionsDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mailboxesReport"></a>
# **mailboxesReport**
> mailboxesReport(body, accountUuid)

Generate account mailboxes report

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
ReportMailboxesRequestDTO body = new ReportMailboxesRequestDTO(); // ReportMailboxesRequestDTO | 
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    apiInstance.mailboxesReport(body, accountUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#mailboxesReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportMailboxesRequestDTO**](ReportMailboxesRequestDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="resendCorporateUserWelcomeMessage"></a>
# **resendCorporateUserWelcomeMessage**
> resendCorporateUserWelcomeMessage(accountUuid, userUuid)

Resend corporate user welcome message

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
UUID userUuid = new UUID(); // UUID | User UUID
try {
    apiInstance.resendCorporateUserWelcomeMessage(accountUuid, userUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#resendCorporateUserWelcomeMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **userUuid** | [**UUID**](.md)| User UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="saveUserPolicies"></a>
# **saveUserPolicies**
> saveUserPolicies(body, accountUuid)

Save user password/session policies

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
AccountPoliciesDTO body = new AccountPoliciesDTO(); // AccountPoliciesDTO | 
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    apiInstance.saveUserPolicies(body, accountUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#saveUserPolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountPoliciesDTO**](AccountPoliciesDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="searchMailboxesAccount"></a>
# **searchMailboxesAccount**
> PageDTOAccountMailboxInfoDTO searchMailboxesAccount(accountUuid, keyword, offset, limit)

Get paged account mailboxes list

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
UUID accountUuid = new UUID(); // UUID | Account UUID
String keyword = "keyword_example"; // String | Keyword to search mailbox by or mailbox UUID
Integer offset = 0; // Integer | Offset records
Integer limit = 25; // Integer | Limit records, max is 1000
try {
    PageDTOAccountMailboxInfoDTO result = apiInstance.searchMailboxesAccount(accountUuid, keyword, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#searchMailboxesAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountUuid** | [**UUID**](.md)| Account UUID |
 **keyword** | **String**| Keyword to search mailbox by or mailbox UUID | [optional]
 **offset** | **Integer**| Offset records | [optional] [default to 0]
 **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25]

### Return type

[**PageDTOAccountMailboxInfoDTO**](PageDTOAccountMailboxInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAccountBillingAddress"></a>
# **updateAccountBillingAddress**
> AccountAddressDTO updateAccountBillingAddress(body, accountUuid)

Create/update account billing address

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
AccountAddressDTO body = new AccountAddressDTO(); // AccountAddressDTO | 
UUID accountUuid = new UUID(); // UUID | Account UUID
try {
    AccountAddressDTO result = apiInstance.updateAccountBillingAddress(body, accountUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#updateAccountBillingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountAddressDTO**](AccountAddressDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| Account UUID |

### Return type

[**AccountAddressDTO**](AccountAddressDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccountDetails"></a>
# **updateAccountDetails**
> AccountDTO updateAccountDetails(body, uuid)



### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
AccountDTO body = new AccountDTO(); // AccountDTO | 
UUID uuid = new UUID(); // UUID | 
try {
    AccountDTO result = apiInstance.updateAccountDetails(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#updateAccountDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountDTO**](AccountDTO.md)|  |
 **uuid** | [**UUID**](.md)|  |

### Return type

[**AccountDTO**](AccountDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersReport"></a>
# **usersReport**
> usersReport(body, accountUuid)

Generate account users report

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.AccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountControllerApi apiInstance = new AccountControllerApi();
ReportUsersRequestDTO body = new ReportUsersRequestDTO(); // ReportUsersRequestDTO | 
UUID accountUuid = new UUID(); // UUID | UUID of Account
try {
    apiInstance.usersReport(body, accountUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountControllerApi#usersReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportUsersRequestDTO**](ReportUsersRequestDTO.md)|  |
 **accountUuid** | [**UUID**](.md)| UUID of Account |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

