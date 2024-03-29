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

import java.util.ArrayList;
import java.util.List;
/**
 * Data for extra columns
 */
@Schema(description = "Data for extra columns")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class EnvelopeExtraFieldDTO {
  @SerializedName("order")
  private Integer order = null;

  @SerializedName("values")
  private List<Object> values = null;

  public EnvelopeExtraFieldDTO order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @Schema(description = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public EnvelopeExtraFieldDTO values(List<Object> values) {
    this.values = values;
    return this;
  }

  public EnvelopeExtraFieldDTO addValuesItem(Object valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<Object>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @Schema(description = "")
  public List<Object> getValues() {
    return values;
  }

  public void setValues(List<Object> values) {
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
    EnvelopeExtraFieldDTO envelopeExtraFieldDTO = (EnvelopeExtraFieldDTO) o;
    return Objects.equals(this.order, envelopeExtraFieldDTO.order) &&
        Objects.equals(this.values, envelopeExtraFieldDTO.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeExtraFieldDTO {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
