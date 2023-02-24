# RecentlyUsedTemplateResponseDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | Template UUID |  [optional]
**name** | **String** | Template name |  [optional]
**description** | **String** | Template description |  [optional]
**access** | [**AccessEnum**](#AccessEnum) | Template access level |  [optional]

<a name="AccessEnum"></a>
## Enum: AccessEnum
Name | Value
---- | -----
MAILBOX | &quot;mailbox&quot;
ACCOUNT | &quot;account&quot;
PUB | &quot;pub&quot;
OFFICIAL | &quot;official&quot;
SHARED | &quot;shared&quot;
