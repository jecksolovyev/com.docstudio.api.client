# EnvelopeDocumentSignatureDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | [**SourceEnum**](#SourceEnum) | Signature source type | 
**stamp** | **Boolean** | Is stamp signature? | 
**data** | **String** | Signature in base64 | 
**certificate** | **String** | Optional X.509 certificate in base64 |  [optional]

<a name="SourceEnum"></a>
## Enum: SourceEnum
Name | Value
---- | -----
BINARY | &quot;binary&quot;
TEXT | &quot;text&quot;
