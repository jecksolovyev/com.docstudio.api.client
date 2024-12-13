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
 * ExchangeAs4DbnaProps
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class ExchangeAs4DbnaProps {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public static final String SERIALIZED_NAME_DBNA_ACCOUNT = "dbnaAccount";
  @SerializedName(SERIALIZED_NAME_DBNA_ACCOUNT)
  @javax.annotation.Nullable
  private UUID dbnaAccount;

  public static final String SERIALIZED_NAME_FTP_PASSWORD = "ftpPassword";
  @SerializedName(SERIALIZED_NAME_FTP_PASSWORD)
  @javax.annotation.Nullable
  private String ftpPassword;

  public ExchangeAs4DbnaProps() {
  }

  public ExchangeAs4DbnaProps url(@javax.annotation.Nullable String url) {
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


  public ExchangeAs4DbnaProps dbnaAccount(@javax.annotation.Nullable UUID dbnaAccount) {
    this.dbnaAccount = dbnaAccount;
    return this;
  }

  /**
   * Get dbnaAccount
   * @return dbnaAccount
   */
  @javax.annotation.Nullable
  public UUID getDbnaAccount() {
    return dbnaAccount;
  }

  public void setDbnaAccount(@javax.annotation.Nullable UUID dbnaAccount) {
    this.dbnaAccount = dbnaAccount;
  }


  public ExchangeAs4DbnaProps ftpPassword(@javax.annotation.Nullable String ftpPassword) {
    this.ftpPassword = ftpPassword;
    return this;
  }

  /**
   * Get ftpPassword
   * @return ftpPassword
   */
  @javax.annotation.Nullable
  public String getFtpPassword() {
    return ftpPassword;
  }

  public void setFtpPassword(@javax.annotation.Nullable String ftpPassword) {
    this.ftpPassword = ftpPassword;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeAs4DbnaProps exchangeAs4DbnaProps = (ExchangeAs4DbnaProps) o;
    return Objects.equals(this.url, exchangeAs4DbnaProps.url) &&
        Objects.equals(this.dbnaAccount, exchangeAs4DbnaProps.dbnaAccount) &&
        Objects.equals(this.ftpPassword, exchangeAs4DbnaProps.ftpPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, dbnaAccount, ftpPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeAs4DbnaProps {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    dbnaAccount: ").append(toIndentedString(dbnaAccount)).append("\n");
    sb.append("    ftpPassword: ").append(toIndentedString(ftpPassword)).append("\n");
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
    openapiFields.add("dbnaAccount");
    openapiFields.add("ftpPassword");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ExchangeAs4DbnaProps
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExchangeAs4DbnaProps.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExchangeAs4DbnaProps is not found in the empty JSON string", ExchangeAs4DbnaProps.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExchangeAs4DbnaProps.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExchangeAs4DbnaProps` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("dbnaAccount") != null && !jsonObj.get("dbnaAccount").isJsonNull()) && !jsonObj.get("dbnaAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dbnaAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dbnaAccount").toString()));
      }
      if ((jsonObj.get("ftpPassword") != null && !jsonObj.get("ftpPassword").isJsonNull()) && !jsonObj.get("ftpPassword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ftpPassword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ftpPassword").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExchangeAs4DbnaProps.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExchangeAs4DbnaProps' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExchangeAs4DbnaProps> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExchangeAs4DbnaProps.class));

       return (TypeAdapter<T>) new TypeAdapter<ExchangeAs4DbnaProps>() {
           @Override
           public void write(JsonWriter out, ExchangeAs4DbnaProps value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExchangeAs4DbnaProps read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ExchangeAs4DbnaProps given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExchangeAs4DbnaProps
   * @throws IOException if the JSON string is invalid with respect to ExchangeAs4DbnaProps
   */
  public static ExchangeAs4DbnaProps fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExchangeAs4DbnaProps.class);
  }

  /**
   * Convert an instance of ExchangeAs4DbnaProps to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

