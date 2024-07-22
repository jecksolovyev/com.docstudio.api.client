

# SettingsDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buildVersion** | **String** | The version of the build |  [optional] |
|**applicationName** | **String** | The name of the platform |  [optional] |
|**theme** | **String** | The name of the UI theme |  [optional] |
|**hideUnauthorizedFunctions** | **Boolean** | Hide or disable unauthorized functions |  [optional] |
|**podName** | **String** | Kubernetes Pod Name |  [optional] |
|**links** | [**AppLinks**](AppLinks.md) |  |  [optional] |
|**locales** | [**AppLocales**](AppLocales.md) |  |  [optional] |
|**testMode** | **Boolean** | Is Test Mode enabled? |  [optional] |
|**envelope** | [**EnvelopeRestrictions**](EnvelopeRestrictions.md) |  |  [optional] |
|**template** | [**TemplateRestriction**](TemplateRestriction.md) |  |  [optional] |
|**user** | [**UserProperties**](UserProperties.md) |  |  [optional] |
|**pageScripts** | [**AppPageScripts**](AppPageScripts.md) |  |  [optional] |
|**chunkUpload** | [**ChunkUploadProps**](ChunkUploadProps.md) |  |  [optional] |
|**crypto** | [**CryptoProperties**](CryptoProperties.md) |  |  [optional] |
|**logosProperties** | [**LogosProperties**](LogosProperties.md) |  |  [optional] |
|**emailProperties** | [**EmailProperties**](EmailProperties.md) |  |  [optional] |
|**billing** | [**BillingProperties**](BillingProperties.md) |  |  [optional] |
|**sso** | [**SsoProperties**](SsoProperties.md) |  |  [optional] |
|**geolocation** | [**GeolocationProperties**](GeolocationProperties.md) |  |  [optional] |
|**googleMapsApiKey** | **String** | Google maps api key |  [optional] |
|**pdf** | [**PdfPropertiesDTO**](PdfPropertiesDTO.md) |  |  [optional] |
|**mailbox** | [**MailboxProperties**](MailboxProperties.md) |  |  [optional] |
|**exchangeProtocols** | [**Map&lt;String, ExchangeProps&gt;**](ExchangeProps.md) | Available exchange protocols |  [optional] |
|**infoLinks** | [**List&lt;ExternalLinkShortResponseDTO&gt;**](ExternalLinkShortResponseDTO.md) | Info menu links |  [optional] |
|**supportedBarcodes** | [**List&lt;SupportedBarcodeDTO&gt;**](SupportedBarcodeDTO.md) | Supported barcodes |  [optional] |



