# SearchApprovalsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | [**ScopeEnum**](#ScopeEnum) | Envelope approval scope | 
**status** | [**List&lt;StatusEnum&gt;**](#List&lt;StatusEnum&gt;) | Envelope statuses |  [optional]
**subject** | **String** | Envelope subject |  [optional]
**receiveDateFrom** | [**OffsetDateTime**](OffsetDateTime.md) | Receive date from |  [optional]
**receiveDateTo** | [**OffsetDateTime**](OffsetDateTime.md) | Receive date to |  [optional]
**template** | [**List&lt;UUID&gt;**](UUID.md) | Template uuids |  [optional]
**initiator** | [**List&lt;UUID&gt;**](UUID.md) | Envelope approval initiator uuids |  [optional]
**sort** | [**SortEnum**](#SortEnum) | Sort order, asc or desc |  [optional]
**urgent** | **Boolean** | Is approval urgent? |  [optional]

<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
INBOX | &quot;inbox&quot;
OUTBOX | &quot;outbox&quot;

<a name="List<StatusEnum>"></a>
## Enum: List&lt;StatusEnum&gt;
Name | Value
---- | -----
NOT_STARTED | &quot;NOT_STARTED&quot;
WAITING | &quot;WAITING&quot;
APPROVED | &quot;APPROVED&quot;
REJECTED | &quot;REJECTED&quot;
CANCELLED | &quot;CANCELLED&quot;

<a name="SortEnum"></a>
## Enum: SortEnum
Name | Value
---- | -----
DESC | &quot;desc&quot;
ASC | &quot;asc&quot;
