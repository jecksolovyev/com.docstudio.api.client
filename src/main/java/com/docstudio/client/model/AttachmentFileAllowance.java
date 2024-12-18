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
 * AttachmentFileAllowance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T17:18:48.308949400+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class AttachmentFileAllowance {
  public static final String SERIALIZED_NAME_EXTENSIONS = "extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  @javax.annotation.Nullable
  private Set<String> extensions = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_MIME_TYPES = "mimeTypes";
  @SerializedName(SERIALIZED_NAME_MIME_TYPES)
  @javax.annotation.Nullable
  private Set<String> mimeTypes = new LinkedHashSet<>();

  public AttachmentFileAllowance() {
  }

  public AttachmentFileAllowance extensions(@javax.annotation.Nullable Set<String> extensions) {
    this.extensions = extensions;
    return this;
  }

  public AttachmentFileAllowance addExtensionsItem(String extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new LinkedHashSet<>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

  /**
   * Get extensions
   * @return extensions
   */
  @javax.annotation.Nullable
  public Set<String> getExtensions() {
    return extensions;
  }

  public void setExtensions(@javax.annotation.Nullable Set<String> extensions) {
    this.extensions = extensions;
  }


  public AttachmentFileAllowance mimeTypes(@javax.annotation.Nullable Set<String> mimeTypes) {
    this.mimeTypes = mimeTypes;
    return this;
  }

  public AttachmentFileAllowance addMimeTypesItem(String mimeTypesItem) {
    if (this.mimeTypes == null) {
      this.mimeTypes = new LinkedHashSet<>();
    }
    this.mimeTypes.add(mimeTypesItem);
    return this;
  }

  /**
   * Get mimeTypes
   * @return mimeTypes
   */
  @javax.annotation.Nullable
  public Set<String> getMimeTypes() {
    return mimeTypes;
  }

  public void setMimeTypes(@javax.annotation.Nullable Set<String> mimeTypes) {
    this.mimeTypes = mimeTypes;
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
   * @return the AttachmentFileAllowance instance itself
   */
  public AttachmentFileAllowance putAdditionalProperty(String key, Object value) {
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
    AttachmentFileAllowance attachmentFileAllowance = (AttachmentFileAllowance) o;
    return Objects.equals(this.extensions, attachmentFileAllowance.extensions) &&
        Objects.equals(this.mimeTypes, attachmentFileAllowance.mimeTypes)&&
        Objects.equals(this.additionalProperties, attachmentFileAllowance.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensions, mimeTypes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentFileAllowance {\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
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
    openapiFields.add("extensions");
    openapiFields.add("mimeTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AttachmentFileAllowance
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AttachmentFileAllowance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttachmentFileAllowance is not found in the empty JSON string", AttachmentFileAllowance.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("extensions") != null && !jsonObj.get("extensions").isJsonNull() && !jsonObj.get("extensions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `extensions` to be an array in the JSON string but got `%s`", jsonObj.get("extensions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("mimeTypes") != null && !jsonObj.get("mimeTypes").isJsonNull() && !jsonObj.get("mimeTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mimeTypes` to be an array in the JSON string but got `%s`", jsonObj.get("mimeTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttachmentFileAllowance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttachmentFileAllowance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttachmentFileAllowance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttachmentFileAllowance.class));

       return (TypeAdapter<T>) new TypeAdapter<AttachmentFileAllowance>() {
           @Override
           public void write(JsonWriter out, AttachmentFileAllowance value) throws IOException {
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
           public AttachmentFileAllowance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AttachmentFileAllowance instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AttachmentFileAllowance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AttachmentFileAllowance
   * @throws IOException if the JSON string is invalid with respect to AttachmentFileAllowance
   */
  public static AttachmentFileAllowance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttachmentFileAllowance.class);
  }

  /**
   * Convert an instance of AttachmentFileAllowance to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

