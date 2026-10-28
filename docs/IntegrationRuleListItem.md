

# IntegrationRuleListItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountUuid** | **UUID** | Account uuid |  |
|**active** | **Boolean** | Integration rule status |  |
|**failed** | **Integer** | Number of failed conversions |  [optional] |
|**in** | **Boolean** | Integration rule direction, true: in, false: out |  |
|**integrationRuleUuid** | **UUID** | Integration rule uuid |  [optional] |
|**mailboxUuid** | **UUID** | Mailbox uuid |  [optional] |
|**matchingPattern** | **String** | File matching pattern |  [optional] |
|**matchingPatternSrc** | [**MatchingPatternSrcEnum**](#MatchingPatternSrcEnum) | File matching pattern source: name or content |  [optional] |
|**name** | **String** | Integration rule name |  |
|**namingPattern** | **String** | File naming pattern |  [optional] |
|**succeed** | **Integer** | Number of succeed conversions |  [optional] |
|**templateName** | **String** | Template name |  [optional] |
|**templateUuid** | **UUID** | Template uuid |  |
|**versionUuid** | **UUID** | Version uuid |  |



## Enum: MatchingPatternSrcEnum

| Name | Value |
|---- | -----|
| NAME | &quot;name&quot; |
| CONTENT | &quot;content&quot; |
| ATTRIBUTE | &quot;attribute&quot; |



