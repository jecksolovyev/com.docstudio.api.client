

# RecentlyUsedTemplateResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Template UUID |  [optional] |
|**name** | **String** | Template name |  [optional] |
|**description** | **String** | Template description |  [optional] |
|**logoImageUuid** | **UUID** | UUID of the template logo image |  [optional] |
|**mailboxUuid** | **UUID** |  |  [optional] |
|**sharedTo** | **List&lt;UUID&gt;** |  |  [optional] |
|**sharedToMailboxGroups** | **List&lt;UUID&gt;** |  |  [optional] |
|**access** | [**AccessEnum**](#AccessEnum) | Template access level |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUB | &quot;pub&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |



