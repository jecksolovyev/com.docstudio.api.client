

# ApprovalStatusDTO

Approval Details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comment** | **String** |  |  [optional] |
|**envelopes** | [**List&lt;EnvelopeWithFlow&gt;**](EnvelopeWithFlow.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NOT_STARTED | &quot;NOT_STARTED&quot; |
| WAITING | &quot;WAITING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |



