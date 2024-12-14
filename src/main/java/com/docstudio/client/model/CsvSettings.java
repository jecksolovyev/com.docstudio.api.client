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
import java.util.Arrays;

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
 * CsvSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T18:50:48.300154-07:00[America/Edmonton]", comments = "Generator version: 7.10.0")
public class CsvSettings {
  public static final String SERIALIZED_NAME_HEADER_FIRST_ROW = "headerFirstRow";
  @SerializedName(SERIALIZED_NAME_HEADER_FIRST_ROW)
  @javax.annotation.Nullable
  private Boolean headerFirstRow;

  public static final String SERIALIZED_NAME_DELIMITER = "delimiter";
  @SerializedName(SERIALIZED_NAME_DELIMITER)
  @javax.annotation.Nullable
  private String delimiter;

  public static final String SERIALIZED_NAME_QUOTE = "quote";
  @SerializedName(SERIALIZED_NAME_QUOTE)
  @javax.annotation.Nullable
  private String quote;

  public static final String SERIALIZED_NAME_ESCAPE = "escape";
  @SerializedName(SERIALIZED_NAME_ESCAPE)
  @javax.annotation.Nullable
  private String escape;

  public CsvSettings() {
  }

  public CsvSettings headerFirstRow(@javax.annotation.Nullable Boolean headerFirstRow) {
    this.headerFirstRow = headerFirstRow;
    return this;
  }

  /**
   * Get headerFirstRow
   * @return headerFirstRow
   */
  @javax.annotation.Nullable
  public Boolean getHeaderFirstRow() {
    return headerFirstRow;
  }

  public void setHeaderFirstRow(@javax.annotation.Nullable Boolean headerFirstRow) {
    this.headerFirstRow = headerFirstRow;
  }


  public CsvSettings delimiter(@javax.annotation.Nullable String delimiter) {
    this.delimiter = delimiter;
    return this;
  }

  /**
   * Get delimiter
   * @return delimiter
   */
  @javax.annotation.Nullable
  public String getDelimiter() {
    return delimiter;
  }

  public void setDelimiter(@javax.annotation.Nullable String delimiter) {
    this.delimiter = delimiter;
  }


  public CsvSettings quote(@javax.annotation.Nullable String quote) {
    this.quote = quote;
    return this;
  }

  /**
   * Get quote
   * @return quote
   */
  @javax.annotation.Nullable
  public String getQuote() {
    return quote;
  }

  public void setQuote(@javax.annotation.Nullable String quote) {
    this.quote = quote;
  }


  public CsvSettings escape(@javax.annotation.Nullable String escape) {
    this.escape = escape;
    return this;
  }

  /**
   * Get escape
   * @return escape
   */
  @javax.annotation.Nullable
  public String getEscape() {
    return escape;
  }

  public void setEscape(@javax.annotation.Nullable String escape) {
    this.escape = escape;
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
   * @return the CsvSettings instance itself
   */
  public CsvSettings putAdditionalProperty(String key, Object value) {
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
    CsvSettings csvSettings = (CsvSettings) o;
    return Objects.equals(this.headerFirstRow, csvSettings.headerFirstRow) &&
        Objects.equals(this.delimiter, csvSettings.delimiter) &&
        Objects.equals(this.quote, csvSettings.quote) &&
        Objects.equals(this.escape, csvSettings.escape)&&
        Objects.equals(this.additionalProperties, csvSettings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerFirstRow, delimiter, quote, escape, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvSettings {\n");
    sb.append("    headerFirstRow: ").append(toIndentedString(headerFirstRow)).append("\n");
    sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    escape: ").append(toIndentedString(escape)).append("\n");
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
    openapiFields.add("headerFirstRow");
    openapiFields.add("delimiter");
    openapiFields.add("quote");
    openapiFields.add("escape");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CsvSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CsvSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CsvSettings is not found in the empty JSON string", CsvSettings.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("delimiter") != null && !jsonObj.get("delimiter").isJsonNull()) && !jsonObj.get("delimiter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delimiter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delimiter").toString()));
      }
      if ((jsonObj.get("quote") != null && !jsonObj.get("quote").isJsonNull()) && !jsonObj.get("quote").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quote` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quote").toString()));
      }
      if ((jsonObj.get("escape") != null && !jsonObj.get("escape").isJsonNull()) && !jsonObj.get("escape").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `escape` to be a primitive type in the JSON string but got `%s`", jsonObj.get("escape").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CsvSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CsvSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CsvSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CsvSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<CsvSettings>() {
           @Override
           public void write(JsonWriter out, CsvSettings value) throws IOException {
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
           public CsvSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CsvSettings instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CsvSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CsvSettings
   * @throws IOException if the JSON string is invalid with respect to CsvSettings
   */
  public static CsvSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CsvSettings.class);
  }

  /**
   * Convert an instance of CsvSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

