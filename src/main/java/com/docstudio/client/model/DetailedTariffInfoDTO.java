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
 * DetailedTariffInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class DetailedTariffInfoDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  @javax.annotation.Nullable
  private Long price;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  @javax.annotation.Nullable
  private String displayName;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  @javax.annotation.Nullable
  private List<AttributeInfoDTO> attributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_COUNTERS = "counters";
  @SerializedName(SERIALIZED_NAME_COUNTERS)
  @javax.annotation.Nullable
  private List<CounterInfoDTO> counters = new ArrayList<>();

  public DetailedTariffInfoDTO() {
  }

  public DetailedTariffInfoDTO id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public DetailedTariffInfoDTO name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public DetailedTariffInfoDTO price(@javax.annotation.Nullable Long price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @javax.annotation.Nullable
  public Long getPrice() {
    return price;
  }

  public void setPrice(@javax.annotation.Nullable Long price) {
    this.price = price;
  }


  public DetailedTariffInfoDTO displayName(@javax.annotation.Nullable String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(@javax.annotation.Nullable String displayName) {
    this.displayName = displayName;
  }


  public DetailedTariffInfoDTO attributes(@javax.annotation.Nullable List<AttributeInfoDTO> attributes) {
    this.attributes = attributes;
    return this;
  }

  public DetailedTariffInfoDTO addAttributesItem(AttributeInfoDTO attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @javax.annotation.Nullable
  public List<AttributeInfoDTO> getAttributes() {
    return attributes;
  }

  public void setAttributes(@javax.annotation.Nullable List<AttributeInfoDTO> attributes) {
    this.attributes = attributes;
  }


  public DetailedTariffInfoDTO counters(@javax.annotation.Nullable List<CounterInfoDTO> counters) {
    this.counters = counters;
    return this;
  }

  public DetailedTariffInfoDTO addCountersItem(CounterInfoDTO countersItem) {
    if (this.counters == null) {
      this.counters = new ArrayList<>();
    }
    this.counters.add(countersItem);
    return this;
  }

  /**
   * Get counters
   * @return counters
   */
  @javax.annotation.Nullable
  public List<CounterInfoDTO> getCounters() {
    return counters;
  }

  public void setCounters(@javax.annotation.Nullable List<CounterInfoDTO> counters) {
    this.counters = counters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedTariffInfoDTO detailedTariffInfoDTO = (DetailedTariffInfoDTO) o;
    return Objects.equals(this.id, detailedTariffInfoDTO.id) &&
        Objects.equals(this.name, detailedTariffInfoDTO.name) &&
        Objects.equals(this.price, detailedTariffInfoDTO.price) &&
        Objects.equals(this.displayName, detailedTariffInfoDTO.displayName) &&
        Objects.equals(this.attributes, detailedTariffInfoDTO.attributes) &&
        Objects.equals(this.counters, detailedTariffInfoDTO.counters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, displayName, attributes, counters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedTariffInfoDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
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
    openapiFields.add("price");
    openapiFields.add("displayName");
    openapiFields.add("attributes");
    openapiFields.add("counters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DetailedTariffInfoDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DetailedTariffInfoDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DetailedTariffInfoDTO is not found in the empty JSON string", DetailedTariffInfoDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DetailedTariffInfoDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DetailedTariffInfoDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
        if (jsonArrayattributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
          }

          // validate the optional field `attributes` (array)
          for (int i = 0; i < jsonArrayattributes.size(); i++) {
            AttributeInfoDTO.validateJsonElement(jsonArrayattributes.get(i));
          };
        }
      }
      if (jsonObj.get("counters") != null && !jsonObj.get("counters").isJsonNull()) {
        JsonArray jsonArraycounters = jsonObj.getAsJsonArray("counters");
        if (jsonArraycounters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("counters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `counters` to be an array in the JSON string but got `%s`", jsonObj.get("counters").toString()));
          }

          // validate the optional field `counters` (array)
          for (int i = 0; i < jsonArraycounters.size(); i++) {
            CounterInfoDTO.validateJsonElement(jsonArraycounters.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DetailedTariffInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DetailedTariffInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DetailedTariffInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DetailedTariffInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DetailedTariffInfoDTO>() {
           @Override
           public void write(JsonWriter out, DetailedTariffInfoDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DetailedTariffInfoDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DetailedTariffInfoDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DetailedTariffInfoDTO
   * @throws IOException if the JSON string is invalid with respect to DetailedTariffInfoDTO
   */
  public static DetailedTariffInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DetailedTariffInfoDTO.class);
  }

  /**
   * Convert an instance of DetailedTariffInfoDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

