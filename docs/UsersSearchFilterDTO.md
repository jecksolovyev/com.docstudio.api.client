# UsersSearchFilterDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mailbox** | **String** | UUID of Mailbox or &#x27;no_access&#x27; value |  [optional]
**keyword** | **String** | Keyword to search by in: firstName, lastName, email |  [optional]
**domains** | **List&lt;String&gt;** | Domains |  [optional]
**roleUuids** | [**List&lt;UUID&gt;**](UUID.md) | UUIDs of Roles |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | User status |  [optional]
**createdFrom** | [**OffsetDateTime**](OffsetDateTime.md) | Created date from |  [optional]
**createdTo** | [**OffsetDateTime**](OffsetDateTime.md) | Created date to |  [optional]
**sort** | [**SortEnum**](#SortEnum) | Sort order by creation date, asc or desc |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING_INVITE | &quot;PENDING_INVITE&quot;
ACTIVE | &quot;ACTIVE&quot;
BLOCKED | &quot;BLOCKED&quot;
PENDING_PASSWORD | &quot;PENDING_PASSWORD&quot;
DELETED | &quot;DELETED&quot;

<a name="SortEnum"></a>
## Enum: SortEnum
Name | Value
---- | -----
DESC | &quot;desc&quot;
ASC | &quot;asc&quot;
