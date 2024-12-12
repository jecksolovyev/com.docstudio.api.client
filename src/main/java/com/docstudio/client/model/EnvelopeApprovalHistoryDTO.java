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
import com.docstudio.client.model.ApproverDetailsDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * EnvelopeApprovalHistoryDTO
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class EnvelopeApprovalHistoryDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("urgent")
  private Boolean urgent = null;

  @SerializedName("completed")
  private Boolean completed = null;

  @SerializedName("mailboxUuid")
  private UUID mailboxUuid = null;

  @SerializedName("approvers")
  private List<ApproverDetailsDTO> approvers = null;

  public EnvelopeApprovalHistoryDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public EnvelopeApprovalHistoryDTO urgent(Boolean urgent) {
    this.urgent = urgent;
    return this;
  }

   /**
   * Get urgent
   * @return urgent
  **/
  @Schema(description = "")
  public Boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(Boolean urgent) {
    this.urgent = urgent;
  }

  public EnvelopeApprovalHistoryDTO completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  @Schema(description = "")
  public Boolean isCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public EnvelopeApprovalHistoryDTO mailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

   /**
   * Get mailboxUuid
   * @return mailboxUuid
  **/
  @Schema(description = "")
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }

  public EnvelopeApprovalHistoryDTO approvers(List<ApproverDetailsDTO> approvers) {
    this.approvers = approvers;
    return this;
  }

  public EnvelopeApprovalHistoryDTO addApproversItem(ApproverDetailsDTO approversItem) {
    if (this.approvers == null) {
      this.approvers = new ArrayList<ApproverDetailsDTO>();
    }
    this.approvers.add(approversItem);
    return this;
  }

   /**
   * Get approvers
   * @return approvers
  **/
  @Schema(description = "")
  public List<ApproverDetailsDTO> getApprovers() {
    return approvers;
  }

  public void setApprovers(List<ApproverDetailsDTO> approvers) {
    this.approvers = approvers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeApprovalHistoryDTO envelopeApprovalHistoryDTO = (EnvelopeApprovalHistoryDTO) o;
    return Objects.equals(this.uuid, envelopeApprovalHistoryDTO.uuid) &&
        Objects.equals(this.urgent, envelopeApprovalHistoryDTO.urgent) &&
        Objects.equals(this.completed, envelopeApprovalHistoryDTO.completed) &&
        Objects.equals(this.mailboxUuid, envelopeApprovalHistoryDTO.mailboxUuid) &&
        Objects.equals(this.approvers, envelopeApprovalHistoryDTO.approvers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, urgent, completed, mailboxUuid, approvers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeApprovalHistoryDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    urgent: ").append(toIndentedString(urgent)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
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
