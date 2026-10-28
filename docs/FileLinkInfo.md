

# FileLinkInfo

What a one-time file link is for and whether it can still be used

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contentType** | **String** | Content type |  [optional] |
|**direction** | [**DirectionEnum**](#DirectionEnum) | download or upload |  [optional] |
|**error** | **String** | Why the file could not be prepared, when the state is failed |  [optional] |
|**expiresAt** | **OffsetDateTime** | When the link stops working |  [optional] |
|**filename** | **String** | File name |  [optional] |
|**sizeBytes** | **Long** | Size in bytes |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | preparing, ready, uploading, used, failed, expired or not_found |  [optional] |
|**upload** | [**FileLinkUploadInfo**](FileLinkUploadInfo.md) | What an uploaded file may be, for upload links only |  [optional] |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| DOWNLOAD | &quot;download&quot; |
| UPLOAD | &quot;upload&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PREPARING | &quot;preparing&quot; |
| READY | &quot;ready&quot; |
| UPLOADING | &quot;uploading&quot; |
| USED | &quot;used&quot; |
| FAILED | &quot;failed&quot; |
| EXPIRED | &quot;expired&quot; |
| NOT_FOUND | &quot;not_found&quot; |



