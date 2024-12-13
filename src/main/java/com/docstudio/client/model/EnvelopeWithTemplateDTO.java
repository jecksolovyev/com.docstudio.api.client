/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R120.9
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
 * EnvelopeWithTemplateDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class EnvelopeWithTemplateDTO {
  public static final String SERIALIZED_NAME_ENVELOPE = "envelope";
  @SerializedName(SERIALIZED_NAME_ENVELOPE)
  @javax.annotation.Nullable
  private EnvGetDTO envelope;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  @javax.annotation.Nullable
  private FullTemplateResponseDTO template;

  public static final String SERIALIZED_NAME_SCENARIO = "scenario";
  @SerializedName(SERIALIZED_NAME_SCENARIO)
  @javax.annotation.Nullable
  private EnvelopeScenarioDTO scenario;

  public EnvelopeWithTemplateDTO() {
  }

  public EnvelopeWithTemplateDTO envelope(@javax.annotation.Nullable EnvGetDTO envelope) {
    this.envelope = envelope;
    return this;
  }

  /**
   * Get envelope
   * @return envelope
   */
  @javax.annotation.Nullable
  public EnvGetDTO getEnvelope() {
    return envelope;
  }

  public void setEnvelope(@javax.annotation.Nullable EnvGetDTO envelope) {
    this.envelope = envelope;
  }


  public EnvelopeWithTemplateDTO template(@javax.annotation.Nullable FullTemplateResponseDTO template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
   */
  @javax.annotation.Nullable
  public FullTemplateResponseDTO getTemplate() {
    return template;
  }

  public void setTemplate(@javax.annotation.Nullable FullTemplateResponseDTO template) {
    this.template = template;
  }


  public EnvelopeWithTemplateDTO scenario(@javax.annotation.Nullable EnvelopeScenarioDTO scenario) {
    this.scenario = scenario;
    return this;
  }

  /**
   * Get scenario
   * @return scenario
   */
  @javax.annotation.Nullable
  public EnvelopeScenarioDTO getScenario() {
    return scenario;
  }

  public void setScenario(@javax.annotation.Nullable EnvelopeScenarioDTO scenario) {
    this.scenario = scenario;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeWithTemplateDTO envelopeWithTemplateDTO = (EnvelopeWithTemplateDTO) o;
    return Objects.equals(this.envelope, envelopeWithTemplateDTO.envelope) &&
        Objects.equals(this.template, envelopeWithTemplateDTO.template) &&
        Objects.equals(this.scenario, envelopeWithTemplateDTO.scenario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelope, template, scenario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeWithTemplateDTO {\n");
    sb.append("    envelope: ").append(toIndentedString(envelope)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
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
    openapiFields.add("envelope");
    openapiFields.add("template");
    openapiFields.add("scenario");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopeWithTemplateDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopeWithTemplateDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopeWithTemplateDTO is not found in the empty JSON string", EnvelopeWithTemplateDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvelopeWithTemplateDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvelopeWithTemplateDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `envelope`
      if (jsonObj.get("envelope") != null && !jsonObj.get("envelope").isJsonNull()) {
        EnvGetDTO.validateJsonElement(jsonObj.get("envelope"));
      }
      // validate the optional field `template`
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) {
        FullTemplateResponseDTO.validateJsonElement(jsonObj.get("template"));
      }
      // validate the optional field `scenario`
      if (jsonObj.get("scenario") != null && !jsonObj.get("scenario").isJsonNull()) {
        EnvelopeScenarioDTO.validateJsonElement(jsonObj.get("scenario"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopeWithTemplateDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopeWithTemplateDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopeWithTemplateDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopeWithTemplateDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopeWithTemplateDTO>() {
           @Override
           public void write(JsonWriter out, EnvelopeWithTemplateDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvelopeWithTemplateDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnvelopeWithTemplateDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopeWithTemplateDTO
   * @throws IOException if the JSON string is invalid with respect to EnvelopeWithTemplateDTO
   */
  public static EnvelopeWithTemplateDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopeWithTemplateDTO.class);
  }

  /**
   * Convert an instance of EnvelopeWithTemplateDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

