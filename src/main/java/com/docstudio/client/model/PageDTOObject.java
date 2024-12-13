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
 * PageDTOObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class PageDTOObject {
  public static final String SERIALIZED_NAME_TOTAL_ELEMENTS = "totalElements";
  @SerializedName(SERIALIZED_NAME_TOTAL_ELEMENTS)
  @javax.annotation.Nullable
  private Long totalElements;

  public static final String SERIALIZED_NAME_SIZE_REQUESTED = "sizeRequested";
  @SerializedName(SERIALIZED_NAME_SIZE_REQUESTED)
  @javax.annotation.Nullable
  private Long sizeRequested;

  public static final String SERIALIZED_NAME_NUMBER_OF_ELEMENTS = "numberOfElements";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_ELEMENTS)
  @javax.annotation.Nullable
  private Long numberOfElements;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private List<Object> data = new ArrayList<>();

  public PageDTOObject() {
  }

  public PageDTOObject totalElements(@javax.annotation.Nullable Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Total elements by request
   * @return totalElements
   */
  @javax.annotation.Nullable
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(@javax.annotation.Nullable Long totalElements) {
    this.totalElements = totalElements;
  }


  public PageDTOObject sizeRequested(@javax.annotation.Nullable Long sizeRequested) {
    this.sizeRequested = sizeRequested;
    return this;
  }

  /**
   * Requested size
   * @return sizeRequested
   */
  @javax.annotation.Nullable
  public Long getSizeRequested() {
    return sizeRequested;
  }

  public void setSizeRequested(@javax.annotation.Nullable Long sizeRequested) {
    this.sizeRequested = sizeRequested;
  }


  public PageDTOObject numberOfElements(@javax.annotation.Nullable Long numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

  /**
   * Fetched records count
   * @return numberOfElements
   */
  @javax.annotation.Nullable
  public Long getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(@javax.annotation.Nullable Long numberOfElements) {
    this.numberOfElements = numberOfElements;
  }


  public PageDTOObject data(@javax.annotation.Nullable List<Object> data) {
    this.data = data;
    return this;
  }

  public PageDTOObject addDataItem(Object dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Data records
   * @return data
   */
  @javax.annotation.Nullable
  public List<Object> getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable List<Object> data) {
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
    PageDTOObject pageDTOObject = (PageDTOObject) o;
    return Objects.equals(this.totalElements, pageDTOObject.totalElements) &&
        Objects.equals(this.sizeRequested, pageDTOObject.sizeRequested) &&
        Objects.equals(this.numberOfElements, pageDTOObject.numberOfElements) &&
        Objects.equals(this.data, pageDTOObject.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalElements, sizeRequested, numberOfElements, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageDTOObject {\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    sizeRequested: ").append(toIndentedString(sizeRequested)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
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
    openapiFields.add("totalElements");
    openapiFields.add("sizeRequested");
    openapiFields.add("numberOfElements");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PageDTOObject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PageDTOObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageDTOObject is not found in the empty JSON string", PageDTOObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PageDTOObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageDTOObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!PageDTOObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageDTOObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageDTOObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageDTOObject.class));

       return (TypeAdapter<T>) new TypeAdapter<PageDTOObject>() {
           @Override
           public void write(JsonWriter out, PageDTOObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageDTOObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PageDTOObject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PageDTOObject
   * @throws IOException if the JSON string is invalid with respect to PageDTOObject
   */
  public static PageDTOObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageDTOObject.class);
  }

  /**
   * Convert an instance of PageDTOObject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

