# DictionaryColumnValueSearchDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**envelopeUuid** | [**UUID**](UUID.md) | Envelope UUID, used for filtered dictionaries |  [optional]
**templateUuid** | [**UUID**](UUID.md) | Template UUID, used for filtered dictionaries |  [optional]
**versionUuid** | [**UUID**](UUID.md) | Template version UUID, used for filtered dictionaries |  [optional]
**documentId** | **String** | Document id, where field is located, used for filtered dictionaries |  [optional]
**fieldName** | **String** | Document id, where field is located, used for filtered dictionaries |  [optional]
**rowIndex** | **Integer** | Row index, where field is located in table used for filtered dictionaries |  [optional]
**keyword** | **String** | Keyword to search by |  [optional]
**filter** | **Map&lt;String, String&gt;** | Values for filter columns, except filter by role |  [optional]
