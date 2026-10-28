

# CorporateProfileDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoDepositMailboxUuid** | **UUID** | Auto Deposit Mailbox UUID |  [optional] |
|**dateLocale** | **String** | User locale for dates |  [optional] |
|**displayExactDate** | **Boolean** | Display exact date instead of relative |  [optional] |
|**email** | **String** | User email |  [optional] |
|**fields** | **Map&lt;String, Object&gt;** | Additional user fields |  [optional] |
|**firstName** | **String** | User first name |  [optional] |
|**lastName** | **String** | User last name |  [optional] |
|**locale** | **String** | User locale |  [optional] |
|**phone** | **String** | User phone |  [optional] |
|**preferences** | [**UserPreferences**](UserPreferences.md) | User preferences (active mailbox, account, sign type, search recipients) |  [optional] |
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



