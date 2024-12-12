# IntegrationRuleDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**integrationRuleUuid** | [**UUID**](UUID.md) | Integration rule uuid |  [optional]
**accountUuid** | [**UUID**](UUID.md) | Account uuid | 
**mailboxUuid** | [**UUID**](UUID.md) | Mailbox uuid |  [optional]
**active** | **Boolean** | Integration rule status | 
**in** | **Boolean** | Integration rule direction, true: in, false: out | 
**name** | **String** | Integration rule name | 
**templateUuid** | [**UUID**](UUID.md) | Template uuid | 
**templateName** | **String** | Template name |  [optional]
**versionUuid** | [**UUID**](UUID.md) | Version uuid | 
**matchingPattern** | **String** | File matching pattern |  [optional]
**matchingPatternSrc** | [**MatchingPatternSrcEnum**](#MatchingPatternSrcEnum) | File matching pattern source: name or content |  [optional]
**namingPattern** | **String** | File naming pattern |  [optional]
**rule** | **String** | XSLT mapping |  [optional]
**zipStructureName** | **String** | The name of pre-saved zip structure in the template |  [optional]
**excludeZipFiles** | **String** | Mask to exclude some files from ZIP. c - for signature/processing Certificate, p - for Printable version, a - for Audit trail |  [optional]
**multipleEnvelopes** | **Boolean** | Rule using for creating multiple envelopes |  [optional]
**attributes** | **Map&lt;String, String&gt;** | Some additional attributes (XPATH can be used as a value) |  [optional]

<a name="MatchingPatternSrcEnum"></a>
## Enum: MatchingPatternSrcEnum
Name | Value
---- | -----
NAME | &quot;name&quot;
CONTENT | &quot;content&quot;
ATTRIBUTE | &quot;attribute&quot;
