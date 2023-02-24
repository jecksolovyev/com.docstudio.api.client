/*
 * Docstudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R74.21
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.EnvelopePageDTO;
import io.swagger.client.model.EnvelopeSearchField;
import io.swagger.client.model.EnvelopeSenderDTO;
import io.swagger.client.model.EnvelopeTemplateInfoDTO;
import io.swagger.client.model.EnvelopeToMailboxDTO;
import io.swagger.client.model.EnvelopeViewColumn;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EnvelopePageDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class EnvelopePageDTO {
  @SerializedName("totalElements")
  private Long totalElements = null;

  @SerializedName("sizeRequested")
  private Long sizeRequested = null;

  @SerializedName("numberOfElements")
  private Long numberOfElements = null;

  @SerializedName("data")
  private List<EnvelopeToMailboxDTO> data = null;

  @SerializedName("searchFields")
  private List<EnvelopeSearchField> searchFields = null;

  @SerializedName("columns")
  private List<EnvelopeViewColumn> columns = null;

  @SerializedName("senders")
  private List<EnvelopeSenderDTO> senders = null;

  @SerializedName("templates")
  private List<EnvelopeTemplateInfoDTO> templates = null;

  @SerializedName("sendersInfo")
  private EnvelopePageDTO sendersInfo = null;

  @SerializedName("templatesInfo")
  private EnvelopePageDTO templatesInfo = null;

  public EnvelopePageDTO totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Total elements by request
   * @return totalElements
  **/
  @Schema(description = "Total elements by request")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public EnvelopePageDTO sizeRequested(Long sizeRequested) {
    this.sizeRequested = sizeRequested;
    return this;
  }

   /**
   * Requested size
   * @return sizeRequested
  **/
  @Schema(description = "Requested size")
  public Long getSizeRequested() {
    return sizeRequested;
  }

  public void setSizeRequested(Long sizeRequested) {
    this.sizeRequested = sizeRequested;
  }

  public EnvelopePageDTO numberOfElements(Long numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

   /**
   * Fetched records count
   * @return numberOfElements
  **/
  @Schema(description = "Fetched records count")
  public Long getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Long numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public EnvelopePageDTO data(List<EnvelopeToMailboxDTO> data) {
    this.data = data;
    return this;
  }

  public EnvelopePageDTO addDataItem(EnvelopeToMailboxDTO dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<EnvelopeToMailboxDTO>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Data records
   * @return data
  **/
  @Schema(description = "Data records")
  public List<EnvelopeToMailboxDTO> getData() {
    return data;
  }

  public void setData(List<EnvelopeToMailboxDTO> data) {
    this.data = data;
  }

  public EnvelopePageDTO searchFields(List<EnvelopeSearchField> searchFields) {
    this.searchFields = searchFields;
    return this;
  }

  public EnvelopePageDTO addSearchFieldsItem(EnvelopeSearchField searchFieldsItem) {
    if (this.searchFields == null) {
      this.searchFields = new ArrayList<EnvelopeSearchField>();
    }
    this.searchFields.add(searchFieldsItem);
    return this;
  }

   /**
   * Search fields
   * @return searchFields
  **/
  @Schema(description = "Search fields")
  public List<EnvelopeSearchField> getSearchFields() {
    return searchFields;
  }

  public void setSearchFields(List<EnvelopeSearchField> searchFields) {
    this.searchFields = searchFields;
  }

  public EnvelopePageDTO columns(List<EnvelopeViewColumn> columns) {
    this.columns = columns;
    return this;
  }

  public EnvelopePageDTO addColumnsItem(EnvelopeViewColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<EnvelopeViewColumn>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Saved columns to display
   * @return columns
  **/
  @Schema(description = "Saved columns to display")
  public List<EnvelopeViewColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<EnvelopeViewColumn> columns) {
    this.columns = columns;
  }

  public EnvelopePageDTO senders(List<EnvelopeSenderDTO> senders) {
    this.senders = senders;
    return this;
  }

  public EnvelopePageDTO addSendersItem(EnvelopeSenderDTO sendersItem) {
    if (this.senders == null) {
      this.senders = new ArrayList<EnvelopeSenderDTO>();
    }
    this.senders.add(sendersItem);
    return this;
  }

   /**
   * Senders
   * @return senders
  **/
  @Schema(description = "Senders")
  public List<EnvelopeSenderDTO> getSenders() {
    return senders;
  }

  public void setSenders(List<EnvelopeSenderDTO> senders) {
    this.senders = senders;
  }

  public EnvelopePageDTO templates(List<EnvelopeTemplateInfoDTO> templates) {
    this.templates = templates;
    return this;
  }

  public EnvelopePageDTO addTemplatesItem(EnvelopeTemplateInfoDTO templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<EnvelopeTemplateInfoDTO>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Templates
   * @return templates
  **/
  @Schema(description = "Templates")
  public List<EnvelopeTemplateInfoDTO> getTemplates() {
    return templates;
  }

  public void setTemplates(List<EnvelopeTemplateInfoDTO> templates) {
    this.templates = templates;
  }

  public EnvelopePageDTO sendersInfo(EnvelopePageDTO sendersInfo) {
    this.sendersInfo = sendersInfo;
    return this;
  }

   /**
   * Get sendersInfo
   * @return sendersInfo
  **/
  @Schema(description = "")
  public EnvelopePageDTO getSendersInfo() {
    return sendersInfo;
  }

  public void setSendersInfo(EnvelopePageDTO sendersInfo) {
    this.sendersInfo = sendersInfo;
  }

  public EnvelopePageDTO templatesInfo(EnvelopePageDTO templatesInfo) {
    this.templatesInfo = templatesInfo;
    return this;
  }

   /**
   * Get templatesInfo
   * @return templatesInfo
  **/
  @Schema(description = "")
  public EnvelopePageDTO getTemplatesInfo() {
    return templatesInfo;
  }

  public void setTemplatesInfo(EnvelopePageDTO templatesInfo) {
    this.templatesInfo = templatesInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
