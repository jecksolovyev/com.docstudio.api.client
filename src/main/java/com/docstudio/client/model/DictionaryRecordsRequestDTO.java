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
 * DictionaryRecordsRequestDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class DictionaryRecordsRequestDTO {
  public static final String SERIALIZED_NAME_COLUMN_UUID = "columnUuid";
  @SerializedName(SERIALIZED_NAME_COLUMN_UUID)
  @javax.annotation.Nonnull
  private UUID columnUuid;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  @javax.annotation.Nullable
  private Set<String> values = new LinkedHashSet<>();

  public DictionaryRecordsRequestDTO() {
  }

  public DictionaryRecordsRequestDTO columnUuid(@javax.annotation.Nonnull UUID columnUuid) {
    this.columnUuid = columnUuid;
    return this;
  }

  /**
   * Column UUID
   * @return columnUuid
   */
  @javax.annotation.Nonnull
  public UUID getColumnUuid() {
    return columnUuid;
  }

  public void setColumnUuid(@javax.annotation.Nonnull UUID columnUuid) {
    this.columnUuid = columnUuid;
  }


  public DictionaryRecordsRequestDTO values(@javax.annotation.Nullable Set<String> values) {
    this.values = values;
    return this;
  }

  public DictionaryRecordsRequestDTO addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new LinkedHashSet<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   */
  @javax.annotation.Nullable
  public Set<String> getValues() {
    return values;
  }

  public void setValues(@javax.annotation.Nullable Set<String> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryRecordsRequestDTO dictionaryRecordsRequestDTO = (DictionaryRecordsRequestDTO) o;
    return Objects.equals(this.columnUuid, dictionaryRecordsRequestDTO.columnUuid) &&
        Objects.equals(this.values, dictionaryRecordsRequestDTO.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnUuid, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryRecordsRequestDTO {\n");
    sb.append("    columnUuid: ").append(toIndentedString(columnUuid)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("columnUuid");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("columnUuid");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DictionaryRecordsRequestDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DictionaryRecordsRequestDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DictionaryRecordsRequestDTO is not found in the empty JSON string", DictionaryRecordsRequestDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DictionaryRecordsRequestDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DictionaryRecordsRequestDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DictionaryRecordsRequestDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("columnUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `columnUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("columnUuid").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull() && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DictionaryRecordsRequestDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DictionaryRecordsRequestDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DictionaryRecordsRequestDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DictionaryRecordsRequestDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DictionaryRecordsRequestDTO>() {
           @Override
           public void write(JsonWriter out, DictionaryRecordsRequestDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DictionaryRecordsRequestDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DictionaryRecordsRequestDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DictionaryRecordsRequestDTO
   * @throws IOException if the JSON string is invalid with respect to DictionaryRecordsRequestDTO
   */
  public static DictionaryRecordsRequestDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DictionaryRecordsRequestDTO.class);
  }

  /**
   * Convert an instance of DictionaryRecordsRequestDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

