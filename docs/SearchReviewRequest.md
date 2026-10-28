

# SearchReviewRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**initiator** | **Set&lt;UUID&gt;** | Editorial review initiator uuids |  [optional] |
|**participant** | **Set&lt;UUID&gt;** | Editorial review participant uuids |  [optional] |
|**receiveDateFrom** | **OffsetDateTime** | Receive date from |  [optional] |
|**receiveDateTo** | **OffsetDateTime** | Receive date to |  [optional] |
|**scope** | [**Set&lt;ScopeEnum&gt;**](#Set&lt;ScopeEnum&gt;) | Editorial review scopes |  |
|**sort** | [**SortEnum**](#SortEnum) | Sort order, asc or desc |  [optional] |
|**status** | [**Set&lt;StatusEnum&gt;**](#Set&lt;StatusEnum&gt;) | Envelope statuses |  [optional] |
|**subject** | **String** | Envelope subject |  [optional] |
|**template** | **Set&lt;UUID&gt;** | Template uuids |  [optional] |



## Enum: Set&lt;ScopeEnum&gt;

| Name | Value |
|---- | -----|
| INBOX | &quot;inbox&quot; |
| OUTBOX | &quot;outbox&quot; |



## Enum: SortEnum

| Name | Value |
|---- | -----|
| DESC | &quot;desc&quot; |
| ASC | &quot;asc&quot; |



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



