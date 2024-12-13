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
 * TemplateZipStructureDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class TemplateZipStructureDTO {
  public static final String SERIALIZED_NAME_ZIP_ENTITIES = "zipEntities";
  @SerializedName(SERIALIZED_NAME_ZIP_ENTITIES)
  @javax.annotation.Nullable
  private List<ZipEntityDTO> zipEntities = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEFAULT_DOWNLOAD_OPTIONS = "defaultDownloadOptions";
  @SerializedName(SERIALIZED_NAME_DEFAULT_DOWNLOAD_OPTIONS)
  @javax.annotation.Nullable
  private Boolean defaultDownloadOptions;

  public TemplateZipStructureDTO() {
  }

  public TemplateZipStructureDTO zipEntities(@javax.annotation.Nullable List<ZipEntityDTO> zipEntities) {
    this.zipEntities = zipEntities;
    return this;
  }

  public TemplateZipStructureDTO addZipEntitiesItem(ZipEntityDTO zipEntitiesItem) {
    if (this.zipEntities == null) {
      this.zipEntities = new ArrayList<>();
    }
    this.zipEntities.add(zipEntitiesItem);
    return this;
  }

  /**
   * Get zipEntities
   * @return zipEntities
   */
  @javax.annotation.Nullable
  public List<ZipEntityDTO> getZipEntities() {
    return zipEntities;
  }

  public void setZipEntities(@javax.annotation.Nullable List<ZipEntityDTO> zipEntities) {
    this.zipEntities = zipEntities;
  }


  public TemplateZipStructureDTO defaultDownloadOptions(@javax.annotation.Nullable Boolean defaultDownloadOptions) {
    this.defaultDownloadOptions = defaultDownloadOptions;
    return this;
  }

  /**
   * Get defaultDownloadOptions
   * @return defaultDownloadOptions
   */
  @javax.annotation.Nullable
  public Boolean getDefaultDownloadOptions() {
    return defaultDownloadOptions;
  }

  public void setDefaultDownloadOptions(@javax.annotation.Nullable Boolean defaultDownloadOptions) {
    this.defaultDownloadOptions = defaultDownloadOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateZipStructureDTO templateZipStructureDTO = (TemplateZipStructureDTO) o;
    return Objects.equals(this.zipEntities, templateZipStructureDTO.zipEntities) &&
        Objects.equals(this.defaultDownloadOptions, templateZipStructureDTO.defaultDownloadOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipEntities, defaultDownloadOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateZipStructureDTO {\n");
    sb.append("    zipEntities: ").append(toIndentedString(zipEntities)).append("\n");
    sb.append("    defaultDownloadOptions: ").append(toIndentedString(defaultDownloadOptions)).append("\n");
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
    openapiFields.add("zipEntities");
    openapiFields.add("defaultDownloadOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TemplateZipStructureDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TemplateZipStructureDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateZipStructureDTO is not found in the empty JSON string", TemplateZipStructureDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TemplateZipStructureDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateZipStructureDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("zipEntities") != null && !jsonObj.get("zipEntities").isJsonNull()) {
        JsonArray jsonArrayzipEntities = jsonObj.getAsJsonArray("zipEntities");
        if (jsonArrayzipEntities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("zipEntities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `zipEntities` to be an array in the JSON string but got `%s`", jsonObj.get("zipEntities").toString()));
          }

          // validate the optional field `zipEntities` (array)
          for (int i = 0; i < jsonArrayzipEntities.size(); i++) {
            ZipEntityDTO.validateJsonElement(jsonArrayzipEntities.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateZipStructureDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateZipStructureDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateZipStructureDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateZipStructureDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateZipStructureDTO>() {
           @Override
           public void write(JsonWriter out, TemplateZipStructureDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateZipStructureDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TemplateZipStructureDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TemplateZipStructureDTO
   * @throws IOException if the JSON string is invalid with respect to TemplateZipStructureDTO
   */
  public static TemplateZipStructureDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateZipStructureDTO.class);
  }

  /**
   * Convert an instance of TemplateZipStructureDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

