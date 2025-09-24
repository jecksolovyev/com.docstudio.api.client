

# CryptoProperties


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**region** | **String** |  |  [optional] |
|**signatureProviders** | **List&lt;String&gt;** |  |  [optional] |
|**signatureAlgorithms** | [**Set&lt;SignatureAlgorithmsEnum&gt;**](#Set&lt;SignatureAlgorithmsEnum&gt;) |  |  [optional] |
|**defaultSignatureAlgorithm** | [**DefaultSignatureAlgorithmEnum**](#DefaultSignatureAlgorithmEnum) |  |  [optional] |
|**signatureContainers** | [**Set&lt;SignatureContainersEnum&gt;**](#Set&lt;SignatureContainersEnum&gt;) |  |  [optional] |
|**defaultSignatureContainer** | [**DefaultSignatureContainerEnum**](#DefaultSignatureContainerEnum) |  |  [optional] |
|**accountDocumentSharingProviders** | **List&lt;String&gt;** |  |  [optional] |
|**stampSupported** | **Boolean** |  |  [optional] |
|**einkSupported** | **Boolean** |  |  [optional] |
|**initialsSupported** | **Boolean** |  |  [optional] |
|**edsSupported** | **Boolean** |  |  [optional] |
|**padesSupported** | **Boolean** |  |  [optional] |
|**ocspProxy** | **String** |  |  [optional] |
|**alwaysUseOcspProxy** | **Boolean** |  |  [optional] |
|**allowVerifySignatures** | **Boolean** |  |  [optional] |



## Enum: Set&lt;SignatureAlgorithmsEnum&gt;

| Name | Value |
|---- | -----|
| DSTU4145 | &quot;DSTU4145&quot; |
| ECDSA_RSA | &quot;ECDSA_RSA&quot; |



## Enum: DefaultSignatureAlgorithmEnum

| Name | Value |
|---- | -----|
| DSTU4145 | &quot;DSTU4145&quot; |
| ECDSA_RSA | &quot;ECDSA_RSA&quot; |



## Enum: Set&lt;SignatureContainersEnum&gt;

| Name | Value |
|---- | -----|
| P7_S | &quot;P7S&quot; |
| ASICE | &quot;ASICE&quot; |



## Enum: DefaultSignatureContainerEnum

| Name | Value |
|---- | -----|
| P7_S | &quot;P7S&quot; |
| ASICE | &quot;ASICE&quot; |



