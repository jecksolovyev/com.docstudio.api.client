

# RecentlyUsedTemplateResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**AccessEnum**](#AccessEnum) | Template access level |  [optional] |
|**description** | **String** | Template description |  [optional] |
|**logoImageUuid** | **UUID** | UUID of the template logo image |  [optional] |
|**mailboxUuid** | **UUID** |  |  [optional] |
|**name** | **String** | Template name |  [optional] |
|**sharedTo** | **List&lt;UUID&gt;** |  |  [optional] |
|**sharedToMailboxGroups** | **List&lt;UUID&gt;** |  |  [optional] |
|**uuid** | **UUID** | Template UUID |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUBLIC | &quot;public&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC_HIDDEN | &quot;public-hidden&quot; |



