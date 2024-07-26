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
 * SSO Identity Provider for domain
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class AccountSsoIdProviderShortDTO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ENTITY_I_D = "entityID";
  @SerializedName(SERIALIZED_NAME_ENTITY_I_D)
  private String entityID;

  public AccountSsoIdProviderShortDTO() {
  }

  public AccountSsoIdProviderShortDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
   */
  @javax.annotation.Nullable
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public AccountSsoIdProviderShortDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccountSsoIdProviderShortDTO entityID(String entityID) {
    this.entityID = entityID;
    return this;
  }

  /**
   * Get entityID
   * @return entityID
   */
  @javax.annotation.Nullable
  public String getEntityID() {
    return entityID;
  }

  public void setEntityID(String entityID) {
    this.entityID = entityID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSsoIdProviderShortDTO accountSsoIdProviderShortDTO = (AccountSsoIdProviderShortDTO) o;
    return Objects.equals(this.uuid, accountSsoIdProviderShortDTO.uuid) &&
        Objects.equals(this.name, accountSsoIdProviderShortDTO.name) &&
        Objects.equals(this.entityID, accountSsoIdProviderShortDTO.entityID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, entityID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSsoIdProviderShortDTO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityID: ").append(toIndentedString(entityID)).append("\n");
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
    openapiFields.add("entityID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountSsoIdProviderShortDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountSsoIdProviderShortDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountSsoIdProviderShortDTO is not found in the empty JSON string", AccountSsoIdProviderShortDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountSsoIdProviderShortDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountSsoIdProviderShortDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("entityID") != null && !jsonObj.get("entityID").isJsonNull()) && !jsonObj.get("entityID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountSsoIdProviderShortDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountSsoIdProviderShortDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountSsoIdProviderShortDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountSsoIdProviderShortDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountSsoIdProviderShortDTO>() {
           @Override
           public void write(JsonWriter out, AccountSsoIdProviderShortDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountSsoIdProviderShortDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccountSsoIdProviderShortDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountSsoIdProviderShortDTO
   * @throws IOException if the JSON string is invalid with respect to AccountSsoIdProviderShortDTO
   */
  public static AccountSsoIdProviderShortDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountSsoIdProviderShortDTO.class);
  }

  /**
   * Convert an instance of AccountSsoIdProviderShortDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

