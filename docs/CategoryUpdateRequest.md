

# CategoryUpdateRequest

Category to save

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**AccessEnum**](#AccessEnum) | Access level |  [optional] |
|**description** | **String** |  |  [optional] |
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



