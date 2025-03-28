/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R127.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import java.util.Objects;
import com.docstudio.client.model.ScenarioStepTemplateInfoDTO;
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
 * Scenario steps
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-28T13:30:43.659068-06:00[America/Edmonton]", comments = "Generator version: 7.12.0")
public class ScenarioStepDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  @javax.annotation.Nullable
  private ScenarioStepTemplateInfoDTO source;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  @javax.annotation.Nonnull
  private ScenarioStepTemplateInfoDTO destination;

  public static final String SERIALIZED_NAME_XSLT = "xslt";
  @SerializedName(SERIALIZED_NAME_XSLT)
  @javax.annotation.Nonnull
  private String xslt;

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  @javax.annotation.Nullable
  private String condition;

  public static final String SERIALIZED_NAME_SEND_AFTER_CREATION = "sendAfterCreation";
  @SerializedName(SERIALIZED_NAME_SEND_AFTER_CREATION)
  @javax.annotation.Nullable
  private Boolean sendAfterCreation;

  public ScenarioStepDTO() {
  }

  public ScenarioStepDTO id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Scenario step id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public ScenarioStepDTO name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Scenario step name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public ScenarioStepDTO source(@javax.annotation.Nullable ScenarioStepTemplateInfoDTO source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @javax.annotation.Nullable
  public ScenarioStepTemplateInfoDTO getSource() {
    return source;
  }

  public void setSource(@javax.annotation.Nullable ScenarioStepTemplateInfoDTO source) {
    this.source = source;
  }


  public ScenarioStepDTO destination(@javax.annotation.Nonnull ScenarioStepTemplateInfoDTO destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
   */
  @javax.annotation.Nonnull
  public ScenarioStepTemplateInfoDTO getDestination() {
    return destination;
  }

  public void setDestination(@javax.annotation.Nonnull ScenarioStepTemplateInfoDTO destination) {
    this.destination = destination;
  }


  public ScenarioStepDTO xslt(@javax.annotation.Nonnull String xslt) {
    this.xslt = xslt;
    return this;
  }

  /**
   * Scenario step XSLT map
   * @return xslt
   */
  @javax.annotation.Nonnull
  public String getXslt() {
    return xslt;
  }

  public void setXslt(@javax.annotation.Nonnull String xslt) {
    this.xslt = xslt;
  }


  public ScenarioStepDTO condition(@javax.annotation.Nullable String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Scenario condition XSLT map
   * @return condition
   */
  @javax.annotation.Nullable
  public String getCondition() {
    return condition;
  }

  public void setCondition(@javax.annotation.Nullable String condition) {
    this.condition = condition;
  }


  public ScenarioStepDTO sendAfterCreation(@javax.annotation.Nullable Boolean sendAfterCreation) {
    this.sendAfterCreation = sendAfterCreation;
    return this;
  }

  /**
   * Send envelope right after creation
   * @return sendAfterCreation
   */
  @javax.annotation.Nullable
  public Boolean getSendAfterCreation() {
    return sendAfterCreation;
  }

  public void setSendAfterCreation(@javax.annotation.Nullable Boolean sendAfterCreation) {
    this.sendAfterCreation = sendAfterCreation;
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
   * @return the ScenarioStepDTO instance itself
   */
  public ScenarioStepDTO putAdditionalProperty(String key, Object value) {
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
    ScenarioStepDTO scenarioStepDTO = (ScenarioStepDTO) o;
    return Objects.equals(this.id, scenarioStepDTO.id) &&
        Objects.equals(this.name, scenarioStepDTO.name) &&
        Objects.equals(this.source, scenarioStepDTO.source) &&
        Objects.equals(this.destination, scenarioStepDTO.destination) &&
        Objects.equals(this.xslt, scenarioStepDTO.xslt) &&
        Objects.equals(this.condition, scenarioStepDTO.condition) &&
        Objects.equals(this.sendAfterCreation, scenarioStepDTO.sendAfterCreation)&&
        Objects.equals(this.additionalProperties, scenarioStepDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, source, destination, xslt, condition, sendAfterCreation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioStepDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    xslt: ").append(toIndentedString(xslt)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    sendAfterCreation: ").append(toIndentedString(sendAfterCreation)).append("\n");
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
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("source");
    openapiFields.add("destination");
    openapiFields.add("xslt");
    openapiFields.add("condition");
    openapiFields.add("sendAfterCreation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("destination");
    openapiRequiredFields.add("xslt");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ScenarioStepDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ScenarioStepDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScenarioStepDTO is not found in the empty JSON string", ScenarioStepDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ScenarioStepDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `source`
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) {
        ScenarioStepTemplateInfoDTO.validateJsonElement(jsonObj.get("source"));
      }
      // validate the required field `destination`
      ScenarioStepTemplateInfoDTO.validateJsonElement(jsonObj.get("destination"));
      if (!jsonObj.get("xslt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xslt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xslt").toString()));
      }
      if ((jsonObj.get("condition") != null && !jsonObj.get("condition").isJsonNull()) && !jsonObj.get("condition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `condition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("condition").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScenarioStepDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScenarioStepDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScenarioStepDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScenarioStepDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ScenarioStepDTO>() {
           @Override
           public void write(JsonWriter out, ScenarioStepDTO value) throws IOException {
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
           public ScenarioStepDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ScenarioStepDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of ScenarioStepDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ScenarioStepDTO
   * @throws IOException if the JSON string is invalid with respect to ScenarioStepDTO
   */
  public static ScenarioStepDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScenarioStepDTO.class);
  }

  /**
   * Convert an instance of ScenarioStepDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

