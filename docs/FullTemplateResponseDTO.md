

# FullTemplateResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**AccessEnum**](#AccessEnum) | Template access level |  [optional] |
|**account** | **UUID** | Template creator&#39;s account |  [optional] |
|**archive** | **Boolean** | Template archived |  [optional] |
|**categories** | **List&lt;UUID&gt;** | Template categories ids. Empty array if not within any category. |  [optional] |
|**createdAt** | **OffsetDateTime** | Template create date |  [optional] |
|**data** | **String** | Template data |  [optional] |
|**dataCreatedAt** | **OffsetDateTime** | Template data create date |  [optional] |
|**dataModifiedAt** | **OffsetDateTime** | Template data update date |  [optional] |
|**defaultDownloadOptions** | **Boolean** | Returns a flag whether default download options should appear or only custom one |  [optional] |
|**description** | **String** | Template description |  [optional] |
|**draftInitializationRequired** | **Boolean** | For proper envelope initialization a draft must be created at once |  [optional] |
|**logoImageUuid** | **UUID** | UUID of the template logo image |  [optional] |
|**mailbox** | **UUID** | Template creator&#39;s mailbox |  [optional] |
|**modifiedAt** | **OffsetDateTime** | Template update date |  [optional] |
|**name** | **String** | Template name |  [optional] |
|**newEnvelopeCanBeCreated** | **Boolean** | Returns a flag whether a new envelope can be created using this template |  [optional] |
|**publiclyShared** | **Boolean** | Returns a flag indicating whether the template is publicly accessible by code |  [optional] |
|**sharedCategories** | **List&lt;UUID&gt;** | Template shared categories ids. Absent if not within any shared category. |  [optional] |
|**sharedTo** | **Set&lt;UUID&gt;** | Mailboxes to which template is shared to |  [optional] |
|**sharedToMailboxGroups** | **Set&lt;UUID&gt;** | Mailbox groups to which template is shared to |  [optional] |
|**signatureAlgorithm** | [**SignatureAlgorithmEnum**](#SignatureAlgorithmEnum) | Signature algorithm |  [optional] |
|**signatureContainer** | [**SignatureContainerEnum**](#SignatureContainerEnum) | Signature container |  [optional] |
|**uuid** | **UUID** | Template UUID |  [optional] |
|**version** | **UUID** | Template version |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUBLIC | &quot;public&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC_HIDDEN | &quot;public-hidden&quot; |



## Enum: SignatureAlgorithmEnum

| Name | Value |
|---- | -----|
| DSTU4145 | &quot;DSTU4145&quot; |
| ECDSA_RSA | &quot;ECDSA_RSA&quot; |



## Enum: SignatureContainerEnum

| Name | Value |
|---- | -----|
| P7_S | &quot;P7S&quot; |
| ASICE | &quot;ASICE&quot; |
| P7_S_ENVELOPED | &quot;P7S_ENVELOPED&quot; |



