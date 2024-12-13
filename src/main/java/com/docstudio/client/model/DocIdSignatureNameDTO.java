/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R120.10
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
 * DocIdSignatureNameDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class DocIdSignatureNameDTO {
  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  @javax.annotation.Nullable
  private String documentId;

  public static final String SERIALIZED_NAME_SIGNATURE_NAME = "signatureName";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_NAME)
  @javax.annotation.Nullable
  private String signatureName;

  public DocIdSignatureNameDTO() {
  }

  public DocIdSignatureNameDTO documentId(@javax.annotation.Nullable String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Document ID
   * @return documentId
   */
  @javax.annotation.Nullable
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(@javax.annotation.Nullable String documentId) {
    this.documentId = documentId;
  }


  public DocIdSignatureNameDTO signatureName(@javax.annotation.Nullable String signatureName) {
    this.signatureName = signatureName;
    return this;
  }

  /**
   * Signature field name
   * @return signatureName
   */
  @javax.annotation.Nullable
  public String getSignatureName() {
    return signatureName;
  }

  public void setSignatureName(@javax.annotation.Nullable String signatureName) {
    this.signatureName = signatureName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocIdSignatureNameDTO docIdSignatureNameDTO = (DocIdSignatureNameDTO) o;
    return Objects.equals(this.documentId, docIdSignatureNameDTO.documentId) &&
        Objects.equals(this.signatureName, docIdSignatureNameDTO.signatureName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, signatureName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocIdSignatureNameDTO {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocIdSignatureNameDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocIdSignatureNameDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocIdSignatureNameDTO is not found in the empty JSON string", DocIdSignatureNameDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocIdSignatureNameDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocIdSignatureNameDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("documentId") != null && !jsonObj.get("documentId").isJsonNull()) && !jsonObj.get("documentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentId").toString()));
      }
      if ((jsonObj.get("signatureName") != null && !jsonObj.get("signatureName").isJsonNull()) && !jsonObj.get("signatureName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signatureName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signatureName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocIdSignatureNameDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocIdSignatureNameDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocIdSignatureNameDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocIdSignatureNameDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DocIdSignatureNameDTO>() {
           @Override
           public void write(JsonWriter out, DocIdSignatureNameDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocIdSignatureNameDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DocIdSignatureNameDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocIdSignatureNameDTO
   * @throws IOException if the JSON string is invalid with respect to DocIdSignatureNameDTO
   */
  public static DocIdSignatureNameDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocIdSignatureNameDTO.class);
  }

  /**
   * Convert an instance of DocIdSignatureNameDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

