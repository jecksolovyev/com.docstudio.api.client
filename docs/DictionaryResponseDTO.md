

# DictionaryResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Dictionary uuid |  |
|**name** | **String** | Dictionary name |  |
|**description** | **String** | Dictionary description |  |
|**access** | [**AccessEnum**](#AccessEnum) | Dictionary access level |  |
|**archive** | **Boolean** | Dictionary archived flag |  |
|**createdAt** | **OffsetDateTime** | Dictionary created date |  |
|**editable** | **Boolean** | Dictionary can be edited |  |
|**filteredAccessOnly** | **Boolean** | Dictionary can be used only with filtering |  |
|**recordsCount** | **Long** | Dictionary records count |  [optional] |
|**columns** | [**List&lt;DictionaryColumnResponseDTO&gt;**](DictionaryColumnResponseDTO.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Dictionary availability status |  [optional] |
|**mailboxUuid** | **UUID** | Owner of the dictionary |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUB | &quot;pub&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| LOCKED | &quot;LOCKED&quot; |
| AVAILABLE | &quot;AVAILABLE&quot; |



