

# IntegrationRuleListItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**integrationRuleUuid** | **UUID** | Integration rule uuid |  [optional] |
|**accountUuid** | **UUID** | Account uuid |  |
|**mailboxUuid** | **UUID** | Mailbox uuid |  [optional] |
|**active** | **Boolean** | Integration rule status |  |
|**in** | **Boolean** | Integration rule direction, true: in, false: out |  |
|**name** | **String** | Integration rule name |  |
|**templateUuid** | **UUID** | Template uuid |  |
|**templateName** | **String** | Template name |  [optional] |
|**versionUuid** | **UUID** | Version uuid |  |
|**matchingPattern** | **String** | File matching pattern |  [optional] |
|**matchingPatternSrc** | [**MatchingPatternSrcEnum**](#MatchingPatternSrcEnum) | File matching pattern source: name or content |  [optional] |
|**namingPattern** | **String** | File naming pattern |  [optional] |
|**succeed** | **Integer** | Number of succeed conversion |  [optional] |
|**failed** | **Integer** | Number of failed conversion |  [optional] |



## Enum: MatchingPatternSrcEnum

| Name | Value |
|---- | -----|
| NAME | &quot;name&quot; |
| CONTENT | &quot;content&quot; |
| ATTRIBUTE | &quot;attribute&quot; |



