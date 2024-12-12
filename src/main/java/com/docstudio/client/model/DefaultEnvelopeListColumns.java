/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R120.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.docstudio.client.model.EnvelopeListColumn;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Default envelope list columns
 */
@Schema(description = "Default envelope list columns")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class DefaultEnvelopeListColumns {
  @SerializedName("columns")
  private Map<String, EnvelopeListColumn> columns = null;

  @SerializedName("defaultMinWidth")
  private Integer defaultMinWidth = null;

  @SerializedName("defaultWidth")
  private Integer defaultWidth = null;

  public DefaultEnvelopeListColumns columns(Map<String, EnvelopeListColumn> columns) {
    this.columns = columns;
    return this;
  }

  public DefaultEnvelopeListColumns putColumnsItem(String key, EnvelopeListColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new HashMap<String, EnvelopeListColumn>();
    }
    this.columns.put(key, columnsItem);
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @Schema(description = "")
  public Map<String, EnvelopeListColumn> getColumns() {
    return columns;
  }

  public void setColumns(Map<String, EnvelopeListColumn> columns) {
    this.columns = columns;
  }

  public DefaultEnvelopeListColumns defaultMinWidth(Integer defaultMinWidth) {
    this.defaultMinWidth = defaultMinWidth;
    return this;
  }

   /**
   * Get defaultMinWidth
   * @return defaultMinWidth
  **/
  @Schema(description = "")
  public Integer getDefaultMinWidth() {
    return defaultMinWidth;
  }

  public void setDefaultMinWidth(Integer defaultMinWidth) {
    this.defaultMinWidth = defaultMinWidth;
  }

  public DefaultEnvelopeListColumns defaultWidth(Integer defaultWidth) {
    this.defaultWidth = defaultWidth;
    return this;
  }

   /**
   * Get defaultWidth
   * @return defaultWidth
  **/
  @Schema(description = "")
  public Integer getDefaultWidth() {
    return defaultWidth;
  }

  public void setDefaultWidth(Integer defaultWidth) {
    this.defaultWidth = defaultWidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultEnvelopeListColumns defaultEnvelopeListColumns = (DefaultEnvelopeListColumns) o;
    return Objects.equals(this.columns, defaultEnvelopeListColumns.columns) &&
        Objects.equals(this.defaultMinWidth, defaultEnvelopeListColumns.defaultMinWidth) &&
        Objects.equals(this.defaultWidth, defaultEnvelopeListColumns.defaultWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, defaultMinWidth, defaultWidth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultEnvelopeListColumns {\n");
    
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    defaultMinWidth: ").append(toIndentedString(defaultMinWidth)).append("\n");
    sb.append("    defaultWidth: ").append(toIndentedString(defaultWidth)).append("\n");
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