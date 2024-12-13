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
 * ImageRestriction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class ImageRestriction {
  public static final String SERIALIZED_NAME_EXTENSIONS = "extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  @javax.annotation.Nullable
  private Set<String> extensions = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_MIME_TYPES = "mimeTypes";
  @SerializedName(SERIALIZED_NAME_MIME_TYPES)
  @javax.annotation.Nullable
  private Set<String> mimeTypes = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_MAX_SIZE = "maxSize";
  @SerializedName(SERIALIZED_NAME_MAX_SIZE)
  @javax.annotation.Nullable
  private Integer maxSize;

  public static final String SERIALIZED_NAME_MAX_WIDTH = "maxWidth";
  @SerializedName(SERIALIZED_NAME_MAX_WIDTH)
  @javax.annotation.Nullable
  private Integer maxWidth;

  public static final String SERIALIZED_NAME_MAX_HEIGHT = "maxHeight";
  @SerializedName(SERIALIZED_NAME_MAX_HEIGHT)
  @javax.annotation.Nullable
  private Integer maxHeight;

  public ImageRestriction() {
  }

  public ImageRestriction extensions(@javax.annotation.Nullable Set<String> extensions) {
    this.extensions = extensions;
    return this;
  }

  public ImageRestriction addExtensionsItem(String extensionsItem) {
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


  public ImageRestriction mimeTypes(@javax.annotation.Nullable Set<String> mimeTypes) {
    this.mimeTypes = mimeTypes;
    return this;
  }

  public ImageRestriction addMimeTypesItem(String mimeTypesItem) {
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


  public ImageRestriction maxSize(@javax.annotation.Nullable Integer maxSize) {
    this.maxSize = maxSize;
    return this;
  }

  /**
   * Get maxSize
   * @return maxSize
   */
  @javax.annotation.Nullable
  public Integer getMaxSize() {
    return maxSize;
  }

  public void setMaxSize(@javax.annotation.Nullable Integer maxSize) {
    this.maxSize = maxSize;
  }


  public ImageRestriction maxWidth(@javax.annotation.Nullable Integer maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

  /**
   * Get maxWidth
   * @return maxWidth
   */
  @javax.annotation.Nullable
  public Integer getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(@javax.annotation.Nullable Integer maxWidth) {
    this.maxWidth = maxWidth;
  }


  public ImageRestriction maxHeight(@javax.annotation.Nullable Integer maxHeight) {
    this.maxHeight = maxHeight;
    return this;
  }

  /**
   * Get maxHeight
   * @return maxHeight
   */
  @javax.annotation.Nullable
  public Integer getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(@javax.annotation.Nullable Integer maxHeight) {
    this.maxHeight = maxHeight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageRestriction imageRestriction = (ImageRestriction) o;
    return Objects.equals(this.extensions, imageRestriction.extensions) &&
        Objects.equals(this.mimeTypes, imageRestriction.mimeTypes) &&
        Objects.equals(this.maxSize, imageRestriction.maxSize) &&
        Objects.equals(this.maxWidth, imageRestriction.maxWidth) &&
        Objects.equals(this.maxHeight, imageRestriction.maxHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensions, mimeTypes, maxSize, maxWidth, maxHeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageRestriction {\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
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
    openapiFields.add("maxSize");
    openapiFields.add("maxWidth");
    openapiFields.add("maxHeight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImageRestriction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImageRestriction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImageRestriction is not found in the empty JSON string", ImageRestriction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImageRestriction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImageRestriction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!ImageRestriction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImageRestriction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImageRestriction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImageRestriction.class));

       return (TypeAdapter<T>) new TypeAdapter<ImageRestriction>() {
           @Override
           public void write(JsonWriter out, ImageRestriction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImageRestriction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ImageRestriction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImageRestriction
   * @throws IOException if the JSON string is invalid with respect to ImageRestriction
   */
  public static ImageRestriction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImageRestriction.class);
  }

  /**
   * Convert an instance of ImageRestriction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

