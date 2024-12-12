# MailboxApprovalFlowGetDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sharedForAccount** | **Boolean** |  |  [optional]
**sharedForMailboxes** | [**List&lt;MailboxNameUuidDTO&gt;**](MailboxNameUuidDTO.md) |  |  [optional]
**name** | **String** |  | 
**flowType** | [**FlowTypeEnum**](#FlowTypeEnum) |  | 
**approvers** | [**List&lt;EnvelopeApproverGetDTO&gt;**](EnvelopeApproverGetDTO.md) |  | 
**uuid** | [**UUID**](UUID.md) |  |  [optional]

<a name="FlowTypeEnum"></a>
## Enum: FlowTypeEnum
Name | Value
---- | -----
AUTO | &quot;auto&quot;
MANUAL | &quot;manual&quot;
