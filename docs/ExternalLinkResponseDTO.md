

# ExternalLinkResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Link uuid |  |
|**name** | **String** | Link name |  |
|**url** | **String** | Link url |  |
|**access** | [**AccessEnum**](#AccessEnum) | Link access level |  |
|**mailboxUuid** | **UUID** | Link mailbox |  |
|**order** | **Integer** | link order |  |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUB | &quot;pub&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |



