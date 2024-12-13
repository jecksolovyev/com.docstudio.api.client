/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R120.10
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
 * Integration default rules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class IntegrationDefaultRuleDTO {
  /**
   * Default rule
   */
  @JsonAdapter(RuleEnum.Adapter.class)
  public enum RuleEnum {
    INBOX("inbox"),

    INBOX_NOTIFY_EMAIL("inbox-notify-email"),

    AUTOREJECT("autoreject");

    private String value;

    RuleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RuleEnum fromValue(String value) {
      for (RuleEnum b : RuleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RuleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RuleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RuleEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RuleEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  @javax.annotation.Nonnull
  private RuleEnum rule;

  public static final String SERIALIZED_NAME_PARAMETER = "parameter";
  @SerializedName(SERIALIZED_NAME_PARAMETER)
  @javax.annotation.Nullable
  private String parameter;

  public IntegrationDefaultRuleDTO() {
  }

  public IntegrationDefaultRuleDTO rule(@javax.annotation.Nonnull RuleEnum rule) {
    this.rule = rule;
    return this;
  }

  /**
   * Default rule
   * @return rule
   */
  @javax.annotation.Nonnull
  public RuleEnum getRule() {
    return rule;
  }

  public void setRule(@javax.annotation.Nonnull RuleEnum rule) {
    this.rule = rule;
  }


  public IntegrationDefaultRuleDTO parameter(@javax.annotation.Nullable String parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * Default rule parameter
   * @return parameter
   */
  @javax.annotation.Nullable
  public String getParameter() {
    return parameter;
  }

  public void setParameter(@javax.annotation.Nullable String parameter) {
    this.parameter = parameter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationDefaultRuleDTO integrationDefaultRuleDTO = (IntegrationDefaultRuleDTO) o;
    return Objects.equals(this.rule, integrationDefaultRuleDTO.rule) &&
        Objects.equals(this.parameter, integrationDefaultRuleDTO.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rule, parameter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationDefaultRuleDTO {\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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
    openapiFields.add("rule");
    openapiFields.add("parameter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rule");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IntegrationDefaultRuleDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntegrationDefaultRuleDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntegrationDefaultRuleDTO is not found in the empty JSON string", IntegrationDefaultRuleDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IntegrationDefaultRuleDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntegrationDefaultRuleDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IntegrationDefaultRuleDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule").toString()));
      }
      // validate the required field `rule`
      RuleEnum.validateJsonElement(jsonObj.get("rule"));
      if ((jsonObj.get("parameter") != null && !jsonObj.get("parameter").isJsonNull()) && !jsonObj.get("parameter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntegrationDefaultRuleDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntegrationDefaultRuleDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntegrationDefaultRuleDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntegrationDefaultRuleDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<IntegrationDefaultRuleDTO>() {
           @Override
           public void write(JsonWriter out, IntegrationDefaultRuleDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntegrationDefaultRuleDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IntegrationDefaultRuleDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IntegrationDefaultRuleDTO
   * @throws IOException if the JSON string is invalid with respect to IntegrationDefaultRuleDTO
   */
  public static IntegrationDefaultRuleDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntegrationDefaultRuleDTO.class);
  }

  /**
   * Convert an instance of IntegrationDefaultRuleDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

