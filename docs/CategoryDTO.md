# CategoryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Identifier in DB. Shouldn&#x27;t be set for creation. |  [optional]
**parentId** | **Long** | id of parent category |  [optional]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**access** | [**AccessEnum**](#AccessEnum) | Access level |  [optional]

<a name="AccessEnum"></a>
## Enum: AccessEnum
Name | Value
---- | -----
MAILBOX | &quot;mailbox&quot;
ACCOUNT | &quot;account&quot;
PUB | &quot;pub&quot;
OFFICIAL | &quot;official&quot;
SHARED | &quot;shared&quot;
