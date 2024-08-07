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
 * Policies map
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class AccountPoliciesDTO {
  public static final String SERIALIZED_NAME_PASSWORD_POLICY = "passwordPolicy";
  @SerializedName(SERIALIZED_NAME_PASSWORD_POLICY)
  private PasswordPolicy passwordPolicy;

  public static final String SERIALIZED_NAME_SESSION_POLICY = "sessionPolicy";
  @SerializedName(SERIALIZED_NAME_SESSION_POLICY)
  private SessionPolicy sessionPolicy;

  public AccountPoliciesDTO() {
  }

  public AccountPoliciesDTO passwordPolicy(PasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
    return this;
  }

  /**
   * Get passwordPolicy
   * @return passwordPolicy
   */
  @javax.annotation.Nullable
  public PasswordPolicy getPasswordPolicy() {
    return passwordPolicy;
  }

  public void setPasswordPolicy(PasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
  }


  public AccountPoliciesDTO sessionPolicy(SessionPolicy sessionPolicy) {
    this.sessionPolicy = sessionPolicy;
    return this;
  }

  /**
   * Get sessionPolicy
   * @return sessionPolicy
   */
  @javax.annotation.Nullable
  public SessionPolicy getSessionPolicy() {
    return sessionPolicy;
  }

  public void setSessionPolicy(SessionPolicy sessionPolicy) {
    this.sessionPolicy = sessionPolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPoliciesDTO accountPoliciesDTO = (AccountPoliciesDTO) o;
    return Objects.equals(this.passwordPolicy, accountPoliciesDTO.passwordPolicy) &&
        Objects.equals(this.sessionPolicy, accountPoliciesDTO.sessionPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordPolicy, sessionPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPoliciesDTO {\n");
    sb.append("    passwordPolicy: ").append(toIndentedString(passwordPolicy)).append("\n");
    sb.append("    sessionPolicy: ").append(toIndentedString(sessionPolicy)).append("\n");
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
    openapiFields.add("passwordPolicy");
    openapiFields.add("sessionPolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountPoliciesDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountPoliciesDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountPoliciesDTO is not found in the empty JSON string", AccountPoliciesDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountPoliciesDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountPoliciesDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `passwordPolicy`
      if (jsonObj.get("passwordPolicy") != null && !jsonObj.get("passwordPolicy").isJsonNull()) {
        PasswordPolicy.validateJsonElement(jsonObj.get("passwordPolicy"));
      }
      // validate the optional field `sessionPolicy`
      if (jsonObj.get("sessionPolicy") != null && !jsonObj.get("sessionPolicy").isJsonNull()) {
        SessionPolicy.validateJsonElement(jsonObj.get("sessionPolicy"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountPoliciesDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountPoliciesDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountPoliciesDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountPoliciesDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountPoliciesDTO>() {
           @Override
           public void write(JsonWriter out, AccountPoliciesDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountPoliciesDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccountPoliciesDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountPoliciesDTO
   * @throws IOException if the JSON string is invalid with respect to AccountPoliciesDTO
   */
  public static AccountPoliciesDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountPoliciesDTO.class);
  }

  /**
   * Convert an instance of AccountPoliciesDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

