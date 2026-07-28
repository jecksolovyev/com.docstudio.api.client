

# CategoryUpdateRequest

Category to save

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parentId** | **UUID** | Id of parent category |  [optional] |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**access** | [**AccessEnum**](#AccessEnum) | Access level |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUBLIC | &quot;public&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC_HIDDEN | &quot;public-hidden&quot; |



