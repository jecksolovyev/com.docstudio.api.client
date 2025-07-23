

# InvitedEnvelopeInfoDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** | Envelope message |  [optional] |
|**subject** | **String** | Envelope subject |  [optional] |
|**expireAfter** | **OffsetDateTime** | Envelope expiration date |  [optional] |
|**createdAt** | **OffsetDateTime** | Envelope creation date |  [optional] |
|**sender** | [**EnvelopeSenderDTO**](EnvelopeSenderDTO.md) | Envelope sender info |  [optional] |
|**templateName** | **String** | Name of the template of this envelope |  [optional] |
|**total** | **Integer** | Total number of roles assigned for processing of this envelope |  [optional] |
|**completed** | **Integer** | Number of roles completed processing of this envelope |  [optional] |
|**flow** | [**List&lt;EnvelopeFlowInfoDTO&gt;**](EnvelopeFlowInfoDTO.md) | Detailed information about every role |  [optional] |



