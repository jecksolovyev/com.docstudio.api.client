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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.docstudio.client.JSON;

/**
 * UserCreateDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class UserCreateDTO {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_INN = "inn";
  @SerializedName(SERIALIZED_NAME_INN)
  private String inn;

  public static final String SERIALIZED_NAME_MAILBOXES = "mailboxes";
  @SerializedName(SERIALIZED_NAME_MAILBOXES)
  private List<String> mailboxes = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_DATE_LOCALE = "dateLocale";
  @SerializedName(SERIALIZED_NAME_DATE_LOCALE)
  private String dateLocale;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_AGREED = "agreed";
  @SerializedName(SERIALIZED_NAME_AGREED)
  private Boolean agreed;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public UserCreateDTO() {
  }

  public UserCreateDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email
   * @return email
   */
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public UserCreateDTO password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password
   * @return password
   */
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public UserCreateDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name
   * @return firstName
   */
  @javax.annotation.Nonnull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UserCreateDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name
   * @return lastName
   */
  @javax.annotation.Nonnull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public UserCreateDTO companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Company name
   * @return companyName
   */
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public UserCreateDTO inn(String inn) {
    this.inn = inn;
    return this;
  }

  /**
   * Get inn
   * @return inn
   */
  @javax.annotation.Nullable
  public String getInn() {
    return inn;
  }

  public void setInn(String inn) {
    this.inn = inn;
  }


  public UserCreateDTO mailboxes(List<String> mailboxes) {
    this.mailboxes = mailboxes;
    return this;
  }

  public UserCreateDTO addMailboxesItem(String mailboxesItem) {
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
  public List<String> getMailboxes() {
    return mailboxes;
  }

  public void setMailboxes(List<String> mailboxes) {
    this.mailboxes = mailboxes;
  }


  public UserCreateDTO locale(String locale) {
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

  public void setLocale(String locale) {
    this.locale = locale;
  }


  public UserCreateDTO dateLocale(String dateLocale) {
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

  public void setDateLocale(String dateLocale) {
    this.dateLocale = dateLocale;
  }


  public UserCreateDTO timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * User preferred timezone
   * @return timezone
   */
  @javax.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public UserCreateDTO agreed(Boolean agreed) {
    this.agreed = agreed;
    return this;
  }

  /**
   * Agreed with terms of service
   * @return agreed
   */
  @javax.annotation.Nonnull
  public Boolean getAgreed() {
    return agreed;
  }

  public void setAgreed(Boolean agreed) {
    this.agreed = agreed;
  }


  public UserCreateDTO phone(String phone) {
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

  public void setPhone(String phone) {
    this.phone = phone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreateDTO userCreateDTO = (UserCreateDTO) o;
    return Objects.equals(this.email, userCreateDTO.email) &&
        Objects.equals(this.password, userCreateDTO.password) &&
        Objects.equals(this.firstName, userCreateDTO.firstName) &&
        Objects.equals(this.lastName, userCreateDTO.lastName) &&
        Objects.equals(this.companyName, userCreateDTO.companyName) &&
        Objects.equals(this.inn, userCreateDTO.inn) &&
        Objects.equals(this.mailboxes, userCreateDTO.mailboxes) &&
        Objects.equals(this.locale, userCreateDTO.locale) &&
        Objects.equals(this.dateLocale, userCreateDTO.dateLocale) &&
        Objects.equals(this.timezone, userCreateDTO.timezone) &&
        Objects.equals(this.agreed, userCreateDTO.agreed) &&
        Objects.equals(this.phone, userCreateDTO.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password, firstName, lastName, companyName, inn, mailboxes, locale, dateLocale, timezone, agreed, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateDTO {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    mailboxes: ").append(toIndentedString(mailboxes)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateLocale: ").append(toIndentedString(dateLocale)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    agreed: ").append(toIndentedString(agreed)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("password");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("companyName");
    openapiFields.add("inn");
    openapiFields.add("mailboxes");
    openapiFields.add("locale");
    openapiFields.add("dateLocale");
    openapiFields.add("timezone");
    openapiFields.add("agreed");
    openapiFields.add("phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("agreed");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserCreateDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserCreateDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserCreateDTO is not found in the empty JSON string", UserCreateDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserCreateDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserCreateDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserCreateDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if (!jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (!jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("companyName") != null && !jsonObj.get("companyName").isJsonNull()) && !jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      if ((jsonObj.get("inn") != null && !jsonObj.get("inn").isJsonNull()) && !jsonObj.get("inn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inn").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("mailboxes") != null && !jsonObj.get("mailboxes").isJsonNull() && !jsonObj.get("mailboxes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxes` to be an array in the JSON string but got `%s`", jsonObj.get("mailboxes").toString()));
      }
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      if ((jsonObj.get("dateLocale") != null && !jsonObj.get("dateLocale").isJsonNull()) && !jsonObj.get("dateLocale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateLocale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateLocale").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserCreateDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserCreateDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserCreateDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserCreateDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UserCreateDTO>() {
           @Override
           public void write(JsonWriter out, UserCreateDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserCreateDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserCreateDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserCreateDTO
   * @throws IOException if the JSON string is invalid with respect to UserCreateDTO
   */
  public static UserCreateDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserCreateDTO.class);
  }

  /**
   * Convert an instance of UserCreateDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

