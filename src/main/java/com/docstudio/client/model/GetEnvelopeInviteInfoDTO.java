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
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * GetEnvelopeInviteInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class GetEnvelopeInviteInfoDTO {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ENVELOPE_UUID = "envelopeUuid";
  @SerializedName(SERIALIZED_NAME_ENVELOPE_UUID)
  private UUID envelopeUuid;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SSO_ENABLED = "ssoEnabled";
  @SerializedName(SERIALIZED_NAME_SSO_ENABLED)
  private Boolean ssoEnabled;

  public GetEnvelopeInviteInfoDTO() {
  }

  public GetEnvelopeInviteInfoDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email for which invitation was created
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public GetEnvelopeInviteInfoDTO envelopeUuid(UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
    return this;
  }

  /**
   * UUID of envelope
   * @return envelopeUuid
   */
  @javax.annotation.Nullable
  public UUID getEnvelopeUuid() {
    return envelopeUuid;
  }

  public void setEnvelopeUuid(UUID envelopeUuid) {
    this.envelopeUuid = envelopeUuid;
  }


  public GetEnvelopeInviteInfoDTO status(String status) {
    this.status = status;
    return this;
  }

  /**
   * User status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public GetEnvelopeInviteInfoDTO ssoEnabled(Boolean ssoEnabled) {
    this.ssoEnabled = ssoEnabled;
    return this;
  }

  /**
   * Is SSO enabled for user
   * @return ssoEnabled
   */
  @javax.annotation.Nullable
  public Boolean getSsoEnabled() {
    return ssoEnabled;
  }

  public void setSsoEnabled(Boolean ssoEnabled) {
    this.ssoEnabled = ssoEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEnvelopeInviteInfoDTO getEnvelopeInviteInfoDTO = (GetEnvelopeInviteInfoDTO) o;
    return Objects.equals(this.email, getEnvelopeInviteInfoDTO.email) &&
        Objects.equals(this.envelopeUuid, getEnvelopeInviteInfoDTO.envelopeUuid) &&
        Objects.equals(this.status, getEnvelopeInviteInfoDTO.status) &&
        Objects.equals(this.ssoEnabled, getEnvelopeInviteInfoDTO.ssoEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, envelopeUuid, status, ssoEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEnvelopeInviteInfoDTO {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    envelopeUuid: ").append(toIndentedString(envelopeUuid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ssoEnabled: ").append(toIndentedString(ssoEnabled)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("envelopeUuid");
    openapiFields.add("status");
    openapiFields.add("ssoEnabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetEnvelopeInviteInfoDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetEnvelopeInviteInfoDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEnvelopeInviteInfoDTO is not found in the empty JSON string", GetEnvelopeInviteInfoDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetEnvelopeInviteInfoDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEnvelopeInviteInfoDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("envelopeUuid") != null && !jsonObj.get("envelopeUuid").isJsonNull()) && !jsonObj.get("envelopeUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `envelopeUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("envelopeUuid").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetEnvelopeInviteInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEnvelopeInviteInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEnvelopeInviteInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEnvelopeInviteInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEnvelopeInviteInfoDTO>() {
           @Override
           public void write(JsonWriter out, GetEnvelopeInviteInfoDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEnvelopeInviteInfoDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetEnvelopeInviteInfoDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetEnvelopeInviteInfoDTO
   * @throws IOException if the JSON string is invalid with respect to GetEnvelopeInviteInfoDTO
   */
  public static GetEnvelopeInviteInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEnvelopeInviteInfoDTO.class);
  }

  /**
   * Convert an instance of GetEnvelopeInviteInfoDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

