# IntegrationDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mailboxUuid** | [**UUID**](UUID.md) | Mailbox uuid | 
**active** | **Boolean** | Integration status | 
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Integration protocol | 
**protocolSettings** | **Map&lt;String, String&gt;** | Integration protocol settings | 
**defaultRule** | [**IntegrationDefaultRuleDTO**](IntegrationDefaultRuleDTO.md) |  | 

<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
SOAP | &quot;soap&quot;
AS2 | &quot;as2&quot;
SFTP | &quot;sftp&quot;
AS4_DBNA | &quot;as4_dbna&quot;
