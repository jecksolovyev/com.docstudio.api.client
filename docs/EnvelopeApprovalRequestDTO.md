# EnvelopeApprovalRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuids** | [**List&lt;UUID&gt;**](UUID.md) |  | 
**urgent** | **Boolean** | Is approval urgent? |  [optional]
**flowUuid** | [**UUID**](UUID.md) | UUID of saved approval flow (Approvers must not be set) |  [optional]
**approvers** | [**List&lt;EnvelopeApproverDTO&gt;**](EnvelopeApproverDTO.md) | Set of approvers (Flow UUID must not be set) |  [optional]
