

# FullTemplateResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Template UUID |  [optional] |
|**name** | **String** | Template name |  [optional] |
|**description** | **String** | Template description |  [optional] |
|**data** | **String** | Template data |  [optional] |
|**version** | **UUID** | Template version |  [optional] |
|**dataCreatedAt** | **OffsetDateTime** | Template data create date |  [optional] |
|**dataModifiedAt** | **OffsetDateTime** | Template data update date |  [optional] |
|**signatureContainer** | [**SignatureContainerEnum**](#SignatureContainerEnum) | Signature container |  [optional] |
|**access** | [**AccessEnum**](#AccessEnum) | Template access level |  [optional] |
|**mailbox** | **UUID** | Template creator&#39;s mailbox |  [optional] |
|**account** | **UUID** | Template creator&#39;s account |  [optional] |
|**archive** | **Boolean** | Template archived |  [optional] |
|**newEnvelopeCanBeCreated** | **Boolean** | Returns a flag whether a new envelope can be created using this template |  [optional] |
|**publiclyShared** | **Boolean** | Returns a flag indicating whether the template is publicly accessible by code |  [optional] |
|**defaultDownloadOptions** | **Boolean** | Returns a flag whether default download options should appear or only custom one |  [optional] |
|**categories** | **List&lt;UUID&gt;** | Template categories ids. Empty array if not within any category. |  [optional] |
|**sharedCategories** | **List&lt;UUID&gt;** | Template shared categories ids. Absent if not within any shared category. |  [optional] |
|**sharedTo** | **Set&lt;UUID&gt;** | Mailboxes to which template is shared to |  [optional] |
|**sharedToMailboxGroups** | **Set&lt;UUID&gt;** | Mailbox groups to which template is shared to |  [optional] |
|**logoImageUuid** | **UUID** | UUID of the template logo image |  [optional] |
|**createdAt** | **OffsetDateTime** | Template create date |  [optional] |
|**modifiedAt** | **OffsetDateTime** | Template update date |  [optional] |



## Enum: SignatureContainerEnum

| Name | Value |
|---- | -----|
| P7_S | &quot;P7S&quot; |
| ASICE | &quot;ASICE&quot; |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUBLIC | &quot;public&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC_HIDDEN | &quot;public-hidden&quot; |



