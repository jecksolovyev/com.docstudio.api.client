

# FormGet

Form get DTO

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Form UUID |  [optional] |
|**name** | **String** | Form name |  [optional] |
|**template** | [**FormTemplate**](FormTemplate.md) | Form template |  [optional] |
|**multiUse** | **Boolean** | Form multi use (true) or single use (false, default) |  [optional] |
|**redirectUrl** | **String** | Form custom redirect url |  [optional] |
|**settings** | [**FormSettings**](FormSettings.md) | Form settings |  [optional] |
|**link** | **String** | Form link |  [optional] |
|**createdAt** | **OffsetDateTime** | Create date |  [optional] |
|**modifiedAt** | **OffsetDateTime** | Update date |  [optional] |
|**lastUsedAt** | **OffsetDateTime** | Last used date |  [optional] |
|**totalEnvelopes** | **Integer** | Total envelopes count |  [optional] |
|**completedEnvelopes** | **Integer** | Completed envelopes count |  [optional] |
|**rejectedEnvelopes** | **Integer** | Rejected envelopes count |  [optional] |
|**envelopeCreationCallback** | [**CallbackDetailsWithIdDTO**](CallbackDetailsWithIdDTO.md) | Callback on envelope creation |  [optional] |



