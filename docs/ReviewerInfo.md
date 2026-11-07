

# ReviewerInfo

Reviewer with the approval status

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canOnlyComment** | **Boolean** | True for a commentator who can only comment the document and does not participate in the mandatory approval; false for a reviewer |  [optional] |
|**email** | **String** | Reviewer email, if the reviewer was invited by email |  [optional] |
|**mailboxId** | **UUID** | Reviewer mailbox ID, null if the reviewer was invited by email and has no mailbox yet |  [optional] |
|**mailboxName** | **String** | Reviewer mailbox name |  [optional] |
|**name** | **String** | Reviewer name |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Approval status of the reviewer |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NOT_STARTED | &quot;NOT_STARTED&quot; |
| WAITING | &quot;WAITING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |



