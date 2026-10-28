

# ConversionLogRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**envelopeId** | **UUID** |  |  [optional] |
|**envelopeSubject** | **String** |  |  [optional] |
|**error** | **String** |  |  [optional] |
|**filename** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**mailboxId** | **UUID** |  |  [optional] |
|**ruleId** | **UUID** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROCESSED | &quot;PROCESSED&quot; |
| REPROCESSED | &quot;REPROCESSED&quot; |
| FAILED | &quot;FAILED&quot; |



