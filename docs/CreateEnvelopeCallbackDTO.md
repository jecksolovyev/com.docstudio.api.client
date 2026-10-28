

# CreateEnvelopeCallbackDTO

Create envelope callback dto

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filter** | [**CallbackEnvelopeFilterDTO**](CallbackEnvelopeFilterDTO.md) | Envelope filter |  |
|**login** | **String** | Basic auth login |  [optional] |
|**password** | **String** | Basic auth password |  [optional] |
|**retries** | **Integer** | Retries count, 0 &lt; X &lt;&#x3D; 10 |  |
|**successCode** | **Integer** | Http response success code |  [optional] |
|**timeout** | **Integer** | Request timeout (ms), 100 &lt; X &lt; 60000 |  |
|**url** | **String** | Callback url |  |



