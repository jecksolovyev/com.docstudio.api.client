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
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * EnvelopeDocumentSignaturesDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:19:30.369078200+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class EnvelopeDocumentSignaturesDTO {
  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  @javax.annotation.Nonnull
  private String documentId;

  public static final String SERIALIZED_NAME_SIGNATURE_NAME = "signatureName";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_NAME)
  @javax.annotation.Nonnull
  private String signatureName;

  public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
  @SerializedName(SERIALIZED_NAME_SIGNATURES)
  @javax.annotation.Nonnull
  private List<EnvelopeDocumentSignatureDTO> signatures = new ArrayList<>();

  public EnvelopeDocumentSignaturesDTO() {
  }

  public EnvelopeDocumentSignaturesDTO documentId(@javax.annotation.Nonnull String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Envelope document uuid
   * @return documentId
   */
  @javax.annotation.Nonnull
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(@javax.annotation.Nonnull String documentId) {
    this.documentId = documentId;
  }


  public EnvelopeDocumentSignaturesDTO signatureName(@javax.annotation.Nonnull String signatureName) {
    this.signatureName = signatureName;
    return this;
  }

  /**
   * Envelope document signature name
   * @return signatureName
   */
  @javax.annotation.Nonnull
  public String getSignatureName() {
    return signatureName;
  }

  public void setSignatureName(@javax.annotation.Nonnull String signatureName) {
    this.signatureName = signatureName;
  }


  public EnvelopeDocumentSignaturesDTO signatures(@javax.annotation.Nonnull List<EnvelopeDocumentSignatureDTO> signatures) {
    this.signatures = signatures;
    return this;
  }

  public EnvelopeDocumentSignaturesDTO addSignaturesItem(EnvelopeDocumentSignatureDTO signaturesItem) {
    if (this.signatures == null) {
      this.signatures = new ArrayList<>();
    }
    this.signatures.add(signaturesItem);
    return this;
  }

  /**
   * Document signatures
   * @return signatures
   */
  @javax.annotation.Nonnull
  public List<EnvelopeDocumentSignatureDTO> getSignatures() {
    return signatures;
  }

  public void setSignatures(@javax.annotation.Nonnull List<EnvelopeDocumentSignatureDTO> signatures) {
    this.signatures = signatures;
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
   * @return the EnvelopeDocumentSignaturesDTO instance itself
   */
  public EnvelopeDocumentSignaturesDTO putAdditionalProperty(String key, Object value) {
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
    EnvelopeDocumentSignaturesDTO envelopeDocumentSignaturesDTO = (EnvelopeDocumentSignaturesDTO) o;
    return Objects.equals(this.documentId, envelopeDocumentSignaturesDTO.documentId) &&
        Objects.equals(this.signatureName, envelopeDocumentSignaturesDTO.signatureName) &&
        Objects.equals(this.signatures, envelopeDocumentSignaturesDTO.signatures)&&
        Objects.equals(this.additionalProperties, envelopeDocumentSignaturesDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, signatureName, signatures, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDocumentSignaturesDTO {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
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
    openapiFields.add("documentId");
    openapiFields.add("signatureName");
    openapiFields.add("signatures");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("documentId");
    openapiRequiredFields.add("signatureName");
    openapiRequiredFields.add("signatures");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopeDocumentSignaturesDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopeDocumentSignaturesDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopeDocumentSignaturesDTO is not found in the empty JSON string", EnvelopeDocumentSignaturesDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EnvelopeDocumentSignaturesDTO.openapiRequiredFields) {
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
      // ensure the json data is an array
      if (!jsonObj.get("signatures").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `signatures` to be an array in the JSON string but got `%s`", jsonObj.get("signatures").toString()));
      }

      JsonArray jsonArraysignatures = jsonObj.getAsJsonArray("signatures");
      // validate the required field `signatures` (array)
      for (int i = 0; i < jsonArraysignatures.size(); i++) {
        EnvelopeDocumentSignatureDTO.validateJsonElement(jsonArraysignatures.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopeDocumentSignaturesDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopeDocumentSignaturesDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopeDocumentSignaturesDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopeDocumentSignaturesDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopeDocumentSignaturesDTO>() {
           @Override
           public void write(JsonWriter out, EnvelopeDocumentSignaturesDTO value) throws IOException {
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
           public EnvelopeDocumentSignaturesDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             EnvelopeDocumentSignaturesDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of EnvelopeDocumentSignaturesDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopeDocumentSignaturesDTO
   * @throws IOException if the JSON string is invalid with respect to EnvelopeDocumentSignaturesDTO
   */
  public static EnvelopeDocumentSignaturesDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopeDocumentSignaturesDTO.class);
  }

  /**
   * Convert an instance of EnvelopeDocumentSignaturesDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

