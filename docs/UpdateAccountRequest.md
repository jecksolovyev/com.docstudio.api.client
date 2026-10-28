

# UpdateAccountRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aiAssistantRestricted** | **Boolean** | Restrict AI Assistant usage for account users. Skip property for non-owner users. |  [optional] |
|**allowCreatePersonalMailboxWithRole** | **UUID** | Create personal mailbox for self-registered corporate user with role UUID |  [optional] |
|**allowMicrosoftOfficeViewer** | **Boolean** | Allow envelope attachments public access for MS Office Viewer. Skip property for non-owner users. |  [optional] |
|**brand** | **String** | Account brand logo in base64 format (svg, png, jpeg) |  [optional] |
|**corporateProfileEditRestricted** | **Boolean** | Restrict profile editing for corporate users |  [optional] |
|**hideCommunityTemplates** | **Boolean** | Hide community templates for account users |  [optional] |
|**hideOfficialTemplates** | **Boolean** | Hide official templates for account users |  [optional] |
|**hideSenderEmailInNotifications** | **Boolean** | Hide sender&#39;s email as reply-to from notifications |  [optional] |
|**inn** | **String** | Account TAX number |  [optional] |
|**logo** | **String** | Account logo in base64 format (svg, png, jpeg) |  [optional] |
|**name** | **String** | Account Name |  |
|**recipientExperience** | [**RecipientExperience**](RecipientExperience.md) | Default recipient experience for account emails and recipient interface |  |



