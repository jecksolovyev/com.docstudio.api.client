

# EnvelopeToMailboxDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountUUID** | **UUID** | Sender account UUID |  [optional] |
|**archived** | **Boolean** | Is envelope archived? |  [optional] |
|**chainUuid** | **UUID** | Envelope chain UUID |  [optional] |
|**chainedByMe** | **Boolean** | Envelope chained by requested user |  [optional] |
|**completed** | **Integer** | Number of participants processed |  [optional] |
|**createdAt** | **OffsetDateTime** | Envelope creation date |  [optional] |
|**deleted** | **Boolean** | Is envelope in recycle bin? |  [optional] |
|**envelopeUuid** | **UUID** |  |  [optional] |
|**expiredAfter** | **OffsetDateTime** |  |  [optional] |
|**extraFields** | [**List&lt;EnvelopeExtraFieldDTO&gt;**](EnvelopeExtraFieldDTO.md) | Data for extra columns |  [optional] |
|**formId** | **UUID** | UUID of the form from which the envelope was created |  [optional] |
|**invitationCode** | **String** | Invitation code, if acceptable |  [optional] |
|**labels** | **List&lt;UUID&gt;** |  |  [optional] |
|**mailboxName** | **String** | Mailbox name of sender |  [optional] |
|**mailboxUUID** | **UUID** | UUID of sender |  [optional] |
|**message** | **String** | Message of the envelope |  [optional] |
|**receivedAt** | **OffsetDateTime** | Date of receiving the envelope by the mailbox |  [optional] |
|**seenAt** | **OffsetDateTime** | Date-time it was seen by receiver |  [optional] |
|**sentAt** | **OffsetDateTime** | The envelope sending date |  [optional] |
|**sentByMe** | **Boolean** | Flag meaning &#39;outbox&#39;. Probably not necessary on UI |  [optional] |
|**shared** | **Boolean** | Is envelope shared to the mailbox? (if the mailbox is not in the main flow) |  [optional] |
|**sharingForbidden** | **Boolean** | Sharing by email is forbidden |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**subject** | **String** | Subject of the envelope |  [optional] |
|**templateName** | **String** | Envelope template name |  [optional] |
|**templateUuid** | **UUID** | Envelope template UUID |  [optional] |
|**templateVersion** | **UUID** | Envelope template version |  [optional] |
|**total** | **Integer** | Total number of participants |  [optional] |



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



