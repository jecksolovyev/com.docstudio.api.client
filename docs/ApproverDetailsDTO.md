

# ApproverDetailsDTO

Participant of an approval flow

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canOnlyComment** | **Boolean** | True for an editorial review commentator who can only comment the document; false for a reviewer |  [optional] |
|**comment** | **String** | Comment left with the decision |  [optional] |
|**completedAt** | **OffsetDateTime** | When the participant made a decision |  [optional] |
|**createdAt** | **OffsetDateTime** | When the participant was added to the flow |  [optional] |
|**email** | **String** | Email the participant was invited by |  [optional] |
|**mailboxName** | **String** | Current name of the participant mailbox |  [optional] |
|**mailboxUuid** | **UUID** | Mailbox id of the participant; null for an invited email without a mailbox yet |  [optional] |
|**name** | **String** | Display name of the participant within the flow |  [optional] |
|**order** | **Integer** | Step order of the participant in the flow |  [optional] |
|**seenAt** | **OffsetDateTime** | When the participant first opened the envelope |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Decision status of the participant |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NOT_STARTED | &quot;NOT_STARTED&quot; |
| WAITING | &quot;WAITING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |



