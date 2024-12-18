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
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * MailboxDelegationDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:58:44.034140700+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class MailboxDelegationDTO {
  public static final String SERIALIZED_NAME_AUTO_DELEGATION_ENABLED = "autoDelegationEnabled";
  @SerializedName(SERIALIZED_NAME_AUTO_DELEGATION_ENABLED)
  @javax.annotation.Nullable
  private Boolean autoDelegationEnabled;

  public static final String SERIALIZED_NAME_DELEGATE_TO = "delegateTo";
  @SerializedName(SERIALIZED_NAME_DELEGATE_TO)
  @javax.annotation.Nullable
  private UUID delegateTo;

  public static final String SERIALIZED_NAME_AUTO_DELEGATE_FROM = "autoDelegateFrom";
  @SerializedName(SERIALIZED_NAME_AUTO_DELEGATE_FROM)
  @javax.annotation.Nullable
  private String autoDelegateFrom;

  public static final String SERIALIZED_NAME_AUTO_DELEGATE_UNTIL = "autoDelegateUntil";
  @SerializedName(SERIALIZED_NAME_AUTO_DELEGATE_UNTIL)
  @javax.annotation.Nullable
  private String autoDelegateUntil;

  public MailboxDelegationDTO() {
  }

  public MailboxDelegationDTO autoDelegationEnabled(@javax.annotation.Nullable Boolean autoDelegationEnabled) {
    this.autoDelegationEnabled = autoDelegationEnabled;
    return this;
  }

  /**
   * Auto delegate is enabled
   * @return autoDelegationEnabled
   */
  @javax.annotation.Nullable
  public Boolean getAutoDelegationEnabled() {
    return autoDelegationEnabled;
  }

  public void setAutoDelegationEnabled(@javax.annotation.Nullable Boolean autoDelegationEnabled) {
    this.autoDelegationEnabled = autoDelegationEnabled;
  }


  public MailboxDelegationDTO delegateTo(@javax.annotation.Nullable UUID delegateTo) {
    this.delegateTo = delegateTo;
    return this;
  }

  /**
   * Auto delegate envelopes to mailbox
   * @return delegateTo
   */
  @javax.annotation.Nullable
  public UUID getDelegateTo() {
    return delegateTo;
  }

  public void setDelegateTo(@javax.annotation.Nullable UUID delegateTo) {
    this.delegateTo = delegateTo;
  }


  public MailboxDelegationDTO autoDelegateFrom(@javax.annotation.Nullable String autoDelegateFrom) {
    this.autoDelegateFrom = autoDelegateFrom;
    return this;
  }

  /**
   * Auto delegate from date in &#39;ISO-8601&#39; format
   * @return autoDelegateFrom
   */
  @javax.annotation.Nullable
  public String getAutoDelegateFrom() {
    return autoDelegateFrom;
  }

  public void setAutoDelegateFrom(@javax.annotation.Nullable String autoDelegateFrom) {
    this.autoDelegateFrom = autoDelegateFrom;
  }


  public MailboxDelegationDTO autoDelegateUntil(@javax.annotation.Nullable String autoDelegateUntil) {
    this.autoDelegateUntil = autoDelegateUntil;
    return this;
  }

  /**
   * Auto delegate until date in &#39;ISO-8601&#39; format
   * @return autoDelegateUntil
   */
  @javax.annotation.Nullable
  public String getAutoDelegateUntil() {
    return autoDelegateUntil;
  }

  public void setAutoDelegateUntil(@javax.annotation.Nullable String autoDelegateUntil) {
    this.autoDelegateUntil = autoDelegateUntil;
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
   * @return the MailboxDelegationDTO instance itself
   */
  public MailboxDelegationDTO putAdditionalProperty(String key, Object value) {
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
    MailboxDelegationDTO mailboxDelegationDTO = (MailboxDelegationDTO) o;
    return Objects.equals(this.autoDelegationEnabled, mailboxDelegationDTO.autoDelegationEnabled) &&
        Objects.equals(this.delegateTo, mailboxDelegationDTO.delegateTo) &&
        Objects.equals(this.autoDelegateFrom, mailboxDelegationDTO.autoDelegateFrom) &&
        Objects.equals(this.autoDelegateUntil, mailboxDelegationDTO.autoDelegateUntil)&&
        Objects.equals(this.additionalProperties, mailboxDelegationDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoDelegationEnabled, delegateTo, autoDelegateFrom, autoDelegateUntil, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailboxDelegationDTO {\n");
    sb.append("    autoDelegationEnabled: ").append(toIndentedString(autoDelegationEnabled)).append("\n");
    sb.append("    delegateTo: ").append(toIndentedString(delegateTo)).append("\n");
    sb.append("    autoDelegateFrom: ").append(toIndentedString(autoDelegateFrom)).append("\n");
    sb.append("    autoDelegateUntil: ").append(toIndentedString(autoDelegateUntil)).append("\n");
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
    openapiFields.add("autoDelegationEnabled");
    openapiFields.add("delegateTo");
    openapiFields.add("autoDelegateFrom");
    openapiFields.add("autoDelegateUntil");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MailboxDelegationDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MailboxDelegationDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MailboxDelegationDTO is not found in the empty JSON string", MailboxDelegationDTO.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("delegateTo") != null && !jsonObj.get("delegateTo").isJsonNull()) && !jsonObj.get("delegateTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delegateTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delegateTo").toString()));
      }
      if ((jsonObj.get("autoDelegateFrom") != null && !jsonObj.get("autoDelegateFrom").isJsonNull()) && !jsonObj.get("autoDelegateFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoDelegateFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("autoDelegateFrom").toString()));
      }
      if ((jsonObj.get("autoDelegateUntil") != null && !jsonObj.get("autoDelegateUntil").isJsonNull()) && !jsonObj.get("autoDelegateUntil").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoDelegateUntil` to be a primitive type in the JSON string but got `%s`", jsonObj.get("autoDelegateUntil").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MailboxDelegationDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MailboxDelegationDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MailboxDelegationDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MailboxDelegationDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<MailboxDelegationDTO>() {
           @Override
           public void write(JsonWriter out, MailboxDelegationDTO value) throws IOException {
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
           public MailboxDelegationDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MailboxDelegationDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of MailboxDelegationDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MailboxDelegationDTO
   * @throws IOException if the JSON string is invalid with respect to MailboxDelegationDTO
   */
  public static MailboxDelegationDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MailboxDelegationDTO.class);
  }

  /**
   * Convert an instance of MailboxDelegationDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

