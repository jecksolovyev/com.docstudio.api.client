

# EnvApprovalSearchResultDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountUuid** | **UUID** | Mailbox account UUID of approval initiator |  [optional] |
|**approvalFlowUuid** | **UUID** | UUID of approval flow |  [optional] |
|**completed** | **Integer** | Number of participants processed |  [optional] |
|**createdAt** | **OffsetDateTime** | The date the approval was created |  [optional] |
|**envelopeUuid** | **UUID** | The envelope UUID |  [optional] |
|**expiredAfter** | **OffsetDateTime** | The date the envelope will be expired |  [optional] |
|**lastUpdatedAt** | **OffsetDateTime** | Date and time of the last update |  [optional] |
|**mailboxName** | **String** | Mailbox name of approval initiator |  [optional] |
|**mailboxUUID** | **UUID** | Mailbox UUID of approval initiator |  [optional] |
|**message** | **String** | The envelope message |  [optional] |
|**seenAt** | **OffsetDateTime** | Date-time it was seen by approver |  [optional] |
|**status** | **String** | Status of approval |  [optional] |
|**subject** | **String** | The envelope subject |  [optional] |
|**templateName** | **String** | Envelope template name |  [optional] |
|**templateUuid** | **UUID** | Envelope template UUID |  [optional] |
|**total** | **Integer** | Total number of participants |  [optional] |
|**urgent** | **Boolean** | Is approval flow urgent? |  [optional] |



