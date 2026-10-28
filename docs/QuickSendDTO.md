

# QuickSendDTO

Send QuickSendDTO in BLOB format with Content-Type: application/json

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** | Message of envelope |  [optional] |
|**recipientExperience** | [**RecipientExperience**](RecipientExperience.md) |  |  [optional] |
|**recipients** | [**List&lt;QuickSendRecipientDTO&gt;**](QuickSendRecipientDTO.md) |  |  |
|**signatureAlgorithm** | [**SignatureAlgorithmEnum**](#SignatureAlgorithmEnum) | Signature algorithm |  [optional] |
|**signatureContainer** | [**SignatureContainerEnum**](#SignatureContainerEnum) | Signature container |  [optional] |
|**subject** | **String** | Subject of envelope |  |



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
| P7_S_ENVELOPED | &quot;P7S_ENVELOPED&quot; |



