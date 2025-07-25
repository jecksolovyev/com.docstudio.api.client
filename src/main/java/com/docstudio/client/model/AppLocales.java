/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R135.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import java.util.Objects;
import com.docstudio.client.model.LocaleItemDTO;
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
 * AppLocales
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-23T12:49:56.203839-06:00[America/Edmonton]", comments = "Generator version: 7.14.0")
public class AppLocales {
  public static final String SERIALIZED_NAME_DEFAULT_AS_LANGUAGE = "defaultAsLanguage";
  @SerializedName(SERIALIZED_NAME_DEFAULT_AS_LANGUAGE)
  @javax.annotation.Nullable
  private Boolean defaultAsLanguage;

  public static final String SERIALIZED_NAME_DEFAULT_COUNTRY = "defaultCountry";
  @SerializedName(SERIALIZED_NAME_DEFAULT_COUNTRY)
  @javax.annotation.Nullable
  private String defaultCountry;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  @javax.annotation.Nullable
  private String timezone;

  public static final String SERIALIZED_NAME_SUPPORTED = "supported";
  @SerializedName(SERIALIZED_NAME_SUPPORTED)
  @javax.annotation.Nullable
  private List<LocaleItemDTO> supported = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEFAULT_LOCALE = "defaultLocale";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LOCALE)
  @javax.annotation.Nullable
  private String defaultLocale;

  public AppLocales() {
  }

  public AppLocales defaultAsLanguage(@javax.annotation.Nullable Boolean defaultAsLanguage) {
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

  public void setDefaultAsLanguage(@javax.annotation.Nullable Boolean defaultAsLanguage) {
    this.defaultAsLanguage = defaultAsLanguage;
  }


  public AppLocales defaultCountry(@javax.annotation.Nullable String defaultCountry) {
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

  public void setDefaultCountry(@javax.annotation.Nullable String defaultCountry) {
    this.defaultCountry = defaultCountry;
  }


  public AppLocales timezone(@javax.annotation.Nullable String timezone) {
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

  public void setTimezone(@javax.annotation.Nullable String timezone) {
    this.timezone = timezone;
  }


  public AppLocales supported(@javax.annotation.Nullable List<LocaleItemDTO> supported) {
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

  public void setSupported(@javax.annotation.Nullable List<LocaleItemDTO> supported) {
    this.supported = supported;
  }


  public AppLocales defaultLocale(@javax.annotation.Nullable String defaultLocale) {
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

  public void setDefaultLocale(@javax.annotation.Nullable String defaultLocale) {
    this.defaultLocale = defaultLocale;
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
   * @return the AppLocales instance itself
   */
  public AppLocales putAdditionalProperty(String key, Object value) {
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
    AppLocales appLocales = (AppLocales) o;
    return Objects.equals(this.defaultAsLanguage, appLocales.defaultAsLanguage) &&
        Objects.equals(this.defaultCountry, appLocales.defaultCountry) &&
        Objects.equals(this.timezone, appLocales.timezone) &&
        Objects.equals(this.supported, appLocales.supported) &&
        Objects.equals(this.defaultLocale, appLocales.defaultLocale)&&
        Objects.equals(this.additionalProperties, appLocales.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultAsLanguage, defaultCountry, timezone, supported, defaultLocale, additionalProperties);
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
    openapiFields = new HashSet<String>(Arrays.asList("defaultAsLanguage", "defaultCountry", "timezone", "supported", "defaultLocale"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
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
           public AppLocales read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppLocales instance = thisAdapter.fromJsonTree(jsonObj);
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

