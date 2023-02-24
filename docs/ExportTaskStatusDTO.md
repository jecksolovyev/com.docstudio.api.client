# ExportTaskStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | Task uuid | 
**status** | [**StatusEnum**](#StatusEnum) | Task status | 
**fileUrl** | **String** | Exported dictionary url |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
STARTED | &quot;STARTED&quot;
COMPLETED | &quot;COMPLETED&quot;
CLEANED | &quot;CLEANED&quot;
