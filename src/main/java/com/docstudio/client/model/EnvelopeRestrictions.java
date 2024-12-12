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
import com.docstudio.client.model.AttachmentRestriction;
import com.docstudio.client.model.EnvTableRestriction;
import com.docstudio.client.model.EnvelopeListColumn;
import com.docstudio.client.model.EnvelopeListColumnExtra;
import com.docstudio.client.model.FieldRestriction;
import com.docstudio.client.model.SearchFieldRestriction;
import com.docstudio.client.model.SearchRestriction;
import com.docstudio.client.model.ShareRestriction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Envelope Restrictions
 */
@Schema(description = "Envelope Restrictions")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class EnvelopeRestrictions {
  @SerializedName("field")
  private FieldRestriction field = null;

  @SerializedName("attachment")
  private AttachmentRestriction attachment = null;

  @SerializedName("search")
  private SearchRestriction search = null;

  @SerializedName("searchField")
  private SearchFieldRestriction searchField = null;

  @SerializedName("table")
  private EnvTableRestriction table = null;

  @SerializedName("share")
  private ShareRestriction share = null;

  @SerializedName("listColumns")
  private List<EnvelopeListColumn> listColumns = null;

  @SerializedName("listExtraColumn")
  private EnvelopeListColumnExtra listExtraColumn = null;

  @SerializedName("deleteFromBinAfterDays")
  private Long deleteFromBinAfterDays = null;

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

  public EnvelopeRestrictions search(SearchRestriction search) {
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
  @Schema(description = "")
  public SearchRestriction getSearch() {
    return search;
  }

  public void setSearch(SearchRestriction search) {
    this.search = search;
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

  public EnvelopeRestrictions share(ShareRestriction share) {
    this.share = share;
    return this;
  }

   /**
   * Get share
   * @return share
  **/
  @Schema(description = "")
  public ShareRestriction getShare() {
    return share;
  }

  public void setShare(ShareRestriction share) {
    this.share = share;
  }

  public EnvelopeRestrictions listColumns(List<EnvelopeListColumn> listColumns) {
    this.listColumns = listColumns;
    return this;
  }

  public EnvelopeRestrictions addListColumnsItem(EnvelopeListColumn listColumnsItem) {
    if (this.listColumns == null) {
      this.listColumns = new ArrayList<EnvelopeListColumn>();
    }
    this.listColumns.add(listColumnsItem);
    return this;
  }

   /**
   * Get listColumns
   * @return listColumns
  **/
  @Schema(description = "")
  public List<EnvelopeListColumn> getListColumns() {
    return listColumns;
  }

  public void setListColumns(List<EnvelopeListColumn> listColumns) {
    this.listColumns = listColumns;
  }

  public EnvelopeRestrictions listExtraColumn(EnvelopeListColumnExtra listExtraColumn) {
    this.listExtraColumn = listExtraColumn;
    return this;
  }

   /**
   * Get listExtraColumn
   * @return listExtraColumn
  **/
  @Schema(description = "")
  public EnvelopeListColumnExtra getListExtraColumn() {
    return listExtraColumn;
  }

  public void setListExtraColumn(EnvelopeListColumnExtra listExtraColumn) {
    this.listExtraColumn = listExtraColumn;
  }

  public EnvelopeRestrictions deleteFromBinAfterDays(Long deleteFromBinAfterDays) {
    this.deleteFromBinAfterDays = deleteFromBinAfterDays;
    return this;
  }

   /**
   * Get deleteFromBinAfterDays
   * @return deleteFromBinAfterDays
  **/
  @Schema(description = "")
  public Long getDeleteFromBinAfterDays() {
    return deleteFromBinAfterDays;
  }

  public void setDeleteFromBinAfterDays(Long deleteFromBinAfterDays) {
    this.deleteFromBinAfterDays = deleteFromBinAfterDays;
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
        Objects.equals(this.search, envelopeRestrictions.search) &&
        Objects.equals(this.searchField, envelopeRestrictions.searchField) &&
        Objects.equals(this.table, envelopeRestrictions.table) &&
        Objects.equals(this.share, envelopeRestrictions.share) &&
        Objects.equals(this.listColumns, envelopeRestrictions.listColumns) &&
        Objects.equals(this.listExtraColumn, envelopeRestrictions.listExtraColumn) &&
        Objects.equals(this.deleteFromBinAfterDays, envelopeRestrictions.deleteFromBinAfterDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, attachment, search, searchField, table, share, listColumns, listExtraColumn, deleteFromBinAfterDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeRestrictions {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    searchField: ").append(toIndentedString(searchField)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    listColumns: ").append(toIndentedString(listColumns)).append("\n");
    sb.append("    listExtraColumn: ").append(toIndentedString(listExtraColumn)).append("\n");
    sb.append("    deleteFromBinAfterDays: ").append(toIndentedString(deleteFromBinAfterDays)).append("\n");
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
