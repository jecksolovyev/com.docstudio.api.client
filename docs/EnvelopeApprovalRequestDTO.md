

# EnvelopeApprovalRequestDTO

Fill only flow UUID or list of approvers

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvers** | [**List&lt;EnvelopeApproverDTO&gt;**](EnvelopeApproverDTO.md) | Set of approvers (Flow UUID must not be set) |  [optional] |
|**flowUuid** | **UUID** | UUID of saved approval flow (Approvers must not be set) |  [optional] |
|**urgent** | **Boolean** | Is approval urgent? |  [optional] |
|**uuids** | **Set&lt;UUID&gt;** |  |  |



