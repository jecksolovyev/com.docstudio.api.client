

# User2AccountWithMailboxesDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Account UUID |  [optional] |
|**name** | **String** | Account Name |  [optional] |
|**system** | **Boolean** |  |  [optional] |
|**allowMicrosoftOfficeViewer** | **Boolean** | Allow envelope attachments public access for MS Office Viewer |  [optional] |
|**corporateProfileEditRestricted** | **Boolean** | Is profile editing restricted for corporate users? |  [optional] |
|**company** | **Boolean** | Is account registered as a company? |  [optional] |
|**mfaEnabled** | **Boolean** | Is Multi-Factor Authentication enabled |  [optional] |
|**permissions** | **Set&lt;Integer&gt;** | Permissions for current user |  [optional] |
|**mailboxes** | [**List&lt;MailboxProfileDTO&gt;**](MailboxProfileDTO.md) | Mailboxes linked to this account |  [optional] |
|**documentSharingProviders** | **Set&lt;String&gt;** |  |  [optional] |
|**recipientExperience** | [**RecipientExperience**](RecipientExperience.md) | Default recipient experience for account emails and recipient interface |  [optional] |
|**hideOfficialTemplates** | **Boolean** | Hide official templates for account users |  [optional] |
|**hideCommunityTemplates** | **Boolean** | Hide community templates for account users |  [optional] |



