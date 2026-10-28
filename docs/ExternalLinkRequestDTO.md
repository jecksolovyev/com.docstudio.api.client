

# ExternalLinkRequestDTO

Link info

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**AccessEnum**](#AccessEnum) | Link access level, account-wide by default |  [optional] |
|**mailboxUuid** | **UUID** | Mailbox allowed to see link |  [optional] |
|**name** | **String** | Link name |  |
|**order** | **Integer** | Link order, last by default |  [optional] |
|**url** | **String** | Link url |  |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUBLIC | &quot;public&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC_HIDDEN | &quot;public-hidden&quot; |



