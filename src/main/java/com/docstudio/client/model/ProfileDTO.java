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
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * ProfileDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:58:44.034140700+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class ProfileDTO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private UUID uuid;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  @javax.annotation.Nullable
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  @javax.annotation.Nullable
  private String lastName;

  /**
   * User status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING_INVITE("PENDING_INVITE"),

    ACTIVE("ACTIVE"),

    BLOCKED("BLOCKED"),

    PENDING_PASSWORD("PENDING_PASSWORD"),

    DELETED("DELETED");

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

  public static final String SERIALIZED_NAME_DATE_LOCALE = "dateLocale";
  @SerializedName(SERIALIZED_NAME_DATE_LOCALE)
  @javax.annotation.Nullable
  private String dateLocale;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  @javax.annotation.Nullable
  private String locale;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  @javax.annotation.Nullable
  private String timezone;

  public static final String SERIALIZED_NAME_CORPORATE_USER = "corporateUser";
  @SerializedName(SERIALIZED_NAME_CORPORATE_USER)
  @javax.annotation.Nullable
  private Boolean corporateUser;

  public static final String SERIALIZED_NAME_SSO_ENABLED = "ssoEnabled";
  @SerializedName(SERIALIZED_NAME_SSO_ENABLED)
  @javax.annotation.Nullable
  private Boolean ssoEnabled;

  public static final String SERIALIZED_NAME_AUTO_DEPOSIT_MAILBOX_UUID = "autoDepositMailboxUuid";
  @SerializedName(SERIALIZED_NAME_AUTO_DEPOSIT_MAILBOX_UUID)
  @javax.annotation.Nullable
  private UUID autoDepositMailboxUuid;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  @javax.annotation.Nullable
  private String phone;

  public static final String SERIALIZED_NAME_DISPLAY_EXACT_DATE = "displayExactDate";
  @SerializedName(SERIALIZED_NAME_DISPLAY_EXACT_DATE)
  @javax.annotation.Nullable
  private Boolean displayExactDate;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  @javax.annotation.Nullable
  private String signature;

  public static final String SERIALIZED_NAME_INITIALS = "initials";
  @SerializedName(SERIALIZED_NAME_INITIALS)
  @javax.annotation.Nullable
  private String initials;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  @javax.annotation.Nullable
  private List<User2AccountWithMailboxesDTO> accounts = new ArrayList<>();

  public ProfileDTO() {
  }

  public ProfileDTO uuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * User uuid
   * @return uuid
   */
  @javax.annotation.Nullable
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
  }


  public ProfileDTO email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * User email
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public ProfileDTO firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * User first name
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }


  public ProfileDTO lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * User last name
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }


  public ProfileDTO status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * User status
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public ProfileDTO dateLocale(@javax.annotation.Nullable String dateLocale) {
    this.dateLocale = dateLocale;
    return this;
  }

  /**
   * User locale for dates
   * @return dateLocale
   */
  @javax.annotation.Nullable
  public String getDateLocale() {
    return dateLocale;
  }

  public void setDateLocale(@javax.annotation.Nullable String dateLocale) {
    this.dateLocale = dateLocale;
  }


  public ProfileDTO locale(@javax.annotation.Nullable String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * User locale
   * @return locale
   */
  @javax.annotation.Nullable
  public String getLocale() {
    return locale;
  }

  public void setLocale(@javax.annotation.Nullable String locale) {
    this.locale = locale;
  }


  public ProfileDTO timezone(@javax.annotation.Nullable String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * User timezone
   * @return timezone
   */
  @javax.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(@javax.annotation.Nullable String timezone) {
    this.timezone = timezone;
  }


  public ProfileDTO corporateUser(@javax.annotation.Nullable Boolean corporateUser) {
    this.corporateUser = corporateUser;
    return this;
  }

  /**
   * Is corporate user
   * @return corporateUser
   */
  @javax.annotation.Nullable
  public Boolean getCorporateUser() {
    return corporateUser;
  }

  public void setCorporateUser(@javax.annotation.Nullable Boolean corporateUser) {
    this.corporateUser = corporateUser;
  }


  public ProfileDTO ssoEnabled(@javax.annotation.Nullable Boolean ssoEnabled) {
    this.ssoEnabled = ssoEnabled;
    return this;
  }

  /**
   * Is SSO enabled for user
   * @return ssoEnabled
   */
  @javax.annotation.Nullable
  public Boolean getSsoEnabled() {
    return ssoEnabled;
  }

  public void setSsoEnabled(@javax.annotation.Nullable Boolean ssoEnabled) {
    this.ssoEnabled = ssoEnabled;
  }


  public ProfileDTO autoDepositMailboxUuid(@javax.annotation.Nullable UUID autoDepositMailboxUuid) {
    this.autoDepositMailboxUuid = autoDepositMailboxUuid;
    return this;
  }

  /**
   * Auto Deposit Mailbox UUID
   * @return autoDepositMailboxUuid
   */
  @javax.annotation.Nullable
  public UUID getAutoDepositMailboxUuid() {
    return autoDepositMailboxUuid;
  }

  public void setAutoDepositMailboxUuid(@javax.annotation.Nullable UUID autoDepositMailboxUuid) {
    this.autoDepositMailboxUuid = autoDepositMailboxUuid;
  }


  public ProfileDTO phone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * User phone
   * @return phone
   */
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
  }


  public ProfileDTO displayExactDate(@javax.annotation.Nullable Boolean displayExactDate) {
    this.displayExactDate = displayExactDate;
    return this;
  }

  /**
   * Display exact date instead of relative
   * @return displayExactDate
   */
  @javax.annotation.Nullable
  public Boolean getDisplayExactDate() {
    return displayExactDate;
  }

  public void setDisplayExactDate(@javax.annotation.Nullable Boolean displayExactDate) {
    this.displayExactDate = displayExactDate;
  }


  public ProfileDTO signature(@javax.annotation.Nullable String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Saved eInk signature
   * @return signature
   */
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }

  public void setSignature(@javax.annotation.Nullable String signature) {
    this.signature = signature;
  }


  public ProfileDTO initials(@javax.annotation.Nullable String initials) {
    this.initials = initials;
    return this;
  }

  /**
   * Saved initials
   * @return initials
   */
  @javax.annotation.Nullable
  public String getInitials() {
    return initials;
  }

  public void setInitials(@javax.annotation.Nullable String initials) {
    this.initials = initials;
  }


  public ProfileDTO accounts(@javax.annotation.Nullable List<User2AccountWithMailboxesDTO> accounts) {
    this.accounts = accounts;
    return this;
  }

  public ProfileDTO addAccountsItem(User2AccountWithMailboxesDTO accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * User accounts belongs to
   * @return accounts
   */
  @javax.annotation.Nullable
  public List<User2AccountWithMailboxesDTO> getAccounts() {
    return accounts;
  }

  public void setAccounts(@javax.annotation.Nullable List<User2AccountWithMailboxesDTO> accounts) {
    this.accounts = accounts;
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
   * @return the ProfileDTO instance itself
   */
  public ProfileDTO putAdditionalProperty(String key, Object value) {
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
    ProfileDTO profileDTO = (ProfileDTO) o;
    return Objects.equals(this.uuid, profileDTO.uuid) &&
        Objects.equals(this.email, profileDTO.email) &&
        Objects.equals(this.firstName, profileDTO.firstName) &&
        Objects.equals(this.lastName, profileDTO.lastName) &&
        Objects.equals(this.status, profileDTO.status) &&
        Objects.equals(this.dateLocale, profileDTO.dateLocale) &&
        Objects.equals(this.locale, profileDTO.locale) &&
        Objects.equals(this.timezone, profileDTO.timezone) &&
        Objects.equals(this.corporateUser, profileDTO.corporateUser) &&
        Objects.equals(this.ssoEnabled, profileDTO.ssoEnabled) &&
        Objects.equals(this.autoDepositMailboxUuid, profileDTO.autoDepositMailboxUuid) &&
        Objects.equals(this.phone, profileDTO.phone) &&
        Objects.equals(this.displayExactDate, profileDTO.displayExactDate) &&
        Objects.equals(this.signature, profileDTO.signature) &&
        Objects.equals(this.initials, profileDTO.initials) &&
        Objects.equals(this.accounts, profileDTO.accounts)&&
        Objects.equals(this.additionalProperties, profileDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, email, firstName, lastName, status, dateLocale, locale, timezone, corporateUser, ssoEnabled, autoDepositMailboxUuid, phone, displayExactDate, signature, initials, accounts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileDTO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateLocale: ").append(toIndentedString(dateLocale)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    corporateUser: ").append(toIndentedString(corporateUser)).append("\n");
    sb.append("    ssoEnabled: ").append(toIndentedString(ssoEnabled)).append("\n");
    sb.append("    autoDepositMailboxUuid: ").append(toIndentedString(autoDepositMailboxUuid)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    displayExactDate: ").append(toIndentedString(displayExactDate)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    initials: ").append(toIndentedString(initials)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("status");
    openapiFields.add("dateLocale");
    openapiFields.add("locale");
    openapiFields.add("timezone");
    openapiFields.add("corporateUser");
    openapiFields.add("ssoEnabled");
    openapiFields.add("autoDepositMailboxUuid");
    openapiFields.add("phone");
    openapiFields.add("displayExactDate");
    openapiFields.add("signature");
    openapiFields.add("initials");
    openapiFields.add("accounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProfileDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProfileDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProfileDTO is not found in the empty JSON string", ProfileDTO.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("dateLocale") != null && !jsonObj.get("dateLocale").isJsonNull()) && !jsonObj.get("dateLocale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateLocale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateLocale").toString()));
      }
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("autoDepositMailboxUuid") != null && !jsonObj.get("autoDepositMailboxUuid").isJsonNull()) && !jsonObj.get("autoDepositMailboxUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoDepositMailboxUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("autoDepositMailboxUuid").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
      if ((jsonObj.get("initials") != null && !jsonObj.get("initials").isJsonNull()) && !jsonObj.get("initials").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initials` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initials").toString()));
      }
      if (jsonObj.get("accounts") != null && !jsonObj.get("accounts").isJsonNull()) {
        JsonArray jsonArrayaccounts = jsonObj.getAsJsonArray("accounts");
        if (jsonArrayaccounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("accounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `accounts` to be an array in the JSON string but got `%s`", jsonObj.get("accounts").toString()));
          }

          // validate the optional field `accounts` (array)
          for (int i = 0; i < jsonArrayaccounts.size(); i++) {
            User2AccountWithMailboxesDTO.validateJsonElement(jsonArrayaccounts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProfileDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProfileDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProfileDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProfileDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ProfileDTO>() {
           @Override
           public void write(JsonWriter out, ProfileDTO value) throws IOException {
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
           public ProfileDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ProfileDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of ProfileDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProfileDTO
   * @throws IOException if the JSON string is invalid with respect to ProfileDTO
   */
  public static ProfileDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProfileDTO.class);
  }

  /**
   * Convert an instance of ProfileDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

