# AccountDomainDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | Domain UUID |  [optional]
**accountUuid** | [**UUID**](UUID.md) | Domain account uuid |  [optional]
**domain** | **String** | Domain name |  [optional]
**verifyInfo** | [**AccountDomainVerifyInfo**](AccountDomainVerifyInfo.md) |  |  [optional]
**verifyMethod** | [**VerifyMethodEnum**](#VerifyMethodEnum) | Domain verification method |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Domain status |  [optional]
**verificationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Domain verification date |  [optional]
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) | Domain creation date |  [optional]
**lastCheckDate** | [**OffsetDateTime**](OffsetDateTime.md) | Domain last check date |  [optional]
**ssoIdProvider** | [**AccountSsoIdProviderShortDTO**](AccountSsoIdProviderShortDTO.md) |  |  [optional]

<a name="VerifyMethodEnum"></a>
## Enum: VerifyMethodEnum
Name | Value
---- | -----
TXT_RECORD | &quot;DNS_TXT_RECORD&quot;
CNAME_RECORD | &quot;DNS_CNAME_RECORD&quot;

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UNVERIFIED | &quot;UNVERIFIED&quot;
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;
VERIFIED | &quot;VERIFIED&quot;
