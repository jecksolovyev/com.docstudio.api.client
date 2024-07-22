

# ApproverDetailsDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mailboxUuid** | **UUID** |  |  [optional] |
|**mailboxName** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**order** | **Integer** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**seenAt** | **OffsetDateTime** |  |  [optional] |
|**completedAt** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**comment** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NOT_STARTED | &quot;NOT_STARTED&quot; |
| WAITING | &quot;WAITING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |



