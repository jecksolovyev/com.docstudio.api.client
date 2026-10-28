

# SearchApprovalsDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**initiator** | **Set&lt;UUID&gt;** | Envelope approval initiator uuids |  [optional] |
|**receiveDateFrom** | **OffsetDateTime** | Receive date from |  [optional] |
|**receiveDateTo** | **OffsetDateTime** | Receive date to |  [optional] |
|**scope** | [**ScopeEnum**](#ScopeEnum) | Envelope approval scope |  |
|**sort** | [**SortEnum**](#SortEnum) | Sort order, asc or desc |  [optional] |
|**status** | [**Set&lt;StatusEnum&gt;**](#Set&lt;StatusEnum&gt;) | Approval statuses |  [optional] |
|**subject** | **String** | Envelope subject |  [optional] |
|**template** | **Set&lt;UUID&gt;** | Template uuids |  [optional] |
|**urgent** | **Boolean** | Is approval urgent? |  [optional] |



## Enum: ScopeEnum

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
| NOT_STARTED | &quot;NOT_STARTED&quot; |
| WAITING | &quot;WAITING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |



