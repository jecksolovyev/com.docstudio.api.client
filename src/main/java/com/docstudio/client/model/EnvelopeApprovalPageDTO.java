/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R120.9
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
 * EnvelopeApprovalPageDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class EnvelopeApprovalPageDTO {
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
  private List<EnvApprovalSearchResultDTO> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_INITIATORS = "initiators";
  @SerializedName(SERIALIZED_NAME_INITIATORS)
  @javax.annotation.Nullable
  private Set<EnvelopeSenderDTO> initiators = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_TEMPLATES = "templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  @javax.annotation.Nullable
  private Set<EnvelopeTemplateInfoDTO> templates = new LinkedHashSet<>();

  public EnvelopeApprovalPageDTO() {
  }

  public EnvelopeApprovalPageDTO totalElements(@javax.annotation.Nullable Long totalElements) {
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


  public EnvelopeApprovalPageDTO sizeRequested(@javax.annotation.Nullable Long sizeRequested) {
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


  public EnvelopeApprovalPageDTO numberOfElements(@javax.annotation.Nullable Long numberOfElements) {
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


  public EnvelopeApprovalPageDTO data(@javax.annotation.Nullable List<EnvApprovalSearchResultDTO> data) {
    this.data = data;
    return this;
  }

  public EnvelopeApprovalPageDTO addDataItem(EnvApprovalSearchResultDTO dataItem) {
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
  public List<EnvApprovalSearchResultDTO> getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable List<EnvApprovalSearchResultDTO> data) {
    this.data = data;
  }


  public EnvelopeApprovalPageDTO initiators(@javax.annotation.Nullable Set<EnvelopeSenderDTO> initiators) {
    this.initiators = initiators;
    return this;
  }

  public EnvelopeApprovalPageDTO addInitiatorsItem(EnvelopeSenderDTO initiatorsItem) {
    if (this.initiators == null) {
      this.initiators = new LinkedHashSet<>();
    }
    this.initiators.add(initiatorsItem);
    return this;
  }

  /**
   * Approval initiators
   * @return initiators
   */
  @javax.annotation.Nullable
  public Set<EnvelopeSenderDTO> getInitiators() {
    return initiators;
  }

  public void setInitiators(@javax.annotation.Nullable Set<EnvelopeSenderDTO> initiators) {
    this.initiators = initiators;
  }


  public EnvelopeApprovalPageDTO templates(@javax.annotation.Nullable Set<EnvelopeTemplateInfoDTO> templates) {
    this.templates = templates;
    return this;
  }

  public EnvelopeApprovalPageDTO addTemplatesItem(EnvelopeTemplateInfoDTO templatesItem) {
    if (this.templates == null) {
      this.templates = new LinkedHashSet<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

  /**
   * Templates
   * @return templates
   */
  @javax.annotation.Nullable
  public Set<EnvelopeTemplateInfoDTO> getTemplates() {
    return templates;
  }

  public void setTemplates(@javax.annotation.Nullable Set<EnvelopeTemplateInfoDTO> templates) {
    this.templates = templates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeApprovalPageDTO envelopeApprovalPageDTO = (EnvelopeApprovalPageDTO) o;
    return Objects.equals(this.totalElements, envelopeApprovalPageDTO.totalElements) &&
        Objects.equals(this.sizeRequested, envelopeApprovalPageDTO.sizeRequested) &&
        Objects.equals(this.numberOfElements, envelopeApprovalPageDTO.numberOfElements) &&
        Objects.equals(this.data, envelopeApprovalPageDTO.data) &&
        Objects.equals(this.initiators, envelopeApprovalPageDTO.initiators) &&
        Objects.equals(this.templates, envelopeApprovalPageDTO.templates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalElements, sizeRequested, numberOfElements, data, initiators, templates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeApprovalPageDTO {\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    sizeRequested: ").append(toIndentedString(sizeRequested)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    initiators: ").append(toIndentedString(initiators)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
    openapiFields.add("initiators");
    openapiFields.add("templates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopeApprovalPageDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopeApprovalPageDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopeApprovalPageDTO is not found in the empty JSON string", EnvelopeApprovalPageDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvelopeApprovalPageDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvelopeApprovalPageDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            EnvApprovalSearchResultDTO.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
      if (jsonObj.get("initiators") != null && !jsonObj.get("initiators").isJsonNull()) {
        JsonArray jsonArrayinitiators = jsonObj.getAsJsonArray("initiators");
        if (jsonArrayinitiators != null) {
          // ensure the json data is an array
          if (!jsonObj.get("initiators").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `initiators` to be an array in the JSON string but got `%s`", jsonObj.get("initiators").toString()));
          }

          // validate the optional field `initiators` (array)
          for (int i = 0; i < jsonArrayinitiators.size(); i++) {
            EnvelopeSenderDTO.validateJsonElement(jsonArrayinitiators.get(i));
          };
        }
      }
      if (jsonObj.get("templates") != null && !jsonObj.get("templates").isJsonNull()) {
        JsonArray jsonArraytemplates = jsonObj.getAsJsonArray("templates");
        if (jsonArraytemplates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("templates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `templates` to be an array in the JSON string but got `%s`", jsonObj.get("templates").toString()));
          }

          // validate the optional field `templates` (array)
          for (int i = 0; i < jsonArraytemplates.size(); i++) {
            EnvelopeTemplateInfoDTO.validateJsonElement(jsonArraytemplates.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopeApprovalPageDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopeApprovalPageDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopeApprovalPageDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopeApprovalPageDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopeApprovalPageDTO>() {
           @Override
           public void write(JsonWriter out, EnvelopeApprovalPageDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvelopeApprovalPageDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnvelopeApprovalPageDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopeApprovalPageDTO
   * @throws IOException if the JSON string is invalid with respect to EnvelopeApprovalPageDTO
   */
  public static EnvelopeApprovalPageDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopeApprovalPageDTO.class);
  }

  /**
   * Convert an instance of EnvelopeApprovalPageDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

