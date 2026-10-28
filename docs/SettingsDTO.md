

# SettingsDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationName** | **String** | The name of the platform |  [optional] |
|**billing** | [**BillingProperties**](BillingProperties.md) | Billing properties |  [optional] |
|**buildVersion** | **String** | The version of the build |  [optional] |
|**chunkUpload** | [**ChunkUploadProps**](ChunkUploadProps.md) | Chunk Upload properties |  [optional] |
|**crypto** | [**CryptoProperties**](CryptoProperties.md) | Signature Providers and Region |  [optional] |
|**defaultEnvelopeListColumns** | [**DefaultEnvelopeListColumns**](DefaultEnvelopeListColumns.md) | Default envelope list columns |  [optional] |
|**emailProperties** | [**EmailProperties**](EmailProperties.md) | E-mails for support |  [optional] |
|**envelope** | [**EnvelopeRestrictions**](EnvelopeRestrictions.md) | Envelope Restrictions |  [optional] |
|**exchange** | [**ExchangeProperties**](ExchangeProperties.md) | Common properties for exchange protocols |  [optional] |
|**exchangeProtocols** | [**Map&lt;String, ExchangeProtocolProps&gt;**](ExchangeProtocolProps.md) | Available exchange protocols |  [optional] |
|**geolocation** | [**GeolocationProperties**](GeolocationProperties.md) | Geolocation properties |  [optional] |
|**googleMapsApiKey** | **String** | Google maps api key |  [optional] |
|**hideUnauthorizedFunctions** | **Boolean** | Hide or disable unauthorized functions |  [optional] |
|**infoLinks** | [**List&lt;ExternalLinkShortResponseDTO&gt;**](ExternalLinkShortResponseDTO.md) | Info menu links |  [optional] |
|**integrations** | [**ConnectorProperties**](ConnectorProperties.md) | Available integrations |  [optional] |
|**links** | [**AppLinks**](AppLinks.md) | Application Links |  [optional] |
|**locales** | [**AppLocales**](AppLocales.md) | Supported locales |  [optional] |
|**logosProperties** | [**LogosProperties**](LogosProperties.md) | Logos properties |  [optional] |
|**mailbox** | [**MailboxProperties**](MailboxProperties.md) | Mailbox properties |  [optional] |
|**oauthUrl** | **String** | OAuth service url |  [optional] |
|**pageScripts** | [**AppPageScripts**](AppPageScripts.md) | Additional JS scripts |  [optional] |
|**pdf** | [**PdfPropertiesDTO**](PdfPropertiesDTO.md) | PDF properties |  [optional] |
|**podName** | **String** | Kubernetes Pod Name |  [optional] |
|**sso** | [**SsoProperties**](SsoProperties.md) | SSO properties |  [optional] |
|**supportChatProvider** | **String** | Support live chat provider name |  [optional] |
|**supportedBarcodes** | [**List&lt;SupportedBarcodeDTO&gt;**](SupportedBarcodeDTO.md) | Supported barcodes |  [optional] |
|**template** | [**TemplateRestriction**](TemplateRestriction.md) | Template Restrictions |  [optional] |
|**testMode** | **Boolean** | Is Test Mode enabled? |  [optional] |
|**theme** | **String** | The name of the UI theme |  [optional] |
|**user** | [**UserProperties**](UserProperties.md) | User settings |  [optional] |



