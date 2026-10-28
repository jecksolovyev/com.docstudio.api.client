

# EnvelopeCallbackDTO

Envelope callback dto

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | Auth type |  [optional] |
|**filter** | [**CallbackEnvelopeFilterDTO**](CallbackEnvelopeFilterDTO.md) | Envelope filter |  [optional] |
|**id** | **UUID** | Envelope callback ID |  [optional] |
|**retries** | **Integer** | Retries count, 0 &lt; X &lt;&#x3D; 10 |  |
|**successCode** | **Integer** | Http response success code |  [optional] |
|**timeout** | **Integer** | Request timeout (ms), 100 &lt; X &lt; 60000 |  |
|**url** | **String** | Callback url |  |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| BASIC | &quot;BASIC&quot; |



