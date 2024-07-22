

# MailboxApprovalFlowDTO

Flow to create

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sharedForAccount** | **Boolean** |  |  [optional] |
|**sharedForMailboxes** | **Set&lt;UUID&gt;** |  |  [optional] |
|**name** | **String** |  |  |
|**flowType** | [**FlowTypeEnum**](#FlowTypeEnum) |  |  |
|**approvers** | [**List&lt;EnvelopeApproverDTO&gt;**](EnvelopeApproverDTO.md) |  |  |



## Enum: FlowTypeEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| MANUAL | &quot;manual&quot; |



