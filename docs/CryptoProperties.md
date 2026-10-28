

# CryptoProperties


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountDocumentSharingProviders** | **List&lt;String&gt;** |  |  [optional] |
|**allowVerifySignatures** | **Boolean** |  |  [optional] |
|**alwaysUseOcspProxy** | **Boolean** |  |  [optional] |
|**defaultSignatureAlgorithm** | [**DefaultSignatureAlgorithmEnum**](#DefaultSignatureAlgorithmEnum) |  |  [optional] |
|**defaultSignatureContainer** | [**DefaultSignatureContainerEnum**](#DefaultSignatureContainerEnum) |  |  [optional] |
|**edsSupported** | **Boolean** |  |  [optional] |
|**einkSupported** | **Boolean** |  |  [optional] |
|**initialsSupported** | **Boolean** |  |  [optional] |
|**ocspProxy** | **String** |  |  [optional] |
|**padesSupported** | **Boolean** |  |  [optional] |
|**region** | **String** |  |  [optional] |
|**signatureAlgorithms** | [**Set&lt;SignatureAlgorithmsEnum&gt;**](#Set&lt;SignatureAlgorithmsEnum&gt;) |  |  [optional] |
|**signatureContainers** | [**Set&lt;SignatureContainersEnum&gt;**](#Set&lt;SignatureContainersEnum&gt;) |  |  [optional] |
|**signatureProviders** | **List&lt;String&gt;** |  |  [optional] |
|**stampSupported** | **Boolean** |  |  [optional] |



## Enum: DefaultSignatureAlgorithmEnum

| Name | Value |
|---- | -----|
| DSTU4145 | &quot;DSTU4145&quot; |
| ECDSA_RSA | &quot;ECDSA_RSA&quot; |



## Enum: DefaultSignatureContainerEnum

| Name | Value |
|---- | -----|
| P7_S | &quot;P7S&quot; |
| ASICE | &quot;ASICE&quot; |
| P7_S_ENVELOPED | &quot;P7S_ENVELOPED&quot; |



## Enum: Set&lt;SignatureAlgorithmsEnum&gt;

| Name | Value |
|---- | -----|
| DSTU4145 | &quot;DSTU4145&quot; |
| ECDSA_RSA | &quot;ECDSA_RSA&quot; |



## Enum: Set&lt;SignatureContainersEnum&gt;

| Name | Value |
|---- | -----|
| P7_S | &quot;P7S&quot; |
| ASICE | &quot;ASICE&quot; |
| P7_S_ENVELOPED | &quot;P7S_ENVELOPED&quot; |



