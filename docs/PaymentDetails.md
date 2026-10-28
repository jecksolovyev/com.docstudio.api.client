

# PaymentDetails

Payment details to show on the checkout page

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **BigDecimal** | Payment amount in UAH |  [optional] |
|**envelopeId** | **UUID** | Envelope ID; use it with the access code to download the envelope archive |  [optional] |
|**expireAt** | **String** | When the payment expires, version 3 only |  [optional] |
|**function** | [**FunctionEnum**](#FunctionEnum) | NBU QR code function, version 3 only |  [optional] |
|**iban** | **String** | Recipient IBAN |  [optional] |
|**itn** | **String** | Recipient tax identification number (EDRPOU or ITN) |  [optional] |
|**purpose** | **String** | Purpose of the payment |  [optional] |
|**qr** | **String** | QR code image in SVG format |  [optional] |
|**recipient** | **String** | Payment recipient name |  [optional] |
|**reference** | **String** | Payment reference, version 3 only |  [optional] |
|**version** | **Integer** | NBU QR code format version: 2 or 3 |  [optional] |



## Enum: FunctionEnum

| Name | Value |
|---- | -----|
| XCT | &quot;XCT&quot; |
| ICT | &quot;ICT&quot; |
| UCT | &quot;UCT&quot; |



