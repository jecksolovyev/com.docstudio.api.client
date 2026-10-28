# FormControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveFormEnvelope**](FormControllerApi.md#approveFormEnvelope) | **POST** /api/v1/form/envelope/approve | Approve form envelope |
| [**createNewForm**](FormControllerApi.md#createNewForm) | **POST** /api/v1/form | Create new form |
| [**deleteForm**](FormControllerApi.md#deleteForm) | **DELETE** /api/v1/form/{id} | Delete form |
| [**fillFormEnvelope**](FormControllerApi.md#fillFormEnvelope) | **POST** /api/v1/form/envelope/fill | Fill form envelope |
| [**forSignFile**](FormControllerApi.md#forSignFile) | **GET** /api/v1/form/for-sign-file | Get BINARY or XML for signing |
| [**getForm**](FormControllerApi.md#getForm) | **GET** /api/v1/form/{id} | Get form |
| [**getFormDocumentPrintVersion**](FormControllerApi.md#getFormDocumentPrintVersion) | **GET** /api/v1/form/envelope/for-print | Get document PDF for printing |
| [**getFormDocumentsForSign**](FormControllerApi.md#getFormDocumentsForSign) | **POST** /api/v1/form/for-sign | BINARYs and XMLs for signing |
| [**getFormView**](FormControllerApi.md#getFormView) | **GET** /api/v1/form/view | Get form view |
| [**rejectFormEnvelope**](FormControllerApi.md#rejectFormEnvelope) | **DELETE** /api/v1/form/envelope | Reject form envelope |
| [**sendFormEnvelope**](FormControllerApi.md#sendFormEnvelope) | **POST** /api/v1/form/envelope/send | Create form envelope / form fill first step |
| [**signFormEnvelope**](FormControllerApi.md#signFormEnvelope) | **PUT** /api/v1/form/envelope/sign | Sign form envelope documents |
| [**updateForm**](FormControllerApi.md#updateForm) | **PUT** /api/v1/form/{id} | Update form |


<a id="approveFormEnvelope"></a>
# **approveFormEnvelope**
> FormSend approveFormEnvelope(envelopeId)

Approve form envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FormControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    FormControllerApi apiInstance = new FormControllerApi(defaultClient);
    UUID envelopeId = UUID.randomUUID(); // UUID | Envelope to approve
    try {
      FormSend result = apiInstance.approveFormEnvelope(envelopeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormControllerApi#approveFormEnvelope");
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
| **envelopeId** | **UUID**| Envelope to approve | [optional] |

### Return type

[**FormSend**](FormSend.md)

### Authorization

[formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createNewForm"></a>
# **createNewForm**
> FormGet createNewForm(mailbox, formCreate)

Create new form

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FormControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FormControllerApi apiInstance = new FormControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    FormCreate formCreate = new FormCreate(); // FormCreate | 
    try {
      FormGet result = apiInstance.createNewForm(mailbox, formCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormControllerApi#createNewForm");
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
| **formCreate** | [**FormCreate**](FormCreate.md)|  | |

### Return type

[**FormGet**](FormGet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteForm"></a>
# **deleteForm**
> deleteForm(id, mailbox)

Delete form

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FormControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FormControllerApi apiInstance = new FormControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Form UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.deleteForm(id, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormControllerApi#deleteForm");
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
| **id** | **UUID**| Form UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

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

<a id="fillFormEnvelope"></a>
# **fillFormEnvelope**
> FormSend fillFormEnvelope(sendEnvelope)

Fill form envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FormControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    FormControllerApi apiInstance = new FormControllerApi(defaultClient);
    SendEnvelope sendEnvelope = new SendEnvelope(); // SendEnvelope | 
    try {
      FormSend result = apiInstance.fillFormEnvelope(sendEnvelope);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormControllerApi#fillFormEnvelope");
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
| **sendEnvelope** | [**SendEnvelope**](SendEnvelope.md)|  | |

### Return type

[**FormSend**](FormSend.md)

### Authorization

[formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="forSignFile"></a>
# **forSignFile**
> File forSignFile(documentId, envelopeId, xml)

Get BINARY or XML for signing

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FormControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    FormControllerApi apiInstance = new FormControllerApi(defaultClient);
    String documentId = "documentId_example"; // String | Document ID
    UUID envelopeId = UUID.randomUUID(); // UUID | Envelope to sign
    Boolean xml = true; // Boolean | Is XML?
    try {
      File result = apiInstance.forSignFile(documentId, envelopeId, xml);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormControllerApi#forSignFile");
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
| **documentId** | **String**| Document ID | |
| **envelopeId** | **UUID**| Envelope to sign | [optional] |
| **xml** | **Boolean**| Is XML? | [optional] |

### Return type

[**File**](File.md)

### Authorization

[formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getForm"></a>
# **getForm**
> FormGet getForm(id, mailbox)

Get form

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FormControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FormControllerApi apiInstance = new FormControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Form UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      FormGet result = apiInstance.getForm(id, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormControllerApi#getForm");
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
| **id** | **UUID**| Form UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**FormGet**](FormGet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFormDocumentPrintVersion"></a>
# **getFormDocumentPrintVersion**
> File getFormDocumentPrintVersion(envelopeId, documentId, attachmentId, wait)

Get document PDF for printing

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FormControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    FormControllerApi apiInstance = new FormControllerApi(defaultClient);
    UUID envelopeId = UUID.randomUUID(); // UUID | Envelope UUID
    String documentId = "documentId_example"; // String | Document id
    UUID attachmentId = UUID.randomUUID(); // UUID | Document id
    Boolean wait = true; // Boolean | Wait for a file instead of 425 error
    try {
      File result = apiInstance.getFormDocumentPrintVersion(envelopeId, documentId, attachmentId, wait);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormControllerApi#getFormDocumentPrintVersion");
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
| **envelopeId** | **UUID**| Envelope UUID | [optional] |
| **documentId** | **String**| Document id | [optional] |
| **attachmentId** | **UUID**| Document id | [optional] |
| **wait** | **Boolean**| Wait for a file instead of 425 error | [optional] |

### Return type

[**File**](File.md)

### Authorization

[formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFormDocumentsForSign"></a>
# **getFormDocumentsForSign**
> FormDocumentsForSign getFormDocumentsForSign(documentsForSignRequestDTO, envelopeId, forceGost)

BINARYs and XMLs for signing

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FormControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    FormControllerApi apiInstance = new FormControllerApi(defaultClient);
    DocumentsForSignRequestDTO documentsForSignRequestDTO = new DocumentsForSignRequestDTO(); // DocumentsForSignRequestDTO | 
    UUID envelopeId = UUID.randomUUID(); // UUID | Envelope to sign
    Boolean forceGost = true; // Boolean | 
    try {
      FormDocumentsForSign result = apiInstance.getFormDocumentsForSign(documentsForSignRequestDTO, envelopeId, forceGost);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormControllerApi#getFormDocumentsForSign");
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
| **documentsForSignRequestDTO** | [**DocumentsForSignRequestDTO**](DocumentsForSignRequestDTO.md)|  | |
| **envelopeId** | **UUID**| Envelope to sign | [optional] |
| **forceGost** | **Boolean**|  | [optional] |

### Return type

[**FormDocumentsForSign**](FormDocumentsForSign.md)

### Authorization

[formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFormView"></a>
# **getFormView**
> FormView getFormView()

Get form view

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FormControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    FormControllerApi apiInstance = new FormControllerApi(defaultClient);
    try {
      FormView result = apiInstance.getFormView();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormControllerApi#getFormView");
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

[**FormView**](FormView.md)

### Authorization

[formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="rejectFormEnvelope"></a>
# **rejectFormEnvelope**
> FormSend rejectFormEnvelope(formEnvelopeReject)

Reject form envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FormControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    FormControllerApi apiInstance = new FormControllerApi(defaultClient);
    FormEnvelopeReject formEnvelopeReject = new FormEnvelopeReject(); // FormEnvelopeReject | 
    try {
      FormSend result = apiInstance.rejectFormEnvelope(formEnvelopeReject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormControllerApi#rejectFormEnvelope");
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
| **formEnvelopeReject** | [**FormEnvelopeReject**](FormEnvelopeReject.md)|  | |

### Return type

[**FormSend**](FormSend.md)

### Authorization

[formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="sendFormEnvelope"></a>
# **sendFormEnvelope**
> FormSend sendFormEnvelope(sendEnvelope)

Create form envelope / form fill first step

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FormControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    FormControllerApi apiInstance = new FormControllerApi(defaultClient);
    SendEnvelope sendEnvelope = new SendEnvelope(); // SendEnvelope | 
    try {
      FormSend result = apiInstance.sendFormEnvelope(sendEnvelope);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormControllerApi#sendFormEnvelope");
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
| **sendEnvelope** | [**SendEnvelope**](SendEnvelope.md)|  | |

### Return type

[**FormSend**](FormSend.md)

### Authorization

[formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="signFormEnvelope"></a>
# **signFormEnvelope**
> FormSend signFormEnvelope(envelopeId, envelopeDocumentSignaturesDTO)

Sign form envelope documents

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FormControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    FormControllerApi apiInstance = new FormControllerApi(defaultClient);
    UUID envelopeId = UUID.randomUUID(); // UUID | Envelope to sign
    List<EnvelopeDocumentSignaturesDTO> envelopeDocumentSignaturesDTO = Arrays.asList(); // List<EnvelopeDocumentSignaturesDTO> | 
    try {
      FormSend result = apiInstance.signFormEnvelope(envelopeId, envelopeDocumentSignaturesDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormControllerApi#signFormEnvelope");
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
| **envelopeId** | **UUID**| Envelope to sign | |
| **envelopeDocumentSignaturesDTO** | [**List&lt;EnvelopeDocumentSignaturesDTO&gt;**](EnvelopeDocumentSignaturesDTO.md)|  | |

### Return type

[**FormSend**](FormSend.md)

### Authorization

[formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateForm"></a>
# **updateForm**
> FormGet updateForm(id, mailbox, formUpdate)

Update form

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.FormControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FormControllerApi apiInstance = new FormControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Form UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    FormUpdate formUpdate = new FormUpdate(); // FormUpdate | 
    try {
      FormGet result = apiInstance.updateForm(id, mailbox, formUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormControllerApi#updateForm");
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
| **id** | **UUID**| Form UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **formUpdate** | [**FormUpdate**](FormUpdate.md)|  | |

### Return type

[**FormGet**](FormGet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

