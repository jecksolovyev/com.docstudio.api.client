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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
/**
 * StampRequestDTO
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class StampRequestDTO {
  @SerializedName("certificate")
  private byte[] certificate = null;

  @SerializedName("envelopeUuid")
  private UUID envelopeUuid = null;

  @SerializedName("signingDate")
  private OffsetDateTime signingDate = null;

  public StampRequestDTO certificate(byte[] certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @Schema(required = true, description = "")
  public byte[] getCertificate() {
    return certificate;
  }

  public void setCertificate(byte[] certificate) {
    this.certificate = certificate;
  }

  public StampRequestDTO envelopeUuid(UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
    return this;
  }

   /**
   * Envelope UUID in order to detect language
   * @return envelopeUuid
  **/
  @Schema(required = true, description = "Envelope UUID in order to detect language")
  public UUID getEnvelopeUuid() {
    return envelopeUuid;
  }

  public void setEnvelopeUuid(UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
  }

  public StampRequestDTO signingDate(OffsetDateTime signingDate) {
    this.signingDate = signingDate;
    return this;
  }

   /**
   * Signing date
   * @return signingDate
  **/
  @Schema(description = "Signing date")
  public OffsetDateTime getSigningDate() {
    return signingDate;
  }

  public void setSigningDate(OffsetDateTime signingDate) {
    this.signingDate = signingDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StampRequestDTO stampRequestDTO = (StampRequestDTO) o;
    return Arrays.equals(this.certificate, stampRequestDTO.certificate) &&
        Objects.equals(this.envelopeUuid, stampRequestDTO.envelopeUuid) &&
        Objects.equals(this.signingDate, stampRequestDTO.signingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(certificate), envelopeUuid, signingDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StampRequestDTO {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    envelopeUuid: ").append(toIndentedString(envelopeUuid)).append("\n");
    sb.append("    signingDate: ").append(toIndentedString(signingDate)).append("\n");
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
