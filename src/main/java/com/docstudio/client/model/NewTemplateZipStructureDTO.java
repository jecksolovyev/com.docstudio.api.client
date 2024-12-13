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
 * NewTemplateZipStructureDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class NewTemplateZipStructureDTO {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nonnull
  private String title;

  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  @javax.annotation.Nonnull
  private List<String> names = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEFAULT_DOWNLOAD_OPTIONS = "defaultDownloadOptions";
  @SerializedName(SERIALIZED_NAME_DEFAULT_DOWNLOAD_OPTIONS)
  @javax.annotation.Nullable
  private Boolean defaultDownloadOptions;

  public NewTemplateZipStructureDTO() {
  }

  public NewTemplateZipStructureDTO title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public NewTemplateZipStructureDTO names(@javax.annotation.Nonnull List<String> names) {
    this.names = names;
    return this;
  }

  public NewTemplateZipStructureDTO addNamesItem(String namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * Get names
   * @return names
   */
  @javax.annotation.Nonnull
  public List<String> getNames() {
    return names;
  }

  public void setNames(@javax.annotation.Nonnull List<String> names) {
    this.names = names;
  }


  public NewTemplateZipStructureDTO defaultDownloadOptions(@javax.annotation.Nullable Boolean defaultDownloadOptions) {
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
    NewTemplateZipStructureDTO newTemplateZipStructureDTO = (NewTemplateZipStructureDTO) o;
    return Objects.equals(this.title, newTemplateZipStructureDTO.title) &&
        Objects.equals(this.names, newTemplateZipStructureDTO.names) &&
        Objects.equals(this.defaultDownloadOptions, newTemplateZipStructureDTO.defaultDownloadOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, names, defaultDownloadOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewTemplateZipStructureDTO {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("names");
    openapiFields.add("defaultDownloadOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("names");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NewTemplateZipStructureDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NewTemplateZipStructureDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NewTemplateZipStructureDTO is not found in the empty JSON string", NewTemplateZipStructureDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NewTemplateZipStructureDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NewTemplateZipStructureDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NewTemplateZipStructureDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("names") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `names` to be an array in the JSON string but got `%s`", jsonObj.get("names").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NewTemplateZipStructureDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NewTemplateZipStructureDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NewTemplateZipStructureDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NewTemplateZipStructureDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<NewTemplateZipStructureDTO>() {
           @Override
           public void write(JsonWriter out, NewTemplateZipStructureDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NewTemplateZipStructureDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NewTemplateZipStructureDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NewTemplateZipStructureDTO
   * @throws IOException if the JSON string is invalid with respect to NewTemplateZipStructureDTO
   */
  public static NewTemplateZipStructureDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewTemplateZipStructureDTO.class);
  }

  /**
   * Convert an instance of NewTemplateZipStructureDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

