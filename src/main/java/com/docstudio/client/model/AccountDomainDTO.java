/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R121.17
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import com.docstudio.client.JSON;
import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;

/**
 * AccountDomainDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T17:18:48.308949400+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class AccountDomainDTO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private UUID uuid;

  public static final String SERIALIZED_NAME_ACCOUNT_UUID = "accountUuid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_UUID)
  @javax.annotation.Nullable
  private UUID accountUuid;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  @javax.annotation.Nullable
  private String domain;

  public static final String SERIALIZED_NAME_VERIFY_INFO = "verifyInfo";
  @SerializedName(SERIALIZED_NAME_VERIFY_INFO)
  @javax.annotation.Nullable
  private AccountDomainVerifyInfo verifyInfo;

  /**
   * Domain verification method
   */
  @JsonAdapter(VerifyMethodEnum.Adapter.class)
  public enum VerifyMethodEnum {
    TXT_RECORD("DNS_TXT_RECORD"),

    CNAME_RECORD("DNS_CNAME_RECORD");

    private String value;

    VerifyMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerifyMethodEnum fromValue(String value) {
      for (VerifyMethodEnum b : VerifyMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VerifyMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerifyMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerifyMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VerifyMethodEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      VerifyMethodEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_VERIFY_METHOD = "verifyMethod";
  @SerializedName(SERIALIZED_NAME_VERIFY_METHOD)
  @javax.annotation.Nullable
  private VerifyMethodEnum verifyMethod;

  /**
   * Domain status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNVERIFIED("UNVERIFIED"),

    ACTIVE("ACTIVE"),

    INACTIVE("INACTIVE"),

    VERIFIED("VERIFIED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private StatusEnum status;

  public static final String SERIALIZED_NAME_VERIFICATION_DATE = "verificationDate";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime verificationDate;

  public static final String SERIALIZED_NAME_CREATE_DATE = "createDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime createDate;

  public static final String SERIALIZED_NAME_LAST_CHECK_DATE = "lastCheckDate";
  @SerializedName(SERIALIZED_NAME_LAST_CHECK_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime lastCheckDate;

  public static final String SERIALIZED_NAME_SSO_ID_PROVIDER = "ssoIdProvider";
  @SerializedName(SERIALIZED_NAME_SSO_ID_PROVIDER)
  @javax.annotation.Nullable
  private AccountSsoIdProviderShortDTO ssoIdProvider;

  public AccountDomainDTO() {
  }

  public AccountDomainDTO uuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Domain UUID
   * @return uuid
   */
  @javax.annotation.Nullable
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
  }


  public AccountDomainDTO accountUuid(@javax.annotation.Nullable UUID accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

  /**
   * Domain account uuid
   * @return accountUuid
   */
  @javax.annotation.Nullable
  public UUID getAccountUuid() {
    return accountUuid;
  }

  public void setAccountUuid(@javax.annotation.Nullable UUID accountUuid) {
    this.accountUuid = accountUuid;
  }


  public AccountDomainDTO domain(@javax.annotation.Nullable String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Domain name
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(@javax.annotation.Nullable String domain) {
    this.domain = domain;
  }


  public AccountDomainDTO verifyInfo(@javax.annotation.Nullable AccountDomainVerifyInfo verifyInfo) {
    this.verifyInfo = verifyInfo;
    return this;
  }

  /**
   * Get verifyInfo
   * @return verifyInfo
   */
  @javax.annotation.Nullable
  public AccountDomainVerifyInfo getVerifyInfo() {
    return verifyInfo;
  }

  public void setVerifyInfo(@javax.annotation.Nullable AccountDomainVerifyInfo verifyInfo) {
    this.verifyInfo = verifyInfo;
  }


  public AccountDomainDTO verifyMethod(@javax.annotation.Nullable VerifyMethodEnum verifyMethod) {
    this.verifyMethod = verifyMethod;
    return this;
  }

  /**
   * Domain verification method
   * @return verifyMethod
   */
  @javax.annotation.Nullable
  public VerifyMethodEnum getVerifyMethod() {
    return verifyMethod;
  }

  public void setVerifyMethod(@javax.annotation.Nullable VerifyMethodEnum verifyMethod) {
    this.verifyMethod = verifyMethod;
  }


  public AccountDomainDTO status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Domain status
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public AccountDomainDTO verificationDate(@javax.annotation.Nullable OffsetDateTime verificationDate) {
    this.verificationDate = verificationDate;
    return this;
  }

  /**
   * Domain verification date
   * @return verificationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getVerificationDate() {
    return verificationDate;
  }

  public void setVerificationDate(@javax.annotation.Nullable OffsetDateTime verificationDate) {
    this.verificationDate = verificationDate;
  }


  public AccountDomainDTO createDate(@javax.annotation.Nullable OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Domain creation date
   * @return createDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(@javax.annotation.Nullable OffsetDateTime createDate) {
    this.createDate = createDate;
  }


  public AccountDomainDTO lastCheckDate(@javax.annotation.Nullable OffsetDateTime lastCheckDate) {
    this.lastCheckDate = lastCheckDate;
    return this;
  }

  /**
   * Domain last check date
   * @return lastCheckDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastCheckDate() {
    return lastCheckDate;
  }

  public void setLastCheckDate(@javax.annotation.Nullable OffsetDateTime lastCheckDate) {
    this.lastCheckDate = lastCheckDate;
  }


  public AccountDomainDTO ssoIdProvider(@javax.annotation.Nullable AccountSsoIdProviderShortDTO ssoIdProvider) {
    this.ssoIdProvider = ssoIdProvider;
    return this;
  }

  /**
   * Get ssoIdProvider
   * @return ssoIdProvider
   */
  @javax.annotation.Nullable
  public AccountSsoIdProviderShortDTO getSsoIdProvider() {
    return ssoIdProvider;
  }

  public void setSsoIdProvider(@javax.annotation.Nullable AccountSsoIdProviderShortDTO ssoIdProvider) {
    this.ssoIdProvider = ssoIdProvider;
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
   * @return the AccountDomainDTO instance itself
   */
  public AccountDomainDTO putAdditionalProperty(String key, Object value) {
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
    AccountDomainDTO accountDomainDTO = (AccountDomainDTO) o;
    return Objects.equals(this.uuid, accountDomainDTO.uuid) &&
        Objects.equals(this.accountUuid, accountDomainDTO.accountUuid) &&
        Objects.equals(this.domain, accountDomainDTO.domain) &&
        Objects.equals(this.verifyInfo, accountDomainDTO.verifyInfo) &&
        Objects.equals(this.verifyMethod, accountDomainDTO.verifyMethod) &&
        Objects.equals(this.status, accountDomainDTO.status) &&
        Objects.equals(this.verificationDate, accountDomainDTO.verificationDate) &&
        Objects.equals(this.createDate, accountDomainDTO.createDate) &&
        Objects.equals(this.lastCheckDate, accountDomainDTO.lastCheckDate) &&
        Objects.equals(this.ssoIdProvider, accountDomainDTO.ssoIdProvider)&&
        Objects.equals(this.additionalProperties, accountDomainDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, accountUuid, domain, verifyInfo, verifyMethod, status, verificationDate, createDate, lastCheckDate, ssoIdProvider, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDomainDTO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    verifyInfo: ").append(toIndentedString(verifyInfo)).append("\n");
    sb.append("    verifyMethod: ").append(toIndentedString(verifyMethod)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    verificationDate: ").append(toIndentedString(verificationDate)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    lastCheckDate: ").append(toIndentedString(lastCheckDate)).append("\n");
    sb.append("    ssoIdProvider: ").append(toIndentedString(ssoIdProvider)).append("\n");
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
    openapiFields.add("accountUuid");
    openapiFields.add("domain");
    openapiFields.add("verifyInfo");
    openapiFields.add("verifyMethod");
    openapiFields.add("status");
    openapiFields.add("verificationDate");
    openapiFields.add("createDate");
    openapiFields.add("lastCheckDate");
    openapiFields.add("ssoIdProvider");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountDomainDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountDomainDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountDomainDTO is not found in the empty JSON string", AccountDomainDTO.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("accountUuid") != null && !jsonObj.get("accountUuid").isJsonNull()) && !jsonObj.get("accountUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountUuid").toString()));
      }
      if ((jsonObj.get("domain") != null && !jsonObj.get("domain").isJsonNull()) && !jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      // validate the optional field `verifyInfo`
      if (jsonObj.get("verifyInfo") != null && !jsonObj.get("verifyInfo").isJsonNull()) {
        AccountDomainVerifyInfo.validateJsonElement(jsonObj.get("verifyInfo"));
      }
      if ((jsonObj.get("verifyMethod") != null && !jsonObj.get("verifyMethod").isJsonNull()) && !jsonObj.get("verifyMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verifyMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verifyMethod").toString()));
      }
      // validate the optional field `verifyMethod`
      if (jsonObj.get("verifyMethod") != null && !jsonObj.get("verifyMethod").isJsonNull()) {
        VerifyMethodEnum.validateJsonElement(jsonObj.get("verifyMethod"));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `ssoIdProvider`
      if (jsonObj.get("ssoIdProvider") != null && !jsonObj.get("ssoIdProvider").isJsonNull()) {
        AccountSsoIdProviderShortDTO.validateJsonElement(jsonObj.get("ssoIdProvider"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountDomainDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountDomainDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountDomainDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountDomainDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountDomainDTO>() {
           @Override
           public void write(JsonWriter out, AccountDomainDTO value) throws IOException {
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
           public AccountDomainDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AccountDomainDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AccountDomainDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountDomainDTO
   * @throws IOException if the JSON string is invalid with respect to AccountDomainDTO
   */
  public static AccountDomainDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountDomainDTO.class);
  }

  /**
   * Convert an instance of AccountDomainDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

