

# EnvelopeToMailboxDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**envelopeUuid** | **UUID** |  |  [optional] |
|**subject** | **String** | Subject of the envelope |  [optional] |
|**message** | **String** | Message of the envelope |  [optional] |
|**archived** | **Boolean** | Is envelope archived? |  [optional] |
|**deleted** | **Boolean** | Is envelope in recycle bin? |  [optional] |
|**shared** | **Boolean** | Is envelope shared to the mailbox? (if the mailbox is not in the main flow) |  [optional] |
|**sentByMe** | **Boolean** | Flag meaning &#39;outbox&#39;. Probably not necessary on UI |  [optional] |
|**createdAt** | **OffsetDateTime** | Envelope creation date |  [optional] |
|**receivedAt** | **OffsetDateTime** | Date of receiving the envelope by the mailbox |  [optional] |
|**sentAt** | **OffsetDateTime** | The envelope sending date |  [optional] |
|**seenAt** | **OffsetDateTime** | Date-time it was seen by receiver |  [optional] |
|**expiredAfter** | **OffsetDateTime** |  |  [optional] |
|**sharingForbidden** | **Boolean** | Sharing by email is forbidden |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**accountUUID** | **UUID** | Sender account UUID |  [optional] |
|**mailboxUUID** | **UUID** | UUID of sender |  [optional] |
|**mailboxName** | **String** | Mailbox name of sender |  [optional] |
|**total** | **Integer** | Total number of participants |  [optional] |
|**completed** | **Integer** | Number of participants processed |  [optional] |
|**labels** | **List&lt;Object&gt;** |  |  [optional] |
|**templateUuid** | **UUID** | Envelope template UUID |  [optional] |
|**templateVersion** | **UUID** | Envelope template version |  [optional] |
|**templateName** | **String** | Envelope template name |  [optional] |
|**invitationCode** | **String** | Invitation code, if acceptable |  [optional] |
|**chainUuid** | **UUID** | Envelope chain UUID |  [optional] |
|**chainedByMe** | **Boolean** | Envelope chained by requested user |  [optional] |
|**extraFields** | [**List&lt;EnvelopeExtraFieldDTO&gt;**](EnvelopeExtraFieldDTO.md) | Data for extra columns |  [optional] |



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



