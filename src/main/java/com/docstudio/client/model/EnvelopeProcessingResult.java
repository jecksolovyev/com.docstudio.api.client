/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R121.14
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
 * Processing details
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:19:30.369078200+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class EnvelopeProcessingResult {
  public static final String SERIALIZED_NAME_ENVELOPE_UUID = "envelopeUuid";
  @SerializedName(SERIALIZED_NAME_ENVELOPE_UUID)
  @javax.annotation.Nullable
  private UUID envelopeUuid;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  @javax.annotation.Nullable
  private Boolean result;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  @javax.annotation.Nullable
  private String errorMessage;

  public EnvelopeProcessingResult() {
  }

  public EnvelopeProcessingResult envelopeUuid(@javax.annotation.Nullable UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
    return this;
  }

  /**
   * Envelope uuid
   * @return envelopeUuid
   */
  @javax.annotation.Nullable
  public UUID getEnvelopeUuid() {
    return envelopeUuid;
  }

  public void setEnvelopeUuid(@javax.annotation.Nullable UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
  }


  public EnvelopeProcessingResult result(@javax.annotation.Nullable Boolean result) {
    this.result = result;
    return this;
  }

  /**
   * Processing result
   * @return result
   */
  @javax.annotation.Nullable
  public Boolean getResult() {
    return result;
  }

  public void setResult(@javax.annotation.Nullable Boolean result) {
    this.result = result;
  }


  public EnvelopeProcessingResult errorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Processing error message
   * @return errorMessage
   */
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = errorMessage;
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
   * @return the EnvelopeProcessingResult instance itself
   */
  public EnvelopeProcessingResult putAdditionalProperty(String key, Object value) {
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
    EnvelopeProcessingResult envelopeProcessingResult = (EnvelopeProcessingResult) o;
    return Objects.equals(this.envelopeUuid, envelopeProcessingResult.envelopeUuid) &&
        Objects.equals(this.result, envelopeProcessingResult.result) &&
        Objects.equals(this.errorMessage, envelopeProcessingResult.errorMessage)&&
        Objects.equals(this.additionalProperties, envelopeProcessingResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeUuid, result, errorMessage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeProcessingResult {\n");
    sb.append("    envelopeUuid: ").append(toIndentedString(envelopeUuid)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
    openapiFields.add("envelopeUuid");
    openapiFields.add("result");
    openapiFields.add("errorMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopeProcessingResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopeProcessingResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopeProcessingResult is not found in the empty JSON string", EnvelopeProcessingResult.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("envelopeUuid") != null && !jsonObj.get("envelopeUuid").isJsonNull()) && !jsonObj.get("envelopeUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `envelopeUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("envelopeUuid").toString()));
      }
      if ((jsonObj.get("errorMessage") != null && !jsonObj.get("errorMessage").isJsonNull()) && !jsonObj.get("errorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopeProcessingResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopeProcessingResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopeProcessingResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopeProcessingResult.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopeProcessingResult>() {
           @Override
           public void write(JsonWriter out, EnvelopeProcessingResult value) throws IOException {
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
           public EnvelopeProcessingResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             EnvelopeProcessingResult instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of EnvelopeProcessingResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopeProcessingResult
   * @throws IOException if the JSON string is invalid with respect to EnvelopeProcessingResult
   */
  public static EnvelopeProcessingResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopeProcessingResult.class);
  }

  /**
   * Convert an instance of EnvelopeProcessingResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

