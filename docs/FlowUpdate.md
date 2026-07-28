

# FlowUpdate

Single role recipient change within a sent envelope flow

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Role id from the envelope flow |  |
|**from** | **String** | Current role addressee (email or mailbox id), used as a stale-state guard |  |
|**to** | **String** | New role addressee — valid email or mailbox id (UUID) |  |



