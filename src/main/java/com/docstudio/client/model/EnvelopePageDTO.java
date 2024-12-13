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
 * EnvelopePageDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class EnvelopePageDTO {
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
  private List<EnvelopeToMailboxDTO> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_SEARCH_FIELDS = "searchFields";
  @SerializedName(SERIALIZED_NAME_SEARCH_FIELDS)
  @javax.annotation.Nullable
  private List<EnvelopeSearchField> searchFields = new ArrayList<>();

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  @javax.annotation.Nullable
  private List<EnvelopeViewColumn> columns = new ArrayList<>();

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  @javax.annotation.Nullable
  private Set<EnvelopeSenderDTO> senders = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_TEMPLATES = "templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  @javax.annotation.Nullable
  private Set<EnvelopeTemplateInfoDTO> templates = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_SENDERS_INFO = "sendersInfo";
  @SerializedName(SERIALIZED_NAME_SENDERS_INFO)
  @javax.annotation.Nullable
  private EnvelopePageDTO sendersInfo;

  public static final String SERIALIZED_NAME_TEMPLATES_INFO = "templatesInfo";
  @SerializedName(SERIALIZED_NAME_TEMPLATES_INFO)
  @javax.annotation.Nullable
  private EnvelopePageDTO templatesInfo;

  public EnvelopePageDTO() {
  }

  public EnvelopePageDTO totalElements(@javax.annotation.Nullable Long totalElements) {
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


  public EnvelopePageDTO sizeRequested(@javax.annotation.Nullable Long sizeRequested) {
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


  public EnvelopePageDTO numberOfElements(@javax.annotation.Nullable Long numberOfElements) {
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


  public EnvelopePageDTO data(@javax.annotation.Nullable List<EnvelopeToMailboxDTO> data) {
    this.data = data;
    return this;
  }

  public EnvelopePageDTO addDataItem(EnvelopeToMailboxDTO dataItem) {
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

  public void setData(@javax.annotation.Nullable List<EnvelopeToMailboxDTO> data) {
    this.data = data;
  }


  public EnvelopePageDTO searchFields(@javax.annotation.Nullable List<EnvelopeSearchField> searchFields) {
    this.searchFields = searchFields;
    return this;
  }

  public EnvelopePageDTO addSearchFieldsItem(EnvelopeSearchField searchFieldsItem) {
    if (this.searchFields == null) {
      this.searchFields = new ArrayList<>();
    }
    this.searchFields.add(searchFieldsItem);
    return this;
  }

  /**
   * Search fields
   * @return searchFields
   */
  @javax.annotation.Nullable
  public List<EnvelopeSearchField> getSearchFields() {
    return searchFields;
  }

  public void setSearchFields(@javax.annotation.Nullable List<EnvelopeSearchField> searchFields) {
    this.searchFields = searchFields;
  }


  public EnvelopePageDTO columns(@javax.annotation.Nullable List<EnvelopeViewColumn> columns) {
    this.columns = columns;
    return this;
  }

  public EnvelopePageDTO addColumnsItem(EnvelopeViewColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * Saved columns to display
   * @return columns
   */
  @javax.annotation.Nullable
  public List<EnvelopeViewColumn> getColumns() {
    return columns;
  }

  public void setColumns(@javax.annotation.Nullable List<EnvelopeViewColumn> columns) {
    this.columns = columns;
  }


  public EnvelopePageDTO senders(@javax.annotation.Nullable Set<EnvelopeSenderDTO> senders) {
    this.senders = senders;
    return this;
  }

  public EnvelopePageDTO addSendersItem(EnvelopeSenderDTO sendersItem) {
    if (this.senders == null) {
      this.senders = new LinkedHashSet<>();
    }
    this.senders.add(sendersItem);
    return this;
  }

  /**
   * Senders
   * @return senders
   */
  @javax.annotation.Nullable
  public Set<EnvelopeSenderDTO> getSenders() {
    return senders;
  }

  public void setSenders(@javax.annotation.Nullable Set<EnvelopeSenderDTO> senders) {
    this.senders = senders;
  }


  public EnvelopePageDTO templates(@javax.annotation.Nullable Set<EnvelopeTemplateInfoDTO> templates) {
    this.templates = templates;
    return this;
  }

  public EnvelopePageDTO addTemplatesItem(EnvelopeTemplateInfoDTO templatesItem) {
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


  public EnvelopePageDTO sendersInfo(@javax.annotation.Nullable EnvelopePageDTO sendersInfo) {
    this.sendersInfo = sendersInfo;
    return this;
  }

  /**
   * Get sendersInfo
   * @return sendersInfo
   */
  @javax.annotation.Nullable
  public EnvelopePageDTO getSendersInfo() {
    return sendersInfo;
  }

  public void setSendersInfo(@javax.annotation.Nullable EnvelopePageDTO sendersInfo) {
    this.sendersInfo = sendersInfo;
  }


  public EnvelopePageDTO templatesInfo(@javax.annotation.Nullable EnvelopePageDTO templatesInfo) {
    this.templatesInfo = templatesInfo;
    return this;
  }

  /**
   * Get templatesInfo
   * @return templatesInfo
   */
  @javax.annotation.Nullable
  public EnvelopePageDTO getTemplatesInfo() {
    return templatesInfo;
  }

  public void setTemplatesInfo(@javax.annotation.Nullable EnvelopePageDTO templatesInfo) {
    this.templatesInfo = templatesInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopePageDTO envelopePageDTO = (EnvelopePageDTO) o;
    return Objects.equals(this.totalElements, envelopePageDTO.totalElements) &&
        Objects.equals(this.sizeRequested, envelopePageDTO.sizeRequested) &&
        Objects.equals(this.numberOfElements, envelopePageDTO.numberOfElements) &&
        Objects.equals(this.data, envelopePageDTO.data) &&
        Objects.equals(this.searchFields, envelopePageDTO.searchFields) &&
        Objects.equals(this.columns, envelopePageDTO.columns) &&
        Objects.equals(this.senders, envelopePageDTO.senders) &&
        Objects.equals(this.templates, envelopePageDTO.templates) &&
        Objects.equals(this.sendersInfo, envelopePageDTO.sendersInfo) &&
        Objects.equals(this.templatesInfo, envelopePageDTO.templatesInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalElements, sizeRequested, numberOfElements, data, searchFields, columns, senders, templates, sendersInfo, templatesInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopePageDTO {\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    sizeRequested: ").append(toIndentedString(sizeRequested)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    searchFields: ").append(toIndentedString(searchFields)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    sendersInfo: ").append(toIndentedString(sendersInfo)).append("\n");
    sb.append("    templatesInfo: ").append(toIndentedString(templatesInfo)).append("\n");
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
    openapiFields.add("searchFields");
    openapiFields.add("columns");
    openapiFields.add("senders");
    openapiFields.add("templates");
    openapiFields.add("sendersInfo");
    openapiFields.add("templatesInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopePageDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopePageDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopePageDTO is not found in the empty JSON string", EnvelopePageDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvelopePageDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvelopePageDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if (jsonObj.get("searchFields") != null && !jsonObj.get("searchFields").isJsonNull()) {
        JsonArray jsonArraysearchFields = jsonObj.getAsJsonArray("searchFields");
        if (jsonArraysearchFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("searchFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `searchFields` to be an array in the JSON string but got `%s`", jsonObj.get("searchFields").toString()));
          }

          // validate the optional field `searchFields` (array)
          for (int i = 0; i < jsonArraysearchFields.size(); i++) {
            EnvelopeSearchField.validateJsonElement(jsonArraysearchFields.get(i));
          };
        }
      }
      if (jsonObj.get("columns") != null && !jsonObj.get("columns").isJsonNull()) {
        JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
        if (jsonArraycolumns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("columns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
          }

          // validate the optional field `columns` (array)
          for (int i = 0; i < jsonArraycolumns.size(); i++) {
            EnvelopeViewColumn.validateJsonElement(jsonArraycolumns.get(i));
          };
        }
      }
      if (jsonObj.get("senders") != null && !jsonObj.get("senders").isJsonNull()) {
        JsonArray jsonArraysenders = jsonObj.getAsJsonArray("senders");
        if (jsonArraysenders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("senders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `senders` to be an array in the JSON string but got `%s`", jsonObj.get("senders").toString()));
          }

          // validate the optional field `senders` (array)
          for (int i = 0; i < jsonArraysenders.size(); i++) {
            EnvelopeSenderDTO.validateJsonElement(jsonArraysenders.get(i));
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
      // validate the optional field `sendersInfo`
      if (jsonObj.get("sendersInfo") != null && !jsonObj.get("sendersInfo").isJsonNull()) {
        EnvelopePageDTO.validateJsonElement(jsonObj.get("sendersInfo"));
      }
      // validate the optional field `templatesInfo`
      if (jsonObj.get("templatesInfo") != null && !jsonObj.get("templatesInfo").isJsonNull()) {
        EnvelopePageDTO.validateJsonElement(jsonObj.get("templatesInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopePageDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopePageDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopePageDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopePageDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopePageDTO>() {
           @Override
           public void write(JsonWriter out, EnvelopePageDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvelopePageDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnvelopePageDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopePageDTO
   * @throws IOException if the JSON string is invalid with respect to EnvelopePageDTO
   */
  public static EnvelopePageDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopePageDTO.class);
  }

  /**
   * Convert an instance of EnvelopePageDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

