/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R110.4
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import com.docstudio.client.JSON;
import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * Integration rule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class IntegrationRuleDTO {
  public static final String SERIALIZED_NAME_INTEGRATION_RULE_UUID = "integrationRuleUuid";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_RULE_UUID)
  private UUID integrationRuleUuid;

  public static final String SERIALIZED_NAME_ACCOUNT_UUID = "accountUuid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_UUID)
  private UUID accountUuid;

  public static final String SERIALIZED_NAME_MAILBOX_UUID = "mailboxUuid";
  @SerializedName(SERIALIZED_NAME_MAILBOX_UUID)
  private UUID mailboxUuid;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_IN = "in";
  @SerializedName(SERIALIZED_NAME_IN)
  private Boolean in;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEMPLATE_UUID = "templateUuid";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_UUID)
  private UUID templateUuid;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "templateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_VERSION_UUID = "versionUuid";
  @SerializedName(SERIALIZED_NAME_VERSION_UUID)
  private UUID versionUuid;

  public static final String SERIALIZED_NAME_MATCHING_PATTERN = "matchingPattern";
  @SerializedName(SERIALIZED_NAME_MATCHING_PATTERN)
  private String matchingPattern;

  /**
   * File matching pattern source: name or content
   */
  @JsonAdapter(MatchingPatternSrcEnum.Adapter.class)
  public enum MatchingPatternSrcEnum {
    NAME("name"),

    CONTENT("content"),

    ATTRIBUTE("attribute");

    private String value;

    MatchingPatternSrcEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MatchingPatternSrcEnum fromValue(String value) {
      for (MatchingPatternSrcEnum b : MatchingPatternSrcEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MatchingPatternSrcEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchingPatternSrcEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchingPatternSrcEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MatchingPatternSrcEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MatchingPatternSrcEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MATCHING_PATTERN_SRC = "matchingPatternSrc";
  @SerializedName(SERIALIZED_NAME_MATCHING_PATTERN_SRC)
  private MatchingPatternSrcEnum matchingPatternSrc;

  public static final String SERIALIZED_NAME_NAMING_PATTERN = "namingPattern";
  @SerializedName(SERIALIZED_NAME_NAMING_PATTERN)
  private String namingPattern;

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule;

  public static final String SERIALIZED_NAME_ZIP_STRUCTURE_NAME = "zipStructureName";
  @SerializedName(SERIALIZED_NAME_ZIP_STRUCTURE_NAME)
  private String zipStructureName;

  public static final String SERIALIZED_NAME_EXCLUDE_ZIP_FILES = "excludeZipFiles";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_ZIP_FILES)
  private String excludeZipFiles;

  public static final String SERIALIZED_NAME_MULTIPLE_ENVELOPES = "multipleEnvelopes";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_ENVELOPES)
  private Boolean multipleEnvelopes;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, String> attributes = new HashMap<>();

  public IntegrationRuleDTO() {
  }

  public IntegrationRuleDTO integrationRuleUuid(UUID integrationRuleUuid) {
    this.integrationRuleUuid = integrationRuleUuid;
    return this;
  }

  /**
   * Integration rule uuid
   * @return integrationRuleUuid
   */
  @javax.annotation.Nullable
  public UUID getIntegrationRuleUuid() {
    return integrationRuleUuid;
  }

  public void setIntegrationRuleUuid(UUID integrationRuleUuid) {
    this.integrationRuleUuid = integrationRuleUuid;
  }


  public IntegrationRuleDTO accountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

  /**
   * Account uuid
   * @return accountUuid
   */
  @javax.annotation.Nonnull
  public UUID getAccountUuid() {
    return accountUuid;
  }

  public void setAccountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
  }


  public IntegrationRuleDTO mailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

  /**
   * Mailbox uuid
   * @return mailboxUuid
   */
  @javax.annotation.Nullable
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }


  public IntegrationRuleDTO active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Integration rule status
   * @return active
   */
  @javax.annotation.Nonnull
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  public IntegrationRuleDTO in(Boolean in) {
    this.in = in;
    return this;
  }

  /**
   * Integration rule direction, true: in, false: out
   * @return in
   */
  @javax.annotation.Nonnull
  public Boolean getIn() {
    return in;
  }

  public void setIn(Boolean in) {
    this.in = in;
  }


  public IntegrationRuleDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Integration rule name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public IntegrationRuleDTO templateUuid(UUID templateUuid) {
    this.templateUuid = templateUuid;
    return this;
  }

  /**
   * Template uuid
   * @return templateUuid
   */
  @javax.annotation.Nonnull
  public UUID getTemplateUuid() {
    return templateUuid;
  }

  public void setTemplateUuid(UUID templateUuid) {
    this.templateUuid = templateUuid;
  }


  public IntegrationRuleDTO templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

  /**
   * Template name
   * @return templateName
   */
  @javax.annotation.Nullable
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public IntegrationRuleDTO versionUuid(UUID versionUuid) {
    this.versionUuid = versionUuid;
    return this;
  }

  /**
   * Version uuid
   * @return versionUuid
   */
  @javax.annotation.Nonnull
  public UUID getVersionUuid() {
    return versionUuid;
  }

  public void setVersionUuid(UUID versionUuid) {
    this.versionUuid = versionUuid;
  }


  public IntegrationRuleDTO matchingPattern(String matchingPattern) {
    this.matchingPattern = matchingPattern;
    return this;
  }

  /**
   * File matching pattern
   * @return matchingPattern
   */
  @javax.annotation.Nullable
  public String getMatchingPattern() {
    return matchingPattern;
  }

  public void setMatchingPattern(String matchingPattern) {
    this.matchingPattern = matchingPattern;
  }


  public IntegrationRuleDTO matchingPatternSrc(MatchingPatternSrcEnum matchingPatternSrc) {
    this.matchingPatternSrc = matchingPatternSrc;
    return this;
  }

  /**
   * File matching pattern source: name or content
   * @return matchingPatternSrc
   */
  @javax.annotation.Nullable
  public MatchingPatternSrcEnum getMatchingPatternSrc() {
    return matchingPatternSrc;
  }

  public void setMatchingPatternSrc(MatchingPatternSrcEnum matchingPatternSrc) {
    this.matchingPatternSrc = matchingPatternSrc;
  }


  public IntegrationRuleDTO namingPattern(String namingPattern) {
    this.namingPattern = namingPattern;
    return this;
  }

  /**
   * File naming pattern
   * @return namingPattern
   */
  @javax.annotation.Nullable
  public String getNamingPattern() {
    return namingPattern;
  }

  public void setNamingPattern(String namingPattern) {
    this.namingPattern = namingPattern;
  }


  public IntegrationRuleDTO rule(String rule) {
    this.rule = rule;
    return this;
  }

  /**
   * XSLT mapping
   * @return rule
   */
  @javax.annotation.Nullable
  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }


  public IntegrationRuleDTO zipStructureName(String zipStructureName) {
    this.zipStructureName = zipStructureName;
    return this;
  }

  /**
   * The name of pre-saved zip structure in the template
   * @return zipStructureName
   */
  @javax.annotation.Nullable
  public String getZipStructureName() {
    return zipStructureName;
  }

  public void setZipStructureName(String zipStructureName) {
    this.zipStructureName = zipStructureName;
  }


  public IntegrationRuleDTO excludeZipFiles(String excludeZipFiles) {
    this.excludeZipFiles = excludeZipFiles;
    return this;
  }

  /**
   * Mask to exclude some files from ZIP. c - for signature/processing Certificate, p - for Printable version, a - for Audit trail
   * @return excludeZipFiles
   */
  @javax.annotation.Nullable
  public String getExcludeZipFiles() {
    return excludeZipFiles;
  }

  public void setExcludeZipFiles(String excludeZipFiles) {
    this.excludeZipFiles = excludeZipFiles;
  }


  public IntegrationRuleDTO multipleEnvelopes(Boolean multipleEnvelopes) {
    this.multipleEnvelopes = multipleEnvelopes;
    return this;
  }

  /**
   * Rule using for creating multiple envelopes
   * @return multipleEnvelopes
   */
  @javax.annotation.Nullable
  public Boolean getMultipleEnvelopes() {
    return multipleEnvelopes;
  }

  public void setMultipleEnvelopes(Boolean multipleEnvelopes) {
    this.multipleEnvelopes = multipleEnvelopes;
  }


  public IntegrationRuleDTO attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public IntegrationRuleDTO putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Some additional attributes (XPATH can be used as a value)
   * @return attributes
   */
  @javax.annotation.Nullable
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationRuleDTO integrationRuleDTO = (IntegrationRuleDTO) o;
    return Objects.equals(this.integrationRuleUuid, integrationRuleDTO.integrationRuleUuid) &&
        Objects.equals(this.accountUuid, integrationRuleDTO.accountUuid) &&
        Objects.equals(this.mailboxUuid, integrationRuleDTO.mailboxUuid) &&
        Objects.equals(this.active, integrationRuleDTO.active) &&
        Objects.equals(this.in, integrationRuleDTO.in) &&
        Objects.equals(this.name, integrationRuleDTO.name) &&
        Objects.equals(this.templateUuid, integrationRuleDTO.templateUuid) &&
        Objects.equals(this.templateName, integrationRuleDTO.templateName) &&
        Objects.equals(this.versionUuid, integrationRuleDTO.versionUuid) &&
        Objects.equals(this.matchingPattern, integrationRuleDTO.matchingPattern) &&
        Objects.equals(this.matchingPatternSrc, integrationRuleDTO.matchingPatternSrc) &&
        Objects.equals(this.namingPattern, integrationRuleDTO.namingPattern) &&
        Objects.equals(this.rule, integrationRuleDTO.rule) &&
        Objects.equals(this.zipStructureName, integrationRuleDTO.zipStructureName) &&
        Objects.equals(this.excludeZipFiles, integrationRuleDTO.excludeZipFiles) &&
        Objects.equals(this.multipleEnvelopes, integrationRuleDTO.multipleEnvelopes) &&
        Objects.equals(this.attributes, integrationRuleDTO.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationRuleUuid, accountUuid, mailboxUuid, active, in, name, templateUuid, templateName, versionUuid, matchingPattern, matchingPatternSrc, namingPattern, rule, zipStructureName, excludeZipFiles, multipleEnvelopes, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationRuleDTO {\n");
    sb.append("    integrationRuleUuid: ").append(toIndentedString(integrationRuleUuid)).append("\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    templateUuid: ").append(toIndentedString(templateUuid)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    versionUuid: ").append(toIndentedString(versionUuid)).append("\n");
    sb.append("    matchingPattern: ").append(toIndentedString(matchingPattern)).append("\n");
    sb.append("    matchingPatternSrc: ").append(toIndentedString(matchingPatternSrc)).append("\n");
    sb.append("    namingPattern: ").append(toIndentedString(namingPattern)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    zipStructureName: ").append(toIndentedString(zipStructureName)).append("\n");
    sb.append("    excludeZipFiles: ").append(toIndentedString(excludeZipFiles)).append("\n");
    sb.append("    multipleEnvelopes: ").append(toIndentedString(multipleEnvelopes)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("integrationRuleUuid");
    openapiFields.add("accountUuid");
    openapiFields.add("mailboxUuid");
    openapiFields.add("active");
    openapiFields.add("in");
    openapiFields.add("name");
    openapiFields.add("templateUuid");
    openapiFields.add("templateName");
    openapiFields.add("versionUuid");
    openapiFields.add("matchingPattern");
    openapiFields.add("matchingPatternSrc");
    openapiFields.add("namingPattern");
    openapiFields.add("rule");
    openapiFields.add("zipStructureName");
    openapiFields.add("excludeZipFiles");
    openapiFields.add("multipleEnvelopes");
    openapiFields.add("attributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountUuid");
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("in");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("templateUuid");
    openapiRequiredFields.add("versionUuid");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IntegrationRuleDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntegrationRuleDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntegrationRuleDTO is not found in the empty JSON string", IntegrationRuleDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IntegrationRuleDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntegrationRuleDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IntegrationRuleDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("integrationRuleUuid") != null && !jsonObj.get("integrationRuleUuid").isJsonNull()) && !jsonObj.get("integrationRuleUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integrationRuleUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integrationRuleUuid").toString()));
      }
      if (!jsonObj.get("accountUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountUuid").toString()));
      }
      if ((jsonObj.get("mailboxUuid") != null && !jsonObj.get("mailboxUuid").isJsonNull()) && !jsonObj.get("mailboxUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxUuid").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("templateUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateUuid").toString()));
      }
      if ((jsonObj.get("templateName") != null && !jsonObj.get("templateName").isJsonNull()) && !jsonObj.get("templateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateName").toString()));
      }
      if (!jsonObj.get("versionUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionUuid").toString()));
      }
      if ((jsonObj.get("matchingPattern") != null && !jsonObj.get("matchingPattern").isJsonNull()) && !jsonObj.get("matchingPattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchingPattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchingPattern").toString()));
      }
      if ((jsonObj.get("matchingPatternSrc") != null && !jsonObj.get("matchingPatternSrc").isJsonNull()) && !jsonObj.get("matchingPatternSrc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchingPatternSrc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchingPatternSrc").toString()));
      }
      // validate the optional field `matchingPatternSrc`
      if (jsonObj.get("matchingPatternSrc") != null && !jsonObj.get("matchingPatternSrc").isJsonNull()) {
        MatchingPatternSrcEnum.validateJsonElement(jsonObj.get("matchingPatternSrc"));
      }
      if ((jsonObj.get("namingPattern") != null && !jsonObj.get("namingPattern").isJsonNull()) && !jsonObj.get("namingPattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namingPattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namingPattern").toString()));
      }
      if ((jsonObj.get("rule") != null && !jsonObj.get("rule").isJsonNull()) && !jsonObj.get("rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule").toString()));
      }
      if ((jsonObj.get("zipStructureName") != null && !jsonObj.get("zipStructureName").isJsonNull()) && !jsonObj.get("zipStructureName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipStructureName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipStructureName").toString()));
      }
      if ((jsonObj.get("excludeZipFiles") != null && !jsonObj.get("excludeZipFiles").isJsonNull()) && !jsonObj.get("excludeZipFiles").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludeZipFiles` to be a primitive type in the JSON string but got `%s`", jsonObj.get("excludeZipFiles").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntegrationRuleDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntegrationRuleDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntegrationRuleDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntegrationRuleDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<IntegrationRuleDTO>() {
           @Override
           public void write(JsonWriter out, IntegrationRuleDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntegrationRuleDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IntegrationRuleDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IntegrationRuleDTO
   * @throws IOException if the JSON string is invalid with respect to IntegrationRuleDTO
   */
  public static IntegrationRuleDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntegrationRuleDTO.class);
  }

  /**
   * Convert an instance of IntegrationRuleDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
