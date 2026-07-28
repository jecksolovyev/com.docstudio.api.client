

# FailedEnvelopeCallbackFilterDTO

Envelope properties distinct with filter

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**labels** | **Set&lt;UUID&gt;** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Envelope status |  [optional] |
|**subject** | **String** | Envelope subject |  [optional] |
|**createDate** | **OffsetDateTime** | Creation date |  [optional] |
|**receiveDate** | **OffsetDateTime** | Receive date |  [optional] |
|**expireDate** | **OffsetDateTime** | Expire date |  [optional] |
|**sentDate** | **OffsetDateTime** | Sent date |  [optional] |
|**template** | **UUID** | Template UUID |  [optional] |
|**templateVersion** | **UUID** | Template version Id |  [optional] |
|**sender** | **UUID** | Envelope sender UUID |  [optional] |
|**recipient** | **UUID** | Envelope recipient mailbox Id |  [optional] |
|**wrongForm** | **Boolean** | Form does not match or empty |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Envelope metadata |  [optional] |



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



