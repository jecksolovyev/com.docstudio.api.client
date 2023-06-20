# TemplateRestriction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image** | [**ImageRestriction**](ImageRestriction.md) |  |  [optional]
**logo** | [**LogoImageRestriction**](LogoImageRestriction.md) |  |  [optional]
**table** | [**TemplTableRestriction**](TemplTableRestriction.md) |  |  [optional]
**expireAfterDays** | **Integer** |  |  [optional]
**notifyInDays** | **Integer** |  |  [optional]
**defaultPageSize** | [**DefaultPageSizeEnum**](#DefaultPageSizeEnum) |  |  [optional]
**supportedPageSizes** | [**List&lt;DocumentPageSizeDTO&gt;**](DocumentPageSizeDTO.md) |  |  [optional]

<a name="DefaultPageSizeEnum"></a>
## Enum: DefaultPageSizeEnum
Name | Value
---- | -----
A2 | &quot;A2&quot;
A3 | &quot;A3&quot;
A4 | &quot;A4&quot;
A5 | &quot;A5&quot;
LETTER | &quot;letter&quot;
