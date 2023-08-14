/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R86.31
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * DictionaryRecordsRequestDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-14T22:02:04.375144579Z[GMT]")

public class DictionaryRecordsRequestDTO {
  @SerializedName("columnUuid")
  private UUID columnUuid = null;

  @SerializedName("values")
  private List<String> values = null;

  public DictionaryRecordsRequestDTO columnUuid(UUID columnUuid) {
    this.columnUuid = columnUuid;
    return this;
  }

   /**
   * Column UUID
   * @return columnUuid
  **/
  @Schema(required = true, description = "Column UUID")
  public UUID getColumnUuid() {
    return columnUuid;
  }

  public void setColumnUuid(UUID columnUuid) {
    this.columnUuid = columnUuid;
  }

  public DictionaryRecordsRequestDTO values(List<String> values) {
    this.values = values;
    return this;
  }

  public DictionaryRecordsRequestDTO addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @Schema(description = "")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
