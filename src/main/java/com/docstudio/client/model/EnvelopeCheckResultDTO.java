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
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * Envelope callback check result
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class EnvelopeCheckResultDTO {
  public static final String SERIALIZED_NAME_PASSED = "passed";
  @SerializedName(SERIALIZED_NAME_PASSED)
  @javax.annotation.Nullable
  private Boolean passed;

  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  @javax.annotation.Nullable
  private FailedEnvelopeCallbackFilterDTO failed;

  public EnvelopeCheckResultDTO() {
  }

  public EnvelopeCheckResultDTO passed(@javax.annotation.Nullable Boolean passed) {
    this.passed = passed;
    return this;
  }

  /**
   * Check passed
   * @return passed
   */
  @javax.annotation.Nullable
  public Boolean getPassed() {
    return passed;
  }

  public void setPassed(@javax.annotation.Nullable Boolean passed) {
    this.passed = passed;
  }


  public EnvelopeCheckResultDTO failed(@javax.annotation.Nullable FailedEnvelopeCallbackFilterDTO failed) {
    this.failed = failed;
    return this;
  }

  /**
   * Get failed
   * @return failed
   */
  @javax.annotation.Nullable
  public FailedEnvelopeCallbackFilterDTO getFailed() {
    return failed;
  }

  public void setFailed(@javax.annotation.Nullable FailedEnvelopeCallbackFilterDTO failed) {
    this.failed = failed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeCheckResultDTO envelopeCheckResultDTO = (EnvelopeCheckResultDTO) o;
    return Objects.equals(this.passed, envelopeCheckResultDTO.passed) &&
        Objects.equals(this.failed, envelopeCheckResultDTO.failed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passed, failed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeCheckResultDTO {\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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
    openapiFields.add("passed");
    openapiFields.add("failed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopeCheckResultDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopeCheckResultDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopeCheckResultDTO is not found in the empty JSON string", EnvelopeCheckResultDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvelopeCheckResultDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvelopeCheckResultDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `failed`
      if (jsonObj.get("failed") != null && !jsonObj.get("failed").isJsonNull()) {
        FailedEnvelopeCallbackFilterDTO.validateJsonElement(jsonObj.get("failed"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopeCheckResultDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopeCheckResultDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopeCheckResultDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopeCheckResultDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopeCheckResultDTO>() {
           @Override
           public void write(JsonWriter out, EnvelopeCheckResultDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvelopeCheckResultDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnvelopeCheckResultDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopeCheckResultDTO
   * @throws IOException if the JSON string is invalid with respect to EnvelopeCheckResultDTO
   */
  public static EnvelopeCheckResultDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopeCheckResultDTO.class);
  }

  /**
   * Convert an instance of EnvelopeCheckResultDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

