/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R82.8
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

/**
 * EinkSignRestriction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-19T23:56:47.469723923Z[GMT]")

public class EinkSignRestriction {
  @SerializedName("minPixelsExpected")
  private Integer minPixelsExpected = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("maxLength")
  private Integer maxLength = null;

  public EinkSignRestriction minPixelsExpected(Integer minPixelsExpected) {
    this.minPixelsExpected = minPixelsExpected;
    return this;
  }

   /**
   * Get minPixelsExpected
   * @return minPixelsExpected
  **/
  @Schema(description = "")
  public Integer getMinPixelsExpected() {
    return minPixelsExpected;
  }

  public void setMinPixelsExpected(Integer minPixelsExpected) {
    this.minPixelsExpected = minPixelsExpected;
  }

  public EinkSignRestriction width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @Schema(description = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public EinkSignRestriction height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @Schema(description = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public EinkSignRestriction maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Get maxLength
   * @return maxLength
  **/
  @Schema(description = "")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EinkSignRestriction einkSignRestriction = (EinkSignRestriction) o;
    return Objects.equals(this.minPixelsExpected, einkSignRestriction.minPixelsExpected) &&
        Objects.equals(this.width, einkSignRestriction.width) &&
        Objects.equals(this.height, einkSignRestriction.height) &&
        Objects.equals(this.maxLength, einkSignRestriction.maxLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minPixelsExpected, width, height, maxLength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EinkSignRestriction {\n");
    
    sb.append("    minPixelsExpected: ").append(toIndentedString(minPixelsExpected)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
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
