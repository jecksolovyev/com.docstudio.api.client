

# UsersSearchFilterDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdFrom** | **OffsetDateTime** | Created date from |  [optional] |
|**createdTo** | **OffsetDateTime** | Created date to |  [optional] |
|**domains** | **List&lt;String&gt;** | Domains |  [optional] |
|**keyword** | **String** | Keyword to search by in: firstName, lastName, email |  [optional] |
|**mailbox** | **String** | UUID of Mailbox or &#39;no_access&#39; value |  [optional] |
|**roleUuids** | **List&lt;UUID&gt;** | UUIDs of Roles |  [optional] |
|**sort** | [**SortEnum**](#SortEnum) | Sort order by creation date, asc or desc |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | User status |  [optional] |



## Enum: SortEnum

| Name | Value |
|---- | -----|
| DESC | &quot;desc&quot; |
| ASC | &quot;asc&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING_INVITE | &quot;PENDING_INVITE&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| BLOCKED | &quot;BLOCKED&quot; |
| PENDING_PASSWORD | &quot;PENDING_PASSWORD&quot; |
| DELETED | &quot;DELETED&quot; |



