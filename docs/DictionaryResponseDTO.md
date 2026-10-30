

# DictionaryResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**AccessEnum**](#AccessEnum) | Dictionary access level |  |
|**archive** | **Boolean** | Dictionary archived flag |  |
|**columns** | [**List&lt;DictionaryColumnResponseDTO&gt;**](DictionaryColumnResponseDTO.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Dictionary created date |  |
|**description** | **String** | Dictionary description |  [optional] |
|**editable** | **Boolean** | Dictionary can be edited |  |
|**filteredAccessOnly** | **Boolean** | Dictionary can be used only with filtering |  |
|**mailboxUuid** | **UUID** | Owner of the dictionary |  [optional] |
|**name** | **String** | Dictionary name |  |
|**recordsCount** | **Long** | Dictionary records count |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Dictionary availability status |  [optional] |
|**uuid** | **UUID** | Dictionary uuid |  |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUBLIC | &quot;public&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC_HIDDEN | &quot;public-hidden&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| LOCKED | &quot;LOCKED&quot; |
| AVAILABLE | &quot;AVAILABLE&quot; |



