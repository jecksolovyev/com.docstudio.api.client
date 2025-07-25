/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R135.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import java.util.Objects;
import com.docstudio.client.model.AccountUserDTO;
import com.docstudio.client.model.MailboxSimpleDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * AccountDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-23T12:49:56.203839-06:00[America/Edmonton]", comments = "Generator version: 7.14.0")
public class AccountDTO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_INN = "inn";
  @SerializedName(SERIALIZED_NAME_INN)
  @javax.annotation.Nullable
  private String inn;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_MODIFIED_AT = "modifiedAt";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime modifiedAt;

  public static final String SERIALIZED_NAME_MAILBOXES = "mailboxes";
  @SerializedName(SERIALIZED_NAME_MAILBOXES)
  @javax.annotation.Nullable
  private List<MailboxSimpleDTO> mailboxes = new ArrayList<>();

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  @javax.annotation.Nullable
  private List<AccountUserDTO> users = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  @javax.annotation.Nullable
  private String logo;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  @javax.annotation.Nullable
  private String brand;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  @javax.annotation.Nullable
  private String timezone;

  public static final String SERIALIZED_NAME_ALLOW_CREATE_PERSONAL_MAILBOX_WITH_ROLE = "allowCreatePersonalMailboxWithRole";
  @SerializedName(SERIALIZED_NAME_ALLOW_CREATE_PERSONAL_MAILBOX_WITH_ROLE)
  @javax.annotation.Nullable
  private UUID allowCreatePersonalMailboxWithRole;

  public static final String SERIALIZED_NAME_ALLOW_MICROSOFT_OFFICE_VIEWER = "allowMicrosoftOfficeViewer";
  @SerializedName(SERIALIZED_NAME_ALLOW_MICROSOFT_OFFICE_VIEWER)
  @javax.annotation.Nullable
  private Boolean allowMicrosoftOfficeViewer;

  public static final String SERIALIZED_NAME_CORPORATE_PROFILE_EDIT_RESTRICTED = "corporateProfileEditRestricted";
  @SerializedName(SERIALIZED_NAME_CORPORATE_PROFILE_EDIT_RESTRICTED)
  @javax.annotation.Nullable
  private Boolean corporateProfileEditRestricted;

  public AccountDTO() {
  }

  public AccountDTO uuid(@javax.annotation.Nullable UUID uuid) {
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

  public void setUuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
  }


  public AccountDTO name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Account Name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public AccountDTO inn(@javax.annotation.Nullable String inn) {
    this.inn = inn;
    return this;
  }

  /**
   * Account TAX number
   * @return inn
   */
  @javax.annotation.Nullable
  public String getInn() {
    return inn;
  }

  public void setInn(@javax.annotation.Nullable String inn) {
    this.inn = inn;
  }


  public AccountDTO createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Account creation date
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AccountDTO modifiedAt(@javax.annotation.Nullable OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Account last modification date
   * @return modifiedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(@javax.annotation.Nullable OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  public AccountDTO mailboxes(@javax.annotation.Nullable List<MailboxSimpleDTO> mailboxes) {
    this.mailboxes = mailboxes;
    return this;
  }

  public AccountDTO addMailboxesItem(MailboxSimpleDTO mailboxesItem) {
    if (this.mailboxes == null) {
      this.mailboxes = new ArrayList<>();
    }
    this.mailboxes.add(mailboxesItem);
    return this;
  }

  /**
   * Get mailboxes
   * @return mailboxes
   */
  @javax.annotation.Nullable
  public List<MailboxSimpleDTO> getMailboxes() {
    return mailboxes;
  }

  public void setMailboxes(@javax.annotation.Nullable List<MailboxSimpleDTO> mailboxes) {
    this.mailboxes = mailboxes;
  }


  public AccountDTO users(@javax.annotation.Nullable List<AccountUserDTO> users) {
    this.users = users;
    return this;
  }

  public AccountDTO addUsersItem(AccountUserDTO usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
   */
  @javax.annotation.Nullable
  public List<AccountUserDTO> getUsers() {
    return users;
  }

  public void setUsers(@javax.annotation.Nullable List<AccountUserDTO> users) {
    this.users = users;
  }


  public AccountDTO logo(@javax.annotation.Nullable String logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Account logo in base64 format (svg, png, jpeg)
   * @return logo
   */
  @javax.annotation.Nullable
  public String getLogo() {
    return logo;
  }

  public void setLogo(@javax.annotation.Nullable String logo) {
    this.logo = logo;
  }


  public AccountDTO brand(@javax.annotation.Nullable String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Account brand logo in base64 format (svg, png, jpeg)
   * @return brand
   */
  @javax.annotation.Nullable
  public String getBrand() {
    return brand;
  }

  public void setBrand(@javax.annotation.Nullable String brand) {
    this.brand = brand;
  }


  public AccountDTO currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Account currency for billing purposes
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public AccountDTO timezone(@javax.annotation.Nullable String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Account timezone for billing purposes
   * @return timezone
   */
  @javax.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(@javax.annotation.Nullable String timezone) {
    this.timezone = timezone;
  }


  public AccountDTO allowCreatePersonalMailboxWithRole(@javax.annotation.Nullable UUID allowCreatePersonalMailboxWithRole) {
    this.allowCreatePersonalMailboxWithRole = allowCreatePersonalMailboxWithRole;
    return this;
  }

  /**
   * Create personal mailbox for self-registered corporate user with role UUID
   * @return allowCreatePersonalMailboxWithRole
   */
  @javax.annotation.Nullable
  public UUID getAllowCreatePersonalMailboxWithRole() {
    return allowCreatePersonalMailboxWithRole;
  }

  public void setAllowCreatePersonalMailboxWithRole(@javax.annotation.Nullable UUID allowCreatePersonalMailboxWithRole) {
    this.allowCreatePersonalMailboxWithRole = allowCreatePersonalMailboxWithRole;
  }


  public AccountDTO allowMicrosoftOfficeViewer(@javax.annotation.Nullable Boolean allowMicrosoftOfficeViewer) {
    this.allowMicrosoftOfficeViewer = allowMicrosoftOfficeViewer;
    return this;
  }

  /**
   * Allow envelope attachments public access for MS Office Viewer
   * @return allowMicrosoftOfficeViewer
   */
  @javax.annotation.Nullable
  public Boolean getAllowMicrosoftOfficeViewer() {
    return allowMicrosoftOfficeViewer;
  }

  public void setAllowMicrosoftOfficeViewer(@javax.annotation.Nullable Boolean allowMicrosoftOfficeViewer) {
    this.allowMicrosoftOfficeViewer = allowMicrosoftOfficeViewer;
  }


  public AccountDTO corporateProfileEditRestricted(@javax.annotation.Nullable Boolean corporateProfileEditRestricted) {
    this.corporateProfileEditRestricted = corporateProfileEditRestricted;
    return this;
  }

  /**
   * Is profile editing restricted for corporate users?
   * @return corporateProfileEditRestricted
   */
  @javax.annotation.Nullable
  public Boolean getCorporateProfileEditRestricted() {
    return corporateProfileEditRestricted;
  }

  public void setCorporateProfileEditRestricted(@javax.annotation.Nullable Boolean corporateProfileEditRestricted) {
    this.corporateProfileEditRestricted = corporateProfileEditRestricted;
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
   * @return the AccountDTO instance itself
   */
  public AccountDTO putAdditionalProperty(String key, Object value) {
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
    AccountDTO accountDTO = (AccountDTO) o;
    return Objects.equals(this.uuid, accountDTO.uuid) &&
        Objects.equals(this.name, accountDTO.name) &&
        Objects.equals(this.inn, accountDTO.inn) &&
        Objects.equals(this.createdAt, accountDTO.createdAt) &&
        Objects.equals(this.modifiedAt, accountDTO.modifiedAt) &&
        Objects.equals(this.mailboxes, accountDTO.mailboxes) &&
        Objects.equals(this.users, accountDTO.users) &&
        Objects.equals(this.logo, accountDTO.logo) &&
        Objects.equals(this.brand, accountDTO.brand) &&
        Objects.equals(this.currency, accountDTO.currency) &&
        Objects.equals(this.timezone, accountDTO.timezone) &&
        Objects.equals(this.allowCreatePersonalMailboxWithRole, accountDTO.allowCreatePersonalMailboxWithRole) &&
        Objects.equals(this.allowMicrosoftOfficeViewer, accountDTO.allowMicrosoftOfficeViewer) &&
        Objects.equals(this.corporateProfileEditRestricted, accountDTO.corporateProfileEditRestricted)&&
        Objects.equals(this.additionalProperties, accountDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, inn, createdAt, modifiedAt, mailboxes, users, logo, brand, currency, timezone, allowCreatePersonalMailboxWithRole, allowMicrosoftOfficeViewer, corporateProfileEditRestricted, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDTO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    mailboxes: ").append(toIndentedString(mailboxes)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    allowCreatePersonalMailboxWithRole: ").append(toIndentedString(allowCreatePersonalMailboxWithRole)).append("\n");
    sb.append("    allowMicrosoftOfficeViewer: ").append(toIndentedString(allowMicrosoftOfficeViewer)).append("\n");
    sb.append("    corporateProfileEditRestricted: ").append(toIndentedString(corporateProfileEditRestricted)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("uuid", "name", "inn", "createdAt", "modifiedAt", "mailboxes", "users", "logo", "brand", "currency", "timezone", "allowCreatePersonalMailboxWithRole", "allowMicrosoftOfficeViewer", "corporateProfileEditRestricted"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("name"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountDTO is not found in the empty JSON string", AccountDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("inn") != null && !jsonObj.get("inn").isJsonNull()) && !jsonObj.get("inn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inn").toString()));
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
            MailboxSimpleDTO.validateJsonElement(jsonArraymailboxes.get(i));
          };
        }
      }
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull()) {
        JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
        if (jsonArrayusers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("users").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
          }

          // validate the optional field `users` (array)
          for (int i = 0; i < jsonArrayusers.size(); i++) {
            AccountUserDTO.validateJsonElement(jsonArrayusers.get(i));
          };
        }
      }
      if ((jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if ((jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()) && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("allowCreatePersonalMailboxWithRole") != null && !jsonObj.get("allowCreatePersonalMailboxWithRole").isJsonNull()) && !jsonObj.get("allowCreatePersonalMailboxWithRole").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowCreatePersonalMailboxWithRole` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allowCreatePersonalMailboxWithRole").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountDTO>() {
           @Override
           public void write(JsonWriter out, AccountDTO value) throws IOException {
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
           public AccountDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AccountDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AccountDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountDTO
   * @throws IOException if the JSON string is invalid with respect to AccountDTO
   */
  public static AccountDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountDTO.class);
  }

  /**
   * Convert an instance of AccountDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

