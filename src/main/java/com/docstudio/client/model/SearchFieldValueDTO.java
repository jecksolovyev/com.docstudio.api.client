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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
/**
 * Search by field value parameters
 */
@Schema(description = "Search by field value parameters")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-14T13:27:59.020080107Z[GMT]")
public class SearchFieldValueDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("number")
  private Double number = null;

  @SerializedName("from")
  private OffsetDateTime from = null;

  @SerializedName("to")
  private OffsetDateTime to = null;

  public SearchFieldValueDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Field name
   * @return name
  **/
  @Schema(required = true, description = "Field name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SearchFieldValueDTO value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Field string value
   * @return value
  **/
  @Schema(description = "Field string value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public SearchFieldValueDTO number(Double number) {
    this.number = number;
    return this;
  }

   /**
   * Field number value
   * @return number
  **/
  @Schema(description = "Field number value")
  public Double getNumber() {
    return number;
  }

  public void setNumber(Double number) {
    this.number = number;
  }

  public SearchFieldValueDTO from(OffsetDateTime from) {
    this.from = from;
    return this;
  }

   /**
   * Field date from value
   * @return from
  **/
  @Schema(description = "Field date from value")
  public OffsetDateTime getFrom() {
    return from;
  }

  public void setFrom(OffsetDateTime from) {
    this.from = from;
  }

  public SearchFieldValueDTO to(OffsetDateTime to) {
    this.to = to;
    return this;
  }

   /**
   * Field date to value
   * @return to
  **/
  @Schema(description = "Field date to value")
  public OffsetDateTime getTo() {
    return to;
  }

  public void setTo(OffsetDateTime to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchFieldValueDTO searchFieldValueDTO = (SearchFieldValueDTO) o;
    return Objects.equals(this.name, searchFieldValueDTO.name) &&
        Objects.equals(this.value, searchFieldValueDTO.value) &&
        Objects.equals(this.number, searchFieldValueDTO.number) &&
        Objects.equals(this.from, searchFieldValueDTO.from) &&
        Objects.equals(this.to, searchFieldValueDTO.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, number, from, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchFieldValueDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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