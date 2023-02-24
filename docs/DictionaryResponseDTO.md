# DictionaryResponseDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | Dictionary uuid | 
**name** | **String** | Dictionary name | 
**description** | **String** | Dictionary description | 
**access** | [**AccessEnum**](#AccessEnum) | Dictionary access level | 
**archive** | **Boolean** | Dictionary archived flag | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Dictionary created date | 
**editable** | **Boolean** | Dictionary can be edited | 
**recordsCount** | **Long** | Dictionary records count |  [optional]
**columns** | [**List&lt;DictionaryColumnResponseDTO&gt;**](DictionaryColumnResponseDTO.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Dictionary availability status |  [optional]

<a name="AccessEnum"></a>
## Enum: AccessEnum
Name | Value
---- | -----
MAILBOX | &quot;mailbox&quot;
ACCOUNT | &quot;account&quot;
PUB | &quot;pub&quot;
OFFICIAL | &quot;official&quot;
SHARED | &quot;shared&quot;

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
LOCKED | &quot;LOCKED&quot;
AVAILABLE | &quot;AVAILABLE&quot;
