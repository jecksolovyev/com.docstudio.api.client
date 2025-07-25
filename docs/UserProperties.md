

# UserProperties


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**profilePhoneRequired** | **Boolean** |  |  [optional] |
|**passwordPolicy** | [**PasswordPolicy**](PasswordPolicy.md) |  |  [optional] |
|**sessionPolicy** | [**SessionPolicy**](SessionPolicy.md) |  |  [optional] |
|**measurementSystem** | [**MeasurementSystemEnum**](#MeasurementSystemEnum) |  |  [optional] |
|**allowSelfDeletion** | **Boolean** |  |  [optional] |
|**allowUserApplicationTokens** | **Boolean** | Allow or deny user application tokens |  [optional] |
|**allowUsersToRegister** | **Boolean** | Allow or deny users to register |  [optional] |
|**allowAutoDeposite** | **Boolean** | Allow or deny users to set Auto Deposit Mailbox |  [optional] |
|**allowManageNotification** | **Boolean** | Allow or deny users to manage notifications |  [optional] |
|**profileFields** | [**List&lt;UserField&gt;**](UserField.md) |  |  [optional] |



## Enum: MeasurementSystemEnum

| Name | Value |
|---- | -----|
| METRIC | &quot;METRIC&quot; |
| IMPERIAL | &quot;IMPERIAL&quot; |



