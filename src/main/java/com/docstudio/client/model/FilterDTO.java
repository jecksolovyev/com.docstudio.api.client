/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R75.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * FilterDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-14T13:27:59.020080107Z[GMT]")
public class FilterDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  /**
   * Operation
   */
  @JsonAdapter(OpEnum.Adapter.class)
  public enum OpEnum {
    EQUAL("="),
    NOT_EQUAL("!="),
    _U("=="),
    _U_3("!==");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OpEnum fromValue(String input) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OpEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OpEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public OpEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OpEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("op")
  private OpEnum op = null;

  @SerializedName("value")
  private String value = null;

  public FilterDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Column UUID
   * @return uuid
  **/
  @Schema(required = true, description = "Column UUID")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public FilterDTO op(OpEnum op) {
    this.op = op;
    return this;
  }

   /**
   * Operation
   * @return op
  **/
  @Schema(required = true, description = "Operation")
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public FilterDTO value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Required value
   * @return value
  **/
  @Schema(required = true, description = "Required value")
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
    FilterDTO filterDTO = (FilterDTO) o;
    return Objects.equals(this.uuid, filterDTO.uuid) &&
        Objects.equals(this.op, filterDTO.op) &&
        Objects.equals(this.value, filterDTO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, op, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
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