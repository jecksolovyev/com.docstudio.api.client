

# MailboxApprovalFlowDTO

Flow to create

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvers** | [**List&lt;EnvelopeApproverDTO&gt;**](EnvelopeApproverDTO.md) |  |  |
|**flowType** | [**FlowTypeEnum**](#FlowTypeEnum) |  |  |
|**name** | **String** |  |  |
|**sharedForAccount** | **Boolean** |  |  [optional] |
|**sharedForMailboxes** | **Set&lt;UUID&gt;** |  |  [optional] |



## Enum: FlowTypeEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| MANUAL | &quot;manual&quot; |



