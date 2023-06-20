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
 * Envelope
 */
@Schema(description = "Envelope")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-19T23:56:47.469723923Z[GMT]")

public class EnvGetDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("data")
  private String data = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("receivedAt")
  private OffsetDateTime receivedAt = null;

  @SerializedName("labels")
  private List<UUID> labels = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("completed")
  private Integer completed = null;

  @SerializedName("chainUuid")
  private UUID chainUuid = null;

  @SerializedName("chainedByMe")
  private Boolean chainedByMe = null;

  @SerializedName("approvalFlowUuid")
  private UUID approvalFlowUuid = null;

  /**
   * Calculated status for mailbox
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

  @SerializedName("sender")
  private EnvelopeSenderDTO sender = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  public EnvGetDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of envelope
   * @return uuid
  **/
  @Schema(description = "UUID of envelope")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public EnvGetDTO data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Envelope XML
   * @return data
  **/
  @Schema(description = "Envelope XML")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public EnvGetDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Envelope creation date
   * @return createdAt
  **/
  @Schema(description = "Envelope creation date")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public EnvGetDTO receivedAt(OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
    return this;
  }

   /**
   * Date of receiving the envelope by the mailbox
   * @return receivedAt
  **/
  @Schema(description = "Date of receiving the envelope by the mailbox")
  public OffsetDateTime getReceivedAt() {
    return receivedAt;
  }

  public void setReceivedAt(OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
  }

  public EnvGetDTO labels(List<UUID> labels) {
    this.labels = labels;
    return this;
  }

  public EnvGetDTO addLabelsItem(UUID labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<UUID>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @Schema(description = "")
  public List<UUID> getLabels() {
    return labels;
  }

  public void setLabels(List<UUID> labels) {
    this.labels = labels;
  }

  public EnvGetDTO total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of participants
   * @return total
  **/
  @Schema(description = "Total number of participants")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public EnvGetDTO completed(Integer completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Number of participants who completed their processing
   * @return completed
  **/
  @Schema(description = "Number of participants who completed their processing")
  public Integer getCompleted() {
    return completed;
  }

  public void setCompleted(Integer completed) {
    this.completed = completed;
  }

  public EnvGetDTO chainUuid(UUID chainUuid) {
    this.chainUuid = chainUuid;
    return this;
  }

   /**
   * Envelope chain UUID
   * @return chainUuid
  **/
  @Schema(description = "Envelope chain UUID")
  public UUID getChainUuid() {
    return chainUuid;
  }

  public void setChainUuid(UUID chainUuid) {
    this.chainUuid = chainUuid;
  }

  public EnvGetDTO chainedByMe(Boolean chainedByMe) {
    this.chainedByMe = chainedByMe;
    return this;
  }

   /**
   * Envelope chained by requested user
   * @return chainedByMe
  **/
  @Schema(description = "Envelope chained by requested user")
  public Boolean isChainedByMe() {
    return chainedByMe;
  }

  public void setChainedByMe(Boolean chainedByMe) {
    this.chainedByMe = chainedByMe;
  }

  public EnvGetDTO approvalFlowUuid(UUID approvalFlowUuid) {
    this.approvalFlowUuid = approvalFlowUuid;
    return this;
  }

   /**
   * Approval flow UUID
   * @return approvalFlowUuid
  **/
  @Schema(description = "Approval flow UUID")
  public UUID getApprovalFlowUuid() {
    return approvalFlowUuid;
  }

  public void setApprovalFlowUuid(UUID approvalFlowUuid) {
    this.approvalFlowUuid = approvalFlowUuid;
  }

  public EnvGetDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Calculated status for mailbox
   * @return status
  **/
  @Schema(description = "Calculated status for mailbox")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public EnvGetDTO sender(EnvelopeSenderDTO sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @Schema(description = "")
  public EnvelopeSenderDTO getSender() {
    return sender;
  }

  public void setSender(EnvelopeSenderDTO sender) {
    this.sender = sender;
  }

  public EnvGetDTO deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Is envelope in recycle bin?
   * @return deleted
  **/
  @Schema(description = "Is envelope in recycle bin?")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvGetDTO envGetDTO = (EnvGetDTO) o;
    return Objects.equals(this.uuid, envGetDTO.uuid) &&
        Objects.equals(this.data, envGetDTO.data) &&
        Objects.equals(this.createdAt, envGetDTO.createdAt) &&
        Objects.equals(this.receivedAt, envGetDTO.receivedAt) &&
        Objects.equals(this.labels, envGetDTO.labels) &&
        Objects.equals(this.total, envGetDTO.total) &&
        Objects.equals(this.completed, envGetDTO.completed) &&
        Objects.equals(this.chainUuid, envGetDTO.chainUuid) &&
        Objects.equals(this.chainedByMe, envGetDTO.chainedByMe) &&
        Objects.equals(this.approvalFlowUuid, envGetDTO.approvalFlowUuid) &&
        Objects.equals(this.status, envGetDTO.status) &&
        Objects.equals(this.sender, envGetDTO.sender) &&
        Objects.equals(this.deleted, envGetDTO.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, data, createdAt, receivedAt, labels, total, completed, chainUuid, chainedByMe, approvalFlowUuid, status, sender, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvGetDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    receivedAt: ").append(toIndentedString(receivedAt)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    chainUuid: ").append(toIndentedString(chainUuid)).append("\n");
    sb.append("    chainedByMe: ").append(toIndentedString(chainedByMe)).append("\n");
    sb.append("    approvalFlowUuid: ").append(toIndentedString(approvalFlowUuid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
