/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R127.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import java.util.Objects;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.docstudio.client.JSON;

/**
 * New domain info
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-28T13:30:43.659068-06:00[America/Edmonton]", comments = "Generator version: 7.12.0")
public class AccountDomainCreateDTO {
  public static final String SERIALIZED_NAME_SSO_ID_PROVIDER_UUID = "ssoIdProviderUuid";
  @SerializedName(SERIALIZED_NAME_SSO_ID_PROVIDER_UUID)
  @javax.annotation.Nullable
  private UUID ssoIdProviderUuid;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  @javax.annotation.Nonnull
  private String domain;

  public AccountDomainCreateDTO() {
  }

  public AccountDomainCreateDTO ssoIdProviderUuid(@javax.annotation.Nullable UUID ssoIdProviderUuid) {
    this.ssoIdProviderUuid = ssoIdProviderUuid;
    return this;
  }

  /**
   * Get ssoIdProviderUuid
   * @return ssoIdProviderUuid
   */
  @javax.annotation.Nullable
  public UUID getSsoIdProviderUuid() {
    return ssoIdProviderUuid;
  }

  public void setSsoIdProviderUuid(@javax.annotation.Nullable UUID ssoIdProviderUuid) {
    this.ssoIdProviderUuid = ssoIdProviderUuid;
  }


  public AccountDomainCreateDTO domain(@javax.annotation.Nonnull String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Domain name
   * @return domain
   */
  @javax.annotation.Nonnull
  public String getDomain() {
    return domain;
  }

  public void setDomain(@javax.annotation.Nonnull String domain) {
    this.domain = domain;
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
   * @return the AccountDomainCreateDTO instance itself
   */
  public AccountDomainCreateDTO putAdditionalProperty(String key, Object value) {
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
    AccountDomainCreateDTO accountDomainCreateDTO = (AccountDomainCreateDTO) o;
    return Objects.equals(this.ssoIdProviderUuid, accountDomainCreateDTO.ssoIdProviderUuid) &&
        Objects.equals(this.domain, accountDomainCreateDTO.domain)&&
        Objects.equals(this.additionalProperties, accountDomainCreateDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssoIdProviderUuid, domain, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDomainCreateDTO {\n");
    sb.append("    ssoIdProviderUuid: ").append(toIndentedString(ssoIdProviderUuid)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
    openapiFields.add("ssoIdProviderUuid");
    openapiFields.add("domain");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("domain");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountDomainCreateDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountDomainCreateDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountDomainCreateDTO is not found in the empty JSON string", AccountDomainCreateDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountDomainCreateDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ssoIdProviderUuid") != null && !jsonObj.get("ssoIdProviderUuid").isJsonNull()) && !jsonObj.get("ssoIdProviderUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssoIdProviderUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssoIdProviderUuid").toString()));
      }
      if (!jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountDomainCreateDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountDomainCreateDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountDomainCreateDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountDomainCreateDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountDomainCreateDTO>() {
           @Override
           public void write(JsonWriter out, AccountDomainCreateDTO value) throws IOException {
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
           public AccountDomainCreateDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AccountDomainCreateDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AccountDomainCreateDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountDomainCreateDTO
   * @throws IOException if the JSON string is invalid with respect to AccountDomainCreateDTO
   */
  public static AccountDomainCreateDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountDomainCreateDTO.class);
  }

  /**
   * Convert an instance of AccountDomainCreateDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

