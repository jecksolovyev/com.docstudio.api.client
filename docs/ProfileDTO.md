

# ProfileDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accounts** | [**List&lt;User2AccountWithMailboxesDTO&gt;**](User2AccountWithMailboxesDTO.md) | User accounts belongs to |  [optional] |
|**autoDepositMailboxUuid** | **UUID** | Auto Deposit Mailbox UUID |  [optional] |
|**corporateAccountId** | **UUID** | Corporate account UUID |  [optional] |
|**corporateUser** | **Boolean** |  |  [optional] |
|**dateLocale** | **String** | User locale for dates |  [optional] |
|**displayExactDate** | **Boolean** | Display exact date instead of relative |  [optional] |
|**email** | **String** | User email |  [optional] |
|**fields** | **Map&lt;String, Object&gt;** | Additional user fields |  [optional] |
|**firstName** | **String** | User first name |  [optional] |
|**initials** | **String** | Saved initials |  [optional] |
|**lastName** | **String** | User last name |  [optional] |
|**locale** | **String** | User locale |  [optional] |
|**mfaEnabled** | **Boolean** | Is Multi-Factor Authentication enabled |  [optional] |
|**onlySsoLogin** | **Boolean** | Is only SSO allowed for user (password forbidden) |  [optional] |
|**phone** | **String** | User phone |  [optional] |
|**preferences** | [**UserPreferences**](UserPreferences.md) | User preferences (active mailbox, account, sign type, search recipients) |  [optional] |
|**signature** | **String** | Saved eInk signature |  [optional] |
|**ssoEnabled** | **Boolean** | Is SSO enabled for user |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | User status |  [optional] |
|**timezone** | **String** | User timezone |  [optional] |
|**uuid** | **UUID** | User uuid |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING_INVITE | &quot;PENDING_INVITE&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| BLOCKED | &quot;BLOCKED&quot; |
| PENDING_PASSWORD | &quot;PENDING_PASSWORD&quot; |
| DELETED | &quot;DELETED&quot; |



