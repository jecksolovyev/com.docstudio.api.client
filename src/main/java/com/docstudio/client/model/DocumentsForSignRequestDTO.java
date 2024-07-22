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
 * DocumentsForSignRequestDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class DocumentsForSignRequestDTO {
  public static final String SERIALIZED_NAME_SIGNING_CERTIFICATE = "signingCertificate";
  @SerializedName(SERIALIZED_NAME_SIGNING_CERTIFICATE)
  private byte[] signingCertificate;

  public static final String SERIALIZED_NAME_SKIP_BINARY_FILES = "skipBinaryFiles";
  @SerializedName(SERIALIZED_NAME_SKIP_BINARY_FILES)
  private Boolean skipBinaryFiles;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<DocIdSignatureNameDTO> documents = new ArrayList<>();

  public DocumentsForSignRequestDTO() {
  }

  public DocumentsForSignRequestDTO signingCertificate(byte[] signingCertificate) {
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

  public void setSigningCertificate(byte[] signingCertificate) {
    this.signingCertificate = signingCertificate;
  }


  public DocumentsForSignRequestDTO skipBinaryFiles(Boolean skipBinaryFiles) {
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

  public void setSkipBinaryFiles(Boolean skipBinaryFiles) {
    this.skipBinaryFiles = skipBinaryFiles;
  }


  public DocumentsForSignRequestDTO documents(List<DocIdSignatureNameDTO> documents) {
    this.documents = documents;
    return this;
  }

  public DocumentsForSignRequestDTO addDocumentsItem(DocIdSignatureNameDTO documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * Get documents
   * @return documents
   */
  @javax.annotation.Nullable
  public List<DocIdSignatureNameDTO> getDocuments() {
    return documents;
  }

  public void setDocuments(List<DocIdSignatureNameDTO> documents) {
    this.documents = documents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentsForSignRequestDTO documentsForSignRequestDTO = (DocumentsForSignRequestDTO) o;
    return Arrays.equals(this.signingCertificate, documentsForSignRequestDTO.signingCertificate) &&
        Objects.equals(this.skipBinaryFiles, documentsForSignRequestDTO.skipBinaryFiles) &&
        Objects.equals(this.documents, documentsForSignRequestDTO.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(signingCertificate), skipBinaryFiles, documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentsForSignRequestDTO {\n");
    sb.append("    signingCertificate: ").append(toIndentedString(signingCertificate)).append("\n");
    sb.append("    skipBinaryFiles: ").append(toIndentedString(skipBinaryFiles)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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
    openapiFields.add("signingCertificate");
    openapiFields.add("skipBinaryFiles");
    openapiFields.add("documents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentsForSignRequestDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentsForSignRequestDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentsForSignRequestDTO is not found in the empty JSON string", DocumentsForSignRequestDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentsForSignRequestDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentsForSignRequestDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("documents") != null && !jsonObj.get("documents").isJsonNull()) {
        JsonArray jsonArraydocuments = jsonObj.getAsJsonArray("documents");
        if (jsonArraydocuments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("documents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `documents` to be an array in the JSON string but got `%s`", jsonObj.get("documents").toString()));
          }

          // validate the optional field `documents` (array)
          for (int i = 0; i < jsonArraydocuments.size(); i++) {
            DocIdSignatureNameDTO.validateJsonElement(jsonArraydocuments.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentsForSignRequestDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentsForSignRequestDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentsForSignRequestDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentsForSignRequestDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentsForSignRequestDTO>() {
           @Override
           public void write(JsonWriter out, DocumentsForSignRequestDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentsForSignRequestDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentsForSignRequestDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentsForSignRequestDTO
   * @throws IOException if the JSON string is invalid with respect to DocumentsForSignRequestDTO
   */
  public static DocumentsForSignRequestDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentsForSignRequestDTO.class);
  }

  /**
   * Convert an instance of DocumentsForSignRequestDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
