/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R110.5
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import com.docstudio.client.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * Scenario step destination template info
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class ScenarioStepTemplateInfoDTO {
  public static final String SERIALIZED_NAME_TEMPLATE_UUID = "templateUuid";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_UUID)
  private UUID templateUuid;

  public static final String SERIALIZED_NAME_TEMPLATE_VERSION_UUID = "templateVersionUuid";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_VERSION_UUID)
  private UUID templateVersionUuid;

  public ScenarioStepTemplateInfoDTO() {
  }

  public ScenarioStepTemplateInfoDTO templateUuid(UUID templateUuid) {
    this.templateUuid = templateUuid;
    return this;
  }

  /**
   * Scenario step template uuid
   * @return templateUuid
   */
  @javax.annotation.Nonnull
  public UUID getTemplateUuid() {
    return templateUuid;
  }

  public void setTemplateUuid(UUID templateUuid) {
    this.templateUuid = templateUuid;
  }


  public ScenarioStepTemplateInfoDTO templateVersionUuid(UUID templateVersionUuid) {
    this.templateVersionUuid = templateVersionUuid;
    return this;
  }

  /**
   * Scenario step template version
   * @return templateVersionUuid
   */
  @javax.annotation.Nonnull
  public UUID getTemplateVersionUuid() {
    return templateVersionUuid;
  }

  public void setTemplateVersionUuid(UUID templateVersionUuid) {
    this.templateVersionUuid = templateVersionUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScenarioStepTemplateInfoDTO scenarioStepTemplateInfoDTO = (ScenarioStepTemplateInfoDTO) o;
    return Objects.equals(this.templateUuid, scenarioStepTemplateInfoDTO.templateUuid) &&
        Objects.equals(this.templateVersionUuid, scenarioStepTemplateInfoDTO.templateVersionUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateUuid, templateVersionUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioStepTemplateInfoDTO {\n");
    sb.append("    templateUuid: ").append(toIndentedString(templateUuid)).append("\n");
    sb.append("    templateVersionUuid: ").append(toIndentedString(templateVersionUuid)).append("\n");
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
    openapiFields.add("templateUuid");
    openapiFields.add("templateVersionUuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("templateUuid");
    openapiRequiredFields.add("templateVersionUuid");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ScenarioStepTemplateInfoDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ScenarioStepTemplateInfoDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScenarioStepTemplateInfoDTO is not found in the empty JSON string", ScenarioStepTemplateInfoDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ScenarioStepTemplateInfoDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScenarioStepTemplateInfoDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ScenarioStepTemplateInfoDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("templateUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateUuid").toString()));
      }
      if (!jsonObj.get("templateVersionUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateVersionUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateVersionUuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScenarioStepTemplateInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScenarioStepTemplateInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScenarioStepTemplateInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScenarioStepTemplateInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ScenarioStepTemplateInfoDTO>() {
           @Override
           public void write(JsonWriter out, ScenarioStepTemplateInfoDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScenarioStepTemplateInfoDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ScenarioStepTemplateInfoDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ScenarioStepTemplateInfoDTO
   * @throws IOException if the JSON string is invalid with respect to ScenarioStepTemplateInfoDTO
   */
  public static ScenarioStepTemplateInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScenarioStepTemplateInfoDTO.class);
  }

  /**
   * Convert an instance of ScenarioStepTemplateInfoDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

