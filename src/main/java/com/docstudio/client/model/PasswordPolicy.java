/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R125.4
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
 * Password policy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T22:10:42.565042-07:00[America/Edmonton]", comments = "Generator version: 7.11.0")
public class PasswordPolicy {
  public static final String SERIALIZED_NAME_MIN_LENGTH = "minLength";
  @SerializedName(SERIALIZED_NAME_MIN_LENGTH)
  @javax.annotation.Nullable
  private Integer minLength;

  public static final String SERIALIZED_NAME_MAX_LENGTH = "maxLength";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH)
  @javax.annotation.Nullable
  private Integer maxLength;

  public static final String SERIALIZED_NAME_UPPERCASE = "uppercase";
  @SerializedName(SERIALIZED_NAME_UPPERCASE)
  @javax.annotation.Nullable
  private Integer uppercase;

  public static final String SERIALIZED_NAME_LOWERCASE = "lowercase";
  @SerializedName(SERIALIZED_NAME_LOWERCASE)
  @javax.annotation.Nullable
  private Integer lowercase;

  public static final String SERIALIZED_NAME_DIGIT = "digit";
  @SerializedName(SERIALIZED_NAME_DIGIT)
  @javax.annotation.Nullable
  private Integer digit;

  public static final String SERIALIZED_NAME_SPECIAL_SYMBOL = "specialSymbol";
  @SerializedName(SERIALIZED_NAME_SPECIAL_SYMBOL)
  @javax.annotation.Nullable
  private Integer specialSymbol;

  public static final String SERIALIZED_NAME_REPEAT_CHARACTER = "repeatCharacter";
  @SerializedName(SERIALIZED_NAME_REPEAT_CHARACTER)
  @javax.annotation.Nullable
  private Integer repeatCharacter;

  public static final String SERIALIZED_NAME_ALLOW_WHITESPACE = "allowWhitespace";
  @SerializedName(SERIALIZED_NAME_ALLOW_WHITESPACE)
  @javax.annotation.Nullable
  private Boolean allowWhitespace;

  public static final String SERIALIZED_NAME_PREVENT_COMMON_PASSWORDS = "preventCommonPasswords";
  @SerializedName(SERIALIZED_NAME_PREVENT_COMMON_PASSWORDS)
  @javax.annotation.Nullable
  private Boolean preventCommonPasswords;

  public static final String SERIALIZED_NAME_PREVENT_COMMON_WORDS = "preventCommonWords";
  @SerializedName(SERIALIZED_NAME_PREVENT_COMMON_WORDS)
  @javax.annotation.Nullable
  private Boolean preventCommonWords;

  public static final String SERIALIZED_NAME_EXPIRATION_DAYS = "expirationDays";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DAYS)
  @javax.annotation.Nullable
  private Integer expirationDays;

  public static final String SERIALIZED_NAME_NOTIFY_BEFORE_DAYS = "notifyBeforeDays";
  @SerializedName(SERIALIZED_NAME_NOTIFY_BEFORE_DAYS)
  @javax.annotation.Nullable
  private Integer notifyBeforeDays;

  public static final String SERIALIZED_NAME_PREVENT_REUSE_MONTHS = "preventReuseMonths";
  @SerializedName(SERIALIZED_NAME_PREVENT_REUSE_MONTHS)
  @javax.annotation.Nullable
  private Integer preventReuseMonths;

  public static final String SERIALIZED_NAME_PREVENT_REUSE_COUNT = "preventReuseCount";
  @SerializedName(SERIALIZED_NAME_PREVENT_REUSE_COUNT)
  @javax.annotation.Nullable
  private Integer preventReuseCount;

  public PasswordPolicy() {
  }

  public PasswordPolicy minLength(@javax.annotation.Nullable Integer minLength) {
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

  public void setMinLength(@javax.annotation.Nullable Integer minLength) {
    this.minLength = minLength;
  }


  public PasswordPolicy maxLength(@javax.annotation.Nullable Integer maxLength) {
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

  public void setMaxLength(@javax.annotation.Nullable Integer maxLength) {
    this.maxLength = maxLength;
  }


  public PasswordPolicy uppercase(@javax.annotation.Nullable Integer uppercase) {
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

  public void setUppercase(@javax.annotation.Nullable Integer uppercase) {
    this.uppercase = uppercase;
  }


  public PasswordPolicy lowercase(@javax.annotation.Nullable Integer lowercase) {
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

  public void setLowercase(@javax.annotation.Nullable Integer lowercase) {
    this.lowercase = lowercase;
  }


  public PasswordPolicy digit(@javax.annotation.Nullable Integer digit) {
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

  public void setDigit(@javax.annotation.Nullable Integer digit) {
    this.digit = digit;
  }


  public PasswordPolicy specialSymbol(@javax.annotation.Nullable Integer specialSymbol) {
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

  public void setSpecialSymbol(@javax.annotation.Nullable Integer specialSymbol) {
    this.specialSymbol = specialSymbol;
  }


  public PasswordPolicy repeatCharacter(@javax.annotation.Nullable Integer repeatCharacter) {
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

  public void setRepeatCharacter(@javax.annotation.Nullable Integer repeatCharacter) {
    this.repeatCharacter = repeatCharacter;
  }


  public PasswordPolicy allowWhitespace(@javax.annotation.Nullable Boolean allowWhitespace) {
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

  public void setAllowWhitespace(@javax.annotation.Nullable Boolean allowWhitespace) {
    this.allowWhitespace = allowWhitespace;
  }


  public PasswordPolicy preventCommonPasswords(@javax.annotation.Nullable Boolean preventCommonPasswords) {
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

  public void setPreventCommonPasswords(@javax.annotation.Nullable Boolean preventCommonPasswords) {
    this.preventCommonPasswords = preventCommonPasswords;
  }


  public PasswordPolicy preventCommonWords(@javax.annotation.Nullable Boolean preventCommonWords) {
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

  public void setPreventCommonWords(@javax.annotation.Nullable Boolean preventCommonWords) {
    this.preventCommonWords = preventCommonWords;
  }


  public PasswordPolicy expirationDays(@javax.annotation.Nullable Integer expirationDays) {
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

  public void setExpirationDays(@javax.annotation.Nullable Integer expirationDays) {
    this.expirationDays = expirationDays;
  }


  public PasswordPolicy notifyBeforeDays(@javax.annotation.Nullable Integer notifyBeforeDays) {
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

  public void setNotifyBeforeDays(@javax.annotation.Nullable Integer notifyBeforeDays) {
    this.notifyBeforeDays = notifyBeforeDays;
  }


  public PasswordPolicy preventReuseMonths(@javax.annotation.Nullable Integer preventReuseMonths) {
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

  public void setPreventReuseMonths(@javax.annotation.Nullable Integer preventReuseMonths) {
    this.preventReuseMonths = preventReuseMonths;
  }


  public PasswordPolicy preventReuseCount(@javax.annotation.Nullable Integer preventReuseCount) {
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

  public void setPreventReuseCount(@javax.annotation.Nullable Integer preventReuseCount) {
    this.preventReuseCount = preventReuseCount;
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
   * @return the PasswordPolicy instance itself
   */
  public PasswordPolicy putAdditionalProperty(String key, Object value) {
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
        Objects.equals(this.preventReuseCount, passwordPolicy.preventReuseCount)&&
        Objects.equals(this.additionalProperties, passwordPolicy.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minLength, maxLength, uppercase, lowercase, digit, specialSymbol, repeatCharacter, allowWhitespace, preventCommonPasswords, preventCommonWords, expirationDays, notifyBeforeDays, preventReuseMonths, preventReuseCount, additionalProperties);
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
           public PasswordPolicy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PasswordPolicy instance = thisAdapter.fromJsonTree(jsonObj);
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

