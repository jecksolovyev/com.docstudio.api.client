

# CategoryDTO

Category to save

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifier in DB. Shouldn&#39;t be set for creation. |  [optional] |
|**parentId** | **UUID** | Id of parent category |  [optional] |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**access** | [**AccessEnum**](#AccessEnum) | Access level |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUB | &quot;pub&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |



