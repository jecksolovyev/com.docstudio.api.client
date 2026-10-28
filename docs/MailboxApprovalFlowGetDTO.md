

# MailboxApprovalFlowGetDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvers** | [**List&lt;EnvelopeApproverGetDTO&gt;**](EnvelopeApproverGetDTO.md) |  |  |
|**flowType** | [**FlowTypeEnum**](#FlowTypeEnum) |  |  |
|**name** | **String** |  |  |
|**sharedForAccount** | **Boolean** |  |  [optional] |
|**sharedForMailboxes** | [**Set&lt;MailboxNameUuidDTO&gt;**](MailboxNameUuidDTO.md) |  |  [optional] |
|**uuid** | **UUID** |  |  [optional] |



## Enum: FlowTypeEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| MANUAL | &quot;manual&quot; |



