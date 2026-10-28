

# IntegrationRule

Integration rule

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountUuid** | **UUID** | Account uuid |  |
|**active** | **Boolean** | Integration rule status |  |
|**attributes** | **Map&lt;String, String&gt;** | Some additional attributes (XPATH can be used as a value) |  [optional] |
|**excludeZipFiles** | **String** | Mask to exclude some files from ZIP. c - for signature/processing Certificate, p - for Printable version, a - for Audit trail |  [optional] |
|**in** | **Boolean** | Integration rule direction, true: in, false: out |  |
|**integrationRuleUuid** | **UUID** | Integration rule uuid |  [optional] |
|**mailboxUuid** | **UUID** | Mailbox uuid |  [optional] |
|**matchingPattern** | **String** | File matching pattern |  [optional] |
|**matchingPatternSrc** | [**MatchingPatternSrcEnum**](#MatchingPatternSrcEnum) | File matching pattern source: name or content |  [optional] |
|**multipleEnvelopes** | **Boolean** | Rule using for creating multiple envelopes |  [optional] |
|**name** | **String** | Integration rule name |  |
|**namingPattern** | **String** | File naming pattern |  [optional] |
|**rule** | **String** | XSLT mapping |  [optional] |
|**templateName** | **String** | Template name |  [optional] |
|**templateUuid** | **UUID** | Template uuid |  |
|**validationFiles** | [**List&lt;IntegrationRuleValidationFile&gt;**](IntegrationRuleValidationFile.md) |  |  [optional] |
|**versionUuid** | **UUID** | Version uuid |  |
|**zipStructureName** | **String** | The name of pre-saved zip structure in the template |  [optional] |



## Enum: MatchingPatternSrcEnum

| Name | Value |
|---- | -----|
| NAME | &quot;name&quot; |
| CONTENT | &quot;content&quot; |
| ATTRIBUTE | &quot;attribute&quot; |



