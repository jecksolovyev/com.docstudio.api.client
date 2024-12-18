/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R121.14
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
 * Envelope
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:19:30.369078200+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class EnvGetDTO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private UUID uuid;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private String data;

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

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  @javax.annotation.Nullable
  private Set<UUID> labels = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nullable
  private Integer total;

  public static final String SERIALIZED_NAME_COMPLETED = "completed";
  @SerializedName(SERIALIZED_NAME_COMPLETED)
  @javax.annotation.Nullable
  private Integer completed;

  public static final String SERIALIZED_NAME_CHAIN_UUID = "chainUuid";
  @SerializedName(SERIALIZED_NAME_CHAIN_UUID)
  @javax.annotation.Nullable
  private UUID chainUuid;

  public static final String SERIALIZED_NAME_CHAINED_BY_ME = "chainedByMe";
  @SerializedName(SERIALIZED_NAME_CHAINED_BY_ME)
  @javax.annotation.Nullable
  private Boolean chainedByMe;

  public static final String SERIALIZED_NAME_APPROVAL_FLOW_UUID = "approvalFlowUuid";
  @SerializedName(SERIALIZED_NAME_APPROVAL_FLOW_UUID)
  @javax.annotation.Nullable
  private UUID approvalFlowUuid;

  /**
   * Calculated status for mailbox
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

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  @javax.annotation.Nullable
  private EnvelopeSenderDTO sender;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  @javax.annotation.Nullable
  private Boolean deleted;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  @javax.annotation.Nullable
  private Boolean archived;

  public static final String SERIALIZED_NAME_SHARED = "shared";
  @SerializedName(SERIALIZED_NAME_SHARED)
  @javax.annotation.Nullable
  private Boolean shared;

  public static final String SERIALIZED_NAME_SHARED_TO = "sharedTo";
  @SerializedName(SERIALIZED_NAME_SHARED_TO)
  @javax.annotation.Nullable
  private List<EnvSharedToDTO> sharedTo = new ArrayList<>();

  public EnvGetDTO() {
  }

  public EnvGetDTO uuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID of envelope
   * @return uuid
   */
  @javax.annotation.Nullable
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
  }


  public EnvGetDTO data(@javax.annotation.Nullable String data) {
    this.data = data;
    return this;
  }

  /**
   * Envelope XML
   * @return data
   */
  @javax.annotation.Nullable
  public String getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable String data) {
    this.data = data;
  }


  public EnvGetDTO createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
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


  public EnvGetDTO receivedAt(@javax.annotation.Nullable OffsetDateTime receivedAt) {
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


  public EnvGetDTO sentAt(@javax.annotation.Nullable OffsetDateTime sentAt) {
    this.sentAt = sentAt;
    return this;
  }

  /**
   * Envelope sending date
   * @return sentAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSentAt() {
    return sentAt;
  }

  public void setSentAt(@javax.annotation.Nullable OffsetDateTime sentAt) {
    this.sentAt = sentAt;
  }


  public EnvGetDTO labels(@javax.annotation.Nullable Set<UUID> labels) {
    this.labels = labels;
    return this;
  }

  public EnvGetDTO addLabelsItem(UUID labelsItem) {
    if (this.labels == null) {
      this.labels = new LinkedHashSet<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @javax.annotation.Nullable
  public Set<UUID> getLabels() {
    return labels;
  }

  public void setLabels(@javax.annotation.Nullable Set<UUID> labels) {
    this.labels = labels;
  }


  public EnvGetDTO total(@javax.annotation.Nullable Integer total) {
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


  public EnvGetDTO completed(@javax.annotation.Nullable Integer completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Number of participants who completed their processing
   * @return completed
   */
  @javax.annotation.Nullable
  public Integer getCompleted() {
    return completed;
  }

  public void setCompleted(@javax.annotation.Nullable Integer completed) {
    this.completed = completed;
  }


  public EnvGetDTO chainUuid(@javax.annotation.Nullable UUID chainUuid) {
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


  public EnvGetDTO chainedByMe(@javax.annotation.Nullable Boolean chainedByMe) {
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


  public EnvGetDTO approvalFlowUuid(@javax.annotation.Nullable UUID approvalFlowUuid) {
    this.approvalFlowUuid = approvalFlowUuid;
    return this;
  }

  /**
   * Approval flow UUID
   * @return approvalFlowUuid
   */
  @javax.annotation.Nullable
  public UUID getApprovalFlowUuid() {
    return approvalFlowUuid;
  }

  public void setApprovalFlowUuid(@javax.annotation.Nullable UUID approvalFlowUuid) {
    this.approvalFlowUuid = approvalFlowUuid;
  }


  public EnvGetDTO status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Calculated status for mailbox
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public EnvGetDTO sender(@javax.annotation.Nullable EnvelopeSenderDTO sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   * @return sender
   */
  @javax.annotation.Nullable
  public EnvelopeSenderDTO getSender() {
    return sender;
  }

  public void setSender(@javax.annotation.Nullable EnvelopeSenderDTO sender) {
    this.sender = sender;
  }


  public EnvGetDTO deleted(@javax.annotation.Nullable Boolean deleted) {
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


  public EnvGetDTO archived(@javax.annotation.Nullable Boolean archived) {
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


  public EnvGetDTO shared(@javax.annotation.Nullable Boolean shared) {
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


  public EnvGetDTO sharedTo(@javax.annotation.Nullable List<EnvSharedToDTO> sharedTo) {
    this.sharedTo = sharedTo;
    return this;
  }

  public EnvGetDTO addSharedToItem(EnvSharedToDTO sharedToItem) {
    if (this.sharedTo == null) {
      this.sharedTo = new ArrayList<>();
    }
    this.sharedTo.add(sharedToItem);
    return this;
  }

  /**
   * Mailboxes the envelope shared with
   * @return sharedTo
   */
  @javax.annotation.Nullable
  public List<EnvSharedToDTO> getSharedTo() {
    return sharedTo;
  }

  public void setSharedTo(@javax.annotation.Nullable List<EnvSharedToDTO> sharedTo) {
    this.sharedTo = sharedTo;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the EnvGetDTO instance itself
   */
  public EnvGetDTO putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
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
        Objects.equals(this.sentAt, envGetDTO.sentAt) &&
        Objects.equals(this.labels, envGetDTO.labels) &&
        Objects.equals(this.total, envGetDTO.total) &&
        Objects.equals(this.completed, envGetDTO.completed) &&
        Objects.equals(this.chainUuid, envGetDTO.chainUuid) &&
        Objects.equals(this.chainedByMe, envGetDTO.chainedByMe) &&
        Objects.equals(this.approvalFlowUuid, envGetDTO.approvalFlowUuid) &&
        Objects.equals(this.status, envGetDTO.status) &&
        Objects.equals(this.sender, envGetDTO.sender) &&
        Objects.equals(this.deleted, envGetDTO.deleted) &&
        Objects.equals(this.archived, envGetDTO.archived) &&
        Objects.equals(this.shared, envGetDTO.shared) &&
        Objects.equals(this.sharedTo, envGetDTO.sharedTo)&&
        Objects.equals(this.additionalProperties, envGetDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, data, createdAt, receivedAt, sentAt, labels, total, completed, chainUuid, chainedByMe, approvalFlowUuid, status, sender, deleted, archived, shared, sharedTo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvGetDTO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    receivedAt: ").append(toIndentedString(receivedAt)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    chainUuid: ").append(toIndentedString(chainUuid)).append("\n");
    sb.append("    chainedByMe: ").append(toIndentedString(chainedByMe)).append("\n");
    sb.append("    approvalFlowUuid: ").append(toIndentedString(approvalFlowUuid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    sharedTo: ").append(toIndentedString(sharedTo)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("data");
    openapiFields.add("createdAt");
    openapiFields.add("receivedAt");
    openapiFields.add("sentAt");
    openapiFields.add("labels");
    openapiFields.add("total");
    openapiFields.add("completed");
    openapiFields.add("chainUuid");
    openapiFields.add("chainedByMe");
    openapiFields.add("approvalFlowUuid");
    openapiFields.add("status");
    openapiFields.add("sender");
    openapiFields.add("deleted");
    openapiFields.add("archived");
    openapiFields.add("shared");
    openapiFields.add("sharedTo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvGetDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvGetDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvGetDTO is not found in the empty JSON string", EnvGetDTO.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull() && !jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }
      if ((jsonObj.get("chainUuid") != null && !jsonObj.get("chainUuid").isJsonNull()) && !jsonObj.get("chainUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chainUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chainUuid").toString()));
      }
      if ((jsonObj.get("approvalFlowUuid") != null && !jsonObj.get("approvalFlowUuid").isJsonNull()) && !jsonObj.get("approvalFlowUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvalFlowUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approvalFlowUuid").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `sender`
      if (jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonNull()) {
        EnvelopeSenderDTO.validateJsonElement(jsonObj.get("sender"));
      }
      if (jsonObj.get("sharedTo") != null && !jsonObj.get("sharedTo").isJsonNull()) {
        JsonArray jsonArraysharedTo = jsonObj.getAsJsonArray("sharedTo");
        if (jsonArraysharedTo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sharedTo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sharedTo` to be an array in the JSON string but got `%s`", jsonObj.get("sharedTo").toString()));
          }

          // validate the optional field `sharedTo` (array)
          for (int i = 0; i < jsonArraysharedTo.size(); i++) {
            EnvSharedToDTO.validateJsonElement(jsonArraysharedTo.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvGetDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvGetDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvGetDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvGetDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvGetDTO>() {
           @Override
           public void write(JsonWriter out, EnvGetDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvGetDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             EnvGetDTO instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnvGetDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvGetDTO
   * @throws IOException if the JSON string is invalid with respect to EnvGetDTO
   */
  public static EnvGetDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvGetDTO.class);
  }

  /**
   * Convert an instance of EnvGetDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

