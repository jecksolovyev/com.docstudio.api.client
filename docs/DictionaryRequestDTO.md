# DictionaryRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Dictionary name | 
**description** | **String** | Dictionary description |  [optional]
**access** | [**AccessEnum**](#AccessEnum) | Dictionary access level | 
**filteredAccessOnly** | **Boolean** | Dictionary filtered access only | 

<a name="AccessEnum"></a>
## Enum: AccessEnum
Name | Value
---- | -----
MAILBOX | &quot;mailbox&quot;
ACCOUNT | &quot;account&quot;
PUB | &quot;pub&quot;
OFFICIAL | &quot;official&quot;
SHARED | &quot;shared&quot;
