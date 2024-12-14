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

import java.util.Objects;
import com.docstudio.client.model.AliasNameDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.docstudio.client.JSON;

/**
 * Mailbox update data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T18:50:48.300154-07:00[America/Edmonton]", comments = "Generator version: 7.10.0")
public class MailboxUpdateRequestDTO {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  @javax.annotation.Nonnull
  private Boolean archived;

  public static final String SERIALIZED_NAME_ALIASES = "aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  @javax.annotation.Nonnull
  private List<AliasNameDTO> aliases = new ArrayList<>();

  public static final String SERIALIZED_NAME_HIDE_NAME_FOR_ACCOUNTS = "hideNameForAccounts";
  @SerializedName(SERIALIZED_NAME_HIDE_NAME_FOR_ACCOUNTS)
  @javax.annotation.Nonnull
  private Boolean hideNameForAccounts;

  public MailboxUpdateRequestDTO() {
  }

  public MailboxUpdateRequestDTO name(@javax.annotation.Nonnull String name) {
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


  public MailboxUpdateRequestDTO archived(@javax.annotation.Nonnull Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Mailbox archived
   * @return archived
   */
  @javax.annotation.Nonnull
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(@javax.annotation.Nonnull Boolean archived) {
    this.archived = archived;
  }


  public MailboxUpdateRequestDTO aliases(@javax.annotation.Nonnull List<AliasNameDTO> aliases) {
    this.aliases = aliases;
    return this;
  }

  public MailboxUpdateRequestDTO addAliasesItem(AliasNameDTO aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

  /**
   * Get aliases
   * @return aliases
   */
  @javax.annotation.Nonnull
  public List<AliasNameDTO> getAliases() {
    return aliases;
  }

  public void setAliases(@javax.annotation.Nonnull List<AliasNameDTO> aliases) {
    this.aliases = aliases;
  }


  public MailboxUpdateRequestDTO hideNameForAccounts(@javax.annotation.Nonnull Boolean hideNameForAccounts) {
    this.hideNameForAccounts = hideNameForAccounts;
    return this;
  }

  /**
   * Hide mailbox name/aliases from other accounts
   * @return hideNameForAccounts
   */
  @javax.annotation.Nonnull
  public Boolean getHideNameForAccounts() {
    return hideNameForAccounts;
  }

  public void setHideNameForAccounts(@javax.annotation.Nonnull Boolean hideNameForAccounts) {
    this.hideNameForAccounts = hideNameForAccounts;
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
   * @return the MailboxUpdateRequestDTO instance itself
   */
  public MailboxUpdateRequestDTO putAdditionalProperty(String key, Object value) {
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
    MailboxUpdateRequestDTO mailboxUpdateRequestDTO = (MailboxUpdateRequestDTO) o;
    return Objects.equals(this.name, mailboxUpdateRequestDTO.name) &&
        Objects.equals(this.archived, mailboxUpdateRequestDTO.archived) &&
        Objects.equals(this.aliases, mailboxUpdateRequestDTO.aliases) &&
        Objects.equals(this.hideNameForAccounts, mailboxUpdateRequestDTO.hideNameForAccounts)&&
        Objects.equals(this.additionalProperties, mailboxUpdateRequestDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, archived, aliases, hideNameForAccounts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailboxUpdateRequestDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    hideNameForAccounts: ").append(toIndentedString(hideNameForAccounts)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("archived");
    openapiFields.add("aliases");
    openapiFields.add("hideNameForAccounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("archived");
    openapiRequiredFields.add("aliases");
    openapiRequiredFields.add("hideNameForAccounts");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MailboxUpdateRequestDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MailboxUpdateRequestDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MailboxUpdateRequestDTO is not found in the empty JSON string", MailboxUpdateRequestDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MailboxUpdateRequestDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("aliases").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `aliases` to be an array in the JSON string but got `%s`", jsonObj.get("aliases").toString()));
      }

      JsonArray jsonArrayaliases = jsonObj.getAsJsonArray("aliases");
      // validate the required field `aliases` (array)
      for (int i = 0; i < jsonArrayaliases.size(); i++) {
        AliasNameDTO.validateJsonElement(jsonArrayaliases.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MailboxUpdateRequestDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MailboxUpdateRequestDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MailboxUpdateRequestDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MailboxUpdateRequestDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<MailboxUpdateRequestDTO>() {
           @Override
           public void write(JsonWriter out, MailboxUpdateRequestDTO value) throws IOException {
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
           public MailboxUpdateRequestDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MailboxUpdateRequestDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of MailboxUpdateRequestDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MailboxUpdateRequestDTO
   * @throws IOException if the JSON string is invalid with respect to MailboxUpdateRequestDTO
   */
  public static MailboxUpdateRequestDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MailboxUpdateRequestDTO.class);
  }

  /**
   * Convert an instance of MailboxUpdateRequestDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

