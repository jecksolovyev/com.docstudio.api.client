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
 * InvitationPutDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class InvitationPutDTO {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private PermissionsWithUuidDTO account;

  public static final String SERIALIZED_NAME_MAILBOXES = "mailboxes";
  @SerializedName(SERIALIZED_NAME_MAILBOXES)
  private List<PermissionsWithUuidDTO> mailboxes = new ArrayList<>();

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public InvitationPutDTO() {
  }

  public InvitationPutDTO account(PermissionsWithUuidDTO account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @javax.annotation.Nonnull
  public PermissionsWithUuidDTO getAccount() {
    return account;
  }

  public void setAccount(PermissionsWithUuidDTO account) {
    this.account = account;
  }


  public InvitationPutDTO mailboxes(List<PermissionsWithUuidDTO> mailboxes) {
    this.mailboxes = mailboxes;
    return this;
  }

  public InvitationPutDTO addMailboxesItem(PermissionsWithUuidDTO mailboxesItem) {
    if (this.mailboxes == null) {
      this.mailboxes = new ArrayList<>();
    }
    this.mailboxes.add(mailboxesItem);
    return this;
  }

  /**
   * Mailboxes roles and permissions
   * @return mailboxes
   */
  @javax.annotation.Nullable
  public List<PermissionsWithUuidDTO> getMailboxes() {
    return mailboxes;
  }

  public void setMailboxes(List<PermissionsWithUuidDTO> mailboxes) {
    this.mailboxes = mailboxes;
  }


  public InvitationPutDTO nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * Nick name of invited user
   * @return nickname
   */
  @javax.annotation.Nullable
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationPutDTO invitationPutDTO = (InvitationPutDTO) o;
    return Objects.equals(this.account, invitationPutDTO.account) &&
        Objects.equals(this.mailboxes, invitationPutDTO.mailboxes) &&
        Objects.equals(this.nickname, invitationPutDTO.nickname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, mailboxes, nickname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationPutDTO {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    mailboxes: ").append(toIndentedString(mailboxes)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("mailboxes");
    openapiFields.add("nickname");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InvitationPutDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvitationPutDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvitationPutDTO is not found in the empty JSON string", InvitationPutDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvitationPutDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvitationPutDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvitationPutDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `account`
      PermissionsWithUuidDTO.validateJsonElement(jsonObj.get("account"));
      if (jsonObj.get("mailboxes") != null && !jsonObj.get("mailboxes").isJsonNull()) {
        JsonArray jsonArraymailboxes = jsonObj.getAsJsonArray("mailboxes");
        if (jsonArraymailboxes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mailboxes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mailboxes` to be an array in the JSON string but got `%s`", jsonObj.get("mailboxes").toString()));
          }

          // validate the optional field `mailboxes` (array)
          for (int i = 0; i < jsonArraymailboxes.size(); i++) {
            PermissionsWithUuidDTO.validateJsonElement(jsonArraymailboxes.get(i));
          };
        }
      }
      if ((jsonObj.get("nickname") != null && !jsonObj.get("nickname").isJsonNull()) && !jsonObj.get("nickname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nickname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nickname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvitationPutDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvitationPutDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvitationPutDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvitationPutDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<InvitationPutDTO>() {
           @Override
           public void write(JsonWriter out, InvitationPutDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvitationPutDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InvitationPutDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InvitationPutDTO
   * @throws IOException if the JSON string is invalid with respect to InvitationPutDTO
   */
  public static InvitationPutDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvitationPutDTO.class);
  }

  /**
   * Convert an instance of InvitationPutDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
