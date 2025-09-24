

# DocumentsForSignRequestDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**signingCertificate** | **byte[]** | Certificate which will be used for signing |  [optional] |
|**stampCertificate** | **byte[]** | Stamp Certificate which will be used for signing |  [optional] |
|**skipBinaryFiles** | **Boolean** | Specify if original binary files are needed in response |  [optional] |
|**signatureAlgorithm** | [**SignatureAlgorithmEnum**](#SignatureAlgorithmEnum) | Check signature algorithm in advance |  [optional] |
|**tin** | **String** | Check Tax Individual Number in advance |  [optional] |
|**documents** | [**List&lt;DocIdSignatureNameDTO&gt;**](DocIdSignatureNameDTO.md) |  |  [optional] |



## Enum: SignatureAlgorithmEnum

| Name | Value |
|---- | -----|
| DSTU4145 | &quot;DSTU4145&quot; |
| ECDSA_RSA | &quot;ECDSA_RSA&quot; |



