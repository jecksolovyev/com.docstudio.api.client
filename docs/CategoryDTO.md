

# CategoryDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**AccessEnum**](#AccessEnum) | Access level |  [optional] |
|**createdAt** | **OffsetDateTime** | Creation date |  [optional] |
|**description** | **String** |  |  [optional] |
|**id** | **UUID** | Identifier. Shouldn&#39;t be set for creation |  [optional] |
|**mailboxId** | **UUID** | Category creator&#39;s mailbox |  [optional] |
|**name** | **String** |  |  |
|**parentId** | **UUID** | Id of parent category |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Category type |  |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUBLIC | &quot;public&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC_HIDDEN | &quot;public-hidden&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TEMPLATE | &quot;template&quot; |
| SCENARIO | &quot;scenario&quot; |



