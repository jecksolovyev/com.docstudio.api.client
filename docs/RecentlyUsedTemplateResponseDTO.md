# RecentlyUsedTemplateResponseDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | Template UUID |  [optional]
**name** | **String** | Template name |  [optional]
**description** | **String** | Template description |  [optional]
**logoImageUuid** | [**UUID**](UUID.md) | UUID of the template logo image |  [optional]
**mailboxUuid** | [**UUID**](UUID.md) |  |  [optional]
**sharedTo** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**sharedToMailboxGroups** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
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
