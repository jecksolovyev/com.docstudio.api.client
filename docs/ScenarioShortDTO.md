

# ScenarioShortDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**AccessEnum**](#AccessEnum) | Scenario access level |  [optional] |
|**createdAt** | **OffsetDateTime** | Scenario created date |  [optional] |
|**description** | **String** | Scenario description |  [optional] |
|**editable** | **Boolean** | Scenario editable |  [optional] |
|**favorite** | **Boolean** | Scenario marked as favorite |  [optional] |
|**mailboxUuid** | **UUID** | Scenario mailbox |  [optional] |
|**name** | **String** | Scenario name |  [optional] |
|**steps** | [**List&lt;ScenarioShortStepDTO&gt;**](ScenarioShortStepDTO.md) | Scenario steps |  [optional] |
|**updatedAt** | **OffsetDateTime** | Scenario update date |  [optional] |
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



