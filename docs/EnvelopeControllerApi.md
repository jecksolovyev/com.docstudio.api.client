# EnvelopeControllerApi

All URIs are relative to *https://api.docstudio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptUserPendingInvitations**](EnvelopeControllerApi.md#acceptUserPendingInvitations) | **POST** /api/v1/envelope/invitations | Accept user&#39;s pending invitations |
| [**addEnvelopesIntoChain**](EnvelopeControllerApi.md#addEnvelopesIntoChain) | **PUT** /api/v1/envelope/chain/{chainId} | Add envelopes into chain |
| [**addReviewers**](EnvelopeControllerApi.md#addReviewers) | **PUT** /api/v1/envelope/editorial-review/{id}/flow | Add reviewers to a running editorial review |
| [**approve**](EnvelopeControllerApi.md#approve) | **POST** /api/v1/envelope/approve | Approve envelope |
| [**archiveEnvelope**](EnvelopeControllerApi.md#archiveEnvelope) | **PATCH** /api/v1/envelope/archive/{flag} | Archive envelopes |
| [**cancelApprovalFlow**](EnvelopeControllerApi.md#cancelApprovalFlow) | **DELETE** /api/v1/envelope/{id}/approval/{flowUuid} | Cancel envelope approval |
| [**cancelEnvelopeDelegation**](EnvelopeControllerApi.md#cancelEnvelopeDelegation) | **DELETE** /api/v1/envelope/delegate | Cancel envelope delegation |
| [**cancelEnvelopes**](EnvelopeControllerApi.md#cancelEnvelopes) | **DELETE** /api/v1/envelope/cancel | Cancel envelopes |
| [**check**](EnvelopeControllerApi.md#check) | **POST** /api/v1/envelope/check | Check an envelope |
| [**checkEnvelopeHasActiveRole**](EnvelopeControllerApi.md#checkEnvelopeHasActiveRole) | **HEAD** /api/v1/envelope/{id}/has-active-role | Check envelope has active role |
| [**checkUserHasInvitations**](EnvelopeControllerApi.md#checkUserHasInvitations) | **HEAD** /api/v1/envelope/invitations | Check user has pending invitations |
| [**cloneAttachment**](EnvelopeControllerApi.md#cloneAttachment) | **POST** /api/v1/envelope/clone-attachment | Clone an existing attachment |
| [**confirmInvite**](EnvelopeControllerApi.md#confirmInvite) | **POST** /api/v1/envelope/confirm-invite | Accept/confirm invitations |
| [**continueScenarioStep**](EnvelopeControllerApi.md#continueScenarioStep) | **POST** /api/v1/envelope/{id}/scenario/{stepId} | Continue scenario flow with step |
| [**createAttachment**](EnvelopeControllerApi.md#createAttachment) | **POST** /api/v1/envelope/attachment | Create/upload new attachment |
| [**createEnvelope**](EnvelopeControllerApi.md#createEnvelope) | **POST** /api/v1/envelope | Create draft envelope |
| [**createEnvelopeComment**](EnvelopeControllerApi.md#createEnvelopeComment) | **POST** /api/v1/envelope/{id}/comment | Create envelope comment thread |
| [**createPdfAttachment**](EnvelopeControllerApi.md#createPdfAttachment) | **POST** /api/v1/envelope/pdf-attachment | Create/upload new PDF attachment |
| [**delegateEnvelopes**](EnvelopeControllerApi.md#delegateEnvelopes) | **POST** /api/v1/envelope/delegate | Delegate envelopes |
| [**deleteDrafts**](EnvelopeControllerApi.md#deleteDrafts) | **DELETE** /api/v1/envelope | Delete draft envelopes |
| [**deleteEnvelopeComment**](EnvelopeControllerApi.md#deleteEnvelopeComment) | **DELETE** /api/v1/envelope/{id}/comment | Delete envelope comment in thread or the whole thread |
| [**deleteEnvelopeMetadata**](EnvelopeControllerApi.md#deleteEnvelopeMetadata) | **DELETE** /api/v1/envelope/{id}/metadata | Delete envelope metadata |
| [**downloadEnvelopeAttachment**](EnvelopeControllerApi.md#downloadEnvelopeAttachment) | **GET** /api/v1/envelope/attachment | Download attachment with specific type or raw |
| [**downloadFinalPdf**](EnvelopeControllerApi.md#downloadFinalPdf) | **GET** /api/v1/envelope/{id}/download-final-pdf | Download final PDF |
| [**downloadSharedAttachment**](EnvelopeControllerApi.md#downloadSharedAttachment) | **GET** /api/v1/envelope/shared-attachment | Download shared attachment for specific provider |
| [**envelopeApproval**](EnvelopeControllerApi.md#envelopeApproval) | **PUT** /api/v1/envelope/approval | Approve or Reject envelopes |
| [**envelopeApprovalHistory**](EnvelopeControllerApi.md#envelopeApprovalHistory) | **GET** /api/v1/envelope/{id}/approval-history | Get approval history |
| [**fill**](EnvelopeControllerApi.md#fill) | **PUT** /api/v1/envelope/fill | Fill envelope |
| [**generateStamp**](EnvelopeControllerApi.md#generateStamp) | **POST** /api/v1/envelope/generate-stamp | Generate stamp by certificate |
| [**getActiveRoles**](EnvelopeControllerApi.md#getActiveRoles) | **GET** /api/v1/envelope/{id}/activeRoles | Get active roles by Envelope UUID |
| [**getApprovalFlow**](EnvelopeControllerApi.md#getApprovalFlow) | **GET** /api/v1/envelope/{id}/approval/{flowUuid} | Get envelope approval |
| [**getArchiveInfo**](EnvelopeControllerApi.md#getArchiveInfo) | **GET** /api/v1/envelope/attachment/archive-info | Get attachment archive info (p7s, asice, pdf) |
| [**getAttachmentPageSizes**](EnvelopeControllerApi.md#getAttachmentPageSizes) | **GET** /api/v1/envelope/attachment/page-sizes | Get attachment page sizes |
| [**getChainEnvelopes**](EnvelopeControllerApi.md#getChainEnvelopes) | **GET** /api/v1/envelope/chain/{chainId} | Get chain envelopes list |
| [**getDocumentFileForSign**](EnvelopeControllerApi.md#getDocumentFileForSign) | **GET** /api/v1/envelope/{id}/for-sign-file | Get BINARY or XML for signing |
| [**getDocumentPrintVersion**](EnvelopeControllerApi.md#getDocumentPrintVersion) | **GET** /api/v1/envelope/{id}/for-print | Get document PDF for printing |
| [**getDocumentsForSign**](EnvelopeControllerApi.md#getDocumentsForSign) | **POST** /api/v1/envelope/{id}/for-sign | BINARYs and XMLs for signing |
| [**getEnvelopeByUuid**](EnvelopeControllerApi.md#getEnvelopeByUuid) | **GET** /api/v1/envelope/{envelopeUuid} | Retrieve envelope by UUID |
| [**getEnvelopeComments**](EnvelopeControllerApi.md#getEnvelopeComments) | **GET** /api/v1/envelope/{id}/comment | Get envelope comments for each document |
| [**getEnvelopeInviteAuthorized**](EnvelopeControllerApi.md#getEnvelopeInviteAuthorized) | **GET** /api/v1/envelope/invite-authorized-info | Get information about envelope by the invitation code (by already registered user) |
| [**getEnvelopeInviteUnauthorized**](EnvelopeControllerApi.md#getEnvelopeInviteUnauthorized) | **GET** /api/v1/envelope/invite-info | Get information about envelope by the invitation code (by unauthenticated user) |
| [**getEnvelopeSharedZip**](EnvelopeControllerApi.md#getEnvelopeSharedZip) | **GET** /api/v1/envelope/download-shared | Get shared zip archive |
| [**getEnvelopeZip**](EnvelopeControllerApi.md#getEnvelopeZip) | **GET** /api/v1/envelope/{id}/zip | Get envelope or document zip archive |
| [**getMassSigningReport**](EnvelopeControllerApi.md#getMassSigningReport) | **GET** /api/v1/envelope/signing-report/{sessionId} | Get mass signing report |
| [**getPaymentDetails**](EnvelopeControllerApi.md#getPaymentDetails) | **GET** /api/v1/envelope/payment-details/{accessCode} | Get payment details of a payment link for the checkout page |
| [**getPaymentLink**](EnvelopeControllerApi.md#getPaymentLink) | **POST** /api/v1/envelope/{id}/payment-link | Get the public checkout link of a QR pay field; the role of the field must be completed |
| [**getUserPendingInvitations**](EnvelopeControllerApi.md#getUserPendingInvitations) | **GET** /api/v1/envelope/invitations | Get user&#39;s pending invitations |
| [**markEnvelopesAsRead**](EnvelopeControllerApi.md#markEnvelopesAsRead) | **POST** /api/v1/envelope/mark-as-read | Mark envelopes as read by mailbox |
| [**mergeEnvelopesIntoChain**](EnvelopeControllerApi.md#mergeEnvelopesIntoChain) | **POST** /api/v1/envelope/chain | Merge envelopes into chain |
| [**numberToText**](EnvelopeControllerApi.md#numberToText) | **POST** /api/v1/envelope/number-to-text | Convert a numeric amount to words |
| [**oneTimeSend**](EnvelopeControllerApi.md#oneTimeSend) | **POST** /api/v1/envelope/one-time-send | The envelope will be sent just once (template will be marked as deleted) |
| [**publicQuickSendWithOneExternalDocument**](EnvelopeControllerApi.md#publicQuickSendWithOneExternalDocument) | **POST** /api/v1/envelope/public-quick-send | Public quick send envelope with one external document |
| [**quickSendExternalDocuments**](EnvelopeControllerApi.md#quickSendExternalDocuments) | **POST** /api/v1/envelope/quick-send | Quick send envelope with external documents only |
| [**recycleBin**](EnvelopeControllerApi.md#recycleBin) | **PATCH** /api/v1/envelope/recycle-bin/{flag} | Archive envelopes |
| [**removeEnvelopeFromChain**](EnvelopeControllerApi.md#removeEnvelopeFromChain) | **DELETE** /api/v1/envelope/{id}/chain | Remove envelope from chain |
| [**removeEnvelopesFromChain**](EnvelopeControllerApi.md#removeEnvelopesFromChain) | **PUT** /api/v1/envelope/unchain | Remove envelopes from chain |
| [**resendNotifications**](EnvelopeControllerApi.md#resendNotifications) | **POST** /api/v1/envelope/notify | Resend notifications for active roles |
| [**resolvedEnvelopeComment**](EnvelopeControllerApi.md#resolvedEnvelopeComment) | **POST** /api/v1/envelope/{id}/resolve-comment | Set Resolved Flag for comment thread |
| [**revokeEnvelopeSharing**](EnvelopeControllerApi.md#revokeEnvelopeSharing) | **DELETE** /api/v1/envelope/share-copy | Revoke sharing an envelope copy |
| [**reworkEditorialReview**](EnvelopeControllerApi.md#reworkEditorialReview) | **POST** /api/v1/envelope/editorial-review/{id}/rework | Send editorial review back for rework |
| [**send**](EnvelopeControllerApi.md#send) | **POST** /api/v1/envelope/send | Send envelope |
| [**sendByTemplateCode**](EnvelopeControllerApi.md#sendByTemplateCode) | **POST** /api/v1/envelope/send-by-share-code | Send envelope by template code |
| [**sendForApproval**](EnvelopeControllerApi.md#sendForApproval) | **PUT** /api/v1/envelope/send-for-approval | Send envelope for approval |
| [**shareEnvelopesByEmail**](EnvelopeControllerApi.md#shareEnvelopesByEmail) | **POST** /api/v1/envelope/share-archive | Share envelopes by email |
| [**shareEnvelopesCopy**](EnvelopeControllerApi.md#shareEnvelopesCopy) | **POST** /api/v1/envelope/share-copy | Share envelopes copies |
| [**signEnvelope**](EnvelopeControllerApi.md#signEnvelope) | **PUT** /api/v1/envelope/{id}/sign | Sign envelope documents |
| [**signSES**](EnvelopeControllerApi.md#signSES) | **POST** /api/v1/envelope/{id}/sign-ses | Sign envelope with SES |
| [**startEditorialReviewForExternalDocuments**](EnvelopeControllerApi.md#startEditorialReviewForExternalDocuments) | **POST** /api/v1/envelope/editorial-review | Start editorial review of DOC, DOCX |
| [**updateEnvelope**](EnvelopeControllerApi.md#updateEnvelope) | **PUT** /api/v1/envelope | Update envelope without sending |
| [**updateEnvelopeComment**](EnvelopeControllerApi.md#updateEnvelopeComment) | **PUT** /api/v1/envelope/{id}/comment | Add/Update envelope comment in thread |
| [**updateEnvelopeCommentAccess**](EnvelopeControllerApi.md#updateEnvelopeCommentAccess) | **PUT** /api/v1/envelope/{id}/comment-access | Update envelope comment thread access level |
| [**updateEnvelopeMetadata**](EnvelopeControllerApi.md#updateEnvelopeMetadata) | **PUT** /api/v1/envelope/{id}/metadata | Update envelope metadata. Will be saved on the account level |
| [**updateFlow**](EnvelopeControllerApi.md#updateFlow) | **POST** /api/v1/envelope/{id}/flow-update | Update recipient email/mailbox for not finished roles in a sent envelope |


<a id="acceptUserPendingInvitations"></a>
# **acceptUserPendingInvitations**
> acceptUserPendingInvitations(mailbox, UUID, type)

Accept user&#39;s pending invitations

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    String type = "envelope-invite"; // String | Type of the invitations
    try {
      apiInstance.acceptUserPendingInvitations(mailbox, UUID, type);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#acceptUserPendingInvitations");
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
| **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  | |
| **type** | **String**| Type of the invitations | [optional] [enum: envelope-invite, approval-invite, review-invite] |

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

<a id="addEnvelopesIntoChain"></a>
# **addEnvelopesIntoChain**
> addEnvelopesIntoChain(chainId, mailbox, UUID)

Add envelopes into chain

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID chainId = UUID.randomUUID(); // UUID | Chain UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Set<UUID> UUID = new LinkedHashSet<>(); // Set<UUID> | 
    try {
      apiInstance.addEnvelopesIntoChain(chainId, mailbox, UUID);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#addEnvelopesIntoChain");
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
| **chainId** | **UUID**| Chain UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **UUID** | [**Set&lt;UUID&gt;**](UUID.md)|  | |

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

<a id="addReviewers"></a>
# **addReviewers**
> addReviewers(id, mailbox, reviewFlowUpdateRequest)

Add reviewers to a running editorial review

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope of the editorial review
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    ReviewFlowUpdateRequest reviewFlowUpdateRequest = new ReviewFlowUpdateRequest(); // ReviewFlowUpdateRequest | 
    try {
      apiInstance.addReviewers(id, mailbox, reviewFlowUpdateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#addReviewers");
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
| **id** | **UUID**| Envelope of the editorial review | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **reviewFlowUpdateRequest** | [**ReviewFlowUpdateRequest**](ReviewFlowUpdateRequest.md)|  | |

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

<a id="approve"></a>
# **approve**
> SingleUuidDTO approve(mailbox, bulkEnvelopeActionDTO)

Approve envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    BulkEnvelopeActionDTO bulkEnvelopeActionDTO = new BulkEnvelopeActionDTO(); // BulkEnvelopeActionDTO | 
    try {
      SingleUuidDTO result = apiInstance.approve(mailbox, bulkEnvelopeActionDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#approve");
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
| **bulkEnvelopeActionDTO** | [**BulkEnvelopeActionDTO**](BulkEnvelopeActionDTO.md)|  | |

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
| **200** | OK |  -  |

<a id="archiveEnvelope"></a>
# **archiveEnvelope**
> archiveEnvelope(flag, mailbox, bulkEnvelopeActionDTO)

Archive envelopes

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    Boolean flag = true; // Boolean | 
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    BulkEnvelopeActionDTO bulkEnvelopeActionDTO = new BulkEnvelopeActionDTO(); // BulkEnvelopeActionDTO | 
    try {
      apiInstance.archiveEnvelope(flag, mailbox, bulkEnvelopeActionDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#archiveEnvelope");
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
| **flag** | **Boolean**|  | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **bulkEnvelopeActionDTO** | [**BulkEnvelopeActionDTO**](BulkEnvelopeActionDTO.md)|  | |

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

<a id="cancelApprovalFlow"></a>
# **cancelApprovalFlow**
> cancelApprovalFlow(id, flowUuid, mailbox)

Cancel envelope approval

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope to approve
    UUID flowUuid = UUID.randomUUID(); // UUID | Flow to approve
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.cancelApprovalFlow(id, flowUuid, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#cancelApprovalFlow");
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
| **id** | **UUID**| Envelope to approve | |
| **flowUuid** | **UUID**| Flow to approve | |
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
| **204** | No Content |  -  |

<a id="cancelEnvelopeDelegation"></a>
# **cancelEnvelopeDelegation**
> cancelEnvelopeDelegation(mailbox, envelopeCancelDelegationDTO)

Cancel envelope delegation

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvelopeCancelDelegationDTO envelopeCancelDelegationDTO = new EnvelopeCancelDelegationDTO(); // EnvelopeCancelDelegationDTO | 
    try {
      apiInstance.cancelEnvelopeDelegation(mailbox, envelopeCancelDelegationDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#cancelEnvelopeDelegation");
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
| **envelopeCancelDelegationDTO** | [**EnvelopeCancelDelegationDTO**](EnvelopeCancelDelegationDTO.md)|  | |

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

<a id="cancelEnvelopes"></a>
# **cancelEnvelopes**
> SingleUuidDTO cancelEnvelopes(mailbox, envCancellationRequestDTO)

Cancel envelopes

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvCancellationRequestDTO envCancellationRequestDTO = new EnvCancellationRequestDTO(); // EnvCancellationRequestDTO | 
    try {
      SingleUuidDTO result = apiInstance.cancelEnvelopes(mailbox, envCancellationRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#cancelEnvelopes");
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
| **envCancellationRequestDTO** | [**EnvCancellationRequestDTO**](EnvCancellationRequestDTO.md)|  | |

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
| **200** | OK |  -  |

<a id="check"></a>
# **check**
> ValidationResponseDTO check(mailbox, envDTO)

Check an envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvDTO envDTO = new EnvDTO(); // EnvDTO | 
    try {
      ValidationResponseDTO result = apiInstance.check(mailbox, envDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#check");
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
| **envDTO** | [**EnvDTO**](EnvDTO.md)|  | |

### Return type

[**ValidationResponseDTO**](ValidationResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="checkEnvelopeHasActiveRole"></a>
# **checkEnvelopeHasActiveRole**
> checkEnvelopeHasActiveRole(id, mailbox)

Check envelope has active role

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | UUID of envelope
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.checkEnvelopeHasActiveRole(id, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#checkEnvelopeHasActiveRole");
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
| **id** | **UUID**| UUID of envelope | |
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

<a id="checkUserHasInvitations"></a>
# **checkUserHasInvitations**
> checkUserHasInvitations()

Check user has pending invitations

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    try {
      apiInstance.checkUserHasInvitations();
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#checkUserHasInvitations");
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

<a id="cloneAttachment"></a>
# **cloneAttachment**
> UploadedAttachmentDTO cloneAttachment(attachmentUuid, mailbox)

Clone an existing attachment

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID attachmentUuid = UUID.randomUUID(); // UUID | 
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      UploadedAttachmentDTO result = apiInstance.cloneAttachment(attachmentUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#cloneAttachment");
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
| **attachmentUuid** | **UUID**|  | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**UploadedAttachmentDTO**](UploadedAttachmentDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="confirmInvite"></a>
# **confirmInvite**
> confirmInvite(envelopeConfirmInviteDTO)

Accept/confirm invitations

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    EnvelopeConfirmInviteDTO envelopeConfirmInviteDTO = new EnvelopeConfirmInviteDTO(); // EnvelopeConfirmInviteDTO | 
    try {
      apiInstance.confirmInvite(envelopeConfirmInviteDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#confirmInvite");
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
| **envelopeConfirmInviteDTO** | [**EnvelopeConfirmInviteDTO**](EnvelopeConfirmInviteDTO.md)|  | |

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

<a id="continueScenarioStep"></a>
# **continueScenarioStep**
> List&lt;SingleUuidDTO&gt; continueScenarioStep(id, stepId, mailbox)

Continue scenario flow with step

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    String stepId = "stepId_example"; // String | Step id
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<SingleUuidDTO> result = apiInstance.continueScenarioStep(id, stepId, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#continueScenarioStep");
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
| **id** | **UUID**| Envelope UUID | |
| **stepId** | **String**| Step id | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createAttachment"></a>
# **createAttachment**
> UploadedAttachmentDTO createAttachment(_file, type, mailbox)

Create/upload new attachment

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    String type = "all"; // String | 
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      UploadedAttachmentDTO result = apiInstance.createAttachment(_file, type, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#createAttachment");
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
| **_file** | **File**|  | |
| **type** | **String**|  | [optional] [enum: all, document, file, image, archive] |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | [optional] |

### Return type

[**UploadedAttachmentDTO**](UploadedAttachmentDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createEnvelope"></a>
# **createEnvelope**
> SingleUuidDTO createEnvelope(mailbox, envPostDTO)

Create draft envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvPostDTO envPostDTO = new EnvPostDTO(); // EnvPostDTO | 
    try {
      SingleUuidDTO result = apiInstance.createEnvelope(mailbox, envPostDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#createEnvelope");
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
| **envPostDTO** | [**EnvPostDTO**](EnvPostDTO.md)|  | |

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

<a id="createEnvelopeComment"></a>
# **createEnvelopeComment**
> CommentThreadDTO createEnvelopeComment(id, mailbox, commentPostDTO)

Create envelope comment thread

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    CommentPostDTO commentPostDTO = new CommentPostDTO(); // CommentPostDTO | 
    try {
      CommentThreadDTO result = apiInstance.createEnvelopeComment(id, mailbox, commentPostDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#createEnvelopeComment");
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
| **id** | **UUID**| Envelope UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **commentPostDTO** | [**CommentPostDTO**](CommentPostDTO.md)|  | |

### Return type

[**CommentThreadDTO**](CommentThreadDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createPdfAttachment"></a>
# **createPdfAttachment**
> UploadedAttachmentDTO createPdfAttachment(_file, action, mailbox)

Create/upload new PDF attachment

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    String action = "DELETE"; // String | Action for fields inside the PDF file
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      UploadedAttachmentDTO result = apiInstance.createPdfAttachment(_file, action, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#createPdfAttachment");
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
| **_file** | **File**|  | |
| **action** | **String**| Action for fields inside the PDF file | [optional] [enum: DELETE, KEEP, KEEP_SAFE] |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | [optional] |

### Return type

[**UploadedAttachmentDTO**](UploadedAttachmentDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="delegateEnvelopes"></a>
# **delegateEnvelopes**
> SingleUuidDTO delegateEnvelopes(mailbox, envDelegationDTO)

Delegate envelopes

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvDelegationDTO envDelegationDTO = new EnvDelegationDTO(); // EnvDelegationDTO | 
    try {
      SingleUuidDTO result = apiInstance.delegateEnvelopes(mailbox, envDelegationDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#delegateEnvelopes");
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
| **envDelegationDTO** | [**EnvDelegationDTO**](EnvDelegationDTO.md)|  | |

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
| **200** | OK |  -  |

<a id="deleteDrafts"></a>
# **deleteDrafts**
> deleteDrafts(mailbox, bulkEnvelopeActionDTO)

Delete draft envelopes

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    BulkEnvelopeActionDTO bulkEnvelopeActionDTO = new BulkEnvelopeActionDTO(); // BulkEnvelopeActionDTO | 
    try {
      apiInstance.deleteDrafts(mailbox, bulkEnvelopeActionDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#deleteDrafts");
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
| **bulkEnvelopeActionDTO** | [**BulkEnvelopeActionDTO**](BulkEnvelopeActionDTO.md)|  | |

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

<a id="deleteEnvelopeComment"></a>
# **deleteEnvelopeComment**
> CommentThreadDTO deleteEnvelopeComment(id, threadUuid, mailbox, messageId)

Delete envelope comment in thread or the whole thread

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID threadUuid = UUID.randomUUID(); // UUID | Thread UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Integer messageId = 56; // Integer | Message ID (optional)
    try {
      CommentThreadDTO result = apiInstance.deleteEnvelopeComment(id, threadUuid, mailbox, messageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#deleteEnvelopeComment");
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
| **id** | **UUID**| Envelope UUID | |
| **threadUuid** | **UUID**| Thread UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **messageId** | **Integer**| Message ID (optional) | [optional] |

### Return type

[**CommentThreadDTO**](CommentThreadDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteEnvelopeMetadata"></a>
# **deleteEnvelopeMetadata**
> deleteEnvelopeMetadata(id, mailbox, key)

Delete envelope metadata

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Set<String> key = new LinkedHashSet<>(); // Set<String> | 
    try {
      apiInstance.deleteEnvelopeMetadata(id, mailbox, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#deleteEnvelopeMetadata");
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
| **id** | **UUID**|  | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **key** | [**Set&lt;String&gt;**](String.md)|  | [optional] |

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

<a id="downloadEnvelopeAttachment"></a>
# **downloadEnvelopeAttachment**
> File downloadEnvelopeAttachment(accept, attachmentUuid, mailbox, envelopeUuid)

Download attachment with specific type or raw

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    String accept = "accept_example"; // String | 
    UUID attachmentUuid = UUID.randomUUID(); // UUID | Attachment UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UUID envelopeUuid = UUID.randomUUID(); // UUID | Envelope UUID
    try {
      File result = apiInstance.downloadEnvelopeAttachment(accept, attachmentUuid, mailbox, envelopeUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#downloadEnvelopeAttachment");
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
| **accept** | **String**|  | |
| **attachmentUuid** | **UUID**| Attachment UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **envelopeUuid** | **UUID**| Envelope UUID | [optional] |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="downloadFinalPdf"></a>
# **downloadFinalPdf**
> File downloadFinalPdf(id, documentId, mailbox, wait)

Download final PDF

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    String documentId = "documentId_example"; // String | Document ID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Boolean wait = true; // Boolean | Wait for a file instead of 425 error
    try {
      File result = apiInstance.downloadFinalPdf(id, documentId, mailbox, wait);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#downloadFinalPdf");
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
| **id** | **UUID**| Envelope UUID | |
| **documentId** | **String**| Document ID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **wait** | **Boolean**| Wait for a file instead of 425 error | [optional] |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="downloadSharedAttachment"></a>
# **downloadSharedAttachment**
> File downloadSharedAttachment(provider, attachmentUuid)

Download shared attachment for specific provider

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    String provider = "provider_example"; // String | Sharing provider name
    UUID attachmentUuid = UUID.randomUUID(); // UUID | Attachment UUID
    try {
      File result = apiInstance.downloadSharedAttachment(provider, attachmentUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#downloadSharedAttachment");
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
| **provider** | **String**| Sharing provider name | |
| **attachmentUuid** | **UUID**| Attachment UUID | |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="envelopeApproval"></a>
# **envelopeApproval**
> envelopeApproval(mailbox, approvalStatusDTO)

Approve or Reject envelopes

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    ApprovalStatusDTO approvalStatusDTO = new ApprovalStatusDTO(); // ApprovalStatusDTO | 
    try {
      apiInstance.envelopeApproval(mailbox, approvalStatusDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#envelopeApproval");
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
| **approvalStatusDTO** | [**ApprovalStatusDTO**](ApprovalStatusDTO.md)|  | |

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

<a id="envelopeApprovalHistory"></a>
# **envelopeApprovalHistory**
> List&lt;EnvelopeApprovalHistoryDTO&gt; envelopeApprovalHistory(id, mailbox)

Get approval history

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<EnvelopeApprovalHistoryDTO> result = apiInstance.envelopeApprovalHistory(id, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#envelopeApprovalHistory");
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
| **id** | **UUID**| Envelope UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**List&lt;EnvelopeApprovalHistoryDTO&gt;**](EnvelopeApprovalHistoryDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fill"></a>
# **fill**
> fill(mailbox, envDTO)

Fill envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvDTO envDTO = new EnvDTO(); // EnvDTO | 
    try {
      apiInstance.fill(mailbox, envDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#fill");
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
| **envDTO** | [**EnvDTO**](EnvDTO.md)|  | |

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

<a id="generateStamp"></a>
# **generateStamp**
> File generateStamp(mailbox, stampRequestDTO)

Generate stamp by certificate

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    StampRequestDTO stampRequestDTO = new StampRequestDTO(); // StampRequestDTO | 
    try {
      File result = apiInstance.generateStamp(mailbox, stampRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#generateStamp");
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
| **stampRequestDTO** | [**StampRequestDTO**](StampRequestDTO.md)|  | |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getActiveRoles"></a>
# **getActiveRoles**
> List&lt;SingleUuidDTO&gt; getActiveRoles(id, mailbox)

Get active roles by Envelope UUID

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | UUID of envelope to get active roles from
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<SingleUuidDTO> result = apiInstance.getActiveRoles(id, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getActiveRoles");
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
| **id** | **UUID**| UUID of envelope to get active roles from | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**List&lt;SingleUuidDTO&gt;**](SingleUuidDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApprovalFlow"></a>
# **getApprovalFlow**
> EnvelopeApprovalHistoryDTO getApprovalFlow(id, flowUuid, mailbox)

Get envelope approval

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope to approve
    UUID flowUuid = UUID.randomUUID(); // UUID | Flow to approve
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      EnvelopeApprovalHistoryDTO result = apiInstance.getApprovalFlow(id, flowUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getApprovalFlow");
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
| **id** | **UUID**| Envelope to approve | |
| **flowUuid** | **UUID**| Flow to approve | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**EnvelopeApprovalHistoryDTO**](EnvelopeApprovalHistoryDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getArchiveInfo"></a>
# **getArchiveInfo**
> ArchiveAttachmentInfo getArchiveInfo(attachmentId, mailbox, envelopeId, convert2Pdf)

Get attachment archive info (p7s, asice, pdf)

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID attachmentId = UUID.randomUUID(); // UUID | Attachment UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UUID envelopeId = UUID.randomUUID(); // UUID | Envelope UUID
    Boolean convert2Pdf = true; // Boolean | Convert to PDF
    try {
      ArchiveAttachmentInfo result = apiInstance.getArchiveInfo(attachmentId, mailbox, envelopeId, convert2Pdf);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getArchiveInfo");
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
| **attachmentId** | **UUID**| Attachment UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **envelopeId** | **UUID**| Envelope UUID | [optional] |
| **convert2Pdf** | **Boolean**| Convert to PDF | [optional] |

### Return type

[**ArchiveAttachmentInfo**](ArchiveAttachmentInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAttachmentPageSizes"></a>
# **getAttachmentPageSizes**
> PdfPageSizes getAttachmentPageSizes(attachmentUuid, mailbox, envelopeUuid)

Get attachment page sizes

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID attachmentUuid = UUID.randomUUID(); // UUID | Attachment UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    UUID envelopeUuid = UUID.randomUUID(); // UUID | Envelope UUID
    try {
      PdfPageSizes result = apiInstance.getAttachmentPageSizes(attachmentUuid, mailbox, envelopeUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getAttachmentPageSizes");
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
| **attachmentUuid** | **UUID**| Attachment UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **envelopeUuid** | **UUID**| Envelope UUID | [optional] |

### Return type

[**PdfPageSizes**](PdfPageSizes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getChainEnvelopes"></a>
# **getChainEnvelopes**
> List&lt;ChainEnvelopeDTO&gt; getChainEnvelopes(chainId, mailbox)

Get chain envelopes list

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID chainId = UUID.randomUUID(); // UUID | Chain UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<ChainEnvelopeDTO> result = apiInstance.getChainEnvelopes(chainId, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getChainEnvelopes");
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
| **chainId** | **UUID**| Chain UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**List&lt;ChainEnvelopeDTO&gt;**](ChainEnvelopeDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDocumentFileForSign"></a>
# **getDocumentFileForSign**
> File getDocumentFileForSign(id, documentId, mailbox, xml)

Get BINARY or XML for signing

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    String documentId = "documentId_example"; // String | Document ID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Boolean xml = true; // Boolean | Is XML?
    try {
      File result = apiInstance.getDocumentFileForSign(id, documentId, mailbox, xml);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getDocumentFileForSign");
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
| **id** | **UUID**| Envelope UUID | |
| **documentId** | **String**| Document ID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **xml** | **Boolean**| Is XML? | [optional] |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDocumentPrintVersion"></a>
# **getDocumentPrintVersion**
> File getDocumentPrintVersion(id, documentId, mailbox, wait)

Get document PDF for printing

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    String documentId = "documentId_example"; // String | Document id
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Boolean wait = true; // Boolean | Wait for a file instead of 425 error
    try {
      File result = apiInstance.getDocumentPrintVersion(id, documentId, mailbox, wait);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getDocumentPrintVersion");
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
| **id** | **UUID**| Envelope UUID | |
| **documentId** | **String**| Document id | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **wait** | **Boolean**| Wait for a file instead of 425 error | [optional] |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDocumentsForSign"></a>
# **getDocumentsForSign**
> List&lt;DocumentForSigningDTO&gt; getDocumentsForSign(id, mailbox, documentsForSignRequestDTO, sessionId, wait, forceGost)

BINARYs and XMLs for signing

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    DocumentsForSignRequestDTO documentsForSignRequestDTO = new DocumentsForSignRequestDTO(); // DocumentsForSignRequestDTO | 
    UUID sessionId = UUID.randomUUID(); // UUID | Mass signing session UUID
    Boolean wait = true; // Boolean | Wait for a file instead of 425 error
    Boolean forceGost = true; // Boolean | 
    try {
      List<DocumentForSigningDTO> result = apiInstance.getDocumentsForSign(id, mailbox, documentsForSignRequestDTO, sessionId, wait, forceGost);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getDocumentsForSign");
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
| **id** | **UUID**| Envelope UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **documentsForSignRequestDTO** | [**DocumentsForSignRequestDTO**](DocumentsForSignRequestDTO.md)|  | |
| **sessionId** | **UUID**| Mass signing session UUID | [optional] |
| **wait** | **Boolean**| Wait for a file instead of 425 error | [optional] |
| **forceGost** | **Boolean**|  | [optional] |

### Return type

[**List&lt;DocumentForSigningDTO&gt;**](DocumentForSigningDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEnvelopeByUuid"></a>
# **getEnvelopeByUuid**
> EnvelopeWithTemplateDTO getEnvelopeByUuid(envelopeUuid, mailbox)

Retrieve envelope by UUID

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID envelopeUuid = UUID.randomUUID(); // UUID | UUID of envelope to retrieve
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      EnvelopeWithTemplateDTO result = apiInstance.getEnvelopeByUuid(envelopeUuid, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getEnvelopeByUuid");
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
| **envelopeUuid** | **UUID**| UUID of envelope to retrieve | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**EnvelopeWithTemplateDTO**](EnvelopeWithTemplateDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEnvelopeComments"></a>
# **getEnvelopeComments**
> List&lt;DocumentCommentsDTO&gt; getEnvelopeComments(id, mailbox)

Get envelope comments for each document

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      List<DocumentCommentsDTO> result = apiInstance.getEnvelopeComments(id, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getEnvelopeComments");
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
| **id** | **UUID**| Envelope UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**List&lt;DocumentCommentsDTO&gt;**](DocumentCommentsDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEnvelopeInviteAuthorized"></a>
# **getEnvelopeInviteAuthorized**
> InvitedEnvelopeInfoDTO getEnvelopeInviteAuthorized(code)

Get information about envelope by the invitation code (by already registered user)

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    String code = "code_example"; // String | Invitation code from email
    try {
      InvitedEnvelopeInfoDTO result = apiInstance.getEnvelopeInviteAuthorized(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getEnvelopeInviteAuthorized");
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
| **code** | **String**| Invitation code from email | |

### Return type

[**InvitedEnvelopeInfoDTO**](InvitedEnvelopeInfoDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEnvelopeInviteUnauthorized"></a>
# **getEnvelopeInviteUnauthorized**
> InvitedEnvelopeInfoDTO getEnvelopeInviteUnauthorized(code)

Get information about envelope by the invitation code (by unauthenticated user)

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    String code = "code_example"; // String | Invitation code from email
    try {
      InvitedEnvelopeInfoDTO result = apiInstance.getEnvelopeInviteUnauthorized(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getEnvelopeInviteUnauthorized");
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
| **code** | **String**| Invitation code from email | |

### Return type

[**InvitedEnvelopeInfoDTO**](InvitedEnvelopeInfoDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEnvelopeSharedZip"></a>
# **getEnvelopeSharedZip**
> File getEnvelopeSharedZip(code)

Get shared zip archive

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    String code = "code_example"; // String | Code for downloading
    try {
      File result = apiInstance.getEnvelopeSharedZip(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getEnvelopeSharedZip");
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
| **code** | **String**| Code for downloading | |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEnvelopeZip"></a>
# **getEnvelopeZip**
> File getEnvelopeZip(id, documentId, excludeFiles, zipStructureName, wait, accessCode, mailbox)

Get envelope or document zip archive

Anonymous users download it with the access code of a payment link; files visible only to some roles are not included

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    String documentId = "documentId_example"; // String | Document ID
    String excludeFiles = "excludeFiles_example"; // String | Mask to exclude some files. c - for signature/processing Certificate, p - for Printable version, a - for Audit trail
    String zipStructureName = "zipStructureName_example"; // String | The name of pre-saved zip structure in the template
    Boolean wait = true; // Boolean | Wait for a file instead of 425 error
    String accessCode = "accessCode_example"; // String | Access code of a payment link, for anonymous users
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      File result = apiInstance.getEnvelopeZip(id, documentId, excludeFiles, zipStructureName, wait, accessCode, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getEnvelopeZip");
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
| **id** | **UUID**| Envelope UUID | |
| **documentId** | **String**| Document ID | [optional] |
| **excludeFiles** | **String**| Mask to exclude some files. c - for signature/processing Certificate, p - for Printable version, a - for Audit trail | [optional] |
| **zipStructureName** | **String**| The name of pre-saved zip structure in the template | [optional] |
| **wait** | **Boolean**| Wait for a file instead of 425 error | [optional] |
| **accessCode** | **String**| Access code of a payment link, for anonymous users | [optional] |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | [optional] |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMassSigningReport"></a>
# **getMassSigningReport**
> File getMassSigningReport(sessionId, mailbox)

Get mass signing report

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID sessionId = UUID.randomUUID(); // UUID | Mass signing session UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      File result = apiInstance.getMassSigningReport(sessionId, mailbox);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getMassSigningReport");
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
| **sessionId** | **UUID**| Mass signing session UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPaymentDetails"></a>
# **getPaymentDetails**
> PaymentDetails getPaymentDetails(accessCode)

Get payment details of a payment link for the checkout page

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    String accessCode = "accessCode_example"; // String | Access code from the payment link
    try {
      PaymentDetails result = apiInstance.getPaymentDetails(accessCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getPaymentDetails");
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
| **accessCode** | **String**| Access code from the payment link | |

### Return type

[**PaymentDetails**](PaymentDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPaymentLink"></a>
# **getPaymentLink**
> PaymentLink getPaymentLink(id, mailbox, paymentLinkRequest)

Get the public checkout link of a QR pay field; the role of the field must be completed

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    PaymentLinkRequest paymentLinkRequest = new PaymentLinkRequest(); // PaymentLinkRequest | 
    try {
      PaymentLink result = apiInstance.getPaymentLink(id, mailbox, paymentLinkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getPaymentLink");
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
| **id** | **UUID**| Envelope UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **paymentLinkRequest** | [**PaymentLinkRequest**](PaymentLinkRequest.md)|  | |

### Return type

[**PaymentLink**](PaymentLink.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getUserPendingInvitations"></a>
# **getUserPendingInvitations**
> PageDTOEnvelopeToMailboxDTO getUserPendingInvitations(type, offset, limit)

Get user&#39;s pending invitations

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    String type = "envelope-invite"; // String | Invitation type
    Integer offset = 0; // Integer | Offset, how much envelopes to skip
    Integer limit = 25; // Integer | Limit, how much envelopes to retrieve
    try {
      PageDTOEnvelopeToMailboxDTO result = apiInstance.getUserPendingInvitations(type, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#getUserPendingInvitations");
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
| **type** | **String**| Invitation type | [optional] [enum: envelope-invite, approval-invite, review-invite] |
| **offset** | **Integer**| Offset, how much envelopes to skip | [optional] [default to 0] |
| **limit** | **Integer**| Limit, how much envelopes to retrieve | [optional] [default to 25] |

### Return type

[**PageDTOEnvelopeToMailboxDTO**](PageDTOEnvelopeToMailboxDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="markEnvelopesAsRead"></a>
# **markEnvelopesAsRead**
> markEnvelopesAsRead(mailbox, markAsReadRequest)

Mark envelopes as read by mailbox

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    MarkAsReadRequest markAsReadRequest = new MarkAsReadRequest(); // MarkAsReadRequest | 
    try {
      apiInstance.markEnvelopesAsRead(mailbox, markAsReadRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#markEnvelopesAsRead");
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
| **markAsReadRequest** | [**MarkAsReadRequest**](MarkAsReadRequest.md)|  | |

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

<a id="mergeEnvelopesIntoChain"></a>
# **mergeEnvelopesIntoChain**
> SingleUuidDTO mergeEnvelopesIntoChain(mailbox, UUID)

Merge envelopes into chain

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Set<UUID> UUID = new LinkedHashSet<>(); // Set<UUID> | 
    try {
      SingleUuidDTO result = apiInstance.mergeEnvelopesIntoChain(mailbox, UUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#mergeEnvelopesIntoChain");
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

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="numberToText"></a>
# **numberToText**
> String numberToText(numberToTextRequest)

Convert a numeric amount to words

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    NumberToTextRequest numberToTextRequest = new NumberToTextRequest(); // NumberToTextRequest | 
    try {
      String result = apiInstance.numberToText(numberToTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#numberToText");
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
| **numberToTextRequest** | [**NumberToTextRequest**](NumberToTextRequest.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="oneTimeSend"></a>
# **oneTimeSend**
> SingleUuidDTO oneTimeSend(mailbox, oneTimeSendDTO)

The envelope will be sent just once (template will be marked as deleted)

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    OneTimeSendDTO oneTimeSendDTO = new OneTimeSendDTO(); // OneTimeSendDTO | 
    try {
      SingleUuidDTO result = apiInstance.oneTimeSend(mailbox, oneTimeSendDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#oneTimeSend");
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
| **oneTimeSendDTO** | [**OneTimeSendDTO**](OneTimeSendDTO.md)|  | |

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

<a id="publicQuickSendWithOneExternalDocument"></a>
# **publicQuickSendWithOneExternalDocument**
> IdResult publicQuickSendWithOneExternalDocument(data, _file)

Public quick send envelope with one external document

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    PublicQuickSend data = new PublicQuickSend(); // PublicQuickSend | 
    File _file = new File("/path/to/file"); // File | File for external document
    try {
      IdResult result = apiInstance.publicQuickSendWithOneExternalDocument(data, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#publicQuickSendWithOneExternalDocument");
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
| **data** | [**PublicQuickSend**](PublicQuickSend.md)|  | |
| **_file** | **File**| File for external document | |

### Return type

[**IdResult**](IdResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="quickSendExternalDocuments"></a>
# **quickSendExternalDocuments**
> SingleUuidDTO quickSendExternalDocuments(mailbox, data, files)

Quick send envelope with external documents only

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    QuickSendDTO data = new QuickSendDTO(); // QuickSendDTO | 
    List<File> files = Arrays.asList(); // List<File> | Files for external documents
    try {
      SingleUuidDTO result = apiInstance.quickSendExternalDocuments(mailbox, data, files);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#quickSendExternalDocuments");
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
| **data** | [**QuickSendDTO**](QuickSendDTO.md)|  | |
| **files** | **List&lt;File&gt;**| Files for external documents | |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="recycleBin"></a>
# **recycleBin**
> recycleBin(flag, mailbox, bulkEnvelopeActionDTO)

Archive envelopes

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    Boolean flag = true; // Boolean | 
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    BulkEnvelopeActionDTO bulkEnvelopeActionDTO = new BulkEnvelopeActionDTO(); // BulkEnvelopeActionDTO | 
    try {
      apiInstance.recycleBin(flag, mailbox, bulkEnvelopeActionDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#recycleBin");
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
| **flag** | **Boolean**|  | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **bulkEnvelopeActionDTO** | [**BulkEnvelopeActionDTO**](BulkEnvelopeActionDTO.md)|  | |

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

<a id="removeEnvelopeFromChain"></a>
# **removeEnvelopeFromChain**
> removeEnvelopeFromChain(id, mailbox)

Remove envelope from chain

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    try {
      apiInstance.removeEnvelopeFromChain(id, mailbox);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#removeEnvelopeFromChain");
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
| **id** | **UUID**| Envelope UUID | |
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

<a id="removeEnvelopesFromChain"></a>
# **removeEnvelopesFromChain**
> removeEnvelopesFromChain(mailbox, UUID)

Remove envelopes from chain

Remove one or more envelopes from chain. Send list of envelope UUIDs in the request body to be removed from the chain. 

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Set<UUID> UUID = new LinkedHashSet<>(); // Set<UUID> | 
    try {
      apiInstance.removeEnvelopesFromChain(mailbox, UUID);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#removeEnvelopesFromChain");
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

<a id="resendNotifications"></a>
# **resendNotifications**
> resendNotifications(mailbox, reportEnvelopeRequestDTO)

Resend notifications for active roles

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    ReportEnvelopeRequestDTO reportEnvelopeRequestDTO = new ReportEnvelopeRequestDTO(); // ReportEnvelopeRequestDTO | 
    try {
      apiInstance.resendNotifications(mailbox, reportEnvelopeRequestDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#resendNotifications");
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
| **200** | OK |  -  |

<a id="resolvedEnvelopeComment"></a>
# **resolvedEnvelopeComment**
> resolvedEnvelopeComment(id, mailbox, resolveCommentThreadDTO)

Set Resolved Flag for comment thread

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    ResolveCommentThreadDTO resolveCommentThreadDTO = new ResolveCommentThreadDTO(); // ResolveCommentThreadDTO | 
    try {
      apiInstance.resolvedEnvelopeComment(id, mailbox, resolveCommentThreadDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#resolvedEnvelopeComment");
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
| **id** | **UUID**| Envelope UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **resolveCommentThreadDTO** | [**ResolveCommentThreadDTO**](ResolveCommentThreadDTO.md)|  | |

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

<a id="revokeEnvelopeSharing"></a>
# **revokeEnvelopeSharing**
> revokeEnvelopeSharing(mailbox, envelopeSharedCopyRequestDTO)

Revoke sharing an envelope copy

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvelopeSharedCopyRequestDTO envelopeSharedCopyRequestDTO = new EnvelopeSharedCopyRequestDTO(); // EnvelopeSharedCopyRequestDTO | 
    try {
      apiInstance.revokeEnvelopeSharing(mailbox, envelopeSharedCopyRequestDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#revokeEnvelopeSharing");
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
| **envelopeSharedCopyRequestDTO** | [**EnvelopeSharedCopyRequestDTO**](EnvelopeSharedCopyRequestDTO.md)|  | |

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

<a id="reworkEditorialReview"></a>
# **reworkEditorialReview**
> reworkEditorialReview(id, mailbox, reviewReworkRequest)

Send editorial review back for rework

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Id of envelope
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    ReviewReworkRequest reviewReworkRequest = new ReviewReworkRequest(); // ReviewReworkRequest | 
    try {
      apiInstance.reworkEditorialReview(id, mailbox, reviewReworkRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#reworkEditorialReview");
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
| **id** | **UUID**| Id of envelope | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **reviewReworkRequest** | [**ReviewReworkRequest**](ReviewReworkRequest.md)|  | [optional] |

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

<a id="send"></a>
# **send**
> SingleUuidDTO send(mailbox, envPostDTO)

Send envelope

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvPostDTO envPostDTO = new EnvPostDTO(); // EnvPostDTO | 
    try {
      SingleUuidDTO result = apiInstance.send(mailbox, envPostDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#send");
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
| **envPostDTO** | [**EnvPostDTO**](EnvPostDTO.md)|  | |

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

<a id="sendByTemplateCode"></a>
# **sendByTemplateCode**
> LoginEnvelopeResponseDTO sendByTemplateCode(sendEnvByCodeDTO)

Send envelope by template code

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    SendEnvByCodeDTO sendEnvByCodeDTO = new SendEnvByCodeDTO(); // SendEnvByCodeDTO | 
    try {
      LoginEnvelopeResponseDTO result = apiInstance.sendByTemplateCode(sendEnvByCodeDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#sendByTemplateCode");
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
| **sendEnvByCodeDTO** | [**SendEnvByCodeDTO**](SendEnvByCodeDTO.md)|  | |

### Return type

[**LoginEnvelopeResponseDTO**](LoginEnvelopeResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **405** | Method disabled by configuration |  -  |

<a id="sendForApproval"></a>
# **sendForApproval**
> SingleUuidDTO sendForApproval(mailbox, envelopeApprovalRequestDTO)

Send envelope for approval

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvelopeApprovalRequestDTO envelopeApprovalRequestDTO = new EnvelopeApprovalRequestDTO(); // EnvelopeApprovalRequestDTO | 
    try {
      SingleUuidDTO result = apiInstance.sendForApproval(mailbox, envelopeApprovalRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#sendForApproval");
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
| **envelopeApprovalRequestDTO** | [**EnvelopeApprovalRequestDTO**](EnvelopeApprovalRequestDTO.md)|  | |

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
| **200** | OK |  -  |

<a id="shareEnvelopesByEmail"></a>
# **shareEnvelopesByEmail**
> shareEnvelopesByEmail(mailbox, envelopeSharedArchiveRequestDTO)

Share envelopes by email

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvelopeSharedArchiveRequestDTO envelopeSharedArchiveRequestDTO = new EnvelopeSharedArchiveRequestDTO(); // EnvelopeSharedArchiveRequestDTO | 
    try {
      apiInstance.shareEnvelopesByEmail(mailbox, envelopeSharedArchiveRequestDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#shareEnvelopesByEmail");
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
| **envelopeSharedArchiveRequestDTO** | [**EnvelopeSharedArchiveRequestDTO**](EnvelopeSharedArchiveRequestDTO.md)|  | |

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

<a id="shareEnvelopesCopy"></a>
# **shareEnvelopesCopy**
> ShareEnvelopesResult shareEnvelopesCopy(mailbox, envelopeSharedCopyRequestDTO)

Share envelopes copies

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvelopeSharedCopyRequestDTO envelopeSharedCopyRequestDTO = new EnvelopeSharedCopyRequestDTO(); // EnvelopeSharedCopyRequestDTO | 
    try {
      ShareEnvelopesResult result = apiInstance.shareEnvelopesCopy(mailbox, envelopeSharedCopyRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#shareEnvelopesCopy");
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
| **envelopeSharedCopyRequestDTO** | [**EnvelopeSharedCopyRequestDTO**](EnvelopeSharedCopyRequestDTO.md)|  | |

### Return type

[**ShareEnvelopesResult**](ShareEnvelopesResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="signEnvelope"></a>
# **signEnvelope**
> signEnvelope(id, mailbox, envelopeDocumentSignaturesDTO, sessionId)

Sign envelope documents

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: formAuth
    ApiKeyAuth formAuth = (ApiKeyAuth) defaultClient.getAuthentication("formAuth");
    formAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //formAuth.setApiKeyPrefix("Token");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope to update
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    List<EnvelopeDocumentSignaturesDTO> envelopeDocumentSignaturesDTO = Arrays.asList(); // List<EnvelopeDocumentSignaturesDTO> | 
    UUID sessionId = UUID.randomUUID(); // UUID | Mass signing session UUID
    try {
      apiInstance.signEnvelope(id, mailbox, envelopeDocumentSignaturesDTO, sessionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#signEnvelope");
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
| **id** | **UUID**| Envelope to update | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **envelopeDocumentSignaturesDTO** | [**List&lt;EnvelopeDocumentSignaturesDTO&gt;**](EnvelopeDocumentSignaturesDTO.md)|  | |
| **sessionId** | **UUID**| Mass signing session UUID | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [formAuth](../README.md#formAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="signSES"></a>
# **signSES**
> signSES(id, mailbox, body, sessionId)

Sign envelope with SES

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope to fill
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    String body = "body_example"; // String | 
    UUID sessionId = UUID.randomUUID(); // UUID | Mass signing session UUID
    try {
      apiInstance.signSES(id, mailbox, body, sessionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#signSES");
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
| **id** | **UUID**| Envelope to fill | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **body** | **String**|  | |
| **sessionId** | **UUID**| Mass signing session UUID | [optional] |

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

<a id="startEditorialReviewForExternalDocuments"></a>
# **startEditorialReviewForExternalDocuments**
> SingleUuidDTO startEditorialReviewForExternalDocuments(mailbox, data, files)

Start editorial review of DOC, DOCX

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EditorialReviewInitRequest data = new EditorialReviewInitRequest(); // EditorialReviewInitRequest | 
    List<File> files = Arrays.asList(); // List<File> | Files for external documents
    try {
      SingleUuidDTO result = apiInstance.startEditorialReviewForExternalDocuments(mailbox, data, files);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#startEditorialReviewForExternalDocuments");
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
| **data** | [**EditorialReviewInitRequest**](EditorialReviewInitRequest.md)|  | |
| **files** | **List&lt;File&gt;**| Files for external documents | |

### Return type

[**SingleUuidDTO**](SingleUuidDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="updateEnvelope"></a>
# **updateEnvelope**
> updateEnvelope(mailbox, envPutDTO)

Update envelope without sending

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    EnvPutDTO envPutDTO = new EnvPutDTO(); // EnvPutDTO | 
    try {
      apiInstance.updateEnvelope(mailbox, envPutDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#updateEnvelope");
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
| **envPutDTO** | [**EnvPutDTO**](EnvPutDTO.md)|  | |

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

<a id="updateEnvelopeComment"></a>
# **updateEnvelopeComment**
> CommentThreadDTO updateEnvelopeComment(id, mailbox, commentPutDTO)

Add/Update envelope comment in thread

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    CommentPutDTO commentPutDTO = new CommentPutDTO(); // CommentPutDTO | 
    try {
      CommentThreadDTO result = apiInstance.updateEnvelopeComment(id, mailbox, commentPutDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#updateEnvelopeComment");
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
| **id** | **UUID**| Envelope UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **commentPutDTO** | [**CommentPutDTO**](CommentPutDTO.md)|  | |

### Return type

[**CommentThreadDTO**](CommentThreadDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateEnvelopeCommentAccess"></a>
# **updateEnvelopeCommentAccess**
> CommentThreadDTO updateEnvelopeCommentAccess(id, mailbox, commentAccessDTO)

Update envelope comment thread access level

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Envelope UUID
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    CommentAccessDTO commentAccessDTO = new CommentAccessDTO(); // CommentAccessDTO | 
    try {
      CommentThreadDTO result = apiInstance.updateEnvelopeCommentAccess(id, mailbox, commentAccessDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#updateEnvelopeCommentAccess");
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
| **id** | **UUID**| Envelope UUID | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **commentAccessDTO** | [**CommentAccessDTO**](CommentAccessDTO.md)|  | |

### Return type

[**CommentThreadDTO**](CommentThreadDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateEnvelopeMetadata"></a>
# **updateEnvelopeMetadata**
> updateEnvelopeMetadata(id, mailbox, requestBody)

Update envelope metadata. Will be saved on the account level

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    Map<String, String> requestBody = new HashMap(); // Map<String, String> | 
    try {
      apiInstance.updateEnvelopeMetadata(id, mailbox, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#updateEnvelopeMetadata");
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
| **id** | **UUID**|  | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **requestBody** | [**Map&lt;String, String&gt;**](String.md)|  | |

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

<a id="updateFlow"></a>
# **updateFlow**
> updateFlow(id, mailbox, flowUpdate)

Update recipient email/mailbox for not finished roles in a sent envelope

Sender can change addressee for any role whose invitation has not been accepted yet. Old invitation codes are revoked and new notifications are sent. Limited to one change per envelope per minute.

### Example
```java
// Import classes:
import com.docstudio.client.ApiClient;
import com.docstudio.client.ApiException;
import com.docstudio.client.Configuration;
import com.docstudio.client.auth.*;
import com.docstudio.client.models.*;
import com.docstudio.client.api.EnvelopeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.docstudio.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EnvelopeControllerApi apiInstance = new EnvelopeControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | UUID of envelope
    UUID mailbox = UUID.randomUUID(); // UUID | Mailbox context, HTTP Header with current mailbox UUID
    List<FlowUpdate> flowUpdate = Arrays.asList(); // List<FlowUpdate> | 
    try {
      apiInstance.updateFlow(id, mailbox, flowUpdate);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeControllerApi#updateFlow");
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
| **id** | **UUID**| UUID of envelope | |
| **mailbox** | **UUID**| Mailbox context, HTTP Header with current mailbox UUID | |
| **flowUpdate** | [**List&lt;FlowUpdate&gt;**](FlowUpdate.md)|  | |

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

