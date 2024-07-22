

# SearchApprovalsDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ScopeEnum**](#ScopeEnum) | Envelope approval scope |  |
|**status** | [**Set&lt;StatusEnum&gt;**](#Set&lt;StatusEnum&gt;) | Envelope statuses |  [optional] |
|**subject** | **String** | Envelope subject |  [optional] |
|**receiveDateFrom** | **OffsetDateTime** | Receive date from |  [optional] |
|**receiveDateTo** | **OffsetDateTime** | Receive date to |  [optional] |
|**template** | **Set&lt;UUID&gt;** | Template uuids |  [optional] |
|**initiator** | **Set&lt;UUID&gt;** | Envelope approval initiator uuids |  [optional] |
|**sort** | [**SortEnum**](#SortEnum) | Sort order, asc or desc |  [optional] |
|**urgent** | **Boolean** | Is approval urgent? |  [optional] |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| INBOX | &quot;inbox&quot; |
| OUTBOX | &quot;outbox&quot; |



## Enum: Set&lt;StatusEnum&gt;

| Name | Value |
|---- | -----|
| NOT_STARTED | &quot;NOT_STARTED&quot; |
| WAITING | &quot;WAITING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |



## Enum: SortEnum

| Name | Value |
|---- | -----|
| DESC | &quot;desc&quot; |
| ASC | &quot;asc&quot; |



