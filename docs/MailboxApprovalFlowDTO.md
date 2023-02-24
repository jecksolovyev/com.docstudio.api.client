# MailboxApprovalFlowDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sharedForAccount** | **Boolean** |  |  [optional]
**sharedForMailboxes** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**name** | **String** |  | 
**flowType** | [**FlowTypeEnum**](#FlowTypeEnum) |  | 
**approvers** | [**List&lt;EnvelopeApproverDTO&gt;**](EnvelopeApproverDTO.md) |  | 

<a name="FlowTypeEnum"></a>
## Enum: FlowTypeEnum
Name | Value
---- | -----
AUTO | &quot;auto&quot;
MANUAL | &quot;manual&quot;
