# EnvApprovalSearchResultDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**envelopeUuid** | [**UUID**](UUID.md) | The envelope UUID |  [optional]
**subject** | **String** | The envelope subject |  [optional]
**message** | **String** | The envelope message |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date the approval was created |  [optional]
**status** | **String** | Status of approval |  [optional]
**mailboxUUID** | [**UUID**](UUID.md) | Mailbox UUID of approval initiator |  [optional]
**accountUuid** | [**UUID**](UUID.md) | Mailbox account UUID of approval initiator |  [optional]
**mailboxName** | **String** | Mailbox name of approval initiator |  [optional]
**total** | **Integer** | Total number of participants |  [optional]
**completed** | **Integer** | Number of participants processed |  [optional]
**templateUuid** | [**UUID**](UUID.md) | Envelope template UUID |  [optional]
**templateName** | **String** | Envelope template name |  [optional]
**seenAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date-time it was seen by approver |  [optional]
**expiredAfter** | [**OffsetDateTime**](OffsetDateTime.md) | The date the envelope will be expired |  [optional]
**approvalFlowUuid** | [**UUID**](UUID.md) | UUID of approval flow |  [optional]
**urgent** | **Boolean** | Is approval flow urgent? |  [optional]
