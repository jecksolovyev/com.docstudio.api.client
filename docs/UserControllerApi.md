# UserControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptInvite**](UserControllerApi.md#acceptInvite) | **POST** /api/v1/user/invite/accept/{inviteCode} | Accept invite |
| [**changePassword**](UserControllerApi.md#changePassword) | **PUT** /api/v1/user/password | Update user&#39;s password |
| [**changeSignature**](UserControllerApi.md#changeSignature) | **PUT** /api/v1/user/signature | Update user&#39;s eink signature in base64 format |
| [**createInvitation**](UserControllerApi.md#createInvitation) | **POST** /api/v1/user/invite | Create invitation to join account or mailbox with defined permissions. |
| [**declineInvite**](UserControllerApi.md#declineInvite) | **DELETE** /api/v1/user/invite/decline/{inviteCode} | Decline invite |
| [**deleteUser**](UserControllerApi.md#deleteUser) | **DELETE** /api/v1/user | Delete user himself |
| [**findUser**](UserControllerApi.md#findUser) | **GET** /api/v1/user/search | Find user |
| [**getAvatar**](UserControllerApi.md#getAvatar) | **GET** /api/v1/user/avatar/{userUuid} | Retrieve user avatar |
| [**getInvites**](UserControllerApi.md#getInvites) | **GET** /api/v1/user/invites | Get paged invites list |
| [**getMailboxesInfo**](UserControllerApi.md#getMailboxesInfo) | **POST** /api/v1/user/info | Retrieve users info |
| [**getProfile**](UserControllerApi.md#getProfile) | **GET** /api/v1/user/profile | Retrieve user profile |
| [**updateInvitation**](UserControllerApi.md#updateInvitation) | **PUT** /api/v1/user/invite/{uuid} | Update invitation by userUuid. |
| [**updateProfile**](UserControllerApi.md#updateProfile) | **PUT** /api/v1/user/profile | Update user&#39;s profile |


<a id="acceptInvite"></a>
# **acceptInvite**
> acceptInvite(inviteCode)

Accept invite

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    String inviteCode = "inviteCode_example"; // String | Invite code
    try {
      apiInstance.acceptInvite(inviteCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#acceptInvite");
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
| **inviteCode** | **String**| Invite code | |

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

<a id="changePassword"></a>
# **changePassword**
> changePassword(updatePasswordDTO)

Update user&#39;s password

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    UpdatePasswordDTO updatePasswordDTO = new UpdatePasswordDTO(); // UpdatePasswordDTO | 
    try {
      apiInstance.changePassword(updatePasswordDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#changePassword");
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
| **updatePasswordDTO** | [**UpdatePasswordDTO**](UpdatePasswordDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="changeSignature"></a>
# **changeSignature**
> changeSignature(body)

Update user&#39;s eink signature in base64 format

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    String body = "body_example"; // String | 
    try {
      apiInstance.changeSignature(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#changeSignature");
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
| **body** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createInvitation"></a>
# **createInvitation**
> SingleUuidDTO createInvitation(invitationPostDTO)

Create invitation to join account or mailbox with defined permissions.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    InvitationPostDTO invitationPostDTO = new InvitationPostDTO(); // InvitationPostDTO | 
    try {
      SingleUuidDTO result = apiInstance.createInvitation(invitationPostDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#createInvitation");
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
| **invitationPostDTO** | [**InvitationPostDTO**](InvitationPostDTO.md)|  | |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="declineInvite"></a>
# **declineInvite**
> declineInvite(inviteCode)

Decline invite

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    String inviteCode = "inviteCode_example"; // String | Invite code
    try {
      apiInstance.declineInvite(inviteCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#declineInvite");
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
| **inviteCode** | **String**| Invite code | |

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

<a id="deleteUser"></a>
# **deleteUser**
> deleteUser(checkMessage, leaveExisting)

Delete user himself

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    String checkMessage = "checkMessage_example"; // String | Proof message
    Boolean leaveExisting = true; // Boolean | Leave existing account and mailbox. In this case mailbox and account should have other owners, otherwise error will be returned.
    try {
      apiInstance.deleteUser(checkMessage, leaveExisting);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#deleteUser");
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
| **leaveExisting** | **Boolean**| Leave existing account and mailbox. In this case mailbox and account should have other owners, otherwise error will be returned. | |

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
| **204** | No Content |  -  |

<a id="findUser"></a>
# **findUser**
> List&lt;UserDTO&gt; findUser(keyword, exclude)

Find user

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    String keyword = "keyword_example"; // String | 
    UUID exclude = UUID.randomUUID(); // UUID | 
    try {
      List<UserDTO> result = apiInstance.findUser(keyword, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#findUser");
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
| **keyword** | **String**|  | |
| **exclude** | **UUID**|  | [optional] |

### Return type

[**List&lt;UserDTO&gt;**](UserDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAvatar"></a>
# **getAvatar**
> File getAvatar(userUuid, initials)

Retrieve user avatar

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    UUID userUuid = UUID.randomUUID(); // UUID | 
    Boolean initials = true; // Boolean | Get default avatar
    try {
      File result = apiInstance.getAvatar(userUuid, initials);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getAvatar");
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
| **userUuid** | **UUID**|  | |
| **initials** | **Boolean**| Get default avatar | [optional] |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInvites"></a>
# **getInvites**
> PageDTOUserInvitationDTO getInvites(offset, limit)

Get paged invites list

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    Integer offset = 0; // Integer | Offset records
    Integer limit = 25; // Integer | Limit records, max is 1000
    try {
      PageDTOUserInvitationDTO result = apiInstance.getInvites(offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getInvites");
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
| **offset** | **Integer**| Offset records | [optional] [default to 0] |
| **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25] |

### Return type

[**PageDTOUserInvitationDTO**](PageDTOUserInvitationDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMailboxesInfo"></a>
# **getMailboxesInfo**
> Map&lt;String, UserInfoDTO&gt; getMailboxesInfo(UUID)

Retrieve users info

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    try {
      Map<String, UserInfoDTO> result = apiInstance.getMailboxesInfo(UUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getMailboxesInfo");
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

### Return type

[**Map&lt;String, UserInfoDTO&gt;**](UserInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProfile"></a>
# **getProfile**
> ProfileDTO getProfile()

Retrieve user profile

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    try {
      ProfileDTO result = apiInstance.getProfile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getProfile");
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

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateInvitation"></a>
# **updateInvitation**
> updateInvitation(uuid, invitationPutDTO)

Update invitation by userUuid.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | 
    InvitationPutDTO invitationPutDTO = new InvitationPutDTO(); // InvitationPutDTO | 
    try {
      apiInstance.updateInvitation(uuid, invitationPutDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#updateInvitation");
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
| **invitationPutDTO** | [**InvitationPutDTO**](InvitationPutDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateProfile"></a>
# **updateProfile**
> ProfileDTO updateProfile(updateProfileDTO)

Update user&#39;s profile

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    UpdateProfileDTO updateProfileDTO = new UpdateProfileDTO(); // UpdateProfileDTO | 
    try {
      ProfileDTO result = apiInstance.updateProfile(updateProfileDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#updateProfile");
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
| **updateProfileDTO** | [**UpdateProfileDTO**](UpdateProfileDTO.md)|  | |

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

