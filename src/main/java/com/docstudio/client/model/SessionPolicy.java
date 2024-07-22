/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R110.4
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
import java.util.LinkedHashSet;
import java.util.Set;

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
 * Session policy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class SessionPolicy {
  public static final String SERIALIZED_NAME_SESSION_HOURS = "sessionHours";
  @SerializedName(SERIALIZED_NAME_SESSION_HOURS)
  private Integer sessionHours;

  public static final String SERIALIZED_NAME_SINGLE_SESSION = "singleSession";
  @SerializedName(SERIALIZED_NAME_SINGLE_SESSION)
  private Boolean singleSession;

  public static final String SERIALIZED_NAME_SINGLE_IP_SESSION = "singleIpSession";
  @SerializedName(SERIALIZED_NAME_SINGLE_IP_SESSION)
  private Boolean singleIpSession;

  public static final String SERIALIZED_NAME_MAX_LOGIN_ATTEMPTS = "maxLoginAttempts";
  @SerializedName(SERIALIZED_NAME_MAX_LOGIN_ATTEMPTS)
  private Integer maxLoginAttempts;

  public static final String SERIALIZED_NAME_MAX_ATTEMPTS_TIMEOUT_MINUTES = "maxAttemptsTimeoutMinutes";
  @SerializedName(SERIALIZED_NAME_MAX_ATTEMPTS_TIMEOUT_MINUTES)
  private Integer maxAttemptsTimeoutMinutes;

  public static final String SERIALIZED_NAME_ALLOWED_IPS = "allowedIps";
  @SerializedName(SERIALIZED_NAME_ALLOWED_IPS)
  private Set<String> allowedIps = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_BLOCKED_IPS = "blockedIps";
  @SerializedName(SERIALIZED_NAME_BLOCKED_IPS)
  private Set<String> blockedIps = new LinkedHashSet<>();

  public SessionPolicy() {
  }

  public SessionPolicy sessionHours(Integer sessionHours) {
    this.sessionHours = sessionHours;
    return this;
  }

  /**
   * Get sessionHours
   * @return sessionHours
   */
  @javax.annotation.Nullable
  public Integer getSessionHours() {
    return sessionHours;
  }

  public void setSessionHours(Integer sessionHours) {
    this.sessionHours = sessionHours;
  }


  public SessionPolicy singleSession(Boolean singleSession) {
    this.singleSession = singleSession;
    return this;
  }

  /**
   * Get singleSession
   * @return singleSession
   */
  @javax.annotation.Nullable
  public Boolean getSingleSession() {
    return singleSession;
  }

  public void setSingleSession(Boolean singleSession) {
    this.singleSession = singleSession;
  }


  public SessionPolicy singleIpSession(Boolean singleIpSession) {
    this.singleIpSession = singleIpSession;
    return this;
  }

  /**
   * Get singleIpSession
   * @return singleIpSession
   */
  @javax.annotation.Nullable
  public Boolean getSingleIpSession() {
    return singleIpSession;
  }

  public void setSingleIpSession(Boolean singleIpSession) {
    this.singleIpSession = singleIpSession;
  }


  public SessionPolicy maxLoginAttempts(Integer maxLoginAttempts) {
    this.maxLoginAttempts = maxLoginAttempts;
    return this;
  }

  /**
   * Get maxLoginAttempts
   * @return maxLoginAttempts
   */
  @javax.annotation.Nullable
  public Integer getMaxLoginAttempts() {
    return maxLoginAttempts;
  }

  public void setMaxLoginAttempts(Integer maxLoginAttempts) {
    this.maxLoginAttempts = maxLoginAttempts;
  }


  public SessionPolicy maxAttemptsTimeoutMinutes(Integer maxAttemptsTimeoutMinutes) {
    this.maxAttemptsTimeoutMinutes = maxAttemptsTimeoutMinutes;
    return this;
  }

  /**
   * Get maxAttemptsTimeoutMinutes
   * @return maxAttemptsTimeoutMinutes
   */
  @javax.annotation.Nullable
  public Integer getMaxAttemptsTimeoutMinutes() {
    return maxAttemptsTimeoutMinutes;
  }

  public void setMaxAttemptsTimeoutMinutes(Integer maxAttemptsTimeoutMinutes) {
    this.maxAttemptsTimeoutMinutes = maxAttemptsTimeoutMinutes;
  }


  public SessionPolicy allowedIps(Set<String> allowedIps) {
    this.allowedIps = allowedIps;
    return this;
  }

  public SessionPolicy addAllowedIpsItem(String allowedIpsItem) {
    if (this.allowedIps == null) {
      this.allowedIps = new LinkedHashSet<>();
    }
    this.allowedIps.add(allowedIpsItem);
    return this;
  }

  /**
   * Get allowedIps
   * @return allowedIps
   */
  @javax.annotation.Nullable
  public Set<String> getAllowedIps() {
    return allowedIps;
  }

  public void setAllowedIps(Set<String> allowedIps) {
    this.allowedIps = allowedIps;
  }


  public SessionPolicy blockedIps(Set<String> blockedIps) {
    this.blockedIps = blockedIps;
    return this;
  }

  public SessionPolicy addBlockedIpsItem(String blockedIpsItem) {
    if (this.blockedIps == null) {
      this.blockedIps = new LinkedHashSet<>();
    }
    this.blockedIps.add(blockedIpsItem);
    return this;
  }

  /**
   * Get blockedIps
   * @return blockedIps
   */
  @javax.annotation.Nullable
  public Set<String> getBlockedIps() {
    return blockedIps;
  }

  public void setBlockedIps(Set<String> blockedIps) {
    this.blockedIps = blockedIps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionPolicy sessionPolicy = (SessionPolicy) o;
    return Objects.equals(this.sessionHours, sessionPolicy.sessionHours) &&
        Objects.equals(this.singleSession, sessionPolicy.singleSession) &&
        Objects.equals(this.singleIpSession, sessionPolicy.singleIpSession) &&
        Objects.equals(this.maxLoginAttempts, sessionPolicy.maxLoginAttempts) &&
        Objects.equals(this.maxAttemptsTimeoutMinutes, sessionPolicy.maxAttemptsTimeoutMinutes) &&
        Objects.equals(this.allowedIps, sessionPolicy.allowedIps) &&
        Objects.equals(this.blockedIps, sessionPolicy.blockedIps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionHours, singleSession, singleIpSession, maxLoginAttempts, maxAttemptsTimeoutMinutes, allowedIps, blockedIps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionPolicy {\n");
    sb.append("    sessionHours: ").append(toIndentedString(sessionHours)).append("\n");
    sb.append("    singleSession: ").append(toIndentedString(singleSession)).append("\n");
    sb.append("    singleIpSession: ").append(toIndentedString(singleIpSession)).append("\n");
    sb.append("    maxLoginAttempts: ").append(toIndentedString(maxLoginAttempts)).append("\n");
    sb.append("    maxAttemptsTimeoutMinutes: ").append(toIndentedString(maxAttemptsTimeoutMinutes)).append("\n");
    sb.append("    allowedIps: ").append(toIndentedString(allowedIps)).append("\n");
    sb.append("    blockedIps: ").append(toIndentedString(blockedIps)).append("\n");
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
    openapiFields.add("sessionHours");
    openapiFields.add("singleSession");
    openapiFields.add("singleIpSession");
    openapiFields.add("maxLoginAttempts");
    openapiFields.add("maxAttemptsTimeoutMinutes");
    openapiFields.add("allowedIps");
    openapiFields.add("blockedIps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SessionPolicy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SessionPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SessionPolicy is not found in the empty JSON string", SessionPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SessionPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SessionPolicy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedIps") != null && !jsonObj.get("allowedIps").isJsonNull() && !jsonObj.get("allowedIps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedIps` to be an array in the JSON string but got `%s`", jsonObj.get("allowedIps").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("blockedIps") != null && !jsonObj.get("blockedIps").isJsonNull() && !jsonObj.get("blockedIps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `blockedIps` to be an array in the JSON string but got `%s`", jsonObj.get("blockedIps").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SessionPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SessionPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SessionPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SessionPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<SessionPolicy>() {
           @Override
           public void write(JsonWriter out, SessionPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SessionPolicy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SessionPolicy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SessionPolicy
   * @throws IOException if the JSON string is invalid with respect to SessionPolicy
   */
  public static SessionPolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SessionPolicy.class);
  }

  /**
   * Convert an instance of SessionPolicy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

