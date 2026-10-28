

# ScenarioDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**AccessEnum**](#AccessEnum) | Scenario access level |  |
|**addToChain** | **Boolean** | Should envelopes be chained? |  [optional] |
|**description** | **String** | Scenario description |  |
|**mailboxUuid** | **UUID** | Scenario mailbox |  [optional] |
|**name** | **String** | Scenario name |  |
|**sharedTo** | **Set&lt;UUID&gt;** | Mailboxes list, which have access to scenario |  [optional] |
|**steps** | [**List&lt;ScenarioStepDTO&gt;**](ScenarioStepDTO.md) | Scenario steps |  |
|**uuid** | **UUID** | Scenario uuid |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUBLIC | &quot;public&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC_HIDDEN | &quot;public-hidden&quot; |



