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
import java.util.*;

/**
 * EnvelopeCancelDelegationDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class EnvelopeCancelDelegationDTO {
  public static final String SERIALIZED_NAME_ENVELOPE_UUID = "envelopeUuid";
  @SerializedName(SERIALIZED_NAME_ENVELOPE_UUID)
  @javax.annotation.Nonnull
  private UUID envelopeUuid;

  public static final String SERIALIZED_NAME_MAILBOX_TO_CANCEL = "mailboxToCancel";
  @SerializedName(SERIALIZED_NAME_MAILBOX_TO_CANCEL)
  @javax.annotation.Nullable
  private String mailboxToCancel;

  public EnvelopeCancelDelegationDTO() {
  }

  public EnvelopeCancelDelegationDTO envelopeUuid(@javax.annotation.Nonnull UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
    return this;
  }

  /**
   * Get envelopeUuid
   * @return envelopeUuid
   */
  @javax.annotation.Nonnull
  public UUID getEnvelopeUuid() {
    return envelopeUuid;
  }

  public void setEnvelopeUuid(@javax.annotation.Nonnull UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
  }


  public EnvelopeCancelDelegationDTO mailboxToCancel(@javax.annotation.Nullable String mailboxToCancel) {
    this.mailboxToCancel = mailboxToCancel;
    return this;
  }

  /**
   * Get mailboxToCancel
   * @return mailboxToCancel
   */
  @javax.annotation.Nullable
  public String getMailboxToCancel() {
    return mailboxToCancel;
  }

  public void setMailboxToCancel(@javax.annotation.Nullable String mailboxToCancel) {
    this.mailboxToCancel = mailboxToCancel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeCancelDelegationDTO envelopeCancelDelegationDTO = (EnvelopeCancelDelegationDTO) o;
    return Objects.equals(this.envelopeUuid, envelopeCancelDelegationDTO.envelopeUuid) &&
        Objects.equals(this.mailboxToCancel, envelopeCancelDelegationDTO.mailboxToCancel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeUuid, mailboxToCancel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeCancelDelegationDTO {\n");
    sb.append("    envelopeUuid: ").append(toIndentedString(envelopeUuid)).append("\n");
    sb.append("    mailboxToCancel: ").append(toIndentedString(mailboxToCancel)).append("\n");
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
    openapiFields.add("mailboxToCancel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("envelopeUuid");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopeCancelDelegationDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopeCancelDelegationDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopeCancelDelegationDTO is not found in the empty JSON string", EnvelopeCancelDelegationDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvelopeCancelDelegationDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvelopeCancelDelegationDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EnvelopeCancelDelegationDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("envelopeUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `envelopeUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("envelopeUuid").toString()));
      }
      if ((jsonObj.get("mailboxToCancel") != null && !jsonObj.get("mailboxToCancel").isJsonNull()) && !jsonObj.get("mailboxToCancel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxToCancel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxToCancel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopeCancelDelegationDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopeCancelDelegationDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopeCancelDelegationDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopeCancelDelegationDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopeCancelDelegationDTO>() {
           @Override
           public void write(JsonWriter out, EnvelopeCancelDelegationDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvelopeCancelDelegationDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnvelopeCancelDelegationDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopeCancelDelegationDTO
   * @throws IOException if the JSON string is invalid with respect to EnvelopeCancelDelegationDTO
   */
  public static EnvelopeCancelDelegationDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopeCancelDelegationDTO.class);
  }

  /**
   * Convert an instance of EnvelopeCancelDelegationDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

