

# InvitedEnvelopeInfoDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**completed** | **Integer** | Number of roles completed processing of this envelope |  [optional] |
|**createdAt** | **OffsetDateTime** | Envelope creation date |  [optional] |
|**expireAfter** | **OffsetDateTime** | Envelope expiration date |  [optional] |
|**flow** | [**List&lt;EnvelopeFlowInfoDTO&gt;**](EnvelopeFlowInfoDTO.md) | Detailed information about every role |  [optional] |
|**message** | **String** | Envelope message |  [optional] |
|**roleId** | **String** | The role user was invited to |  [optional] |
|**sender** | [**EnvelopeSenderDTO**](EnvelopeSenderDTO.md) | Envelope sender info |  [optional] |
|**subject** | **String** | Envelope subject |  [optional] |
|**templateName** | **String** | Name of the template of this envelope |  [optional] |
|**total** | **Integer** | Total number of roles assigned for processing of this envelope |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Invitation type |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ENVELOPE_INVITE | &quot;envelope-invite&quot; |
| APPROVAL_INVITE | &quot;approval-invite&quot; |
| REVIEW_INVITE | &quot;review-invite&quot; |



