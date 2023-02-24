# RoleCreateDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**permissions** | **List&lt;Integer&gt;** |  |  [optional]
**accountUuid** | [**UUID**](UUID.md) |  |  [optional]
**system** | **Boolean** |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ACCOUNT | &quot;account&quot;
MAILBOX | &quot;mailbox&quot;
