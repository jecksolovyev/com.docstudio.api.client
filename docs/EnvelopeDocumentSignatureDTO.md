

# EnvelopeDocumentSignatureDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**source** | [**SourceEnum**](#SourceEnum) | Signature source type |  |
|**stamp** | **Boolean** | Is stamp signature? |  |
|**data** | **byte[]** | Signature in base64 |  |
|**certificate** | **byte[]** | Optional X.509 certificate in base64 |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| BINARY | &quot;binary&quot; |
| TEXT | &quot;text&quot; |



