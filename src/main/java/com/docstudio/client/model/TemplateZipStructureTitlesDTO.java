/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R120.9
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.docstudio.client.JSON;

/**
 * TemplateZipStructureTitlesDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T18:50:48.300154-07:00[America/Edmonton]", comments = "Generator version: 7.10.0")
public class TemplateZipStructureTitlesDTO {
  public static final String SERIALIZED_NAME_TITLES = "titles";
  @SerializedName(SERIALIZED_NAME_TITLES)
  @javax.annotation.Nullable
  private List<String> titles = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHOW_DEFAULT_DOWNLOAD_OPTIONS = "showDefaultDownloadOptions";
  @SerializedName(SERIALIZED_NAME_SHOW_DEFAULT_DOWNLOAD_OPTIONS)
  @javax.annotation.Nullable
  private Boolean showDefaultDownloadOptions;

  public TemplateZipStructureTitlesDTO() {
  }

  public TemplateZipStructureTitlesDTO titles(@javax.annotation.Nullable List<String> titles) {
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

  public void setTitles(@javax.annotation.Nullable List<String> titles) {
    this.titles = titles;
  }


  public TemplateZipStructureTitlesDTO showDefaultDownloadOptions(@javax.annotation.Nullable Boolean showDefaultDownloadOptions) {
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

  public void setShowDefaultDownloadOptions(@javax.annotation.Nullable Boolean showDefaultDownloadOptions) {
    this.showDefaultDownloadOptions = showDefaultDownloadOptions;
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
   * @return the TemplateZipStructureTitlesDTO instance itself
   */
  public TemplateZipStructureTitlesDTO putAdditionalProperty(String key, Object value) {
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
    TemplateZipStructureTitlesDTO templateZipStructureTitlesDTO = (TemplateZipStructureTitlesDTO) o;
    return Objects.equals(this.titles, templateZipStructureTitlesDTO.titles) &&
        Objects.equals(this.showDefaultDownloadOptions, templateZipStructureTitlesDTO.showDefaultDownloadOptions)&&
        Objects.equals(this.additionalProperties, templateZipStructureTitlesDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titles, showDefaultDownloadOptions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateZipStructureTitlesDTO {\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
    sb.append("    showDefaultDownloadOptions: ").append(toIndentedString(showDefaultDownloadOptions)).append("\n");
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
           public TemplateZipStructureTitlesDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TemplateZipStructureTitlesDTO instance = thisAdapter.fromJsonTree(jsonObj);
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

