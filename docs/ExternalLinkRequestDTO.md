

# ExternalLinkRequestDTO

Link info

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Link name |  |
|**url** | **String** | Link url |  |
|**access** | [**AccessEnum**](#AccessEnum) | Link access level, account-wide by default |  [optional] |
|**order** | **Integer** | Link order, last by default |  [optional] |
|**mailboxUuid** | **UUID** | Mailbox allowed to see link |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUBLIC | &quot;public&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC_HIDDEN | &quot;public-hidden&quot; |



