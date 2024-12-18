/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R121.17
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
 * AccountCreateDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T17:18:48.308949400+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class AccountCreateDTO {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_INN = "inn";
  @SerializedName(SERIALIZED_NAME_INN)
  @javax.annotation.Nonnull
  private String inn;

  public static final String SERIALIZED_NAME_MAILBOXES = "mailboxes";
  @SerializedName(SERIALIZED_NAME_MAILBOXES)
  @javax.annotation.Nonnull
  private List<String> mailboxes = new ArrayList<>();

  public static final String SERIALIZED_NAME_AGREED = "agreed";
  @SerializedName(SERIALIZED_NAME_AGREED)
  @javax.annotation.Nonnull
  private Boolean agreed;

  public AccountCreateDTO() {
  }

  public AccountCreateDTO name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Account name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public AccountCreateDTO inn(@javax.annotation.Nonnull String inn) {
    this.inn = inn;
    return this;
  }

  /**
   * Account ITN
   * @return inn
   */
  @javax.annotation.Nonnull
  public String getInn() {
    return inn;
  }

  public void setInn(@javax.annotation.Nonnull String inn) {
    this.inn = inn;
  }


  public AccountCreateDTO mailboxes(@javax.annotation.Nonnull List<String> mailboxes) {
    this.mailboxes = mailboxes;
    return this;
  }

  public AccountCreateDTO addMailboxesItem(String mailboxesItem) {
    if (this.mailboxes == null) {
      this.mailboxes = new ArrayList<>();
    }
    this.mailboxes.add(mailboxesItem);
    return this;
  }

  /**
   * Mailboxes names. At least one mailbox name must be set.
   * @return mailboxes
   */
  @javax.annotation.Nonnull
  public List<String> getMailboxes() {
    return mailboxes;
  }

  public void setMailboxes(@javax.annotation.Nonnull List<String> mailboxes) {
    this.mailboxes = mailboxes;
  }


  public AccountCreateDTO agreed(@javax.annotation.Nonnull Boolean agreed) {
    this.agreed = agreed;
    return this;
  }

  /**
   * Terms and Conditions agreed
   * @return agreed
   */
  @javax.annotation.Nonnull
  public Boolean getAgreed() {
    return agreed;
  }

  public void setAgreed(@javax.annotation.Nonnull Boolean agreed) {
    this.agreed = agreed;
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
   * @return the AccountCreateDTO instance itself
   */
  public AccountCreateDTO putAdditionalProperty(String key, Object value) {
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
    AccountCreateDTO accountCreateDTO = (AccountCreateDTO) o;
    return Objects.equals(this.name, accountCreateDTO.name) &&
        Objects.equals(this.inn, accountCreateDTO.inn) &&
        Objects.equals(this.mailboxes, accountCreateDTO.mailboxes) &&
        Objects.equals(this.agreed, accountCreateDTO.agreed)&&
        Objects.equals(this.additionalProperties, accountCreateDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, inn, mailboxes, agreed, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCreateDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    mailboxes: ").append(toIndentedString(mailboxes)).append("\n");
    sb.append("    agreed: ").append(toIndentedString(agreed)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("inn");
    openapiFields.add("mailboxes");
    openapiFields.add("agreed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("inn");
    openapiRequiredFields.add("mailboxes");
    openapiRequiredFields.add("agreed");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountCreateDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountCreateDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountCreateDTO is not found in the empty JSON string", AccountCreateDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountCreateDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("inn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inn").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("mailboxes") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("mailboxes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxes` to be an array in the JSON string but got `%s`", jsonObj.get("mailboxes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountCreateDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountCreateDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountCreateDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountCreateDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountCreateDTO>() {
           @Override
           public void write(JsonWriter out, AccountCreateDTO value) throws IOException {
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
           public AccountCreateDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AccountCreateDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AccountCreateDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountCreateDTO
   * @throws IOException if the JSON string is invalid with respect to AccountCreateDTO
   */
  public static AccountCreateDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountCreateDTO.class);
  }

  /**
   * Convert an instance of AccountCreateDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

