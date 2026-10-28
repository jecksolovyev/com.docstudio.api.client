

# ExtEnvelopeDocumentSignatureDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**certificate** | **byte[]** | Optional X.509 certificate in base64 |  [optional] |
|**data** | **byte[]** | Signature in base64 |  |
|**signatureInfoXml** | **String** |  |  [optional] |
|**source** | [**SourceEnum**](#SourceEnum) | Signature source type |  |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| BINARY | &quot;binary&quot; |
| TEXT | &quot;text&quot; |



