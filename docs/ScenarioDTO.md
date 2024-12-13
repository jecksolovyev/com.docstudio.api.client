

# ScenarioDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Scenario uuid |  [optional] |
|**name** | **String** | Scenario name |  |
|**description** | **String** | Scenario description |  |
|**mailboxUuid** | **UUID** | Scenario mailbox |  [optional] |
|**access** | [**AccessEnum**](#AccessEnum) | Scenario access level |  |
|**sharedTo** | **Set&lt;UUID&gt;** | Mailboxes list, which have access to scenario |  [optional] |
|**steps** | [**List&lt;ScenarioStepDTO&gt;**](ScenarioStepDTO.md) | Scenario steps |  |
|**addToChain** | **Boolean** | Should envelopes be chained? |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUB | &quot;pub&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |



