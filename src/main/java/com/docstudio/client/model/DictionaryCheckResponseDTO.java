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
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * DictionaryCheckResponseDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class DictionaryCheckResponseDTO {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Integer result;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_HTTP_STATUS = "httpStatus";
  @SerializedName(SERIALIZED_NAME_HTTP_STATUS)
  private DictionaryCheckResponseDTO httpStatus;

  public DictionaryCheckResponseDTO() {
  }

  public DictionaryCheckResponseDTO result(Integer result) {
    this.result = result;
    return this;
  }

  /**
   * Result code
   * @return result
   */
  @javax.annotation.Nonnull
  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }


  public DictionaryCheckResponseDTO message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Result message
   * @return message
   */
  @javax.annotation.Nonnull
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public DictionaryCheckResponseDTO httpStatus(DictionaryCheckResponseDTO httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

  /**
   * Get httpStatus
   * @return httpStatus
   */
  @javax.annotation.Nullable
  public DictionaryCheckResponseDTO getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(DictionaryCheckResponseDTO httpStatus) {
    this.httpStatus = httpStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryCheckResponseDTO dictionaryCheckResponseDTO = (DictionaryCheckResponseDTO) o;
    return Objects.equals(this.result, dictionaryCheckResponseDTO.result) &&
        Objects.equals(this.message, dictionaryCheckResponseDTO.message) &&
        Objects.equals(this.httpStatus, dictionaryCheckResponseDTO.httpStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, message, httpStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryCheckResponseDTO {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
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
    openapiFields.add("result");
    openapiFields.add("message");
    openapiFields.add("httpStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("result");
    openapiRequiredFields.add("message");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DictionaryCheckResponseDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DictionaryCheckResponseDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DictionaryCheckResponseDTO is not found in the empty JSON string", DictionaryCheckResponseDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DictionaryCheckResponseDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DictionaryCheckResponseDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DictionaryCheckResponseDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the optional field `httpStatus`
      if (jsonObj.get("httpStatus") != null && !jsonObj.get("httpStatus").isJsonNull()) {
        DictionaryCheckResponseDTO.validateJsonElement(jsonObj.get("httpStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DictionaryCheckResponseDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DictionaryCheckResponseDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DictionaryCheckResponseDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DictionaryCheckResponseDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DictionaryCheckResponseDTO>() {
           @Override
           public void write(JsonWriter out, DictionaryCheckResponseDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DictionaryCheckResponseDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DictionaryCheckResponseDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DictionaryCheckResponseDTO
   * @throws IOException if the JSON string is invalid with respect to DictionaryCheckResponseDTO
   */
  public static DictionaryCheckResponseDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DictionaryCheckResponseDTO.class);
  }

  /**
   * Convert an instance of DictionaryCheckResponseDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

