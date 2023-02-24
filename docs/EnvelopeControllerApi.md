# EnvelopeControllerApi

All URIs are relative to *https://api.centredo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptUserPendingInvitations**](EnvelopeControllerApi.md#acceptUserPendingInvitations) | **POST** /api/v1/envelope/invitations | Accept user&#x27;s pending invitations
[**addEnvelopesIntoChain**](EnvelopeControllerApi.md#addEnvelopesIntoChain) | **PUT** /api/v1/envelope/chain/{chainUuid} | Add envelopes into chain
[**archive**](EnvelopeControllerApi.md#archive) | **PATCH** /api/v1/envelope/archive/{flag} | Archive envelopes
[**cancelApprovalFlow**](EnvelopeControllerApi.md#cancelApprovalFlow) | **DELETE** /api/v1/envelope/{envelopeUuid}/approval/{flowUuid} | Cancel envelope approval
[**cancelEnvelopeDelegation**](EnvelopeControllerApi.md#cancelEnvelopeDelegation) | **DELETE** /api/v1/envelope/delegate | Cancel envelope delegation
[**cancelEnvelopes**](EnvelopeControllerApi.md#cancelEnvelopes) | **DELETE** /api/v1/envelope/cancel | Cancel envelopes
[**check**](EnvelopeControllerApi.md#check) | **POST** /api/v1/envelope/check | Check an envelope
[**checkUserHasInvitations**](EnvelopeControllerApi.md#checkUserHasInvitations) | **HEAD** /api/v1/envelope/invitations | Check user has pending invitations
[**cloneAttachment**](EnvelopeControllerApi.md#cloneAttachment) | **POST** /api/v1/envelope/clone-attachment | Clone an existing attachment
[**confirmInvite**](EnvelopeControllerApi.md#confirmInvite) | **POST** /api/v1/envelope/confirm-invite | Accept/confirm invitations
[**continueScenarioStep**](EnvelopeControllerApi.md#continueScenarioStep) | **POST** /api/v1/envelope/{envelopeUuid}/scenario/{stepId} | Continue scenario flow with step
[**convertAttachmentToPdf**](EnvelopeControllerApi.md#convertAttachmentToPdf) | **GET** /api/v1/envelope/attachment-as-pdf/{attachmentUuid} | Convert attachment to PDF
[**createAttachment**](EnvelopeControllerApi.md#createAttachment) | **POST** /api/v1/envelope/attachment | Create/upload new attachment
[**createEnvelope**](EnvelopeControllerApi.md#createEnvelope) | **POST** /api/v1/envelope | Create draft envelope
[**createEnvelopeComment**](EnvelopeControllerApi.md#createEnvelopeComment) | **POST** /api/v1/envelope/{envelopeUuid}/comment | Create envelope comment thread
[**delegateEnvelopes**](EnvelopeControllerApi.md#delegateEnvelopes) | **POST** /api/v1/envelope/delegate | Delegate envelopes
[**deleteDrafts**](EnvelopeControllerApi.md#deleteDrafts) | **DELETE** /api/v1/envelope | Delete draft envelopes
[**deleteEnvelopeComment**](EnvelopeControllerApi.md#deleteEnvelopeComment) | **DELETE** /api/v1/envelope/{envelopeUuid}/comment | Delete envelope comment in thread or the whole thread
[**downloadEnvelopeAttachment**](EnvelopeControllerApi.md#downloadEnvelopeAttachment) | **GET** /api/v1/envelope/{envelopeUuid}/attachment | Download envelope attachment
[**envelopeApproval**](EnvelopeControllerApi.md#envelopeApproval) | **PUT** /api/v1/envelope/{envelopeUuid}/approval/{flowUuid} | Approve or Reject envelope
[**envelopeApprovalHistory**](EnvelopeControllerApi.md#envelopeApprovalHistory) | **GET** /api/v1/envelope/{envelopeUuid}/approval-history | Get approval history
[**fill**](EnvelopeControllerApi.md#fill) | **PUT** /api/v1/envelope/fill | Fill envelope
[**getActiveRoles**](EnvelopeControllerApi.md#getActiveRoles) | **GET** /api/v1/envelope/{uuid}/activeRoles | Get active roles by Envelope UUID
[**getApprovalFlow**](EnvelopeControllerApi.md#getApprovalFlow) | **GET** /api/v1/envelope/{envelopeUuid}/approval/{flowUuid} | Get envelope approval
[**getChainEnvelopes**](EnvelopeControllerApi.md#getChainEnvelopes) | **GET** /api/v1/envelope/chain/{chainUuid} | Get chain envelopes list
[**getDocumentPrintVersion**](EnvelopeControllerApi.md#getDocumentPrintVersion) | **GET** /api/v1/envelope/{envelopeUuid}/for-print | Get document PDF for printing
[**getDocumentsForSign**](EnvelopeControllerApi.md#getDocumentsForSign) | **POST** /api/v1/envelope/{envelopeUuid}/for-sign | PDFs and XMLs for signing
[**getEnvelopeByUuid**](EnvelopeControllerApi.md#getEnvelopeByUuid) | **GET** /api/v1/envelope/{uuid} | Retrieve envelope by UUID
[**getEnvelopeComments**](EnvelopeControllerApi.md#getEnvelopeComments) | **GET** /api/v1/envelope/{envelopeUuid}/comment | Get envelope comments for each document
[**getEnvelopeInviteAuthorized**](EnvelopeControllerApi.md#getEnvelopeInviteAuthorized) | **GET** /api/v1/envelope/invite-authorized-info | Get information about envelope by the invitation code (by already registered user)
[**getEnvelopeInviteUnauthorized**](EnvelopeControllerApi.md#getEnvelopeInviteUnauthorized) | **GET** /api/v1/envelope/invite-info | Get information about envelope by the invitation code (by unauthenticated user)
[**getEnvelopeSharedZip**](EnvelopeControllerApi.md#getEnvelopeSharedZip) | **GET** /api/v1/envelope/download-shared | Get shared zip archive
[**getEnvelopeZip**](EnvelopeControllerApi.md#getEnvelopeZip) | **GET** /api/v1/envelope/{envelopeUuid}/zip | Get envelope or document zip archive
[**getUserPendingInvitations**](EnvelopeControllerApi.md#getUserPendingInvitations) | **GET** /api/v1/envelope/invitations | Get user&#x27;s pending invitations
[**mergeEnvelopesIntoChain**](EnvelopeControllerApi.md#mergeEnvelopesIntoChain) | **POST** /api/v1/envelope/chain | Merge envelopes into chain
[**quickSendExternalDocuments**](EnvelopeControllerApi.md#quickSendExternalDocuments) | **POST** /api/v1/envelope/quick-send | Quick send envelope with external documents only
[**removeEnvelopeFromChain**](EnvelopeControllerApi.md#removeEnvelopeFromChain) | **DELETE** /api/v1/envelope/{envelopeUuid}/chain | Remove envelope from chain
[**resendNotifications**](EnvelopeControllerApi.md#resendNotifications) | **POST** /api/v1/envelope/notify | Resend notifications for active roles
[**resolvedEnvelopeComment**](EnvelopeControllerApi.md#resolvedEnvelopeComment) | **POST** /api/v1/envelope/{envelopeUuid}/resolve-comment | Set Resolved Flag for comment thread
[**send**](EnvelopeControllerApi.md#send) | **POST** /api/v1/envelope/send | Send envelope
[**sendByTemplateCode**](EnvelopeControllerApi.md#sendByTemplateCode) | **POST** /api/v1/envelope/send-by-share-code | Send envelope by template code
[**sendForApproval**](EnvelopeControllerApi.md#sendForApproval) | **PUT** /api/v1/envelope/send-for-approval | Send envelope for approval
[**shareEnvelopesByEmail**](EnvelopeControllerApi.md#shareEnvelopesByEmail) | **POST** /api/v1/envelope/share | Share envelopes by email
[**sign**](EnvelopeControllerApi.md#sign) | **PUT** /api/v1/envelope/{envelopeUuid}/sign | Sign envelope documents
[**updateEnvelope**](EnvelopeControllerApi.md#updateEnvelope) | **PUT** /api/v1/envelope | Update draft envelope
[**updateEnvelopeComment**](EnvelopeControllerApi.md#updateEnvelopeComment) | **PUT** /api/v1/envelope/{envelopeUuid}/comment | Add/Update envelope comment in thread
[**updateEnvelopeCommentAccess**](EnvelopeControllerApi.md#updateEnvelopeCommentAccess) | **PUT** /api/v1/envelope/{envelopeUuid}/comment-access | Update envelope comment thread access level

<a name="acceptUserPendingInvitations"></a>
# **acceptUserPendingInvitations**
> acceptUserPendingInvitations(body, mailbox)

Accept user&#x27;s pending invitations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
List<UUID> body = Arrays.asList(new UUID()); // List<UUID> | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.acceptUserPendingInvitations(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#acceptUserPendingInvitations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;UUID&gt;**](UUID.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="addEnvelopesIntoChain"></a>
# **addEnvelopesIntoChain**
> addEnvelopesIntoChain(body, mailbox, chainUuid)

Add envelopes into chain

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
List<UUID> body = Arrays.asList(new UUID()); // List<UUID> | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID chainUuid = new UUID(); // UUID | Chain UUID
try {
    apiInstance.addEnvelopesIntoChain(body, mailbox, chainUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#addEnvelopesIntoChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;UUID&gt;**](UUID.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **chainUuid** | [**UUID**](.md)| Chain UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="archive"></a>
# **archive**
> archive(body, mailbox, flag)

Archive envelopes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
BulkEnvelopeActionDTO body = new BulkEnvelopeActionDTO(); // BulkEnvelopeActionDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
Boolean flag = true; // Boolean | 
try {
    apiInstance.archive(body, mailbox, flag);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#archive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulkEnvelopeActionDTO**](BulkEnvelopeActionDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **flag** | **Boolean**|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="cancelApprovalFlow"></a>
# **cancelApprovalFlow**
> cancelApprovalFlow(envelopeUuid, flowUuid, mailbox)

Cancel envelope approval

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID envelopeUuid = new UUID(); // UUID | Envelope to approve
UUID flowUuid = new UUID(); // UUID | Flow to approve
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.cancelApprovalFlow(envelopeUuid, flowUuid, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#cancelApprovalFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **envelopeUuid** | [**UUID**](.md)| Envelope to approve |
 **flowUuid** | [**UUID**](.md)| Flow to approve |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cancelEnvelopeDelegation"></a>
# **cancelEnvelopeDelegation**
> cancelEnvelopeDelegation(body, mailbox)

Cancel envelope delegation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
EnvCancelDelegationDTO body = new EnvCancelDelegationDTO(); // EnvCancelDelegationDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.cancelEnvelopeDelegation(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#cancelEnvelopeDelegation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnvCancelDelegationDTO**](EnvCancelDelegationDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="cancelEnvelopes"></a>
# **cancelEnvelopes**
> cancelEnvelopes(body, mailbox)

Cancel envelopes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
EnvCancellationRequestDTO body = new EnvCancellationRequestDTO(); // EnvCancellationRequestDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.cancelEnvelopes(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#cancelEnvelopes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnvCancellationRequestDTO**](EnvCancellationRequestDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="check"></a>
# **check**
> ValidationResponseDTO check(body, mailbox)

Check an envelope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
EnvDTO body = new EnvDTO(); // EnvDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    ValidationResponseDTO result = apiInstance.check(body, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#check");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnvDTO**](EnvDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**ValidationResponseDTO**](ValidationResponseDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkUserHasInvitations"></a>
# **checkUserHasInvitations**
> checkUserHasInvitations()

Check user has pending invitations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
try {
    apiInstance.checkUserHasInvitations();
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#checkUserHasInvitations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cloneAttachment"></a>
# **cloneAttachment**
> UploadedAttachmentDTO cloneAttachment(attachmentUuid, mailbox)

Clone an existing attachment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID attachmentUuid = new UUID(); // UUID | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    UploadedAttachmentDTO result = apiInstance.cloneAttachment(attachmentUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#cloneAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentUuid** | [**UUID**](.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**UploadedAttachmentDTO**](UploadedAttachmentDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="confirmInvite"></a>
# **confirmInvite**
> confirmInvite(body)

Accept/confirm invitations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
EnvelopeConfirmInviteDTO body = new EnvelopeConfirmInviteDTO(); // EnvelopeConfirmInviteDTO | 
try {
    apiInstance.confirmInvite(body);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#confirmInvite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnvelopeConfirmInviteDTO**](EnvelopeConfirmInviteDTO.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="continueScenarioStep"></a>
# **continueScenarioStep**
> List&lt;SingleUuidDTO&gt; continueScenarioStep(envelopeUuid, stepId, mailbox)

Continue scenario flow with step

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
String stepId = "stepId_example"; // String | Step id
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<SingleUuidDTO> result = apiInstance.continueScenarioStep(envelopeUuid, stepId, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#continueScenarioStep");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID |
 **stepId** | **String**| Step id |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="convertAttachmentToPdf"></a>
# **convertAttachmentToPdf**
> File convertAttachmentToPdf(attachmentUuid, mailbox)

Convert attachment to PDF

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID attachmentUuid = new UUID(); // UUID | Attachment UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    File result = apiInstance.convertAttachmentToPdf(attachmentUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#convertAttachmentToPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentUuid** | [**UUID**](.md)| Attachment UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="createAttachment"></a>
# **createAttachment**
> UploadedAttachmentDTO createAttachment(mailbox, file, validate, type)

Create/upload new attachment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
File file = new File("file_example"); // File | 
String validate = "validate_example"; // String | 
String type = "type_example"; // String | 
try {
    UploadedAttachmentDTO result = apiInstance.createAttachment(mailbox, file, validate, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#createAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **file** | **File**|  | [optional]
 **validate** | **String**|  | [optional] [enum: EDITABLE_DOCUMENT]
 **type** | **String**|  | [optional] [enum: all, document, file, image, archive]

### Return type

[**UploadedAttachmentDTO**](UploadedAttachmentDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createEnvelope"></a>
# **createEnvelope**
> SingleUuidDTO createEnvelope(body, mailbox)

Create draft envelope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
EnvPostDTO body = new EnvPostDTO(); // EnvPostDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    SingleUuidDTO result = apiInstance.createEnvelope(body, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#createEnvelope");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnvPostDTO**](EnvPostDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEnvelopeComment"></a>
# **createEnvelopeComment**
> CommentThreadDTO createEnvelopeComment(body, mailbox, envelopeUuid)

Create envelope comment thread

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
CommentPostDTO body = new CommentPostDTO(); // CommentPostDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
try {
    CommentThreadDTO result = apiInstance.createEnvelopeComment(body, mailbox, envelopeUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#createEnvelopeComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CommentPostDTO**](CommentPostDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID |

### Return type

[**CommentThreadDTO**](CommentThreadDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delegateEnvelopes"></a>
# **delegateEnvelopes**
> delegateEnvelopes(body, mailbox)

Delegate envelopes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
EnvDelegationDTO body = new EnvDelegationDTO(); // EnvDelegationDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.delegateEnvelopes(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#delegateEnvelopes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnvDelegationDTO**](EnvDelegationDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteDrafts"></a>
# **deleteDrafts**
> deleteDrafts(body, mailbox)

Delete draft envelopes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
BulkEnvelopeActionDTO body = new BulkEnvelopeActionDTO(); // BulkEnvelopeActionDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.deleteDrafts(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#deleteDrafts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulkEnvelopeActionDTO**](BulkEnvelopeActionDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteEnvelopeComment"></a>
# **deleteEnvelopeComment**
> CommentThreadDTO deleteEnvelopeComment(envelopeUuid, threadUuid, mailbox, messageId)

Delete envelope comment in thread or the whole thread

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
UUID threadUuid = new UUID(); // UUID | Thread UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
Integer messageId = 56; // Integer | Message ID (optional)
try {
    CommentThreadDTO result = apiInstance.deleteEnvelopeComment(envelopeUuid, threadUuid, mailbox, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#deleteEnvelopeComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID |
 **threadUuid** | [**UUID**](.md)| Thread UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **messageId** | **Integer**| Message ID (optional) | [optional]

### Return type

[**CommentThreadDTO**](CommentThreadDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadEnvelopeAttachment"></a>
# **downloadEnvelopeAttachment**
> File downloadEnvelopeAttachment(envelopeUuid, attachmentUuid, mailbox)

Download envelope attachment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
UUID attachmentUuid = new UUID(); // UUID | Attachment UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    File result = apiInstance.downloadEnvelopeAttachment(envelopeUuid, attachmentUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#downloadEnvelopeAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID |
 **attachmentUuid** | [**UUID**](.md)| Attachment UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="envelopeApproval"></a>
# **envelopeApproval**
> envelopeApproval(body, mailbox, envelopeUuid, flowUuid)

Approve or Reject envelope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
ApprovalStatusDTO body = new ApprovalStatusDTO(); // ApprovalStatusDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID envelopeUuid = new UUID(); // UUID | Envelope to approve
UUID flowUuid = new UUID(); // UUID | Flow to approve
try {
    apiInstance.envelopeApproval(body, mailbox, envelopeUuid, flowUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#envelopeApproval");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApprovalStatusDTO**](ApprovalStatusDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **envelopeUuid** | [**UUID**](.md)| Envelope to approve |
 **flowUuid** | [**UUID**](.md)| Flow to approve |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="envelopeApprovalHistory"></a>
# **envelopeApprovalHistory**
> List&lt;EnvelopeApprovalHistoryDTO&gt; envelopeApprovalHistory(envelopeUuid, mailbox)

Get approval history

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<EnvelopeApprovalHistoryDTO> result = apiInstance.envelopeApprovalHistory(envelopeUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#envelopeApprovalHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;EnvelopeApprovalHistoryDTO&gt;**](EnvelopeApprovalHistoryDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fill"></a>
# **fill**
> fill(body, mailbox)

Fill envelope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
EnvPostDTO body = new EnvPostDTO(); // EnvPostDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.fill(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#fill");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnvPostDTO**](EnvPostDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getActiveRoles"></a>
# **getActiveRoles**
> List&lt;SingleUuidDTO&gt; getActiveRoles(uuid, mailbox)

Get active roles by Envelope UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID uuid = new UUID(); // UUID | UUID of envelope to get active roles from
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<SingleUuidDTO> result = apiInstance.getActiveRoles(uuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#getActiveRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| UUID of envelope to get active roles from |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getApprovalFlow"></a>
# **getApprovalFlow**
> EnvelopeApprovalHistoryDTO getApprovalFlow(envelopeUuid, flowUuid, mailbox)

Get envelope approval

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID envelopeUuid = new UUID(); // UUID | Envelope to approve
UUID flowUuid = new UUID(); // UUID | Flow to approve
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    EnvelopeApprovalHistoryDTO result = apiInstance.getApprovalFlow(envelopeUuid, flowUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#getApprovalFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **envelopeUuid** | [**UUID**](.md)| Envelope to approve |
 **flowUuid** | [**UUID**](.md)| Flow to approve |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**EnvelopeApprovalHistoryDTO**](EnvelopeApprovalHistoryDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChainEnvelopes"></a>
# **getChainEnvelopes**
> List&lt;ChainEnvelopeDTO&gt; getChainEnvelopes(chainUuid, mailbox)

Get chain envelopes list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID chainUuid = new UUID(); // UUID | Chain UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<ChainEnvelopeDTO> result = apiInstance.getChainEnvelopes(chainUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#getChainEnvelopes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainUuid** | [**UUID**](.md)| Chain UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;ChainEnvelopeDTO&gt;**](ChainEnvelopeDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDocumentPrintVersion"></a>
# **getDocumentPrintVersion**
> File getDocumentPrintVersion(envelopeUuid, documentId, mailbox)

Get document PDF for printing

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
String documentId = "documentId_example"; // String | Document id
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    File result = apiInstance.getDocumentPrintVersion(envelopeUuid, documentId, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#getDocumentPrintVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID |
 **documentId** | **String**| Document id |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getDocumentsForSign"></a>
# **getDocumentsForSign**
> List&lt;DocumentForSigningDTO&gt; getDocumentsForSign(body, mailbox, envelopeUuid)

PDFs and XMLs for signing

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
DocumentsForSignRequestDTO body = new DocumentsForSignRequestDTO(); // DocumentsForSignRequestDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
try {
    List<DocumentForSigningDTO> result = apiInstance.getDocumentsForSign(body, mailbox, envelopeUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#getDocumentsForSign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DocumentsForSignRequestDTO**](DocumentsForSignRequestDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID |

### Return type

[**List&lt;DocumentForSigningDTO&gt;**](DocumentForSigningDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEnvelopeByUuid"></a>
# **getEnvelopeByUuid**
> EnvelopeWithTemplateDTO getEnvelopeByUuid(uuid, mailbox)

Retrieve envelope by UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID uuid = new UUID(); // UUID | UUID of envelope to retrieve
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    EnvelopeWithTemplateDTO result = apiInstance.getEnvelopeByUuid(uuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#getEnvelopeByUuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| UUID of envelope to retrieve |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**EnvelopeWithTemplateDTO**](EnvelopeWithTemplateDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvelopeComments"></a>
# **getEnvelopeComments**
> List&lt;DocumentCommentsDTO&gt; getEnvelopeComments(envelopeUuid, mailbox)

Get envelope comments for each document

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    List<DocumentCommentsDTO> result = apiInstance.getEnvelopeComments(envelopeUuid, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#getEnvelopeComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**List&lt;DocumentCommentsDTO&gt;**](DocumentCommentsDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvelopeInviteAuthorized"></a>
# **getEnvelopeInviteAuthorized**
> InvitedEnvelopeInfoDTO getEnvelopeInviteAuthorized(code)

Get information about envelope by the invitation code (by already registered user)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
String code = "code_example"; // String | Invitation code from email
try {
    InvitedEnvelopeInfoDTO result = apiInstance.getEnvelopeInviteAuthorized(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#getEnvelopeInviteAuthorized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Invitation code from email |

### Return type

[**InvitedEnvelopeInfoDTO**](InvitedEnvelopeInfoDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvelopeInviteUnauthorized"></a>
# **getEnvelopeInviteUnauthorized**
> InvitedEnvelopeInfoDTO getEnvelopeInviteUnauthorized(code)

Get information about envelope by the invitation code (by unauthenticated user)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvelopeControllerApi;


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
String code = "code_example"; // String | Invitation code from email
try {
    InvitedEnvelopeInfoDTO result = apiInstance.getEnvelopeInviteUnauthorized(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#getEnvelopeInviteUnauthorized");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Invitation code from email |

### Return type

[**InvitedEnvelopeInfoDTO**](InvitedEnvelopeInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvelopeSharedZip"></a>
# **getEnvelopeSharedZip**
> File getEnvelopeSharedZip(code)

Get shared zip archive

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
String code = "code_example"; // String | Code for downloading
try {
    File result = apiInstance.getEnvelopeSharedZip(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#getEnvelopeSharedZip");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Code for downloading |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getEnvelopeZip"></a>
# **getEnvelopeZip**
> File getEnvelopeZip(envelopeUuid, mailbox, documentId, excludeFiles)

Get envelope or document zip archive

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
String documentId = "documentId_example"; // String | Document id
String excludeFiles = "excludeFiles_example"; // String | Mask to exclude some files. c - for signature/processing Certificate, p - for Printable version, a - for Audit trail
try {
    File result = apiInstance.getEnvelopeZip(envelopeUuid, mailbox, documentId, excludeFiles);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#getEnvelopeZip");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **documentId** | **String**| Document id | [optional]
 **excludeFiles** | **String**| Mask to exclude some files. c - for signature/processing Certificate, p - for Printable version, a - for Audit trail | [optional]

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getUserPendingInvitations"></a>
# **getUserPendingInvitations**
> PageDTOEnvelopeToMailboxDTO getUserPendingInvitations(offset, limit)

Get user&#x27;s pending invitations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
Integer offset = 0; // Integer | Offset, how much envelopes to skip
Integer limit = 25; // Integer | Limit, how much envelopes to retrieve
try {
    PageDTOEnvelopeToMailboxDTO result = apiInstance.getUserPendingInvitations(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#getUserPendingInvitations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| Offset, how much envelopes to skip | [optional] [default to 0]
 **limit** | **Integer**| Limit, how much envelopes to retrieve | [optional] [default to 25]

### Return type

[**PageDTOEnvelopeToMailboxDTO**](PageDTOEnvelopeToMailboxDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="mergeEnvelopesIntoChain"></a>
# **mergeEnvelopesIntoChain**
> SingleUuidDTO mergeEnvelopesIntoChain(body, mailbox)

Merge envelopes into chain

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
List<UUID> body = Arrays.asList(new UUID()); // List<UUID> | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    SingleUuidDTO result = apiInstance.mergeEnvelopesIntoChain(body, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#mergeEnvelopesIntoChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;UUID&gt;**](UUID.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="quickSendExternalDocuments"></a>
# **quickSendExternalDocuments**
> SingleUuidDTO quickSendExternalDocuments(files, data, mailbox)

Quick send envelope with external documents only

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
List<File> files = Arrays.asList(new File("/path/to/file")); // List<File> | 
QuickSendDTO data = new QuickSendDTO(); // QuickSendDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    SingleUuidDTO result = apiInstance.quickSendExternalDocuments(files, data, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#quickSendExternalDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **files** | [**List&lt;File&gt;**](File.md)|  |
 **data** | [**QuickSendDTO**](.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="removeEnvelopeFromChain"></a>
# **removeEnvelopeFromChain**
> removeEnvelopeFromChain(envelopeUuid, mailbox)

Remove envelope from chain

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.removeEnvelopeFromChain(envelopeUuid, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#removeEnvelopeFromChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="resendNotifications"></a>
# **resendNotifications**
> resendNotifications(body, mailbox)

Resend notifications for active roles

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
ReportEnvelopeRequestDTO body = new ReportEnvelopeRequestDTO(); // ReportEnvelopeRequestDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.resendNotifications(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#resendNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportEnvelopeRequestDTO**](ReportEnvelopeRequestDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="resolvedEnvelopeComment"></a>
# **resolvedEnvelopeComment**
> resolvedEnvelopeComment(body, mailbox, envelopeUuid)

Set Resolved Flag for comment thread

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
ResolveCommentThreadDTO body = new ResolveCommentThreadDTO(); // ResolveCommentThreadDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
try {
    apiInstance.resolvedEnvelopeComment(body, mailbox, envelopeUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#resolvedEnvelopeComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResolveCommentThreadDTO**](ResolveCommentThreadDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="send"></a>
# **send**
> SingleUuidDTO send(body, mailbox)

Send envelope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
EnvPostDTO body = new EnvPostDTO(); // EnvPostDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    SingleUuidDTO result = apiInstance.send(body, mailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#send");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnvPostDTO**](EnvPostDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendByTemplateCode"></a>
# **sendByTemplateCode**
> SingleUuidDTO sendByTemplateCode(body)

Send envelope by template code

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvelopeControllerApi;


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
SendEnvByCodeDTO body = new SendEnvByCodeDTO(); // SendEnvByCodeDTO | 
try {
    SingleUuidDTO result = apiInstance.sendByTemplateCode(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#sendByTemplateCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendEnvByCodeDTO**](SendEnvByCodeDTO.md)|  |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendForApproval"></a>
# **sendForApproval**
> sendForApproval(body, mailbox)

Send envelope for approval

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
EnvelopeApprovalRequestDTO body = new EnvelopeApprovalRequestDTO(); // EnvelopeApprovalRequestDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.sendForApproval(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#sendForApproval");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnvelopeApprovalRequestDTO**](EnvelopeApprovalRequestDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="shareEnvelopesByEmail"></a>
# **shareEnvelopesByEmail**
> shareEnvelopesByEmail(body, mailbox)

Share envelopes by email

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
EnvelopeSharedArchiveRequestDTO body = new EnvelopeSharedArchiveRequestDTO(); // EnvelopeSharedArchiveRequestDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.shareEnvelopesByEmail(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#shareEnvelopesByEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnvelopeSharedArchiveRequestDTO**](EnvelopeSharedArchiveRequestDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="sign"></a>
# **sign**
> sign(body, mailbox, envelopeUuid)

Sign envelope documents

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
List<EnvelopeDocumentSignaturesDTO> body = Arrays.asList(new EnvelopeDocumentSignaturesDTO()); // List<EnvelopeDocumentSignaturesDTO> | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID envelopeUuid = new UUID(); // UUID | Envelope to update
try {
    apiInstance.sign(body, mailbox, envelopeUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#sign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;EnvelopeDocumentSignaturesDTO&gt;**](EnvelopeDocumentSignaturesDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **envelopeUuid** | [**UUID**](.md)| Envelope to update |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateEnvelope"></a>
# **updateEnvelope**
> updateEnvelope(body, mailbox)

Update draft envelope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
EnvPostDTO body = new EnvPostDTO(); // EnvPostDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
try {
    apiInstance.updateEnvelope(body, mailbox);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#updateEnvelope");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnvPostDTO**](EnvPostDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateEnvelopeComment"></a>
# **updateEnvelopeComment**
> CommentThreadDTO updateEnvelopeComment(body, mailbox, envelopeUuid)

Add/Update envelope comment in thread

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
CommentPutDTO body = new CommentPutDTO(); // CommentPutDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
try {
    CommentThreadDTO result = apiInstance.updateEnvelopeComment(body, mailbox, envelopeUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#updateEnvelopeComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CommentPutDTO**](CommentPutDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID |

### Return type

[**CommentThreadDTO**](CommentThreadDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEnvelopeCommentAccess"></a>
# **updateEnvelopeCommentAccess**
> CommentThreadDTO updateEnvelopeCommentAccess(body, mailbox, envelopeUuid)

Update envelope comment thread access level

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvelopeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnvelopeControllerApi apiInstance = new EnvelopeControllerApi();
CommentAccessDTO body = new CommentAccessDTO(); // CommentAccessDTO | 
UUID mailbox = new UUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
UUID envelopeUuid = new UUID(); // UUID | Envelope UUID
try {
    CommentThreadDTO result = apiInstance.updateEnvelopeCommentAccess(body, mailbox, envelopeUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvelopeControllerApi#updateEnvelopeCommentAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CommentAccessDTO**](CommentAccessDTO.md)|  |
 **mailbox** | [**UUID**](.md)| Mailbox context, HTTP Header with current mailbox UUID |
 **envelopeUuid** | [**UUID**](.md)| Envelope UUID |

### Return type

[**CommentThreadDTO**](CommentThreadDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

