/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R135.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import java.util.Objects;
import com.docstudio.client.model.EnvGetDTO;
import com.docstudio.client.model.EnvelopeScenarioDTO;
import com.docstudio.client.model.FullTemplateResponseDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.docstudio.client.JSON;

/**
 * EnvelopeWithTemplateDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-23T12:49:56.203839-06:00[America/Edmonton]", comments = "Generator version: 7.14.0")
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
   * Envelope
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
   * Template
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
   * Scenario
   * @return scenario
   */
  @javax.annotation.Nullable
  public EnvelopeScenarioDTO getScenario() {
    return scenario;
  }

  public void setScenario(@javax.annotation.Nullable EnvelopeScenarioDTO scenario) {
    this.scenario = scenario;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the EnvelopeWithTemplateDTO instance itself
   */
  public EnvelopeWithTemplateDTO putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
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
        Objects.equals(this.scenario, envelopeWithTemplateDTO.scenario)&&
        Objects.equals(this.additionalProperties, envelopeWithTemplateDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelope, template, scenario, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeWithTemplateDTO {\n");
    sb.append("    envelope: ").append(toIndentedString(envelope)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("envelope", "template", "scenario"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
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
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvelopeWithTemplateDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             EnvelopeWithTemplateDTO instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
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

