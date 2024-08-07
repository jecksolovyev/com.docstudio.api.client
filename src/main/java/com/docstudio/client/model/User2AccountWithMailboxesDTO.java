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
import com.docstudio.client.model.MailboxProfileDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
 * User accounts belongs to
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class User2AccountWithMailboxesDTO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  private Boolean system;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private Set<Integer> permissions = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_MAILBOXES = "mailboxes";
  @SerializedName(SERIALIZED_NAME_MAILBOXES)
  private List<MailboxProfileDTO> mailboxes = new ArrayList<>();

  public User2AccountWithMailboxesDTO() {
  }

  public User2AccountWithMailboxesDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Account UUID
   * @return uuid
   */
  @javax.annotation.Nullable
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public User2AccountWithMailboxesDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Account Name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public User2AccountWithMailboxesDTO system(Boolean system) {
    this.system = system;
    return this;
  }

  /**
   * Get system
   * @return system
   */
  @javax.annotation.Nullable
  public Boolean getSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }


  public User2AccountWithMailboxesDTO permissions(Set<Integer> permissions) {
    this.permissions = permissions;
    return this;
  }

  public User2AccountWithMailboxesDTO addPermissionsItem(Integer permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new LinkedHashSet<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Permissions for current user
   * @return permissions
   */
  @javax.annotation.Nullable
  public Set<Integer> getPermissions() {
    return permissions;
  }

  public void setPermissions(Set<Integer> permissions) {
    this.permissions = permissions;
  }


  public User2AccountWithMailboxesDTO mailboxes(List<MailboxProfileDTO> mailboxes) {
    this.mailboxes = mailboxes;
    return this;
  }

  public User2AccountWithMailboxesDTO addMailboxesItem(MailboxProfileDTO mailboxesItem) {
    if (this.mailboxes == null) {
      this.mailboxes = new ArrayList<>();
    }
    this.mailboxes.add(mailboxesItem);
    return this;
  }

  /**
   * Mailboxes linked to this account
   * @return mailboxes
   */
  @javax.annotation.Nullable
  public List<MailboxProfileDTO> getMailboxes() {
    return mailboxes;
  }

  public void setMailboxes(List<MailboxProfileDTO> mailboxes) {
    this.mailboxes = mailboxes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User2AccountWithMailboxesDTO user2AccountWithMailboxesDTO = (User2AccountWithMailboxesDTO) o;
    return Objects.equals(this.uuid, user2AccountWithMailboxesDTO.uuid) &&
        Objects.equals(this.name, user2AccountWithMailboxesDTO.name) &&
        Objects.equals(this.system, user2AccountWithMailboxesDTO.system) &&
        Objects.equals(this.permissions, user2AccountWithMailboxesDTO.permissions) &&
        Objects.equals(this.mailboxes, user2AccountWithMailboxesDTO.mailboxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, system, permissions, mailboxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User2AccountWithMailboxesDTO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    mailboxes: ").append(toIndentedString(mailboxes)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("name");
    openapiFields.add("system");
    openapiFields.add("permissions");
    openapiFields.add("mailboxes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to User2AccountWithMailboxesDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!User2AccountWithMailboxesDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in User2AccountWithMailboxesDTO is not found in the empty JSON string", User2AccountWithMailboxesDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!User2AccountWithMailboxesDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `User2AccountWithMailboxesDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull() && !jsonObj.get("permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
      }
      if (jsonObj.get("mailboxes") != null && !jsonObj.get("mailboxes").isJsonNull()) {
        JsonArray jsonArraymailboxes = jsonObj.getAsJsonArray("mailboxes");
        if (jsonArraymailboxes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mailboxes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mailboxes` to be an array in the JSON string but got `%s`", jsonObj.get("mailboxes").toString()));
          }

          // validate the optional field `mailboxes` (array)
          for (int i = 0; i < jsonArraymailboxes.size(); i++) {
            MailboxProfileDTO.validateJsonElement(jsonArraymailboxes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User2AccountWithMailboxesDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User2AccountWithMailboxesDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User2AccountWithMailboxesDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User2AccountWithMailboxesDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<User2AccountWithMailboxesDTO>() {
           @Override
           public void write(JsonWriter out, User2AccountWithMailboxesDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public User2AccountWithMailboxesDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of User2AccountWithMailboxesDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of User2AccountWithMailboxesDTO
   * @throws IOException if the JSON string is invalid with respect to User2AccountWithMailboxesDTO
   */
  public static User2AccountWithMailboxesDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User2AccountWithMailboxesDTO.class);
  }

  /**
   * Convert an instance of User2AccountWithMailboxesDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

