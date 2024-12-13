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

import com.docstudio.client.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * OAuthProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class OAuthProperties {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  @javax.annotation.Nullable
  private String icon;

  public static final String SERIALIZED_NAME_AUTHORIZATIONS = "authorizations";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATIONS)
  @javax.annotation.Nullable
  private List<String> authorizations = new ArrayList<>();

  public OAuthProperties() {
  }

  public OAuthProperties url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }


  public OAuthProperties icon(@javax.annotation.Nullable String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   */
  @javax.annotation.Nullable
  public String getIcon() {
    return icon;
  }

  public void setIcon(@javax.annotation.Nullable String icon) {
    this.icon = icon;
  }


  public OAuthProperties authorizations(@javax.annotation.Nullable List<String> authorizations) {
    this.authorizations = authorizations;
    return this;
  }

  public OAuthProperties addAuthorizationsItem(String authorizationsItem) {
    if (this.authorizations == null) {
      this.authorizations = new ArrayList<>();
    }
    this.authorizations.add(authorizationsItem);
    return this;
  }

  /**
   * Get authorizations
   * @return authorizations
   */
  @javax.annotation.Nullable
  public List<String> getAuthorizations() {
    return authorizations;
  }

  public void setAuthorizations(@javax.annotation.Nullable List<String> authorizations) {
    this.authorizations = authorizations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthProperties oauthProperties = (OAuthProperties) o;
    return Objects.equals(this.url, oauthProperties.url) &&
        Objects.equals(this.icon, oauthProperties.icon) &&
        Objects.equals(this.authorizations, oauthProperties.authorizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, icon, authorizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthProperties {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    authorizations: ").append(toIndentedString(authorizations)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("icon");
    openapiFields.add("authorizations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OAuthProperties
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OAuthProperties.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OAuthProperties is not found in the empty JSON string", OAuthProperties.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OAuthProperties.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OAuthProperties` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonNull()) && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("authorizations") != null && !jsonObj.get("authorizations").isJsonNull() && !jsonObj.get("authorizations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorizations` to be an array in the JSON string but got `%s`", jsonObj.get("authorizations").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OAuthProperties.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OAuthProperties' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OAuthProperties> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OAuthProperties.class));

       return (TypeAdapter<T>) new TypeAdapter<OAuthProperties>() {
           @Override
           public void write(JsonWriter out, OAuthProperties value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OAuthProperties read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OAuthProperties given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OAuthProperties
   * @throws IOException if the JSON string is invalid with respect to OAuthProperties
   */
  public static OAuthProperties fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OAuthProperties.class);
  }

  /**
   * Convert an instance of OAuthProperties to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

