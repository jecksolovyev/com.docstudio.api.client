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
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * Counters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class AccountBillingCounterValueDTO {
  public static final String SERIALIZED_NAME_COUNTER_NAME = "counterName";
  @SerializedName(SERIALIZED_NAME_COUNTER_NAME)
  private String counterName;

  public static final String SERIALIZED_NAME_COUNTER_VALUE = "counterValue";
  @SerializedName(SERIALIZED_NAME_COUNTER_VALUE)
  private Long counterValue;

  public AccountBillingCounterValueDTO() {
  }

  public AccountBillingCounterValueDTO counterName(String counterName) {
    this.counterName = counterName;
    return this;
  }

  /**
   * Name
   * @return counterName
   */
  @javax.annotation.Nullable
  public String getCounterName() {
    return counterName;
  }

  public void setCounterName(String counterName) {
    this.counterName = counterName;
  }


  public AccountBillingCounterValueDTO counterValue(Long counterValue) {
    this.counterValue = counterValue;
    return this;
  }

  /**
   * Value
   * @return counterValue
   */
  @javax.annotation.Nullable
  public Long getCounterValue() {
    return counterValue;
  }

  public void setCounterValue(Long counterValue) {
    this.counterValue = counterValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBillingCounterValueDTO accountBillingCounterValueDTO = (AccountBillingCounterValueDTO) o;
    return Objects.equals(this.counterName, accountBillingCounterValueDTO.counterName) &&
        Objects.equals(this.counterValue, accountBillingCounterValueDTO.counterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counterName, counterValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBillingCounterValueDTO {\n");
    sb.append("    counterName: ").append(toIndentedString(counterName)).append("\n");
    sb.append("    counterValue: ").append(toIndentedString(counterValue)).append("\n");
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
    openapiFields.add("counterName");
    openapiFields.add("counterValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountBillingCounterValueDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountBillingCounterValueDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountBillingCounterValueDTO is not found in the empty JSON string", AccountBillingCounterValueDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountBillingCounterValueDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountBillingCounterValueDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("counterName") != null && !jsonObj.get("counterName").isJsonNull()) && !jsonObj.get("counterName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `counterName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("counterName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountBillingCounterValueDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountBillingCounterValueDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountBillingCounterValueDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountBillingCounterValueDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountBillingCounterValueDTO>() {
           @Override
           public void write(JsonWriter out, AccountBillingCounterValueDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountBillingCounterValueDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccountBillingCounterValueDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountBillingCounterValueDTO
   * @throws IOException if the JSON string is invalid with respect to AccountBillingCounterValueDTO
   */
  public static AccountBillingCounterValueDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountBillingCounterValueDTO.class);
  }

  /**
   * Convert an instance of AccountBillingCounterValueDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

