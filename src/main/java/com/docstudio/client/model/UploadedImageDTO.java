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
 * UploadedImageDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class UploadedImageDTO {
  public static final String SERIALIZED_NAME_IMAGE_UUID = "imageUuid";
  @SerializedName(SERIALIZED_NAME_IMAGE_UUID)
  @javax.annotation.Nullable
  private UUID imageUuid;

  public static final String SERIALIZED_NAME_SRC = "src";
  @SerializedName(SERIALIZED_NAME_SRC)
  @javax.annotation.Nullable
  private String src;

  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  @javax.annotation.Nullable
  private String hash;

  public UploadedImageDTO() {
  }

  public UploadedImageDTO imageUuid(@javax.annotation.Nullable UUID imageUuid) {
    this.imageUuid = imageUuid;
    return this;
  }

  /**
   * Get imageUuid
   * @return imageUuid
   */
  @javax.annotation.Nullable
  public UUID getImageUuid() {
    return imageUuid;
  }

  public void setImageUuid(@javax.annotation.Nullable UUID imageUuid) {
    this.imageUuid = imageUuid;
  }


  public UploadedImageDTO src(@javax.annotation.Nullable String src) {
    this.src = src;
    return this;
  }

  /**
   * Get src
   * @return src
   */
  @javax.annotation.Nullable
  public String getSrc() {
    return src;
  }

  public void setSrc(@javax.annotation.Nullable String src) {
    this.src = src;
  }


  public UploadedImageDTO hash(@javax.annotation.Nullable String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Get hash
   * @return hash
   */
  @javax.annotation.Nullable
  public String getHash() {
    return hash;
  }

  public void setHash(@javax.annotation.Nullable String hash) {
    this.hash = hash;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedImageDTO uploadedImageDTO = (UploadedImageDTO) o;
    return Objects.equals(this.imageUuid, uploadedImageDTO.imageUuid) &&
        Objects.equals(this.src, uploadedImageDTO.src) &&
        Objects.equals(this.hash, uploadedImageDTO.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUuid, src, hash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedImageDTO {\n");
    sb.append("    imageUuid: ").append(toIndentedString(imageUuid)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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
    openapiFields.add("imageUuid");
    openapiFields.add("src");
    openapiFields.add("hash");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UploadedImageDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UploadedImageDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadedImageDTO is not found in the empty JSON string", UploadedImageDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UploadedImageDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UploadedImageDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("imageUuid") != null && !jsonObj.get("imageUuid").isJsonNull()) && !jsonObj.get("imageUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUuid").toString()));
      }
      if ((jsonObj.get("src") != null && !jsonObj.get("src").isJsonNull()) && !jsonObj.get("src").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `src` to be a primitive type in the JSON string but got `%s`", jsonObj.get("src").toString()));
      }
      if ((jsonObj.get("hash") != null && !jsonObj.get("hash").isJsonNull()) && !jsonObj.get("hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hash").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadedImageDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadedImageDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadedImageDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadedImageDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadedImageDTO>() {
           @Override
           public void write(JsonWriter out, UploadedImageDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UploadedImageDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UploadedImageDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UploadedImageDTO
   * @throws IOException if the JSON string is invalid with respect to UploadedImageDTO
   */
  public static UploadedImageDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadedImageDTO.class);
  }

  /**
   * Convert an instance of UploadedImageDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

