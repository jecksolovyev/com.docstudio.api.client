/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R86.33
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

import java.util.UUID;
/**
 * Data records
 */
@Schema(description = "Data records")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class DictionaryColumnValueResponseDTO {
  @SerializedName("recordUuid")
  private UUID recordUuid = null;

  @SerializedName("data")
  private String data = null;

  public DictionaryColumnValueResponseDTO recordUuid(UUID recordUuid) {
    this.recordUuid = recordUuid;
    return this;
  }

   /**
   * Dictionary record uuid
   * @return recordUuid
  **/
  @Schema(required = true, description = "Dictionary record uuid")
  public UUID getRecordUuid() {
    return recordUuid;
  }

  public void setRecordUuid(UUID recordUuid) {
    this.recordUuid = recordUuid;
  }

  public DictionaryColumnValueResponseDTO data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Dictionary column value data
   * @return data
  **/
  @Schema(required = true, description = "Dictionary column value data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryColumnValueResponseDTO dictionaryColumnValueResponseDTO = (DictionaryColumnValueResponseDTO) o;
    return Objects.equals(this.recordUuid, dictionaryColumnValueResponseDTO.recordUuid) &&
        Objects.equals(this.data, dictionaryColumnValueResponseDTO.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordUuid, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryColumnValueResponseDTO {\n");
    
    sb.append("    recordUuid: ").append(toIndentedString(recordUuid)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
