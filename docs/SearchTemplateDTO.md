

# SearchTemplateDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**AccessEnum**](#AccessEnum) | Template access level |  [optional] |
|**categories** | **List&lt;UUID&gt;** | Template categories |  [optional] |
|**createdAt** | **OffsetDateTime** | Date of Template creation |  [optional] |
|**description** | **String** | Template description |  [optional] |
|**favorite** | **Boolean** | Template marked as favorite |  [optional] |
|**logoImageUuid** | **UUID** | UUID of the template logo image |  [optional] |
|**mailboxUuid** | **UUID** | Template owner mailbox UUID |  |
|**name** | **String** | Template name |  |
|**sharedCategories** | **List&lt;UUID&gt;** | Template shared categories |  [optional] |
|**sharedTo** | **Set&lt;UUID&gt;** | Mailboxes to which template is shared to |  [optional] |
|**sharedToMailboxGroups** | **Set&lt;UUID&gt;** | Mailbox groups to which template is shared to |  [optional] |
|**uuid** | **UUID** | Template UUID |  |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUBLIC | &quot;public&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC_HIDDEN | &quot;public-hidden&quot; |



