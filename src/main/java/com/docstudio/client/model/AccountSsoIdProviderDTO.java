/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R120.10
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
import java.time.OffsetDateTime;
import java.util.*;

/**
 * AccountSsoIdProviderDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class AccountSsoIdProviderDTO {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_FIRST_NAME_MAPPING = "firstNameMapping";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME_MAPPING)
  @javax.annotation.Nullable
  private String firstNameMapping;

  public static final String SERIALIZED_NAME_LAST_NAME_MAPPING = "lastNameMapping";
  @SerializedName(SERIALIZED_NAME_LAST_NAME_MAPPING)
  @javax.annotation.Nullable
  private String lastNameMapping;

  public static final String SERIALIZED_NAME_PHONE_MAPPING = "phoneMapping";
  @SerializedName(SERIALIZED_NAME_PHONE_MAPPING)
  @javax.annotation.Nullable
  private String phoneMapping;

  public static final String SERIALIZED_NAME_METADATA_URL = "metadataUrl";
  @SerializedName(SERIALIZED_NAME_METADATA_URL)
  @javax.annotation.Nullable
  private String metadataUrl;

  public static final String SERIALIZED_NAME_METADATA_XML = "metadataXml";
  @SerializedName(SERIALIZED_NAME_METADATA_XML)
  @javax.annotation.Nullable
  private String metadataXml;

  public static final String SERIALIZED_NAME_SIGNING_CERTIFICATE = "signingCertificate";
  @SerializedName(SERIALIZED_NAME_SIGNING_CERTIFICATE)
  @javax.annotation.Nullable
  private byte[] signingCertificate;

  public static final String SERIALIZED_NAME_SIGNING_PRIVATE_KEY = "signingPrivateKey";
  @SerializedName(SERIALIZED_NAME_SIGNING_PRIVATE_KEY)
  @javax.annotation.Nullable
  private byte[] signingPrivateKey;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private UUID uuid;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public AccountSsoIdProviderDTO() {
  }

  public AccountSsoIdProviderDTO name(@javax.annotation.Nullable String name) {
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

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public AccountSsoIdProviderDTO firstNameMapping(@javax.annotation.Nullable String firstNameMapping) {
    this.firstNameMapping = firstNameMapping;
    return this;
  }

  /**
   * Get firstNameMapping
   * @return firstNameMapping
   */
  @javax.annotation.Nullable
  public String getFirstNameMapping() {
    return firstNameMapping;
  }

  public void setFirstNameMapping(@javax.annotation.Nullable String firstNameMapping) {
    this.firstNameMapping = firstNameMapping;
  }


  public AccountSsoIdProviderDTO lastNameMapping(@javax.annotation.Nullable String lastNameMapping) {
    this.lastNameMapping = lastNameMapping;
    return this;
  }

  /**
   * Get lastNameMapping
   * @return lastNameMapping
   */
  @javax.annotation.Nullable
  public String getLastNameMapping() {
    return lastNameMapping;
  }

  public void setLastNameMapping(@javax.annotation.Nullable String lastNameMapping) {
    this.lastNameMapping = lastNameMapping;
  }


  public AccountSsoIdProviderDTO phoneMapping(@javax.annotation.Nullable String phoneMapping) {
    this.phoneMapping = phoneMapping;
    return this;
  }

  /**
   * Get phoneMapping
   * @return phoneMapping
   */
  @javax.annotation.Nullable
  public String getPhoneMapping() {
    return phoneMapping;
  }

  public void setPhoneMapping(@javax.annotation.Nullable String phoneMapping) {
    this.phoneMapping = phoneMapping;
  }


  public AccountSsoIdProviderDTO metadataUrl(@javax.annotation.Nullable String metadataUrl) {
    this.metadataUrl = metadataUrl;
    return this;
  }

  /**
   * Get metadataUrl
   * @return metadataUrl
   */
  @javax.annotation.Nullable
  public String getMetadataUrl() {
    return metadataUrl;
  }

  public void setMetadataUrl(@javax.annotation.Nullable String metadataUrl) {
    this.metadataUrl = metadataUrl;
  }


  public AccountSsoIdProviderDTO metadataXml(@javax.annotation.Nullable String metadataXml) {
    this.metadataXml = metadataXml;
    return this;
  }

  /**
   * Get metadataXml
   * @return metadataXml
   */
  @javax.annotation.Nullable
  public String getMetadataXml() {
    return metadataXml;
  }

  public void setMetadataXml(@javax.annotation.Nullable String metadataXml) {
    this.metadataXml = metadataXml;
  }


  public AccountSsoIdProviderDTO signingCertificate(@javax.annotation.Nullable byte[] signingCertificate) {
    this.signingCertificate = signingCertificate;
    return this;
  }

  /**
   * Get signingCertificate
   * @return signingCertificate
   */
  @javax.annotation.Nullable
  public byte[] getSigningCertificate() {
    return signingCertificate;
  }

  public void setSigningCertificate(@javax.annotation.Nullable byte[] signingCertificate) {
    this.signingCertificate = signingCertificate;
  }


  public AccountSsoIdProviderDTO signingPrivateKey(@javax.annotation.Nullable byte[] signingPrivateKey) {
    this.signingPrivateKey = signingPrivateKey;
    return this;
  }

  /**
   * Get signingPrivateKey
   * @return signingPrivateKey
   */
  @javax.annotation.Nullable
  public byte[] getSigningPrivateKey() {
    return signingPrivateKey;
  }

  public void setSigningPrivateKey(@javax.annotation.Nullable byte[] signingPrivateKey) {
    this.signingPrivateKey = signingPrivateKey;
  }


  public AccountSsoIdProviderDTO uuid(@javax.annotation.Nullable UUID uuid) {
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

  public void setUuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
  }


  public AccountSsoIdProviderDTO createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSsoIdProviderDTO accountSsoIdProviderDTO = (AccountSsoIdProviderDTO) o;
    return Objects.equals(this.name, accountSsoIdProviderDTO.name) &&
        Objects.equals(this.firstNameMapping, accountSsoIdProviderDTO.firstNameMapping) &&
        Objects.equals(this.lastNameMapping, accountSsoIdProviderDTO.lastNameMapping) &&
        Objects.equals(this.phoneMapping, accountSsoIdProviderDTO.phoneMapping) &&
        Objects.equals(this.metadataUrl, accountSsoIdProviderDTO.metadataUrl) &&
        Objects.equals(this.metadataXml, accountSsoIdProviderDTO.metadataXml) &&
        Arrays.equals(this.signingCertificate, accountSsoIdProviderDTO.signingCertificate) &&
        Arrays.equals(this.signingPrivateKey, accountSsoIdProviderDTO.signingPrivateKey) &&
        Objects.equals(this.uuid, accountSsoIdProviderDTO.uuid) &&
        Objects.equals(this.createdAt, accountSsoIdProviderDTO.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, firstNameMapping, lastNameMapping, phoneMapping, metadataUrl, metadataXml, Arrays.hashCode(signingCertificate), Arrays.hashCode(signingPrivateKey), uuid, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSsoIdProviderDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstNameMapping: ").append(toIndentedString(firstNameMapping)).append("\n");
    sb.append("    lastNameMapping: ").append(toIndentedString(lastNameMapping)).append("\n");
    sb.append("    phoneMapping: ").append(toIndentedString(phoneMapping)).append("\n");
    sb.append("    metadataUrl: ").append(toIndentedString(metadataUrl)).append("\n");
    sb.append("    metadataXml: ").append(toIndentedString(metadataXml)).append("\n");
    sb.append("    signingCertificate: ").append(toIndentedString(signingCertificate)).append("\n");
    sb.append("    signingPrivateKey: ").append(toIndentedString(signingPrivateKey)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("firstNameMapping");
    openapiFields.add("lastNameMapping");
    openapiFields.add("phoneMapping");
    openapiFields.add("metadataUrl");
    openapiFields.add("metadataXml");
    openapiFields.add("signingCertificate");
    openapiFields.add("signingPrivateKey");
    openapiFields.add("uuid");
    openapiFields.add("createdAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountSsoIdProviderDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountSsoIdProviderDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountSsoIdProviderDTO is not found in the empty JSON string", AccountSsoIdProviderDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountSsoIdProviderDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountSsoIdProviderDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("firstNameMapping") != null && !jsonObj.get("firstNameMapping").isJsonNull()) && !jsonObj.get("firstNameMapping").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstNameMapping` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstNameMapping").toString()));
      }
      if ((jsonObj.get("lastNameMapping") != null && !jsonObj.get("lastNameMapping").isJsonNull()) && !jsonObj.get("lastNameMapping").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastNameMapping` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastNameMapping").toString()));
      }
      if ((jsonObj.get("phoneMapping") != null && !jsonObj.get("phoneMapping").isJsonNull()) && !jsonObj.get("phoneMapping").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneMapping` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneMapping").toString()));
      }
      if ((jsonObj.get("metadataUrl") != null && !jsonObj.get("metadataUrl").isJsonNull()) && !jsonObj.get("metadataUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadataUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadataUrl").toString()));
      }
      if ((jsonObj.get("metadataXml") != null && !jsonObj.get("metadataXml").isJsonNull()) && !jsonObj.get("metadataXml").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadataXml` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadataXml").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountSsoIdProviderDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountSsoIdProviderDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountSsoIdProviderDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountSsoIdProviderDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountSsoIdProviderDTO>() {
           @Override
           public void write(JsonWriter out, AccountSsoIdProviderDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountSsoIdProviderDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccountSsoIdProviderDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountSsoIdProviderDTO
   * @throws IOException if the JSON string is invalid with respect to AccountSsoIdProviderDTO
   */
  public static AccountSsoIdProviderDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountSsoIdProviderDTO.class);
  }

  /**
   * Convert an instance of AccountSsoIdProviderDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

