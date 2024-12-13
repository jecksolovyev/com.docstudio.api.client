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
 * EnvelopeListColumnExtra
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class EnvelopeListColumnExtra {
  public static final String SERIALIZED_NAME_MIN_WIDTH = "minWidth";
  @SerializedName(SERIALIZED_NAME_MIN_WIDTH)
  @javax.annotation.Nullable
  private Integer minWidth;

  public static final String SERIALIZED_NAME_DEFAULT_WIDTH = "defaultWidth";
  @SerializedName(SERIALIZED_NAME_DEFAULT_WIDTH)
  @javax.annotation.Nullable
  private Integer defaultWidth;

  public EnvelopeListColumnExtra() {
  }

  public EnvelopeListColumnExtra minWidth(@javax.annotation.Nullable Integer minWidth) {
    this.minWidth = minWidth;
    return this;
  }

  /**
   * Get minWidth
   * @return minWidth
   */
  @javax.annotation.Nullable
  public Integer getMinWidth() {
    return minWidth;
  }

  public void setMinWidth(@javax.annotation.Nullable Integer minWidth) {
    this.minWidth = minWidth;
  }


  public EnvelopeListColumnExtra defaultWidth(@javax.annotation.Nullable Integer defaultWidth) {
    this.defaultWidth = defaultWidth;
    return this;
  }

  /**
   * Get defaultWidth
   * @return defaultWidth
   */
  @javax.annotation.Nullable
  public Integer getDefaultWidth() {
    return defaultWidth;
  }

  public void setDefaultWidth(@javax.annotation.Nullable Integer defaultWidth) {
    this.defaultWidth = defaultWidth;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeListColumnExtra envelopeListColumnExtra = (EnvelopeListColumnExtra) o;
    return Objects.equals(this.minWidth, envelopeListColumnExtra.minWidth) &&
        Objects.equals(this.defaultWidth, envelopeListColumnExtra.defaultWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minWidth, defaultWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeListColumnExtra {\n");
    sb.append("    minWidth: ").append(toIndentedString(minWidth)).append("\n");
    sb.append("    defaultWidth: ").append(toIndentedString(defaultWidth)).append("\n");
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
    openapiFields.add("minWidth");
    openapiFields.add("defaultWidth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopeListColumnExtra
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopeListColumnExtra.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopeListColumnExtra is not found in the empty JSON string", EnvelopeListColumnExtra.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvelopeListColumnExtra.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvelopeListColumnExtra` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopeListColumnExtra.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopeListColumnExtra' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopeListColumnExtra> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopeListColumnExtra.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopeListColumnExtra>() {
           @Override
           public void write(JsonWriter out, EnvelopeListColumnExtra value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvelopeListColumnExtra read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnvelopeListColumnExtra given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopeListColumnExtra
   * @throws IOException if the JSON string is invalid with respect to EnvelopeListColumnExtra
   */
  public static EnvelopeListColumnExtra fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopeListColumnExtra.class);
  }

  /**
   * Convert an instance of EnvelopeListColumnExtra to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

