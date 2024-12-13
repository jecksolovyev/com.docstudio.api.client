

# SearchTemplateDTO

Data records

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Template UUID |  |
|**mailboxUuid** | **UUID** | Template owner mailbox UUID |  |
|**name** | **String** | Template name |  |
|**description** | **String** | Template description |  |
|**access** | [**AccessEnum**](#AccessEnum) | Template access level |  [optional] |
|**categories** | **List&lt;UUID&gt;** | Template categories |  [optional] |
|**sharedCategories** | **List&lt;UUID&gt;** | Template shared categories |  [optional] |
|**sharedTo** | **Set&lt;UUID&gt;** | Mailboxes to which template is shared to |  [optional] |
|**sharedToMailboxGroups** | **Set&lt;UUID&gt;** | Mailbox groups to which template is shared to |  [optional] |
|**logoImageUuid** | **UUID** | UUID of the template logo image |  [optional] |
|**createdAt** | **OffsetDateTime** | Date of Template creation |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUB | &quot;pub&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |



