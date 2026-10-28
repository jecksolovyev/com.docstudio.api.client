

# MailboxIntegration

Integration info

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Integration status |  |
|**defaultRule** | [**IntegrationDefaultRuleDTO**](IntegrationDefaultRuleDTO.md) | Integration default rules |  |
|**failed** | **Integer** | Number of failed conversions without assigned rule |  [optional] |
|**mailboxUuid** | **UUID** | Mailbox uuid |  |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Integration protocol |  |
|**protocolSettings** | **Map&lt;String, String&gt;** | Integration protocol settings |  |
|**succeed** | **Integer** | Number of succeed conversions without assigned rule |  [optional] |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| SOAP | &quot;soap&quot; |
| AS2 | &quot;as2&quot; |
| SFTP | &quot;sftp&quot; |
| AS4_DBNA | &quot;as4_dbna&quot; |



