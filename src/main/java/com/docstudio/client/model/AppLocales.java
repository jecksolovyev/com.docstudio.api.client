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
 * Supported locales
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class AppLocales {
  public static final String SERIALIZED_NAME_DEFAULT_AS_LANGUAGE = "defaultAsLanguage";
  @SerializedName(SERIALIZED_NAME_DEFAULT_AS_LANGUAGE)
  private Boolean defaultAsLanguage;

  public static final String SERIALIZED_NAME_DEFAULT_COUNTRY = "defaultCountry";
  @SerializedName(SERIALIZED_NAME_DEFAULT_COUNTRY)
  private String defaultCountry;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_SUPPORTED = "supported";
  @SerializedName(SERIALIZED_NAME_SUPPORTED)
  private List<LocaleItemDTO> supported = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEFAULT_LOCALE = "defaultLocale";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LOCALE)
  private String defaultLocale;

  public AppLocales() {
  }

  public AppLocales defaultAsLanguage(Boolean defaultAsLanguage) {
    this.defaultAsLanguage = defaultAsLanguage;
    return this;
  }

  /**
   * Get defaultAsLanguage
   * @return defaultAsLanguage
   */
  @javax.annotation.Nullable
  public Boolean getDefaultAsLanguage() {
    return defaultAsLanguage;
  }

  public void setDefaultAsLanguage(Boolean defaultAsLanguage) {
    this.defaultAsLanguage = defaultAsLanguage;
  }


  public AppLocales defaultCountry(String defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

  /**
   * Get defaultCountry
   * @return defaultCountry
   */
  @javax.annotation.Nullable
  public String getDefaultCountry() {
    return defaultCountry;
  }

  public void setDefaultCountry(String defaultCountry) {
    this.defaultCountry = defaultCountry;
  }


  public AppLocales timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Get timezone
   * @return timezone
   */
  @javax.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public AppLocales supported(List<LocaleItemDTO> supported) {
    this.supported = supported;
    return this;
  }

  public AppLocales addSupportedItem(LocaleItemDTO supportedItem) {
    if (this.supported == null) {
      this.supported = new ArrayList<>();
    }
    this.supported.add(supportedItem);
    return this;
  }

  /**
   * Get supported
   * @return supported
   */
  @javax.annotation.Nullable
  public List<LocaleItemDTO> getSupported() {
    return supported;
  }

  public void setSupported(List<LocaleItemDTO> supported) {
    this.supported = supported;
  }


  public AppLocales defaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

  /**
   * Get defaultLocale
   * @return defaultLocale
   */
  @javax.annotation.Nullable
  public String getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppLocales appLocales = (AppLocales) o;
    return Objects.equals(this.defaultAsLanguage, appLocales.defaultAsLanguage) &&
        Objects.equals(this.defaultCountry, appLocales.defaultCountry) &&
        Objects.equals(this.timezone, appLocales.timezone) &&
        Objects.equals(this.supported, appLocales.supported) &&
        Objects.equals(this.defaultLocale, appLocales.defaultLocale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultAsLanguage, defaultCountry, timezone, supported, defaultLocale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLocales {\n");
    sb.append("    defaultAsLanguage: ").append(toIndentedString(defaultAsLanguage)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
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
    openapiFields.add("defaultAsLanguage");
    openapiFields.add("defaultCountry");
    openapiFields.add("timezone");
    openapiFields.add("supported");
    openapiFields.add("defaultLocale");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppLocales
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppLocales.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppLocales is not found in the empty JSON string", AppLocales.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppLocales.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppLocales` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("defaultCountry") != null && !jsonObj.get("defaultCountry").isJsonNull()) && !jsonObj.get("defaultCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultCountry").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if (jsonObj.get("supported") != null && !jsonObj.get("supported").isJsonNull()) {
        JsonArray jsonArraysupported = jsonObj.getAsJsonArray("supported");
        if (jsonArraysupported != null) {
          // ensure the json data is an array
          if (!jsonObj.get("supported").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `supported` to be an array in the JSON string but got `%s`", jsonObj.get("supported").toString()));
          }

          // validate the optional field `supported` (array)
          for (int i = 0; i < jsonArraysupported.size(); i++) {
            LocaleItemDTO.validateJsonElement(jsonArraysupported.get(i));
          };
        }
      }
      if ((jsonObj.get("defaultLocale") != null && !jsonObj.get("defaultLocale").isJsonNull()) && !jsonObj.get("defaultLocale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultLocale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultLocale").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppLocales.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppLocales' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppLocales> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppLocales.class));

       return (TypeAdapter<T>) new TypeAdapter<AppLocales>() {
           @Override
           public void write(JsonWriter out, AppLocales value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppLocales read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AppLocales given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppLocales
   * @throws IOException if the JSON string is invalid with respect to AppLocales
   */
  public static AppLocales fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppLocales.class);
  }

  /**
   * Convert an instance of AppLocales to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
