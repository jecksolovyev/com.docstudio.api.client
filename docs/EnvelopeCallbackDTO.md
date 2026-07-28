

# EnvelopeCallbackDTO

Envelope callback dto

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | Callback url |  |
|**retries** | **Integer** | Retries count, 0 &lt; X &lt;&#x3D; 10 |  |
|**timeout** | **Integer** | Request timeout (ms), 100 &lt; X &lt; 60000 |  |
|**successCode** | **Integer** | Http response success code |  [optional] |
|**id** | **UUID** | Envelope callback ID |  [optional] |
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | Auth type |  [optional] |
|**filter** | [**CallbackEnvelopeFilterDTO**](CallbackEnvelopeFilterDTO.md) | Envelope filter |  [optional] |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| BASIC | &quot;BASIC&quot; |



