# EnvelopeToMailboxDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**envelopeUuid** | [**UUID**](UUID.md) |  |  [optional]
**subject** | **String** |  |  [optional]
**message** | **String** |  |  [optional]
**archived** | **Boolean** |  |  [optional]
**deleted** | **Boolean** |  |  [optional]
**sentByMe** | **Boolean** | Flag meaning &#x27;outbox&#x27;. Probably not necessary on UI |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Envelope creation date |  [optional]
**receivedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date of receiving the envelope by the mailbox |  [optional]
**seenAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date-time it was seen by receiver |  [optional]
**expiredAfter** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**sharingForbidden** | **Boolean** | Sharing by email is forbidden |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**accountUUID** | [**UUID**](UUID.md) | Sender account UUID |  [optional]
**mailboxUUID** | [**UUID**](UUID.md) | UUID of sender |  [optional]
**mailboxName** | **String** | Mailbox name of sender |  [optional]
**total** | **Integer** | Total number of participants |  [optional]
**completed** | **Integer** | Number of participants processed |  [optional]
**labels** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**templateUuid** | [**UUID**](UUID.md) | Envelope template UUID |  [optional]
**templateName** | **String** | Envelope template name |  [optional]
**invitationCode** | **String** | Invitation code, if acceptable |  [optional]
**chainUuid** | [**UUID**](UUID.md) | Envelope chain UUID |  [optional]
**chainedByMe** | **Boolean** | Envelope chained by requested user |  [optional]
**extraFields** | [**List&lt;EnvelopeExtraFieldDTO&gt;**](EnvelopeExtraFieldDTO.md) | Data for extra columns |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
DRAFT | &quot;DRAFT&quot;
SENT | &quot;SENT&quot;
WAITING | &quot;WAITING&quot;
COMPLETED | &quot;COMPLETED&quot;
CANCELLED | &quot;CANCELLED&quot;
EXPIRED | &quot;EXPIRED&quot;
ON_APPROVAL | &quot;ON_APPROVAL&quot;
