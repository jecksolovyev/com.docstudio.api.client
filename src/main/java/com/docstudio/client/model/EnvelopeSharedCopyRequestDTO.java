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
 * EnvelopeSharedCopyRequestDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class EnvelopeSharedCopyRequestDTO {
  public static final String SERIALIZED_NAME_ENVELOPE_UUIDS = "envelopeUuids";
  @SerializedName(SERIALIZED_NAME_ENVELOPE_UUIDS)
  @javax.annotation.Nonnull
  private Set<UUID> envelopeUuids = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_MAILBOX_UUIDS = "mailboxUuids";
  @SerializedName(SERIALIZED_NAME_MAILBOX_UUIDS)
  @javax.annotation.Nonnull
  private Set<UUID> mailboxUuids = new LinkedHashSet<>();

  public EnvelopeSharedCopyRequestDTO() {
  }

  public EnvelopeSharedCopyRequestDTO envelopeUuids(@javax.annotation.Nonnull Set<UUID> envelopeUuids) {
    this.envelopeUuids = envelopeUuids;
    return this;
  }

  public EnvelopeSharedCopyRequestDTO addEnvelopeUuidsItem(UUID envelopeUuidsItem) {
    if (this.envelopeUuids == null) {
      this.envelopeUuids = new LinkedHashSet<>();
    }
    this.envelopeUuids.add(envelopeUuidsItem);
    return this;
  }

  /**
   * Get envelopeUuids
   * @return envelopeUuids
   */
  @javax.annotation.Nonnull
  public Set<UUID> getEnvelopeUuids() {
    return envelopeUuids;
  }

  public void setEnvelopeUuids(@javax.annotation.Nonnull Set<UUID> envelopeUuids) {
    this.envelopeUuids = envelopeUuids;
  }


  public EnvelopeSharedCopyRequestDTO mailboxUuids(@javax.annotation.Nonnull Set<UUID> mailboxUuids) {
    this.mailboxUuids = mailboxUuids;
    return this;
  }

  public EnvelopeSharedCopyRequestDTO addMailboxUuidsItem(UUID mailboxUuidsItem) {
    if (this.mailboxUuids == null) {
      this.mailboxUuids = new LinkedHashSet<>();
    }
    this.mailboxUuids.add(mailboxUuidsItem);
    return this;
  }

  /**
   * Get mailboxUuids
   * @return mailboxUuids
   */
  @javax.annotation.Nonnull
  public Set<UUID> getMailboxUuids() {
    return mailboxUuids;
  }

  public void setMailboxUuids(@javax.annotation.Nonnull Set<UUID> mailboxUuids) {
    this.mailboxUuids = mailboxUuids;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeSharedCopyRequestDTO envelopeSharedCopyRequestDTO = (EnvelopeSharedCopyRequestDTO) o;
    return Objects.equals(this.envelopeUuids, envelopeSharedCopyRequestDTO.envelopeUuids) &&
        Objects.equals(this.mailboxUuids, envelopeSharedCopyRequestDTO.mailboxUuids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeUuids, mailboxUuids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeSharedCopyRequestDTO {\n");
    sb.append("    envelopeUuids: ").append(toIndentedString(envelopeUuids)).append("\n");
    sb.append("    mailboxUuids: ").append(toIndentedString(mailboxUuids)).append("\n");
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
    openapiFields.add("envelopeUuids");
    openapiFields.add("mailboxUuids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("envelopeUuids");
    openapiRequiredFields.add("mailboxUuids");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopeSharedCopyRequestDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopeSharedCopyRequestDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopeSharedCopyRequestDTO is not found in the empty JSON string", EnvelopeSharedCopyRequestDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvelopeSharedCopyRequestDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvelopeSharedCopyRequestDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EnvelopeSharedCopyRequestDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("envelopeUuids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("envelopeUuids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `envelopeUuids` to be an array in the JSON string but got `%s`", jsonObj.get("envelopeUuids").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("mailboxUuids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("mailboxUuids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxUuids` to be an array in the JSON string but got `%s`", jsonObj.get("mailboxUuids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopeSharedCopyRequestDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopeSharedCopyRequestDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopeSharedCopyRequestDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopeSharedCopyRequestDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopeSharedCopyRequestDTO>() {
           @Override
           public void write(JsonWriter out, EnvelopeSharedCopyRequestDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvelopeSharedCopyRequestDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnvelopeSharedCopyRequestDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopeSharedCopyRequestDTO
   * @throws IOException if the JSON string is invalid with respect to EnvelopeSharedCopyRequestDTO
   */
  public static EnvelopeSharedCopyRequestDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopeSharedCopyRequestDTO.class);
  }

  /**
   * Convert an instance of EnvelopeSharedCopyRequestDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

