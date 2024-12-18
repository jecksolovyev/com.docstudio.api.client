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
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * UpdateProfileDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T17:18:48.308949400+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class UpdateProfileDTO {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  @javax.annotation.Nonnull
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  @javax.annotation.Nonnull
  private String lastName;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  @javax.annotation.Nonnull
  private String locale;

  public static final String SERIALIZED_NAME_DATE_LOCALE = "dateLocale";
  @SerializedName(SERIALIZED_NAME_DATE_LOCALE)
  @javax.annotation.Nonnull
  private String dateLocale;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  @javax.annotation.Nonnull
  private String timezone;

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

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  @javax.annotation.Nullable
  private String avatar;

  public UpdateProfileDTO() {
  }

  public UpdateProfileDTO firstName(@javax.annotation.Nonnull String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * User first name
   * @return firstName
   */
  @javax.annotation.Nonnull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@javax.annotation.Nonnull String firstName) {
    this.firstName = firstName;
  }


  public UpdateProfileDTO lastName(@javax.annotation.Nonnull String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * User last name
   * @return lastName
   */
  @javax.annotation.Nonnull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@javax.annotation.Nonnull String lastName) {
    this.lastName = lastName;
  }


  public UpdateProfileDTO locale(@javax.annotation.Nonnull String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * User locale
   * @return locale
   */
  @javax.annotation.Nonnull
  public String getLocale() {
    return locale;
  }

  public void setLocale(@javax.annotation.Nonnull String locale) {
    this.locale = locale;
  }


  public UpdateProfileDTO dateLocale(@javax.annotation.Nonnull String dateLocale) {
    this.dateLocale = dateLocale;
    return this;
  }

  /**
   * User locale for dates
   * @return dateLocale
   */
  @javax.annotation.Nonnull
  public String getDateLocale() {
    return dateLocale;
  }

  public void setDateLocale(@javax.annotation.Nonnull String dateLocale) {
    this.dateLocale = dateLocale;
  }


  public UpdateProfileDTO timezone(@javax.annotation.Nonnull String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * User timezone
   * @return timezone
   */
  @javax.annotation.Nonnull
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(@javax.annotation.Nonnull String timezone) {
    this.timezone = timezone;
  }


  public UpdateProfileDTO autoDepositMailboxUuid(@javax.annotation.Nullable UUID autoDepositMailboxUuid) {
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


  public UpdateProfileDTO phone(@javax.annotation.Nullable String phone) {
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


  public UpdateProfileDTO displayExactDate(@javax.annotation.Nullable Boolean displayExactDate) {
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


  public UpdateProfileDTO avatar(@javax.annotation.Nullable String avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * User avatar in base64 format (svg, png, jpeg)
   * @return avatar
   */
  @javax.annotation.Nullable
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(@javax.annotation.Nullable String avatar) {
    this.avatar = avatar;
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
   * @return the UpdateProfileDTO instance itself
   */
  public UpdateProfileDTO putAdditionalProperty(String key, Object value) {
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
    UpdateProfileDTO updateProfileDTO = (UpdateProfileDTO) o;
    return Objects.equals(this.firstName, updateProfileDTO.firstName) &&
        Objects.equals(this.lastName, updateProfileDTO.lastName) &&
        Objects.equals(this.locale, updateProfileDTO.locale) &&
        Objects.equals(this.dateLocale, updateProfileDTO.dateLocale) &&
        Objects.equals(this.timezone, updateProfileDTO.timezone) &&
        Objects.equals(this.autoDepositMailboxUuid, updateProfileDTO.autoDepositMailboxUuid) &&
        Objects.equals(this.phone, updateProfileDTO.phone) &&
        Objects.equals(this.displayExactDate, updateProfileDTO.displayExactDate) &&
        Objects.equals(this.avatar, updateProfileDTO.avatar)&&
        Objects.equals(this.additionalProperties, updateProfileDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, locale, dateLocale, timezone, autoDepositMailboxUuid, phone, displayExactDate, avatar, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProfileDTO {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateLocale: ").append(toIndentedString(dateLocale)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    autoDepositMailboxUuid: ").append(toIndentedString(autoDepositMailboxUuid)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    displayExactDate: ").append(toIndentedString(displayExactDate)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("locale");
    openapiFields.add("dateLocale");
    openapiFields.add("timezone");
    openapiFields.add("autoDepositMailboxUuid");
    openapiFields.add("phone");
    openapiFields.add("displayExactDate");
    openapiFields.add("avatar");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("locale");
    openapiRequiredFields.add("dateLocale");
    openapiRequiredFields.add("timezone");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateProfileDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateProfileDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateProfileDTO is not found in the empty JSON string", UpdateProfileDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateProfileDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (!jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if (!jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      if (!jsonObj.get("dateLocale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateLocale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateLocale").toString()));
      }
      if (!jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("autoDepositMailboxUuid") != null && !jsonObj.get("autoDepositMailboxUuid").isJsonNull()) && !jsonObj.get("autoDepositMailboxUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoDepositMailboxUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("autoDepositMailboxUuid").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("avatar") != null && !jsonObj.get("avatar").isJsonNull()) && !jsonObj.get("avatar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateProfileDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateProfileDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateProfileDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateProfileDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateProfileDTO>() {
           @Override
           public void write(JsonWriter out, UpdateProfileDTO value) throws IOException {
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
           public UpdateProfileDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UpdateProfileDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of UpdateProfileDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateProfileDTO
   * @throws IOException if the JSON string is invalid with respect to UpdateProfileDTO
   */
  public static UpdateProfileDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateProfileDTO.class);
  }

  /**
   * Convert an instance of UpdateProfileDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

