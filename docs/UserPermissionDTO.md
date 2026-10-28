

# UserPermissionDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorizations** | [**UserAuthorizationDTO**](UserAuthorizationDTO.md) |  |  [optional] |
|**corporateUser** | **Boolean** | Is user corporate |  [optional] |
|**createdAt** | **OffsetDateTime** | User creation date |  [optional] |
|**email** | **String** | User e-mail |  [optional] |
|**fields** | **Map&lt;String, Object&gt;** | Additional user fields |  [optional] |
|**firstName** | **String** | First name of user |  [optional] |
|**lastName** | **String** | Last name of user |  [optional] |
|**phone** | **String** | Phone number |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of user |  [optional] |
|**uuid** | **UUID** | Unique identifier of user |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING_INVITE | &quot;PENDING_INVITE&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| BLOCKED | &quot;BLOCKED&quot; |
| PENDING_PASSWORD | &quot;PENDING_PASSWORD&quot; |
| DELETED | &quot;DELETED&quot; |



