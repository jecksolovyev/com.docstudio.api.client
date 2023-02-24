# ExternalLinkRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Link name | 
**url** | **String** | Link url | 
**access** | [**AccessEnum**](#AccessEnum) | Link access level, account-wide by default |  [optional]
**order** | **Integer** | Link order, last by default |  [optional]
**mailboxUuid** | [**UUID**](UUID.md) | Mailbox allowed to see link |  [optional]

<a name="AccessEnum"></a>
## Enum: AccessEnum
Name | Value
---- | -----
MAILBOX | &quot;mailbox&quot;
ACCOUNT | &quot;account&quot;
PUB | &quot;pub&quot;
OFFICIAL | &quot;official&quot;
SHARED | &quot;shared&quot;
