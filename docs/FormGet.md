

# FormGet

Form get DTO

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**completedEnvelopes** | **Integer** | Completed envelopes count |  [optional] |
|**createdAt** | **OffsetDateTime** | Create date |  [optional] |
|**envelopeCreationCallback** | [**CallbackDetailsWithIdDTO**](CallbackDetailsWithIdDTO.md) | Callback on envelope creation |  [optional] |
|**id** | **UUID** | Form UUID |  [optional] |
|**lastUsedAt** | **OffsetDateTime** | Last used date |  [optional] |
|**link** | **String** | Form link |  [optional] |
|**modifiedAt** | **OffsetDateTime** | Update date |  [optional] |
|**multiUse** | **Boolean** | Form multi use (true) or single use (false, default) |  [optional] |
|**name** | **String** | Form name |  [optional] |
|**redirectUrl** | **String** | Form custom redirect url |  [optional] |
|**rejectedEnvelopes** | **Integer** | Rejected envelopes count |  [optional] |
|**settings** | [**FormSettings**](FormSettings.md) | Form settings |  [optional] |
|**template** | [**FormTemplate**](FormTemplate.md) | Form template |  [optional] |
|**totalEnvelopes** | **Integer** | Total envelopes count |  [optional] |



