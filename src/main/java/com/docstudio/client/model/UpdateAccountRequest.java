/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R127.4
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
 * UpdateAccountRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-28T13:30:43.659068-06:00[America/Edmonton]", comments = "Generator version: 7.12.0")
public class UpdateAccountRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_INN = "inn";
  @SerializedName(SERIALIZED_NAME_INN)
  @javax.annotation.Nullable
  private String inn;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  @javax.annotation.Nullable
  private String logo;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  @javax.annotation.Nullable
  private String brand;

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

  public UpdateAccountRequest() {
  }

  public UpdateAccountRequest name(@javax.annotation.Nonnull String name) {
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


  public UpdateAccountRequest inn(@javax.annotation.Nullable String inn) {
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


  public UpdateAccountRequest logo(@javax.annotation.Nullable String logo) {
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


  public UpdateAccountRequest brand(@javax.annotation.Nullable String brand) {
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


  public UpdateAccountRequest timezone(@javax.annotation.Nullable String timezone) {
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


  public UpdateAccountRequest allowCreatePersonalMailboxWithRole(@javax.annotation.Nullable UUID allowCreatePersonalMailboxWithRole) {
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


  public UpdateAccountRequest allowMicrosoftOfficeViewer(@javax.annotation.Nullable Boolean allowMicrosoftOfficeViewer) {
    this.allowMicrosoftOfficeViewer = allowMicrosoftOfficeViewer;
    return this;
  }

  /**
   * Allow envelope attachments public access for MS Office Viewer. Skip property for non-owner users.
   * @return allowMicrosoftOfficeViewer
   */
  @javax.annotation.Nullable
  public Boolean getAllowMicrosoftOfficeViewer() {
    return allowMicrosoftOfficeViewer;
  }

  public void setAllowMicrosoftOfficeViewer(@javax.annotation.Nullable Boolean allowMicrosoftOfficeViewer) {
    this.allowMicrosoftOfficeViewer = allowMicrosoftOfficeViewer;
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
   * @return the UpdateAccountRequest instance itself
   */
  public UpdateAccountRequest putAdditionalProperty(String key, Object value) {
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
    UpdateAccountRequest updateAccountRequest = (UpdateAccountRequest) o;
    return Objects.equals(this.name, updateAccountRequest.name) &&
        Objects.equals(this.inn, updateAccountRequest.inn) &&
        Objects.equals(this.logo, updateAccountRequest.logo) &&
        Objects.equals(this.brand, updateAccountRequest.brand) &&
        Objects.equals(this.timezone, updateAccountRequest.timezone) &&
        Objects.equals(this.allowCreatePersonalMailboxWithRole, updateAccountRequest.allowCreatePersonalMailboxWithRole) &&
        Objects.equals(this.allowMicrosoftOfficeViewer, updateAccountRequest.allowMicrosoftOfficeViewer)&&
        Objects.equals(this.additionalProperties, updateAccountRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, inn, logo, brand, timezone, allowCreatePersonalMailboxWithRole, allowMicrosoftOfficeViewer, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAccountRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    allowCreatePersonalMailboxWithRole: ").append(toIndentedString(allowCreatePersonalMailboxWithRole)).append("\n");
    sb.append("    allowMicrosoftOfficeViewer: ").append(toIndentedString(allowMicrosoftOfficeViewer)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("inn");
    openapiFields.add("logo");
    openapiFields.add("brand");
    openapiFields.add("timezone");
    openapiFields.add("allowCreatePersonalMailboxWithRole");
    openapiFields.add("allowMicrosoftOfficeViewer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateAccountRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateAccountRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAccountRequest is not found in the empty JSON string", UpdateAccountRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateAccountRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("inn") != null && !jsonObj.get("inn").isJsonNull()) && !jsonObj.get("inn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inn").toString()));
      }
      if ((jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if ((jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()) && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
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
       if (!UpdateAccountRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAccountRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAccountRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAccountRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAccountRequest>() {
           @Override
           public void write(JsonWriter out, UpdateAccountRequest value) throws IOException {
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
           public UpdateAccountRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UpdateAccountRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of UpdateAccountRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateAccountRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateAccountRequest
   */
  public static UpdateAccountRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAccountRequest.class);
  }

  /**
   * Convert an instance of UpdateAccountRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

