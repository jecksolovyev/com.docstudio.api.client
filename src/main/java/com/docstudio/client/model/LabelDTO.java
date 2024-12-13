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
 * Label to save
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class LabelDTO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_COLOR_TEXT = "colorText";
  @SerializedName(SERIALIZED_NAME_COLOR_TEXT)
  @javax.annotation.Nonnull
  private String colorText;

  public static final String SERIALIZED_NAME_COLOR_BG = "colorBg";
  @SerializedName(SERIALIZED_NAME_COLOR_BG)
  @javax.annotation.Nonnull
  private String colorBg;

  public LabelDTO() {
  }

  public LabelDTO uuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID of Label. Only for entity read from server.
   * @return uuid
   */
  @javax.annotation.Nullable
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
  }


  public LabelDTO name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Label name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public LabelDTO colorText(@javax.annotation.Nonnull String colorText) {
    this.colorText = colorText;
    return this;
  }

  /**
   * Label text color, hex, 6 symbols
   * @return colorText
   */
  @javax.annotation.Nonnull
  public String getColorText() {
    return colorText;
  }

  public void setColorText(@javax.annotation.Nonnull String colorText) {
    this.colorText = colorText;
  }


  public LabelDTO colorBg(@javax.annotation.Nonnull String colorBg) {
    this.colorBg = colorBg;
    return this;
  }

  /**
   * Label background color, hex, 6 symbols
   * @return colorBg
   */
  @javax.annotation.Nonnull
  public String getColorBg() {
    return colorBg;
  }

  public void setColorBg(@javax.annotation.Nonnull String colorBg) {
    this.colorBg = colorBg;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelDTO labelDTO = (LabelDTO) o;
    return Objects.equals(this.uuid, labelDTO.uuid) &&
        Objects.equals(this.name, labelDTO.name) &&
        Objects.equals(this.colorText, labelDTO.colorText) &&
        Objects.equals(this.colorBg, labelDTO.colorBg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, colorText, colorBg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelDTO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    colorText: ").append(toIndentedString(colorText)).append("\n");
    sb.append("    colorBg: ").append(toIndentedString(colorBg)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("name");
    openapiFields.add("colorText");
    openapiFields.add("colorBg");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("colorText");
    openapiRequiredFields.add("colorBg");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LabelDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LabelDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LabelDTO is not found in the empty JSON string", LabelDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LabelDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LabelDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LabelDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("colorText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `colorText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("colorText").toString()));
      }
      if (!jsonObj.get("colorBg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `colorBg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("colorBg").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LabelDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LabelDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LabelDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LabelDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<LabelDTO>() {
           @Override
           public void write(JsonWriter out, LabelDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LabelDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LabelDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LabelDTO
   * @throws IOException if the JSON string is invalid with respect to LabelDTO
   */
  public static LabelDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LabelDTO.class);
  }

  /**
   * Convert an instance of LabelDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

