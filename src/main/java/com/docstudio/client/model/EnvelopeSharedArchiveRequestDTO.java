/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R110.4
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
 * EnvelopeSharedArchiveRequestDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class EnvelopeSharedArchiveRequestDTO {
  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private Set<String> emails = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_ENVELOPE_UUIDS = "envelopeUuids";
  @SerializedName(SERIALIZED_NAME_ENVELOPE_UUIDS)
  private Set<UUID> envelopeUuids = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_EXCLUDE_FILES = "excludeFiles";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_FILES)
  private String excludeFiles;

  public static final String SERIALIZED_NAME_ZIP_STRUCTURE_NAME = "zipStructureName";
  @SerializedName(SERIALIZED_NAME_ZIP_STRUCTURE_NAME)
  private String zipStructureName;

  public EnvelopeSharedArchiveRequestDTO() {
  }

  public EnvelopeSharedArchiveRequestDTO emails(Set<String> emails) {
    this.emails = emails;
    return this;
  }

  public EnvelopeSharedArchiveRequestDTO addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new LinkedHashSet<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

  /**
   * Get emails
   * @return emails
   */
  @javax.annotation.Nonnull
  public Set<String> getEmails() {
    return emails;
  }

  public void setEmails(Set<String> emails) {
    this.emails = emails;
  }


  public EnvelopeSharedArchiveRequestDTO envelopeUuids(Set<UUID> envelopeUuids) {
    this.envelopeUuids = envelopeUuids;
    return this;
  }

  public EnvelopeSharedArchiveRequestDTO addEnvelopeUuidsItem(UUID envelopeUuidsItem) {
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

  public void setEnvelopeUuids(Set<UUID> envelopeUuids) {
    this.envelopeUuids = envelopeUuids;
  }


  public EnvelopeSharedArchiveRequestDTO excludeFiles(String excludeFiles) {
    this.excludeFiles = excludeFiles;
    return this;
  }

  /**
   * Mask to exclude some files. с - for signature/processing Certificate, p - for Printable version, a - for Audit trail
   * @return excludeFiles
   */
  @javax.annotation.Nullable
  public String getExcludeFiles() {
    return excludeFiles;
  }

  public void setExcludeFiles(String excludeFiles) {
    this.excludeFiles = excludeFiles;
  }


  public EnvelopeSharedArchiveRequestDTO zipStructureName(String zipStructureName) {
    this.zipStructureName = zipStructureName;
    return this;
  }

  /**
   * The name of pre-saved zip structure in the template
   * @return zipStructureName
   */
  @javax.annotation.Nullable
  public String getZipStructureName() {
    return zipStructureName;
  }

  public void setZipStructureName(String zipStructureName) {
    this.zipStructureName = zipStructureName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeSharedArchiveRequestDTO envelopeSharedArchiveRequestDTO = (EnvelopeSharedArchiveRequestDTO) o;
    return Objects.equals(this.emails, envelopeSharedArchiveRequestDTO.emails) &&
        Objects.equals(this.envelopeUuids, envelopeSharedArchiveRequestDTO.envelopeUuids) &&
        Objects.equals(this.excludeFiles, envelopeSharedArchiveRequestDTO.excludeFiles) &&
        Objects.equals(this.zipStructureName, envelopeSharedArchiveRequestDTO.zipStructureName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emails, envelopeUuids, excludeFiles, zipStructureName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeSharedArchiveRequestDTO {\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    envelopeUuids: ").append(toIndentedString(envelopeUuids)).append("\n");
    sb.append("    excludeFiles: ").append(toIndentedString(excludeFiles)).append("\n");
    sb.append("    zipStructureName: ").append(toIndentedString(zipStructureName)).append("\n");
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
    openapiFields.add("emails");
    openapiFields.add("envelopeUuids");
    openapiFields.add("excludeFiles");
    openapiFields.add("zipStructureName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("emails");
    openapiRequiredFields.add("envelopeUuids");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopeSharedArchiveRequestDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopeSharedArchiveRequestDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopeSharedArchiveRequestDTO is not found in the empty JSON string", EnvelopeSharedArchiveRequestDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvelopeSharedArchiveRequestDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvelopeSharedArchiveRequestDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EnvelopeSharedArchiveRequestDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("emails") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("emails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `emails` to be an array in the JSON string but got `%s`", jsonObj.get("emails").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("envelopeUuids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("envelopeUuids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `envelopeUuids` to be an array in the JSON string but got `%s`", jsonObj.get("envelopeUuids").toString()));
      }
      if ((jsonObj.get("excludeFiles") != null && !jsonObj.get("excludeFiles").isJsonNull()) && !jsonObj.get("excludeFiles").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludeFiles` to be a primitive type in the JSON string but got `%s`", jsonObj.get("excludeFiles").toString()));
      }
      if ((jsonObj.get("zipStructureName") != null && !jsonObj.get("zipStructureName").isJsonNull()) && !jsonObj.get("zipStructureName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipStructureName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipStructureName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopeSharedArchiveRequestDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopeSharedArchiveRequestDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopeSharedArchiveRequestDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopeSharedArchiveRequestDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopeSharedArchiveRequestDTO>() {
           @Override
           public void write(JsonWriter out, EnvelopeSharedArchiveRequestDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvelopeSharedArchiveRequestDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnvelopeSharedArchiveRequestDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopeSharedArchiveRequestDTO
   * @throws IOException if the JSON string is invalid with respect to EnvelopeSharedArchiveRequestDTO
   */
  public static EnvelopeSharedArchiveRequestDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopeSharedArchiveRequestDTO.class);
  }

  /**
   * Convert an instance of EnvelopeSharedArchiveRequestDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
