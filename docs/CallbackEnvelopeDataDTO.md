

# CallbackEnvelopeDataDTO

This DTO is sent as a callback payload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** |  |  [optional] |
|**label** | **Set&lt;UUID&gt;** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**subject** | **String** |  |  [optional] |
|**receiveDate** | **OffsetDateTime** |  |  [optional] |
|**expireDate** | **OffsetDateTime** |  |  [optional] |
|**template** | **UUID** |  |  [optional] |
|**sender** | **UUID** |  |  [optional] |
|**mailbox** | **UUID** |  |  [optional] |



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



