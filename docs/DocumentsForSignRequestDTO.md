

# DocumentsForSignRequestDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**signingCertificate** | **byte[]** | Certificate which will be used for signing |  [optional] |
|**signerInformation** | [**SignerInformation**](SignerInformation.md) | Alternative info about the signer if no certificate |  [optional] |
|**signatureAlgorithm** | [**SignatureAlgorithmEnum**](#SignatureAlgorithmEnum) | Check signature algorithm in advance |  [optional] |
|**cloudContainers** | [**Set&lt;CloudContainersEnum&gt;**](#Set&lt;CloudContainersEnum&gt;) | Containers supported by a cloud-based signing service provider |  [optional] |
|**tin** | **String** | Check Tax Individual Number in advance |  [optional] |
|**documents** | [**List&lt;DocIdSignatureNameDTO&gt;**](DocIdSignatureNameDTO.md) |  |  [optional] |



## Enum: SignatureAlgorithmEnum

| Name | Value |
|---- | -----|
| DSTU4145 | &quot;DSTU4145&quot; |
| ECDSA_RSA | &quot;ECDSA_RSA&quot; |



## Enum: Set&lt;CloudContainersEnum&gt;

| Name | Value |
|---- | -----|
| RAW | &quot;RAW&quot; |
| CADES | &quot;CADES&quot; |
| XADES | &quot;XADES&quot; |



