# ActivityLogRecordDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mailboxUuid** | [**UUID**](UUID.md) | UUID of mailbox |  [optional]
**mailboxName** | **String** | Name of mailbox |  [optional]
**action** | [**ActivityLogAction**](ActivityLogAction.md) |  |  [optional]
**objectName** | **String** | Object name |  [optional]
**objectType** | [**ActivityLogObjectType**](ActivityLogObjectType.md) |  |  [optional]
**objectId** | [**UUID**](UUID.md) | Object UUID |  [optional]
**operatorId** | [**UUID**](UUID.md) | Operator UUID |  [optional]
**operatorName** | **String** | Operator name |  [optional]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | Action timestamp |  [optional]
**source** | [**OperationSource**](OperationSource.md) |  |  [optional]
**ip** | **String** | IP address |  [optional]
**browser** | **String** | Browser |  [optional]
**os** | **String** | Operation System |  [optional]
**errorCode** | **Integer** | Error code |  [optional]
