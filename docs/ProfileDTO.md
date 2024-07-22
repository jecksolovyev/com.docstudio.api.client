

# ProfileDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | User uuid |  [optional] |
|**email** | **String** | User email |  [optional] |
|**firstName** | **String** | User first name |  [optional] |
|**lastName** | **String** | User last name |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | User status |  [optional] |
|**dateLocale** | **String** | User locale for dates |  [optional] |
|**locale** | **String** | User locale |  [optional] |
|**timezone** | **String** | User timezone |  [optional] |
|**corporateUser** | **Boolean** | Is corporate user |  [optional] |
|**ssoEnabled** | **Boolean** | Is SSO enabled for user |  [optional] |
|**autoDepositMailboxUuid** | **UUID** | Auto Deposit Mailbox UUID |  [optional] |
|**phone** | **String** | User phone |  [optional] |
|**displayExactDate** | **Boolean** | Display exact date instead of relative |  [optional] |
|**signature** | **String** | Saved eInk signature |  [optional] |
|**accounts** | [**List&lt;User2AccountWithMailboxesDTO&gt;**](User2AccountWithMailboxesDTO.md) | User accounts belongs to |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING_INVITE | &quot;PENDING_INVITE&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| BLOCKED | &quot;BLOCKED&quot; |
| PENDING_PASSWORD | &quot;PENDING_PASSWORD&quot; |
| DELETED | &quot;DELETED&quot; |



