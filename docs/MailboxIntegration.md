

# MailboxIntegration

Integration info

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mailboxUuid** | **UUID** | Mailbox uuid |  |
|**active** | **Boolean** | Integration status |  |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Integration protocol |  |
|**protocolSettings** | **Map&lt;String, String&gt;** | Integration protocol settings |  |
|**defaultRule** | [**IntegrationDefaultRuleDTO**](IntegrationDefaultRuleDTO.md) | Integration default rules |  |
|**succeed** | **Integer** | Number of succeed conversions without assigned rule |  [optional] |
|**failed** | **Integer** | Number of failed conversions without assigned rule |  [optional] |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| SOAP | &quot;soap&quot; |
| AS2 | &quot;as2&quot; |
| SFTP | &quot;sftp&quot; |
| AS4_DBNA | &quot;as4_dbna&quot; |



