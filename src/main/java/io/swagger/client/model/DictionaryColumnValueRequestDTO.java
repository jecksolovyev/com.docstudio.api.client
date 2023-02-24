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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * DictionaryColumnValueRequestDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class DictionaryColumnValueRequestDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("value")
  private String value = null;

  public DictionaryColumnValueRequestDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Dictionary column UUID
   * @return uuid
  **/
  @Schema(required = true, description = "Dictionary column UUID")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public DictionaryColumnValueRequestDTO value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Dictionary column value data
   * @return value
  **/
  @Schema(required = true, description = "Dictionary column value data")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryColumnValueRequestDTO dictionaryColumnValueRequestDTO = (DictionaryColumnValueRequestDTO) o;
    return Objects.equals(this.uuid, dictionaryColumnValueRequestDTO.uuid) &&
        Objects.equals(this.value, dictionaryColumnValueRequestDTO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryColumnValueRequestDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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