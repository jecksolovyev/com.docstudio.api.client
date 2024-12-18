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
 * ChainEnvelopeDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:19:30.369078200+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class ChainEnvelopeDTO {
  public static final String SERIALIZED_NAME_ENVELOPE_UUID = "envelopeUuid";
  @SerializedName(SERIALIZED_NAME_ENVELOPE_UUID)
  @javax.annotation.Nullable
  private UUID envelopeUuid;

  public static final String SERIALIZED_NAME_CHAIN_UUID = "chainUuid";
  @SerializedName(SERIALIZED_NAME_CHAIN_UUID)
  @javax.annotation.Nullable
  private UUID chainUuid;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  @javax.annotation.Nullable
  private String subject;

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

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "templateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  @javax.annotation.Nullable
  private String templateName;

  public static final String SERIALIZED_NAME_RECEIVED_AT = "receivedAt";
  @SerializedName(SERIALIZED_NAME_RECEIVED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime receivedAt;

  public ChainEnvelopeDTO() {
  }

  public ChainEnvelopeDTO envelopeUuid(@javax.annotation.Nullable UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
    return this;
  }

  /**
   * Envelope UUID
   * @return envelopeUuid
   */
  @javax.annotation.Nullable
  public UUID getEnvelopeUuid() {
    return envelopeUuid;
  }

  public void setEnvelopeUuid(@javax.annotation.Nullable UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
  }


  public ChainEnvelopeDTO chainUuid(@javax.annotation.Nullable UUID chainUuid) {
    this.chainUuid = chainUuid;
    return this;
  }

  /**
   * Chain UUID
   * @return chainUuid
   */
  @javax.annotation.Nullable
  public UUID getChainUuid() {
    return chainUuid;
  }

  public void setChainUuid(@javax.annotation.Nullable UUID chainUuid) {
    this.chainUuid = chainUuid;
  }


  public ChainEnvelopeDTO subject(@javax.annotation.Nullable String subject) {
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


  public ChainEnvelopeDTO status(@javax.annotation.Nullable StatusEnum status) {
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


  public ChainEnvelopeDTO templateName(@javax.annotation.Nullable String templateName) {
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


  public ChainEnvelopeDTO receivedAt(@javax.annotation.Nullable OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
    return this;
  }

  /**
   * Envelope receive date
   * @return receivedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReceivedAt() {
    return receivedAt;
  }

  public void setReceivedAt(@javax.annotation.Nullable OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
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
   * @return the ChainEnvelopeDTO instance itself
   */
  public ChainEnvelopeDTO putAdditionalProperty(String key, Object value) {
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
    ChainEnvelopeDTO chainEnvelopeDTO = (ChainEnvelopeDTO) o;
    return Objects.equals(this.envelopeUuid, chainEnvelopeDTO.envelopeUuid) &&
        Objects.equals(this.chainUuid, chainEnvelopeDTO.chainUuid) &&
        Objects.equals(this.subject, chainEnvelopeDTO.subject) &&
        Objects.equals(this.status, chainEnvelopeDTO.status) &&
        Objects.equals(this.templateName, chainEnvelopeDTO.templateName) &&
        Objects.equals(this.receivedAt, chainEnvelopeDTO.receivedAt)&&
        Objects.equals(this.additionalProperties, chainEnvelopeDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeUuid, chainUuid, subject, status, templateName, receivedAt, additionalProperties);
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
    openapiFields.add("envelopeUuid");
    openapiFields.add("chainUuid");
    openapiFields.add("subject");
    openapiFields.add("status");
    openapiFields.add("templateName");
    openapiFields.add("receivedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ChainEnvelopeDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChainEnvelopeDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChainEnvelopeDTO is not found in the empty JSON string", ChainEnvelopeDTO.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("envelopeUuid") != null && !jsonObj.get("envelopeUuid").isJsonNull()) && !jsonObj.get("envelopeUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `envelopeUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("envelopeUuid").toString()));
      }
      if ((jsonObj.get("chainUuid") != null && !jsonObj.get("chainUuid").isJsonNull()) && !jsonObj.get("chainUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chainUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chainUuid").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("templateName") != null && !jsonObj.get("templateName").isJsonNull()) && !jsonObj.get("templateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChainEnvelopeDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChainEnvelopeDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChainEnvelopeDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChainEnvelopeDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ChainEnvelopeDTO>() {
           @Override
           public void write(JsonWriter out, ChainEnvelopeDTO value) throws IOException {
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
           public ChainEnvelopeDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ChainEnvelopeDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of ChainEnvelopeDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ChainEnvelopeDTO
   * @throws IOException if the JSON string is invalid with respect to ChainEnvelopeDTO
   */
  public static ChainEnvelopeDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChainEnvelopeDTO.class);
  }

  /**
   * Convert an instance of ChainEnvelopeDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

