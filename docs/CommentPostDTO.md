

# CommentPostDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | **String** | Document ID to create new comment thread |  |
|**text** | **String** | Text of the message |  |
|**xpath** | **String** | xPath to find selected area |  [optional] |
|**accessType** | [**AccessTypeEnum**](#AccessTypeEnum) | Access level (&#39;official&#39; is not allowed here) |  |
|**sharedTo** | **Set&lt;UUID&gt;** |  |  [optional] |



## Enum: AccessTypeEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUB | &quot;pub&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |



