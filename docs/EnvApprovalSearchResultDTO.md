

# EnvApprovalSearchResultDTO

Data records

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**envelopeUuid** | **UUID** | The envelope UUID |  [optional] |
|**subject** | **String** | The envelope subject |  [optional] |
|**message** | **String** | The envelope message |  [optional] |
|**createdAt** | **OffsetDateTime** | The date the approval was created |  [optional] |
|**status** | **String** | Status of approval |  [optional] |
|**mailboxUUID** | **UUID** | Mailbox UUID of approval initiator |  [optional] |
|**accountUuid** | **UUID** | Mailbox account UUID of approval initiator |  [optional] |
|**mailboxName** | **String** | Mailbox name of approval initiator |  [optional] |
|**total** | **Integer** | Total number of participants |  [optional] |
|**completed** | **Integer** | Number of participants processed |  [optional] |
|**templateUuid** | **UUID** | Envelope template UUID |  [optional] |
|**templateName** | **String** | Envelope template name |  [optional] |
|**seenAt** | **OffsetDateTime** | Date-time it was seen by approver |  [optional] |
|**expiredAfter** | **OffsetDateTime** | The date the envelope will be expired |  [optional] |
|**approvalFlowUuid** | **UUID** | UUID of approval flow |  [optional] |
|**urgent** | **Boolean** | Is approval flow urgent? |  [optional] |



