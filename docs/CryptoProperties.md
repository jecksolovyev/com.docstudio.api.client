

# CryptoProperties


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**region** | **String** |  |  [optional] |
|**signatureProviders** | **List&lt;String&gt;** |  |  [optional] |
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



