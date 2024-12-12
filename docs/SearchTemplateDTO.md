# SearchTemplateDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | Template UUID | 
**mailboxUuid** | [**UUID**](UUID.md) | Template owner mailbox UUID | 
**name** | **String** | Template name | 
**description** | **String** | Template description | 
**access** | [**AccessEnum**](#AccessEnum) | Template access level |  [optional]
**categories** | [**List&lt;UUID&gt;**](UUID.md) | Template categories |  [optional]
**sharedCategories** | [**List&lt;UUID&gt;**](UUID.md) | Template shared categories |  [optional]
**sharedTo** | [**List&lt;UUID&gt;**](UUID.md) | Mailboxes to which template is shared to |  [optional]
**sharedToMailboxGroups** | [**List&lt;UUID&gt;**](UUID.md) | Mailbox groups to which template is shared to |  [optional]
**logoImageUuid** | [**UUID**](UUID.md) | UUID of the template logo image |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date of Template creation |  [optional]

<a name="AccessEnum"></a>
## Enum: AccessEnum
Name | Value
---- | -----
MAILBOX | &quot;mailbox&quot;
ACCOUNT | &quot;account&quot;
PUB | &quot;pub&quot;
OFFICIAL | &quot;official&quot;
SHARED | &quot;shared&quot;
