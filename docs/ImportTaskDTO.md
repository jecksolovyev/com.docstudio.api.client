# ImportTaskDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**errorMessage** | **String** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UPLOADING | &quot;UPLOADING&quot;
PENDING | &quot;PENDING&quot;
APPROVED | &quot;APPROVED&quot;
PROCESSING | &quot;PROCESSING&quot;
COMPLETED | &quot;COMPLETED&quot;
CANCELLED | &quot;CANCELLED&quot;
CLEANED | &quot;CLEANED&quot;
FAILED | &quot;FAILED&quot;
