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
import java.util.Arrays;
import java.util.LinkedHashSet;
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
 * MailboxesSearchFilterDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T18:50:48.300154-07:00[America/Edmonton]", comments = "Generator version: 7.10.0")
public class MailboxesSearchFilterDTO {
  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  @javax.annotation.Nullable
  private String keyword;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  @javax.annotation.Nullable
  private Set<UUID> group = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_WITH_GROUPS = "withGroups";
  @SerializedName(SERIALIZED_NAME_WITH_GROUPS)
  @javax.annotation.Nullable
  private Boolean withGroups;

  public MailboxesSearchFilterDTO() {
  }

  public MailboxesSearchFilterDTO keyword(@javax.annotation.Nullable String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * Keyword to search by in: UUID, Name or Alias
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(@javax.annotation.Nullable String keyword) {
    this.keyword = keyword;
  }


  public MailboxesSearchFilterDTO group(@javax.annotation.Nullable Set<UUID> group) {
    this.group = group;
    return this;
  }

  public MailboxesSearchFilterDTO addGroupItem(UUID groupItem) {
    if (this.group == null) {
      this.group = new LinkedHashSet<>();
    }
    this.group.add(groupItem);
    return this;
  }

  /**
   * Filter by group
   * @return group
   */
  @javax.annotation.Nullable
  public Set<UUID> getGroup() {
    return group;
  }

  public void setGroup(@javax.annotation.Nullable Set<UUID> group) {
    this.group = group;
  }


  public MailboxesSearchFilterDTO withGroups(@javax.annotation.Nullable Boolean withGroups) {
    this.withGroups = withGroups;
    return this;
  }

  /**
   * Include groups info in result
   * @return withGroups
   */
  @javax.annotation.Nullable
  public Boolean getWithGroups() {
    return withGroups;
  }

  public void setWithGroups(@javax.annotation.Nullable Boolean withGroups) {
    this.withGroups = withGroups;
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
   * @return the MailboxesSearchFilterDTO instance itself
   */
  public MailboxesSearchFilterDTO putAdditionalProperty(String key, Object value) {
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
    MailboxesSearchFilterDTO mailboxesSearchFilterDTO = (MailboxesSearchFilterDTO) o;
    return Objects.equals(this.keyword, mailboxesSearchFilterDTO.keyword) &&
        Objects.equals(this.group, mailboxesSearchFilterDTO.group) &&
        Objects.equals(this.withGroups, mailboxesSearchFilterDTO.withGroups)&&
        Objects.equals(this.additionalProperties, mailboxesSearchFilterDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, group, withGroups, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailboxesSearchFilterDTO {\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    withGroups: ").append(toIndentedString(withGroups)).append("\n");
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
    openapiFields.add("keyword");
    openapiFields.add("group");
    openapiFields.add("withGroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MailboxesSearchFilterDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MailboxesSearchFilterDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MailboxesSearchFilterDTO is not found in the empty JSON string", MailboxesSearchFilterDTO.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("keyword") != null && !jsonObj.get("keyword").isJsonNull()) && !jsonObj.get("keyword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyword").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull() && !jsonObj.get("group").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be an array in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MailboxesSearchFilterDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MailboxesSearchFilterDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MailboxesSearchFilterDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MailboxesSearchFilterDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<MailboxesSearchFilterDTO>() {
           @Override
           public void write(JsonWriter out, MailboxesSearchFilterDTO value) throws IOException {
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
           public MailboxesSearchFilterDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MailboxesSearchFilterDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of MailboxesSearchFilterDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MailboxesSearchFilterDTO
   * @throws IOException if the JSON string is invalid with respect to MailboxesSearchFilterDTO
   */
  public static MailboxesSearchFilterDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MailboxesSearchFilterDTO.class);
  }

  /**
   * Convert an instance of MailboxesSearchFilterDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

