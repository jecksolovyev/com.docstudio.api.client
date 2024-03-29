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

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/**
 * Data records
 */
@Schema(description = "Data records")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class DictionaryRecordValuesResponseDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("values")
  private Map<String, String> values = new HashMap<String, String>();

  public DictionaryRecordValuesResponseDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of dictionary record
   * @return uuid
  **/
  @Schema(required = true, description = "UUID of dictionary record")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public DictionaryRecordValuesResponseDTO values(Map<String, String> values) {
    this.values = values;
    return this;
  }

  public DictionaryRecordValuesResponseDTO putValuesItem(String key, String valuesItem) {
    this.values.put(key, valuesItem);
    return this;
  }

   /**
   * List of dictionary record values {columnUuid: fieldValue}
   * @return values
  **/
  @Schema(required = true, description = "List of dictionary record values {columnUuid: fieldValue}")
  public Map<String, String> getValues() {
    return values;
  }

  public void setValues(Map<String, String> values) {
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
    DictionaryRecordValuesResponseDTO dictionaryRecordValuesResponseDTO = (DictionaryRecordValuesResponseDTO) o;
    return Objects.equals(this.uuid, dictionaryRecordValuesResponseDTO.uuid) &&
        Objects.equals(this.values, dictionaryRecordValuesResponseDTO.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryRecordValuesResponseDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
