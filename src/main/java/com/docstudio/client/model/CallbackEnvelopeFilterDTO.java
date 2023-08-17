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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
/**
 * Search parameters for callback envelopes
 */
@Schema(description = "Search parameters for callback envelopes")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class CallbackEnvelopeFilterDTO {
  @SerializedName("label")
  private List<String> label = null;

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
  private List<StatusEnum> status = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("createDateFrom")
  private OffsetDateTime createDateFrom = null;

  @SerializedName("createDateTo")
  private OffsetDateTime createDateTo = null;

  @SerializedName("receiveDateFrom")
  private OffsetDateTime receiveDateFrom = null;

  @SerializedName("receiveDateTo")
  private OffsetDateTime receiveDateTo = null;

  @SerializedName("expireDateFrom")
  private OffsetDateTime expireDateFrom = null;

  @SerializedName("expireDateTo")
  private OffsetDateTime expireDateTo = null;

  @SerializedName("template")
  private List<UUID> template = null;

  @SerializedName("sender")
  private List<UUID> sender = null;

  /**
   * Gets or Sets scope
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    @SerializedName("inbox")
    INBOX("inbox"),
    @SerializedName("outbox")
    OUTBOX("outbox"),
    @SerializedName("draft")
    DRAFT("draft"),
    @SerializedName("shared")
    SHARED("shared");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ScopeEnum fromValue(String input) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ScopeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("scope")
  private List<ScopeEnum> scope = null;

  public CallbackEnvelopeFilterDTO label(List<String> label) {
    this.label = label;
    return this;
  }

  public CallbackEnvelopeFilterDTO addLabelItem(String labelItem) {
    if (this.label == null) {
      this.label = new ArrayList<String>();
    }
    this.label.add(labelItem);
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @Schema(description = "")
  public List<String> getLabel() {
    return label;
  }

  public void setLabel(List<String> label) {
    this.label = label;
  }

  public CallbackEnvelopeFilterDTO status(List<StatusEnum> status) {
    this.status = status;
    return this;
  }

  public CallbackEnvelopeFilterDTO addStatusItem(StatusEnum statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<StatusEnum>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public List<StatusEnum> getStatus() {
    return status;
  }

  public void setStatus(List<StatusEnum> status) {
    this.status = status;
  }

  public CallbackEnvelopeFilterDTO subject(String subject) {
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

  public CallbackEnvelopeFilterDTO createDateFrom(OffsetDateTime createDateFrom) {
    this.createDateFrom = createDateFrom;
    return this;
  }

   /**
   * Creation date from
   * @return createDateFrom
  **/
  @Schema(description = "Creation date from")
  public OffsetDateTime getCreateDateFrom() {
    return createDateFrom;
  }

  public void setCreateDateFrom(OffsetDateTime createDateFrom) {
    this.createDateFrom = createDateFrom;
  }

  public CallbackEnvelopeFilterDTO createDateTo(OffsetDateTime createDateTo) {
    this.createDateTo = createDateTo;
    return this;
  }

   /**
   * Creation date to
   * @return createDateTo
  **/
  @Schema(description = "Creation date to")
  public OffsetDateTime getCreateDateTo() {
    return createDateTo;
  }

  public void setCreateDateTo(OffsetDateTime createDateTo) {
    this.createDateTo = createDateTo;
  }

  public CallbackEnvelopeFilterDTO receiveDateFrom(OffsetDateTime receiveDateFrom) {
    this.receiveDateFrom = receiveDateFrom;
    return this;
  }

   /**
   * Receive date from
   * @return receiveDateFrom
  **/
  @Schema(description = "Receive date from")
  public OffsetDateTime getReceiveDateFrom() {
    return receiveDateFrom;
  }

  public void setReceiveDateFrom(OffsetDateTime receiveDateFrom) {
    this.receiveDateFrom = receiveDateFrom;
  }

  public CallbackEnvelopeFilterDTO receiveDateTo(OffsetDateTime receiveDateTo) {
    this.receiveDateTo = receiveDateTo;
    return this;
  }

   /**
   * Receive date to
   * @return receiveDateTo
  **/
  @Schema(description = "Receive date to")
  public OffsetDateTime getReceiveDateTo() {
    return receiveDateTo;
  }

  public void setReceiveDateTo(OffsetDateTime receiveDateTo) {
    this.receiveDateTo = receiveDateTo;
  }

  public CallbackEnvelopeFilterDTO expireDateFrom(OffsetDateTime expireDateFrom) {
    this.expireDateFrom = expireDateFrom;
    return this;
  }

   /**
   * Expire date from
   * @return expireDateFrom
  **/
  @Schema(description = "Expire date from")
  public OffsetDateTime getExpireDateFrom() {
    return expireDateFrom;
  }

  public void setExpireDateFrom(OffsetDateTime expireDateFrom) {
    this.expireDateFrom = expireDateFrom;
  }

  public CallbackEnvelopeFilterDTO expireDateTo(OffsetDateTime expireDateTo) {
    this.expireDateTo = expireDateTo;
    return this;
  }

   /**
   * Expire date to
   * @return expireDateTo
  **/
  @Schema(description = "Expire date to")
  public OffsetDateTime getExpireDateTo() {
    return expireDateTo;
  }

  public void setExpireDateTo(OffsetDateTime expireDateTo) {
    this.expireDateTo = expireDateTo;
  }

  public CallbackEnvelopeFilterDTO template(List<UUID> template) {
    this.template = template;
    return this;
  }

  public CallbackEnvelopeFilterDTO addTemplateItem(UUID templateItem) {
    if (this.template == null) {
      this.template = new ArrayList<UUID>();
    }
    this.template.add(templateItem);
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @Schema(description = "")
  public List<UUID> getTemplate() {
    return template;
  }

  public void setTemplate(List<UUID> template) {
    this.template = template;
  }

  public CallbackEnvelopeFilterDTO sender(List<UUID> sender) {
    this.sender = sender;
    return this;
  }

  public CallbackEnvelopeFilterDTO addSenderItem(UUID senderItem) {
    if (this.sender == null) {
      this.sender = new ArrayList<UUID>();
    }
    this.sender.add(senderItem);
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @Schema(description = "")
  public List<UUID> getSender() {
    return sender;
  }

  public void setSender(List<UUID> sender) {
    this.sender = sender;
  }

  public CallbackEnvelopeFilterDTO scope(List<ScopeEnum> scope) {
    this.scope = scope;
    return this;
  }

  public CallbackEnvelopeFilterDTO addScopeItem(ScopeEnum scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<ScopeEnum>();
    }
    this.scope.add(scopeItem);
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public List<ScopeEnum> getScope() {
    return scope;
  }

  public void setScope(List<ScopeEnum> scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackEnvelopeFilterDTO callbackEnvelopeFilterDTO = (CallbackEnvelopeFilterDTO) o;
    return Objects.equals(this.label, callbackEnvelopeFilterDTO.label) &&
        Objects.equals(this.status, callbackEnvelopeFilterDTO.status) &&
        Objects.equals(this.subject, callbackEnvelopeFilterDTO.subject) &&
        Objects.equals(this.createDateFrom, callbackEnvelopeFilterDTO.createDateFrom) &&
        Objects.equals(this.createDateTo, callbackEnvelopeFilterDTO.createDateTo) &&
        Objects.equals(this.receiveDateFrom, callbackEnvelopeFilterDTO.receiveDateFrom) &&
        Objects.equals(this.receiveDateTo, callbackEnvelopeFilterDTO.receiveDateTo) &&
        Objects.equals(this.expireDateFrom, callbackEnvelopeFilterDTO.expireDateFrom) &&
        Objects.equals(this.expireDateTo, callbackEnvelopeFilterDTO.expireDateTo) &&
        Objects.equals(this.template, callbackEnvelopeFilterDTO.template) &&
        Objects.equals(this.sender, callbackEnvelopeFilterDTO.sender) &&
        Objects.equals(this.scope, callbackEnvelopeFilterDTO.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, status, subject, createDateFrom, createDateTo, receiveDateFrom, receiveDateTo, expireDateFrom, expireDateTo, template, sender, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackEnvelopeFilterDTO {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    createDateFrom: ").append(toIndentedString(createDateFrom)).append("\n");
    sb.append("    createDateTo: ").append(toIndentedString(createDateTo)).append("\n");
    sb.append("    receiveDateFrom: ").append(toIndentedString(receiveDateFrom)).append("\n");
    sb.append("    receiveDateTo: ").append(toIndentedString(receiveDateTo)).append("\n");
    sb.append("    expireDateFrom: ").append(toIndentedString(expireDateFrom)).append("\n");
    sb.append("    expireDateTo: ").append(toIndentedString(expireDateTo)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
