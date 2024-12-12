# UserDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | Unique identifier of user |  [optional]
**firstName** | **String** | First name of user |  [optional]
**lastName** | **String** | Last name of user |  [optional]
**email** | **String** | User e-mail |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | User creation date |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current status of user |  [optional]
**corporateUser** | **Boolean** | Is user corporate |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING_INVITE | &quot;PENDING_INVITE&quot;
ACTIVE | &quot;ACTIVE&quot;
BLOCKED | &quot;BLOCKED&quot;
PENDING_PASSWORD | &quot;PENDING_PASSWORD&quot;
DELETED | &quot;DELETED&quot;
