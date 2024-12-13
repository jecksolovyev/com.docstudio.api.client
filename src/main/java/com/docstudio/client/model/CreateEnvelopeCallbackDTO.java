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
 * Create envelope callback dto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class CreateEnvelopeCallbackDTO {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  @javax.annotation.Nonnull
  private CallbackEnvelopeFilterDTO filter;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nonnull
  private String url;

  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  @javax.annotation.Nonnull
  private Integer retries;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  @javax.annotation.Nonnull
  private Integer timeout;

  public static final String SERIALIZED_NAME_SUCCESS_CODE = "successCode";
  @SerializedName(SERIALIZED_NAME_SUCCESS_CODE)
  @javax.annotation.Nullable
  private Integer successCode = 200;

  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  @javax.annotation.Nullable
  private String login;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  @javax.annotation.Nullable
  private String password;

  public CreateEnvelopeCallbackDTO() {
  }

  public CreateEnvelopeCallbackDTO filter(@javax.annotation.Nonnull CallbackEnvelopeFilterDTO filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   */
  @javax.annotation.Nonnull
  public CallbackEnvelopeFilterDTO getFilter() {
    return filter;
  }

  public void setFilter(@javax.annotation.Nonnull CallbackEnvelopeFilterDTO filter) {
    this.filter = filter;
  }


  public CreateEnvelopeCallbackDTO url(@javax.annotation.Nonnull String url) {
    this.url = url;
    return this;
  }

  /**
   * Callback url
   * @return url
   */
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nonnull String url) {
    this.url = url;
  }


  public CreateEnvelopeCallbackDTO retries(@javax.annotation.Nonnull Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * Retries count, 0 &lt; X &lt;&#x3D; 10
   * minimum: 0
   * maximum: 10
   * @return retries
   */
  @javax.annotation.Nonnull
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(@javax.annotation.Nonnull Integer retries) {
    this.retries = retries;
  }


  public CreateEnvelopeCallbackDTO timeout(@javax.annotation.Nonnull Integer timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Request timeout (ms), 100 &lt; X &lt; 60000
   * minimum: 100
   * maximum: 60000
   * @return timeout
   */
  @javax.annotation.Nonnull
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(@javax.annotation.Nonnull Integer timeout) {
    this.timeout = timeout;
  }


  public CreateEnvelopeCallbackDTO successCode(@javax.annotation.Nullable Integer successCode) {
    this.successCode = successCode;
    return this;
  }

  /**
   * Http response success code
   * @return successCode
   */
  @javax.annotation.Nullable
  public Integer getSuccessCode() {
    return successCode;
  }

  public void setSuccessCode(@javax.annotation.Nullable Integer successCode) {
    this.successCode = successCode;
  }


  public CreateEnvelopeCallbackDTO login(@javax.annotation.Nullable String login) {
    this.login = login;
    return this;
  }

  /**
   * Basic auth login
   * @return login
   */
  @javax.annotation.Nullable
  public String getLogin() {
    return login;
  }

  public void setLogin(@javax.annotation.Nullable String login) {
    this.login = login;
  }


  public CreateEnvelopeCallbackDTO password(@javax.annotation.Nullable String password) {
    this.password = password;
    return this;
  }

  /**
   * Basic auth password
   * @return password
   */
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = password;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEnvelopeCallbackDTO createEnvelopeCallbackDTO = (CreateEnvelopeCallbackDTO) o;
    return Objects.equals(this.filter, createEnvelopeCallbackDTO.filter) &&
        Objects.equals(this.url, createEnvelopeCallbackDTO.url) &&
        Objects.equals(this.retries, createEnvelopeCallbackDTO.retries) &&
        Objects.equals(this.timeout, createEnvelopeCallbackDTO.timeout) &&
        Objects.equals(this.successCode, createEnvelopeCallbackDTO.successCode) &&
        Objects.equals(this.login, createEnvelopeCallbackDTO.login) &&
        Objects.equals(this.password, createEnvelopeCallbackDTO.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, url, retries, timeout, successCode, login, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEnvelopeCallbackDTO {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    successCode: ").append(toIndentedString(successCode)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
    openapiFields.add("filter");
    openapiFields.add("url");
    openapiFields.add("retries");
    openapiFields.add("timeout");
    openapiFields.add("successCode");
    openapiFields.add("login");
    openapiFields.add("password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("filter");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("retries");
    openapiRequiredFields.add("timeout");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateEnvelopeCallbackDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEnvelopeCallbackDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEnvelopeCallbackDTO is not found in the empty JSON string", CreateEnvelopeCallbackDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEnvelopeCallbackDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEnvelopeCallbackDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateEnvelopeCallbackDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `filter`
      CallbackEnvelopeFilterDTO.validateJsonElement(jsonObj.get("filter"));
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("login") != null && !jsonObj.get("login").isJsonNull()) && !jsonObj.get("login").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEnvelopeCallbackDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEnvelopeCallbackDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEnvelopeCallbackDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEnvelopeCallbackDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEnvelopeCallbackDTO>() {
           @Override
           public void write(JsonWriter out, CreateEnvelopeCallbackDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEnvelopeCallbackDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateEnvelopeCallbackDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateEnvelopeCallbackDTO
   * @throws IOException if the JSON string is invalid with respect to CreateEnvelopeCallbackDTO
   */
  public static CreateEnvelopeCallbackDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEnvelopeCallbackDTO.class);
  }

  /**
   * Convert an instance of CreateEnvelopeCallbackDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

