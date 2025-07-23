

# CallbackEnvelopeFilterDTO

Search parameters for callback envelopes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**label** | **Set&lt;Object&gt;** |  |  [optional] |
|**status** | **Set&lt;Object&gt;** |  |  [optional] |
|**subject** | **String** | Envelope subject |  [optional] |
|**createDateFrom** | **OffsetDateTime** | Creation date from |  [optional] |
|**createDateTo** | **OffsetDateTime** | Creation date to |  [optional] |
|**receiveDateFrom** | **OffsetDateTime** | Receive date from |  [optional] |
|**receiveDateTo** | **OffsetDateTime** | Receive date to |  [optional] |
|**expireDateFrom** | **OffsetDateTime** | Expire date from |  [optional] |
|**expireDateTo** | **OffsetDateTime** | Expire date to |  [optional] |
|**sendDateFrom** | **OffsetDateTime** | Envelope sending date from |  [optional] |
|**sendDateTo** | **OffsetDateTime** | Envelope sending date to |  [optional] |
|**template** | **Set&lt;Object&gt;** |  |  [optional] |
|**sender** | **Set&lt;Object&gt;** |  |  [optional] |
|**scope** | [**Set&lt;ScopeEnum&gt;**](#Set&lt;ScopeEnum&gt;) |  |  [optional] |



## Enum: Set&lt;ScopeEnum&gt;

| Name | Value |
|---- | -----|
| INBOX | &quot;inbox&quot; |
| OUTBOX | &quot;outbox&quot; |
| DRAFT | &quot;draft&quot; |
| SHARED | &quot;shared&quot; |



