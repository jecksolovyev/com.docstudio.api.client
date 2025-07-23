

# AccountAiTokenInfo

AI token information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Token id |  [optional] |
|**name** | **String** | Token name |  [optional] |
|**provider** | [**ProviderEnum**](#ProviderEnum) | Ai provider |  [optional] |
|**model** | **String** | Model name |  [optional] |
|**token** | **String** | Cut token |  [optional] |
|**active** | **Boolean** | Token activity status |  [optional] |
|**createdAt** | **OffsetDateTime** | Date created |  [optional] |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| OPENAI | &quot;openai&quot; |
| GEMINI | &quot;gemini&quot; |



