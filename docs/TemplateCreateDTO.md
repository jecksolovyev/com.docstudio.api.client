

# TemplateCreateDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **String** | Template data |  |
|**access** | [**AccessEnum**](#AccessEnum) | Template access level |  |
|**categories** | **List&lt;UUID&gt;** | Template categories ids and their accessLevels. Null or empty array if not within any category. |  [optional] |
|**sharedTo** | **Set&lt;UUID&gt;** | Mailboxes list, which have access to template |  [optional] |
|**sharedToMailboxGroups** | **Set&lt;UUID&gt;** | Mailbox groups, which have access to template |  [optional] |
|**logoImageUuid** | **UUID** | UUID of the template logo image |  [optional] |
|**signatureContainer** | [**SignatureContainerEnum**](#SignatureContainerEnum) | Signature container |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUBLIC | &quot;public&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC_HIDDEN | &quot;public-hidden&quot; |



## Enum: SignatureContainerEnum

| Name | Value |
|---- | -----|
| P7_S | &quot;P7S&quot; |
| ASICE | &quot;ASICE&quot; |



