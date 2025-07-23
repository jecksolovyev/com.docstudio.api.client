

# FailedEnvelopeCallbackFilterDTO

Envelope properties distinct with filter

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**labels** | **Set&lt;Object&gt;** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Envelope status |  [optional] |
|**subject** | **String** | Envelope subject |  [optional] |
|**createDate** | **OffsetDateTime** | Creation date |  [optional] |
|**receiveDate** | **OffsetDateTime** | Receive date |  [optional] |
|**expireDate** | **OffsetDateTime** | Expire date |  [optional] |
|**template** | **UUID** | Template uuid |  [optional] |
|**sender** | **UUID** | Envelope sender uuid |  [optional] |



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



