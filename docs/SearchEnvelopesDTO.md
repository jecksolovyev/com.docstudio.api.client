# SearchEnvelopesDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **List&lt;String&gt;** |  |  [optional]
**scope** | [**List&lt;ScopeEnum&gt;**](#List&lt;ScopeEnum&gt;) |  |  [optional]
**status** | [**List&lt;StatusEnum&gt;**](#List&lt;StatusEnum&gt;) |  |  [optional]
**subject** | **String** | Envelope subject |  [optional]
**receiveDateFrom** | [**OffsetDateTime**](OffsetDateTime.md) | Receive date from |  [optional]
**receiveDateTo** | [**OffsetDateTime**](OffsetDateTime.md) | Receive date to |  [optional]
**expireDateFrom** | [**OffsetDateTime**](OffsetDateTime.md) | Expire date from |  [optional]
**expireDateTo** | [**OffsetDateTime**](OffsetDateTime.md) | Expire date to |  [optional]
**archived** | **Boolean** | Archived |  [optional]
**template** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**activeRole** | **List&lt;String&gt;** |  |  [optional]
**sender** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**recipient** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**sortField** | **String** | Field for sorting (&#x27;createdAt&#x27; by default) |  [optional]
**sort** | [**SortEnum**](#SortEnum) | Sort order, asc or desc |  [optional]
**searchFields** | [**List&lt;SearchFieldValueDTO&gt;**](SearchFieldValueDTO.md) |  |  [optional]

<a name="List<ScopeEnum>"></a>
## Enum: List&lt;ScopeEnum&gt;
Name | Value
---- | -----
INBOX | &quot;inbox&quot;
OUTBOX | &quot;outbox&quot;
DRAFT | &quot;draft&quot;

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

<a name="SortEnum"></a>
## Enum: SortEnum
Name | Value
---- | -----
DESC | &quot;desc&quot;
ASC | &quot;asc&quot;
