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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.docstudio.client.JSON;

/**
 * UploadedPdfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class UploadedPdfDTO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_FIELDS_XML = "fieldsXml";
  @SerializedName(SERIALIZED_NAME_FIELDS_XML)
  private String fieldsXml;

  public static final String SERIALIZED_NAME_UPDATED_PDF = "updatedPdf";
  @SerializedName(SERIALIZED_NAME_UPDATED_PDF)
  private byte[] updatedPdf;

  public UploadedPdfDTO() {
  }

  public UploadedPdfDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * PDF UUID
   * @return uuid
   */
  @javax.annotation.Nullable
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public UploadedPdfDTO hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * PDF hash
   * @return hash
   */
  @javax.annotation.Nullable
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }


  public UploadedPdfDTO fieldsXml(String fieldsXml) {
    this.fieldsXml = fieldsXml;
    return this;
  }

  /**
   * Found fields in XML formal
   * @return fieldsXml
   */
  @javax.annotation.Nullable
  public String getFieldsXml() {
    return fieldsXml;
  }

  public void setFieldsXml(String fieldsXml) {
    this.fieldsXml = fieldsXml;
  }


  public UploadedPdfDTO updatedPdf(byte[] updatedPdf) {
    this.updatedPdf = updatedPdf;
    return this;
  }

  /**
   * Updated PDF
   * @return updatedPdf
   */
  @javax.annotation.Nullable
  public byte[] getUpdatedPdf() {
    return updatedPdf;
  }

  public void setUpdatedPdf(byte[] updatedPdf) {
    this.updatedPdf = updatedPdf;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedPdfDTO uploadedPdfDTO = (UploadedPdfDTO) o;
    return Objects.equals(this.uuid, uploadedPdfDTO.uuid) &&
        Objects.equals(this.hash, uploadedPdfDTO.hash) &&
        Objects.equals(this.fieldsXml, uploadedPdfDTO.fieldsXml) &&
        Arrays.equals(this.updatedPdf, uploadedPdfDTO.updatedPdf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, hash, fieldsXml, Arrays.hashCode(updatedPdf));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedPdfDTO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    fieldsXml: ").append(toIndentedString(fieldsXml)).append("\n");
    sb.append("    updatedPdf: ").append(toIndentedString(updatedPdf)).append("\n");
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
    openapiFields.add("hash");
    openapiFields.add("fieldsXml");
    openapiFields.add("updatedPdf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UploadedPdfDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UploadedPdfDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadedPdfDTO is not found in the empty JSON string", UploadedPdfDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UploadedPdfDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UploadedPdfDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("hash") != null && !jsonObj.get("hash").isJsonNull()) && !jsonObj.get("hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hash").toString()));
      }
      if ((jsonObj.get("fieldsXml") != null && !jsonObj.get("fieldsXml").isJsonNull()) && !jsonObj.get("fieldsXml").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldsXml` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldsXml").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadedPdfDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadedPdfDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadedPdfDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadedPdfDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadedPdfDTO>() {
           @Override
           public void write(JsonWriter out, UploadedPdfDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UploadedPdfDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UploadedPdfDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UploadedPdfDTO
   * @throws IOException if the JSON string is invalid with respect to UploadedPdfDTO
   */
  public static UploadedPdfDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadedPdfDTO.class);
  }

  /**
   * Convert an instance of UploadedPdfDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
