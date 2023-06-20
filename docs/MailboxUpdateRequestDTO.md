# MailboxUpdateRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Mailbox name | 
**archived** | **Boolean** | Mailbox archived | 
**aliases** | [**List&lt;AliasNameDTO&gt;**](AliasNameDTO.md) |  | 
**hideNameForAccounts** | **Boolean** | Hide mailbox name/aliases from other accounts | 
**autoDelegationEnabled** | **Boolean** | Auto delegate is enabled | 
**delegateTo** | [**UUID**](UUID.md) | Auto delegate envelopes to mailbox |  [optional]
**autoDelegateUntil** | **String** | Auto delegate until date in &#x27;ISO-8601&#x27; format |  [optional]
