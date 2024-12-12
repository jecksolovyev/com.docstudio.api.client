# CallbackEnvelopeFilterDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **List&lt;String&gt;** |  |  [optional]
**status** | [**List&lt;StatusEnum&gt;**](#List&lt;StatusEnum&gt;) |  |  [optional]
**subject** | **String** | Envelope subject |  [optional]
**createDateFrom** | [**OffsetDateTime**](OffsetDateTime.md) | Creation date from |  [optional]
**createDateTo** | [**OffsetDateTime**](OffsetDateTime.md) | Creation date to |  [optional]
**receiveDateFrom** | [**OffsetDateTime**](OffsetDateTime.md) | Receive date from |  [optional]
**receiveDateTo** | [**OffsetDateTime**](OffsetDateTime.md) | Receive date to |  [optional]
**expireDateFrom** | [**OffsetDateTime**](OffsetDateTime.md) | Expire date from |  [optional]
**expireDateTo** | [**OffsetDateTime**](OffsetDateTime.md) | Expire date to |  [optional]
**sendDateFrom** | [**OffsetDateTime**](OffsetDateTime.md) | Envelope sending date from |  [optional]
**sendDateTo** | [**OffsetDateTime**](OffsetDateTime.md) | Envelope sending date to |  [optional]
**template** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**sender** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**scope** | [**List&lt;ScopeEnum&gt;**](#List&lt;ScopeEnum&gt;) |  |  [optional]

<a name="List<StatusEnum>"></a>
## Enum: List&lt;StatusEnum&gt;
Name | Value
---- | -----
DRAFT | &quot;DRAFT&quot;
SENT | &quot;SENT&quot;
WAITING | &quot;WAITING&quot;
COMPLETED | &quot;COMPLETED&quot;
CANCELLED | &quot;CANCELLED&quot;
EXPIRED | &quot;EXPIRED&quot;
ON_APPROVAL | &quot;ON_APPROVAL&quot;

<a name="List<ScopeEnum>"></a>
## Enum: List&lt;ScopeEnum&gt;
Name | Value
---- | -----
INBOX | &quot;inbox&quot;
OUTBOX | &quot;outbox&quot;
DRAFT | &quot;draft&quot;
SHARED | &quot;shared&quot;
