

# AuditTrailDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**browser** | **String** |  |  [optional] |
|**dateTime** | **OffsetDateTime** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**envelopeUuid** | **UUID** |  |  [optional] |
|**geolocation** | [**GeolocationInfoDTO**](GeolocationInfoDTO.md) |  |  [optional] |
|**ip** | **String** |  |  [optional] |
|**latitude** | **Float** |  |  [optional] |
|**longitude** | **Float** |  |  [optional] |
|**mailboxName** | **String** |  |  [optional] |
|**mailboxUuid** | **UUID** |  |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional] |
|**os** | **String** |  |  [optional] |
|**userFirstAndLastName** | **String** |  |  [optional] |
|**userUuid** | **UUID** |  |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| CREATE_DRAFT_ENV | &quot;CREATE_DRAFT_ENV&quot; |
| DRAFT_UPDATE | &quot;DRAFT_UPDATE&quot; |
| SEND_ENVELOPE | &quot;SEND_ENVELOPE&quot; |
| RECEIVE_ENVELOPE | &quot;RECEIVE_ENVELOPE&quot; |
| VIEW_ENVELOPE | &quot;VIEW_ENVELOPE&quot; |
| FILL_FIELDS | &quot;FILL_FIELDS&quot; |
| APPROVED | &quot;APPROVED&quot; |
| CANCEL | &quot;CANCEL&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| ARCHIVE | &quot;ARCHIVE&quot; |
| UNARCHIVE | &quot;UNARCHIVE&quot; |
| INVITATION_ACCEPT | &quot;INVITATION_ACCEPT&quot; |
| SIGN_DOCUMENTS | &quot;SIGN_DOCUMENTS&quot; |
| ENVELOPE_UPDATE | &quot;ENVELOPE_UPDATE&quot; |
| ENVELOPE_DELEGATE | &quot;ENVELOPE_DELEGATE&quot; |
| DELETE | &quot;DELETE&quot; |
| RESTORE | &quot;RESTORE&quot; |
| INFO | &quot;INFO&quot; |
| ARCHIVE_SHARE | &quot;ARCHIVE_SHARE&quot; |
| ARCHIVE_DOWNLOAD | &quot;ARCHIVE_DOWNLOAD&quot; |
| COPY_SHARED | &quot;COPY_SHARED&quot; |
| DELEGATION_CANCELLED | &quot;DELEGATION_CANCELLED&quot; |
| REVIEW_REWORK | &quot;REVIEW_REWORK&quot; |



