# IntegrationDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mailboxUuid** | [**UUID**](UUID.md) | Mailbox uuid | 
**active** | **Boolean** | Integration status | 
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Integration protocol | 
**protocolSettings** | [**IntegrationProtocolSettingsDTO**](IntegrationProtocolSettingsDTO.md) |  | 
**defaultRule** | [**IntegrationDefaultRuleDTO**](IntegrationDefaultRuleDTO.md) |  | 

<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
FTPS | &quot;ftps&quot;
SOAP | &quot;soap&quot;
AS2 | &quot;as2&quot;
