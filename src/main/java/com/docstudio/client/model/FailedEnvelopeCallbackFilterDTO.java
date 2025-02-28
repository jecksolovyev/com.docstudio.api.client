/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R125.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.docstudio.client.JSON;

/**
 * Envelope properties distinct with filter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T22:10:42.565042-07:00[America/Edmonton]", comments = "Generator version: 7.11.0")
public class FailedEnvelopeCallbackFilterDTO {
  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  @javax.annotation.Nullable
  private Set<UUID> labels = new LinkedHashSet<>();

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
  private StatusEnum status;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  @javax.annotation.Nullable
  private String subject;

  public static final String SERIALIZED_NAME_CREATE_DATE = "createDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime createDate;

  public static final String SERIALIZED_NAME_RECEIVE_DATE = "receiveDate";
  @SerializedName(SERIALIZED_NAME_RECEIVE_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime receiveDate;

  public static final String SERIALIZED_NAME_EXPIRE_DATE = "expireDate";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime expireDate;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  @javax.annotation.Nullable
  private UUID template;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  @javax.annotation.Nullable
  private UUID sender;

  public FailedEnvelopeCallbackFilterDTO() {
  }

  public FailedEnvelopeCallbackFilterDTO labels(@javax.annotation.Nullable Set<UUID> labels) {
    this.labels = labels;
    return this;
  }

  public FailedEnvelopeCallbackFilterDTO addLabelsItem(UUID labelsItem) {
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


  public FailedEnvelopeCallbackFilterDTO status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Envelope status
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public FailedEnvelopeCallbackFilterDTO subject(@javax.annotation.Nullable String subject) {
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


  public FailedEnvelopeCallbackFilterDTO createDate(@javax.annotation.Nullable OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Creation date
   * @return createDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(@javax.annotation.Nullable OffsetDateTime createDate) {
    this.createDate = createDate;
  }


  public FailedEnvelopeCallbackFilterDTO receiveDate(@javax.annotation.Nullable OffsetDateTime receiveDate) {
    this.receiveDate = receiveDate;
    return this;
  }

  /**
   * Receive date
   * @return receiveDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReceiveDate() {
    return receiveDate;
  }

  public void setReceiveDate(@javax.annotation.Nullable OffsetDateTime receiveDate) {
    this.receiveDate = receiveDate;
  }


  public FailedEnvelopeCallbackFilterDTO expireDate(@javax.annotation.Nullable OffsetDateTime expireDate) {
    this.expireDate = expireDate;
    return this;
  }

  /**
   * Expire date
   * @return expireDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(@javax.annotation.Nullable OffsetDateTime expireDate) {
    this.expireDate = expireDate;
  }


  public FailedEnvelopeCallbackFilterDTO template(@javax.annotation.Nullable UUID template) {
    this.template = template;
    return this;
  }

  /**
   * Template uuid
   * @return template
   */
  @javax.annotation.Nullable
  public UUID getTemplate() {
    return template;
  }

  public void setTemplate(@javax.annotation.Nullable UUID template) {
    this.template = template;
  }


  public FailedEnvelopeCallbackFilterDTO sender(@javax.annotation.Nullable UUID sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Envelope sender uuid
   * @return sender
   */
  @javax.annotation.Nullable
  public UUID getSender() {
    return sender;
  }

  public void setSender(@javax.annotation.Nullable UUID sender) {
    this.sender = sender;
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
   * @return the FailedEnvelopeCallbackFilterDTO instance itself
   */
  public FailedEnvelopeCallbackFilterDTO putAdditionalProperty(String key, Object value) {
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
    FailedEnvelopeCallbackFilterDTO failedEnvelopeCallbackFilterDTO = (FailedEnvelopeCallbackFilterDTO) o;
    return Objects.equals(this.labels, failedEnvelopeCallbackFilterDTO.labels) &&
        Objects.equals(this.status, failedEnvelopeCallbackFilterDTO.status) &&
        Objects.equals(this.subject, failedEnvelopeCallbackFilterDTO.subject) &&
        Objects.equals(this.createDate, failedEnvelopeCallbackFilterDTO.createDate) &&
        Objects.equals(this.receiveDate, failedEnvelopeCallbackFilterDTO.receiveDate) &&
        Objects.equals(this.expireDate, failedEnvelopeCallbackFilterDTO.expireDate) &&
        Objects.equals(this.template, failedEnvelopeCallbackFilterDTO.template) &&
        Objects.equals(this.sender, failedEnvelopeCallbackFilterDTO.sender)&&
        Objects.equals(this.additionalProperties, failedEnvelopeCallbackFilterDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, status, subject, createDate, receiveDate, expireDate, template, sender, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedEnvelopeCallbackFilterDTO {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    receiveDate: ").append(toIndentedString(receiveDate)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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
    openapiFields.add("labels");
    openapiFields.add("status");
    openapiFields.add("subject");
    openapiFields.add("createDate");
    openapiFields.add("receiveDate");
    openapiFields.add("expireDate");
    openapiFields.add("template");
    openapiFields.add("sender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FailedEnvelopeCallbackFilterDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FailedEnvelopeCallbackFilterDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FailedEnvelopeCallbackFilterDTO is not found in the empty JSON string", FailedEnvelopeCallbackFilterDTO.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull() && !jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) && !jsonObj.get("template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
      if ((jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonNull()) && !jsonObj.get("sender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FailedEnvelopeCallbackFilterDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FailedEnvelopeCallbackFilterDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FailedEnvelopeCallbackFilterDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FailedEnvelopeCallbackFilterDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<FailedEnvelopeCallbackFilterDTO>() {
           @Override
           public void write(JsonWriter out, FailedEnvelopeCallbackFilterDTO value) throws IOException {
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
           public FailedEnvelopeCallbackFilterDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             FailedEnvelopeCallbackFilterDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of FailedEnvelopeCallbackFilterDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FailedEnvelopeCallbackFilterDTO
   * @throws IOException if the JSON string is invalid with respect to FailedEnvelopeCallbackFilterDTO
   */
  public static FailedEnvelopeCallbackFilterDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FailedEnvelopeCallbackFilterDTO.class);
  }

  /**
   * Convert an instance of FailedEnvelopeCallbackFilterDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

