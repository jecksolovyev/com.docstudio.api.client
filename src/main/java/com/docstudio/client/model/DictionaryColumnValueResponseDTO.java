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
 * Data records
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class DictionaryColumnValueResponseDTO {
  public static final String SERIALIZED_NAME_RECORD_UUID = "recordUuid";
  @SerializedName(SERIALIZED_NAME_RECORD_UUID)
  @javax.annotation.Nonnull
  private UUID recordUuid;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nonnull
  private String data;

  public DictionaryColumnValueResponseDTO() {
  }

  public DictionaryColumnValueResponseDTO recordUuid(@javax.annotation.Nonnull UUID recordUuid) {
    this.recordUuid = recordUuid;
    return this;
  }

  /**
   * Dictionary record uuid
   * @return recordUuid
   */
  @javax.annotation.Nonnull
  public UUID getRecordUuid() {
    return recordUuid;
  }

  public void setRecordUuid(@javax.annotation.Nonnull UUID recordUuid) {
    this.recordUuid = recordUuid;
  }


  public DictionaryColumnValueResponseDTO data(@javax.annotation.Nonnull String data) {
    this.data = data;
    return this;
  }

  /**
   * Dictionary column value data
   * @return data
   */
  @javax.annotation.Nonnull
  public String getData() {
    return data;
  }

  public void setData(@javax.annotation.Nonnull String data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryColumnValueResponseDTO dictionaryColumnValueResponseDTO = (DictionaryColumnValueResponseDTO) o;
    return Objects.equals(this.recordUuid, dictionaryColumnValueResponseDTO.recordUuid) &&
        Objects.equals(this.data, dictionaryColumnValueResponseDTO.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordUuid, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryColumnValueResponseDTO {\n");
    sb.append("    recordUuid: ").append(toIndentedString(recordUuid)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("recordUuid");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("recordUuid");
    openapiRequiredFields.add("data");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DictionaryColumnValueResponseDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DictionaryColumnValueResponseDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DictionaryColumnValueResponseDTO is not found in the empty JSON string", DictionaryColumnValueResponseDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DictionaryColumnValueResponseDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DictionaryColumnValueResponseDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DictionaryColumnValueResponseDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("recordUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recordUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recordUuid").toString()));
      }
      if (!jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DictionaryColumnValueResponseDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DictionaryColumnValueResponseDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DictionaryColumnValueResponseDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DictionaryColumnValueResponseDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DictionaryColumnValueResponseDTO>() {
           @Override
           public void write(JsonWriter out, DictionaryColumnValueResponseDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DictionaryColumnValueResponseDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DictionaryColumnValueResponseDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DictionaryColumnValueResponseDTO
   * @throws IOException if the JSON string is invalid with respect to DictionaryColumnValueResponseDTO
   */
  public static DictionaryColumnValueResponseDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DictionaryColumnValueResponseDTO.class);
  }

  /**
   * Convert an instance of DictionaryColumnValueResponseDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

