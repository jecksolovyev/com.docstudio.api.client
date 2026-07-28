

# DocumentForSigningDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | **String** | ID of document |  [optional] |
|**xmlName** | **String** | XML file name |  [optional] |
|**xmlHash** | **byte[]** | XML hash for signing |  [optional] |
|**binaryFileName** | **String** | Binary file name |  [optional] |
|**binaryHash** | **byte[]** | Binary file hash for signing |  [optional] |
|**signatureAlgorithm** | [**SignatureAlgorithmEnum**](#SignatureAlgorithmEnum) | Signature algorithm |  [optional] |
|**signatureContainer** | [**SignatureContainerEnum**](#SignatureContainerEnum) | Signature container |  [optional] |
|**signatures** | [**List&lt;RequiredSignatureDTO&gt;**](RequiredSignatureDTO.md) | Signatures |  [optional] |
|**expectedSignatureContainer** | [**ExpectedSignatureContainerEnum**](#ExpectedSignatureContainerEnum) | Expected signature container for &#39;sign&#39; endpoint |  [optional] |
|**xadesFiles** | [**List&lt;XadesFile&gt;**](XadesFile.md) | Files to generate XADES |  [optional] |



## Enum: SignatureAlgorithmEnum

| Name | Value |
|---- | -----|
| DSTU4145 | &quot;DSTU4145&quot; |
| ECDSA_RSA | &quot;ECDSA_RSA&quot; |



## Enum: SignatureContainerEnum

| Name | Value |
|---- | -----|
| PADES | &quot;PADES&quot; |
| P7_S | &quot;P7S&quot; |
| ASICE | &quot;ASICE&quot; |



## Enum: ExpectedSignatureContainerEnum

| Name | Value |
|---- | -----|
| RAW | &quot;RAW&quot; |
| CADES | &quot;CADES&quot; |
| XADES | &quot;XADES&quot; |



