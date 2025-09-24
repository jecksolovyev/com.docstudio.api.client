

# DocumentForSigningDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | **String** | ID of document |  [optional] |
|**xmlName** | **String** | XML file name |  [optional] |
|**xml** | **String** | XML for signing |  [optional] |
|**xmlHash** | **byte[]** | XML hash for signing |  [optional] |
|**binaryFileName** | **String** | Binary file name |  [optional] |
|**binaryFile** | **byte[]** | Binary file for signing |  [optional] |
|**binaryHash** | **byte[]** | Binary file hash for signing |  [optional] |
|**stampHash** | **byte[]** | Stamp hash for signing |  [optional] |
|**signatureAlgorithm** | [**SignatureAlgorithmEnum**](#SignatureAlgorithmEnum) | Signature algorithm |  [optional] |
|**signatureContainer** | [**SignatureContainerEnum**](#SignatureContainerEnum) | Signature container |  [optional] |
|**signatures** | [**List&lt;RequiredSignatureDTO&gt;**](RequiredSignatureDTO.md) | Signatures |  [optional] |



## Enum: SignatureAlgorithmEnum

| Name | Value |
|---- | -----|
| DSTU4145 | &quot;DSTU4145&quot; |
| ECDSA_RSA | &quot;ECDSA_RSA&quot; |



## Enum: SignatureContainerEnum

| Name | Value |
|---- | -----|
| P7_S | &quot;P7S&quot; |
| ASICE | &quot;ASICE&quot; |



