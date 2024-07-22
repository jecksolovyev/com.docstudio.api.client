

# CallbackEnvelopeFilterDTO

Search parameters for callback envelopes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**label** | **Set&lt;String&gt;** |  |  [optional] |
|**status** | [**Set&lt;StatusEnum&gt;**](#Set&lt;StatusEnum&gt;) |  |  [optional] |
|**subject** | **String** | Envelope subject |  [optional] |
|**createDateFrom** | **OffsetDateTime** | Creation date from |  [optional] |
|**createDateTo** | **OffsetDateTime** | Creation date to |  [optional] |
|**receiveDateFrom** | **OffsetDateTime** | Receive date from |  [optional] |
|**receiveDateTo** | **OffsetDateTime** | Receive date to |  [optional] |
|**expireDateFrom** | **OffsetDateTime** | Expire date from |  [optional] |
|**expireDateTo** | **OffsetDateTime** | Expire date to |  [optional] |
|**sendDateFrom** | **OffsetDateTime** | Envelope sending date from |  [optional] |
|**sendDateTo** | **OffsetDateTime** | Envelope sending date to |  [optional] |
|**template** | **Set&lt;UUID&gt;** |  |  [optional] |
|**sender** | **Set&lt;UUID&gt;** |  |  [optional] |
|**scope** | [**Set&lt;ScopeEnum&gt;**](#Set&lt;ScopeEnum&gt;) |  |  [optional] |



## Enum: Set&lt;StatusEnum&gt;

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| SENT | &quot;SENT&quot; |
| WAITING | &quot;WAITING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| ON_APPROVAL | &quot;ON_APPROVAL&quot; |



## Enum: Set&lt;ScopeEnum&gt;

| Name | Value |
|---- | -----|
| INBOX | &quot;inbox&quot; |
| OUTBOX | &quot;outbox&quot; |
| DRAFT | &quot;draft&quot; |
| SHARED | &quot;shared&quot; |



