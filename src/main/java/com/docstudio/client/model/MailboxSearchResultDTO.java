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
 * MailboxSearchResultDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class MailboxSearchResultDTO {
  public static final String SERIALIZED_NAME_MAILBOX_NAME = "mailboxName";
  @SerializedName(SERIALIZED_NAME_MAILBOX_NAME)
  private String mailboxName;

  public static final String SERIALIZED_NAME_MAILBOX_UUID = "mailboxUuid";
  @SerializedName(SERIALIZED_NAME_MAILBOX_UUID)
  private UUID mailboxUuid;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_ACCOUNT_UUID = "accountUuid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_UUID)
  private UUID accountUuid;

  public static final String SERIALIZED_NAME_IN_CONTACTS = "inContacts";
  @SerializedName(SERIALIZED_NAME_IN_CONTACTS)
  private Boolean inContacts;

  public MailboxSearchResultDTO() {
  }

  public MailboxSearchResultDTO mailboxName(String mailboxName) {
    this.mailboxName = mailboxName;
    return this;
  }

  /**
   * Mailbox Name
   * @return mailboxName
   */
  @javax.annotation.Nullable
  public String getMailboxName() {
    return mailboxName;
  }

  public void setMailboxName(String mailboxName) {
    this.mailboxName = mailboxName;
  }


  public MailboxSearchResultDTO mailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

  /**
   * Mailbox UUID
   * @return mailboxUuid
   */
  @javax.annotation.Nullable
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }


  public MailboxSearchResultDTO alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Mailbox Alias/Contact Name
   * @return alias
   */
  @javax.annotation.Nullable
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }


  public MailboxSearchResultDTO accountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

  /**
   * Mailbox Account UUID
   * @return accountUuid
   */
  @javax.annotation.Nullable
  public UUID getAccountUuid() {
    return accountUuid;
  }

  public void setAccountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
  }


  public MailboxSearchResultDTO inContacts(Boolean inContacts) {
    this.inContacts = inContacts;
    return this;
  }

  /**
   * Presence of mailbox in contacts
   * @return inContacts
   */
  @javax.annotation.Nullable
  public Boolean getInContacts() {
    return inContacts;
  }

  public void setInContacts(Boolean inContacts) {
    this.inContacts = inContacts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailboxSearchResultDTO mailboxSearchResultDTO = (MailboxSearchResultDTO) o;
    return Objects.equals(this.mailboxName, mailboxSearchResultDTO.mailboxName) &&
        Objects.equals(this.mailboxUuid, mailboxSearchResultDTO.mailboxUuid) &&
        Objects.equals(this.alias, mailboxSearchResultDTO.alias) &&
        Objects.equals(this.accountUuid, mailboxSearchResultDTO.accountUuid) &&
        Objects.equals(this.inContacts, mailboxSearchResultDTO.inContacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailboxName, mailboxUuid, alias, accountUuid, inContacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailboxSearchResultDTO {\n");
    sb.append("    mailboxName: ").append(toIndentedString(mailboxName)).append("\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
    sb.append("    inContacts: ").append(toIndentedString(inContacts)).append("\n");
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
    openapiFields.add("mailboxName");
    openapiFields.add("mailboxUuid");
    openapiFields.add("alias");
    openapiFields.add("accountUuid");
    openapiFields.add("inContacts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MailboxSearchResultDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MailboxSearchResultDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MailboxSearchResultDTO is not found in the empty JSON string", MailboxSearchResultDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MailboxSearchResultDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MailboxSearchResultDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("mailboxName") != null && !jsonObj.get("mailboxName").isJsonNull()) && !jsonObj.get("mailboxName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxName").toString()));
      }
      if ((jsonObj.get("mailboxUuid") != null && !jsonObj.get("mailboxUuid").isJsonNull()) && !jsonObj.get("mailboxUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxUuid").toString()));
      }
      if ((jsonObj.get("alias") != null && !jsonObj.get("alias").isJsonNull()) && !jsonObj.get("alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alias").toString()));
      }
      if ((jsonObj.get("accountUuid") != null && !jsonObj.get("accountUuid").isJsonNull()) && !jsonObj.get("accountUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountUuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MailboxSearchResultDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MailboxSearchResultDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MailboxSearchResultDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MailboxSearchResultDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<MailboxSearchResultDTO>() {
           @Override
           public void write(JsonWriter out, MailboxSearchResultDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MailboxSearchResultDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MailboxSearchResultDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MailboxSearchResultDTO
   * @throws IOException if the JSON string is invalid with respect to MailboxSearchResultDTO
   */
  public static MailboxSearchResultDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MailboxSearchResultDTO.class);
  }

  /**
   * Convert an instance of MailboxSearchResultDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

