# TemplateCreateDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **String** | Template data | 
**access** | [**AccessEnum**](#AccessEnum) | Template access level | 
**categories** | [**List&lt;UUID&gt;**](UUID.md) | Template categories ids and their accessLevels. Null or empty array if not within any category. |  [optional]
**sharedTo** | [**List&lt;UUID&gt;**](UUID.md) | Mailboxes list, which have access to template |  [optional]
**sharedToMailboxGroups** | [**List&lt;UUID&gt;**](UUID.md) | Mailbox groups, which have access to template |  [optional]
**logoImageUuid** | [**UUID**](UUID.md) | UUID of the template logo image |  [optional]

<a name="AccessEnum"></a>
## Enum: AccessEnum
Name | Value
---- | -----
MAILBOX | &quot;mailbox&quot;
ACCOUNT | &quot;account&quot;
PUB | &quot;pub&quot;
OFFICIAL | &quot;official&quot;
SHARED | &quot;shared&quot;
