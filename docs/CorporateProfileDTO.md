# CorporateProfileDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | User uuid |  [optional]
**email** | **String** | User email |  [optional]
**firstName** | **String** | User first name |  [optional]
**lastName** | **String** | User last name |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | User status |  [optional]
**dateLocale** | **String** | User locale for dates |  [optional]
**locale** | **String** | User locale |  [optional]
**timezone** | **String** | User timezone |  [optional]
**autoDepositMailboxUuid** | [**UUID**](UUID.md) | Auto Deposit Mailbox UUID |  [optional]
**phone** | **String** | User phone |  [optional]
**displayExactDate** | **Boolean** | Display exact date instead of relative |  [optional]
**mailboxes** | [**List&lt;MailboxNameUuidDTO&gt;**](MailboxNameUuidDTO.md) | Mailboxes user has access to |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING_INVITE | &quot;PENDING_INVITE&quot;
ACTIVE | &quot;ACTIVE&quot;
BLOCKED | &quot;BLOCKED&quot;
PENDING_PASSWORD | &quot;PENDING_PASSWORD&quot;
DELETED | &quot;DELETED&quot;
