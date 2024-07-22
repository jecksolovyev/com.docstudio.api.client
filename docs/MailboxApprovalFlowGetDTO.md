

# MailboxApprovalFlowGetDTO

Data records

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sharedForAccount** | **Boolean** |  |  [optional] |
|**sharedForMailboxes** | [**Set&lt;MailboxNameUuidDTO&gt;**](MailboxNameUuidDTO.md) |  |  [optional] |
|**name** | **String** |  |  |
|**flowType** | [**FlowTypeEnum**](#FlowTypeEnum) |  |  |
|**approvers** | [**List&lt;EnvelopeApproverGetDTO&gt;**](EnvelopeApproverGetDTO.md) |  |  |
|**uuid** | **UUID** |  |  [optional] |



## Enum: FlowTypeEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| MANUAL | &quot;manual&quot; |



