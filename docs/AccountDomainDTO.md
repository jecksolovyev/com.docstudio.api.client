

# AccountDomainDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Domain UUID |  [optional] |
|**accountUuid** | **UUID** | Domain account uuid |  [optional] |
|**domain** | **String** | Domain name |  [optional] |
|**verifyInfo** | [**AccountDomainVerifyInfo**](AccountDomainVerifyInfo.md) | Domain verification info |  [optional] |
|**verifyMethod** | [**VerifyMethodEnum**](#VerifyMethodEnum) | Domain verification method |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Domain status |  [optional] |
|**verificationDate** | **OffsetDateTime** | Domain verification date |  [optional] |
|**createDate** | **OffsetDateTime** | Domain creation date |  [optional] |
|**lastCheckDate** | **OffsetDateTime** | Domain last check date |  [optional] |
|**ssoIdProvider** | [**AccountSsoIdProviderShortDTO**](AccountSsoIdProviderShortDTO.md) | SSO Identity Provider for domain |  [optional] |



## Enum: VerifyMethodEnum

| Name | Value |
|---- | -----|
| DNS_TXT_RECORD | &quot;DNS_TXT_RECORD&quot; |
| DNS_CNAME_RECORD | &quot;DNS_CNAME_RECORD&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNVERIFIED | &quot;UNVERIFIED&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| VERIFIED | &quot;VERIFIED&quot; |



