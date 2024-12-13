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

import com.docstudio.client.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * EnvTableRestriction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class EnvTableRestriction {
  public static final String SERIALIZED_NAME_MAX_ROWS = "maxRows";
  @SerializedName(SERIALIZED_NAME_MAX_ROWS)
  @javax.annotation.Nullable
  private Integer maxRows;

  public static final String SERIALIZED_NAME_ROWS_PER_UI_PAGE = "rowsPerUiPage";
  @SerializedName(SERIALIZED_NAME_ROWS_PER_UI_PAGE)
  @javax.annotation.Nullable
  private Integer rowsPerUiPage;

  public static final String SERIALIZED_NAME_ROWS_PER_PDF_PAGE = "rowsPerPdfPage";
  @SerializedName(SERIALIZED_NAME_ROWS_PER_PDF_PAGE)
  @javax.annotation.Nullable
  private Integer rowsPerPdfPage;

  public EnvTableRestriction() {
  }

  public EnvTableRestriction maxRows(@javax.annotation.Nullable Integer maxRows) {
    this.maxRows = maxRows;
    return this;
  }

  /**
   * Get maxRows
   * @return maxRows
   */
  @javax.annotation.Nullable
  public Integer getMaxRows() {
    return maxRows;
  }

  public void setMaxRows(@javax.annotation.Nullable Integer maxRows) {
    this.maxRows = maxRows;
  }


  public EnvTableRestriction rowsPerUiPage(@javax.annotation.Nullable Integer rowsPerUiPage) {
    this.rowsPerUiPage = rowsPerUiPage;
    return this;
  }

  /**
   * Get rowsPerUiPage
   * @return rowsPerUiPage
   */
  @javax.annotation.Nullable
  public Integer getRowsPerUiPage() {
    return rowsPerUiPage;
  }

  public void setRowsPerUiPage(@javax.annotation.Nullable Integer rowsPerUiPage) {
    this.rowsPerUiPage = rowsPerUiPage;
  }


  public EnvTableRestriction rowsPerPdfPage(@javax.annotation.Nullable Integer rowsPerPdfPage) {
    this.rowsPerPdfPage = rowsPerPdfPage;
    return this;
  }

  /**
   * Get rowsPerPdfPage
   * @return rowsPerPdfPage
   */
  @javax.annotation.Nullable
  public Integer getRowsPerPdfPage() {
    return rowsPerPdfPage;
  }

  public void setRowsPerPdfPage(@javax.annotation.Nullable Integer rowsPerPdfPage) {
    this.rowsPerPdfPage = rowsPerPdfPage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvTableRestriction envTableRestriction = (EnvTableRestriction) o;
    return Objects.equals(this.maxRows, envTableRestriction.maxRows) &&
        Objects.equals(this.rowsPerUiPage, envTableRestriction.rowsPerUiPage) &&
        Objects.equals(this.rowsPerPdfPage, envTableRestriction.rowsPerPdfPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxRows, rowsPerUiPage, rowsPerPdfPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvTableRestriction {\n");
    sb.append("    maxRows: ").append(toIndentedString(maxRows)).append("\n");
    sb.append("    rowsPerUiPage: ").append(toIndentedString(rowsPerUiPage)).append("\n");
    sb.append("    rowsPerPdfPage: ").append(toIndentedString(rowsPerPdfPage)).append("\n");
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
    openapiFields.add("maxRows");
    openapiFields.add("rowsPerUiPage");
    openapiFields.add("rowsPerPdfPage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvTableRestriction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvTableRestriction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvTableRestriction is not found in the empty JSON string", EnvTableRestriction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvTableRestriction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvTableRestriction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvTableRestriction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvTableRestriction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvTableRestriction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvTableRestriction.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvTableRestriction>() {
           @Override
           public void write(JsonWriter out, EnvTableRestriction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvTableRestriction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnvTableRestriction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvTableRestriction
   * @throws IOException if the JSON string is invalid with respect to EnvTableRestriction
   */
  public static EnvTableRestriction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvTableRestriction.class);
  }

  /**
   * Convert an instance of EnvTableRestriction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

