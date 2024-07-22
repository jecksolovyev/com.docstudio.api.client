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
 * Application Links
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class AppLinks {
  public static final String SERIALIZED_NAME_OFFICIAL_URL = "officialUrl";
  @SerializedName(SERIALIZED_NAME_OFFICIAL_URL)
  private String officialUrl;

  public static final String SERIALIZED_NAME_BASE_URL = "baseUrl";
  @SerializedName(SERIALIZED_NAME_BASE_URL)
  private String baseUrl;

  public static final String SERIALIZED_NAME_DOCS_URL = "docsUrl";
  @SerializedName(SERIALIZED_NAME_DOCS_URL)
  private String docsUrl;

  public static final String SERIALIZED_NAME_ERROR_LIST_URL = "errorListUrl";
  @SerializedName(SERIALIZED_NAME_ERROR_LIST_URL)
  private String errorListUrl;

  public static final String SERIALIZED_NAME_TERMS_AND_CONDITIONS = "termsAndConditions";
  @SerializedName(SERIALIZED_NAME_TERMS_AND_CONDITIONS)
  private String termsAndConditions;

  public static final String SERIALIZED_NAME_PRIVACY_POLICY = "privacyPolicy";
  @SerializedName(SERIALIZED_NAME_PRIVACY_POLICY)
  private String privacyPolicy;

  public static final String SERIALIZED_NAME_ALT_LOGIN_PAGE_SIDE = "altLoginPageSide";
  @SerializedName(SERIALIZED_NAME_ALT_LOGIN_PAGE_SIDE)
  private String altLoginPageSide;

  public AppLinks() {
  }

  public AppLinks officialUrl(String officialUrl) {
    this.officialUrl = officialUrl;
    return this;
  }

  /**
   * Get officialUrl
   * @return officialUrl
   */
  @javax.annotation.Nullable
  public String getOfficialUrl() {
    return officialUrl;
  }

  public void setOfficialUrl(String officialUrl) {
    this.officialUrl = officialUrl;
  }


  public AppLinks baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * Get baseUrl
   * @return baseUrl
   */
  @javax.annotation.Nullable
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }


  public AppLinks docsUrl(String docsUrl) {
    this.docsUrl = docsUrl;
    return this;
  }

  /**
   * Get docsUrl
   * @return docsUrl
   */
  @javax.annotation.Nullable
  public String getDocsUrl() {
    return docsUrl;
  }

  public void setDocsUrl(String docsUrl) {
    this.docsUrl = docsUrl;
  }


  public AppLinks errorListUrl(String errorListUrl) {
    this.errorListUrl = errorListUrl;
    return this;
  }

  /**
   * Get errorListUrl
   * @return errorListUrl
   */
  @javax.annotation.Nullable
  public String getErrorListUrl() {
    return errorListUrl;
  }

  public void setErrorListUrl(String errorListUrl) {
    this.errorListUrl = errorListUrl;
  }


  public AppLinks termsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

  /**
   * Get termsAndConditions
   * @return termsAndConditions
   */
  @javax.annotation.Nullable
  public String getTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }


  public AppLinks privacyPolicy(String privacyPolicy) {
    this.privacyPolicy = privacyPolicy;
    return this;
  }

  /**
   * Get privacyPolicy
   * @return privacyPolicy
   */
  @javax.annotation.Nullable
  public String getPrivacyPolicy() {
    return privacyPolicy;
  }

  public void setPrivacyPolicy(String privacyPolicy) {
    this.privacyPolicy = privacyPolicy;
  }


  public AppLinks altLoginPageSide(String altLoginPageSide) {
    this.altLoginPageSide = altLoginPageSide;
    return this;
  }

  /**
   * Get altLoginPageSide
   * @return altLoginPageSide
   */
  @javax.annotation.Nullable
  public String getAltLoginPageSide() {
    return altLoginPageSide;
  }

  public void setAltLoginPageSide(String altLoginPageSide) {
    this.altLoginPageSide = altLoginPageSide;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppLinks appLinks = (AppLinks) o;
    return Objects.equals(this.officialUrl, appLinks.officialUrl) &&
        Objects.equals(this.baseUrl, appLinks.baseUrl) &&
        Objects.equals(this.docsUrl, appLinks.docsUrl) &&
        Objects.equals(this.errorListUrl, appLinks.errorListUrl) &&
        Objects.equals(this.termsAndConditions, appLinks.termsAndConditions) &&
        Objects.equals(this.privacyPolicy, appLinks.privacyPolicy) &&
        Objects.equals(this.altLoginPageSide, appLinks.altLoginPageSide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officialUrl, baseUrl, docsUrl, errorListUrl, termsAndConditions, privacyPolicy, altLoginPageSide);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLinks {\n");
    sb.append("    officialUrl: ").append(toIndentedString(officialUrl)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    docsUrl: ").append(toIndentedString(docsUrl)).append("\n");
    sb.append("    errorListUrl: ").append(toIndentedString(errorListUrl)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    privacyPolicy: ").append(toIndentedString(privacyPolicy)).append("\n");
    sb.append("    altLoginPageSide: ").append(toIndentedString(altLoginPageSide)).append("\n");
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
    openapiFields.add("officialUrl");
    openapiFields.add("baseUrl");
    openapiFields.add("docsUrl");
    openapiFields.add("errorListUrl");
    openapiFields.add("termsAndConditions");
    openapiFields.add("privacyPolicy");
    openapiFields.add("altLoginPageSide");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppLinks
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppLinks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppLinks is not found in the empty JSON string", AppLinks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppLinks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("officialUrl") != null && !jsonObj.get("officialUrl").isJsonNull()) && !jsonObj.get("officialUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `officialUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("officialUrl").toString()));
      }
      if ((jsonObj.get("baseUrl") != null && !jsonObj.get("baseUrl").isJsonNull()) && !jsonObj.get("baseUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseUrl").toString()));
      }
      if ((jsonObj.get("docsUrl") != null && !jsonObj.get("docsUrl").isJsonNull()) && !jsonObj.get("docsUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docsUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docsUrl").toString()));
      }
      if ((jsonObj.get("errorListUrl") != null && !jsonObj.get("errorListUrl").isJsonNull()) && !jsonObj.get("errorListUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorListUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorListUrl").toString()));
      }
      if ((jsonObj.get("termsAndConditions") != null && !jsonObj.get("termsAndConditions").isJsonNull()) && !jsonObj.get("termsAndConditions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `termsAndConditions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("termsAndConditions").toString()));
      }
      if ((jsonObj.get("privacyPolicy") != null && !jsonObj.get("privacyPolicy").isJsonNull()) && !jsonObj.get("privacyPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privacyPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privacyPolicy").toString()));
      }
      if ((jsonObj.get("altLoginPageSide") != null && !jsonObj.get("altLoginPageSide").isJsonNull()) && !jsonObj.get("altLoginPageSide").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `altLoginPageSide` to be a primitive type in the JSON string but got `%s`", jsonObj.get("altLoginPageSide").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<AppLinks>() {
           @Override
           public void write(JsonWriter out, AppLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppLinks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AppLinks given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppLinks
   * @throws IOException if the JSON string is invalid with respect to AppLinks
   */
  public static AppLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppLinks.class);
  }

  /**
   * Convert an instance of AppLinks to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

