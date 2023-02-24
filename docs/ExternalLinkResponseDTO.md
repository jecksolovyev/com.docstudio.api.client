# ExternalLinkResponseDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | Link uuid | 
**name** | **String** | Link name | 
**url** | **String** | Link url | 
**access** | [**AccessEnum**](#AccessEnum) | Link access level | 
**mailboxUuid** | [**UUID**](UUID.md) | Link mailbox | 
**order** | **Integer** | link order | 

<a name="AccessEnum"></a>
## Enum: AccessEnum
Name | Value
---- | -----
MAILBOX | &quot;mailbox&quot;
ACCOUNT | &quot;account&quot;
PUB | &quot;pub&quot;
OFFICIAL | &quot;official&quot;
SHARED | &quot;shared&quot;
