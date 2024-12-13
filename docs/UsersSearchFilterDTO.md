

# UsersSearchFilterDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mailbox** | **String** | UUID of Mailbox or &#39;no_access&#39; value |  [optional] |
|**keyword** | **String** | Keyword to search by in: firstName, lastName, email |  [optional] |
|**domains** | **List&lt;String&gt;** | Domains |  [optional] |
|**roleUuids** | **List&lt;UUID&gt;** | UUIDs of Roles |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | User status |  [optional] |
|**createdFrom** | **OffsetDateTime** | Created date from |  [optional] |
|**createdTo** | **OffsetDateTime** | Created date to |  [optional] |
|**sort** | [**SortEnum**](#SortEnum) | Sort order by creation date, asc or desc |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING_INVITE | &quot;PENDING_INVITE&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| BLOCKED | &quot;BLOCKED&quot; |
| PENDING_PASSWORD | &quot;PENDING_PASSWORD&quot; |
| DELETED | &quot;DELETED&quot; |



## Enum: SortEnum

| Name | Value |
|---- | -----|
| DESC | &quot;desc&quot; |
| ASC | &quot;asc&quot; |



