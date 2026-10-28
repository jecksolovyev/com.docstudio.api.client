

# IntegrationRuleRequestDTO

Request details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**in** | **Boolean** | Rule direction, true &#x3D; IN, false &#x3D; OUT |  [optional] |
|**mailboxUuid** | **UUID** | UUID of mailbox for applying rule for |  |
|**map** | **String** | XSLT map to use for transformation |  |
|**multipleEnvelopes** | **Boolean** | Multiple envelopes allowed |  [optional] |
|**namingRule** | **String** | Naming pattern rule. Tokens allowed: {mailboxUuid}, {envelopeUuid}, {randomNumber}, {templateUuid}, {date yyyy-MM-dd_HH-mm-ss}. Forbidden characters are: /:?*&lt;&gt;| |  [optional] |
|**source** | **String** | XML source to convert |  |
|**templateUuid** | **UUID** | UUID of the template to use for generated envelope |  |
|**validationFiles** | [**List&lt;IntegrationRuleValidationFile&gt;**](IntegrationRuleValidationFile.md) |  |  [optional] |
|**versionUuid** | **UUID** | UUID of template version |  |



