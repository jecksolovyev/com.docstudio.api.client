

# EnvelopeApprovalHistoryDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvers** | [**List&lt;ApproverDetailsDTO&gt;**](ApproverDetailsDTO.md) | Approvers with their statuses |  [optional] |
|**completed** | **Boolean** | Is approval flow completed? |  [optional] |
|**locked** | **Boolean** | If true, the document is locked for editing because approval of the current version has started |  [optional] |
|**mailboxUuid** | **UUID** | Mailbox UUID of approval initiator |  [optional] |
|**mandatoryApproval** | **Boolean** | If true, every reviewer has to approve the same document version before the review can be finished |  [optional] |
|**urgent** | **Boolean** | Is approval flow urgent? |  [optional] |
|**uuid** | **UUID** | Approval flow UUID |  [optional] |



