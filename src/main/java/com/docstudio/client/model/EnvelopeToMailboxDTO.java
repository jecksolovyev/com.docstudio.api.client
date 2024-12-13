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
import com.google.gson.annotations.JsonAdapter;
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
public class EnvelopeToMailboxDTO {
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

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  @javax.annotation.Nullable
  private Boolean archived;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  @javax.annotation.Nullable
  private Boolean deleted;

  public static final String SERIALIZED_NAME_SHARED = "shared";
  @SerializedName(SERIALIZED_NAME_SHARED)
  @javax.annotation.Nullable
  private Boolean shared;

  public static final String SERIALIZED_NAME_SENT_BY_ME = "sentByMe";
  @SerializedName(SERIALIZED_NAME_SENT_BY_ME)
  @javax.annotation.Nullable
  private Boolean sentByMe;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_RECEIVED_AT = "receivedAt";
  @SerializedName(SERIALIZED_NAME_RECEIVED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime receivedAt;

  public static final String SERIALIZED_NAME_SENT_AT = "sentAt";
  @SerializedName(SERIALIZED_NAME_SENT_AT)
  @javax.annotation.Nullable
  private OffsetDateTime sentAt;

  public static final String SERIALIZED_NAME_SEEN_AT = "seenAt";
  @SerializedName(SERIALIZED_NAME_SEEN_AT)
  @javax.annotation.Nullable
  private OffsetDateTime seenAt;

  public static final String SERIALIZED_NAME_EXPIRED_AFTER = "expiredAfter";
  @SerializedName(SERIALIZED_NAME_EXPIRED_AFTER)
  @javax.annotation.Nullable
  private OffsetDateTime expiredAfter;

  public static final String SERIALIZED_NAME_SHARING_FORBIDDEN = "sharingForbidden";
  @SerializedName(SERIALIZED_NAME_SHARING_FORBIDDEN)
  @javax.annotation.Nullable
  private Boolean sharingForbidden;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFT("DRAFT"),

    SENT("SENT"),

    WAITING("WAITING"),

    COMPLETED("COMPLETED"),

    CANCELLED("CANCELLED"),

    EXPIRED("EXPIRED"),

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

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ACCOUNT_U_U_I_D = "accountUUID";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_U_U_I_D)
  @javax.annotation.Nullable
  private UUID accountUUID;

  public static final String SERIALIZED_NAME_MAILBOX_U_U_I_D = "mailboxUUID";
  @SerializedName(SERIALIZED_NAME_MAILBOX_U_U_I_D)
  @javax.annotation.Nullable
  private UUID mailboxUUID;

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

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  @javax.annotation.Nullable
  private List<UUID> labels = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEMPLATE_UUID = "templateUuid";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_UUID)
  @javax.annotation.Nullable
  private UUID templateUuid;

  public static final String SERIALIZED_NAME_TEMPLATE_VERSION = "templateVersion";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_VERSION)
  @javax.annotation.Nullable
  private UUID templateVersion;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "templateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  @javax.annotation.Nullable
  private String templateName;

  public static final String SERIALIZED_NAME_INVITATION_CODE = "invitationCode";
  @SerializedName(SERIALIZED_NAME_INVITATION_CODE)
  @javax.annotation.Nullable
  private String invitationCode;

  public static final String SERIALIZED_NAME_CHAIN_UUID = "chainUuid";
  @SerializedName(SERIALIZED_NAME_CHAIN_UUID)
  @javax.annotation.Nullable
  private UUID chainUuid;

  public static final String SERIALIZED_NAME_CHAINED_BY_ME = "chainedByMe";
  @SerializedName(SERIALIZED_NAME_CHAINED_BY_ME)
  @javax.annotation.Nullable
  private Boolean chainedByMe;

  public static final String SERIALIZED_NAME_EXTRA_FIELDS = "extraFields";
  @SerializedName(SERIALIZED_NAME_EXTRA_FIELDS)
  @javax.annotation.Nullable
  private List<EnvelopeExtraFieldDTO> extraFields = new ArrayList<>();

  public EnvelopeToMailboxDTO() {
  }

  public EnvelopeToMailboxDTO envelopeUuid(@javax.annotation.Nullable UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
    return this;
  }

  /**
   * Get envelopeUuid
   * @return envelopeUuid
   */
  @javax.annotation.Nullable
  public UUID getEnvelopeUuid() {
    return envelopeUuid;
  }

  public void setEnvelopeUuid(@javax.annotation.Nullable UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
  }


  public EnvelopeToMailboxDTO subject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Subject of the envelope
   * @return subject
   */
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
  }


  public EnvelopeToMailboxDTO message(@javax.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Message of the envelope
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }


  public EnvelopeToMailboxDTO archived(@javax.annotation.Nullable Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Is envelope archived?
   * @return archived
   */
  @javax.annotation.Nullable
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(@javax.annotation.Nullable Boolean archived) {
    this.archived = archived;
  }


  public EnvelopeToMailboxDTO deleted(@javax.annotation.Nullable Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Is envelope in recycle bin?
   * @return deleted
   */
  @javax.annotation.Nullable
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(@javax.annotation.Nullable Boolean deleted) {
    this.deleted = deleted;
  }


  public EnvelopeToMailboxDTO shared(@javax.annotation.Nullable Boolean shared) {
    this.shared = shared;
    return this;
  }

  /**
   * Is envelope shared to the mailbox? (if the mailbox is not in the main flow)
   * @return shared
   */
  @javax.annotation.Nullable
  public Boolean getShared() {
    return shared;
  }

  public void setShared(@javax.annotation.Nullable Boolean shared) {
    this.shared = shared;
  }


  public EnvelopeToMailboxDTO sentByMe(@javax.annotation.Nullable Boolean sentByMe) {
    this.sentByMe = sentByMe;
    return this;
  }

  /**
   * Flag meaning &#39;outbox&#39;. Probably not necessary on UI
   * @return sentByMe
   */
  @javax.annotation.Nullable
  public Boolean getSentByMe() {
    return sentByMe;
  }

  public void setSentByMe(@javax.annotation.Nullable Boolean sentByMe) {
    this.sentByMe = sentByMe;
  }


  public EnvelopeToMailboxDTO createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Envelope creation date
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EnvelopeToMailboxDTO receivedAt(@javax.annotation.Nullable OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
    return this;
  }

  /**
   * Date of receiving the envelope by the mailbox
   * @return receivedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReceivedAt() {
    return receivedAt;
  }

  public void setReceivedAt(@javax.annotation.Nullable OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
  }


  public EnvelopeToMailboxDTO sentAt(@javax.annotation.Nullable OffsetDateTime sentAt) {
    this.sentAt = sentAt;
    return this;
  }

  /**
   * The envelope sending date
   * @return sentAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSentAt() {
    return sentAt;
  }

  public void setSentAt(@javax.annotation.Nullable OffsetDateTime sentAt) {
    this.sentAt = sentAt;
  }


  public EnvelopeToMailboxDTO seenAt(@javax.annotation.Nullable OffsetDateTime seenAt) {
    this.seenAt = seenAt;
    return this;
  }

  /**
   * Date-time it was seen by receiver
   * @return seenAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSeenAt() {
    return seenAt;
  }

  public void setSeenAt(@javax.annotation.Nullable OffsetDateTime seenAt) {
    this.seenAt = seenAt;
  }


  public EnvelopeToMailboxDTO expiredAfter(@javax.annotation.Nullable OffsetDateTime expiredAfter) {
    this.expiredAfter = expiredAfter;
    return this;
  }

  /**
   * Get expiredAfter
   * @return expiredAfter
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpiredAfter() {
    return expiredAfter;
  }

  public void setExpiredAfter(@javax.annotation.Nullable OffsetDateTime expiredAfter) {
    this.expiredAfter = expiredAfter;
  }


  public EnvelopeToMailboxDTO sharingForbidden(@javax.annotation.Nullable Boolean sharingForbidden) {
    this.sharingForbidden = sharingForbidden;
    return this;
  }

  /**
   * Sharing by email is forbidden
   * @return sharingForbidden
   */
  @javax.annotation.Nullable
  public Boolean getSharingForbidden() {
    return sharingForbidden;
  }

  public void setSharingForbidden(@javax.annotation.Nullable Boolean sharingForbidden) {
    this.sharingForbidden = sharingForbidden;
  }


  public EnvelopeToMailboxDTO status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public EnvelopeToMailboxDTO accountUUID(@javax.annotation.Nullable UUID accountUUID) {
    this.accountUUID = accountUUID;
    return this;
  }

  /**
   * Sender account UUID
   * @return accountUUID
   */
  @javax.annotation.Nullable
  public UUID getAccountUUID() {
    return accountUUID;
  }

  public void setAccountUUID(@javax.annotation.Nullable UUID accountUUID) {
    this.accountUUID = accountUUID;
  }


  public EnvelopeToMailboxDTO mailboxUUID(@javax.annotation.Nullable UUID mailboxUUID) {
    this.mailboxUUID = mailboxUUID;
    return this;
  }

  /**
   * UUID of sender
   * @return mailboxUUID
   */
  @javax.annotation.Nullable
  public UUID getMailboxUUID() {
    return mailboxUUID;
  }

  public void setMailboxUUID(@javax.annotation.Nullable UUID mailboxUUID) {
    this.mailboxUUID = mailboxUUID;
  }


  public EnvelopeToMailboxDTO mailboxName(@javax.annotation.Nullable String mailboxName) {
    this.mailboxName = mailboxName;
    return this;
  }

  /**
   * Mailbox name of sender
   * @return mailboxName
   */
  @javax.annotation.Nullable
  public String getMailboxName() {
    return mailboxName;
  }

  public void setMailboxName(@javax.annotation.Nullable String mailboxName) {
    this.mailboxName = mailboxName;
  }


  public EnvelopeToMailboxDTO total(@javax.annotation.Nullable Integer total) {
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


  public EnvelopeToMailboxDTO completed(@javax.annotation.Nullable Integer completed) {
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


  public EnvelopeToMailboxDTO labels(@javax.annotation.Nullable List<UUID> labels) {
    this.labels = labels;
    return this;
  }

  public EnvelopeToMailboxDTO addLabelsItem(UUID labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @javax.annotation.Nullable
  public List<UUID> getLabels() {
    return labels;
  }

  public void setLabels(@javax.annotation.Nullable List<UUID> labels) {
    this.labels = labels;
  }


  public EnvelopeToMailboxDTO templateUuid(@javax.annotation.Nullable UUID templateUuid) {
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


  public EnvelopeToMailboxDTO templateVersion(@javax.annotation.Nullable UUID templateVersion) {
    this.templateVersion = templateVersion;
    return this;
  }

  /**
   * Envelope template version
   * @return templateVersion
   */
  @javax.annotation.Nullable
  public UUID getTemplateVersion() {
    return templateVersion;
  }

  public void setTemplateVersion(@javax.annotation.Nullable UUID templateVersion) {
    this.templateVersion = templateVersion;
  }


  public EnvelopeToMailboxDTO templateName(@javax.annotation.Nullable String templateName) {
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


  public EnvelopeToMailboxDTO invitationCode(@javax.annotation.Nullable String invitationCode) {
    this.invitationCode = invitationCode;
    return this;
  }

  /**
   * Invitation code, if acceptable
   * @return invitationCode
   */
  @javax.annotation.Nullable
  public String getInvitationCode() {
    return invitationCode;
  }

  public void setInvitationCode(@javax.annotation.Nullable String invitationCode) {
    this.invitationCode = invitationCode;
  }


  public EnvelopeToMailboxDTO chainUuid(@javax.annotation.Nullable UUID chainUuid) {
    this.chainUuid = chainUuid;
    return this;
  }

  /**
   * Envelope chain UUID
   * @return chainUuid
   */
  @javax.annotation.Nullable
  public UUID getChainUuid() {
    return chainUuid;
  }

  public void setChainUuid(@javax.annotation.Nullable UUID chainUuid) {
    this.chainUuid = chainUuid;
  }


  public EnvelopeToMailboxDTO chainedByMe(@javax.annotation.Nullable Boolean chainedByMe) {
    this.chainedByMe = chainedByMe;
    return this;
  }

  /**
   * Envelope chained by requested user
   * @return chainedByMe
   */
  @javax.annotation.Nullable
  public Boolean getChainedByMe() {
    return chainedByMe;
  }

  public void setChainedByMe(@javax.annotation.Nullable Boolean chainedByMe) {
    this.chainedByMe = chainedByMe;
  }


  public EnvelopeToMailboxDTO extraFields(@javax.annotation.Nullable List<EnvelopeExtraFieldDTO> extraFields) {
    this.extraFields = extraFields;
    return this;
  }

  public EnvelopeToMailboxDTO addExtraFieldsItem(EnvelopeExtraFieldDTO extraFieldsItem) {
    if (this.extraFields == null) {
      this.extraFields = new ArrayList<>();
    }
    this.extraFields.add(extraFieldsItem);
    return this;
  }

  /**
   * Data for extra columns
   * @return extraFields
   */
  @javax.annotation.Nullable
  public List<EnvelopeExtraFieldDTO> getExtraFields() {
    return extraFields;
  }

  public void setExtraFields(@javax.annotation.Nullable List<EnvelopeExtraFieldDTO> extraFields) {
    this.extraFields = extraFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeToMailboxDTO envelopeToMailboxDTO = (EnvelopeToMailboxDTO) o;
    return Objects.equals(this.envelopeUuid, envelopeToMailboxDTO.envelopeUuid) &&
        Objects.equals(this.subject, envelopeToMailboxDTO.subject) &&
        Objects.equals(this.message, envelopeToMailboxDTO.message) &&
        Objects.equals(this.archived, envelopeToMailboxDTO.archived) &&
        Objects.equals(this.deleted, envelopeToMailboxDTO.deleted) &&
        Objects.equals(this.shared, envelopeToMailboxDTO.shared) &&
        Objects.equals(this.sentByMe, envelopeToMailboxDTO.sentByMe) &&
        Objects.equals(this.createdAt, envelopeToMailboxDTO.createdAt) &&
        Objects.equals(this.receivedAt, envelopeToMailboxDTO.receivedAt) &&
        Objects.equals(this.sentAt, envelopeToMailboxDTO.sentAt) &&
        Objects.equals(this.seenAt, envelopeToMailboxDTO.seenAt) &&
        Objects.equals(this.expiredAfter, envelopeToMailboxDTO.expiredAfter) &&
        Objects.equals(this.sharingForbidden, envelopeToMailboxDTO.sharingForbidden) &&
        Objects.equals(this.status, envelopeToMailboxDTO.status) &&
        Objects.equals(this.accountUUID, envelopeToMailboxDTO.accountUUID) &&
        Objects.equals(this.mailboxUUID, envelopeToMailboxDTO.mailboxUUID) &&
        Objects.equals(this.mailboxName, envelopeToMailboxDTO.mailboxName) &&
        Objects.equals(this.total, envelopeToMailboxDTO.total) &&
        Objects.equals(this.completed, envelopeToMailboxDTO.completed) &&
        Objects.equals(this.labels, envelopeToMailboxDTO.labels) &&
        Objects.equals(this.templateUuid, envelopeToMailboxDTO.templateUuid) &&
        Objects.equals(this.templateVersion, envelopeToMailboxDTO.templateVersion) &&
        Objects.equals(this.templateName, envelopeToMailboxDTO.templateName) &&
        Objects.equals(this.invitationCode, envelopeToMailboxDTO.invitationCode) &&
        Objects.equals(this.chainUuid, envelopeToMailboxDTO.chainUuid) &&
        Objects.equals(this.chainedByMe, envelopeToMailboxDTO.chainedByMe) &&
        Objects.equals(this.extraFields, envelopeToMailboxDTO.extraFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeUuid, subject, message, archived, deleted, shared, sentByMe, createdAt, receivedAt, sentAt, seenAt, expiredAfter, sharingForbidden, status, accountUUID, mailboxUUID, mailboxName, total, completed, labels, templateUuid, templateVersion, templateName, invitationCode, chainUuid, chainedByMe, extraFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeToMailboxDTO {\n");
    sb.append("    envelopeUuid: ").append(toIndentedString(envelopeUuid)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    sentByMe: ").append(toIndentedString(sentByMe)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    receivedAt: ").append(toIndentedString(receivedAt)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    seenAt: ").append(toIndentedString(seenAt)).append("\n");
    sb.append("    expiredAfter: ").append(toIndentedString(expiredAfter)).append("\n");
    sb.append("    sharingForbidden: ").append(toIndentedString(sharingForbidden)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    accountUUID: ").append(toIndentedString(accountUUID)).append("\n");
    sb.append("    mailboxUUID: ").append(toIndentedString(mailboxUUID)).append("\n");
    sb.append("    mailboxName: ").append(toIndentedString(mailboxName)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    templateUuid: ").append(toIndentedString(templateUuid)).append("\n");
    sb.append("    templateVersion: ").append(toIndentedString(templateVersion)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    invitationCode: ").append(toIndentedString(invitationCode)).append("\n");
    sb.append("    chainUuid: ").append(toIndentedString(chainUuid)).append("\n");
    sb.append("    chainedByMe: ").append(toIndentedString(chainedByMe)).append("\n");
    sb.append("    extraFields: ").append(toIndentedString(extraFields)).append("\n");
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
    openapiFields.add("archived");
    openapiFields.add("deleted");
    openapiFields.add("shared");
    openapiFields.add("sentByMe");
    openapiFields.add("createdAt");
    openapiFields.add("receivedAt");
    openapiFields.add("sentAt");
    openapiFields.add("seenAt");
    openapiFields.add("expiredAfter");
    openapiFields.add("sharingForbidden");
    openapiFields.add("status");
    openapiFields.add("accountUUID");
    openapiFields.add("mailboxUUID");
    openapiFields.add("mailboxName");
    openapiFields.add("total");
    openapiFields.add("completed");
    openapiFields.add("labels");
    openapiFields.add("templateUuid");
    openapiFields.add("templateVersion");
    openapiFields.add("templateName");
    openapiFields.add("invitationCode");
    openapiFields.add("chainUuid");
    openapiFields.add("chainedByMe");
    openapiFields.add("extraFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopeToMailboxDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopeToMailboxDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopeToMailboxDTO is not found in the empty JSON string", EnvelopeToMailboxDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvelopeToMailboxDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvelopeToMailboxDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("accountUUID") != null && !jsonObj.get("accountUUID").isJsonNull()) && !jsonObj.get("accountUUID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountUUID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountUUID").toString()));
      }
      if ((jsonObj.get("mailboxUUID") != null && !jsonObj.get("mailboxUUID").isJsonNull()) && !jsonObj.get("mailboxUUID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxUUID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxUUID").toString()));
      }
      if ((jsonObj.get("mailboxName") != null && !jsonObj.get("mailboxName").isJsonNull()) && !jsonObj.get("mailboxName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull() && !jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }
      if ((jsonObj.get("templateUuid") != null && !jsonObj.get("templateUuid").isJsonNull()) && !jsonObj.get("templateUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateUuid").toString()));
      }
      if ((jsonObj.get("templateVersion") != null && !jsonObj.get("templateVersion").isJsonNull()) && !jsonObj.get("templateVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateVersion").toString()));
      }
      if ((jsonObj.get("templateName") != null && !jsonObj.get("templateName").isJsonNull()) && !jsonObj.get("templateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateName").toString()));
      }
      if ((jsonObj.get("invitationCode") != null && !jsonObj.get("invitationCode").isJsonNull()) && !jsonObj.get("invitationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invitationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invitationCode").toString()));
      }
      if ((jsonObj.get("chainUuid") != null && !jsonObj.get("chainUuid").isJsonNull()) && !jsonObj.get("chainUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chainUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chainUuid").toString()));
      }
      if (jsonObj.get("extraFields") != null && !jsonObj.get("extraFields").isJsonNull()) {
        JsonArray jsonArrayextraFields = jsonObj.getAsJsonArray("extraFields");
        if (jsonArrayextraFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("extraFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `extraFields` to be an array in the JSON string but got `%s`", jsonObj.get("extraFields").toString()));
          }

          // validate the optional field `extraFields` (array)
          for (int i = 0; i < jsonArrayextraFields.size(); i++) {
            EnvelopeExtraFieldDTO.validateJsonElement(jsonArrayextraFields.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopeToMailboxDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopeToMailboxDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopeToMailboxDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopeToMailboxDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopeToMailboxDTO>() {
           @Override
           public void write(JsonWriter out, EnvelopeToMailboxDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvelopeToMailboxDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnvelopeToMailboxDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopeToMailboxDTO
   * @throws IOException if the JSON string is invalid with respect to EnvelopeToMailboxDTO
   */
  public static EnvelopeToMailboxDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopeToMailboxDTO.class);
  }

  /**
   * Convert an instance of EnvelopeToMailboxDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

