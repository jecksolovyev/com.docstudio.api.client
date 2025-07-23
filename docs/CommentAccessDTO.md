

# CommentAccessDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**threadUuid** | **UUID** | UUID of comment thread |  |
|**accessType** | [**AccessTypeEnum**](#AccessTypeEnum) | Access level (&#39;official&#39; is not allowed here) |  |
|**sharedTo** | **Set&lt;Object&gt;** |  |  [optional] |



## Enum: AccessTypeEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUBLIC | &quot;public&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC_HIDDEN | &quot;public-hidden&quot; |



