/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R110.5
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import com.docstudio.client.JSON;
import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;

/**
 * DictionaryResponseDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class DictionaryResponseDTO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Dictionary access level
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
  private AccessEnum access;

  public static final String SERIALIZED_NAME_ARCHIVE = "archive";
  @SerializedName(SERIALIZED_NAME_ARCHIVE)
  private Boolean archive;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EDITABLE = "editable";
  @SerializedName(SERIALIZED_NAME_EDITABLE)
  private Boolean editable;

  public static final String SERIALIZED_NAME_FILTERED_ACCESS_ONLY = "filteredAccessOnly";
  @SerializedName(SERIALIZED_NAME_FILTERED_ACCESS_ONLY)
  private Boolean filteredAccessOnly;

  public static final String SERIALIZED_NAME_RECORDS_COUNT = "recordsCount";
  @SerializedName(SERIALIZED_NAME_RECORDS_COUNT)
  private Long recordsCount;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<DictionaryColumnResponseDTO> columns = new ArrayList<>();

  /**
   * Dictionary availability status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    LOCKED("LOCKED"),

    AVAILABLE("AVAILABLE");

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

  public DictionaryResponseDTO() {
  }

  public DictionaryResponseDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Dictionary uuid
   * @return uuid
   */
  @javax.annotation.Nonnull
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public DictionaryResponseDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Dictionary name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DictionaryResponseDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Dictionary description
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public DictionaryResponseDTO access(AccessEnum access) {
    this.access = access;
    return this;
  }

  /**
   * Dictionary access level
   * @return access
   */
  @javax.annotation.Nonnull
  public AccessEnum getAccess() {
    return access;
  }

  public void setAccess(AccessEnum access) {
    this.access = access;
  }


  public DictionaryResponseDTO archive(Boolean archive) {
    this.archive = archive;
    return this;
  }

  /**
   * Dictionary archived flag
   * @return archive
   */
  @javax.annotation.Nonnull
  public Boolean getArchive() {
    return archive;
  }

  public void setArchive(Boolean archive) {
    this.archive = archive;
  }


  public DictionaryResponseDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Dictionary created date
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public DictionaryResponseDTO editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * Dictionary can be edited
   * @return editable
   */
  @javax.annotation.Nonnull
  public Boolean getEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }


  public DictionaryResponseDTO filteredAccessOnly(Boolean filteredAccessOnly) {
    this.filteredAccessOnly = filteredAccessOnly;
    return this;
  }

  /**
   * Dictionary can be used only with filtering
   * @return filteredAccessOnly
   */
  @javax.annotation.Nonnull
  public Boolean getFilteredAccessOnly() {
    return filteredAccessOnly;
  }

  public void setFilteredAccessOnly(Boolean filteredAccessOnly) {
    this.filteredAccessOnly = filteredAccessOnly;
  }


  public DictionaryResponseDTO recordsCount(Long recordsCount) {
    this.recordsCount = recordsCount;
    return this;
  }

  /**
   * Dictionary records count
   * @return recordsCount
   */
  @javax.annotation.Nullable
  public Long getRecordsCount() {
    return recordsCount;
  }

  public void setRecordsCount(Long recordsCount) {
    this.recordsCount = recordsCount;
  }


  public DictionaryResponseDTO columns(List<DictionaryColumnResponseDTO> columns) {
    this.columns = columns;
    return this;
  }

  public DictionaryResponseDTO addColumnsItem(DictionaryColumnResponseDTO columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * Get columns
   * @return columns
   */
  @javax.annotation.Nullable
  public List<DictionaryColumnResponseDTO> getColumns() {
    return columns;
  }

  public void setColumns(List<DictionaryColumnResponseDTO> columns) {
    this.columns = columns;
  }


  public DictionaryResponseDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Dictionary availability status
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryResponseDTO dictionaryResponseDTO = (DictionaryResponseDTO) o;
    return Objects.equals(this.uuid, dictionaryResponseDTO.uuid) &&
        Objects.equals(this.name, dictionaryResponseDTO.name) &&
        Objects.equals(this.description, dictionaryResponseDTO.description) &&
        Objects.equals(this.access, dictionaryResponseDTO.access) &&
        Objects.equals(this.archive, dictionaryResponseDTO.archive) &&
        Objects.equals(this.createdAt, dictionaryResponseDTO.createdAt) &&
        Objects.equals(this.editable, dictionaryResponseDTO.editable) &&
        Objects.equals(this.filteredAccessOnly, dictionaryResponseDTO.filteredAccessOnly) &&
        Objects.equals(this.recordsCount, dictionaryResponseDTO.recordsCount) &&
        Objects.equals(this.columns, dictionaryResponseDTO.columns) &&
        Objects.equals(this.status, dictionaryResponseDTO.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, description, access, archive, createdAt, editable, filteredAccessOnly, recordsCount, columns, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryResponseDTO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    filteredAccessOnly: ").append(toIndentedString(filteredAccessOnly)).append("\n");
    sb.append("    recordsCount: ").append(toIndentedString(recordsCount)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("access");
    openapiFields.add("archive");
    openapiFields.add("createdAt");
    openapiFields.add("editable");
    openapiFields.add("filteredAccessOnly");
    openapiFields.add("recordsCount");
    openapiFields.add("columns");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("access");
    openapiRequiredFields.add("archive");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("editable");
    openapiRequiredFields.add("filteredAccessOnly");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DictionaryResponseDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DictionaryResponseDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DictionaryResponseDTO is not found in the empty JSON string", DictionaryResponseDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DictionaryResponseDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DictionaryResponseDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DictionaryResponseDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("access").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access").toString()));
      }
      // validate the required field `access`
      AccessEnum.validateJsonElement(jsonObj.get("access"));
      if (jsonObj.get("columns") != null && !jsonObj.get("columns").isJsonNull()) {
        JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
        if (jsonArraycolumns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("columns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
          }

          // validate the optional field `columns` (array)
          for (int i = 0; i < jsonArraycolumns.size(); i++) {
            DictionaryColumnResponseDTO.validateJsonElement(jsonArraycolumns.get(i));
          };
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DictionaryResponseDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DictionaryResponseDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DictionaryResponseDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DictionaryResponseDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DictionaryResponseDTO>() {
           @Override
           public void write(JsonWriter out, DictionaryResponseDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DictionaryResponseDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DictionaryResponseDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DictionaryResponseDTO
   * @throws IOException if the JSON string is invalid with respect to DictionaryResponseDTO
   */
  public static DictionaryResponseDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DictionaryResponseDTO.class);
  }

  /**
   * Convert an instance of DictionaryResponseDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

