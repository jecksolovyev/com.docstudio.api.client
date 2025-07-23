

# ConversionLogRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**mailboxId** | **UUID** |  |  [optional] |
|**ruleId** | **UUID** |  |  [optional] |
|**envelopeId** | **UUID** |  |  [optional] |
|**envelopeSubject** | **String** |  |  [optional] |
|**filename** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**error** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROCESSED | &quot;PROCESSED&quot; |
| REPROCESSED | &quot;REPROCESSED&quot; |
| FAILED | &quot;FAILED&quot; |



