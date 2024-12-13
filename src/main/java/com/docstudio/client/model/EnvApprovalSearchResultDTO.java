/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R120.9
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import com.docstudio.client.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;

/**
 * Data records
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class EnvApprovalSearchResultDTO {
  public static final String SERIALIZED_NAME_ENVELOPE_UUID = "envelopeUuid";
  @SerializedName(SERIALIZED_NAME_ENVELOPE_UUID)
  @javax.annotation.Nullable
  private UUID envelopeUuid;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  @javax.annotation.Nullable
  private String subject;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_MAILBOX_U_U_I_D = "mailboxUUID";
  @SerializedName(SERIALIZED_NAME_MAILBOX_U_U_I_D)
  @javax.annotation.Nullable
  private UUID mailboxUUID;

  public static final String SERIALIZED_NAME_ACCOUNT_UUID = "accountUuid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_UUID)
  @javax.annotation.Nullable
  private UUID accountUuid;

  public static final String SERIALIZED_NAME_MAILBOX_NAME = "mailboxName";
  @SerializedName(SERIALIZED_NAME_MAILBOX_NAME)
  @javax.annotation.Nullable
  private String mailboxName;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nullable
  private Integer total;

  public static final String SERIALIZED_NAME_COMPLETED = "completed";
  @SerializedName(SERIALIZED_NAME_COMPLETED)
  @javax.annotation.Nullable
  private Integer completed;

  public static final String SERIALIZED_NAME_TEMPLATE_UUID = "templateUuid";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_UUID)
  @javax.annotation.Nullable
  private UUID templateUuid;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "templateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  @javax.annotation.Nullable
  private String templateName;

  public static final String SERIALIZED_NAME_SEEN_AT = "seenAt";
  @SerializedName(SERIALIZED_NAME_SEEN_AT)
  @javax.annotation.Nullable
  private OffsetDateTime seenAt;

  public static final String SERIALIZED_NAME_EXPIRED_AFTER = "expiredAfter";
  @SerializedName(SERIALIZED_NAME_EXPIRED_AFTER)
  @javax.annotation.Nullable
  private OffsetDateTime expiredAfter;

  public static final String SERIALIZED_NAME_APPROVAL_FLOW_UUID = "approvalFlowUuid";
  @SerializedName(SERIALIZED_NAME_APPROVAL_FLOW_UUID)
  @javax.annotation.Nullable
  private UUID approvalFlowUuid;

  public static final String SERIALIZED_NAME_URGENT = "urgent";
  @SerializedName(SERIALIZED_NAME_URGENT)
  @javax.annotation.Nullable
  private Boolean urgent;

  public EnvApprovalSearchResultDTO() {
  }

  public EnvApprovalSearchResultDTO envelopeUuid(@javax.annotation.Nullable UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
    return this;
  }

  /**
   * The envelope UUID
   * @return envelopeUuid
   */
  @javax.annotation.Nullable
  public UUID getEnvelopeUuid() {
    return envelopeUuid;
  }

  public void setEnvelopeUuid(@javax.annotation.Nullable UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
  }


  public EnvApprovalSearchResultDTO subject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * The envelope subject
   * @return subject
   */
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
  }


  public EnvApprovalSearchResultDTO message(@javax.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * The envelope message
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }


  public EnvApprovalSearchResultDTO createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date the approval was created
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EnvApprovalSearchResultDTO status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of approval
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public EnvApprovalSearchResultDTO mailboxUUID(@javax.annotation.Nullable UUID mailboxUUID) {
    this.mailboxUUID = mailboxUUID;
    return this;
  }

  /**
   * Mailbox UUID of approval initiator
   * @return mailboxUUID
   */
  @javax.annotation.Nullable
  public UUID getMailboxUUID() {
    return mailboxUUID;
  }

  public void setMailboxUUID(@javax.annotation.Nullable UUID mailboxUUID) {
    this.mailboxUUID = mailboxUUID;
  }


  public EnvApprovalSearchResultDTO accountUuid(@javax.annotation.Nullable UUID accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

  /**
   * Mailbox account UUID of approval initiator
   * @return accountUuid
   */
  @javax.annotation.Nullable
  public UUID getAccountUuid() {
    return accountUuid;
  }

  public void setAccountUuid(@javax.annotation.Nullable UUID accountUuid) {
    this.accountUuid = accountUuid;
  }


  public EnvApprovalSearchResultDTO mailboxName(@javax.annotation.Nullable String mailboxName) {
    this.mailboxName = mailboxName;
    return this;
  }

  /**
   * Mailbox name of approval initiator
   * @return mailboxName
   */
  @javax.annotation.Nullable
  public String getMailboxName() {
    return mailboxName;
  }

  public void setMailboxName(@javax.annotation.Nullable String mailboxName) {
    this.mailboxName = mailboxName;
  }


  public EnvApprovalSearchResultDTO total(@javax.annotation.Nullable Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of participants
   * @return total
   */
  @javax.annotation.Nullable
  public Integer getTotal() {
    return total;
  }

  public void setTotal(@javax.annotation.Nullable Integer total) {
    this.total = total;
  }


  public EnvApprovalSearchResultDTO completed(@javax.annotation.Nullable Integer completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Number of participants processed
   * @return completed
   */
  @javax.annotation.Nullable
  public Integer getCompleted() {
    return completed;
  }

  public void setCompleted(@javax.annotation.Nullable Integer completed) {
    this.completed = completed;
  }


  public EnvApprovalSearchResultDTO templateUuid(@javax.annotation.Nullable UUID templateUuid) {
    this.templateUuid = templateUuid;
    return this;
  }

  /**
   * Envelope template UUID
   * @return templateUuid
   */
  @javax.annotation.Nullable
  public UUID getTemplateUuid() {
    return templateUuid;
  }

  public void setTemplateUuid(@javax.annotation.Nullable UUID templateUuid) {
    this.templateUuid = templateUuid;
  }


  public EnvApprovalSearchResultDTO templateName(@javax.annotation.Nullable String templateName) {
    this.templateName = templateName;
    return this;
  }

  /**
   * Envelope template name
   * @return templateName
   */
  @javax.annotation.Nullable
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(@javax.annotation.Nullable String templateName) {
    this.templateName = templateName;
  }


  public EnvApprovalSearchResultDTO seenAt(@javax.annotation.Nullable OffsetDateTime seenAt) {
    this.seenAt = seenAt;
    return this;
  }

  /**
   * Date-time it was seen by approver
   * @return seenAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSeenAt() {
    return seenAt;
  }

  public void setSeenAt(@javax.annotation.Nullable OffsetDateTime seenAt) {
    this.seenAt = seenAt;
  }


  public EnvApprovalSearchResultDTO expiredAfter(@javax.annotation.Nullable OffsetDateTime expiredAfter) {
    this.expiredAfter = expiredAfter;
    return this;
  }

  /**
   * The date the envelope will be expired
   * @return expiredAfter
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpiredAfter() {
    return expiredAfter;
  }

  public void setExpiredAfter(@javax.annotation.Nullable OffsetDateTime expiredAfter) {
    this.expiredAfter = expiredAfter;
  }


  public EnvApprovalSearchResultDTO approvalFlowUuid(@javax.annotation.Nullable UUID approvalFlowUuid) {
    this.approvalFlowUuid = approvalFlowUuid;
    return this;
  }

  /**
   * UUID of approval flow
   * @return approvalFlowUuid
   */
  @javax.annotation.Nullable
  public UUID getApprovalFlowUuid() {
    return approvalFlowUuid;
  }

  public void setApprovalFlowUuid(@javax.annotation.Nullable UUID approvalFlowUuid) {
    this.approvalFlowUuid = approvalFlowUuid;
  }


  public EnvApprovalSearchResultDTO urgent(@javax.annotation.Nullable Boolean urgent) {
    this.urgent = urgent;
    return this;
  }

  /**
   * Is approval flow urgent?
   * @return urgent
   */
  @javax.annotation.Nullable
  public Boolean getUrgent() {
    return urgent;
  }

  public void setUrgent(@javax.annotation.Nullable Boolean urgent) {
    this.urgent = urgent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvApprovalSearchResultDTO envApprovalSearchResultDTO = (EnvApprovalSearchResultDTO) o;
    return Objects.equals(this.envelopeUuid, envApprovalSearchResultDTO.envelopeUuid) &&
        Objects.equals(this.subject, envApprovalSearchResultDTO.subject) &&
        Objects.equals(this.message, envApprovalSearchResultDTO.message) &&
        Objects.equals(this.createdAt, envApprovalSearchResultDTO.createdAt) &&
        Objects.equals(this.status, envApprovalSearchResultDTO.status) &&
        Objects.equals(this.mailboxUUID, envApprovalSearchResultDTO.mailboxUUID) &&
        Objects.equals(this.accountUuid, envApprovalSearchResultDTO.accountUuid) &&
        Objects.equals(this.mailboxName, envApprovalSearchResultDTO.mailboxName) &&
        Objects.equals(this.total, envApprovalSearchResultDTO.total) &&
        Objects.equals(this.completed, envApprovalSearchResultDTO.completed) &&
        Objects.equals(this.templateUuid, envApprovalSearchResultDTO.templateUuid) &&
        Objects.equals(this.templateName, envApprovalSearchResultDTO.templateName) &&
        Objects.equals(this.seenAt, envApprovalSearchResultDTO.seenAt) &&
        Objects.equals(this.expiredAfter, envApprovalSearchResultDTO.expiredAfter) &&
        Objects.equals(this.approvalFlowUuid, envApprovalSearchResultDTO.approvalFlowUuid) &&
        Objects.equals(this.urgent, envApprovalSearchResultDTO.urgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeUuid, subject, message, createdAt, status, mailboxUUID, accountUuid, mailboxName, total, completed, templateUuid, templateName, seenAt, expiredAfter, approvalFlowUuid, urgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvApprovalSearchResultDTO {\n");
    sb.append("    envelopeUuid: ").append(toIndentedString(envelopeUuid)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mailboxUUID: ").append(toIndentedString(mailboxUUID)).append("\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
    sb.append("    mailboxName: ").append(toIndentedString(mailboxName)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    templateUuid: ").append(toIndentedString(templateUuid)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    seenAt: ").append(toIndentedString(seenAt)).append("\n");
    sb.append("    expiredAfter: ").append(toIndentedString(expiredAfter)).append("\n");
    sb.append("    approvalFlowUuid: ").append(toIndentedString(approvalFlowUuid)).append("\n");
    sb.append("    urgent: ").append(toIndentedString(urgent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("envelopeUuid");
    openapiFields.add("subject");
    openapiFields.add("message");
    openapiFields.add("createdAt");
    openapiFields.add("status");
    openapiFields.add("mailboxUUID");
    openapiFields.add("accountUuid");
    openapiFields.add("mailboxName");
    openapiFields.add("total");
    openapiFields.add("completed");
    openapiFields.add("templateUuid");
    openapiFields.add("templateName");
    openapiFields.add("seenAt");
    openapiFields.add("expiredAfter");
    openapiFields.add("approvalFlowUuid");
    openapiFields.add("urgent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvApprovalSearchResultDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvApprovalSearchResultDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvApprovalSearchResultDTO is not found in the empty JSON string", EnvApprovalSearchResultDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvApprovalSearchResultDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvApprovalSearchResultDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("envelopeUuid") != null && !jsonObj.get("envelopeUuid").isJsonNull()) && !jsonObj.get("envelopeUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `envelopeUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("envelopeUuid").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("mailboxUUID") != null && !jsonObj.get("mailboxUUID").isJsonNull()) && !jsonObj.get("mailboxUUID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxUUID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxUUID").toString()));
      }
      if ((jsonObj.get("accountUuid") != null && !jsonObj.get("accountUuid").isJsonNull()) && !jsonObj.get("accountUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountUuid").toString()));
      }
      if ((jsonObj.get("mailboxName") != null && !jsonObj.get("mailboxName").isJsonNull()) && !jsonObj.get("mailboxName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxName").toString()));
      }
      if ((jsonObj.get("templateUuid") != null && !jsonObj.get("templateUuid").isJsonNull()) && !jsonObj.get("templateUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateUuid").toString()));
      }
      if ((jsonObj.get("templateName") != null && !jsonObj.get("templateName").isJsonNull()) && !jsonObj.get("templateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateName").toString()));
      }
      if ((jsonObj.get("approvalFlowUuid") != null && !jsonObj.get("approvalFlowUuid").isJsonNull()) && !jsonObj.get("approvalFlowUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvalFlowUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approvalFlowUuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvApprovalSearchResultDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvApprovalSearchResultDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvApprovalSearchResultDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvApprovalSearchResultDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvApprovalSearchResultDTO>() {
           @Override
           public void write(JsonWriter out, EnvApprovalSearchResultDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvApprovalSearchResultDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnvApprovalSearchResultDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvApprovalSearchResultDTO
   * @throws IOException if the JSON string is invalid with respect to EnvApprovalSearchResultDTO
   */
  public static EnvApprovalSearchResultDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvApprovalSearchResultDTO.class);
  }

  /**
   * Convert an instance of EnvApprovalSearchResultDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

