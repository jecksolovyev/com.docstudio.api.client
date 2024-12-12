# CommentThreadDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mailboxUuid** | [**UUID**](UUID.md) | UUID of Mailbox created this comment |  [optional]
**mailboxName** | **String** | Name of Mailbox created this comment |  [optional]
**threadUuid** | [**UUID**](UUID.md) | Thread UUID |  [optional]
**xpath** | **String** | xPath to find selected area |  [optional]
**messages** | [**List&lt;CommentMessageDTO&gt;**](CommentMessageDTO.md) | All messages in the thread |  [optional]
**accessType** | [**AccessTypeEnum**](#AccessTypeEnum) | Access level |  [optional]
**sharedTo** | [**List&lt;NameUuidDTO&gt;**](NameUuidDTO.md) |  |  [optional]

<a name="AccessTypeEnum"></a>
## Enum: AccessTypeEnum
Name | Value
---- | -----
MAILBOX | &quot;mailbox&quot;
ACCOUNT | &quot;account&quot;
PUB | &quot;pub&quot;
OFFICIAL | &quot;official&quot;
SHARED | &quot;shared&quot;
