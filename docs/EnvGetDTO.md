# EnvGetDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | UUID of envelope |  [optional]
**data** | **String** | Envelope XML |  [optional]
**receivedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date of receiving the envelope by the mailbox |  [optional]
**labels** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**total** | **Integer** | Total number of participants |  [optional]
**completed** | **Integer** | Number of participants who completed their processing |  [optional]
**chainUuid** | [**UUID**](UUID.md) | Envelope chain UUID |  [optional]
**chainedByMe** | **Boolean** | Envelope chained by requested user |  [optional]
**approvalFlowUuid** | [**UUID**](UUID.md) | Approval flow UUID |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Calculated status for mailbox |  [optional]
**sender** | [**EnvelopeSenderDTO**](EnvelopeSenderDTO.md) |  |  [optional]

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
