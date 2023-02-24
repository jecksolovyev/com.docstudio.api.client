# IntegrationRuleDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**integrationRuleUuid** | [**UUID**](UUID.md) | Integration rule uuid |  [optional]
**mailboxUuid** | [**UUID**](UUID.md) | Mailbox uuid | 
**active** | **Boolean** | Integration rule status | 
**in** | **Boolean** | Integration rule direction, true: in, false: out | 
**name** | **String** | Integration rule name | 
**templateUuid** | [**UUID**](UUID.md) | Template uuid | 
**templateName** | **String** | Template name |  [optional]
**versionUuid** | [**UUID**](UUID.md) | Version uuid | 
**matchingPattern** | **String** | File matching pattern |  [optional]
**matchingPatternSrc** | [**MatchingPatternSrcEnum**](#MatchingPatternSrcEnum) | File matching pattern source: name or content |  [optional]
**namingPattern** | **String** | File naming pattern |  [optional]
**rule** | **String** | File naming pattern | 

<a name="MatchingPatternSrcEnum"></a>
## Enum: MatchingPatternSrcEnum
Name | Value
---- | -----
NAME | &quot;name&quot;
CONTENT | &quot;content&quot;
