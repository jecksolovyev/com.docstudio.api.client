# FailedEnvelopeCallbackFilterDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labels** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Envelope status |  [optional]
**subject** | **String** | Envelope subject |  [optional]
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) | Creation date |  [optional]
**receiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Receive date |  [optional]
**expireDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expire date |  [optional]
**template** | [**UUID**](UUID.md) | Template uuid |  [optional]
**sender** | [**UUID**](UUID.md) | Envelope sender uuid |  [optional]

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
