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
/**
 * Data records
 */
@Schema(description = "Data records")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-19T23:56:47.469723923Z[GMT]")

public class MailboxApprovalFlowGetDTO {
  @SerializedName("sharedForAccount")
  private Boolean sharedForAccount = null;

  @SerializedName("sharedForMailboxes")
  private List<MailboxNameUuidDTO> sharedForMailboxes = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets flowType
   */
  @JsonAdapter(FlowTypeEnum.Adapter.class)
  public enum FlowTypeEnum {
    @SerializedName("auto")
    AUTO("auto"),
    @SerializedName("manual")
    MANUAL("manual");

    private String value;

    FlowTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FlowTypeEnum fromValue(String input) {
      for (FlowTypeEnum b : FlowTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FlowTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FlowTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FlowTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FlowTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("flowType")
  private FlowTypeEnum flowType = null;

  @SerializedName("approvers")
  private List<EnvelopeApproverGetDTO> approvers = new ArrayList<EnvelopeApproverGetDTO>();

  @SerializedName("uuid")
  private UUID uuid = null;

  public MailboxApprovalFlowGetDTO sharedForAccount(Boolean sharedForAccount) {
    this.sharedForAccount = sharedForAccount;
    return this;
  }

   /**
   * Get sharedForAccount
   * @return sharedForAccount
  **/
  @Schema(description = "")
  public Boolean isSharedForAccount() {
    return sharedForAccount;
  }

  public void setSharedForAccount(Boolean sharedForAccount) {
    this.sharedForAccount = sharedForAccount;
  }

  public MailboxApprovalFlowGetDTO sharedForMailboxes(List<MailboxNameUuidDTO> sharedForMailboxes) {
    this.sharedForMailboxes = sharedForMailboxes;
    return this;
  }

  public MailboxApprovalFlowGetDTO addSharedForMailboxesItem(MailboxNameUuidDTO sharedForMailboxesItem) {
    if (this.sharedForMailboxes == null) {
      this.sharedForMailboxes = new ArrayList<MailboxNameUuidDTO>();
    }
    this.sharedForMailboxes.add(sharedForMailboxesItem);
    return this;
  }

   /**
   * Get sharedForMailboxes
   * @return sharedForMailboxes
  **/
  @Schema(description = "")
  public List<MailboxNameUuidDTO> getSharedForMailboxes() {
    return sharedForMailboxes;
  }

  public void setSharedForMailboxes(List<MailboxNameUuidDTO> sharedForMailboxes) {
    this.sharedForMailboxes = sharedForMailboxes;
  }

  public MailboxApprovalFlowGetDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MailboxApprovalFlowGetDTO flowType(FlowTypeEnum flowType) {
    this.flowType = flowType;
    return this;
  }

   /**
   * Get flowType
   * @return flowType
  **/
  @Schema(required = true, description = "")
  public FlowTypeEnum getFlowType() {
    return flowType;
  }

  public void setFlowType(FlowTypeEnum flowType) {
    this.flowType = flowType;
  }

  public MailboxApprovalFlowGetDTO approvers(List<EnvelopeApproverGetDTO> approvers) {
    this.approvers = approvers;
    return this;
  }

  public MailboxApprovalFlowGetDTO addApproversItem(EnvelopeApproverGetDTO approversItem) {
    this.approvers.add(approversItem);
    return this;
  }

   /**
   * Get approvers
   * @return approvers
  **/
  @Schema(required = true, description = "")
  public List<EnvelopeApproverGetDTO> getApprovers() {
    return approvers;
  }

  public void setApprovers(List<EnvelopeApproverGetDTO> approvers) {
    this.approvers = approvers;
  }

  public MailboxApprovalFlowGetDTO uuid(UUID uuid) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailboxApprovalFlowGetDTO mailboxApprovalFlowGetDTO = (MailboxApprovalFlowGetDTO) o;
    return Objects.equals(this.sharedForAccount, mailboxApprovalFlowGetDTO.sharedForAccount) &&
        Objects.equals(this.sharedForMailboxes, mailboxApprovalFlowGetDTO.sharedForMailboxes) &&
        Objects.equals(this.name, mailboxApprovalFlowGetDTO.name) &&
        Objects.equals(this.flowType, mailboxApprovalFlowGetDTO.flowType) &&
        Objects.equals(this.approvers, mailboxApprovalFlowGetDTO.approvers) &&
        Objects.equals(this.uuid, mailboxApprovalFlowGetDTO.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedForAccount, sharedForMailboxes, name, flowType, approvers, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailboxApprovalFlowGetDTO {\n");
    
    sb.append("    sharedForAccount: ").append(toIndentedString(sharedForAccount)).append("\n");
    sb.append("    sharedForMailboxes: ").append(toIndentedString(sharedForMailboxes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    flowType: ").append(toIndentedString(flowType)).append("\n");
    sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
