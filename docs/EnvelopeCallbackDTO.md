

# EnvelopeCallbackDTO

Envelope callback dto

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Envelope callback ID |  [optional] |
|**filter** | [**CallbackEnvelopeFilterDTO**](CallbackEnvelopeFilterDTO.md) | Envelope filter |  [optional] |
|**url** | **String** | Callback url |  [optional] |
|**retries** | **Integer** | Retries count, 0 &lt; X &lt;&#x3D; 10 |  [optional] |
|**timeout** | **Integer** | Request timeout (ms), 100 &lt; X &lt; 60000 |  [optional] |
|**successCode** | **Integer** | Http response success code |  [optional] |
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | Auth type |  [optional] |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| BASIC | &quot;BASIC&quot; |



