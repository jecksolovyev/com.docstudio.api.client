/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R121.14
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
 * Additional JS scripts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:19:30.369078200+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class AppPageScripts {
  public static final String SERIALIZED_NAME_HEAD = "head";
  @SerializedName(SERIALIZED_NAME_HEAD)
  @javax.annotation.Nullable
  private String head;

  public static final String SERIALIZED_NAME_BODY_FIRST = "bodyFirst";
  @SerializedName(SERIALIZED_NAME_BODY_FIRST)
  @javax.annotation.Nullable
  private String bodyFirst;

  public static final String SERIALIZED_NAME_BODY_LAST = "bodyLast";
  @SerializedName(SERIALIZED_NAME_BODY_LAST)
  @javax.annotation.Nullable
  private String bodyLast;

  public AppPageScripts() {
  }

  public AppPageScripts head(@javax.annotation.Nullable String head) {
    this.head = head;
    return this;
  }

  /**
   * Get head
   * @return head
   */
  @javax.annotation.Nullable
  public String getHead() {
    return head;
  }

  public void setHead(@javax.annotation.Nullable String head) {
    this.head = head;
  }


  public AppPageScripts bodyFirst(@javax.annotation.Nullable String bodyFirst) {
    this.bodyFirst = bodyFirst;
    return this;
  }

  /**
   * Get bodyFirst
   * @return bodyFirst
   */
  @javax.annotation.Nullable
  public String getBodyFirst() {
    return bodyFirst;
  }

  public void setBodyFirst(@javax.annotation.Nullable String bodyFirst) {
    this.bodyFirst = bodyFirst;
  }


  public AppPageScripts bodyLast(@javax.annotation.Nullable String bodyLast) {
    this.bodyLast = bodyLast;
    return this;
  }

  /**
   * Get bodyLast
   * @return bodyLast
   */
  @javax.annotation.Nullable
  public String getBodyLast() {
    return bodyLast;
  }

  public void setBodyLast(@javax.annotation.Nullable String bodyLast) {
    this.bodyLast = bodyLast;
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
   * @return the AppPageScripts instance itself
   */
  public AppPageScripts putAdditionalProperty(String key, Object value) {
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
    AppPageScripts appPageScripts = (AppPageScripts) o;
    return Objects.equals(this.head, appPageScripts.head) &&
        Objects.equals(this.bodyFirst, appPageScripts.bodyFirst) &&
        Objects.equals(this.bodyLast, appPageScripts.bodyLast)&&
        Objects.equals(this.additionalProperties, appPageScripts.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(head, bodyFirst, bodyLast, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPageScripts {\n");
    sb.append("    head: ").append(toIndentedString(head)).append("\n");
    sb.append("    bodyFirst: ").append(toIndentedString(bodyFirst)).append("\n");
    sb.append("    bodyLast: ").append(toIndentedString(bodyLast)).append("\n");
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
    openapiFields.add("head");
    openapiFields.add("bodyFirst");
    openapiFields.add("bodyLast");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppPageScripts
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppPageScripts.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppPageScripts is not found in the empty JSON string", AppPageScripts.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("head") != null && !jsonObj.get("head").isJsonNull()) && !jsonObj.get("head").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `head` to be a primitive type in the JSON string but got `%s`", jsonObj.get("head").toString()));
      }
      if ((jsonObj.get("bodyFirst") != null && !jsonObj.get("bodyFirst").isJsonNull()) && !jsonObj.get("bodyFirst").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bodyFirst` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bodyFirst").toString()));
      }
      if ((jsonObj.get("bodyLast") != null && !jsonObj.get("bodyLast").isJsonNull()) && !jsonObj.get("bodyLast").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bodyLast` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bodyLast").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppPageScripts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppPageScripts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppPageScripts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppPageScripts.class));

       return (TypeAdapter<T>) new TypeAdapter<AppPageScripts>() {
           @Override
           public void write(JsonWriter out, AppPageScripts value) throws IOException {
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
           public AppPageScripts read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppPageScripts instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AppPageScripts given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppPageScripts
   * @throws IOException if the JSON string is invalid with respect to AppPageScripts
   */
  public static AppPageScripts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppPageScripts.class);
  }

  /**
   * Convert an instance of AppPageScripts to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

