

# CommentThreadDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessType** | [**AccessTypeEnum**](#AccessTypeEnum) | Access level |  [optional] |
|**mailboxName** | **String** | Name of Mailbox created this comment |  [optional] |
|**mailboxUuid** | **UUID** | UUID of Mailbox created this comment |  [optional] |
|**messages** | [**List&lt;CommentMessageDTO&gt;**](CommentMessageDTO.md) | All messages in the thread |  [optional] |
|**sharedTo** | [**Set&lt;NameUuidDTO&gt;**](NameUuidDTO.md) |  |  [optional] |
|**threadUuid** | **UUID** | Thread UUID |  [optional] |
|**xpath** | **String** | xPath to find selected area |  [optional] |



## Enum: AccessTypeEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUBLIC | &quot;public&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC_HIDDEN | &quot;public-hidden&quot; |



