# UpdateAccountRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Account Name | 
**inn** | **String** | Account TAX number |  [optional]
**logo** | **String** | Account logo in base64 format (svg, png, jpeg) |  [optional]
**brand** | **String** | Account brand logo in base64 format (svg, png, jpeg) |  [optional]
**timezone** | **String** | Account timezone for billing purposes |  [optional]
**allowCreatePersonalMailboxWithRole** | [**UUID**](UUID.md) | Create personal mailbox for self-registered corporate user with role UUID |  [optional]