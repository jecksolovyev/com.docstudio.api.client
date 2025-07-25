# EnvelopeSearchControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewColumn**](EnvelopeSearchControllerApi.md#addNewColumn) | **POST** /api/v1/envelope/column | Add a new column to display |
| [**createReport**](EnvelopeSearchControllerApi.md#createReport) | **POST** /api/v1/envelope/report | Request envelopes report |
| [**deleteColumn1**](EnvelopeSearchControllerApi.md#deleteColumn1) | **DELETE** /api/v1/envelope/column | Delete columns from displaying |
| [**getSearchFields**](EnvelopeSearchControllerApi.md#getSearchFields) | **POST** /api/v1/envelope/fields | Get search fields |
| [**getTemplateRoles**](EnvelopeSearchControllerApi.md#getTemplateRoles) | **POST** /api/v1/envelope/search/roles | Retrieve all template roles |
| [**resetColumnSettings**](EnvelopeSearchControllerApi.md#resetColumnSettings) | **POST** /api/v1/envelope/column-reset | Reset column settings |
| [**searchEnvelopes**](EnvelopeSearchControllerApi.md#searchEnvelopes) | **POST** /api/v1/envelope/search | Search envelopes |
| [**searchEnvelopesForApproval**](EnvelopeSearchControllerApi.md#searchEnvelopesForApproval) | **POST** /api/v1/envelope/search-approvals | Search envelopes for approval |
| [**updateColumn**](EnvelopeSearchControllerApi.md#updateColumn) | **PUT** /api/v1/envelope/column/{uuid} | Update column to display |


<a id="addNewColumn"></a>
# **addNewColumn**
> SingleUuidDTO addNewColumn(mailbox, newEnvColumnDTO)

Add a new column to display

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeSearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    NewEnvColumnDTO newEnvColumnDTO = new NewEnvColumnDTO(); // NewEnvColumnDTO | 
    try {
      SingleUuidDTO result = apiInstance.addNewColumn(mailbox, newEnvColumnDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeSearchControllerApi#addNewColumn");
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
| **newEnvColumnDTO** | [**NewEnvColumnDTO**](NewEnvColumnDTO.md)|  | |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createReport"></a>
# **createReport**
> createReport(mailbox, reportEnvelopeRequestDTO)

Request envelopes report

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeSearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    ReportEnvelopeRequestDTO reportEnvelopeRequestDTO = new ReportEnvelopeRequestDTO(); // ReportEnvelopeRequestDTO | 
    try {
      apiInstance.createReport(mailbox, reportEnvelopeRequestDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeSearchControllerApi#createReport");
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
| **reportEnvelopeRequestDTO** | [**ReportEnvelopeRequestDTO**](ReportEnvelopeRequestDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteColumn1"></a>
# **deleteColumn1**
> deleteColumn1(mailbox, deleteEnvColumnDTO)

Delete columns from displaying

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeSearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    DeleteEnvColumnDTO deleteEnvColumnDTO = new DeleteEnvColumnDTO(); // DeleteEnvColumnDTO | 
    try {
      apiInstance.deleteColumn1(mailbox, deleteEnvColumnDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeSearchControllerApi#deleteColumn1");
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
| **deleteEnvColumnDTO** | [**DeleteEnvColumnDTO**](DeleteEnvColumnDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSearchFields"></a>
# **getSearchFields**
> List&lt;EnvelopeSearchField&gt; getSearchFields(name, mailbox, searchEnvelopesDTO)

Get search fields

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeSearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi(defaultClient);
    String name = "name_example"; // String | Field name term
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    SearchEnvelopesDTO searchEnvelopesDTO = new SearchEnvelopesDTO(); // SearchEnvelopesDTO | 
    try {
      List<EnvelopeSearchField> result = apiInstance.getSearchFields(name, mailbox, searchEnvelopesDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeSearchControllerApi#getSearchFields");
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
| **name** | **String**| Field name term | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **searchEnvelopesDTO** | [**SearchEnvelopesDTO**](SearchEnvelopesDTO.md)|  | |

### Return type

[**List&lt;EnvelopeSearchField&gt;**](EnvelopeSearchField.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTemplateRoles"></a>
# **getTemplateRoles**
> TemplateRolesDTO getTemplateRoles(mailbox, UUID)

Retrieve all template roles

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeSearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Set<UUID> UUID = Arrays.asList(); // Set<UUID> | 
    try {
      TemplateRolesDTO result = apiInstance.getTemplateRoles(mailbox, UUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeSearchControllerApi#getTemplateRoles");
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
| **UUID** | [**Set&lt;UUID&gt;**](UUID.md)|  | |

### Return type

[**TemplateRolesDTO**](TemplateRolesDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="resetColumnSettings"></a>
# **resetColumnSettings**
> List&lt;EnvelopeViewColumn&gt; resetColumnSettings(mailbox)

Reset column settings

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeSearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<EnvelopeViewColumn> result = apiInstance.resetColumnSettings(mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeSearchControllerApi#resetColumnSettings");
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

[**List&lt;EnvelopeViewColumn&gt;**](EnvelopeViewColumn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="searchEnvelopes"></a>
# **searchEnvelopes**
> EnvelopePageDTO searchEnvelopes(mailbox, searchEnvelopesDTO, offset, limit, uuidOnly)

Search envelopes

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeSearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    SearchEnvelopesDTO searchEnvelopesDTO = new SearchEnvelopesDTO(); // SearchEnvelopesDTO | 
    Integer offset = 0; // Integer | Offset, how many envelopes to skip
    Integer limit = 25; // Integer | Limit, how many envelopes to retrieve
    Boolean uuidOnly = true; // Boolean | Retrieve only UUID of envelope
    try {
      EnvelopePageDTO result = apiInstance.searchEnvelopes(mailbox, searchEnvelopesDTO, offset, limit, uuidOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeSearchControllerApi#searchEnvelopes");
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
| **searchEnvelopesDTO** | [**SearchEnvelopesDTO**](SearchEnvelopesDTO.md)|  | |
| **offset** | **Integer**| Offset, how many envelopes to skip | [optional] [default to 0] |
| **limit** | **Integer**| Limit, how many envelopes to retrieve | [optional] [default to 25] |
| **uuidOnly** | **Boolean**| Retrieve only UUID of envelope | [optional] |

### Return type

[**EnvelopePageDTO**](EnvelopePageDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="searchEnvelopesForApproval"></a>
# **searchEnvelopesForApproval**
> EnvelopeApprovalPageDTO searchEnvelopesForApproval(mailbox, searchApprovalsDTO, offset, limit, uuidOnly)

Search envelopes for approval

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeSearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    SearchApprovalsDTO searchApprovalsDTO = new SearchApprovalsDTO(); // SearchApprovalsDTO | 
    Integer offset = 0; // Integer | Offset, how many envelopes to skip
    Integer limit = 25; // Integer | Limit, how many envelopes to retrieve
    Boolean uuidOnly = true; // Boolean | Retrieve only UUID of envelope
    try {
      EnvelopeApprovalPageDTO result = apiInstance.searchEnvelopesForApproval(mailbox, searchApprovalsDTO, offset, limit, uuidOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeSearchControllerApi#searchEnvelopesForApproval");
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
| **searchApprovalsDTO** | [**SearchApprovalsDTO**](SearchApprovalsDTO.md)|  | |
| **offset** | **Integer**| Offset, how many envelopes to skip | [optional] [default to 0] |
| **limit** | **Integer**| Limit, how many envelopes to retrieve | [optional] [default to 25] |
| **uuidOnly** | **Boolean**| Retrieve only UUID of envelope | [optional] |

### Return type

[**EnvelopeApprovalPageDTO**](EnvelopeApprovalPageDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateColumn"></a>
# **updateColumn**
> updateColumn(uuid, mailbox, updateEnvColumnDTO)

Update column to display

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeSearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeSearchControllerApi apiInstance = new EnvelopeSearchControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | 
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UpdateEnvColumnDTO updateEnvColumnDTO = new UpdateEnvColumnDTO(); // UpdateEnvColumnDTO | 
    try {
      apiInstance.updateColumn(uuid, mailbox, updateEnvColumnDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeSearchControllerApi#updateColumn");
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
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **updateEnvColumnDTO** | [**UpdateEnvColumnDTO**](UpdateEnvColumnDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

