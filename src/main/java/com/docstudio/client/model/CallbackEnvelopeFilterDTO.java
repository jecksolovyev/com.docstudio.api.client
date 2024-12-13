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
 * Search parameters for callback envelopes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class CallbackEnvelopeFilterDTO {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private Set<String> label = new LinkedHashSet<>();

  /**
   * Envelope status
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
  private Set<StatusEnum> status = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  @javax.annotation.Nullable
  private String subject;

  public static final String SERIALIZED_NAME_CREATE_DATE_FROM = "createDateFrom";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE_FROM)
  @javax.annotation.Nullable
  private OffsetDateTime createDateFrom;

  public static final String SERIALIZED_NAME_CREATE_DATE_TO = "createDateTo";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE_TO)
  @javax.annotation.Nullable
  private OffsetDateTime createDateTo;

  public static final String SERIALIZED_NAME_RECEIVE_DATE_FROM = "receiveDateFrom";
  @SerializedName(SERIALIZED_NAME_RECEIVE_DATE_FROM)
  @javax.annotation.Nullable
  private OffsetDateTime receiveDateFrom;

  public static final String SERIALIZED_NAME_RECEIVE_DATE_TO = "receiveDateTo";
  @SerializedName(SERIALIZED_NAME_RECEIVE_DATE_TO)
  @javax.annotation.Nullable
  private OffsetDateTime receiveDateTo;

  public static final String SERIALIZED_NAME_EXPIRE_DATE_FROM = "expireDateFrom";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_FROM)
  @javax.annotation.Nullable
  private OffsetDateTime expireDateFrom;

  public static final String SERIALIZED_NAME_EXPIRE_DATE_TO = "expireDateTo";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_TO)
  @javax.annotation.Nullable
  private OffsetDateTime expireDateTo;

  public static final String SERIALIZED_NAME_SEND_DATE_FROM = "sendDateFrom";
  @SerializedName(SERIALIZED_NAME_SEND_DATE_FROM)
  @javax.annotation.Nullable
  private OffsetDateTime sendDateFrom;

  public static final String SERIALIZED_NAME_SEND_DATE_TO = "sendDateTo";
  @SerializedName(SERIALIZED_NAME_SEND_DATE_TO)
  @javax.annotation.Nullable
  private OffsetDateTime sendDateTo;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  @javax.annotation.Nullable
  private Set<UUID> template = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  @javax.annotation.Nullable
  private Set<UUID> sender = new LinkedHashSet<>();

  /**
   * Gets or Sets scope
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    INBOX("inbox"),

    OUTBOX("outbox"),

    DRAFT("draft"),

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

    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ScopeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  @javax.annotation.Nullable
  private Set<ScopeEnum> scope = new LinkedHashSet<>();

  public CallbackEnvelopeFilterDTO() {
  }

  public CallbackEnvelopeFilterDTO label(@javax.annotation.Nullable Set<String> label) {
    this.label = label;
    return this;
  }

  public CallbackEnvelopeFilterDTO addLabelItem(String labelItem) {
    if (this.label == null) {
      this.label = new LinkedHashSet<>();
    }
    this.label.add(labelItem);
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nullable
  public Set<String> getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nullable Set<String> label) {
    this.label = label;
  }


  public CallbackEnvelopeFilterDTO status(@javax.annotation.Nullable Set<StatusEnum> status) {
    this.status = status;
    return this;
  }

  public CallbackEnvelopeFilterDTO addStatusItem(StatusEnum statusItem) {
    if (this.status == null) {
      this.status = new LinkedHashSet<>();
    }
    this.status.add(statusItem);
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public Set<StatusEnum> getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable Set<StatusEnum> status) {
    this.status = status;
  }


  public CallbackEnvelopeFilterDTO subject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Envelope subject
   * @return subject
   */
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
  }


  public CallbackEnvelopeFilterDTO createDateFrom(@javax.annotation.Nullable OffsetDateTime createDateFrom) {
    this.createDateFrom = createDateFrom;
    return this;
  }

  /**
   * Creation date from
   * @return createDateFrom
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreateDateFrom() {
    return createDateFrom;
  }

  public void setCreateDateFrom(@javax.annotation.Nullable OffsetDateTime createDateFrom) {
    this.createDateFrom = createDateFrom;
  }


  public CallbackEnvelopeFilterDTO createDateTo(@javax.annotation.Nullable OffsetDateTime createDateTo) {
    this.createDateTo = createDateTo;
    return this;
  }

  /**
   * Creation date to
   * @return createDateTo
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreateDateTo() {
    return createDateTo;
  }

  public void setCreateDateTo(@javax.annotation.Nullable OffsetDateTime createDateTo) {
    this.createDateTo = createDateTo;
  }


  public CallbackEnvelopeFilterDTO receiveDateFrom(@javax.annotation.Nullable OffsetDateTime receiveDateFrom) {
    this.receiveDateFrom = receiveDateFrom;
    return this;
  }

  /**
   * Receive date from
   * @return receiveDateFrom
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReceiveDateFrom() {
    return receiveDateFrom;
  }

  public void setReceiveDateFrom(@javax.annotation.Nullable OffsetDateTime receiveDateFrom) {
    this.receiveDateFrom = receiveDateFrom;
  }


  public CallbackEnvelopeFilterDTO receiveDateTo(@javax.annotation.Nullable OffsetDateTime receiveDateTo) {
    this.receiveDateTo = receiveDateTo;
    return this;
  }

  /**
   * Receive date to
   * @return receiveDateTo
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReceiveDateTo() {
    return receiveDateTo;
  }

  public void setReceiveDateTo(@javax.annotation.Nullable OffsetDateTime receiveDateTo) {
    this.receiveDateTo = receiveDateTo;
  }


  public CallbackEnvelopeFilterDTO expireDateFrom(@javax.annotation.Nullable OffsetDateTime expireDateFrom) {
    this.expireDateFrom = expireDateFrom;
    return this;
  }

  /**
   * Expire date from
   * @return expireDateFrom
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpireDateFrom() {
    return expireDateFrom;
  }

  public void setExpireDateFrom(@javax.annotation.Nullable OffsetDateTime expireDateFrom) {
    this.expireDateFrom = expireDateFrom;
  }


  public CallbackEnvelopeFilterDTO expireDateTo(@javax.annotation.Nullable OffsetDateTime expireDateTo) {
    this.expireDateTo = expireDateTo;
    return this;
  }

  /**
   * Expire date to
   * @return expireDateTo
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpireDateTo() {
    return expireDateTo;
  }

  public void setExpireDateTo(@javax.annotation.Nullable OffsetDateTime expireDateTo) {
    this.expireDateTo = expireDateTo;
  }


  public CallbackEnvelopeFilterDTO sendDateFrom(@javax.annotation.Nullable OffsetDateTime sendDateFrom) {
    this.sendDateFrom = sendDateFrom;
    return this;
  }

  /**
   * Envelope sending date from
   * @return sendDateFrom
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSendDateFrom() {
    return sendDateFrom;
  }

  public void setSendDateFrom(@javax.annotation.Nullable OffsetDateTime sendDateFrom) {
    this.sendDateFrom = sendDateFrom;
  }


  public CallbackEnvelopeFilterDTO sendDateTo(@javax.annotation.Nullable OffsetDateTime sendDateTo) {
    this.sendDateTo = sendDateTo;
    return this;
  }

  /**
   * Envelope sending date to
   * @return sendDateTo
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSendDateTo() {
    return sendDateTo;
  }

  public void setSendDateTo(@javax.annotation.Nullable OffsetDateTime sendDateTo) {
    this.sendDateTo = sendDateTo;
  }


  public CallbackEnvelopeFilterDTO template(@javax.annotation.Nullable Set<UUID> template) {
    this.template = template;
    return this;
  }

  public CallbackEnvelopeFilterDTO addTemplateItem(UUID templateItem) {
    if (this.template == null) {
      this.template = new LinkedHashSet<>();
    }
    this.template.add(templateItem);
    return this;
  }

  /**
   * Get template
   * @return template
   */
  @javax.annotation.Nullable
  public Set<UUID> getTemplate() {
    return template;
  }

  public void setTemplate(@javax.annotation.Nullable Set<UUID> template) {
    this.template = template;
  }


  public CallbackEnvelopeFilterDTO sender(@javax.annotation.Nullable Set<UUID> sender) {
    this.sender = sender;
    return this;
  }

  public CallbackEnvelopeFilterDTO addSenderItem(UUID senderItem) {
    if (this.sender == null) {
      this.sender = new LinkedHashSet<>();
    }
    this.sender.add(senderItem);
    return this;
  }

  /**
   * Get sender
   * @return sender
   */
  @javax.annotation.Nullable
  public Set<UUID> getSender() {
    return sender;
  }

  public void setSender(@javax.annotation.Nullable Set<UUID> sender) {
    this.sender = sender;
  }


  public CallbackEnvelopeFilterDTO scope(@javax.annotation.Nullable Set<ScopeEnum> scope) {
    this.scope = scope;
    return this;
  }

  public CallbackEnvelopeFilterDTO addScopeItem(ScopeEnum scopeItem) {
    if (this.scope == null) {
      this.scope = new LinkedHashSet<>();
    }
    this.scope.add(scopeItem);
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  @javax.annotation.Nullable
  public Set<ScopeEnum> getScope() {
    return scope;
  }

  public void setScope(@javax.annotation.Nullable Set<ScopeEnum> scope) {
    this.scope = scope;
  }



  @Override
  public boolean equals(Object o) {
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
        Objects.equals(this.sendDateFrom, callbackEnvelopeFilterDTO.sendDateFrom) &&
        Objects.equals(this.sendDateTo, callbackEnvelopeFilterDTO.sendDateTo) &&
        Objects.equals(this.template, callbackEnvelopeFilterDTO.template) &&
        Objects.equals(this.sender, callbackEnvelopeFilterDTO.sender) &&
        Objects.equals(this.scope, callbackEnvelopeFilterDTO.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, status, subject, createDateFrom, createDateTo, receiveDateFrom, receiveDateTo, expireDateFrom, expireDateTo, sendDateFrom, sendDateTo, template, sender, scope);
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
    sb.append("    sendDateFrom: ").append(toIndentedString(sendDateFrom)).append("\n");
    sb.append("    sendDateTo: ").append(toIndentedString(sendDateTo)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("status");
    openapiFields.add("subject");
    openapiFields.add("createDateFrom");
    openapiFields.add("createDateTo");
    openapiFields.add("receiveDateFrom");
    openapiFields.add("receiveDateTo");
    openapiFields.add("expireDateFrom");
    openapiFields.add("expireDateTo");
    openapiFields.add("sendDateFrom");
    openapiFields.add("sendDateTo");
    openapiFields.add("template");
    openapiFields.add("sender");
    openapiFields.add("scope");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CallbackEnvelopeFilterDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CallbackEnvelopeFilterDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallbackEnvelopeFilterDTO is not found in the empty JSON string", CallbackEnvelopeFilterDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CallbackEnvelopeFilterDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CallbackEnvelopeFilterDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull() && !jsonObj.get("label").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be an array in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull() && !jsonObj.get("status").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be an array in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull() && !jsonObj.get("template").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be an array in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonNull() && !jsonObj.get("sender").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender` to be an array in the JSON string but got `%s`", jsonObj.get("sender").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull() && !jsonObj.get("scope").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be an array in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallbackEnvelopeFilterDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallbackEnvelopeFilterDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallbackEnvelopeFilterDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallbackEnvelopeFilterDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CallbackEnvelopeFilterDTO>() {
           @Override
           public void write(JsonWriter out, CallbackEnvelopeFilterDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallbackEnvelopeFilterDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CallbackEnvelopeFilterDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CallbackEnvelopeFilterDTO
   * @throws IOException if the JSON string is invalid with respect to CallbackEnvelopeFilterDTO
   */
  public static CallbackEnvelopeFilterDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallbackEnvelopeFilterDTO.class);
  }

  /**
   * Convert an instance of CallbackEnvelopeFilterDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

