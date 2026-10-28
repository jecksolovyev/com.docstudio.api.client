

# EnvGetDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvalFlowUuid** | **UUID** | Approval flow UUID |  [optional] |
|**archived** | **Boolean** | Is envelope archived? |  [optional] |
|**chainUuid** | **UUID** | Envelope chain UUID |  [optional] |
|**chainedByMe** | **Boolean** | Envelope chained by requested user |  [optional] |
|**completed** | **Integer** | Number of participants who completed their processing |  [optional] |
|**createdAt** | **OffsetDateTime** | Envelope creation date |  [optional] |
|**data** | **String** | Envelope XML |  [optional] |
|**deleted** | **Boolean** | Is envelope in recycle bin? |  [optional] |
|**labels** | **Set&lt;UUID&gt;** |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Envelope metadata |  [optional] |
|**receivedAt** | **OffsetDateTime** | Date of receiving the envelope by the mailbox |  [optional] |
|**savedDocSignatures** | [**List&lt;ExtEnvelopeDocumentSignaturesDTO&gt;**](ExtEnvelopeDocumentSignaturesDTO.md) |  |  [optional] |
|**sender** | [**EnvelopeSenderDTO**](EnvelopeSenderDTO.md) | Envelope sender info |  [optional] |
|**sentAt** | **OffsetDateTime** | Envelope sending date |  [optional] |
|**shared** | **Boolean** | Is envelope shared to the mailbox? (if the mailbox is not in the main flow) |  [optional] |
|**sharedTo** | [**List&lt;EnvSharedToDTO&gt;**](EnvSharedToDTO.md) | Mailboxes the envelope shared with |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Calculated status for mailbox |  [optional] |
|**total** | **Integer** | Total number of participants |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Extended envelope type |  [optional] |
|**uuid** | **UUID** | UUID of envelope |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| SENT | &quot;SENT&quot; |
| WAITING | &quot;WAITING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| ON_APPROVAL | &quot;ON_APPROVAL&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EDITORIAL_REVIEW | &quot;editorialReview&quot; |



