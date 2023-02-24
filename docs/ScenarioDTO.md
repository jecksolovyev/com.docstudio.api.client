# ScenarioDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | Scenario uuid |  [optional]
**name** | **String** | Scenario name | 
**description** | **String** | Scenario description | 
**mailboxUuid** | [**UUID**](UUID.md) | Scenario mailbox |  [optional]
**access** | [**AccessEnum**](#AccessEnum) | Scenario access level | 
**steps** | [**List&lt;ScenarioStepDTO&gt;**](ScenarioStepDTO.md) | Scenario steps | 
**addToChain** | **Boolean** | Should envelopes be chained? |  [optional]

<a name="AccessEnum"></a>
## Enum: AccessEnum
Name | Value
---- | -----
MAILBOX | &quot;mailbox&quot;
ACCOUNT | &quot;account&quot;
PUB | &quot;pub&quot;
OFFICIAL | &quot;official&quot;
SHARED | &quot;shared&quot;
