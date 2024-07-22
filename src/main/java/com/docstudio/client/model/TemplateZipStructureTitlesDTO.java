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

import java.util.Objects;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.docstudio.client.JSON;

/**
 * TemplateZipStructureTitlesDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class TemplateZipStructureTitlesDTO {
  public static final String SERIALIZED_NAME_TITLES = "titles";
  @SerializedName(SERIALIZED_NAME_TITLES)
  private List<String> titles = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHOW_DEFAULT_DOWNLOAD_OPTIONS = "showDefaultDownloadOptions";
  @SerializedName(SERIALIZED_NAME_SHOW_DEFAULT_DOWNLOAD_OPTIONS)
  private Boolean showDefaultDownloadOptions;

  public TemplateZipStructureTitlesDTO() {
  }

  public TemplateZipStructureTitlesDTO titles(List<String> titles) {
    this.titles = titles;
    return this;
  }

  public TemplateZipStructureTitlesDTO addTitlesItem(String titlesItem) {
    if (this.titles == null) {
      this.titles = new ArrayList<>();
    }
    this.titles.add(titlesItem);
    return this;
  }

  /**
   * Get titles
   * @return titles
   */
  @javax.annotation.Nullable
  public List<String> getTitles() {
    return titles;
  }

  public void setTitles(List<String> titles) {
    this.titles = titles;
  }


  public TemplateZipStructureTitlesDTO showDefaultDownloadOptions(Boolean showDefaultDownloadOptions) {
    this.showDefaultDownloadOptions = showDefaultDownloadOptions;
    return this;
  }

  /**
   * Get showDefaultDownloadOptions
   * @return showDefaultDownloadOptions
   */
  @javax.annotation.Nullable
  public Boolean getShowDefaultDownloadOptions() {
    return showDefaultDownloadOptions;
  }

  public void setShowDefaultDownloadOptions(Boolean showDefaultDownloadOptions) {
    this.showDefaultDownloadOptions = showDefaultDownloadOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateZipStructureTitlesDTO templateZipStructureTitlesDTO = (TemplateZipStructureTitlesDTO) o;
    return Objects.equals(this.titles, templateZipStructureTitlesDTO.titles) &&
        Objects.equals(this.showDefaultDownloadOptions, templateZipStructureTitlesDTO.showDefaultDownloadOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titles, showDefaultDownloadOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateZipStructureTitlesDTO {\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
    sb.append("    showDefaultDownloadOptions: ").append(toIndentedString(showDefaultDownloadOptions)).append("\n");
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
    openapiFields.add("titles");
    openapiFields.add("showDefaultDownloadOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TemplateZipStructureTitlesDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TemplateZipStructureTitlesDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateZipStructureTitlesDTO is not found in the empty JSON string", TemplateZipStructureTitlesDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TemplateZipStructureTitlesDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateZipStructureTitlesDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("titles") != null && !jsonObj.get("titles").isJsonNull() && !jsonObj.get("titles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `titles` to be an array in the JSON string but got `%s`", jsonObj.get("titles").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateZipStructureTitlesDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateZipStructureTitlesDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateZipStructureTitlesDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateZipStructureTitlesDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateZipStructureTitlesDTO>() {
           @Override
           public void write(JsonWriter out, TemplateZipStructureTitlesDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateZipStructureTitlesDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TemplateZipStructureTitlesDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TemplateZipStructureTitlesDTO
   * @throws IOException if the JSON string is invalid with respect to TemplateZipStructureTitlesDTO
   */
  public static TemplateZipStructureTitlesDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateZipStructureTitlesDTO.class);
  }

  /**
   * Convert an instance of TemplateZipStructureTitlesDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
