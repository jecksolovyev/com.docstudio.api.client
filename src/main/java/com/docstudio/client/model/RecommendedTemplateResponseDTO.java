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
 * RecommendedTemplateResponseDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-28T13:30:43.659068-06:00[America/Edmonton]", comments = "Generator version: 7.12.0")
public class RecommendedTemplateResponseDTO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_LOGO_IMAGE_UUID = "logoImageUuid";
  @SerializedName(SERIALIZED_NAME_LOGO_IMAGE_UUID)
  @javax.annotation.Nullable
  private UUID logoImageUuid;

  public static final String SERIALIZED_NAME_MAILBOX_UUID = "mailboxUuid";
  @SerializedName(SERIALIZED_NAME_MAILBOX_UUID)
  @javax.annotation.Nullable
  private UUID mailboxUuid;

  public static final String SERIALIZED_NAME_SHARED_TO = "sharedTo";
  @SerializedName(SERIALIZED_NAME_SHARED_TO)
  @javax.annotation.Nullable
  private List<UUID> sharedTo = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHARED_TO_MAILBOX_GROUPS = "sharedToMailboxGroups";
  @SerializedName(SERIALIZED_NAME_SHARED_TO_MAILBOX_GROUPS)
  @javax.annotation.Nullable
  private List<UUID> sharedToMailboxGroups = new ArrayList<>();

  public RecommendedTemplateResponseDTO() {
  }

  public RecommendedTemplateResponseDTO uuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Template UUID
   * @return uuid
   */
  @javax.annotation.Nullable
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
  }


  public RecommendedTemplateResponseDTO name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Template name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public RecommendedTemplateResponseDTO description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Template description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public RecommendedTemplateResponseDTO logoImageUuid(@javax.annotation.Nullable UUID logoImageUuid) {
    this.logoImageUuid = logoImageUuid;
    return this;
  }

  /**
   * UUID of the template logo image
   * @return logoImageUuid
   */
  @javax.annotation.Nullable
  public UUID getLogoImageUuid() {
    return logoImageUuid;
  }

  public void setLogoImageUuid(@javax.annotation.Nullable UUID logoImageUuid) {
    this.logoImageUuid = logoImageUuid;
  }


  public RecommendedTemplateResponseDTO mailboxUuid(@javax.annotation.Nullable UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

  /**
   * Get mailboxUuid
   * @return mailboxUuid
   */
  @javax.annotation.Nullable
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(@javax.annotation.Nullable UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }


  public RecommendedTemplateResponseDTO sharedTo(@javax.annotation.Nullable List<UUID> sharedTo) {
    this.sharedTo = sharedTo;
    return this;
  }

  public RecommendedTemplateResponseDTO addSharedToItem(UUID sharedToItem) {
    if (this.sharedTo == null) {
      this.sharedTo = new ArrayList<>();
    }
    this.sharedTo.add(sharedToItem);
    return this;
  }

  /**
   * Get sharedTo
   * @return sharedTo
   */
  @javax.annotation.Nullable
  public List<UUID> getSharedTo() {
    return sharedTo;
  }

  public void setSharedTo(@javax.annotation.Nullable List<UUID> sharedTo) {
    this.sharedTo = sharedTo;
  }


  public RecommendedTemplateResponseDTO sharedToMailboxGroups(@javax.annotation.Nullable List<UUID> sharedToMailboxGroups) {
    this.sharedToMailboxGroups = sharedToMailboxGroups;
    return this;
  }

  public RecommendedTemplateResponseDTO addSharedToMailboxGroupsItem(UUID sharedToMailboxGroupsItem) {
    if (this.sharedToMailboxGroups == null) {
      this.sharedToMailboxGroups = new ArrayList<>();
    }
    this.sharedToMailboxGroups.add(sharedToMailboxGroupsItem);
    return this;
  }

  /**
   * Get sharedToMailboxGroups
   * @return sharedToMailboxGroups
   */
  @javax.annotation.Nullable
  public List<UUID> getSharedToMailboxGroups() {
    return sharedToMailboxGroups;
  }

  public void setSharedToMailboxGroups(@javax.annotation.Nullable List<UUID> sharedToMailboxGroups) {
    this.sharedToMailboxGroups = sharedToMailboxGroups;
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
   * @return the RecommendedTemplateResponseDTO instance itself
   */
  public RecommendedTemplateResponseDTO putAdditionalProperty(String key, Object value) {
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
    RecommendedTemplateResponseDTO recommendedTemplateResponseDTO = (RecommendedTemplateResponseDTO) o;
    return Objects.equals(this.uuid, recommendedTemplateResponseDTO.uuid) &&
        Objects.equals(this.name, recommendedTemplateResponseDTO.name) &&
        Objects.equals(this.description, recommendedTemplateResponseDTO.description) &&
        Objects.equals(this.logoImageUuid, recommendedTemplateResponseDTO.logoImageUuid) &&
        Objects.equals(this.mailboxUuid, recommendedTemplateResponseDTO.mailboxUuid) &&
        Objects.equals(this.sharedTo, recommendedTemplateResponseDTO.sharedTo) &&
        Objects.equals(this.sharedToMailboxGroups, recommendedTemplateResponseDTO.sharedToMailboxGroups)&&
        Objects.equals(this.additionalProperties, recommendedTemplateResponseDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, description, logoImageUuid, mailboxUuid, sharedTo, sharedToMailboxGroups, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendedTemplateResponseDTO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logoImageUuid: ").append(toIndentedString(logoImageUuid)).append("\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    sharedTo: ").append(toIndentedString(sharedTo)).append("\n");
    sb.append("    sharedToMailboxGroups: ").append(toIndentedString(sharedToMailboxGroups)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("logoImageUuid");
    openapiFields.add("mailboxUuid");
    openapiFields.add("sharedTo");
    openapiFields.add("sharedToMailboxGroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecommendedTemplateResponseDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecommendedTemplateResponseDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecommendedTemplateResponseDTO is not found in the empty JSON string", RecommendedTemplateResponseDTO.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("logoImageUuid") != null && !jsonObj.get("logoImageUuid").isJsonNull()) && !jsonObj.get("logoImageUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoImageUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoImageUuid").toString()));
      }
      if ((jsonObj.get("mailboxUuid") != null && !jsonObj.get("mailboxUuid").isJsonNull()) && !jsonObj.get("mailboxUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxUuid").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sharedTo") != null && !jsonObj.get("sharedTo").isJsonNull() && !jsonObj.get("sharedTo").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedTo` to be an array in the JSON string but got `%s`", jsonObj.get("sharedTo").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sharedToMailboxGroups") != null && !jsonObj.get("sharedToMailboxGroups").isJsonNull() && !jsonObj.get("sharedToMailboxGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedToMailboxGroups` to be an array in the JSON string but got `%s`", jsonObj.get("sharedToMailboxGroups").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecommendedTemplateResponseDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecommendedTemplateResponseDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecommendedTemplateResponseDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecommendedTemplateResponseDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<RecommendedTemplateResponseDTO>() {
           @Override
           public void write(JsonWriter out, RecommendedTemplateResponseDTO value) throws IOException {
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
           public RecommendedTemplateResponseDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RecommendedTemplateResponseDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of RecommendedTemplateResponseDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecommendedTemplateResponseDTO
   * @throws IOException if the JSON string is invalid with respect to RecommendedTemplateResponseDTO
   */
  public static RecommendedTemplateResponseDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecommendedTemplateResponseDTO.class);
  }

  /**
   * Convert an instance of RecommendedTemplateResponseDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

