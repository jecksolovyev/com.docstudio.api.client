# UserNotificationResponseDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | Notification uuid | 
**type** | [**TypeEnum**](#TypeEnum) | Notification type | 
**code** | [**CodeEnum**](#CodeEnum) | Notification code | 
**data** | **Object** | Notification data | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Notification date | 
**mailboxUuid** | [**UUID**](UUID.md) | Mailbox UUID for mailbox-wide notifications |  [optional]
**accountUuid** | [**UUID**](UUID.md) | Account UUID for account-wide notifications |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
USER | &quot;user&quot;
ACCOUNT | &quot;account&quot;
MAILBOX | &quot;mailbox&quot;

<a name="CodeEnum"></a>
## Enum: CodeEnum
Name | Value
---- | -----
_1 | &quot;1&quot;
_101 | &quot;101&quot;
_102 | &quot;102&quot;
_103 | &quot;103&quot;
_104 | &quot;104&quot;
_105 | &quot;105&quot;
_106 | &quot;106&quot;
_201 | &quot;201&quot;
_202 | &quot;202&quot;
_301 | &quot;301&quot;
_302 | &quot;302&quot;
_303 | &quot;303&quot;
_304 | &quot;304&quot;
_305 | &quot;305&quot;
_306 | &quot;306&quot;
_307 | &quot;307&quot;
_308 | &quot;308&quot;
_309 | &quot;309&quot;
_310 | &quot;310&quot;
_311 | &quot;311&quot;
_312 | &quot;312&quot;
_313 | &quot;313&quot;
_314 | &quot;314&quot;
_315 | &quot;315&quot;
_401 | &quot;401&quot;
_402 | &quot;402&quot;
