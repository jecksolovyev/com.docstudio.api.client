

# TemplateCreateDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **String** | Template data |  |
|**access** | [**AccessEnum**](#AccessEnum) | Template access level |  |
|**categories** | **List&lt;UUID&gt;** | Template categories ids and their accessLevels. Null or empty array if not within any category. |  [optional] |
|**sharedTo** | **Set&lt;UUID&gt;** | Mailboxes list, which have access to template |  [optional] |
|**sharedToMailboxGroups** | **Set&lt;UUID&gt;** | Mailbox groups, which have access to template |  [optional] |
|**logoImageUuid** | **UUID** | UUID of the template logo image |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUB | &quot;pub&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |



