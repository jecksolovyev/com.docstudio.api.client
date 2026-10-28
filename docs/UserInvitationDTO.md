

# UserInvitationDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowMicrosoftOfficeViewer** | **Boolean** | Allow envelope attachments public access for MS Office Viewer |  [optional] |
|**code** | **String** | Invitation code |  [optional] |
|**company** | **Boolean** | Is account registered as a company? |  [optional] |
|**corporateProfileEditRestricted** | **Boolean** | Is profile editing restricted for corporate users? |  [optional] |
|**documentSharingProviders** | **Set&lt;String&gt;** |  |  [optional] |
|**hideCommunityTemplates** | **Boolean** | Hide community templates for account users |  [optional] |
|**hideOfficialTemplates** | **Boolean** | Hide official templates for account users |  [optional] |
|**mailboxes** | [**List&lt;MailboxProfileDTO&gt;**](MailboxProfileDTO.md) | Mailboxes user invited to |  [optional] |
|**mailboxesCount** | **Long** | Count of mailboxes user has access to |  [optional] |
|**mfaEnabled** | **Boolean** | Is Multi-Factor Authentication enabled |  [optional] |
|**name** | **String** | Account Name |  [optional] |
|**permissions** | **Set&lt;Integer&gt;** | Permissions for current user |  [optional] |
|**recipientExperience** | [**RecipientExperience**](RecipientExperience.md) | Default recipient experience for account emails and recipient interface |  [optional] |
|**system** | **Boolean** |  |  [optional] |
|**uuid** | **UUID** | Account UUID |  [optional] |



