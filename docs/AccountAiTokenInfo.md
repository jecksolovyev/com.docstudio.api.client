

# AccountAiTokenInfo

AI token information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Token activity status |  [optional] |
|**createdAt** | **OffsetDateTime** | Date created |  [optional] |
|**id** | **UUID** | Token id |  [optional] |
|**model** | **String** | Model name |  [optional] |
|**name** | **String** | Token name |  [optional] |
|**provider** | [**ProviderEnum**](#ProviderEnum) | Ai provider |  [optional] |
|**token** | **String** | Cut token |  [optional] |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| OPENAI | &quot;openai&quot; |
| GEMINI | &quot;gemini&quot; |
| ANTHROPIC | &quot;anthropic&quot; |



