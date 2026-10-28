

# UserProperties


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowAutoDeposite** | **Boolean** | Allow or deny users to set Auto Deposit Mailbox |  [optional] |
|**allowManageNotification** | **Boolean** | Allow or deny users to manage notifications |  [optional] |
|**allowSelfDeletion** | **Boolean** |  |  [optional] |
|**allowUserApplicationTokens** | **Boolean** | Allow or deny user application tokens |  [optional] |
|**allowUsersToRegister** | **Boolean** | Allow or deny users to register |  [optional] |
|**measurementSystem** | [**MeasurementSystemEnum**](#MeasurementSystemEnum) |  |  [optional] |
|**passwordPolicy** | [**PasswordPolicy**](PasswordPolicy.md) |  |  [optional] |
|**profileFields** | [**List&lt;UserField&gt;**](UserField.md) |  |  [optional] |
|**profilePhoneRequired** | **Boolean** |  |  [optional] |
|**registerCompanyAccountDefault** | **Boolean** | Company as default account on registration |  [optional] |
|**sessionPolicy** | [**SessionPolicy**](SessionPolicy.md) |  |  [optional] |



## Enum: MeasurementSystemEnum

| Name | Value |
|---- | -----|
| METRIC | &quot;METRIC&quot; |
| IMPERIAL | &quot;IMPERIAL&quot; |



