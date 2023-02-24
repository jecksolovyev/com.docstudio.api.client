# ScenarioShortDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | Scenario uuid |  [optional]
**name** | **String** | Scenario name |  [optional]
**description** | **String** | Scenario description |  [optional]
**access** | [**AccessEnum**](#AccessEnum) | Scenario access level |  [optional]
**steps** | [**List&lt;ScenarioShortStepDTO&gt;**](ScenarioShortStepDTO.md) | Scenario steps |  [optional]
**editable** | **Boolean** | Scenario editable |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Scenario created date |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Scenario update date |  [optional]

<a name="AccessEnum"></a>
## Enum: AccessEnum
Name | Value
---- | -----
MAILBOX | &quot;mailbox&quot;
ACCOUNT | &quot;account&quot;
PUB | &quot;pub&quot;
OFFICIAL | &quot;official&quot;
SHARED | &quot;shared&quot;
