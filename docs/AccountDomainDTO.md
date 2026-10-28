

# AccountDomainDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountUuid** | **UUID** | Domain account uuid |  [optional] |
|**createDate** | **OffsetDateTime** | Domain creation date |  [optional] |
|**domain** | **String** | Domain name |  [optional] |
|**lastCheckDate** | **OffsetDateTime** | Domain last check date |  [optional] |
|**onlySsoLogin** | **Boolean** | Allow only SSO login for this domain |  [optional] |
|**ssoIdProvider** | [**NameUuidDTO**](NameUuidDTO.md) | SSO Identity Provider for domain |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Domain status |  [optional] |
|**uuid** | **UUID** | Domain UUID |  [optional] |
|**verificationDate** | **OffsetDateTime** | Domain verification date |  [optional] |
|**verifyInfo** | [**AccountDomainVerifyInfo**](AccountDomainVerifyInfo.md) | Domain verification info |  [optional] |
|**verifyMethod** | [**VerifyMethodEnum**](#VerifyMethodEnum) | Domain verification method |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNVERIFIED | &quot;UNVERIFIED&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| VERIFIED | &quot;VERIFIED&quot; |



## Enum: VerifyMethodEnum

| Name | Value |
|---- | -----|
| DNS_TXT_RECORD | &quot;DNS_TXT_RECORD&quot; |
| DNS_CNAME_RECORD | &quot;DNS_CNAME_RECORD&quot; |



