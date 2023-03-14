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

import java.util.ArrayList;
import java.util.List;
/**
 * DocumentCommentsDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-14T13:27:59.020080107Z[GMT]")
public class DocumentCommentsDTO {
  @SerializedName("documentId")
  private String documentId = null;

  @SerializedName("active")
  private List<CommentThreadDTO> active = null;

  @SerializedName("resolved")
  private List<CommentThreadDTO> resolved = null;

  public DocumentCommentsDTO documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Document ID
   * @return documentId
  **/
  @Schema(description = "Document ID")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public DocumentCommentsDTO active(List<CommentThreadDTO> active) {
    this.active = active;
    return this;
  }

  public DocumentCommentsDTO addActiveItem(CommentThreadDTO activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<CommentThreadDTO>();
    }
    this.active.add(activeItem);
    return this;
  }

   /**
   * Active comment threads
   * @return active
  **/
  @Schema(description = "Active comment threads")
  public List<CommentThreadDTO> getActive() {
    return active;
  }

  public void setActive(List<CommentThreadDTO> active) {
    this.active = active;
  }

  public DocumentCommentsDTO resolved(List<CommentThreadDTO> resolved) {
    this.resolved = resolved;
    return this;
  }

  public DocumentCommentsDTO addResolvedItem(CommentThreadDTO resolvedItem) {
    if (this.resolved == null) {
      this.resolved = new ArrayList<CommentThreadDTO>();
    }
    this.resolved.add(resolvedItem);
    return this;
  }

   /**
   * Resolved comment threads
   * @return resolved
  **/
  @Schema(description = "Resolved comment threads")
  public List<CommentThreadDTO> getResolved() {
    return resolved;
  }

  public void setResolved(List<CommentThreadDTO> resolved) {
    this.resolved = resolved;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCommentsDTO documentCommentsDTO = (DocumentCommentsDTO) o;
    return Objects.equals(this.documentId, documentCommentsDTO.documentId) &&
        Objects.equals(this.active, documentCommentsDTO.active) &&
        Objects.equals(this.resolved, documentCommentsDTO.resolved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, active, resolved);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCommentsDTO {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
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