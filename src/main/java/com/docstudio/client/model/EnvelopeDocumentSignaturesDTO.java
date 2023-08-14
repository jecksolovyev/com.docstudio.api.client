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
 * EnvelopeDocumentSignaturesDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-14T22:02:04.375144579Z[GMT]")

public class EnvelopeDocumentSignaturesDTO {
  @SerializedName("documentId")
  private String documentId = null;

  @SerializedName("signatureName")
  private String signatureName = null;

  @SerializedName("signatures")
  private List<EnvelopeDocumentSignatureDTO> signatures = new ArrayList<EnvelopeDocumentSignatureDTO>();

  public EnvelopeDocumentSignaturesDTO documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Envelope document uuid
   * @return documentId
  **/
  @Schema(required = true, description = "Envelope document uuid")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public EnvelopeDocumentSignaturesDTO signatureName(String signatureName) {
    this.signatureName = signatureName;
    return this;
  }

   /**
   * Envelope document signature name
   * @return signatureName
  **/
  @Schema(required = true, description = "Envelope document signature name")
  public String getSignatureName() {
    return signatureName;
  }

  public void setSignatureName(String signatureName) {
    this.signatureName = signatureName;
  }

  public EnvelopeDocumentSignaturesDTO signatures(List<EnvelopeDocumentSignatureDTO> signatures) {
    this.signatures = signatures;
    return this;
  }

  public EnvelopeDocumentSignaturesDTO addSignaturesItem(EnvelopeDocumentSignatureDTO signaturesItem) {
    this.signatures.add(signaturesItem);
    return this;
  }

   /**
   * Document signatures
   * @return signatures
  **/
  @Schema(required = true, description = "Document signatures")
  public List<EnvelopeDocumentSignatureDTO> getSignatures() {
    return signatures;
  }

  public void setSignatures(List<EnvelopeDocumentSignatureDTO> signatures) {
    this.signatures = signatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeDocumentSignaturesDTO envelopeDocumentSignaturesDTO = (EnvelopeDocumentSignaturesDTO) o;
    return Objects.equals(this.documentId, envelopeDocumentSignaturesDTO.documentId) &&
        Objects.equals(this.signatureName, envelopeDocumentSignaturesDTO.signatureName) &&
        Objects.equals(this.signatures, envelopeDocumentSignaturesDTO.signatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, signatureName, signatures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDocumentSignaturesDTO {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
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
