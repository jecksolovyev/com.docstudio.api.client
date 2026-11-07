

# EditorialReviewInitRequest

Send EditorialReviewInitRequest in BLOB format with Content-Type: application/json

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mandatoryApproval** | **Boolean** | If true, the review can be finished only after every reviewer approved the same document version, and the document is locked for editing after the first approval |  [optional] |
|**message** | **String** | Message of envelope |  [optional] |
|**recipients** | [**List&lt;EditorialReviewRecipient&gt;**](EditorialReviewRecipient.md) |  |  |
|**subject** | **String** | Subject of envelope |  |



