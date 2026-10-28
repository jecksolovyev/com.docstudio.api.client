

# CallbackEnvelopeDataDTO

This DTO is sent as a callback payload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expireDate** | **OffsetDateTime** | The date of the envelope expiration |  [optional] |
|**label** | **Set&lt;UUID&gt;** |  |  [optional] |
|**mailbox** | **UUID** | Mailbox of the envelope |  |
|**receiveDate** | **OffsetDateTime** | The date of the envelope was received |  |
|**sender** | **UUID** | Sender of the envelope |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the envelope |  |
|**subject** | **String** | Subject of the envelope |  |
|**template** | **UUID** | Template of the envelope |  |
|**uuid** | **UUID** | UUID of the envelope |  |



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



