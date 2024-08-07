/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R110.5
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import com.docstudio.client.JSON;
import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * Envelope callback dto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class EnvelopeCallbackDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private CallbackEnvelopeFilterDTO filter;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private Integer retries;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout;

  public static final String SERIALIZED_NAME_SUCCESS_CODE = "successCode";
  @SerializedName(SERIALIZED_NAME_SUCCESS_CODE)
  private Integer successCode = 200;

  /**
   * Auth type
   */
  @JsonAdapter(AuthTypeEnum.Adapter.class)
  public enum AuthTypeEnum {
    NONE("NONE"),

    BASIC("BASIC");

    private String value;

    AuthTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthTypeEnum fromValue(String value) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AuthTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_AUTH_TYPE = "authType";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private AuthTypeEnum authType;

  public EnvelopeCallbackDTO() {
  }

  public EnvelopeCallbackDTO id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Envelope callback ID
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public EnvelopeCallbackDTO filter(CallbackEnvelopeFilterDTO filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   */
  @javax.annotation.Nullable
  public CallbackEnvelopeFilterDTO getFilter() {
    return filter;
  }

  public void setFilter(CallbackEnvelopeFilterDTO filter) {
    this.filter = filter;
  }


  public EnvelopeCallbackDTO url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Callback url
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public EnvelopeCallbackDTO retries(Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * Retries count, 0 &lt; X &lt;&#x3D; 10
   * @return retries
   */
  @javax.annotation.Nullable
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }


  public EnvelopeCallbackDTO timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Request timeout (ms), 100 &lt; X &lt; 60000
   * @return timeout
   */
  @javax.annotation.Nullable
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  public EnvelopeCallbackDTO successCode(Integer successCode) {
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

  public void setSuccessCode(Integer successCode) {
    this.successCode = successCode;
  }


  public EnvelopeCallbackDTO authType(AuthTypeEnum authType) {
    this.authType = authType;
    return this;
  }

  /**
   * Auth type
   * @return authType
   */
  @javax.annotation.Nullable
  public AuthTypeEnum getAuthType() {
    return authType;
  }

  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeCallbackDTO envelopeCallbackDTO = (EnvelopeCallbackDTO) o;
    return Objects.equals(this.id, envelopeCallbackDTO.id) &&
        Objects.equals(this.filter, envelopeCallbackDTO.filter) &&
        Objects.equals(this.url, envelopeCallbackDTO.url) &&
        Objects.equals(this.retries, envelopeCallbackDTO.retries) &&
        Objects.equals(this.timeout, envelopeCallbackDTO.timeout) &&
        Objects.equals(this.successCode, envelopeCallbackDTO.successCode) &&
        Objects.equals(this.authType, envelopeCallbackDTO.authType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, filter, url, retries, timeout, successCode, authType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeCallbackDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    successCode: ").append(toIndentedString(successCode)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("filter");
    openapiFields.add("url");
    openapiFields.add("retries");
    openapiFields.add("timeout");
    openapiFields.add("successCode");
    openapiFields.add("authType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopeCallbackDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopeCallbackDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopeCallbackDTO is not found in the empty JSON string", EnvelopeCallbackDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvelopeCallbackDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvelopeCallbackDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `filter`
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) {
        CallbackEnvelopeFilterDTO.validateJsonElement(jsonObj.get("filter"));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("authType") != null && !jsonObj.get("authType").isJsonNull()) && !jsonObj.get("authType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authType").toString()));
      }
      // validate the optional field `authType`
      if (jsonObj.get("authType") != null && !jsonObj.get("authType").isJsonNull()) {
        AuthTypeEnum.validateJsonElement(jsonObj.get("authType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopeCallbackDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopeCallbackDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopeCallbackDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopeCallbackDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopeCallbackDTO>() {
           @Override
           public void write(JsonWriter out, EnvelopeCallbackDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvelopeCallbackDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnvelopeCallbackDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopeCallbackDTO
   * @throws IOException if the JSON string is invalid with respect to EnvelopeCallbackDTO
   */
  public static EnvelopeCallbackDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopeCallbackDTO.class);
  }

  /**
   * Convert an instance of EnvelopeCallbackDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

