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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
 * TemplateCreateDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T22:10:42.565042-07:00[America/Edmonton]", comments = "Generator version: 7.11.0")
public class TemplateCreateDTO {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nonnull
  private String data;

  /**
   * Template access level
   */
  @JsonAdapter(AccessEnum.Adapter.class)
  public enum AccessEnum {
    MAILBOX("mailbox"),
    
    ACCOUNT("account"),
    
    PUB("pub"),
    
    OFFICIAL("official"),
    
    SHARED("shared");

    private String value;

    AccessEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessEnum fromValue(String value) {
      for (AccessEnum b : AccessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccessEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccessEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AccessEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ACCESS = "access";
  @SerializedName(SERIALIZED_NAME_ACCESS)
  @javax.annotation.Nonnull
  private AccessEnum access;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  @javax.annotation.Nullable
  private List<UUID> categories = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHARED_TO = "sharedTo";
  @SerializedName(SERIALIZED_NAME_SHARED_TO)
  @javax.annotation.Nullable
  private Set<UUID> sharedTo = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_SHARED_TO_MAILBOX_GROUPS = "sharedToMailboxGroups";
  @SerializedName(SERIALIZED_NAME_SHARED_TO_MAILBOX_GROUPS)
  @javax.annotation.Nullable
  private Set<UUID> sharedToMailboxGroups = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_LOGO_IMAGE_UUID = "logoImageUuid";
  @SerializedName(SERIALIZED_NAME_LOGO_IMAGE_UUID)
  @javax.annotation.Nullable
  private UUID logoImageUuid;

  public TemplateCreateDTO() {
  }

  public TemplateCreateDTO data(@javax.annotation.Nonnull String data) {
    this.data = data;
    return this;
  }

  /**
   * Template data
   * @return data
   */
  @javax.annotation.Nonnull
  public String getData() {
    return data;
  }

  public void setData(@javax.annotation.Nonnull String data) {
    this.data = data;
  }


  public TemplateCreateDTO access(@javax.annotation.Nonnull AccessEnum access) {
    this.access = access;
    return this;
  }

  /**
   * Template access level
   * @return access
   */
  @javax.annotation.Nonnull
  public AccessEnum getAccess() {
    return access;
  }

  public void setAccess(@javax.annotation.Nonnull AccessEnum access) {
    this.access = access;
  }


  public TemplateCreateDTO categories(@javax.annotation.Nullable List<UUID> categories) {
    this.categories = categories;
    return this;
  }

  public TemplateCreateDTO addCategoriesItem(UUID categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Template categories ids and their accessLevels. Null or empty array if not within any category.
   * @return categories
   */
  @javax.annotation.Nullable
  public List<UUID> getCategories() {
    return categories;
  }

  public void setCategories(@javax.annotation.Nullable List<UUID> categories) {
    this.categories = categories;
  }


  public TemplateCreateDTO sharedTo(@javax.annotation.Nullable Set<UUID> sharedTo) {
    this.sharedTo = sharedTo;
    return this;
  }

  public TemplateCreateDTO addSharedToItem(UUID sharedToItem) {
    if (this.sharedTo == null) {
      this.sharedTo = new LinkedHashSet<>();
    }
    this.sharedTo.add(sharedToItem);
    return this;
  }

  /**
   * Mailboxes list, which have access to template
   * @return sharedTo
   */
  @javax.annotation.Nullable
  public Set<UUID> getSharedTo() {
    return sharedTo;
  }

  public void setSharedTo(@javax.annotation.Nullable Set<UUID> sharedTo) {
    this.sharedTo = sharedTo;
  }


  public TemplateCreateDTO sharedToMailboxGroups(@javax.annotation.Nullable Set<UUID> sharedToMailboxGroups) {
    this.sharedToMailboxGroups = sharedToMailboxGroups;
    return this;
  }

  public TemplateCreateDTO addSharedToMailboxGroupsItem(UUID sharedToMailboxGroupsItem) {
    if (this.sharedToMailboxGroups == null) {
      this.sharedToMailboxGroups = new LinkedHashSet<>();
    }
    this.sharedToMailboxGroups.add(sharedToMailboxGroupsItem);
    return this;
  }

  /**
   * Mailbox groups, which have access to template
   * @return sharedToMailboxGroups
   */
  @javax.annotation.Nullable
  public Set<UUID> getSharedToMailboxGroups() {
    return sharedToMailboxGroups;
  }

  public void setSharedToMailboxGroups(@javax.annotation.Nullable Set<UUID> sharedToMailboxGroups) {
    this.sharedToMailboxGroups = sharedToMailboxGroups;
  }


  public TemplateCreateDTO logoImageUuid(@javax.annotation.Nullable UUID logoImageUuid) {
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
   * @return the TemplateCreateDTO instance itself
   */
  public TemplateCreateDTO putAdditionalProperty(String key, Object value) {
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
    TemplateCreateDTO templateCreateDTO = (TemplateCreateDTO) o;
    return Objects.equals(this.data, templateCreateDTO.data) &&
        Objects.equals(this.access, templateCreateDTO.access) &&
        Objects.equals(this.categories, templateCreateDTO.categories) &&
        Objects.equals(this.sharedTo, templateCreateDTO.sharedTo) &&
        Objects.equals(this.sharedToMailboxGroups, templateCreateDTO.sharedToMailboxGroups) &&
        Objects.equals(this.logoImageUuid, templateCreateDTO.logoImageUuid)&&
        Objects.equals(this.additionalProperties, templateCreateDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, access, categories, sharedTo, sharedToMailboxGroups, logoImageUuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateCreateDTO {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    sharedTo: ").append(toIndentedString(sharedTo)).append("\n");
    sb.append("    sharedToMailboxGroups: ").append(toIndentedString(sharedToMailboxGroups)).append("\n");
    sb.append("    logoImageUuid: ").append(toIndentedString(logoImageUuid)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("access");
    openapiFields.add("categories");
    openapiFields.add("sharedTo");
    openapiFields.add("sharedToMailboxGroups");
    openapiFields.add("logoImageUuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("access");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TemplateCreateDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TemplateCreateDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateCreateDTO is not found in the empty JSON string", TemplateCreateDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TemplateCreateDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if (!jsonObj.get("access").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access").toString()));
      }
      // validate the required field `access`
      AccessEnum.validateJsonElement(jsonObj.get("access"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonNull() && !jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sharedTo") != null && !jsonObj.get("sharedTo").isJsonNull() && !jsonObj.get("sharedTo").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedTo` to be an array in the JSON string but got `%s`", jsonObj.get("sharedTo").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sharedToMailboxGroups") != null && !jsonObj.get("sharedToMailboxGroups").isJsonNull() && !jsonObj.get("sharedToMailboxGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedToMailboxGroups` to be an array in the JSON string but got `%s`", jsonObj.get("sharedToMailboxGroups").toString()));
      }
      if ((jsonObj.get("logoImageUuid") != null && !jsonObj.get("logoImageUuid").isJsonNull()) && !jsonObj.get("logoImageUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoImageUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoImageUuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateCreateDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateCreateDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateCreateDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateCreateDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateCreateDTO>() {
           @Override
           public void write(JsonWriter out, TemplateCreateDTO value) throws IOException {
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
           public TemplateCreateDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TemplateCreateDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of TemplateCreateDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TemplateCreateDTO
   * @throws IOException if the JSON string is invalid with respect to TemplateCreateDTO
   */
  public static TemplateCreateDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateCreateDTO.class);
  }

  /**
   * Convert an instance of TemplateCreateDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

