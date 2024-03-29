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
 * ChainEnvelopeDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class ChainEnvelopeDTO {
  @SerializedName("envelopeUuid")
  private UUID envelopeUuid = null;

  @SerializedName("chainUuid")
  private UUID chainUuid = null;

  @SerializedName("subject")
  private String subject = null;

  /**
   * Envelope status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("DRAFT")
    DRAFT("DRAFT"),
    @SerializedName("SENT")
    SENT("SENT"),
    @SerializedName("WAITING")
    WAITING("WAITING"),
    @SerializedName("COMPLETED")
    COMPLETED("COMPLETED"),
    @SerializedName("CANCELLED")
    CANCELLED("CANCELLED"),
    @SerializedName("EXPIRED")
    EXPIRED("EXPIRED"),
    @SerializedName("ON_APPROVAL")
    ON_APPROVAL("ON_APPROVAL");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("templateName")
  private String templateName = null;

  @SerializedName("receivedAt")
  private OffsetDateTime receivedAt = null;

  public ChainEnvelopeDTO envelopeUuid(UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
    return this;
  }

   /**
   * Envelope UUID
   * @return envelopeUuid
  **/
  @Schema(description = "Envelope UUID")
  public UUID getEnvelopeUuid() {
    return envelopeUuid;
  }

  public void setEnvelopeUuid(UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
  }

  public ChainEnvelopeDTO chainUuid(UUID chainUuid) {
    this.chainUuid = chainUuid;
    return this;
  }

   /**
   * Chain UUID
   * @return chainUuid
  **/
  @Schema(description = "Chain UUID")
  public UUID getChainUuid() {
    return chainUuid;
  }

  public void setChainUuid(UUID chainUuid) {
    this.chainUuid = chainUuid;
  }

  public ChainEnvelopeDTO subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Envelope subject
   * @return subject
  **/
  @Schema(description = "Envelope subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public ChainEnvelopeDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Envelope status
   * @return status
  **/
  @Schema(description = "Envelope status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ChainEnvelopeDTO templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Envelope template name
   * @return templateName
  **/
  @Schema(description = "Envelope template name")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public ChainEnvelopeDTO receivedAt(OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
    return this;
  }

   /**
   * Envelope receive date
   * @return receivedAt
  **/
  @Schema(description = "Envelope receive date")
  public OffsetDateTime getReceivedAt() {
    return receivedAt;
  }

  public void setReceivedAt(OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChainEnvelopeDTO chainEnvelopeDTO = (ChainEnvelopeDTO) o;
    return Objects.equals(this.envelopeUuid, chainEnvelopeDTO.envelopeUuid) &&
        Objects.equals(this.chainUuid, chainEnvelopeDTO.chainUuid) &&
        Objects.equals(this.subject, chainEnvelopeDTO.subject) &&
        Objects.equals(this.status, chainEnvelopeDTO.status) &&
        Objects.equals(this.templateName, chainEnvelopeDTO.templateName) &&
        Objects.equals(this.receivedAt, chainEnvelopeDTO.receivedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeUuid, chainUuid, subject, status, templateName, receivedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChainEnvelopeDTO {\n");
    
    sb.append("    envelopeUuid: ").append(toIndentedString(envelopeUuid)).append("\n");
    sb.append("    chainUuid: ").append(toIndentedString(chainUuid)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    receivedAt: ").append(toIndentedString(receivedAt)).append("\n");
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
