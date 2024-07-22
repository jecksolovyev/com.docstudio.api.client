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

import com.docstudio.client.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;

/**
 * Events
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class AccountBillingEventDTO {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_QTY = "qty";
  @SerializedName(SERIALIZED_NAME_QTY)
  private Integer qty;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_BALANCE_IMPACT = "balanceImpact";
  @SerializedName(SERIALIZED_NAME_BALANCE_IMPACT)
  private Long balanceImpact;

  public static final String SERIALIZED_NAME_BALANCE_AFTER = "balanceAfter";
  @SerializedName(SERIALIZED_NAME_BALANCE_AFTER)
  private Long balanceAfter;

  public AccountBillingEventDTO() {
  }

  public AccountBillingEventDTO code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code
   * @return code
   */
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public AccountBillingEventDTO qty(Integer qty) {
    this.qty = qty;
    return this;
  }

  /**
   * Quantity
   * @return qty
   */
  @javax.annotation.Nullable
  public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }


  public AccountBillingEventDTO date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Date
   * @return date
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public AccountBillingEventDTO balanceImpact(Long balanceImpact) {
    this.balanceImpact = balanceImpact;
    return this;
  }

  /**
   * Balance impact, if any
   * @return balanceImpact
   */
  @javax.annotation.Nullable
  public Long getBalanceImpact() {
    return balanceImpact;
  }

  public void setBalanceImpact(Long balanceImpact) {
    this.balanceImpact = balanceImpact;
  }


  public AccountBillingEventDTO balanceAfter(Long balanceAfter) {
    this.balanceAfter = balanceAfter;
    return this;
  }

  /**
   * Balance after event, if impacted
   * @return balanceAfter
   */
  @javax.annotation.Nullable
  public Long getBalanceAfter() {
    return balanceAfter;
  }

  public void setBalanceAfter(Long balanceAfter) {
    this.balanceAfter = balanceAfter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBillingEventDTO accountBillingEventDTO = (AccountBillingEventDTO) o;
    return Objects.equals(this.code, accountBillingEventDTO.code) &&
        Objects.equals(this.qty, accountBillingEventDTO.qty) &&
        Objects.equals(this.date, accountBillingEventDTO.date) &&
        Objects.equals(this.balanceImpact, accountBillingEventDTO.balanceImpact) &&
        Objects.equals(this.balanceAfter, accountBillingEventDTO.balanceAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, qty, date, balanceImpact, balanceAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBillingEventDTO {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    balanceImpact: ").append(toIndentedString(balanceImpact)).append("\n");
    sb.append("    balanceAfter: ").append(toIndentedString(balanceAfter)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("qty");
    openapiFields.add("date");
    openapiFields.add("balanceImpact");
    openapiFields.add("balanceAfter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountBillingEventDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountBillingEventDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountBillingEventDTO is not found in the empty JSON string", AccountBillingEventDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountBillingEventDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountBillingEventDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountBillingEventDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountBillingEventDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountBillingEventDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountBillingEventDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountBillingEventDTO>() {
           @Override
           public void write(JsonWriter out, AccountBillingEventDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountBillingEventDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccountBillingEventDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountBillingEventDTO
   * @throws IOException if the JSON string is invalid with respect to AccountBillingEventDTO
   */
  public static AccountBillingEventDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountBillingEventDTO.class);
  }

  /**
   * Convert an instance of AccountBillingEventDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

