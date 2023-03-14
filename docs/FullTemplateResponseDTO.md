# FullTemplateResponseDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | Template UUID |  [optional]
**name** | **String** | Template name |  [optional]
**description** | **String** | Template description |  [optional]
**data** | **String** | Template data |  [optional]
**version** | [**UUID**](UUID.md) | Template version |  [optional]
**dataCreatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Template data create date |  [optional]
**dataModifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Template data update date |  [optional]
**access** | [**AccessEnum**](#AccessEnum) | Template access level |  [optional]
**mailbox** | [**UUID**](UUID.md) | Template creator&#x27;s mailbox |  [optional]
**archive** | **Boolean** | Template archived |  [optional]
**newEnvelopeCanBeCreated** | **Boolean** | Returns a flag whether a new envelope can be created using this template |  [optional]
**categories** | **List&lt;Long&gt;** | Template categories ids. Empty array if not within any category. |  [optional]
**sharedCategories** | **List&lt;Long&gt;** | Template shared categories ids. Absent if not within any shared category. |  [optional]
**sharedTo** | [**List&lt;UUID&gt;**](UUID.md) | Mailboxes to which template is shared to |  [optional]
**logoImageUuid** | [**UUID**](UUID.md) | UUID of the template logo image |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Template create date |  [optional]
**modifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Template update date |  [optional]

<a name="AccessEnum"></a>
## Enum: AccessEnum
Name | Value
---- | -----
MAILBOX | &quot;mailbox&quot;
ACCOUNT | &quot;account&quot;
PUB | &quot;pub&quot;
OFFICIAL | &quot;official&quot;
SHARED | &quot;shared&quot;
