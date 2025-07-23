

# EnvelopeApprovalRequestDTO

Fill only flow UUID or list of approvers

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuids** | **Set&lt;Object&gt;** |  |  |
|**urgent** | **Boolean** | Is approval urgent? |  [optional] |
|**flowUuid** | **UUID** | UUID of saved approval flow (Approvers must not be set) |  [optional] |
|**approvers** | [**List&lt;EnvelopeApproverDTO&gt;**](EnvelopeApproverDTO.md) | Set of approvers (Flow UUID must not be set) |  [optional] |



