/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R135.5
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
 * SingleDocForSignRequestDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-23T12:49:56.203839-06:00[America/Edmonton]", comments = "Generator version: 7.14.0")
public class SingleDocForSignRequestDTO {
  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  @javax.annotation.Nonnull
  private String documentId;

  public static final String SERIALIZED_NAME_SIGNATURE_NAME = "signatureName";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_NAME)
  @javax.annotation.Nonnull
  private String signatureName;

  public static final String SERIALIZED_NAME_SIGNING_CERTIFICATE = "signingCertificate";
  @SerializedName(SERIALIZED_NAME_SIGNING_CERTIFICATE)
  @javax.annotation.Nullable
  private byte[] signingCertificate;

  public static final String SERIALIZED_NAME_STAMP_CERTIFICATE = "stampCertificate";
  @SerializedName(SERIALIZED_NAME_STAMP_CERTIFICATE)
  @javax.annotation.Nullable
  private byte[] stampCertificate;

  public static final String SERIALIZED_NAME_SKIP_BINARY_FILES = "skipBinaryFiles";
  @SerializedName(SERIALIZED_NAME_SKIP_BINARY_FILES)
  @javax.annotation.Nullable
  private Boolean skipBinaryFiles;

  public SingleDocForSignRequestDTO() {
  }

  public SingleDocForSignRequestDTO documentId(@javax.annotation.Nonnull String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Document ID
   * @return documentId
   */
  @javax.annotation.Nonnull
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(@javax.annotation.Nonnull String documentId) {
    this.documentId = documentId;
  }


  public SingleDocForSignRequestDTO signatureName(@javax.annotation.Nonnull String signatureName) {
    this.signatureName = signatureName;
    return this;
  }

  /**
   * Signature name
   * @return signatureName
   */
  @javax.annotation.Nonnull
  public String getSignatureName() {
    return signatureName;
  }

  public void setSignatureName(@javax.annotation.Nonnull String signatureName) {
    this.signatureName = signatureName;
  }


  public SingleDocForSignRequestDTO signingCertificate(@javax.annotation.Nullable byte[] signingCertificate) {
    this.signingCertificate = signingCertificate;
    return this;
  }

  /**
   * Certificate which will be used for signing
   * @return signingCertificate
   */
  @javax.annotation.Nullable
  public byte[] getSigningCertificate() {
    return signingCertificate;
  }

  public void setSigningCertificate(@javax.annotation.Nullable byte[] signingCertificate) {
    this.signingCertificate = signingCertificate;
  }


  public SingleDocForSignRequestDTO stampCertificate(@javax.annotation.Nullable byte[] stampCertificate) {
    this.stampCertificate = stampCertificate;
    return this;
  }

  /**
   * Stamp Certificate which will be used for signing
   * @return stampCertificate
   */
  @javax.annotation.Nullable
  public byte[] getStampCertificate() {
    return stampCertificate;
  }

  public void setStampCertificate(@javax.annotation.Nullable byte[] stampCertificate) {
    this.stampCertificate = stampCertificate;
  }


  public SingleDocForSignRequestDTO skipBinaryFiles(@javax.annotation.Nullable Boolean skipBinaryFiles) {
    this.skipBinaryFiles = skipBinaryFiles;
    return this;
  }

  /**
   * Specify if original binary files are needed in response
   * @return skipBinaryFiles
   */
  @javax.annotation.Nullable
  public Boolean getSkipBinaryFiles() {
    return skipBinaryFiles;
  }

  public void setSkipBinaryFiles(@javax.annotation.Nullable Boolean skipBinaryFiles) {
    this.skipBinaryFiles = skipBinaryFiles;
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
   * @return the SingleDocForSignRequestDTO instance itself
   */
  public SingleDocForSignRequestDTO putAdditionalProperty(String key, Object value) {
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
    SingleDocForSignRequestDTO singleDocForSignRequestDTO = (SingleDocForSignRequestDTO) o;
    return Objects.equals(this.documentId, singleDocForSignRequestDTO.documentId) &&
        Objects.equals(this.signatureName, singleDocForSignRequestDTO.signatureName) &&
        Arrays.equals(this.signingCertificate, singleDocForSignRequestDTO.signingCertificate) &&
        Arrays.equals(this.stampCertificate, singleDocForSignRequestDTO.stampCertificate) &&
        Objects.equals(this.skipBinaryFiles, singleDocForSignRequestDTO.skipBinaryFiles)&&
        Objects.equals(this.additionalProperties, singleDocForSignRequestDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, signatureName, Arrays.hashCode(signingCertificate), Arrays.hashCode(stampCertificate), skipBinaryFiles, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleDocForSignRequestDTO {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
    sb.append("    signingCertificate: ").append(toIndentedString(signingCertificate)).append("\n");
    sb.append("    stampCertificate: ").append(toIndentedString(stampCertificate)).append("\n");
    sb.append("    skipBinaryFiles: ").append(toIndentedString(skipBinaryFiles)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("documentId", "signatureName", "signingCertificate", "stampCertificate", "skipBinaryFiles"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("documentId", "signatureName"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SingleDocForSignRequestDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SingleDocForSignRequestDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SingleDocForSignRequestDTO is not found in the empty JSON string", SingleDocForSignRequestDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SingleDocForSignRequestDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("documentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentId").toString()));
      }
      if (!jsonObj.get("signatureName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signatureName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signatureName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SingleDocForSignRequestDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SingleDocForSignRequestDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SingleDocForSignRequestDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SingleDocForSignRequestDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<SingleDocForSignRequestDTO>() {
           @Override
           public void write(JsonWriter out, SingleDocForSignRequestDTO value) throws IOException {
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
           public SingleDocForSignRequestDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SingleDocForSignRequestDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of SingleDocForSignRequestDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SingleDocForSignRequestDTO
   * @throws IOException if the JSON string is invalid with respect to SingleDocForSignRequestDTO
   */
  public static SingleDocForSignRequestDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SingleDocForSignRequestDTO.class);
  }

  /**
   * Convert an instance of SingleDocForSignRequestDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

