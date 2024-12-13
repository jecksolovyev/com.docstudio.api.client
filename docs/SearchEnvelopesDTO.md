

# SearchEnvelopesDTO

Search parameters

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**label** | **Set&lt;String&gt;** |  |  [optional] |
|**scope** | [**Set&lt;ScopeEnum&gt;**](#Set&lt;ScopeEnum&gt;) |  |  [optional] |
|**status** | [**Set&lt;StatusEnum&gt;**](#Set&lt;StatusEnum&gt;) |  |  [optional] |
|**subject** | **String** | Envelope subject |  [optional] |
|**createDateFrom** | **OffsetDateTime** | Creation date from |  [optional] |
|**createDateTo** | **OffsetDateTime** | Creation date to |  [optional] |
|**receiveDateFrom** | **OffsetDateTime** | Receive date from |  [optional] |
|**receiveDateTo** | **OffsetDateTime** | Receive date to |  [optional] |
|**expireDateFrom** | **OffsetDateTime** | Expire date from |  [optional] |
|**expireDateTo** | **OffsetDateTime** | Expire date to |  [optional] |
|**sendDateFrom** | **OffsetDateTime** | Envelope sending date from |  [optional] |
|**sendDateTo** | **OffsetDateTime** | Envelope sending date to |  [optional] |
|**archived** | **Boolean** | Archived |  [optional] |
|**deleted** | **Boolean** | Deleted to Recycle Bin |  [optional] |
|**template** | **Set&lt;UUID&gt;** |  |  [optional] |
|**activeRole** | **Set&lt;String&gt;** |  |  [optional] |
|**sender** | **Set&lt;UUID&gt;** |  |  [optional] |
|**recipient** | **Set&lt;UUID&gt;** |  |  [optional] |
|**sortField** | **String** | Field for sorting (&#39;createdAt&#39; by default) |  [optional] |
|**sort** | [**SortEnum**](#SortEnum) | Sort order, asc or desc |  [optional] |
|**searchFields** | [**Set&lt;SearchFieldValueDTO&gt;**](SearchFieldValueDTO.md) |  |  [optional] |



## Enum: Set&lt;ScopeEnum&gt;

| Name | Value |
|---- | -----|
| INBOX | &quot;inbox&quot; |
| OUTBOX | &quot;outbox&quot; |
| DRAFT | &quot;draft&quot; |
| SHARED | &quot;shared&quot; |



## Enum: Set&lt;StatusEnum&gt;

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| SENT | &quot;SENT&quot; |
| WAITING | &quot;WAITING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| ON_APPROVAL | &quot;ON_APPROVAL&quot; |



## Enum: SortEnum

| Name | Value |
|---- | -----|
| DESC | &quot;desc&quot; |
| ASC | &quot;asc&quot; |



