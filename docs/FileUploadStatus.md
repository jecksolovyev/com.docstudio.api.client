

# FileUploadStatus

State of a one-time upload link

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attachmentId** | **UUID** | Attachment Id of the stored file, set once the state is used |  [optional] |
|**filename** | **String** | Stored file name |  [optional] |
|**sizeBytes** | **Long** | Stored size in bytes |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | ready while waiting for the file, used once it is stored, expired when the link timed out |  [optional] |



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



