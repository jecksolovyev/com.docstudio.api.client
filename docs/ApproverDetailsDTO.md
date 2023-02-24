# ApproverDetailsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mailboxUuid** | [**UUID**](UUID.md) |  |  [optional]
**mailboxName** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**order** | **Integer** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**seenAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**comment** | **String** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NOT_STARTED | &quot;NOT_STARTED&quot;
WAITING | &quot;WAITING&quot;
APPROVED | &quot;APPROVED&quot;
REJECTED | &quot;REJECTED&quot;
CANCELLED | &quot;CANCELLED&quot;
