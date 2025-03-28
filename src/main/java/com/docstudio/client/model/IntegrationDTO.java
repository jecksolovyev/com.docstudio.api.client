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
import com.docstudio.client.model.IntegrationDefaultRuleDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
 * Integration info
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-28T13:30:43.659068-06:00[America/Edmonton]", comments = "Generator version: 7.12.0")
public class IntegrationDTO {
  public static final String SERIALIZED_NAME_MAILBOX_UUID = "mailboxUuid";
  @SerializedName(SERIALIZED_NAME_MAILBOX_UUID)
  @javax.annotation.Nonnull
  private UUID mailboxUuid;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  @javax.annotation.Nonnull
  private Boolean active;

  /**
   * Integration protocol
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    SOAP("soap"),
    
    AS2("as2"),
    
    SFTP("sftp"),
    
    AS4_DBNA("as4_dbna");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtocolEnum fromValue(String value) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProtocolEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ProtocolEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  @javax.annotation.Nonnull
  private ProtocolEnum protocol;

  public static final String SERIALIZED_NAME_PROTOCOL_SETTINGS = "protocolSettings";
  @SerializedName(SERIALIZED_NAME_PROTOCOL_SETTINGS)
  @javax.annotation.Nonnull
  private Map<String, String> protocolSettings = new HashMap<>();

  public static final String SERIALIZED_NAME_DEFAULT_RULE = "defaultRule";
  @SerializedName(SERIALIZED_NAME_DEFAULT_RULE)
  @javax.annotation.Nonnull
  private IntegrationDefaultRuleDTO defaultRule;

  public IntegrationDTO() {
  }

  public IntegrationDTO mailboxUuid(@javax.annotation.Nonnull UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

  /**
   * Mailbox uuid
   * @return mailboxUuid
   */
  @javax.annotation.Nonnull
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(@javax.annotation.Nonnull UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }


  public IntegrationDTO active(@javax.annotation.Nonnull Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Integration status
   * @return active
   */
  @javax.annotation.Nonnull
  public Boolean getActive() {
    return active;
  }

  public void setActive(@javax.annotation.Nonnull Boolean active) {
    this.active = active;
  }


  public IntegrationDTO protocol(@javax.annotation.Nonnull ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Integration protocol
   * @return protocol
   */
  @javax.annotation.Nonnull
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(@javax.annotation.Nonnull ProtocolEnum protocol) {
    this.protocol = protocol;
  }


  public IntegrationDTO protocolSettings(@javax.annotation.Nonnull Map<String, String> protocolSettings) {
    this.protocolSettings = protocolSettings;
    return this;
  }

  public IntegrationDTO putProtocolSettingsItem(String key, String protocolSettingsItem) {
    if (this.protocolSettings == null) {
      this.protocolSettings = new HashMap<>();
    }
    this.protocolSettings.put(key, protocolSettingsItem);
    return this;
  }

  /**
   * Integration protocol settings
   * @return protocolSettings
   */
  @javax.annotation.Nonnull
  public Map<String, String> getProtocolSettings() {
    return protocolSettings;
  }

  public void setProtocolSettings(@javax.annotation.Nonnull Map<String, String> protocolSettings) {
    this.protocolSettings = protocolSettings;
  }


  public IntegrationDTO defaultRule(@javax.annotation.Nonnull IntegrationDefaultRuleDTO defaultRule) {
    this.defaultRule = defaultRule;
    return this;
  }

  /**
   * Get defaultRule
   * @return defaultRule
   */
  @javax.annotation.Nonnull
  public IntegrationDefaultRuleDTO getDefaultRule() {
    return defaultRule;
  }

  public void setDefaultRule(@javax.annotation.Nonnull IntegrationDefaultRuleDTO defaultRule) {
    this.defaultRule = defaultRule;
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
   * @return the IntegrationDTO instance itself
   */
  public IntegrationDTO putAdditionalProperty(String key, Object value) {
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
    IntegrationDTO integrationDTO = (IntegrationDTO) o;
    return Objects.equals(this.mailboxUuid, integrationDTO.mailboxUuid) &&
        Objects.equals(this.active, integrationDTO.active) &&
        Objects.equals(this.protocol, integrationDTO.protocol) &&
        Objects.equals(this.protocolSettings, integrationDTO.protocolSettings) &&
        Objects.equals(this.defaultRule, integrationDTO.defaultRule)&&
        Objects.equals(this.additionalProperties, integrationDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailboxUuid, active, protocol, protocolSettings, defaultRule, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationDTO {\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    protocolSettings: ").append(toIndentedString(protocolSettings)).append("\n");
    sb.append("    defaultRule: ").append(toIndentedString(defaultRule)).append("\n");
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
    openapiFields.add("mailboxUuid");
    openapiFields.add("active");
    openapiFields.add("protocol");
    openapiFields.add("protocolSettings");
    openapiFields.add("defaultRule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("mailboxUuid");
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("protocol");
    openapiRequiredFields.add("protocolSettings");
    openapiRequiredFields.add("defaultRule");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IntegrationDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntegrationDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntegrationDTO is not found in the empty JSON string", IntegrationDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IntegrationDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("mailboxUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxUuid").toString()));
      }
      if (!jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
      // validate the required field `protocol`
      ProtocolEnum.validateJsonElement(jsonObj.get("protocol"));
      // validate the required field `defaultRule`
      IntegrationDefaultRuleDTO.validateJsonElement(jsonObj.get("defaultRule"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntegrationDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntegrationDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntegrationDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntegrationDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<IntegrationDTO>() {
           @Override
           public void write(JsonWriter out, IntegrationDTO value) throws IOException {
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
           public IntegrationDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             IntegrationDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of IntegrationDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IntegrationDTO
   * @throws IOException if the JSON string is invalid with respect to IntegrationDTO
   */
  public static IntegrationDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntegrationDTO.class);
  }

  /**
   * Convert an instance of IntegrationDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

