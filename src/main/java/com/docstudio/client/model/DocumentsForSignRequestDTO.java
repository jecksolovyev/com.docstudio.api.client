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

import java.util.ArrayList;
import java.util.List;
/**
 * DocumentsForSignRequestDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-14T22:02:04.375144579Z[GMT]")

public class DocumentsForSignRequestDTO {
  @SerializedName("documentIds")
  private List<String> documentIds = new ArrayList<String>();

  @SerializedName("signingCertificate")
  private String signingCertificate = null;

  public DocumentsForSignRequestDTO documentIds(List<String> documentIds) {
    this.documentIds = documentIds;
    return this;
  }

  public DocumentsForSignRequestDTO addDocumentIdsItem(String documentIdsItem) {
    this.documentIds.add(documentIdsItem);
    return this;
  }

   /**
   * Document IDs
   * @return documentIds
  **/
  @Schema(required = true, description = "Document IDs")
  public List<String> getDocumentIds() {
    return documentIds;
  }

  public void setDocumentIds(List<String> documentIds) {
    this.documentIds = documentIds;
  }

  public DocumentsForSignRequestDTO signingCertificate(String signingCertificate) {
    this.signingCertificate = signingCertificate;
    return this;
  }

   /**
   * Certificate which will be used for signing (ASIC-E)
   * @return signingCertificate
  **/
  @Schema(description = "Certificate which will be used for signing (ASIC-E)")
  public String getSigningCertificate() {
    return signingCertificate;
  }

  public void setSigningCertificate(String signingCertificate) {
    this.signingCertificate = signingCertificate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentsForSignRequestDTO documentsForSignRequestDTO = (DocumentsForSignRequestDTO) o;
    return Objects.equals(this.documentIds, documentsForSignRequestDTO.documentIds) &&
        Objects.equals(this.signingCertificate, documentsForSignRequestDTO.signingCertificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentIds, signingCertificate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentsForSignRequestDTO {\n");
    
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
    sb.append("    signingCertificate: ").append(toIndentedString(signingCertificate)).append("\n");
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
