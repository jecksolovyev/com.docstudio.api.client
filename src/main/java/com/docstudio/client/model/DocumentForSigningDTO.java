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
 * DocumentForSigningDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class DocumentForSigningDTO {
  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private String documentId;

  public static final String SERIALIZED_NAME_XML_NAME = "xmlName";
  @SerializedName(SERIALIZED_NAME_XML_NAME)
  private String xmlName;

  public static final String SERIALIZED_NAME_XML = "xml";
  @SerializedName(SERIALIZED_NAME_XML)
  private String xml;

  public static final String SERIALIZED_NAME_XML_HASH = "xmlHash";
  @SerializedName(SERIALIZED_NAME_XML_HASH)
  private byte[] xmlHash;

  public static final String SERIALIZED_NAME_BINARY_FILE_NAME = "binaryFileName";
  @SerializedName(SERIALIZED_NAME_BINARY_FILE_NAME)
  private String binaryFileName;

  public static final String SERIALIZED_NAME_BINARY_FILE = "binaryFile";
  @SerializedName(SERIALIZED_NAME_BINARY_FILE)
  private byte[] binaryFile;

  public static final String SERIALIZED_NAME_BINARY_HASH = "binaryHash";
  @SerializedName(SERIALIZED_NAME_BINARY_HASH)
  private byte[] binaryHash;

  public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
  @SerializedName(SERIALIZED_NAME_SIGNATURES)
  private List<RequiredSignatureDTO> signatures = new ArrayList<>();

  public DocumentForSigningDTO() {
  }

  public DocumentForSigningDTO documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * ID of document
   * @return documentId
   */
  @javax.annotation.Nullable
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public DocumentForSigningDTO xmlName(String xmlName) {
    this.xmlName = xmlName;
    return this;
  }

  /**
   * XML file name
   * @return xmlName
   */
  @javax.annotation.Nullable
  public String getXmlName() {
    return xmlName;
  }

  public void setXmlName(String xmlName) {
    this.xmlName = xmlName;
  }


  public DocumentForSigningDTO xml(String xml) {
    this.xml = xml;
    return this;
  }

  /**
   * XML for signing
   * @return xml
   */
  @javax.annotation.Nullable
  public String getXml() {
    return xml;
  }

  public void setXml(String xml) {
    this.xml = xml;
  }


  public DocumentForSigningDTO xmlHash(byte[] xmlHash) {
    this.xmlHash = xmlHash;
    return this;
  }

  /**
   * XML hash for signing
   * @return xmlHash
   */
  @javax.annotation.Nullable
  public byte[] getXmlHash() {
    return xmlHash;
  }

  public void setXmlHash(byte[] xmlHash) {
    this.xmlHash = xmlHash;
  }


  public DocumentForSigningDTO binaryFileName(String binaryFileName) {
    this.binaryFileName = binaryFileName;
    return this;
  }

  /**
   * Binary file name
   * @return binaryFileName
   */
  @javax.annotation.Nullable
  public String getBinaryFileName() {
    return binaryFileName;
  }

  public void setBinaryFileName(String binaryFileName) {
    this.binaryFileName = binaryFileName;
  }


  public DocumentForSigningDTO binaryFile(byte[] binaryFile) {
    this.binaryFile = binaryFile;
    return this;
  }

  /**
   * Binary file for signing
   * @return binaryFile
   */
  @javax.annotation.Nullable
  public byte[] getBinaryFile() {
    return binaryFile;
  }

  public void setBinaryFile(byte[] binaryFile) {
    this.binaryFile = binaryFile;
  }


  public DocumentForSigningDTO binaryHash(byte[] binaryHash) {
    this.binaryHash = binaryHash;
    return this;
  }

  /**
   * Binary file hash for signing
   * @return binaryHash
   */
  @javax.annotation.Nullable
  public byte[] getBinaryHash() {
    return binaryHash;
  }

  public void setBinaryHash(byte[] binaryHash) {
    this.binaryHash = binaryHash;
  }


  public DocumentForSigningDTO signatures(List<RequiredSignatureDTO> signatures) {
    this.signatures = signatures;
    return this;
  }

  public DocumentForSigningDTO addSignaturesItem(RequiredSignatureDTO signaturesItem) {
    if (this.signatures == null) {
      this.signatures = new ArrayList<>();
    }
    this.signatures.add(signaturesItem);
    return this;
  }

  /**
   * Signatures
   * @return signatures
   */
  @javax.annotation.Nullable
  public List<RequiredSignatureDTO> getSignatures() {
    return signatures;
  }

  public void setSignatures(List<RequiredSignatureDTO> signatures) {
    this.signatures = signatures;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentForSigningDTO documentForSigningDTO = (DocumentForSigningDTO) o;
    return Objects.equals(this.documentId, documentForSigningDTO.documentId) &&
        Objects.equals(this.xmlName, documentForSigningDTO.xmlName) &&
        Objects.equals(this.xml, documentForSigningDTO.xml) &&
        Arrays.equals(this.xmlHash, documentForSigningDTO.xmlHash) &&
        Objects.equals(this.binaryFileName, documentForSigningDTO.binaryFileName) &&
        Arrays.equals(this.binaryFile, documentForSigningDTO.binaryFile) &&
        Arrays.equals(this.binaryHash, documentForSigningDTO.binaryHash) &&
        Objects.equals(this.signatures, documentForSigningDTO.signatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, xmlName, xml, Arrays.hashCode(xmlHash), binaryFileName, Arrays.hashCode(binaryFile), Arrays.hashCode(binaryHash), signatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentForSigningDTO {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    xmlName: ").append(toIndentedString(xmlName)).append("\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
    sb.append("    xmlHash: ").append(toIndentedString(xmlHash)).append("\n");
    sb.append("    binaryFileName: ").append(toIndentedString(binaryFileName)).append("\n");
    sb.append("    binaryFile: ").append(toIndentedString(binaryFile)).append("\n");
    sb.append("    binaryHash: ").append(toIndentedString(binaryHash)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
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
    openapiFields.add("xmlName");
    openapiFields.add("xml");
    openapiFields.add("xmlHash");
    openapiFields.add("binaryFileName");
    openapiFields.add("binaryFile");
    openapiFields.add("binaryHash");
    openapiFields.add("signatures");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentForSigningDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentForSigningDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentForSigningDTO is not found in the empty JSON string", DocumentForSigningDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentForSigningDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentForSigningDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("documentId") != null && !jsonObj.get("documentId").isJsonNull()) && !jsonObj.get("documentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentId").toString()));
      }
      if ((jsonObj.get("xmlName") != null && !jsonObj.get("xmlName").isJsonNull()) && !jsonObj.get("xmlName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xmlName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xmlName").toString()));
      }
      if ((jsonObj.get("xml") != null && !jsonObj.get("xml").isJsonNull()) && !jsonObj.get("xml").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xml` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xml").toString()));
      }
      if ((jsonObj.get("binaryFileName") != null && !jsonObj.get("binaryFileName").isJsonNull()) && !jsonObj.get("binaryFileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `binaryFileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("binaryFileName").toString()));
      }
      if (jsonObj.get("signatures") != null && !jsonObj.get("signatures").isJsonNull()) {
        JsonArray jsonArraysignatures = jsonObj.getAsJsonArray("signatures");
        if (jsonArraysignatures != null) {
          // ensure the json data is an array
          if (!jsonObj.get("signatures").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `signatures` to be an array in the JSON string but got `%s`", jsonObj.get("signatures").toString()));
          }

          // validate the optional field `signatures` (array)
          for (int i = 0; i < jsonArraysignatures.size(); i++) {
            RequiredSignatureDTO.validateJsonElement(jsonArraysignatures.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentForSigningDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentForSigningDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentForSigningDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentForSigningDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentForSigningDTO>() {
           @Override
           public void write(JsonWriter out, DocumentForSigningDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentForSigningDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentForSigningDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentForSigningDTO
   * @throws IOException if the JSON string is invalid with respect to DocumentForSigningDTO
   */
  public static DocumentForSigningDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentForSigningDTO.class);
  }

  /**
   * Convert an instance of DocumentForSigningDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

