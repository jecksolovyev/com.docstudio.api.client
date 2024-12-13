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
 * DocumentCommentsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class DocumentCommentsDTO {
  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  @javax.annotation.Nullable
  private String documentId;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  @javax.annotation.Nullable
  private List<CommentThreadDTO> active = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOLVED = "resolved";
  @SerializedName(SERIALIZED_NAME_RESOLVED)
  @javax.annotation.Nullable
  private List<CommentThreadDTO> resolved = new ArrayList<>();

  public DocumentCommentsDTO() {
  }

  public DocumentCommentsDTO documentId(@javax.annotation.Nullable String documentId) {
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


  public DocumentCommentsDTO active(@javax.annotation.Nullable List<CommentThreadDTO> active) {
    this.active = active;
    return this;
  }

  public DocumentCommentsDTO addActiveItem(CommentThreadDTO activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<>();
    }
    this.active.add(activeItem);
    return this;
  }

  /**
   * Active comment threads
   * @return active
   */
  @javax.annotation.Nullable
  public List<CommentThreadDTO> getActive() {
    return active;
  }

  public void setActive(@javax.annotation.Nullable List<CommentThreadDTO> active) {
    this.active = active;
  }


  public DocumentCommentsDTO resolved(@javax.annotation.Nullable List<CommentThreadDTO> resolved) {
    this.resolved = resolved;
    return this;
  }

  public DocumentCommentsDTO addResolvedItem(CommentThreadDTO resolvedItem) {
    if (this.resolved == null) {
      this.resolved = new ArrayList<>();
    }
    this.resolved.add(resolvedItem);
    return this;
  }

  /**
   * Resolved comment threads
   * @return resolved
   */
  @javax.annotation.Nullable
  public List<CommentThreadDTO> getResolved() {
    return resolved;
  }

  public void setResolved(@javax.annotation.Nullable List<CommentThreadDTO> resolved) {
    this.resolved = resolved;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCommentsDTO documentCommentsDTO = (DocumentCommentsDTO) o;
    return Objects.equals(this.documentId, documentCommentsDTO.documentId) &&
        Objects.equals(this.active, documentCommentsDTO.active) &&
        Objects.equals(this.resolved, documentCommentsDTO.resolved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, active, resolved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCommentsDTO {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("resolved");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentCommentsDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentCommentsDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentCommentsDTO is not found in the empty JSON string", DocumentCommentsDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentCommentsDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentCommentsDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("documentId") != null && !jsonObj.get("documentId").isJsonNull()) && !jsonObj.get("documentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentId").toString()));
      }
      if (jsonObj.get("active") != null && !jsonObj.get("active").isJsonNull()) {
        JsonArray jsonArrayactive = jsonObj.getAsJsonArray("active");
        if (jsonArrayactive != null) {
          // ensure the json data is an array
          if (!jsonObj.get("active").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `active` to be an array in the JSON string but got `%s`", jsonObj.get("active").toString()));
          }

          // validate the optional field `active` (array)
          for (int i = 0; i < jsonArrayactive.size(); i++) {
            CommentThreadDTO.validateJsonElement(jsonArrayactive.get(i));
          };
        }
      }
      if (jsonObj.get("resolved") != null && !jsonObj.get("resolved").isJsonNull()) {
        JsonArray jsonArrayresolved = jsonObj.getAsJsonArray("resolved");
        if (jsonArrayresolved != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resolved").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resolved` to be an array in the JSON string but got `%s`", jsonObj.get("resolved").toString()));
          }

          // validate the optional field `resolved` (array)
          for (int i = 0; i < jsonArrayresolved.size(); i++) {
            CommentThreadDTO.validateJsonElement(jsonArrayresolved.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentCommentsDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentCommentsDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentCommentsDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentCommentsDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentCommentsDTO>() {
           @Override
           public void write(JsonWriter out, DocumentCommentsDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentCommentsDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentCommentsDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentCommentsDTO
   * @throws IOException if the JSON string is invalid with respect to DocumentCommentsDTO
   */
  public static DocumentCommentsDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentCommentsDTO.class);
  }

  /**
   * Convert an instance of DocumentCommentsDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

