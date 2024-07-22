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
import java.time.OffsetDateTime;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.docstudio.client.JSON;

/**
 * UsersSearchFilterDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class UsersSearchFilterDTO {
  public static final String SERIALIZED_NAME_MAILBOX = "mailbox";
  @SerializedName(SERIALIZED_NAME_MAILBOX)
  private String mailbox;

  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public static final String SERIALIZED_NAME_DOMAINS = "domains";
  @SerializedName(SERIALIZED_NAME_DOMAINS)
  private List<String> domains = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROLE_UUIDS = "roleUuids";
  @SerializedName(SERIALIZED_NAME_ROLE_UUIDS)
  private List<UUID> roleUuids = new ArrayList<>();

  /**
   * User status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING_INVITE("PENDING_INVITE"),
    
    ACTIVE("ACTIVE"),
    
    BLOCKED("BLOCKED"),
    
    PENDING_PASSWORD("PENDING_PASSWORD"),
    
    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CREATED_FROM = "createdFrom";
  @SerializedName(SERIALIZED_NAME_CREATED_FROM)
  private OffsetDateTime createdFrom;

  public static final String SERIALIZED_NAME_CREATED_TO = "createdTo";
  @SerializedName(SERIALIZED_NAME_CREATED_TO)
  private OffsetDateTime createdTo;

  /**
   * Sort order by creation date, asc or desc
   */
  @JsonAdapter(SortEnum.Adapter.class)
  public enum SortEnum {
    DESC("desc"),
    
    ASC("asc");

    private String value;

    SortEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortEnum fromValue(String value) {
      for (SortEnum b : SortEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SortEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SortEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SortEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private SortEnum sort;

  public UsersSearchFilterDTO() {
  }

  public UsersSearchFilterDTO mailbox(String mailbox) {
    this.mailbox = mailbox;
    return this;
  }

  /**
   * UUID of Mailbox or &#39;no_access&#39; value
   * @return mailbox
   */
  @javax.annotation.Nullable
  public String getMailbox() {
    return mailbox;
  }

  public void setMailbox(String mailbox) {
    this.mailbox = mailbox;
  }


  public UsersSearchFilterDTO keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * Keyword to search by in: firstName, lastName, email
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public UsersSearchFilterDTO domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public UsersSearchFilterDTO addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<>();
    }
    this.domains.add(domainsItem);
    return this;
  }

  /**
   * Domains
   * @return domains
   */
  @javax.annotation.Nullable
  public List<String> getDomains() {
    return domains;
  }

  public void setDomains(List<String> domains) {
    this.domains = domains;
  }


  public UsersSearchFilterDTO roleUuids(List<UUID> roleUuids) {
    this.roleUuids = roleUuids;
    return this;
  }

  public UsersSearchFilterDTO addRoleUuidsItem(UUID roleUuidsItem) {
    if (this.roleUuids == null) {
      this.roleUuids = new ArrayList<>();
    }
    this.roleUuids.add(roleUuidsItem);
    return this;
  }

  /**
   * UUIDs of Roles
   * @return roleUuids
   */
  @javax.annotation.Nullable
  public List<UUID> getRoleUuids() {
    return roleUuids;
  }

  public void setRoleUuids(List<UUID> roleUuids) {
    this.roleUuids = roleUuids;
  }


  public UsersSearchFilterDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * User status
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public UsersSearchFilterDTO createdFrom(OffsetDateTime createdFrom) {
    this.createdFrom = createdFrom;
    return this;
  }

  /**
   * Created date from
   * @return createdFrom
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedFrom() {
    return createdFrom;
  }

  public void setCreatedFrom(OffsetDateTime createdFrom) {
    this.createdFrom = createdFrom;
  }


  public UsersSearchFilterDTO createdTo(OffsetDateTime createdTo) {
    this.createdTo = createdTo;
    return this;
  }

  /**
   * Created date to
   * @return createdTo
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedTo() {
    return createdTo;
  }

  public void setCreatedTo(OffsetDateTime createdTo) {
    this.createdTo = createdTo;
  }


  public UsersSearchFilterDTO sort(SortEnum sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Sort order by creation date, asc or desc
   * @return sort
   */
  @javax.annotation.Nullable
  public SortEnum getSort() {
    return sort;
  }

  public void setSort(SortEnum sort) {
    this.sort = sort;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersSearchFilterDTO usersSearchFilterDTO = (UsersSearchFilterDTO) o;
    return Objects.equals(this.mailbox, usersSearchFilterDTO.mailbox) &&
        Objects.equals(this.keyword, usersSearchFilterDTO.keyword) &&
        Objects.equals(this.domains, usersSearchFilterDTO.domains) &&
        Objects.equals(this.roleUuids, usersSearchFilterDTO.roleUuids) &&
        Objects.equals(this.status, usersSearchFilterDTO.status) &&
        Objects.equals(this.createdFrom, usersSearchFilterDTO.createdFrom) &&
        Objects.equals(this.createdTo, usersSearchFilterDTO.createdTo) &&
        Objects.equals(this.sort, usersSearchFilterDTO.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailbox, keyword, domains, roleUuids, status, createdFrom, createdTo, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersSearchFilterDTO {\n");
    sb.append("    mailbox: ").append(toIndentedString(mailbox)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    roleUuids: ").append(toIndentedString(roleUuids)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdFrom: ").append(toIndentedString(createdFrom)).append("\n");
    sb.append("    createdTo: ").append(toIndentedString(createdTo)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
    openapiFields.add("mailbox");
    openapiFields.add("keyword");
    openapiFields.add("domains");
    openapiFields.add("roleUuids");
    openapiFields.add("status");
    openapiFields.add("createdFrom");
    openapiFields.add("createdTo");
    openapiFields.add("sort");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UsersSearchFilterDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UsersSearchFilterDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsersSearchFilterDTO is not found in the empty JSON string", UsersSearchFilterDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UsersSearchFilterDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UsersSearchFilterDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("mailbox") != null && !jsonObj.get("mailbox").isJsonNull()) && !jsonObj.get("mailbox").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailbox` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailbox").toString()));
      }
      if ((jsonObj.get("keyword") != null && !jsonObj.get("keyword").isJsonNull()) && !jsonObj.get("keyword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyword").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("domains") != null && !jsonObj.get("domains").isJsonNull() && !jsonObj.get("domains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `domains` to be an array in the JSON string but got `%s`", jsonObj.get("domains").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roleUuids") != null && !jsonObj.get("roleUuids").isJsonNull() && !jsonObj.get("roleUuids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleUuids` to be an array in the JSON string but got `%s`", jsonObj.get("roleUuids").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) && !jsonObj.get("sort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort").toString()));
      }
      // validate the optional field `sort`
      if (jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) {
        SortEnum.validateJsonElement(jsonObj.get("sort"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersSearchFilterDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersSearchFilterDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersSearchFilterDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersSearchFilterDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersSearchFilterDTO>() {
           @Override
           public void write(JsonWriter out, UsersSearchFilterDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UsersSearchFilterDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UsersSearchFilterDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UsersSearchFilterDTO
   * @throws IOException if the JSON string is invalid with respect to UsersSearchFilterDTO
   */
  public static UsersSearchFilterDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersSearchFilterDTO.class);
  }

  /**
   * Convert an instance of UsersSearchFilterDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
