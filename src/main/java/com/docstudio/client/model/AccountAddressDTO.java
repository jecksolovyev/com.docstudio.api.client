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
 * Account billing address
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class AccountAddressDTO {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_COUNTRY_EN = "countryEn";
  @SerializedName(SERIALIZED_NAME_COUNTRY_EN)
  private String countryEn;

  public static final String SERIALIZED_NAME_REGION_EN = "regionEn";
  @SerializedName(SERIALIZED_NAME_REGION_EN)
  private String regionEn;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public static final String SERIALIZED_NAME_FORMATTED_ADDRESS = "formattedAddress";
  @SerializedName(SERIALIZED_NAME_FORMATTED_ADDRESS)
  private String formattedAddress;

  public AccountAddressDTO() {
  }

  public AccountAddressDTO country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country
   * @return country
   */
  @javax.annotation.Nonnull
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public AccountAddressDTO region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Region
   * @return region
   */
  @javax.annotation.Nonnull
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public AccountAddressDTO countryEn(String countryEn) {
    this.countryEn = countryEn;
    return this;
  }

  /**
   * Country EN
   * @return countryEn
   */
  @javax.annotation.Nonnull
  public String getCountryEn() {
    return countryEn;
  }

  public void setCountryEn(String countryEn) {
    this.countryEn = countryEn;
  }


  public AccountAddressDTO regionEn(String regionEn) {
    this.regionEn = regionEn;
    return this;
  }

  /**
   * Region EN
   * @return regionEn
   */
  @javax.annotation.Nonnull
  public String getRegionEn() {
    return regionEn;
  }

  public void setRegionEn(String regionEn) {
    this.regionEn = regionEn;
  }


  public AccountAddressDTO street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Street
   * @return street
   */
  @javax.annotation.Nonnull
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }


  public AccountAddressDTO city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City
   * @return city
   */
  @javax.annotation.Nonnull
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public AccountAddressDTO zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * Zip code
   * @return zip
   */
  @javax.annotation.Nonnull
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }


  public AccountAddressDTO formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

  /**
   * Formatted address
   * @return formattedAddress
   */
  @javax.annotation.Nonnull
  public String getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAddressDTO accountAddressDTO = (AccountAddressDTO) o;
    return Objects.equals(this.country, accountAddressDTO.country) &&
        Objects.equals(this.region, accountAddressDTO.region) &&
        Objects.equals(this.countryEn, accountAddressDTO.countryEn) &&
        Objects.equals(this.regionEn, accountAddressDTO.regionEn) &&
        Objects.equals(this.street, accountAddressDTO.street) &&
        Objects.equals(this.city, accountAddressDTO.city) &&
        Objects.equals(this.zip, accountAddressDTO.zip) &&
        Objects.equals(this.formattedAddress, accountAddressDTO.formattedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, region, countryEn, regionEn, street, city, zip, formattedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAddressDTO {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    countryEn: ").append(toIndentedString(countryEn)).append("\n");
    sb.append("    regionEn: ").append(toIndentedString(regionEn)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
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
    openapiFields.add("country");
    openapiFields.add("region");
    openapiFields.add("countryEn");
    openapiFields.add("regionEn");
    openapiFields.add("street");
    openapiFields.add("city");
    openapiFields.add("zip");
    openapiFields.add("formattedAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("region");
    openapiRequiredFields.add("countryEn");
    openapiRequiredFields.add("regionEn");
    openapiRequiredFields.add("street");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("zip");
    openapiRequiredFields.add("formattedAddress");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountAddressDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountAddressDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountAddressDTO is not found in the empty JSON string", AccountAddressDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountAddressDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountAddressDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountAddressDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (!jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if (!jsonObj.get("countryEn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryEn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryEn").toString()));
      }
      if (!jsonObj.get("regionEn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regionEn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regionEn").toString()));
      }
      if (!jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if (!jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (!jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
      if (!jsonObj.get("formattedAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formattedAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formattedAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountAddressDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountAddressDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountAddressDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountAddressDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountAddressDTO>() {
           @Override
           public void write(JsonWriter out, AccountAddressDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountAddressDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccountAddressDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountAddressDTO
   * @throws IOException if the JSON string is invalid with respect to AccountAddressDTO
   */
  public static AccountAddressDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountAddressDTO.class);
  }

  /**
   * Convert an instance of AccountAddressDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

