# AuditTrailDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**envelopeUuid** | [**UUID**](UUID.md) |  |  [optional]
**dateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**userUuid** | [**UUID**](UUID.md) |  |  [optional]
**mailboxUuid** | [**UUID**](UUID.md) |  |  [optional]
**mailboxName** | **String** |  |  [optional]
**userFirstAndLastName** | **String** |  |  [optional]
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**ip** | **String** |  |  [optional]
**browser** | **String** |  |  [optional]
**os** | **String** |  |  [optional]
**geolocation** | [**GeolocationInfoDTO**](GeolocationInfoDTO.md) |  |  [optional]
**description** | **String** |  |  [optional]
**longitude** | **Float** |  |  [optional]
**latitude** | **Float** |  |  [optional]

<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
CREATE_DRAFT_ENV | &quot;CREATE_DRAFT_ENV&quot;
DRAFT_UPDATE | &quot;DRAFT_UPDATE&quot;
SEND_ENVELOPE | &quot;SEND_ENVELOPE&quot;
RECEIVE_ENVELOPE | &quot;RECEIVE_ENVELOPE&quot;
VIEW_ENVELOPE | &quot;VIEW_ENVELOPE&quot;
FILL_FIELDS | &quot;FILL_FIELDS&quot;
APPROVED | &quot;APPROVED&quot;
CANCEL | &quot;CANCEL&quot;
COMPLETED | &quot;COMPLETED&quot;
ARCHIVE | &quot;ARCHIVE&quot;
UNARCHIVE | &quot;UNARCHIVE&quot;
INVITATION_ACCEPT | &quot;INVITATION_ACCEPT&quot;
SIGN_DOCUMENTS | &quot;SIGN_DOCUMENTS&quot;
ENVELOPE_UPDATE | &quot;ENVELOPE_UPDATE&quot;
ENVELOPE_DELEGATE | &quot;ENVELOPE_DELEGATE&quot;
DOC_STAMP | &quot;DOC_STAMP&quot;
