# TemplateControllerApi

All URIs are relative to *https://api.docstudio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveTemplate**](TemplateControllerApi.md#archiveTemplate) | **PATCH** /api/v1/template/{uuid}/archive | Make template archived
[**checkTemplateExistsByUuid**](TemplateControllerApi.md#checkTemplateExistsByUuid) | **HEAD** /api/v1/template/{uuid} | Check template exists by UUID
[**clone**](TemplateControllerApi.md#clone) | **POST** /api/v1/template/{uuid}/clone | Clone template
[**create**](TemplateControllerApi.md#create) | **POST** /api/v1/template | Create new template
[**deleteShareCode**](TemplateControllerApi.md#deleteShareCode) | **DELETE** /api/v1/template/{uuid}/share-code | Delete share code for template
[**downloadTemplateImage**](TemplateControllerApi.md#downloadTemplateImage) | **GET** /api/v1/template/{uuid}/image | Download template image
[**downloadTemplatePdf**](TemplateControllerApi.md#downloadTemplatePdf) | **GET** /api/v1/template/{uuid}/pdf | Download template PDF
[**getRecentlyUsedTemplates**](TemplateControllerApi.md#getRecentlyUsedTemplates) | **GET** /api/v1/template/recently-used | Get up to 10 recently used templates
[**getRecommendedTemplates**](TemplateControllerApi.md#getRecommendedTemplates) | **GET** /api/v1/template/recommended | Get up to 4 recommended templates
[**getShareCode**](TemplateControllerApi.md#getShareCode) | **GET** /api/v1/template/{uuid}/share-code | Retrieve share code for template
[**getTemplateByShareCode**](TemplateControllerApi.md#getTemplateByShareCode) | **GET** /api/v1/template/by-share-code/{code} | Retrieve template by share code
[**getTemplateByUuid**](TemplateControllerApi.md#getTemplateByUuid) | **GET** /api/v1/template/{uuid} | Retrieve template by UUID
[**getTemplateVersionsByUuid**](TemplateControllerApi.md#getTemplateVersionsByUuid) | **GET** /api/v1/template/{uuid}/versions | Retrieve template versions by UUID
[**searchTemplates**](TemplateControllerApi.md#searchTemplates) | **GET** /api/v1/template | Get paged templates list
[**update**](TemplateControllerApi.md#update) | **PUT** /api/v1/template/{uuid} | Update template in DB. Category in template could be null.
[**updateCategories**](TemplateControllerApi.md#updateCategories) | **PATCH** /api/v1/template/{uuid}/categories | Update categories in template.
[**updateName**](TemplateControllerApi.md#updateName) | **PATCH** /api/v1/template/{uuid}/name | Update name in template.
[**uploadImage**](TemplateControllerApi.md#uploadImage) | **POST** /api/v1/template/image | Upload new image
[**uploadPdf**](TemplateControllerApi.md#uploadPdf) | **POST** /api/v1/template/pdf | Upload new PDF
[**validateTemplate**](TemplateControllerApi.md#validateTemplate) | **GET** /api/v1/template/validate | Validate template by UUID or version

<a name="archiveTemplate"></a>
# **archiveTemplate**
> archiveTemplate(uuid, mailbox)

Make template archived

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
UUID uuid = new UUID(); // UUID | Template UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.archiveTemplate(uuid, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#archiveTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| Template UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="checkTemplateExistsByUuid"></a>
# **checkTemplateExistsByUuid**
> checkTemplateExistsByUuid(uuid, mailbox)

Check template exists by UUID

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
UUID uuid = new UUID(); // UUID | UUID of template to retrieve
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.checkTemplateExistsByUuid(uuid, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#checkTemplateExistsByUuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| UUID of template to retrieve |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="clone"></a>
# **clone**
> FullTemplateResponseDTO clone(uuid, mailbox)

Clone template

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
UUID uuid = new UUID(); // UUID | Template UUID to clone
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    FullTemplateResponseDTO result = apiInstance.clone(uuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#clone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| Template UUID to clone |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**FullTemplateResponseDTO**](FullTemplateResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="create"></a>
# **create**
> FullTemplateResponseDTO create(body, mailbox)

Create new template

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
TemplateCreateDTO body = new TemplateCreateDTO(); // TemplateCreateDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    FullTemplateResponseDTO result = apiInstance.create(body, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TemplateCreateDTO**](TemplateCreateDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**FullTemplateResponseDTO**](FullTemplateResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteShareCode"></a>
# **deleteShareCode**
> deleteShareCode(uuid, mailbox)

Delete share code for template

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
UUID uuid = new UUID(); // UUID | UUID of template
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.deleteShareCode(uuid, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#deleteShareCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| UUID of template |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadTemplateImage"></a>
# **downloadTemplateImage**
> List&lt;byte[]&gt; downloadTemplateImage(uuid, imageUuid, mailbox, envelopeUuid)

Download template image

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
UUID uuid = new UUID(); // UUID | Template UUID
UUID imageUuid = new UUID(); // UUID | Image UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
try {
    List<byte[]> result = apiInstance.downloadTemplateImage(uuid, imageUuid, mailbox, envelopeUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#downloadTemplateImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| Template UUID |
 **imageUuid** | [**UUID**](.md)| Image UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID | [optional]

### Return type

**List&lt;byte[]&gt;**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="downloadTemplatePdf"></a>
# **downloadTemplatePdf**
> List&lt;byte[]&gt; downloadTemplatePdf(uuid, pdfUuid, mailbox, envelopeUuid)

Download template PDF

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
UUID uuid = new UUID(); // UUID | Template UUID
UUID pdfUuid = new UUID(); // UUID | Pdf UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
try {
    List<byte[]> result = apiInstance.downloadTemplatePdf(uuid, pdfUuid, mailbox, envelopeUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#downloadTemplatePdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| Template UUID |
 **pdfUuid** | [**UUID**](.md)| Pdf UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID | [optional]

### Return type

**List&lt;byte[]&gt;**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRecentlyUsedTemplates"></a>
# **getRecentlyUsedTemplates**
> List&lt;RecentlyUsedTemplateResponseDTO&gt; getRecentlyUsedTemplates(mailbox)

Get up to 10 recently used templates

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<RecentlyUsedTemplateResponseDTO> result = apiInstance.getRecentlyUsedTemplates(mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#getRecentlyUsedTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;RecentlyUsedTemplateResponseDTO&gt;**](RecentlyUsedTemplateResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecommendedTemplates"></a>
# **getRecommendedTemplates**
> List&lt;RecommendedTemplateResponseDTO&gt; getRecommendedTemplates()

Get up to 4 recommended templates

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
try {
    List<RecommendedTemplateResponseDTO> result = apiInstance.getRecommendedTemplates();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#getRecommendedTemplates");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;RecommendedTemplateResponseDTO&gt;**](RecommendedTemplateResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getShareCode"></a>
# **getShareCode**
> SharedCodeDTO getShareCode(uuid, mailbox, generate)

Retrieve share code for template

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
UUID uuid = new UUID(); // UUID | UUID of template
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
Boolean generate = true; // Boolean | Code has to be re-generated if exists
try {
    SharedCodeDTO result = apiInstance.getShareCode(uuid, mailbox, generate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#getShareCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| UUID of template |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **generate** | **Boolean**| Code has to be re-generated if exists | [optional]

### Return type

[**SharedCodeDTO**](SharedCodeDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTemplateByShareCode"></a>
# **getTemplateByShareCode**
> FullTemplateResponseDTO getTemplateByShareCode(code)

Retrieve template by share code

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
String code = "code_example"; // String | Share code of template
try {
    FullTemplateResponseDTO result = apiInstance.getTemplateByShareCode(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#getTemplateByShareCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Share code of template |

### Return type

[**FullTemplateResponseDTO**](FullTemplateResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTemplateByUuid"></a>
# **getTemplateByUuid**
> FullTemplateResponseDTO getTemplateByUuid(uuid, mailbox, templateVersion)

Retrieve template by UUID

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
UUID uuid = new UUID(); // UUID | UUID of template to retrieve
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID templateVersion = new UUID(); // UUID | UUID of version
try {
    FullTemplateResponseDTO result = apiInstance.getTemplateByUuid(uuid, mailbox, templateVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#getTemplateByUuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| UUID of template to retrieve |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **templateVersion** | [**UUID**](.md)| UUID of version | [optional]

### Return type

[**FullTemplateResponseDTO**](FullTemplateResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTemplateVersionsByUuid"></a>
# **getTemplateVersionsByUuid**
> PageDTODataMap getTemplateVersionsByUuid(uuid, mailbox, offset, limit, versionUuid)

Retrieve template versions by UUID

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
UUID uuid = new UUID(); // UUID | UUID of template
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
Integer offset = 0; // Integer | Offset records
Integer limit = 25; // Integer | Limit records, max is 1000
UUID versionUuid = new UUID(); // UUID | UUID of version, only this one will be returned
try {
    PageDTODataMap result = apiInstance.getTemplateVersionsByUuid(uuid, mailbox, offset, limit, versionUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#getTemplateVersionsByUuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| UUID of template |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **offset** | **Integer**| Offset records | [optional] [default to 0]
 **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25]
 **versionUuid** | [**UUID**](.md)| UUID of version, only this one will be returned | [optional]

### Return type

[**PageDTODataMap**](PageDTODataMap.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchTemplates"></a>
# **searchTemplates**
> PageDTOSearchTemplateDTO searchTemplates(mailbox, level, keyword, category, extended, offset, limit)

Get paged templates list

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
String level = "pub"; // String | Template access level, 'pub' by default.
String keyword = "keyword_example"; // String | Keyword to search template by or template UUID
Long category = 789L; // Long | Category id to search template in
Boolean extended = false; // Boolean | Add extended info to each template (access, account, categories)
Integer offset = 0; // Integer | Offset records
Integer limit = 25; // Integer | Limit records, max is 1000
try {
    PageDTOSearchTemplateDTO result = apiInstance.searchTemplates(mailbox, level, keyword, category, extended, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#searchTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **level** | **String**| Template access level, &#x27;pub&#x27; by default. | [optional] [default to pub] [enum: mailbox, account, pub, official, shared]
 **keyword** | **String**| Keyword to search template by or template UUID | [optional]
 **category** | **Long**| Category id to search template in | [optional]
 **extended** | **Boolean**| Add extended info to each template (access, account, categories) | [optional] [default to false]
 **offset** | **Integer**| Offset records | [optional] [default to 0]
 **limit** | **Integer**| Limit records, max is 1000 | [optional] [default to 25]

### Return type

[**PageDTOSearchTemplateDTO**](PageDTOSearchTemplateDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update"></a>
# **update**
> FullTemplateResponseDTO update(body, mailbox, uuid)

Update template in DB. Category in template could be null.

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
TemplateCreateDTO body = new TemplateCreateDTO(); // TemplateCreateDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID uuid = new UUID(); // UUID | Template uuid
try {
    FullTemplateResponseDTO result = apiInstance.update(body, mailbox, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TemplateCreateDTO**](TemplateCreateDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **uuid** | [**UUID**](.md)| Template uuid |

### Return type

[**FullTemplateResponseDTO**](FullTemplateResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCategories"></a>
# **updateCategories**
> updateCategories(body, mailbox, uuid)

Update categories in template.

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
List<Long> body = Arrays.asList(56L); // List<Long> | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID uuid = new UUID(); // UUID | Template UUID
try {
    apiInstance.updateCategories(body, mailbox, uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#updateCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Long&gt;**](Long.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **uuid** | [**UUID**](.md)| Template UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateName"></a>
# **updateName**
> updateName(body, mailbox, uuid)

Update name in template.

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
String body = "body_example"; // String | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID uuid = new UUID(); // UUID | Template UUID
try {
    apiInstance.updateName(body, mailbox, uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#updateName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **uuid** | [**UUID**](.md)| Template UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="uploadImage"></a>
# **uploadImage**
> UploadedImageDTO uploadImage(mailbox, file)

Upload new image

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
File file = new File("file_example"); // File | 
try {
    UploadedImageDTO result = apiInstance.uploadImage(mailbox, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#uploadImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **file** | **File**|  | [optional]

### Return type

[**UploadedImageDTO**](UploadedImageDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="uploadPdf"></a>
# **uploadPdf**
> UploadedPdfDTO uploadPdf(mailbox, file)

Upload new PDF

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
File file = new File("file_example"); // File | 
try {
    UploadedPdfDTO result = apiInstance.uploadPdf(mailbox, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#uploadPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **file** | **File**|  | [optional]

### Return type

[**UploadedPdfDTO**](UploadedPdfDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="validateTemplate"></a>
# **validateTemplate**
> TemplateValidateResponseDTO validateTemplate(mailbox, templateUuid, versionUuid)

Validate template by UUID or version

### Example
```java
// Import classes:
//import com.docstudio.client.ApiClient;
//import com.docstudio.client.ApiException;
//import com.docstudio.client.Configuration;
//import com.docstudio.client.auth.*;
//import api.com.docstudio.client.TemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TemplateControllerApi apiInstance = new TemplateControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID templateUuid = new UUID(); // UUID | UUID of template
UUID versionUuid = new UUID(); // UUID | Version of template
try {
    TemplateValidateResponseDTO result = apiInstance.validateTemplate(mailbox, templateUuid, versionUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateControllerApi#validateTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **templateUuid** | [**UUID**](.md)| UUID of template | [optional]
 **versionUuid** | [**UUID**](.md)| Version of template | [optional]

### Return type

[**TemplateValidateResponseDTO**](TemplateValidateResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

