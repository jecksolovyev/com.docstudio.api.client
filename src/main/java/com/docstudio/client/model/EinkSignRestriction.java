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
 * EinkSignRestriction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class EinkSignRestriction {
  public static final String SERIALIZED_NAME_MIN_PIXELS_EXPECTED = "minPixelsExpected";
  @SerializedName(SERIALIZED_NAME_MIN_PIXELS_EXPECTED)
  private Integer minPixelsExpected;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_MAX_LENGTH = "maxLength";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH)
  private Integer maxLength;

  public EinkSignRestriction() {
  }

  public EinkSignRestriction minPixelsExpected(Integer minPixelsExpected) {
    this.minPixelsExpected = minPixelsExpected;
    return this;
  }

  /**
   * Get minPixelsExpected
   * @return minPixelsExpected
   */
  @javax.annotation.Nullable
  public Integer getMinPixelsExpected() {
    return minPixelsExpected;
  }

  public void setMinPixelsExpected(Integer minPixelsExpected) {
    this.minPixelsExpected = minPixelsExpected;
  }


  public EinkSignRestriction width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
   */
  @javax.annotation.Nullable
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }


  public EinkSignRestriction height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
   */
  @javax.annotation.Nullable
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  public EinkSignRestriction maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Get maxLength
   * @return maxLength
   */
  @javax.annotation.Nullable
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EinkSignRestriction einkSignRestriction = (EinkSignRestriction) o;
    return Objects.equals(this.minPixelsExpected, einkSignRestriction.minPixelsExpected) &&
        Objects.equals(this.width, einkSignRestriction.width) &&
        Objects.equals(this.height, einkSignRestriction.height) &&
        Objects.equals(this.maxLength, einkSignRestriction.maxLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minPixelsExpected, width, height, maxLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EinkSignRestriction {\n");
    sb.append("    minPixelsExpected: ").append(toIndentedString(minPixelsExpected)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
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
    openapiFields.add("minPixelsExpected");
    openapiFields.add("width");
    openapiFields.add("height");
    openapiFields.add("maxLength");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EinkSignRestriction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EinkSignRestriction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EinkSignRestriction is not found in the empty JSON string", EinkSignRestriction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EinkSignRestriction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EinkSignRestriction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EinkSignRestriction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EinkSignRestriction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EinkSignRestriction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EinkSignRestriction.class));

       return (TypeAdapter<T>) new TypeAdapter<EinkSignRestriction>() {
           @Override
           public void write(JsonWriter out, EinkSignRestriction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EinkSignRestriction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EinkSignRestriction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EinkSignRestriction
   * @throws IOException if the JSON string is invalid with respect to EinkSignRestriction
   */
  public static EinkSignRestriction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EinkSignRestriction.class);
  }

  /**
   * Convert an instance of EinkSignRestriction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

