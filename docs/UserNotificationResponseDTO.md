

# UserNotificationResponseDTO

Data records

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Notification uuid |  |
|**type** | [**TypeEnum**](#TypeEnum) | Notification type |  |
|**code** | [**CodeEnum**](#CodeEnum) | Notification code |  |
|**data** | **Object** | Notification data |  |
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
| _1 | &quot;1&quot; |
| _101 | &quot;101&quot; |
| _102 | &quot;102&quot; |
| _103 | &quot;103&quot; |
| _104 | &quot;104&quot; |
| _105 | &quot;105&quot; |
| _106 | &quot;106&quot; |
| _107 | &quot;107&quot; |
| _108 | &quot;108&quot; |
| _109 | &quot;109&quot; |
| _201 | &quot;201&quot; |
| _202 | &quot;202&quot; |
| _203 | &quot;203&quot; |
| _301 | &quot;301&quot; |
| _302 | &quot;302&quot; |
| _303 | &quot;303&quot; |
| _304 | &quot;304&quot; |
| _305 | &quot;305&quot; |
| _306 | &quot;306&quot; |
| _307 | &quot;307&quot; |
| _308 | &quot;308&quot; |
| _309 | &quot;309&quot; |
| _310 | &quot;310&quot; |
| _311 | &quot;311&quot; |
| _312 | &quot;312&quot; |
| _313 | &quot;313&quot; |
| _314 | &quot;314&quot; |
| _315 | &quot;315&quot; |
| _316 | &quot;316&quot; |
| _317 | &quot;317&quot; |
| _318 | &quot;318&quot; |
| _319 | &quot;319&quot; |
| _401 | &quot;401&quot; |
| _402 | &quot;402&quot; |
| _501 | &quot;501&quot; |
| _502 | &quot;502&quot; |
| _503 | &quot;503&quot; |



