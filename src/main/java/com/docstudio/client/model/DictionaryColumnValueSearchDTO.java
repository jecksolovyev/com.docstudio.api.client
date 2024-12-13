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
 * Search parameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class DictionaryColumnValueSearchDTO {
  public static final String SERIALIZED_NAME_ENVELOPE_UUID = "envelopeUuid";
  @SerializedName(SERIALIZED_NAME_ENVELOPE_UUID)
  @javax.annotation.Nullable
  private UUID envelopeUuid;

  public static final String SERIALIZED_NAME_TEMPLATE_UUID = "templateUuid";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_UUID)
  @javax.annotation.Nullable
  private UUID templateUuid;

  public static final String SERIALIZED_NAME_VERSION_UUID = "versionUuid";
  @SerializedName(SERIALIZED_NAME_VERSION_UUID)
  @javax.annotation.Nullable
  private UUID versionUuid;

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  @javax.annotation.Nullable
  private String documentId;

  public static final String SERIALIZED_NAME_FIELD_NAME = "fieldName";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  @javax.annotation.Nullable
  private String fieldName;

  public static final String SERIALIZED_NAME_ROW_INDEX = "rowIndex";
  @SerializedName(SERIALIZED_NAME_ROW_INDEX)
  @javax.annotation.Nullable
  private Integer rowIndex;

  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  @javax.annotation.Nullable
  private String keyword;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  @javax.annotation.Nullable
  private Map<String, String> filter = new HashMap<>();

  public DictionaryColumnValueSearchDTO() {
  }

  public DictionaryColumnValueSearchDTO envelopeUuid(@javax.annotation.Nullable UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
    return this;
  }

  /**
   * Envelope UUID, used for filtered dictionaries
   * @return envelopeUuid
   */
  @javax.annotation.Nullable
  public UUID getEnvelopeUuid() {
    return envelopeUuid;
  }

  public void setEnvelopeUuid(@javax.annotation.Nullable UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
  }


  public DictionaryColumnValueSearchDTO templateUuid(@javax.annotation.Nullable UUID templateUuid) {
    this.templateUuid = templateUuid;
    return this;
  }

  /**
   * Template UUID, used for filtered dictionaries
   * @return templateUuid
   */
  @javax.annotation.Nullable
  public UUID getTemplateUuid() {
    return templateUuid;
  }

  public void setTemplateUuid(@javax.annotation.Nullable UUID templateUuid) {
    this.templateUuid = templateUuid;
  }


  public DictionaryColumnValueSearchDTO versionUuid(@javax.annotation.Nullable UUID versionUuid) {
    this.versionUuid = versionUuid;
    return this;
  }

  /**
   * Template version UUID, used for filtered dictionaries
   * @return versionUuid
   */
  @javax.annotation.Nullable
  public UUID getVersionUuid() {
    return versionUuid;
  }

  public void setVersionUuid(@javax.annotation.Nullable UUID versionUuid) {
    this.versionUuid = versionUuid;
  }


  public DictionaryColumnValueSearchDTO documentId(@javax.annotation.Nullable String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Document id, where field is located, used for filtered dictionaries
   * @return documentId
   */
  @javax.annotation.Nullable
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(@javax.annotation.Nullable String documentId) {
    this.documentId = documentId;
  }


  public DictionaryColumnValueSearchDTO fieldName(@javax.annotation.Nullable String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Field name, used for filtered dictionaries
   * @return fieldName
   */
  @javax.annotation.Nullable
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(@javax.annotation.Nullable String fieldName) {
    this.fieldName = fieldName;
  }


  public DictionaryColumnValueSearchDTO rowIndex(@javax.annotation.Nullable Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }

  /**
   * Row index, where field is located in table used for filtered dictionaries
   * @return rowIndex
   */
  @javax.annotation.Nullable
  public Integer getRowIndex() {
    return rowIndex;
  }

  public void setRowIndex(@javax.annotation.Nullable Integer rowIndex) {
    this.rowIndex = rowIndex;
  }


  public DictionaryColumnValueSearchDTO keyword(@javax.annotation.Nullable String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * Keyword to search by
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(@javax.annotation.Nullable String keyword) {
    this.keyword = keyword;
  }


  public DictionaryColumnValueSearchDTO filter(@javax.annotation.Nullable Map<String, String> filter) {
    this.filter = filter;
    return this;
  }

  public DictionaryColumnValueSearchDTO putFilterItem(String key, String filterItem) {
    if (this.filter == null) {
      this.filter = new HashMap<>();
    }
    this.filter.put(key, filterItem);
    return this;
  }

  /**
   * Values for filter columns, except filter by role
   * @return filter
   */
  @javax.annotation.Nullable
  public Map<String, String> getFilter() {
    return filter;
  }

  public void setFilter(@javax.annotation.Nullable Map<String, String> filter) {
    this.filter = filter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryColumnValueSearchDTO dictionaryColumnValueSearchDTO = (DictionaryColumnValueSearchDTO) o;
    return Objects.equals(this.envelopeUuid, dictionaryColumnValueSearchDTO.envelopeUuid) &&
        Objects.equals(this.templateUuid, dictionaryColumnValueSearchDTO.templateUuid) &&
        Objects.equals(this.versionUuid, dictionaryColumnValueSearchDTO.versionUuid) &&
        Objects.equals(this.documentId, dictionaryColumnValueSearchDTO.documentId) &&
        Objects.equals(this.fieldName, dictionaryColumnValueSearchDTO.fieldName) &&
        Objects.equals(this.rowIndex, dictionaryColumnValueSearchDTO.rowIndex) &&
        Objects.equals(this.keyword, dictionaryColumnValueSearchDTO.keyword) &&
        Objects.equals(this.filter, dictionaryColumnValueSearchDTO.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeUuid, templateUuid, versionUuid, documentId, fieldName, rowIndex, keyword, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryColumnValueSearchDTO {\n");
    sb.append("    envelopeUuid: ").append(toIndentedString(envelopeUuid)).append("\n");
    sb.append("    templateUuid: ").append(toIndentedString(templateUuid)).append("\n");
    sb.append("    versionUuid: ").append(toIndentedString(versionUuid)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
    openapiFields.add("envelopeUuid");
    openapiFields.add("templateUuid");
    openapiFields.add("versionUuid");
    openapiFields.add("documentId");
    openapiFields.add("fieldName");
    openapiFields.add("rowIndex");
    openapiFields.add("keyword");
    openapiFields.add("filter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DictionaryColumnValueSearchDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DictionaryColumnValueSearchDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DictionaryColumnValueSearchDTO is not found in the empty JSON string", DictionaryColumnValueSearchDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DictionaryColumnValueSearchDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DictionaryColumnValueSearchDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("envelopeUuid") != null && !jsonObj.get("envelopeUuid").isJsonNull()) && !jsonObj.get("envelopeUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `envelopeUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("envelopeUuid").toString()));
      }
      if ((jsonObj.get("templateUuid") != null && !jsonObj.get("templateUuid").isJsonNull()) && !jsonObj.get("templateUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateUuid").toString()));
      }
      if ((jsonObj.get("versionUuid") != null && !jsonObj.get("versionUuid").isJsonNull()) && !jsonObj.get("versionUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionUuid").toString()));
      }
      if ((jsonObj.get("documentId") != null && !jsonObj.get("documentId").isJsonNull()) && !jsonObj.get("documentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentId").toString()));
      }
      if ((jsonObj.get("fieldName") != null && !jsonObj.get("fieldName").isJsonNull()) && !jsonObj.get("fieldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldName").toString()));
      }
      if ((jsonObj.get("keyword") != null && !jsonObj.get("keyword").isJsonNull()) && !jsonObj.get("keyword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyword").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DictionaryColumnValueSearchDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DictionaryColumnValueSearchDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DictionaryColumnValueSearchDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DictionaryColumnValueSearchDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DictionaryColumnValueSearchDTO>() {
           @Override
           public void write(JsonWriter out, DictionaryColumnValueSearchDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DictionaryColumnValueSearchDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DictionaryColumnValueSearchDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DictionaryColumnValueSearchDTO
   * @throws IOException if the JSON string is invalid with respect to DictionaryColumnValueSearchDTO
   */
  public static DictionaryColumnValueSearchDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DictionaryColumnValueSearchDTO.class);
  }

  /**
   * Convert an instance of DictionaryColumnValueSearchDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

