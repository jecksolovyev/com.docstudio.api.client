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
 * PdfPageSizes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class PdfPageSizes {
  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private List<Float> width = new ArrayList<>();

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private List<Float> height = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROTATIONS = "rotations";
  @SerializedName(SERIALIZED_NAME_ROTATIONS)
  private List<Integer> rotations = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private Integer pages;

  public PdfPageSizes() {
  }

  public PdfPageSizes width(List<Float> width) {
    this.width = width;
    return this;
  }

  public PdfPageSizes addWidthItem(Float widthItem) {
    if (this.width == null) {
      this.width = new ArrayList<>();
    }
    this.width.add(widthItem);
    return this;
  }

  /**
   * Get width
   * @return width
   */
  @javax.annotation.Nullable
  public List<Float> getWidth() {
    return width;
  }

  public void setWidth(List<Float> width) {
    this.width = width;
  }


  public PdfPageSizes height(List<Float> height) {
    this.height = height;
    return this;
  }

  public PdfPageSizes addHeightItem(Float heightItem) {
    if (this.height == null) {
      this.height = new ArrayList<>();
    }
    this.height.add(heightItem);
    return this;
  }

  /**
   * Get height
   * @return height
   */
  @javax.annotation.Nullable
  public List<Float> getHeight() {
    return height;
  }

  public void setHeight(List<Float> height) {
    this.height = height;
  }


  public PdfPageSizes rotations(List<Integer> rotations) {
    this.rotations = rotations;
    return this;
  }

  public PdfPageSizes addRotationsItem(Integer rotationsItem) {
    if (this.rotations == null) {
      this.rotations = new ArrayList<>();
    }
    this.rotations.add(rotationsItem);
    return this;
  }

  /**
   * Get rotations
   * @return rotations
   */
  @javax.annotation.Nullable
  public List<Integer> getRotations() {
    return rotations;
  }

  public void setRotations(List<Integer> rotations) {
    this.rotations = rotations;
  }


  public PdfPageSizes pages(Integer pages) {
    this.pages = pages;
    return this;
  }

  /**
   * Get pages
   * @return pages
   */
  @javax.annotation.Nullable
  public Integer getPages() {
    return pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfPageSizes pdfPageSizes = (PdfPageSizes) o;
    return Objects.equals(this.width, pdfPageSizes.width) &&
        Objects.equals(this.height, pdfPageSizes.height) &&
        Objects.equals(this.rotations, pdfPageSizes.rotations) &&
        Objects.equals(this.pages, pdfPageSizes.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, rotations, pages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfPageSizes {\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    rotations: ").append(toIndentedString(rotations)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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
    openapiFields.add("width");
    openapiFields.add("height");
    openapiFields.add("rotations");
    openapiFields.add("pages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PdfPageSizes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PdfPageSizes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PdfPageSizes is not found in the empty JSON string", PdfPageSizes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PdfPageSizes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PdfPageSizes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("width") != null && !jsonObj.get("width").isJsonNull() && !jsonObj.get("width").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `width` to be an array in the JSON string but got `%s`", jsonObj.get("width").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("height") != null && !jsonObj.get("height").isJsonNull() && !jsonObj.get("height").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `height` to be an array in the JSON string but got `%s`", jsonObj.get("height").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rotations") != null && !jsonObj.get("rotations").isJsonNull() && !jsonObj.get("rotations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotations` to be an array in the JSON string but got `%s`", jsonObj.get("rotations").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PdfPageSizes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PdfPageSizes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PdfPageSizes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PdfPageSizes.class));

       return (TypeAdapter<T>) new TypeAdapter<PdfPageSizes>() {
           @Override
           public void write(JsonWriter out, PdfPageSizes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PdfPageSizes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PdfPageSizes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PdfPageSizes
   * @throws IOException if the JSON string is invalid with respect to PdfPageSizes
   */
  public static PdfPageSizes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PdfPageSizes.class);
  }

  /**
   * Convert an instance of PdfPageSizes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
