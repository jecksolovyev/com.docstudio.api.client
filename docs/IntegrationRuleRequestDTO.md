# IntegrationRuleRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mailboxUuid** | [**UUID**](UUID.md) | UUID of mailbox for applying rule for | 
**templateUuid** | [**UUID**](UUID.md) | UUID of the template to use for generated envelope | 
**versionUuid** | [**UUID**](UUID.md) | UUID of template version | 
**in** | **Boolean** | Rule direction, true &#x3D; IN, false &#x3D; OUT |  [optional]
**namingRule** | **String** | Naming pattern rule. Tokens allowed: {mailboxUuid}, {envelopeUuid}, {randomNumber}, {templateUuid}, {date yyyy-MM-dd_HH-mm-ss}. Forbidden characters are: /:?*&lt;&gt;| |  [optional]
**map** | **String** | XSLT map to use for transformation | 
**source** | **String** | XML source to convert | 
