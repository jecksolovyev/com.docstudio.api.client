# AccountDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | Account UUID |  [optional]
**name** | **String** | Account Name | 
**inn** | **String** | Account TAX number |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Account creation date |  [optional]
**modifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Account last modification date |  [optional]
**mailboxes** | [**List&lt;MailboxSimpleDTO&gt;**](MailboxSimpleDTO.md) |  |  [optional]
**users** | [**List&lt;AccountUserDTO&gt;**](AccountUserDTO.md) |  |  [optional]
**logo** | **String** | Account logo in base64 format (svg, png, jpeg) |  [optional]
**brand** | **String** | Account brand logo in base64 format (svg, png, jpeg) |  [optional]
**currency** | **String** | Account currency for billing purposes |  [optional]
**timezone** | **String** | Account timezone for billing purposes |  [optional]
**createPersonalMailbox** | **Boolean** | Create personal mailbox for self-registered corporate user |  [optional]
