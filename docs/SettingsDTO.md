

# SettingsDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buildVersion** | **String** | The version of the build |  [optional] |
|**applicationName** | **String** | The name of the platform |  [optional] |
|**theme** | **String** | The name of the UI theme |  [optional] |
|**supportChatProvider** | **String** | Support live chat provider name |  [optional] |
|**hideUnauthorizedFunctions** | **Boolean** | Hide or disable unauthorized functions |  [optional] |
|**podName** | **String** | Kubernetes Pod Name |  [optional] |
|**links** | [**AppLinks**](AppLinks.md) | Application Links |  [optional] |
|**locales** | [**AppLocales**](AppLocales.md) | Supported locales |  [optional] |
|**testMode** | **Boolean** | Is Test Mode enabled? |  [optional] |
|**envelope** | [**EnvelopeRestrictions**](EnvelopeRestrictions.md) | Envelope Restrictions |  [optional] |
|**template** | [**TemplateRestriction**](TemplateRestriction.md) | Template Restrictions |  [optional] |
|**user** | [**UserProperties**](UserProperties.md) | User settings |  [optional] |
|**pageScripts** | [**AppPageScripts**](AppPageScripts.md) | Additional JS scripts |  [optional] |
|**chunkUpload** | [**ChunkUploadProps**](ChunkUploadProps.md) | Chunk Upload properties |  [optional] |
|**crypto** | [**CryptoProperties**](CryptoProperties.md) | Signature Providers and Region |  [optional] |
|**logosProperties** | [**LogosProperties**](LogosProperties.md) | Logos properties |  [optional] |
|**emailProperties** | [**EmailProperties**](EmailProperties.md) | E-mails for support |  [optional] |
|**billing** | [**BillingProperties**](BillingProperties.md) | Billing properties |  [optional] |
|**sso** | [**SsoProperties**](SsoProperties.md) | SSO properties |  [optional] |
|**geolocation** | [**GeolocationProperties**](GeolocationProperties.md) | Geolocation properties |  [optional] |
|**googleMapsApiKey** | **String** | Google maps api key |  [optional] |
|**pdf** | [**PdfPropertiesDTO**](PdfPropertiesDTO.md) | PDF properties |  [optional] |
|**mailbox** | [**MailboxProperties**](MailboxProperties.md) | Mailbox properties |  [optional] |
|**exchange** | [**ExchangeProperties**](ExchangeProperties.md) | Common properties for exchange protocols |  [optional] |
|**exchangeProtocols** | [**Map&lt;String, ExchangeProtocolProps&gt;**](ExchangeProtocolProps.md) | Available exchange protocols |  [optional] |
|**infoLinks** | [**List&lt;ExternalLinkShortResponseDTO&gt;**](ExternalLinkShortResponseDTO.md) | Info menu links |  [optional] |
|**supportedBarcodes** | [**List&lt;SupportedBarcodeDTO&gt;**](SupportedBarcodeDTO.md) | Supported barcodes |  [optional] |
|**defaultEnvelopeListColumns** | [**DefaultEnvelopeListColumns**](DefaultEnvelopeListColumns.md) | Default envelope list columns |  [optional] |



