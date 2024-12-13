/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R120.10
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
 * uuids or search parameters have to specified separately
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class ReportMailboxesRequestDTO {
  public static final String SERIALIZED_NAME_UUIDS = "uuids";
  @SerializedName(SERIALIZED_NAME_UUIDS)
  @javax.annotation.Nullable
  private Set<UUID> uuids = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_SEARCH_PARAMS = "searchParams";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARAMS)
  @javax.annotation.Nullable
  private MailboxesSearchFilterDTO searchParams;

  public ReportMailboxesRequestDTO() {
  }

  public ReportMailboxesRequestDTO uuids(@javax.annotation.Nullable Set<UUID> uuids) {
    this.uuids = uuids;
    return this;
  }

  public ReportMailboxesRequestDTO addUuidsItem(UUID uuidsItem) {
    if (this.uuids == null) {
      this.uuids = new LinkedHashSet<>();
    }
    this.uuids.add(uuidsItem);
    return this;
  }

  /**
   * Get uuids
   * @return uuids
   */
  @javax.annotation.Nullable
  public Set<UUID> getUuids() {
    return uuids;
  }

  public void setUuids(@javax.annotation.Nullable Set<UUID> uuids) {
    this.uuids = uuids;
  }


  public ReportMailboxesRequestDTO searchParams(@javax.annotation.Nullable MailboxesSearchFilterDTO searchParams) {
    this.searchParams = searchParams;
    return this;
  }

  /**
   * Get searchParams
   * @return searchParams
   */
  @javax.annotation.Nullable
  public MailboxesSearchFilterDTO getSearchParams() {
    return searchParams;
  }

  public void setSearchParams(@javax.annotation.Nullable MailboxesSearchFilterDTO searchParams) {
    this.searchParams = searchParams;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportMailboxesRequestDTO reportMailboxesRequestDTO = (ReportMailboxesRequestDTO) o;
    return Objects.equals(this.uuids, reportMailboxesRequestDTO.uuids) &&
        Objects.equals(this.searchParams, reportMailboxesRequestDTO.searchParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuids, searchParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportMailboxesRequestDTO {\n");
    sb.append("    uuids: ").append(toIndentedString(uuids)).append("\n");
    sb.append("    searchParams: ").append(toIndentedString(searchParams)).append("\n");
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
    openapiFields.add("uuids");
    openapiFields.add("searchParams");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReportMailboxesRequestDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReportMailboxesRequestDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportMailboxesRequestDTO is not found in the empty JSON string", ReportMailboxesRequestDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReportMailboxesRequestDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportMailboxesRequestDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("uuids") != null && !jsonObj.get("uuids").isJsonNull() && !jsonObj.get("uuids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuids` to be an array in the JSON string but got `%s`", jsonObj.get("uuids").toString()));
      }
      // validate the optional field `searchParams`
      if (jsonObj.get("searchParams") != null && !jsonObj.get("searchParams").isJsonNull()) {
        MailboxesSearchFilterDTO.validateJsonElement(jsonObj.get("searchParams"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportMailboxesRequestDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportMailboxesRequestDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportMailboxesRequestDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportMailboxesRequestDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportMailboxesRequestDTO>() {
           @Override
           public void write(JsonWriter out, ReportMailboxesRequestDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportMailboxesRequestDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReportMailboxesRequestDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReportMailboxesRequestDTO
   * @throws IOException if the JSON string is invalid with respect to ReportMailboxesRequestDTO
   */
  public static ReportMailboxesRequestDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportMailboxesRequestDTO.class);
  }

  /**
   * Convert an instance of ReportMailboxesRequestDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

