

# DocumentForSigningDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**binaryFileName** | **String** | Binary file name |  [optional] |
|**binaryHash** | **byte[]** | Binary file hash for signing |  [optional] |
|**documentId** | **String** | ID of document |  [optional] |
|**expectedSignatureContainer** | [**ExpectedSignatureContainerEnum**](#ExpectedSignatureContainerEnum) | Expected signature container for &#39;sign&#39; endpoint |  [optional] |
|**signatureAlgorithm** | [**SignatureAlgorithmEnum**](#SignatureAlgorithmEnum) | Signature algorithm |  [optional] |
|**signatureContainer** | [**SignatureContainerEnum**](#SignatureContainerEnum) | Signature container |  [optional] |
|**signatures** | [**List&lt;RequiredSignatureDTO&gt;**](RequiredSignatureDTO.md) | Signatures |  [optional] |
|**xadesFiles** | [**List&lt;XadesFile&gt;**](XadesFile.md) | Files to generate XADES |  [optional] |
|**xmlHash** | **byte[]** | XML hash for signing |  [optional] |
|**xmlName** | **String** | XML file name |  [optional] |



## Enum: ExpectedSignatureContainerEnum

| Name | Value |
|---- | -----|
| RAW | &quot;RAW&quot; |
| CADES | &quot;CADES&quot; |
| XADES | &quot;XADES&quot; |



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



