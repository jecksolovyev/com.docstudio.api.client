# CreateEnvelopeCallbackDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | [**CallbackEnvelopeFilterDTO**](CallbackEnvelopeFilterDTO.md) |  | 
**url** | **String** | Callback url | 
**retries** | **Integer** | Retries count, 0 &lt; X &lt;&#x3D; 10 | 
**timeout** | **Integer** | Request timeout (ms), 100 &lt; X &lt; 60000 | 
**successCode** | **Integer** | Http response success code |  [optional]
**login** | **String** | Basic auth login |  [optional]
**password** | **String** | Basic auth password |  [optional]
