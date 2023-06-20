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
 * EnvTableRestriction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-19T23:56:47.469723923Z[GMT]")

public class EnvTableRestriction {
  @SerializedName("maxRows")
  private Integer maxRows = null;

  @SerializedName("rowsPerUiPage")
  private Integer rowsPerUiPage = null;

  @SerializedName("rowsPerPdfPage")
  private Integer rowsPerPdfPage = null;

  public EnvTableRestriction maxRows(Integer maxRows) {
    this.maxRows = maxRows;
    return this;
  }

   /**
   * Get maxRows
   * @return maxRows
  **/
  @Schema(description = "")
  public Integer getMaxRows() {
    return maxRows;
  }

  public void setMaxRows(Integer maxRows) {
    this.maxRows = maxRows;
  }

  public EnvTableRestriction rowsPerUiPage(Integer rowsPerUiPage) {
    this.rowsPerUiPage = rowsPerUiPage;
    return this;
  }

   /**
   * Get rowsPerUiPage
   * @return rowsPerUiPage
  **/
  @Schema(description = "")
  public Integer getRowsPerUiPage() {
    return rowsPerUiPage;
  }

  public void setRowsPerUiPage(Integer rowsPerUiPage) {
    this.rowsPerUiPage = rowsPerUiPage;
  }

  public EnvTableRestriction rowsPerPdfPage(Integer rowsPerPdfPage) {
    this.rowsPerPdfPage = rowsPerPdfPage;
    return this;
  }

   /**
   * Get rowsPerPdfPage
   * @return rowsPerPdfPage
  **/
  @Schema(description = "")
  public Integer getRowsPerPdfPage() {
    return rowsPerPdfPage;
  }

  public void setRowsPerPdfPage(Integer rowsPerPdfPage) {
    this.rowsPerPdfPage = rowsPerPdfPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvTableRestriction envTableRestriction = (EnvTableRestriction) o;
    return Objects.equals(this.maxRows, envTableRestriction.maxRows) &&
        Objects.equals(this.rowsPerUiPage, envTableRestriction.rowsPerUiPage) &&
        Objects.equals(this.rowsPerPdfPage, envTableRestriction.rowsPerPdfPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxRows, rowsPerUiPage, rowsPerPdfPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvTableRestriction {\n");
    
    sb.append("    maxRows: ").append(toIndentedString(maxRows)).append("\n");
    sb.append("    rowsPerUiPage: ").append(toIndentedString(rowsPerUiPage)).append("\n");
    sb.append("    rowsPerPdfPage: ").append(toIndentedString(rowsPerPdfPage)).append("\n");
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
