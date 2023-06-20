# AccountMailboxInfoDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | Mailbox uuid | 
**name** | **String** | Mailbox name | 
**hideNameForAccounts** | **Boolean** | Hide mailbox name/aliases from other accounts |  [optional]
**usersCount** | **Long** | Mailbox users count |  [optional]
**aliases** | [**List&lt;AliasNameDTO&gt;**](AliasNameDTO.md) | Mailbox aliases |  [optional]
**system** | **Boolean** |  |  [optional]
**delegateTo** | [**UUID**](UUID.md) | Auto delegate envelopes to mailbox |  [optional]
**autoDelegationEnabled** | **Boolean** | Auto delegate is enabled |  [optional]
**autoDelegateUntil** | **String** | Auto delegate until date |  [optional]
