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
 * CreateRecordsResponseDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class CreateRecordsResponseDTO {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private List<UUID> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_ELEMENTS = "totalElements";
  @SerializedName(SERIALIZED_NAME_TOTAL_ELEMENTS)
  @javax.annotation.Nullable
  private Long totalElements;

  public CreateRecordsResponseDTO() {
  }

  public CreateRecordsResponseDTO data(@javax.annotation.Nullable List<UUID> data) {
    this.data = data;
    return this;
  }

  public CreateRecordsResponseDTO addDataItem(UUID dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  public List<UUID> getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable List<UUID> data) {
    this.data = data;
  }


  public CreateRecordsResponseDTO totalElements(@javax.annotation.Nullable Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
   */
  @javax.annotation.Nullable
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(@javax.annotation.Nullable Long totalElements) {
    this.totalElements = totalElements;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRecordsResponseDTO createRecordsResponseDTO = (CreateRecordsResponseDTO) o;
    return Objects.equals(this.data, createRecordsResponseDTO.data) &&
        Objects.equals(this.totalElements, createRecordsResponseDTO.totalElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, totalElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRecordsResponseDTO {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("totalElements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateRecordsResponseDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateRecordsResponseDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateRecordsResponseDTO is not found in the empty JSON string", CreateRecordsResponseDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateRecordsResponseDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateRecordsResponseDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull() && !jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateRecordsResponseDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateRecordsResponseDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateRecordsResponseDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateRecordsResponseDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateRecordsResponseDTO>() {
           @Override
           public void write(JsonWriter out, CreateRecordsResponseDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateRecordsResponseDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateRecordsResponseDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateRecordsResponseDTO
   * @throws IOException if the JSON string is invalid with respect to CreateRecordsResponseDTO
   */
  public static CreateRecordsResponseDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateRecordsResponseDTO.class);
  }

  /**
   * Convert an instance of CreateRecordsResponseDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

