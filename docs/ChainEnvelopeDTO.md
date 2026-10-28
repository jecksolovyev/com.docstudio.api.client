

# ChainEnvelopeDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chainUuid** | **UUID** | Chain UUID |  [optional] |
|**envelopeUuid** | **UUID** | Envelope UUID |  [optional] |
|**receivedAt** | **OffsetDateTime** | Envelope receive date |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Envelope status |  [optional] |
|**subject** | **String** | Envelope subject |  [optional] |
|**templateName** | **String** | Envelope template name |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| SENT | &quot;SENT&quot; |
| WAITING | &quot;WAITING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| ON_APPROVAL | &quot;ON_APPROVAL&quot; |



