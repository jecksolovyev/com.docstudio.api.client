/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R120.9
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
import java.time.OffsetDateTime;
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
 * Data records
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T18:50:48.300154-07:00[America/Edmonton]", comments = "Generator version: 7.10.0")
public class SearchTemplateDTO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nonnull
  private UUID uuid;

  public static final String SERIALIZED_NAME_MAILBOX_UUID = "mailboxUuid";
  @SerializedName(SERIALIZED_NAME_MAILBOX_UUID)
  @javax.annotation.Nonnull
  private UUID mailboxUuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

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
  @javax.annotation.Nullable
  private AccessEnum access;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  @javax.annotation.Nullable
  private List<UUID> categories = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHARED_CATEGORIES = "sharedCategories";
  @SerializedName(SERIALIZED_NAME_SHARED_CATEGORIES)
  @javax.annotation.Nullable
  private List<UUID> sharedCategories = new ArrayList<>();

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

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public SearchTemplateDTO() {
  }

  public SearchTemplateDTO uuid(@javax.annotation.Nonnull UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Template UUID
   * @return uuid
   */
  @javax.annotation.Nonnull
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nonnull UUID uuid) {
    this.uuid = uuid;
  }


  public SearchTemplateDTO mailboxUuid(@javax.annotation.Nonnull UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

  /**
   * Template owner mailbox UUID
   * @return mailboxUuid
   */
  @javax.annotation.Nonnull
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(@javax.annotation.Nonnull UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }


  public SearchTemplateDTO name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Template name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public SearchTemplateDTO description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Template description
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public SearchTemplateDTO access(@javax.annotation.Nullable AccessEnum access) {
    this.access = access;
    return this;
  }

  /**
   * Template access level
   * @return access
   */
  @javax.annotation.Nullable
  public AccessEnum getAccess() {
    return access;
  }

  public void setAccess(@javax.annotation.Nullable AccessEnum access) {
    this.access = access;
  }


  public SearchTemplateDTO categories(@javax.annotation.Nullable List<UUID> categories) {
    this.categories = categories;
    return this;
  }

  public SearchTemplateDTO addCategoriesItem(UUID categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Template categories
   * @return categories
   */
  @javax.annotation.Nullable
  public List<UUID> getCategories() {
    return categories;
  }

  public void setCategories(@javax.annotation.Nullable List<UUID> categories) {
    this.categories = categories;
  }


  public SearchTemplateDTO sharedCategories(@javax.annotation.Nullable List<UUID> sharedCategories) {
    this.sharedCategories = sharedCategories;
    return this;
  }

  public SearchTemplateDTO addSharedCategoriesItem(UUID sharedCategoriesItem) {
    if (this.sharedCategories == null) {
      this.sharedCategories = new ArrayList<>();
    }
    this.sharedCategories.add(sharedCategoriesItem);
    return this;
  }

  /**
   * Template shared categories
   * @return sharedCategories
   */
  @javax.annotation.Nullable
  public List<UUID> getSharedCategories() {
    return sharedCategories;
  }

  public void setSharedCategories(@javax.annotation.Nullable List<UUID> sharedCategories) {
    this.sharedCategories = sharedCategories;
  }


  public SearchTemplateDTO sharedTo(@javax.annotation.Nullable Set<UUID> sharedTo) {
    this.sharedTo = sharedTo;
    return this;
  }

  public SearchTemplateDTO addSharedToItem(UUID sharedToItem) {
    if (this.sharedTo == null) {
      this.sharedTo = new LinkedHashSet<>();
    }
    this.sharedTo.add(sharedToItem);
    return this;
  }

  /**
   * Mailboxes to which template is shared to
   * @return sharedTo
   */
  @javax.annotation.Nullable
  public Set<UUID> getSharedTo() {
    return sharedTo;
  }

  public void setSharedTo(@javax.annotation.Nullable Set<UUID> sharedTo) {
    this.sharedTo = sharedTo;
  }


  public SearchTemplateDTO sharedToMailboxGroups(@javax.annotation.Nullable Set<UUID> sharedToMailboxGroups) {
    this.sharedToMailboxGroups = sharedToMailboxGroups;
    return this;
  }

  public SearchTemplateDTO addSharedToMailboxGroupsItem(UUID sharedToMailboxGroupsItem) {
    if (this.sharedToMailboxGroups == null) {
      this.sharedToMailboxGroups = new LinkedHashSet<>();
    }
    this.sharedToMailboxGroups.add(sharedToMailboxGroupsItem);
    return this;
  }

  /**
   * Mailbox groups to which template is shared to
   * @return sharedToMailboxGroups
   */
  @javax.annotation.Nullable
  public Set<UUID> getSharedToMailboxGroups() {
    return sharedToMailboxGroups;
  }

  public void setSharedToMailboxGroups(@javax.annotation.Nullable Set<UUID> sharedToMailboxGroups) {
    this.sharedToMailboxGroups = sharedToMailboxGroups;
  }


  public SearchTemplateDTO logoImageUuid(@javax.annotation.Nullable UUID logoImageUuid) {
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


  public SearchTemplateDTO createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date of Template creation
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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
   * @return the SearchTemplateDTO instance itself
   */
  public SearchTemplateDTO putAdditionalProperty(String key, Object value) {
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
    SearchTemplateDTO searchTemplateDTO = (SearchTemplateDTO) o;
    return Objects.equals(this.uuid, searchTemplateDTO.uuid) &&
        Objects.equals(this.mailboxUuid, searchTemplateDTO.mailboxUuid) &&
        Objects.equals(this.name, searchTemplateDTO.name) &&
        Objects.equals(this.description, searchTemplateDTO.description) &&
        Objects.equals(this.access, searchTemplateDTO.access) &&
        Objects.equals(this.categories, searchTemplateDTO.categories) &&
        Objects.equals(this.sharedCategories, searchTemplateDTO.sharedCategories) &&
        Objects.equals(this.sharedTo, searchTemplateDTO.sharedTo) &&
        Objects.equals(this.sharedToMailboxGroups, searchTemplateDTO.sharedToMailboxGroups) &&
        Objects.equals(this.logoImageUuid, searchTemplateDTO.logoImageUuid) &&
        Objects.equals(this.createdAt, searchTemplateDTO.createdAt)&&
        Objects.equals(this.additionalProperties, searchTemplateDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, mailboxUuid, name, description, access, categories, sharedCategories, sharedTo, sharedToMailboxGroups, logoImageUuid, createdAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTemplateDTO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    sharedCategories: ").append(toIndentedString(sharedCategories)).append("\n");
    sb.append("    sharedTo: ").append(toIndentedString(sharedTo)).append("\n");
    sb.append("    sharedToMailboxGroups: ").append(toIndentedString(sharedToMailboxGroups)).append("\n");
    sb.append("    logoImageUuid: ").append(toIndentedString(logoImageUuid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("mailboxUuid");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("access");
    openapiFields.add("categories");
    openapiFields.add("sharedCategories");
    openapiFields.add("sharedTo");
    openapiFields.add("sharedToMailboxGroups");
    openapiFields.add("logoImageUuid");
    openapiFields.add("createdAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("mailboxUuid");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchTemplateDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchTemplateDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchTemplateDTO is not found in the empty JSON string", SearchTemplateDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchTemplateDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (!jsonObj.get("mailboxUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxUuid").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("access") != null && !jsonObj.get("access").isJsonNull()) && !jsonObj.get("access").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access").toString()));
      }
      // validate the optional field `access`
      if (jsonObj.get("access") != null && !jsonObj.get("access").isJsonNull()) {
        AccessEnum.validateJsonElement(jsonObj.get("access"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonNull() && !jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sharedCategories") != null && !jsonObj.get("sharedCategories").isJsonNull() && !jsonObj.get("sharedCategories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedCategories` to be an array in the JSON string but got `%s`", jsonObj.get("sharedCategories").toString()));
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
       if (!SearchTemplateDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchTemplateDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchTemplateDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchTemplateDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchTemplateDTO>() {
           @Override
           public void write(JsonWriter out, SearchTemplateDTO value) throws IOException {
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
           public SearchTemplateDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SearchTemplateDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of SearchTemplateDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchTemplateDTO
   * @throws IOException if the JSON string is invalid with respect to SearchTemplateDTO
   */
  public static SearchTemplateDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchTemplateDTO.class);
  }

  /**
   * Convert an instance of SearchTemplateDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

