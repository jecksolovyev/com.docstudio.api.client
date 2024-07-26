/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R110.5
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
 * PageDTOEnvelopeToMailboxDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class PageDTOEnvelopeToMailboxDTO {
  public static final String SERIALIZED_NAME_TOTAL_ELEMENTS = "totalElements";
  @SerializedName(SERIALIZED_NAME_TOTAL_ELEMENTS)
  private Long totalElements;

  public static final String SERIALIZED_NAME_SIZE_REQUESTED = "sizeRequested";
  @SerializedName(SERIALIZED_NAME_SIZE_REQUESTED)
  private Long sizeRequested;

  public static final String SERIALIZED_NAME_NUMBER_OF_ELEMENTS = "numberOfElements";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_ELEMENTS)
  private Long numberOfElements;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<EnvelopeToMailboxDTO> data = new ArrayList<>();

  public PageDTOEnvelopeToMailboxDTO() {
  }

  public PageDTOEnvelopeToMailboxDTO totalElements(Long totalElements) {
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

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }


  public PageDTOEnvelopeToMailboxDTO sizeRequested(Long sizeRequested) {
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

  public void setSizeRequested(Long sizeRequested) {
    this.sizeRequested = sizeRequested;
  }


  public PageDTOEnvelopeToMailboxDTO numberOfElements(Long numberOfElements) {
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

  public void setNumberOfElements(Long numberOfElements) {
    this.numberOfElements = numberOfElements;
  }


  public PageDTOEnvelopeToMailboxDTO data(List<EnvelopeToMailboxDTO> data) {
    this.data = data;
    return this;
  }

  public PageDTOEnvelopeToMailboxDTO addDataItem(EnvelopeToMailboxDTO dataItem) {
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
  public List<EnvelopeToMailboxDTO> getData() {
    return data;
  }

  public void setData(List<EnvelopeToMailboxDTO> data) {
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
    PageDTOEnvelopeToMailboxDTO pageDTOEnvelopeToMailboxDTO = (PageDTOEnvelopeToMailboxDTO) o;
    return Objects.equals(this.totalElements, pageDTOEnvelopeToMailboxDTO.totalElements) &&
        Objects.equals(this.sizeRequested, pageDTOEnvelopeToMailboxDTO.sizeRequested) &&
        Objects.equals(this.numberOfElements, pageDTOEnvelopeToMailboxDTO.numberOfElements) &&
        Objects.equals(this.data, pageDTOEnvelopeToMailboxDTO.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalElements, sizeRequested, numberOfElements, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageDTOEnvelopeToMailboxDTO {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to PageDTOEnvelopeToMailboxDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PageDTOEnvelopeToMailboxDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageDTOEnvelopeToMailboxDTO is not found in the empty JSON string", PageDTOEnvelopeToMailboxDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PageDTOEnvelopeToMailboxDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageDTOEnvelopeToMailboxDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            EnvelopeToMailboxDTO.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageDTOEnvelopeToMailboxDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageDTOEnvelopeToMailboxDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageDTOEnvelopeToMailboxDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageDTOEnvelopeToMailboxDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<PageDTOEnvelopeToMailboxDTO>() {
           @Override
           public void write(JsonWriter out, PageDTOEnvelopeToMailboxDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageDTOEnvelopeToMailboxDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PageDTOEnvelopeToMailboxDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PageDTOEnvelopeToMailboxDTO
   * @throws IOException if the JSON string is invalid with respect to PageDTOEnvelopeToMailboxDTO
   */
  public static PageDTOEnvelopeToMailboxDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageDTOEnvelopeToMailboxDTO.class);
  }

  /**
   * Convert an instance of PageDTOEnvelopeToMailboxDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

