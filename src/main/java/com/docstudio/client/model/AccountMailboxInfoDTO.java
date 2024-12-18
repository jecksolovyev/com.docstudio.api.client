/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R121.16
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
 * AccountMailboxInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:58:44.034140700+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class AccountMailboxInfoDTO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nonnull
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_HIDE_NAME_FOR_ACCOUNTS = "hideNameForAccounts";
  @SerializedName(SERIALIZED_NAME_HIDE_NAME_FOR_ACCOUNTS)
  @javax.annotation.Nullable
  private Boolean hideNameForAccounts;

  public static final String SERIALIZED_NAME_USERS_COUNT = "usersCount";
  @SerializedName(SERIALIZED_NAME_USERS_COUNT)
  @javax.annotation.Nullable
  private Long usersCount;

  public static final String SERIALIZED_NAME_ALIASES = "aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  @javax.annotation.Nullable
  private List<AliasNameDTO> aliases = new ArrayList<>();

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  @javax.annotation.Nullable
  private Boolean system;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  @javax.annotation.Nullable
  private Set<NameUuidDTO> groups = new LinkedHashSet<>();

  public AccountMailboxInfoDTO() {
  }

  public AccountMailboxInfoDTO uuid(@javax.annotation.Nonnull UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Mailbox uuid
   * @return uuid
   */
  @javax.annotation.Nonnull
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nonnull UUID uuid) {
    this.uuid = uuid;
  }


  public AccountMailboxInfoDTO name(@javax.annotation.Nonnull String name) {
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

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public AccountMailboxInfoDTO hideNameForAccounts(@javax.annotation.Nullable Boolean hideNameForAccounts) {
    this.hideNameForAccounts = hideNameForAccounts;
    return this;
  }

  /**
   * Hide mailbox name/aliases from other accounts
   * @return hideNameForAccounts
   */
  @javax.annotation.Nullable
  public Boolean getHideNameForAccounts() {
    return hideNameForAccounts;
  }

  public void setHideNameForAccounts(@javax.annotation.Nullable Boolean hideNameForAccounts) {
    this.hideNameForAccounts = hideNameForAccounts;
  }


  public AccountMailboxInfoDTO usersCount(@javax.annotation.Nullable Long usersCount) {
    this.usersCount = usersCount;
    return this;
  }

  /**
   * Mailbox users count
   * @return usersCount
   */
  @javax.annotation.Nullable
  public Long getUsersCount() {
    return usersCount;
  }

  public void setUsersCount(@javax.annotation.Nullable Long usersCount) {
    this.usersCount = usersCount;
  }


  public AccountMailboxInfoDTO aliases(@javax.annotation.Nullable List<AliasNameDTO> aliases) {
    this.aliases = aliases;
    return this;
  }

  public AccountMailboxInfoDTO addAliasesItem(AliasNameDTO aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

  /**
   * Mailbox aliases
   * @return aliases
   */
  @javax.annotation.Nullable
  public List<AliasNameDTO> getAliases() {
    return aliases;
  }

  public void setAliases(@javax.annotation.Nullable List<AliasNameDTO> aliases) {
    this.aliases = aliases;
  }


  public AccountMailboxInfoDTO system(@javax.annotation.Nullable Boolean system) {
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

  public void setSystem(@javax.annotation.Nullable Boolean system) {
    this.system = system;
  }


  public AccountMailboxInfoDTO groups(@javax.annotation.Nullable Set<NameUuidDTO> groups) {
    this.groups = groups;
    return this;
  }

  public AccountMailboxInfoDTO addGroupsItem(NameUuidDTO groupsItem) {
    if (this.groups == null) {
      this.groups = new LinkedHashSet<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Mailbox groups
   * @return groups
   */
  @javax.annotation.Nullable
  public Set<NameUuidDTO> getGroups() {
    return groups;
  }

  public void setGroups(@javax.annotation.Nullable Set<NameUuidDTO> groups) {
    this.groups = groups;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AccountMailboxInfoDTO instance itself
   */
  public AccountMailboxInfoDTO putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountMailboxInfoDTO accountMailboxInfoDTO = (AccountMailboxInfoDTO) o;
    return Objects.equals(this.uuid, accountMailboxInfoDTO.uuid) &&
        Objects.equals(this.name, accountMailboxInfoDTO.name) &&
        Objects.equals(this.hideNameForAccounts, accountMailboxInfoDTO.hideNameForAccounts) &&
        Objects.equals(this.usersCount, accountMailboxInfoDTO.usersCount) &&
        Objects.equals(this.aliases, accountMailboxInfoDTO.aliases) &&
        Objects.equals(this.system, accountMailboxInfoDTO.system) &&
        Objects.equals(this.groups, accountMailboxInfoDTO.groups)&&
        Objects.equals(this.additionalProperties, accountMailboxInfoDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, hideNameForAccounts, usersCount, aliases, system, groups, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountMailboxInfoDTO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hideNameForAccounts: ").append(toIndentedString(hideNameForAccounts)).append("\n");
    sb.append("    usersCount: ").append(toIndentedString(usersCount)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("hideNameForAccounts");
    openapiFields.add("usersCount");
    openapiFields.add("aliases");
    openapiFields.add("system");
    openapiFields.add("groups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountMailboxInfoDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountMailboxInfoDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountMailboxInfoDTO is not found in the empty JSON string", AccountMailboxInfoDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountMailboxInfoDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("aliases") != null && !jsonObj.get("aliases").isJsonNull()) {
        JsonArray jsonArrayaliases = jsonObj.getAsJsonArray("aliases");
        if (jsonArrayaliases != null) {
          // ensure the json data is an array
          if (!jsonObj.get("aliases").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `aliases` to be an array in the JSON string but got `%s`", jsonObj.get("aliases").toString()));
          }

          // validate the optional field `aliases` (array)
          for (int i = 0; i < jsonArrayaliases.size(); i++) {
            AliasNameDTO.validateJsonElement(jsonArrayaliases.get(i));
          };
        }
      }
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
        if (jsonArraygroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
          }

          // validate the optional field `groups` (array)
          for (int i = 0; i < jsonArraygroups.size(); i++) {
            NameUuidDTO.validateJsonElement(jsonArraygroups.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountMailboxInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountMailboxInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountMailboxInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountMailboxInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountMailboxInfoDTO>() {
           @Override
           public void write(JsonWriter out, AccountMailboxInfoDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountMailboxInfoDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AccountMailboxInfoDTO instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccountMailboxInfoDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountMailboxInfoDTO
   * @throws IOException if the JSON string is invalid with respect to AccountMailboxInfoDTO
   */
  public static AccountMailboxInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountMailboxInfoDTO.class);
  }

  /**
   * Convert an instance of AccountMailboxInfoDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

