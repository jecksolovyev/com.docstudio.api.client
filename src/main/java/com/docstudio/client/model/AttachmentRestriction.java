/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R121.17
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
 * AttachmentRestriction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T17:18:48.308949400+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class AttachmentRestriction {
  public static final String SERIALIZED_NAME_MAX_SIZE = "maxSize";
  @SerializedName(SERIALIZED_NAME_MAX_SIZE)
  @javax.annotation.Nullable
  private Long maxSize;

  public static final String SERIALIZED_NAME_TOTAL_MAX_SIZE = "totalMaxSize";
  @SerializedName(SERIALIZED_NAME_TOTAL_MAX_SIZE)
  @javax.annotation.Nullable
  private Long totalMaxSize;

  public static final String SERIALIZED_NAME_FILE_NAME_LENGTH = "fileNameLength";
  @SerializedName(SERIALIZED_NAME_FILE_NAME_LENGTH)
  @javax.annotation.Nullable
  private Integer fileNameLength;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  @javax.annotation.Nullable
  private AttachmentFileAllowance document;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  @javax.annotation.Nullable
  private AttachmentFileAllowance _file;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  @javax.annotation.Nullable
  private AttachmentFileAllowance image;

  public static final String SERIALIZED_NAME_ARCHIVE = "archive";
  @SerializedName(SERIALIZED_NAME_ARCHIVE)
  @javax.annotation.Nullable
  private AttachmentFileAllowance archive;

  public AttachmentRestriction() {
  }

  public AttachmentRestriction maxSize(@javax.annotation.Nullable Long maxSize) {
    this.maxSize = maxSize;
    return this;
  }

  /**
   * Get maxSize
   * @return maxSize
   */
  @javax.annotation.Nullable
  public Long getMaxSize() {
    return maxSize;
  }

  public void setMaxSize(@javax.annotation.Nullable Long maxSize) {
    this.maxSize = maxSize;
  }


  public AttachmentRestriction totalMaxSize(@javax.annotation.Nullable Long totalMaxSize) {
    this.totalMaxSize = totalMaxSize;
    return this;
  }

  /**
   * Get totalMaxSize
   * @return totalMaxSize
   */
  @javax.annotation.Nullable
  public Long getTotalMaxSize() {
    return totalMaxSize;
  }

  public void setTotalMaxSize(@javax.annotation.Nullable Long totalMaxSize) {
    this.totalMaxSize = totalMaxSize;
  }


  public AttachmentRestriction fileNameLength(@javax.annotation.Nullable Integer fileNameLength) {
    this.fileNameLength = fileNameLength;
    return this;
  }

  /**
   * Get fileNameLength
   * @return fileNameLength
   */
  @javax.annotation.Nullable
  public Integer getFileNameLength() {
    return fileNameLength;
  }

  public void setFileNameLength(@javax.annotation.Nullable Integer fileNameLength) {
    this.fileNameLength = fileNameLength;
  }


  public AttachmentRestriction document(@javax.annotation.Nullable AttachmentFileAllowance document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
   */
  @javax.annotation.Nullable
  public AttachmentFileAllowance getDocument() {
    return document;
  }

  public void setDocument(@javax.annotation.Nullable AttachmentFileAllowance document) {
    this.document = document;
  }


  public AttachmentRestriction _file(@javax.annotation.Nullable AttachmentFileAllowance _file) {
    this._file = _file;
    return this;
  }

  /**
   * Get _file
   * @return _file
   */
  @javax.annotation.Nullable
  public AttachmentFileAllowance getFile() {
    return _file;
  }

  public void setFile(@javax.annotation.Nullable AttachmentFileAllowance _file) {
    this._file = _file;
  }


  public AttachmentRestriction image(@javax.annotation.Nullable AttachmentFileAllowance image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @javax.annotation.Nullable
  public AttachmentFileAllowance getImage() {
    return image;
  }

  public void setImage(@javax.annotation.Nullable AttachmentFileAllowance image) {
    this.image = image;
  }


  public AttachmentRestriction archive(@javax.annotation.Nullable AttachmentFileAllowance archive) {
    this.archive = archive;
    return this;
  }

  /**
   * Get archive
   * @return archive
   */
  @javax.annotation.Nullable
  public AttachmentFileAllowance getArchive() {
    return archive;
  }

  public void setArchive(@javax.annotation.Nullable AttachmentFileAllowance archive) {
    this.archive = archive;
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
   * @return the AttachmentRestriction instance itself
   */
  public AttachmentRestriction putAdditionalProperty(String key, Object value) {
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
    AttachmentRestriction attachmentRestriction = (AttachmentRestriction) o;
    return Objects.equals(this.maxSize, attachmentRestriction.maxSize) &&
        Objects.equals(this.totalMaxSize, attachmentRestriction.totalMaxSize) &&
        Objects.equals(this.fileNameLength, attachmentRestriction.fileNameLength) &&
        Objects.equals(this.document, attachmentRestriction.document) &&
        Objects.equals(this._file, attachmentRestriction._file) &&
        Objects.equals(this.image, attachmentRestriction.image) &&
        Objects.equals(this.archive, attachmentRestriction.archive)&&
        Objects.equals(this.additionalProperties, attachmentRestriction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSize, totalMaxSize, fileNameLength, document, _file, image, archive, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentRestriction {\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    totalMaxSize: ").append(toIndentedString(totalMaxSize)).append("\n");
    sb.append("    fileNameLength: ").append(toIndentedString(fileNameLength)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
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
    openapiFields.add("maxSize");
    openapiFields.add("totalMaxSize");
    openapiFields.add("fileNameLength");
    openapiFields.add("document");
    openapiFields.add("file");
    openapiFields.add("image");
    openapiFields.add("archive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AttachmentRestriction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AttachmentRestriction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttachmentRestriction is not found in the empty JSON string", AttachmentRestriction.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `document`
      if (jsonObj.get("document") != null && !jsonObj.get("document").isJsonNull()) {
        AttachmentFileAllowance.validateJsonElement(jsonObj.get("document"));
      }
      // validate the optional field `file`
      if (jsonObj.get("file") != null && !jsonObj.get("file").isJsonNull()) {
        AttachmentFileAllowance.validateJsonElement(jsonObj.get("file"));
      }
      // validate the optional field `image`
      if (jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) {
        AttachmentFileAllowance.validateJsonElement(jsonObj.get("image"));
      }
      // validate the optional field `archive`
      if (jsonObj.get("archive") != null && !jsonObj.get("archive").isJsonNull()) {
        AttachmentFileAllowance.validateJsonElement(jsonObj.get("archive"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttachmentRestriction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttachmentRestriction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttachmentRestriction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttachmentRestriction.class));

       return (TypeAdapter<T>) new TypeAdapter<AttachmentRestriction>() {
           @Override
           public void write(JsonWriter out, AttachmentRestriction value) throws IOException {
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
           public AttachmentRestriction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AttachmentRestriction instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AttachmentRestriction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AttachmentRestriction
   * @throws IOException if the JSON string is invalid with respect to AttachmentRestriction
   */
  public static AttachmentRestriction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttachmentRestriction.class);
  }

  /**
   * Convert an instance of AttachmentRestriction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

