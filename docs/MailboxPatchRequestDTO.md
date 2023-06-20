# MailboxPatchRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Mailbox name |  [optional]
**archived** | **Boolean** | Mailbox archived |  [optional]
**aliases** | [**List&lt;AliasNameDTO&gt;**](AliasNameDTO.md) | Mailbox aliases |  [optional]
**hideNameForAccounts** | **Boolean** | Hide mailbox name/aliases from other accounts |  [optional]
**autoDelegationEnabled** | **Boolean** | Auto delegate is enabled |  [optional]
**delegateTo** | [**UUID**](UUID.md) | Auto delegate envelopes to mailbox |  [optional]
**autoDelegateUntil** | **String** | Auto delegate until date in &#x27;ISO-8601&#x27; format |  [optional]
