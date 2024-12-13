# AccountControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewCryptoConfigs**](AccountControllerApi.md#addNewCryptoConfigs) | **PUT** /api/v1/account/{accountUuid}/crypto-configs | Add crypto configs |
| [**blockUsers**](AccountControllerApi.md#blockUsers) | **PATCH** /api/v1/account/{accountUuid}/block-users/{flag} | Block/Unblock corporate users |
| [**createAccount**](AccountControllerApi.md#createAccount) | **POST** /api/v1/account | Create account and mailbox(es) under this account. User will be assigned with default system roles for this account and mailbox(es). |
| [**createCorporateUser**](AccountControllerApi.md#createCorporateUser) | **POST** /api/v1/account/{accountUuid}/user | Create corporate user |
| [**createMassAccountUsers**](AccountControllerApi.md#createMassAccountUsers) | **POST** /api/v1/account/{accountUuid}/create-users | Mass create corporate users |
| [**deleteAccount**](AccountControllerApi.md#deleteAccount) | **DELETE** /api/v1/account/{uuid} | Delete account |
| [**deleteCorporateUsers**](AccountControllerApi.md#deleteCorporateUsers) | **DELETE** /api/v1/account/{accountUuid}/user | Delete corporate users |
| [**deleteCryptoConfigs**](AccountControllerApi.md#deleteCryptoConfigs) | **DELETE** /api/v1/account/{accountUuid}/crypto-configs | Delete crypto configs |
| [**getAccountBillingAddress**](AccountControllerApi.md#getAccountBillingAddress) | **GET** /api/v1/account/{accountUuid}/billing/address | Get account billing address |
| [**getAccountBrandLogo**](AccountControllerApi.md#getAccountBrandLogo) | **GET** /api/v1/account/brand-logo/{accountUuid} | Retrieve account brand logo |
| [**getAccountDetails**](AccountControllerApi.md#getAccountDetails) | **GET** /api/v1/account/{uuid} |  |
| [**getAccountLogoAccount**](AccountControllerApi.md#getAccountLogoAccount) | **GET** /api/v1/account/logo/{accountUuid} | Retrieve account logo |
| [**getAccountUsersImportFileExample**](AccountControllerApi.md#getAccountUsersImportFileExample) | **GET** /api/v1/account/{accountUuid}/users/example | Get account users import file example |
| [**getCryptoConfigs**](AccountControllerApi.md#getCryptoConfigs) | **GET** /api/v1/account/{accountUuid}/crypto-configs | Get crypto configs |
| [**getMailbox**](AccountControllerApi.md#getMailbox) | **GET** /api/v1/account/mailbox/{uuid} | Users and their permissions by mailbox |
| [**getUserPolicies**](AccountControllerApi.md#getUserPolicies) | **GET** /api/v1/account/{accountUuid}/user-policies | Get user password/session policies |
| [**getUsersPermissions**](AccountControllerApi.md#getUsersPermissions) | **POST** /api/v1/account/{accountUuid}/users | Get users with permissions per account and mailboxes |
| [**mailboxesReport**](AccountControllerApi.md#mailboxesReport) | **POST** /api/v1/account/{accountUuid}/mailbox/report | Generate account mailboxes report |
| [**resendCorporateUserWelcomeMessage**](AccountControllerApi.md#resendCorporateUserWelcomeMessage) | **POST** /api/v1/account/{accountUuid}/user/{userUuid}/welcome | Resend corporate user welcome message |
| [**saveUserPolicies**](AccountControllerApi.md#saveUserPolicies) | **POST** /api/v1/account/{accountUuid}/user-policies | Save user password/session policies |
| [**searchMailboxesAccount**](AccountControllerApi.md#searchMailboxesAccount) | **GET** /api/v1/account/{accountUuid}/mailbox | Get paged account mailboxes list |
| [**updateAccountBillingAddress**](AccountControllerApi.md#updateAccountBillingAddress) | **POST** /api/v1/account/{accountUuid}/billing/address | Create/update account billing address |
| [**updateAccountDetails**](AccountControllerApi.md#updateAccountDetails) | **PUT** /api/v1/account/{uuid} |  |
| [**usersReport**](AccountControllerApi.md#usersReport) | **POST** /api/v1/account/{accountUuid}/users/report | Generate account users report |


<a id="addNewCryptoConfigs"></a>
# **addNewCryptoConfigs**
> addNewCryptoConfigs(accountUuid, cryptoConfigDTO)

Add crypto configs

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    List<CryptoConfigDTO> cryptoConfigDTO = Arrays.asList(); // List<CryptoConfigDTO> | 
    try {
      apiInstance.addNewCryptoConfigs(accountUuid, cryptoConfigDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#addNewCryptoConfigs");
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
| **cryptoConfigDTO** | [**List&lt;CryptoConfigDTO&gt;**](CryptoConfigDTO.md)|  | |

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

<a id="blockUsers"></a>
# **blockUsers**
> blockUsers(accountUuid, flag, singleUuidDTO)

Block/Unblock corporate users

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    Boolean flag = true; // Boolean | Block/Unblock flag
    List<SingleUuidDTO> singleUuidDTO = Arrays.asList(); // List<SingleUuidDTO> | 
    try {
      apiInstance.blockUsers(accountUuid, flag, singleUuidDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#blockUsers");
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
| **flag** | **Boolean**| Block/Unblock flag | |
| **singleUuidDTO** | [**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)|  | |

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

<a id="createAccount"></a>
# **createAccount**
> User2AccountWithMailboxesDTO createAccount(accountCreateDTO, code, codeType)

Create account and mailbox(es) under this account. User will be assigned with default system roles for this account and mailbox(es).

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    AccountCreateDTO accountCreateDTO = new AccountCreateDTO(); // AccountCreateDTO | 
    String code = "code_example"; // String | Invitation code from email
    String codeType = "envelopeInvite"; // String | Type of code
    try {
      User2AccountWithMailboxesDTO result = apiInstance.createAccount(accountCreateDTO, code, codeType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#createAccount");
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
| **accountCreateDTO** | [**AccountCreateDTO**](AccountCreateDTO.md)|  | |
| **code** | **String**| Invitation code from email | [optional] |
| **codeType** | **String**| Type of code | [optional] [enum: envelopeInvite, accountInvite, emailValidation, sharedByEmail, externalAuth] |

### Return type

[**User2AccountWithMailboxesDTO**](User2AccountWithMailboxesDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createCorporateUser"></a>
# **createCorporateUser**
> UserDTO createCorporateUser(accountUuid, corporateUserCreateDTO)

Create corporate user

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    CorporateUserCreateDTO corporateUserCreateDTO = new CorporateUserCreateDTO(); // CorporateUserCreateDTO | 
    try {
      UserDTO result = apiInstance.createCorporateUser(accountUuid, corporateUserCreateDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#createCorporateUser");
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
| **corporateUserCreateDTO** | [**CorporateUserCreateDTO**](CorporateUserCreateDTO.md)|  | |

### Return type

[**UserDTO**](UserDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createMassAccountUsers"></a>
# **createMassAccountUsers**
> SingleUuidDTO createMassAccountUsers(accountUuid, _file)

Mass create corporate users

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    File _file = new File("/path/to/file"); // File | 
    try {
      SingleUuidDTO result = apiInstance.createMassAccountUsers(accountUuid, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#createMassAccountUsers");
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
| **_file** | **File**|  | |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteAccount"></a>
# **deleteAccount**
> deleteAccount(checkMessage, uuid)

Delete account

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    String checkMessage = "checkMessage_example"; // String | Proof message
    UUID uuid = UUID.randomUUID(); // UUID | UUID of account to delete
    try {
      apiInstance.deleteAccount(checkMessage, uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#deleteAccount");
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
| **uuid** | **UUID**| UUID of account to delete | |

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

<a id="deleteCorporateUsers"></a>
# **deleteCorporateUsers**
> deleteCorporateUsers(accountUuid, checkMessage, singleUuidDTO)

Delete corporate users

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    String checkMessage = "checkMessage_example"; // String | Proof message
    List<SingleUuidDTO> singleUuidDTO = Arrays.asList(); // List<SingleUuidDTO> | 
    try {
      apiInstance.deleteCorporateUsers(accountUuid, checkMessage, singleUuidDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#deleteCorporateUsers");
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
| **checkMessage** | **String**| Proof message | |
| **singleUuidDTO** | [**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)|  | |

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

<a id="deleteCryptoConfigs"></a>
# **deleteCryptoConfigs**
> deleteCryptoConfigs(accountUuid, UUID)

Delete crypto configs

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    Set<UUID> UUID = Arrays.asList(); // Set<UUID> | 
    try {
      apiInstance.deleteCryptoConfigs(accountUuid, UUID);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#deleteCryptoConfigs");
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
| **UUID** | [**Set&lt;UUID&gt;**](UUID.md)|  | |

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

<a id="getAccountBillingAddress"></a>
# **getAccountBillingAddress**
> AccountAddressDTO getAccountBillingAddress(accountUuid)

Get account billing address

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    try {
      AccountAddressDTO result = apiInstance.getAccountBillingAddress(accountUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#getAccountBillingAddress");
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

[**AccountAddressDTO**](AccountAddressDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAccountBrandLogo"></a>
# **getAccountBrandLogo**
> File getAccountBrandLogo(accountUuid, initials)

Retrieve account brand logo

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | 
    Boolean initials = true; // Boolean | Get default avatar
    try {
      File result = apiInstance.getAccountBrandLogo(accountUuid, initials);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#getAccountBrandLogo");
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
| **accountUuid** | **UUID**|  | |
| **initials** | **Boolean**| Get default avatar | [optional] |

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

<a id="getAccountDetails"></a>
# **getAccountDetails**
> AccountDTO getAccountDetails(uuid, withUsers)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | 
    Boolean withUsers = false; // Boolean | 
    try {
      AccountDTO result = apiInstance.getAccountDetails(uuid, withUsers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#getAccountDetails");
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
| **uuid** | **UUID**|  | |
| **withUsers** | **Boolean**|  | [optional] [default to false] |

### Return type

[**AccountDTO**](AccountDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAccountLogoAccount"></a>
# **getAccountLogoAccount**
> File getAccountLogoAccount(accountUuid, initials)

Retrieve account logo

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | 
    Boolean initials = true; // Boolean | Get default avatar
    try {
      File result = apiInstance.getAccountLogoAccount(accountUuid, initials);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#getAccountLogoAccount");
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
| **accountUuid** | **UUID**|  | |
| **initials** | **Boolean**| Get default avatar | [optional] |

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

<a id="getAccountUsersImportFileExample"></a>
# **getAccountUsersImportFileExample**
> File getAccountUsersImportFileExample(accountUuid)

Get account users import file example

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    try {
      File result = apiInstance.getAccountUsersImportFileExample(accountUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#getAccountUsersImportFileExample");
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

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCryptoConfigs"></a>
# **getCryptoConfigs**
> List&lt;CryptoConfigDTO&gt; getCryptoConfigs(accountUuid, mailbox)

Get crypto configs

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<CryptoConfigDTO> result = apiInstance.getCryptoConfigs(accountUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#getCryptoConfigs");
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
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | [optional] |

### Return type

[**List&lt;CryptoConfigDTO&gt;**](CryptoConfigDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMailbox"></a>
# **getMailbox**
> MailboxAccountSimpleDTO getMailbox(uuid)

Users and their permissions by mailbox

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | 
    try {
      MailboxAccountSimpleDTO result = apiInstance.getMailbox(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#getMailbox");
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
| **uuid** | **UUID**|  | |

### Return type

[**MailboxAccountSimpleDTO**](MailboxAccountSimpleDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getUserPolicies"></a>
# **getUserPolicies**
> AccountPoliciesDTO getUserPolicies(accountUuid)

Get user password/session policies

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    try {
      AccountPoliciesDTO result = apiInstance.getUserPolicies(accountUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#getUserPolicies");
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

[**AccountPoliciesDTO**](AccountPoliciesDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getUsersPermissions"></a>
# **getUsersPermissions**
> PageDTOUserMailboxPermissionsDTO getUsersPermissions(accountUuid, usersSearchFilterDTO, offset, limit)

Get users with permissions per account and mailboxes

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | UUID of Account
    UsersSearchFilterDTO usersSearchFilterDTO = new UsersSearchFilterDTO(); // UsersSearchFilterDTO | 
    Integer offset = 0; // Integer | Offset, how much envelopes to skip
    Integer limit = 25; // Integer | Limit, how much envelopes to retrieve
    try {
      PageDTOUserMailboxPermissionsDTO result = apiInstance.getUsersPermissions(accountUuid, usersSearchFilterDTO, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#getUsersPermissions");
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
| **accountUuid** | **UUID**| UUID of Account | |
| **usersSearchFilterDTO** | [**UsersSearchFilterDTO**](UsersSearchFilterDTO.md)|  | |
| **offset** | **Integer**| Offset, how much envelopes to skip | [optional] [default to 0] |
| **limit** | **Integer**| Limit, how much envelopes to retrieve | [optional] [default to 25] |

### Return type

[**PageDTOUserMailboxPermissionsDTO**](PageDTOUserMailboxPermissionsDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="mailboxesReport"></a>
# **mailboxesReport**
> mailboxesReport(accountUuid, reportMailboxesRequestDTO)

Generate account mailboxes report

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    ReportMailboxesRequestDTO reportMailboxesRequestDTO = new ReportMailboxesRequestDTO(); // ReportMailboxesRequestDTO | 
    try {
      apiInstance.mailboxesReport(accountUuid, reportMailboxesRequestDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#mailboxesReport");
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
| **reportMailboxesRequestDTO** | [**ReportMailboxesRequestDTO**](ReportMailboxesRequestDTO.md)|  | |

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
| **201** | Created |  -  |

<a id="resendCorporateUserWelcomeMessage"></a>
# **resendCorporateUserWelcomeMessage**
> resendCorporateUserWelcomeMessage(accountUuid, userUuid)

Resend corporate user welcome message

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    UUID userUuid = UUID.randomUUID(); // UUID | User UUID
    try {
      apiInstance.resendCorporateUserWelcomeMessage(accountUuid, userUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#resendCorporateUserWelcomeMessage");
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
| **userUuid** | **UUID**| User UUID | |

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

<a id="saveUserPolicies"></a>
# **saveUserPolicies**
> saveUserPolicies(accountUuid, accountPoliciesDTO)

Save user password/session policies

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    AccountPoliciesDTO accountPoliciesDTO = new AccountPoliciesDTO(); // AccountPoliciesDTO | 
    try {
      apiInstance.saveUserPolicies(accountUuid, accountPoliciesDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#saveUserPolicies");
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
| **accountPoliciesDTO** | [**AccountPoliciesDTO**](AccountPoliciesDTO.md)|  | |

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

<a id="searchMailboxesAccount"></a>
# **searchMailboxesAccount**
> PageDTOAccountMailboxInfoDTO searchMailboxesAccount(accountUuid, keyword, withGroups, group, offset, limit)

Get paged account mailboxes list

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    String keyword = "keyword_example"; // String | Keyword to search mailbox by or mailbox UUID
    Boolean withGroups = true; // Boolean | Include groups info into response
    Set<UUID> group = Arrays.asList(); // Set<UUID> | Include groups info into response
    Integer offset = 0; // Integer | Offset records
    Integer limit = 25; // Integer | Limit records, max is 1000
    try {
      PageDTOAccountMailboxInfoDTO result = apiInstance.searchMailboxesAccount(accountUuid, keyword, withGroups, group, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#searchMailboxesAccount");
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
| **keyword** | **String**| Keyword to search mailbox by or mailbox UUID | [optional] |
| **withGroups** | **Boolean**| Include groups info into response | [optional] |
| **group** | [**Set&lt;UUID&gt;**](UUID.md)| Include groups info into response | [optional] |
| **offset** | **Integer**| Offset records | [optional] [default to 0] |
| **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25] |

### Return type

[**PageDTOAccountMailboxInfoDTO**](PageDTOAccountMailboxInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateAccountBillingAddress"></a>
# **updateAccountBillingAddress**
> AccountAddressDTO updateAccountBillingAddress(accountUuid, accountAddressDTO)

Create/update account billing address

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | Account UUID
    AccountAddressDTO accountAddressDTO = new AccountAddressDTO(); // AccountAddressDTO | 
    try {
      AccountAddressDTO result = apiInstance.updateAccountBillingAddress(accountUuid, accountAddressDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#updateAccountBillingAddress");
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
| **accountAddressDTO** | [**AccountAddressDTO**](AccountAddressDTO.md)|  | |

### Return type

[**AccountAddressDTO**](AccountAddressDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateAccountDetails"></a>
# **updateAccountDetails**
> AccountDTO updateAccountDetails(uuid, updateAccountRequest)



### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | 
    UpdateAccountRequest updateAccountRequest = new UpdateAccountRequest(); // UpdateAccountRequest | 
    try {
      AccountDTO result = apiInstance.updateAccountDetails(uuid, updateAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#updateAccountDetails");
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
| **uuid** | **UUID**|  | |
| **updateAccountRequest** | [**UpdateAccountRequest**](UpdateAccountRequest.md)|  | |

### Return type

[**AccountDTO**](AccountDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="usersReport"></a>
# **usersReport**
> usersReport(accountUuid, reportUsersRequestDTO)

Generate account users report

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.AccountControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountControllerApi apiInstance = new AccountControllerApi(defaultClient);
    UUID accountUuid = UUID.randomUUID(); // UUID | UUID of Account
    ReportUsersRequestDTO reportUsersRequestDTO = new ReportUsersRequestDTO(); // ReportUsersRequestDTO | 
    try {
      apiInstance.usersReport(accountUuid, reportUsersRequestDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountControllerApi#usersReport");
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
| **accountUuid** | **UUID**| UUID of Account | |
| **reportUsersRequestDTO** | [**ReportUsersRequestDTO**](ReportUsersRequestDTO.md)|  | |

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
| **201** | Created |  -  |

