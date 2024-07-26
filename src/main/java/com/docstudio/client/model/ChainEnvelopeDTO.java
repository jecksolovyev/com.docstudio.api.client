/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R110.5
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class ChainEnvelopeDTO {
  public static final String SERIALIZED_NAME_ENVELOPE_UUID = "envelopeUuid";
  @SerializedName(SERIALIZED_NAME_ENVELOPE_UUID)
  private UUID envelopeUuid;

  public static final String SERIALIZED_NAME_CHAIN_UUID = "chainUuid";
  @SerializedName(SERIALIZED_NAME_CHAIN_UUID)
  private UUID chainUuid;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
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
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "templateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_RECEIVED_AT = "receivedAt";
  @SerializedName(SERIALIZED_NAME_RECEIVED_AT)
  private OffsetDateTime receivedAt;

  public ChainEnvelopeDTO() {
  }

  public ChainEnvelopeDTO envelopeUuid(UUID envelopeUuid) {
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

  public void setEnvelopeUuid(UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
  }


  public ChainEnvelopeDTO chainUuid(UUID chainUuid) {
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

  public void setChainUuid(UUID chainUuid) {
    this.chainUuid = chainUuid;
  }


  public ChainEnvelopeDTO subject(String subject) {
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

  public void setSubject(String subject) {
    this.subject = subject;
  }


  public ChainEnvelopeDTO status(StatusEnum status) {
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

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ChainEnvelopeDTO templateName(String templateName) {
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

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public ChainEnvelopeDTO receivedAt(OffsetDateTime receivedAt) {
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

  public void setReceivedAt(OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
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
        Objects.equals(this.receivedAt, chainEnvelopeDTO.receivedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeUuid, chainUuid, subject, status, templateName, receivedAt);
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

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChainEnvelopeDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChainEnvelopeDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
             elementAdapter.write(out, obj);
           }

           @Override
           public ChainEnvelopeDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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

