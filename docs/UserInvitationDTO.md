

# UserInvitationDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Account UUID |  [optional] |
|**name** | **String** | Account Name |  [optional] |
|**system** | **Boolean** |  |  [optional] |
|**allowMicrosoftOfficeViewer** | **Boolean** | Allow envelope attachments public access for MS Office Viewer |  [optional] |
|**corporateProfileEditRestricted** | **Boolean** | Is profile editing restricted for corporate users? |  [optional] |
|**company** | **Boolean** | Is account registered as a company? |  [optional] |
|**permissions** | **Set&lt;Integer&gt;** | Permissions for current user |  [optional] |
|**mailboxes** | [**List&lt;MailboxProfileDTO&gt;**](MailboxProfileDTO.md) | Mailboxes linked to this account |  [optional] |
|**documentSharingProviders** | **Set&lt;Object&gt;** |  |  [optional] |
|**code** | **String** | Invitation code |  [optional] |



