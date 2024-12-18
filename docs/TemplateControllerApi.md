# TemplateControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addZipStructure**](TemplateControllerApi.md#addZipStructure) | **PUT** /api/v1/template/{uuid}/zip-structure | Add new files structure for zip archive |
| [**archiveTemplate**](TemplateControllerApi.md#archiveTemplate) | **PATCH** /api/v1/template/{uuid}/archive | Make template archived |
| [**checkTemplateExistsByUuid**](TemplateControllerApi.md#checkTemplateExistsByUuid) | **HEAD** /api/v1/template/{uuid} | Check template exists by UUID |
| [**clone**](TemplateControllerApi.md#clone) | **POST** /api/v1/template/{uuid}/clone | Clone template |
| [**create1**](TemplateControllerApi.md#create1) | **POST** /api/v1/template | Create new template |
| [**deleteShareCode**](TemplateControllerApi.md#deleteShareCode) | **DELETE** /api/v1/template/{uuid}/share-code | Delete share code for template |
| [**deleteZipStructure**](TemplateControllerApi.md#deleteZipStructure) | **DELETE** /api/v1/template/{uuid}/zip-structure/{title} | Delete structure for zip archive |
| [**downloadTemplateImage**](TemplateControllerApi.md#downloadTemplateImage) | **GET** /api/v1/template/{uuid}/image | Download template image |
| [**downloadTemplatePdf**](TemplateControllerApi.md#downloadTemplatePdf) | **GET** /api/v1/template/{uuid}/pdf | Download template PDF |
| [**getPdfPageSizes**](TemplateControllerApi.md#getPdfPageSizes) | **GET** /api/v1/template/{uuid}/pdf-page-sizes | Get PDF page sizes |
| [**getRecentlyUsedTemplates**](TemplateControllerApi.md#getRecentlyUsedTemplates) | **GET** /api/v1/template/recently-used | Get up to 10 recently used templates |
| [**getRecommendedTemplates**](TemplateControllerApi.md#getRecommendedTemplates) | **GET** /api/v1/template/recommended | Get up to 4 recommended templates |
| [**getSavedZipStructureNames**](TemplateControllerApi.md#getSavedZipStructureNames) | **GET** /api/v1/template/{uuid}/zip-structure-titles | Get saved structure titles for zip archive |
| [**getShareCode**](TemplateControllerApi.md#getShareCode) | **GET** /api/v1/template/{uuid}/share-code | Retrieve share code for template |
| [**getTemplateByShareCode**](TemplateControllerApi.md#getTemplateByShareCode) | **GET** /api/v1/template/by-share-code/{code} | Retrieve template by share code |
| [**getTemplateByUuid**](TemplateControllerApi.md#getTemplateByUuid) | **GET** /api/v1/template/{uuid} | Retrieve template by UUID |
| [**getTemplateVersionsByUuid**](TemplateControllerApi.md#getTemplateVersionsByUuid) | **GET** /api/v1/template/{uuid}/versions | Retrieve template versions by UUID |
| [**getZipStructure**](TemplateControllerApi.md#getZipStructure) | **GET** /api/v1/template/{uuid}/zip-structure | Get structure with all files for zip archive |
| [**searchTemplates**](TemplateControllerApi.md#searchTemplates) | **GET** /api/v1/template | Get paged templates list |
| [**update**](TemplateControllerApi.md#update) | **PUT** /api/v1/template/{uuid} | Update template in DB. Category in template could be null. |
| [**updateCategories**](TemplateControllerApi.md#updateCategories) | **PATCH** /api/v1/template/{uuid}/categories | Update categories in template. |
| [**updateName**](TemplateControllerApi.md#updateName) | **PATCH** /api/v1/template/{uuid}/name | Update name in template. |
| [**uploadImage**](TemplateControllerApi.md#uploadImage) | **POST** /api/v1/template/image | Upload new image |
| [**uploadPdf**](TemplateControllerApi.md#uploadPdf) | **POST** /api/v1/template/pdf | Upload new PDF |
| [**validateTemplate**](TemplateControllerApi.md#validateTemplate) | **GET** /api/v1/template/validate | Validate template by UUID or version |


<a id="addZipStructure"></a>
# **addZipStructure**
> addZipStructure(uuid, mailbox, newTemplateZipStructureDTO, templateVersion)

Add new files structure for zip archive

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of template
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    NewTemplateZipStructureDTO newTemplateZipStructureDTO = new NewTemplateZipStructureDTO(); // NewTemplateZipStructureDTO | 
    UUID templateVersion = UUID.randomUUID(); // UUID | UUID of version
    try {
      apiInstance.addZipStructure(uuid, mailbox, newTemplateZipStructureDTO, templateVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#addZipStructure");
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
| **uuid** | **UUID**| UUID of template | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **newTemplateZipStructureDTO** | [**NewTemplateZipStructureDTO**](NewTemplateZipStructureDTO.md)|  | |
| **templateVersion** | **UUID**| UUID of version | [optional] |

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

<a id="archiveTemplate"></a>
# **archiveTemplate**
> archiveTemplate(uuid, mailbox)

Make template archived

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | Template UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.archiveTemplate(uuid, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#archiveTemplate");
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
| **uuid** | **UUID**| Template UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

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

<a id="checkTemplateExistsByUuid"></a>
# **checkTemplateExistsByUuid**
> checkTemplateExistsByUuid(uuid, mailbox)

Check template exists by UUID

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of template to retrieve
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.checkTemplateExistsByUuid(uuid, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#checkTemplateExistsByUuid");
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
| **uuid** | **UUID**| UUID of template to retrieve | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

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

<a id="clone"></a>
# **clone**
> FullTemplateResponseDTO clone(uuid, mailbox)

Clone template

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | Template UUID to clone
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      FullTemplateResponseDTO result = apiInstance.clone(uuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#clone");
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
| **uuid** | **UUID**| Template UUID to clone | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**FullTemplateResponseDTO**](FullTemplateResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="create1"></a>
# **create1**
> FullTemplateResponseDTO create1(mailbox, templateCreateDTO)

Create new template

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    TemplateCreateDTO templateCreateDTO = new TemplateCreateDTO(); // TemplateCreateDTO | 
    try {
      FullTemplateResponseDTO result = apiInstance.create1(mailbox, templateCreateDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#create1");
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
| **templateCreateDTO** | [**TemplateCreateDTO**](TemplateCreateDTO.md)|  | |

### Return type

[**FullTemplateResponseDTO**](FullTemplateResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteShareCode"></a>
# **deleteShareCode**
> deleteShareCode(uuid, mailbox)

Delete share code for template

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of template
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.deleteShareCode(uuid, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#deleteShareCode");
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
| **uuid** | **UUID**| UUID of template | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

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

<a id="deleteZipStructure"></a>
# **deleteZipStructure**
> deleteZipStructure(uuid, title, mailbox, templateVersion)

Delete structure for zip archive

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of template
    String title = "title_example"; // String | Title of zip structure
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UUID templateVersion = UUID.randomUUID(); // UUID | UUID of version
    try {
      apiInstance.deleteZipStructure(uuid, title, mailbox, templateVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#deleteZipStructure");
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
| **uuid** | **UUID**| UUID of template | |
| **title** | **String**| Title of zip structure | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **templateVersion** | **UUID**| UUID of version | [optional] |

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

<a id="downloadTemplateImage"></a>
# **downloadTemplateImage**
> byte[] downloadTemplateImage(uuid, imageUuid, envelopeUuid, mailbox)

Download template image

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | Template UUID
    UUID imageUuid = UUID.randomUUID(); // UUID | Image UUID
    UUID envelopeUuid = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      byte[] result = apiInstance.downloadTemplateImage(uuid, imageUuid, envelopeUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#downloadTemplateImage");
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
| **uuid** | **UUID**| Template UUID | |
| **imageUuid** | **UUID**| Image UUID | |
| **envelopeUuid** | **UUID**| Envelope UUID | [optional] |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | [optional] |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="downloadTemplatePdf"></a>
# **downloadTemplatePdf**
> byte[] downloadTemplatePdf(uuid, pdfUuid, envelopeUuid, clearFields, mailbox)

Download template PDF

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | Template UUID
    UUID pdfUuid = UUID.randomUUID(); // UUID | Pdf UUID
    UUID envelopeUuid = UUID.randomUUID(); // UUID | Envelope UUID
    Boolean clearFields = true; // Boolean | Clear non-readonly fields
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      byte[] result = apiInstance.downloadTemplatePdf(uuid, pdfUuid, envelopeUuid, clearFields, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#downloadTemplatePdf");
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
| **uuid** | **UUID**| Template UUID | |
| **pdfUuid** | **UUID**| Pdf UUID | |
| **envelopeUuid** | **UUID**| Envelope UUID | [optional] |
| **clearFields** | **Boolean**| Clear non-readonly fields | [optional] |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | [optional] |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPdfPageSizes"></a>
# **getPdfPageSizes**
> PdfPageSizes getPdfPageSizes(uuid, pdfUuid)

Get PDF page sizes

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | Template UUID
    UUID pdfUuid = UUID.randomUUID(); // UUID | Pdf UUID
    try {
      PdfPageSizes result = apiInstance.getPdfPageSizes(uuid, pdfUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#getPdfPageSizes");
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
| **uuid** | **UUID**| Template UUID | |
| **pdfUuid** | **UUID**| Pdf UUID | |

### Return type

[**PdfPageSizes**](PdfPageSizes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRecentlyUsedTemplates"></a>
# **getRecentlyUsedTemplates**
> List&lt;RecentlyUsedTemplateResponseDTO&gt; getRecentlyUsedTemplates(mailbox)

Get up to 10 recently used templates

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<RecentlyUsedTemplateResponseDTO> result = apiInstance.getRecentlyUsedTemplates(mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#getRecentlyUsedTemplates");
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

[**List&lt;RecentlyUsedTemplateResponseDTO&gt;**](RecentlyUsedTemplateResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRecommendedTemplates"></a>
# **getRecommendedTemplates**
> List&lt;RecommendedTemplateResponseDTO&gt; getRecommendedTemplates(mailbox)

Get up to 4 recommended templates

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<RecommendedTemplateResponseDTO> result = apiInstance.getRecommendedTemplates(mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#getRecommendedTemplates");
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

[**List&lt;RecommendedTemplateResponseDTO&gt;**](RecommendedTemplateResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSavedZipStructureNames"></a>
# **getSavedZipStructureNames**
> TemplateZipStructureTitlesDTO getSavedZipStructureNames(uuid, mailbox, templateVersion)

Get saved structure titles for zip archive

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of template
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UUID templateVersion = UUID.randomUUID(); // UUID | UUID of version
    try {
      TemplateZipStructureTitlesDTO result = apiInstance.getSavedZipStructureNames(uuid, mailbox, templateVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#getSavedZipStructureNames");
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
| **uuid** | **UUID**| UUID of template | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **templateVersion** | **UUID**| UUID of version | [optional] |

### Return type

[**TemplateZipStructureTitlesDTO**](TemplateZipStructureTitlesDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getShareCode"></a>
# **getShareCode**
> SharedCodeDTO getShareCode(uuid, mailbox, generate)

Retrieve share code for template

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of template
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Boolean generate = true; // Boolean | Code has to be re-generated if exists
    try {
      SharedCodeDTO result = apiInstance.getShareCode(uuid, mailbox, generate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#getShareCode");
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
| **uuid** | **UUID**| UUID of template | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **generate** | **Boolean**| Code has to be re-generated if exists | [optional] |

### Return type

[**SharedCodeDTO**](SharedCodeDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTemplateByShareCode"></a>
# **getTemplateByShareCode**
> FullTemplateResponseDTO getTemplateByShareCode(code)

Retrieve template by share code

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    String code = "code_example"; // String | Share code of template
    try {
      FullTemplateResponseDTO result = apiInstance.getTemplateByShareCode(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#getTemplateByShareCode");
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
| **code** | **String**| Share code of template | |

### Return type

[**FullTemplateResponseDTO**](FullTemplateResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTemplateByUuid"></a>
# **getTemplateByUuid**
> FullTemplateResponseDTO getTemplateByUuid(uuid, mailbox, templateVersion)

Retrieve template by UUID

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of template to retrieve
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UUID templateVersion = UUID.randomUUID(); // UUID | UUID of version
    try {
      FullTemplateResponseDTO result = apiInstance.getTemplateByUuid(uuid, mailbox, templateVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#getTemplateByUuid");
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
| **uuid** | **UUID**| UUID of template to retrieve | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **templateVersion** | **UUID**| UUID of version | [optional] |

### Return type

[**FullTemplateResponseDTO**](FullTemplateResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTemplateVersionsByUuid"></a>
# **getTemplateVersionsByUuid**
> PageDTODataMap getTemplateVersionsByUuid(uuid, mailbox, offset, limit, versionUuid)

Retrieve template versions by UUID

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of template
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Integer offset = 0; // Integer | Offset records
    Integer limit = 25; // Integer | Limit records, max is 1000
    UUID versionUuid = UUID.randomUUID(); // UUID | UUID of version, only this one will be returned
    try {
      PageDTODataMap result = apiInstance.getTemplateVersionsByUuid(uuid, mailbox, offset, limit, versionUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#getTemplateVersionsByUuid");
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
| **uuid** | **UUID**| UUID of template | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **offset** | **Integer**| Offset records | [optional] [default to 0] |
| **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25] |
| **versionUuid** | **UUID**| UUID of version, only this one will be returned | [optional] |

### Return type

[**PageDTODataMap**](PageDTODataMap.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getZipStructure"></a>
# **getZipStructure**
> TemplateZipStructureDTO getZipStructure(uuid, mailbox, templateVersion, title)

Get structure with all files for zip archive

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of template
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UUID templateVersion = UUID.randomUUID(); // UUID | UUID of version
    String title = "title_example"; // String | Title of zip structure (to mark files as selected)
    try {
      TemplateZipStructureDTO result = apiInstance.getZipStructure(uuid, mailbox, templateVersion, title);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#getZipStructure");
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
| **uuid** | **UUID**| UUID of template | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **templateVersion** | **UUID**| UUID of version | [optional] |
| **title** | **String**| Title of zip structure (to mark files as selected) | [optional] |

### Return type

[**TemplateZipStructureDTO**](TemplateZipStructureDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="searchTemplates"></a>
# **searchTemplates**
> PageDTOSearchTemplateDTO searchTemplates(mailbox, level, keyword, category, extended, offset, limit)

Get paged templates list

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    String level = "mailbox"; // String | Template access level, 'pub' by default.
    String keyword = "keyword_example"; // String | Keyword to search template by or template UUID
    UUID category = UUID.randomUUID(); // UUID | Category id to search template in
    Boolean extended = false; // Boolean | Add extended info to each template (access, account, categories)
    Integer offset = 0; // Integer | Offset records
    Integer limit = 25; // Integer | Limit records, max is 1000
    try {
      PageDTOSearchTemplateDTO result = apiInstance.searchTemplates(mailbox, level, keyword, category, extended, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#searchTemplates");
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
| **level** | **String**| Template access level, &#39;pub&#39; by default. | [optional] [default to pub] [enum: mailbox, account, pub, official, shared] |
| **keyword** | **String**| Keyword to search template by or template UUID | [optional] |
| **category** | **UUID**| Category id to search template in | [optional] |
| **extended** | **Boolean**| Add extended info to each template (access, account, categories) | [optional] [default to false] |
| **offset** | **Integer**| Offset records | [optional] [default to 0] |
| **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25] |

### Return type

[**PageDTOSearchTemplateDTO**](PageDTOSearchTemplateDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="update"></a>
# **update**
> FullTemplateResponseDTO update(uuid, mailbox, templateCreateDTO)

Update template in DB. Category in template could be null.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | Template uuid
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    TemplateCreateDTO templateCreateDTO = new TemplateCreateDTO(); // TemplateCreateDTO | 
    try {
      FullTemplateResponseDTO result = apiInstance.update(uuid, mailbox, templateCreateDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#update");
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
| **uuid** | **UUID**| Template uuid | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **templateCreateDTO** | [**TemplateCreateDTO**](TemplateCreateDTO.md)|  | |

### Return type

[**FullTemplateResponseDTO**](FullTemplateResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateCategories"></a>
# **updateCategories**
> updateCategories(uuid, mailbox, UUID)

Update categories in template.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | Template UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    try {
      apiInstance.updateCategories(uuid, mailbox, UUID);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#updateCategories");
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
| **uuid** | **UUID**| Template UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  | |

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

<a id="updateName"></a>
# **updateName**
> updateName(uuid, mailbox, body)

Update name in template.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | Template UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    String body = "body_example"; // String | 
    try {
      apiInstance.updateName(uuid, mailbox, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#updateName");
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
| **uuid** | **UUID**| Template UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **body** | **String**|  | |

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

<a id="uploadImage"></a>
# **uploadImage**
> UploadedImageDTO uploadImage(mailbox, _file)

Upload new image

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    File _file = new File("/path/to/file"); // File | 
    try {
      UploadedImageDTO result = apiInstance.uploadImage(mailbox, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#uploadImage");
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
| **_file** | **File**|  | |

### Return type

[**UploadedImageDTO**](UploadedImageDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="uploadPdf"></a>
# **uploadPdf**
> UploadedPdfDTO uploadPdf(mailbox, _file, action, clearFields)

Upload new PDF

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    File _file = new File("/path/to/file"); // File | 
    String action = "PARSE"; // String | Action for fields inside the PDF file
    Boolean clearFields = true; // Boolean | Clear non-readonly fields in response PDF (only for PARSE action)
    try {
      UploadedPdfDTO result = apiInstance.uploadPdf(mailbox, _file, action, clearFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#uploadPdf");
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
| **_file** | **File**|  | |
| **action** | **String**| Action for fields inside the PDF file | [optional] [enum: PARSE, DELETE, KEEP, PARSE_SAFE, KEEP_SAFE] |
| **clearFields** | **Boolean**| Clear non-readonly fields in response PDF (only for PARSE action) | [optional] |

### Return type

[**UploadedPdfDTO**](UploadedPdfDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="validateTemplate"></a>
# **validateTemplate**
> TemplateValidateResponseDTO validateTemplate(mailbox, templateUuid, versionUuid)

Validate template by UUID or version

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.TemplateControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TemplateControllerApi apiInstance = new TemplateControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UUID templateUuid = UUID.randomUUID(); // UUID | UUID of template
    UUID versionUuid = UUID.randomUUID(); // UUID | Version of template
    try {
      TemplateValidateResponseDTO result = apiInstance.validateTemplate(mailbox, templateUuid, versionUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateControllerApi#validateTemplate");
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
| **templateUuid** | **UUID**| UUID of template | [optional] |
| **versionUuid** | **UUID**| Version of template | [optional] |

### Return type

[**TemplateValidateResponseDTO**](TemplateValidateResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

