

# FormGet

Form get DTO

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Form UUID |  |
|**name** | **String** | Form name |  |
|**template** | [**FormTemplate**](FormTemplate.md) | Form template |  |
|**multiUse** | **Boolean** | Form multi use (true) or single use (false, default) |  [optional] |
|**redirectUrl** | **String** | Form custom redirect url |  [optional] |
|**settings** | [**FormSettings**](FormSettings.md) | Form settings |  |
|**link** | **String** | Form link |  |
|**createdAt** | **OffsetDateTime** | Create date |  |
|**modifiedAt** | **OffsetDateTime** | Update date |  |
|**lastUsedAt** | **OffsetDateTime** | Last used date |  [optional] |
|**totalEnvelopes** | **Integer** | Total envelopes count |  |
|**completedEnvelopes** | **Integer** | Completed envelopes count |  |
|**rejectedEnvelopes** | **Integer** | Rejected envelopes count |  |



