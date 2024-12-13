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
 * LoginCheckResponseDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class LoginCheckResponseDTO {
  public static final String SERIALIZED_NAME_CAN_LOGIN_WITH_CODE = "canLoginWithCode";
  @SerializedName(SERIALIZED_NAME_CAN_LOGIN_WITH_CODE)
  @javax.annotation.Nullable
  private Boolean canLoginWithCode;

  public static final String SERIALIZED_NAME_EXISTING_USER = "existingUser";
  @SerializedName(SERIALIZED_NAME_EXISTING_USER)
  @javax.annotation.Nullable
  private Boolean existingUser;

  public LoginCheckResponseDTO() {
  }

  public LoginCheckResponseDTO canLoginWithCode(@javax.annotation.Nullable Boolean canLoginWithCode) {
    this.canLoginWithCode = canLoginWithCode;
    return this;
  }

  /**
   * User can be logged in by invitation code
   * @return canLoginWithCode
   */
  @javax.annotation.Nullable
  public Boolean getCanLoginWithCode() {
    return canLoginWithCode;
  }

  public void setCanLoginWithCode(@javax.annotation.Nullable Boolean canLoginWithCode) {
    this.canLoginWithCode = canLoginWithCode;
  }


  public LoginCheckResponseDTO existingUser(@javax.annotation.Nullable Boolean existingUser) {
    this.existingUser = existingUser;
    return this;
  }

  /**
   * Is user already created in the service?
   * @return existingUser
   */
  @javax.annotation.Nullable
  public Boolean getExistingUser() {
    return existingUser;
  }

  public void setExistingUser(@javax.annotation.Nullable Boolean existingUser) {
    this.existingUser = existingUser;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginCheckResponseDTO loginCheckResponseDTO = (LoginCheckResponseDTO) o;
    return Objects.equals(this.canLoginWithCode, loginCheckResponseDTO.canLoginWithCode) &&
        Objects.equals(this.existingUser, loginCheckResponseDTO.existingUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canLoginWithCode, existingUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginCheckResponseDTO {\n");
    sb.append("    canLoginWithCode: ").append(toIndentedString(canLoginWithCode)).append("\n");
    sb.append("    existingUser: ").append(toIndentedString(existingUser)).append("\n");
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
    openapiFields.add("canLoginWithCode");
    openapiFields.add("existingUser");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LoginCheckResponseDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoginCheckResponseDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoginCheckResponseDTO is not found in the empty JSON string", LoginCheckResponseDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoginCheckResponseDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoginCheckResponseDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoginCheckResponseDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoginCheckResponseDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoginCheckResponseDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoginCheckResponseDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<LoginCheckResponseDTO>() {
           @Override
           public void write(JsonWriter out, LoginCheckResponseDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoginCheckResponseDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LoginCheckResponseDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LoginCheckResponseDTO
   * @throws IOException if the JSON string is invalid with respect to LoginCheckResponseDTO
   */
  public static LoginCheckResponseDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoginCheckResponseDTO.class);
  }

  /**
   * Convert an instance of LoginCheckResponseDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

