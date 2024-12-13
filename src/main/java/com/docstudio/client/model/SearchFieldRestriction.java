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
 * SearchFieldRestriction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class SearchFieldRestriction {
  public static final String SERIALIZED_NAME_AUTOCOMPLETE_LIMIT = "autocompleteLimit";
  @SerializedName(SERIALIZED_NAME_AUTOCOMPLETE_LIMIT)
  @javax.annotation.Nullable
  private Integer autocompleteLimit;

  public SearchFieldRestriction() {
  }

  public SearchFieldRestriction autocompleteLimit(@javax.annotation.Nullable Integer autocompleteLimit) {
    this.autocompleteLimit = autocompleteLimit;
    return this;
  }

  /**
   * Get autocompleteLimit
   * @return autocompleteLimit
   */
  @javax.annotation.Nullable
  public Integer getAutocompleteLimit() {
    return autocompleteLimit;
  }

  public void setAutocompleteLimit(@javax.annotation.Nullable Integer autocompleteLimit) {
    this.autocompleteLimit = autocompleteLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchFieldRestriction searchFieldRestriction = (SearchFieldRestriction) o;
    return Objects.equals(this.autocompleteLimit, searchFieldRestriction.autocompleteLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autocompleteLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchFieldRestriction {\n");
    sb.append("    autocompleteLimit: ").append(toIndentedString(autocompleteLimit)).append("\n");
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
    openapiFields.add("autocompleteLimit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchFieldRestriction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchFieldRestriction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchFieldRestriction is not found in the empty JSON string", SearchFieldRestriction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchFieldRestriction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchFieldRestriction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchFieldRestriction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchFieldRestriction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchFieldRestriction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchFieldRestriction.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchFieldRestriction>() {
           @Override
           public void write(JsonWriter out, SearchFieldRestriction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchFieldRestriction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchFieldRestriction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchFieldRestriction
   * @throws IOException if the JSON string is invalid with respect to SearchFieldRestriction
   */
  public static SearchFieldRestriction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchFieldRestriction.class);
  }

  /**
   * Convert an instance of SearchFieldRestriction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

