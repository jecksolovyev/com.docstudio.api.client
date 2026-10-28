

# FailedEnvelopeCallbackFilterDTO

Envelope properties distinct with filter

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createDate** | **OffsetDateTime** | Creation date |  [optional] |
|**expireDate** | **OffsetDateTime** | Expire date |  [optional] |
|**labels** | **Set&lt;UUID&gt;** |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Envelope metadata |  [optional] |
|**receiveDate** | **OffsetDateTime** | Receive date |  [optional] |
|**recipient** | **UUID** | Envelope recipient mailbox Id |  [optional] |
|**sender** | **UUID** | Envelope sender UUID |  [optional] |
|**sentDate** | **OffsetDateTime** | Sent date |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Envelope status |  [optional] |
|**subject** | **String** | Envelope subject |  [optional] |
|**template** | **UUID** | Template UUID |  [optional] |
|**templateVersion** | **UUID** | Template version Id |  [optional] |
|**wrongForm** | **Boolean** | Form does not match or empty |  [optional] |



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



