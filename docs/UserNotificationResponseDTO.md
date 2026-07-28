

# UserNotificationResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Notification uuid |  |
|**type** | [**TypeEnum**](#TypeEnum) | Notification type |  |
|**code** | [**CodeEnum**](#CodeEnum) | Notification code |  |
|**data** | **Object** |  |  |
|**createdAt** | **OffsetDateTime** | Notification date |  |
|**mailboxUuid** | **UUID** | Mailbox UUID for mailbox-wide notifications |  [optional] |
|**accountUuid** | **UUID** | Account UUID for account-wide notifications |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| ACCOUNT | &quot;account&quot; |
| MAILBOX | &quot;mailbox&quot; |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_101 | 101 |
| NUMBER_102 | 102 |
| NUMBER_103 | 103 |
| NUMBER_104 | 104 |
| NUMBER_105 | 105 |
| NUMBER_106 | 106 |
| NUMBER_107 | 107 |
| NUMBER_108 | 108 |
| NUMBER_109 | 109 |
| NUMBER_201 | 201 |
| NUMBER_202 | 202 |
| NUMBER_203 | 203 |
| NUMBER_301 | 301 |
| NUMBER_302 | 302 |
| NUMBER_303 | 303 |
| NUMBER_304 | 304 |
| NUMBER_305 | 305 |
| NUMBER_306 | 306 |
| NUMBER_307 | 307 |
| NUMBER_308 | 308 |
| NUMBER_309 | 309 |
| NUMBER_310 | 310 |
| NUMBER_311 | 311 |
| NUMBER_312 | 312 |
| NUMBER_313 | 313 |
| NUMBER_314 | 314 |
| NUMBER_315 | 315 |
| NUMBER_316 | 316 |
| NUMBER_317 | 317 |
| NUMBER_318 | 318 |
| NUMBER_319 | 319 |
| NUMBER_401 | 401 |
| NUMBER_402 | 402 |
| NUMBER_501 | 501 |
| NUMBER_502 | 502 |
| NUMBER_503 | 503 |
| NUMBER_504 | 504 |
| NUMBER_505 | 505 |



