/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R120.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/**
 * Search parameters
 */
@Schema(description = "Search parameters")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class DictionaryColumnValueSearchDTO {
  @SerializedName("envelopeUuid")
  private UUID envelopeUuid = null;

  @SerializedName("templateUuid")
  private UUID templateUuid = null;

  @SerializedName("versionUuid")
  private UUID versionUuid = null;

  @SerializedName("documentId")
  private String documentId = null;

  @SerializedName("fieldName")
  private String fieldName = null;

  @SerializedName("rowIndex")
  private Integer rowIndex = null;

  @SerializedName("keyword")
  private String keyword = null;

  @SerializedName("filter")
  private Map<String, String> filter = null;

  public DictionaryColumnValueSearchDTO envelopeUuid(UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
    return this;
  }

   /**
   * Envelope UUID, used for filtered dictionaries
   * @return envelopeUuid
  **/
  @Schema(description = "Envelope UUID, used for filtered dictionaries")
  public UUID getEnvelopeUuid() {
    return envelopeUuid;
  }

  public void setEnvelopeUuid(UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
  }

  public DictionaryColumnValueSearchDTO templateUuid(UUID templateUuid) {
    this.templateUuid = templateUuid;
    return this;
  }

   /**
   * Template UUID, used for filtered dictionaries
   * @return templateUuid
  **/
  @Schema(description = "Template UUID, used for filtered dictionaries")
  public UUID getTemplateUuid() {
    return templateUuid;
  }

  public void setTemplateUuid(UUID templateUuid) {
    this.templateUuid = templateUuid;
  }

  public DictionaryColumnValueSearchDTO versionUuid(UUID versionUuid) {
    this.versionUuid = versionUuid;
    return this;
  }

   /**
   * Template version UUID, used for filtered dictionaries
   * @return versionUuid
  **/
  @Schema(description = "Template version UUID, used for filtered dictionaries")
  public UUID getVersionUuid() {
    return versionUuid;
  }

  public void setVersionUuid(UUID versionUuid) {
    this.versionUuid = versionUuid;
  }

  public DictionaryColumnValueSearchDTO documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Document id, where field is located, used for filtered dictionaries
   * @return documentId
  **/
  @Schema(description = "Document id, where field is located, used for filtered dictionaries")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public DictionaryColumnValueSearchDTO fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Field name, used for filtered dictionaries
   * @return fieldName
  **/
  @Schema(description = "Field name, used for filtered dictionaries")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public DictionaryColumnValueSearchDTO rowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }

   /**
   * Row index, where field is located in table used for filtered dictionaries
   * @return rowIndex
  **/
  @Schema(description = "Row index, where field is located in table used for filtered dictionaries")
  public Integer getRowIndex() {
    return rowIndex;
  }

  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }

  public DictionaryColumnValueSearchDTO keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * Keyword to search by
   * @return keyword
  **/
  @Schema(description = "Keyword to search by")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public DictionaryColumnValueSearchDTO filter(Map<String, String> filter) {
    this.filter = filter;
    return this;
  }

  public DictionaryColumnValueSearchDTO putFilterItem(String key, String filterItem) {
    if (this.filter == null) {
      this.filter = new HashMap<String, String>();
    }
    this.filter.put(key, filterItem);
    return this;
  }

   /**
   * Values for filter columns, except filter by role
   * @return filter
  **/
  @Schema(description = "Values for filter columns, except filter by role")
  public Map<String, String> getFilter() {
    return filter;
  }

  public void setFilter(Map<String, String> filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
