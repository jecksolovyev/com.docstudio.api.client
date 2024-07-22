

# AccountDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Account UUID |  [optional] |
|**name** | **String** | Account Name |  |
|**inn** | **String** | Account TAX number |  [optional] |
|**createdAt** | **OffsetDateTime** | Account creation date |  [optional] |
|**modifiedAt** | **OffsetDateTime** | Account last modification date |  [optional] |
|**mailboxes** | [**List&lt;MailboxSimpleDTO&gt;**](MailboxSimpleDTO.md) |  |  [optional] |
|**users** | [**List&lt;AccountUserDTO&gt;**](AccountUserDTO.md) |  |  [optional] |
|**logo** | **String** | Account logo in base64 format (svg, png, jpeg) |  [optional] |
|**brand** | **String** | Account brand logo in base64 format (svg, png, jpeg) |  [optional] |
|**currency** | **String** | Account currency for billing purposes |  [optional] |
|**timezone** | **String** | Account timezone for billing purposes |  [optional] |
|**allowCreatePersonalMailboxWithRole** | **UUID** | Create personal mailbox for self-registered corporate user with role UUID |  [optional] |



