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
 * Password policy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class PasswordPolicy {
  public static final String SERIALIZED_NAME_MIN_LENGTH = "minLength";
  @SerializedName(SERIALIZED_NAME_MIN_LENGTH)
  private Integer minLength;

  public static final String SERIALIZED_NAME_MAX_LENGTH = "maxLength";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH)
  private Integer maxLength;

  public static final String SERIALIZED_NAME_UPPERCASE = "uppercase";
  @SerializedName(SERIALIZED_NAME_UPPERCASE)
  private Integer uppercase;

  public static final String SERIALIZED_NAME_LOWERCASE = "lowercase";
  @SerializedName(SERIALIZED_NAME_LOWERCASE)
  private Integer lowercase;

  public static final String SERIALIZED_NAME_DIGIT = "digit";
  @SerializedName(SERIALIZED_NAME_DIGIT)
  private Integer digit;

  public static final String SERIALIZED_NAME_SPECIAL_SYMBOL = "specialSymbol";
  @SerializedName(SERIALIZED_NAME_SPECIAL_SYMBOL)
  private Integer specialSymbol;

  public static final String SERIALIZED_NAME_REPEAT_CHARACTER = "repeatCharacter";
  @SerializedName(SERIALIZED_NAME_REPEAT_CHARACTER)
  private Integer repeatCharacter;

  public static final String SERIALIZED_NAME_ALLOW_WHITESPACE = "allowWhitespace";
  @SerializedName(SERIALIZED_NAME_ALLOW_WHITESPACE)
  private Boolean allowWhitespace;

  public static final String SERIALIZED_NAME_PREVENT_COMMON_PASSWORDS = "preventCommonPasswords";
  @SerializedName(SERIALIZED_NAME_PREVENT_COMMON_PASSWORDS)
  private Boolean preventCommonPasswords;

  public static final String SERIALIZED_NAME_PREVENT_COMMON_WORDS = "preventCommonWords";
  @SerializedName(SERIALIZED_NAME_PREVENT_COMMON_WORDS)
  private Boolean preventCommonWords;

  public static final String SERIALIZED_NAME_EXPIRATION_DAYS = "expirationDays";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DAYS)
  private Integer expirationDays;

  public static final String SERIALIZED_NAME_NOTIFY_BEFORE_DAYS = "notifyBeforeDays";
  @SerializedName(SERIALIZED_NAME_NOTIFY_BEFORE_DAYS)
  private Integer notifyBeforeDays;

  public static final String SERIALIZED_NAME_PREVENT_REUSE_MONTHS = "preventReuseMonths";
  @SerializedName(SERIALIZED_NAME_PREVENT_REUSE_MONTHS)
  private Integer preventReuseMonths;

  public static final String SERIALIZED_NAME_PREVENT_REUSE_COUNT = "preventReuseCount";
  @SerializedName(SERIALIZED_NAME_PREVENT_REUSE_COUNT)
  private Integer preventReuseCount;

  public PasswordPolicy() {
  }

  public PasswordPolicy minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * Get minLength
   * @return minLength
   */
  @javax.annotation.Nullable
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }


  public PasswordPolicy maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Get maxLength
   * @return maxLength
   */
  @javax.annotation.Nullable
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  public PasswordPolicy uppercase(Integer uppercase) {
    this.uppercase = uppercase;
    return this;
  }

  /**
   * Get uppercase
   * @return uppercase
   */
  @javax.annotation.Nullable
  public Integer getUppercase() {
    return uppercase;
  }

  public void setUppercase(Integer uppercase) {
    this.uppercase = uppercase;
  }


  public PasswordPolicy lowercase(Integer lowercase) {
    this.lowercase = lowercase;
    return this;
  }

  /**
   * Get lowercase
   * @return lowercase
   */
  @javax.annotation.Nullable
  public Integer getLowercase() {
    return lowercase;
  }

  public void setLowercase(Integer lowercase) {
    this.lowercase = lowercase;
  }


  public PasswordPolicy digit(Integer digit) {
    this.digit = digit;
    return this;
  }

  /**
   * Get digit
   * @return digit
   */
  @javax.annotation.Nullable
  public Integer getDigit() {
    return digit;
  }

  public void setDigit(Integer digit) {
    this.digit = digit;
  }


  public PasswordPolicy specialSymbol(Integer specialSymbol) {
    this.specialSymbol = specialSymbol;
    return this;
  }

  /**
   * Get specialSymbol
   * @return specialSymbol
   */
  @javax.annotation.Nullable
  public Integer getSpecialSymbol() {
    return specialSymbol;
  }

  public void setSpecialSymbol(Integer specialSymbol) {
    this.specialSymbol = specialSymbol;
  }


  public PasswordPolicy repeatCharacter(Integer repeatCharacter) {
    this.repeatCharacter = repeatCharacter;
    return this;
  }

  /**
   * Get repeatCharacter
   * @return repeatCharacter
   */
  @javax.annotation.Nullable
  public Integer getRepeatCharacter() {
    return repeatCharacter;
  }

  public void setRepeatCharacter(Integer repeatCharacter) {
    this.repeatCharacter = repeatCharacter;
  }


  public PasswordPolicy allowWhitespace(Boolean allowWhitespace) {
    this.allowWhitespace = allowWhitespace;
    return this;
  }

  /**
   * Get allowWhitespace
   * @return allowWhitespace
   */
  @javax.annotation.Nullable
  public Boolean getAllowWhitespace() {
    return allowWhitespace;
  }

  public void setAllowWhitespace(Boolean allowWhitespace) {
    this.allowWhitespace = allowWhitespace;
  }


  public PasswordPolicy preventCommonPasswords(Boolean preventCommonPasswords) {
    this.preventCommonPasswords = preventCommonPasswords;
    return this;
  }

  /**
   * Get preventCommonPasswords
   * @return preventCommonPasswords
   */
  @javax.annotation.Nullable
  public Boolean getPreventCommonPasswords() {
    return preventCommonPasswords;
  }

  public void setPreventCommonPasswords(Boolean preventCommonPasswords) {
    this.preventCommonPasswords = preventCommonPasswords;
  }


  public PasswordPolicy preventCommonWords(Boolean preventCommonWords) {
    this.preventCommonWords = preventCommonWords;
    return this;
  }

  /**
   * Get preventCommonWords
   * @return preventCommonWords
   */
  @javax.annotation.Nullable
  public Boolean getPreventCommonWords() {
    return preventCommonWords;
  }

  public void setPreventCommonWords(Boolean preventCommonWords) {
    this.preventCommonWords = preventCommonWords;
  }


  public PasswordPolicy expirationDays(Integer expirationDays) {
    this.expirationDays = expirationDays;
    return this;
  }

  /**
   * Get expirationDays
   * @return expirationDays
   */
  @javax.annotation.Nullable
  public Integer getExpirationDays() {
    return expirationDays;
  }

  public void setExpirationDays(Integer expirationDays) {
    this.expirationDays = expirationDays;
  }


  public PasswordPolicy notifyBeforeDays(Integer notifyBeforeDays) {
    this.notifyBeforeDays = notifyBeforeDays;
    return this;
  }

  /**
   * Get notifyBeforeDays
   * @return notifyBeforeDays
   */
  @javax.annotation.Nullable
  public Integer getNotifyBeforeDays() {
    return notifyBeforeDays;
  }

  public void setNotifyBeforeDays(Integer notifyBeforeDays) {
    this.notifyBeforeDays = notifyBeforeDays;
  }


  public PasswordPolicy preventReuseMonths(Integer preventReuseMonths) {
    this.preventReuseMonths = preventReuseMonths;
    return this;
  }

  /**
   * Get preventReuseMonths
   * @return preventReuseMonths
   */
  @javax.annotation.Nullable
  public Integer getPreventReuseMonths() {
    return preventReuseMonths;
  }

  public void setPreventReuseMonths(Integer preventReuseMonths) {
    this.preventReuseMonths = preventReuseMonths;
  }


  public PasswordPolicy preventReuseCount(Integer preventReuseCount) {
    this.preventReuseCount = preventReuseCount;
    return this;
  }

  /**
   * Get preventReuseCount
   * @return preventReuseCount
   */
  @javax.annotation.Nullable
  public Integer getPreventReuseCount() {
    return preventReuseCount;
  }

  public void setPreventReuseCount(Integer preventReuseCount) {
    this.preventReuseCount = preventReuseCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordPolicy passwordPolicy = (PasswordPolicy) o;
    return Objects.equals(this.minLength, passwordPolicy.minLength) &&
        Objects.equals(this.maxLength, passwordPolicy.maxLength) &&
        Objects.equals(this.uppercase, passwordPolicy.uppercase) &&
        Objects.equals(this.lowercase, passwordPolicy.lowercase) &&
        Objects.equals(this.digit, passwordPolicy.digit) &&
        Objects.equals(this.specialSymbol, passwordPolicy.specialSymbol) &&
        Objects.equals(this.repeatCharacter, passwordPolicy.repeatCharacter) &&
        Objects.equals(this.allowWhitespace, passwordPolicy.allowWhitespace) &&
        Objects.equals(this.preventCommonPasswords, passwordPolicy.preventCommonPasswords) &&
        Objects.equals(this.preventCommonWords, passwordPolicy.preventCommonWords) &&
        Objects.equals(this.expirationDays, passwordPolicy.expirationDays) &&
        Objects.equals(this.notifyBeforeDays, passwordPolicy.notifyBeforeDays) &&
        Objects.equals(this.preventReuseMonths, passwordPolicy.preventReuseMonths) &&
        Objects.equals(this.preventReuseCount, passwordPolicy.preventReuseCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minLength, maxLength, uppercase, lowercase, digit, specialSymbol, repeatCharacter, allowWhitespace, preventCommonPasswords, preventCommonWords, expirationDays, notifyBeforeDays, preventReuseMonths, preventReuseCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicy {\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    uppercase: ").append(toIndentedString(uppercase)).append("\n");
    sb.append("    lowercase: ").append(toIndentedString(lowercase)).append("\n");
    sb.append("    digit: ").append(toIndentedString(digit)).append("\n");
    sb.append("    specialSymbol: ").append(toIndentedString(specialSymbol)).append("\n");
    sb.append("    repeatCharacter: ").append(toIndentedString(repeatCharacter)).append("\n");
    sb.append("    allowWhitespace: ").append(toIndentedString(allowWhitespace)).append("\n");
    sb.append("    preventCommonPasswords: ").append(toIndentedString(preventCommonPasswords)).append("\n");
    sb.append("    preventCommonWords: ").append(toIndentedString(preventCommonWords)).append("\n");
    sb.append("    expirationDays: ").append(toIndentedString(expirationDays)).append("\n");
    sb.append("    notifyBeforeDays: ").append(toIndentedString(notifyBeforeDays)).append("\n");
    sb.append("    preventReuseMonths: ").append(toIndentedString(preventReuseMonths)).append("\n");
    sb.append("    preventReuseCount: ").append(toIndentedString(preventReuseCount)).append("\n");
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
    openapiFields.add("minLength");
    openapiFields.add("maxLength");
    openapiFields.add("uppercase");
    openapiFields.add("lowercase");
    openapiFields.add("digit");
    openapiFields.add("specialSymbol");
    openapiFields.add("repeatCharacter");
    openapiFields.add("allowWhitespace");
    openapiFields.add("preventCommonPasswords");
    openapiFields.add("preventCommonWords");
    openapiFields.add("expirationDays");
    openapiFields.add("notifyBeforeDays");
    openapiFields.add("preventReuseMonths");
    openapiFields.add("preventReuseCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PasswordPolicy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PasswordPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PasswordPolicy is not found in the empty JSON string", PasswordPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PasswordPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PasswordPolicy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PasswordPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PasswordPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PasswordPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PasswordPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<PasswordPolicy>() {
           @Override
           public void write(JsonWriter out, PasswordPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PasswordPolicy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PasswordPolicy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PasswordPolicy
   * @throws IOException if the JSON string is invalid with respect to PasswordPolicy
   */
  public static PasswordPolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PasswordPolicy.class);
  }

  /**
   * Convert an instance of PasswordPolicy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

