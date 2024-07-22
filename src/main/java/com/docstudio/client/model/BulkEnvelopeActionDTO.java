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
 * BulkEnvelopeActionDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class BulkEnvelopeActionDTO {
  public static final String SERIALIZED_NAME_UUIDS = "uuids";
  @SerializedName(SERIALIZED_NAME_UUIDS)
  private Set<UUID> uuids = new LinkedHashSet<>();

  public BulkEnvelopeActionDTO() {
  }

  public BulkEnvelopeActionDTO uuids(Set<UUID> uuids) {
    this.uuids = uuids;
    return this;
  }

  public BulkEnvelopeActionDTO addUuidsItem(UUID uuidsItem) {
    if (this.uuids == null) {
      this.uuids = new LinkedHashSet<>();
    }
    this.uuids.add(uuidsItem);
    return this;
  }

  /**
   * Get uuids
   * @return uuids
   */
  @javax.annotation.Nonnull
  public Set<UUID> getUuids() {
    return uuids;
  }

  public void setUuids(Set<UUID> uuids) {
    this.uuids = uuids;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkEnvelopeActionDTO bulkEnvelopeActionDTO = (BulkEnvelopeActionDTO) o;
    return Objects.equals(this.uuids, bulkEnvelopeActionDTO.uuids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkEnvelopeActionDTO {\n");
    sb.append("    uuids: ").append(toIndentedString(uuids)).append("\n");
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
    openapiFields.add("uuids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuids");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BulkEnvelopeActionDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BulkEnvelopeActionDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkEnvelopeActionDTO is not found in the empty JSON string", BulkEnvelopeActionDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BulkEnvelopeActionDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BulkEnvelopeActionDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BulkEnvelopeActionDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("uuids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("uuids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuids` to be an array in the JSON string but got `%s`", jsonObj.get("uuids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkEnvelopeActionDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkEnvelopeActionDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkEnvelopeActionDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkEnvelopeActionDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkEnvelopeActionDTO>() {
           @Override
           public void write(JsonWriter out, BulkEnvelopeActionDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BulkEnvelopeActionDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BulkEnvelopeActionDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BulkEnvelopeActionDTO
   * @throws IOException if the JSON string is invalid with respect to BulkEnvelopeActionDTO
   */
  public static BulkEnvelopeActionDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkEnvelopeActionDTO.class);
  }

  /**
   * Convert an instance of BulkEnvelopeActionDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

