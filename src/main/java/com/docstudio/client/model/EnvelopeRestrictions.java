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

/**
 * Envelope Restrictions
 */
@Schema(description = "Envelope Restrictions")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-14T22:02:04.375144579Z[GMT]")

public class EnvelopeRestrictions {
  @SerializedName("field")
  private FieldRestriction field = null;

  @SerializedName("attachment")
  private AttachmentRestriction attachment = null;

  @SerializedName("searchField")
  private SearchFieldRestriction searchField = null;

  @SerializedName("table")
  private EnvTableRestriction table = null;

  public EnvelopeRestrictions field(FieldRestriction field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @Schema(description = "")
  public FieldRestriction getField() {
    return field;
  }

  public void setField(FieldRestriction field) {
    this.field = field;
  }

  public EnvelopeRestrictions attachment(AttachmentRestriction attachment) {
    this.attachment = attachment;
    return this;
  }

   /**
   * Get attachment
   * @return attachment
  **/
  @Schema(description = "")
  public AttachmentRestriction getAttachment() {
    return attachment;
  }

  public void setAttachment(AttachmentRestriction attachment) {
    this.attachment = attachment;
  }

  public EnvelopeRestrictions searchField(SearchFieldRestriction searchField) {
    this.searchField = searchField;
    return this;
  }

   /**
   * Get searchField
   * @return searchField
  **/
  @Schema(description = "")
  public SearchFieldRestriction getSearchField() {
    return searchField;
  }

  public void setSearchField(SearchFieldRestriction searchField) {
    this.searchField = searchField;
  }

  public EnvelopeRestrictions table(EnvTableRestriction table) {
    this.table = table;
    return this;
  }

   /**
   * Get table
   * @return table
  **/
  @Schema(description = "")
  public EnvTableRestriction getTable() {
    return table;
  }

  public void setTable(EnvTableRestriction table) {
    this.table = table;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeRestrictions envelopeRestrictions = (EnvelopeRestrictions) o;
    return Objects.equals(this.field, envelopeRestrictions.field) &&
        Objects.equals(this.attachment, envelopeRestrictions.attachment) &&
        Objects.equals(this.searchField, envelopeRestrictions.searchField) &&
        Objects.equals(this.table, envelopeRestrictions.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, attachment, searchField, table);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeRestrictions {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    searchField: ").append(toIndentedString(searchField)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
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
