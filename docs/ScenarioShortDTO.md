

# ScenarioShortDTO

Data records

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Scenario uuid |  [optional] |
|**name** | **String** | Scenario name |  [optional] |
|**description** | **String** | Scenario description |  [optional] |
|**access** | [**AccessEnum**](#AccessEnum) | Scenario access level |  [optional] |
|**steps** | [**List&lt;ScenarioShortStepDTO&gt;**](ScenarioShortStepDTO.md) | Scenario steps |  [optional] |
|**mailboxUuid** | **UUID** | Scenario mailbox |  [optional] |
|**editable** | **Boolean** | Scenario editable |  [optional] |
|**createdAt** | **OffsetDateTime** | Scenario created date |  [optional] |
|**updatedAt** | **OffsetDateTime** | Scenario update date |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| MAILBOX | &quot;mailbox&quot; |
| ACCOUNT | &quot;account&quot; |
| PUB | &quot;pub&quot; |
| OFFICIAL | &quot;official&quot; |
| SHARED | &quot;shared&quot; |



