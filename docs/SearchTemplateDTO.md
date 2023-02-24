# SearchTemplateDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | Template UUID | 
**mailboxUuid** | [**UUID**](UUID.md) | Template owner mailbox UUID | 
**name** | **String** | Template name | 
**description** | **String** | Template description | 
**access** | [**AccessEnum**](#AccessEnum) | Template access level |  [optional]
**categories** | **List&lt;Long&gt;** | Template categories |  [optional]
**sharedCategories** | **List&lt;Long&gt;** | Template shared categories |  [optional]
**sharedTo** | [**List&lt;UUID&gt;**](UUID.md) | Mailboxes to which template is shared to |  [optional]
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
