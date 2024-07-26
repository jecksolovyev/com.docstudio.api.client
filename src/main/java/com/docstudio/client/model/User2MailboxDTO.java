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

import java.util.Objects;
import com.docstudio.client.model.UserAuthorizationDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.docstudio.client.JSON;

/**
 * User2MailboxDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class User2MailboxDTO {
  public static final String SERIALIZED_NAME_MAILBOX_UUID = "mailboxUuid";
  @SerializedName(SERIALIZED_NAME_MAILBOX_UUID)
  private UUID mailboxUuid;

  public static final String SERIALIZED_NAME_USER_UUID = "userUuid";
  @SerializedName(SERIALIZED_NAME_USER_UUID)
  private UUID userUuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACCOUNT_UUID = "accountUuid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_UUID)
  private UUID accountUuid;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "accountName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_AUTHORIZATION = "authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private UserAuthorizationDTO authorization;

  public User2MailboxDTO() {
  }

  public User2MailboxDTO mailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

  /**
   * Get mailboxUuid
   * @return mailboxUuid
   */
  @javax.annotation.Nullable
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }


  public User2MailboxDTO userUuid(UUID userUuid) {
    this.userUuid = userUuid;
    return this;
  }

  /**
   * Get userUuid
   * @return userUuid
   */
  @javax.annotation.Nullable
  public UUID getUserUuid() {
    return userUuid;
  }

  public void setUserUuid(UUID userUuid) {
    this.userUuid = userUuid;
  }


  public User2MailboxDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Mailbox name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public User2MailboxDTO accountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

  /**
   * Get accountUuid
   * @return accountUuid
   */
  @javax.annotation.Nullable
  public UUID getAccountUuid() {
    return accountUuid;
  }

  public void setAccountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
  }


  public User2MailboxDTO accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName
   * @return accountName
   */
  @javax.annotation.Nullable
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public User2MailboxDTO authorization(UserAuthorizationDTO authorization) {
    this.authorization = authorization;
    return this;
  }

  /**
   * Get authorization
   * @return authorization
   */
  @javax.annotation.Nullable
  public UserAuthorizationDTO getAuthorization() {
    return authorization;
  }

  public void setAuthorization(UserAuthorizationDTO authorization) {
    this.authorization = authorization;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User2MailboxDTO user2MailboxDTO = (User2MailboxDTO) o;
    return Objects.equals(this.mailboxUuid, user2MailboxDTO.mailboxUuid) &&
        Objects.equals(this.userUuid, user2MailboxDTO.userUuid) &&
        Objects.equals(this.name, user2MailboxDTO.name) &&
        Objects.equals(this.accountUuid, user2MailboxDTO.accountUuid) &&
        Objects.equals(this.accountName, user2MailboxDTO.accountName) &&
        Objects.equals(this.authorization, user2MailboxDTO.authorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailboxUuid, userUuid, name, accountUuid, accountName, authorization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User2MailboxDTO {\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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
    openapiFields.add("mailboxUuid");
    openapiFields.add("userUuid");
    openapiFields.add("name");
    openapiFields.add("accountUuid");
    openapiFields.add("accountName");
    openapiFields.add("authorization");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to User2MailboxDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!User2MailboxDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in User2MailboxDTO is not found in the empty JSON string", User2MailboxDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!User2MailboxDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `User2MailboxDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : User2MailboxDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("mailboxUuid") != null && !jsonObj.get("mailboxUuid").isJsonNull()) && !jsonObj.get("mailboxUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxUuid").toString()));
      }
      if ((jsonObj.get("userUuid") != null && !jsonObj.get("userUuid").isJsonNull()) && !jsonObj.get("userUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userUuid").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("accountUuid") != null && !jsonObj.get("accountUuid").isJsonNull()) && !jsonObj.get("accountUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountUuid").toString()));
      }
      if ((jsonObj.get("accountName") != null && !jsonObj.get("accountName").isJsonNull()) && !jsonObj.get("accountName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountName").toString()));
      }
      // validate the optional field `authorization`
      if (jsonObj.get("authorization") != null && !jsonObj.get("authorization").isJsonNull()) {
        UserAuthorizationDTO.validateJsonElement(jsonObj.get("authorization"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User2MailboxDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User2MailboxDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User2MailboxDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User2MailboxDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<User2MailboxDTO>() {
           @Override
           public void write(JsonWriter out, User2MailboxDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public User2MailboxDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of User2MailboxDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of User2MailboxDTO
   * @throws IOException if the JSON string is invalid with respect to User2MailboxDTO
   */
  public static User2MailboxDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User2MailboxDTO.class);
  }

  /**
   * Convert an instance of User2MailboxDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

