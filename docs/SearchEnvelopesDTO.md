

# SearchEnvelopesDTO

Search parameters

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**label** | **Set&lt;Object&gt;** |  |  [optional] |
|**scope** | **Set&lt;Object&gt;** |  |  [optional] |
|**status** | **Set&lt;Object&gt;** |  |  [optional] |
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
|**template** | **Set&lt;Object&gt;** |  |  [optional] |
|**activeRole** | **Set&lt;Object&gt;** |  |  [optional] |
|**sender** | **Set&lt;Object&gt;** |  |  [optional] |
|**recipient** | **Set&lt;Object&gt;** |  |  [optional] |
|**sortField** | **String** | Field for sorting (&#39;createdAt&#39; by default) |  [optional] |
|**sort** | [**SortEnum**](#SortEnum) | Sort order, asc or desc |  [optional] |
|**searchFields** | [**Set&lt;SearchFieldValueDTO&gt;**](SearchFieldValueDTO.md) |  |  [optional] |



## Enum: SortEnum

| Name | Value |
|---- | -----|
| DESC | &quot;desc&quot; |
| ASC | &quot;asc&quot; |



