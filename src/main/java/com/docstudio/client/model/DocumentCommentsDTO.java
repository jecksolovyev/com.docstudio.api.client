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
import com.docstudio.client.model.CommentThreadDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * DocumentCommentsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-23T12:49:56.203839-06:00[America/Edmonton]", comments = "Generator version: 7.14.0")
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
   * @return the DocumentCommentsDTO instance itself
   */
  public DocumentCommentsDTO putAdditionalProperty(String key, Object value) {
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
    DocumentCommentsDTO documentCommentsDTO = (DocumentCommentsDTO) o;
    return Objects.equals(this.documentId, documentCommentsDTO.documentId) &&
        Objects.equals(this.active, documentCommentsDTO.active) &&
        Objects.equals(this.resolved, documentCommentsDTO.resolved)&&
        Objects.equals(this.additionalProperties, documentCommentsDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, active, resolved, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCommentsDTO {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("documentId", "active", "resolved"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
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
           public DocumentCommentsDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DocumentCommentsDTO instance = thisAdapter.fromJsonTree(jsonObj);
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

