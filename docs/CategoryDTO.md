

# CategoryDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parentId** | **UUID** | Id of parent category |  [optional] |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**access** | [**AccessEnum**](#AccessEnum) | Access level |  [optional] |
|**id** | **UUID** | Identifier. Shouldn&#39;t be set for creation |  [optional] |
|**mailboxId** | **UUID** | Category creator&#39;s mailbox |  [optional] |
|**createdAt** | **OffsetDateTime** | Creation date |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUBLIC | &quot;public&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC_HIDDEN | &quot;public-hidden&quot; |



