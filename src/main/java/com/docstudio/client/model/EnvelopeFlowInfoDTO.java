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
 * Detailed information about every role
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class EnvelopeFlowInfoDTO {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_MAILBOX_NAME = "mailboxName";
  @SerializedName(SERIALIZED_NAME_MAILBOX_NAME)
  @javax.annotation.Nullable
  private String mailboxName;

  public static final String SERIALIZED_NAME_DELEGATED_TO = "delegatedTo";
  @SerializedName(SERIALIZED_NAME_DELEGATED_TO)
  @javax.annotation.Nullable
  private String delegatedTo;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_COMPLETED = "completed";
  @SerializedName(SERIALIZED_NAME_COMPLETED)
  @javax.annotation.Nullable
  private Boolean completed;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  @javax.annotation.Nullable
  private Integer order;

  public static final String SERIALIZED_NAME_ROLE_ID = "roleId";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  @javax.annotation.Nullable
  private String roleId;

  public EnvelopeFlowInfoDTO() {
  }

  public EnvelopeFlowInfoDTO name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Role name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public EnvelopeFlowInfoDTO mailboxName(@javax.annotation.Nullable String mailboxName) {
    this.mailboxName = mailboxName;
    return this;
  }

  /**
   * Name of the mailbox role assigned to
   * @return mailboxName
   */
  @javax.annotation.Nullable
  public String getMailboxName() {
    return mailboxName;
  }

  public void setMailboxName(@javax.annotation.Nullable String mailboxName) {
    this.mailboxName = mailboxName;
  }


  public EnvelopeFlowInfoDTO delegatedTo(@javax.annotation.Nullable String delegatedTo) {
    this.delegatedTo = delegatedTo;
    return this;
  }

  /**
   * Email of delegate (for invitation)
   * @return delegatedTo
   */
  @javax.annotation.Nullable
  public String getDelegatedTo() {
    return delegatedTo;
  }

  public void setDelegatedTo(@javax.annotation.Nullable String delegatedTo) {
    this.delegatedTo = delegatedTo;
  }


  public EnvelopeFlowInfoDTO type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Role type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public EnvelopeFlowInfoDTO completed(@javax.annotation.Nullable Boolean completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Role completion status
   * @return completed
   */
  @javax.annotation.Nullable
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(@javax.annotation.Nullable Boolean completed) {
    this.completed = completed;
  }


  public EnvelopeFlowInfoDTO order(@javax.annotation.Nullable Integer order) {
    this.order = order;
    return this;
  }

  /**
   * Role order as defined in template
   * @return order
   */
  @javax.annotation.Nullable
  public Integer getOrder() {
    return order;
  }

  public void setOrder(@javax.annotation.Nullable Integer order) {
    this.order = order;
  }


  public EnvelopeFlowInfoDTO roleId(@javax.annotation.Nullable String roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Role id
   * @return roleId
   */
  @javax.annotation.Nullable
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(@javax.annotation.Nullable String roleId) {
    this.roleId = roleId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeFlowInfoDTO envelopeFlowInfoDTO = (EnvelopeFlowInfoDTO) o;
    return Objects.equals(this.name, envelopeFlowInfoDTO.name) &&
        Objects.equals(this.mailboxName, envelopeFlowInfoDTO.mailboxName) &&
        Objects.equals(this.delegatedTo, envelopeFlowInfoDTO.delegatedTo) &&
        Objects.equals(this.type, envelopeFlowInfoDTO.type) &&
        Objects.equals(this.completed, envelopeFlowInfoDTO.completed) &&
        Objects.equals(this.order, envelopeFlowInfoDTO.order) &&
        Objects.equals(this.roleId, envelopeFlowInfoDTO.roleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mailboxName, delegatedTo, type, completed, order, roleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeFlowInfoDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mailboxName: ").append(toIndentedString(mailboxName)).append("\n");
    sb.append("    delegatedTo: ").append(toIndentedString(delegatedTo)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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
    openapiFields.add("mailboxName");
    openapiFields.add("delegatedTo");
    openapiFields.add("type");
    openapiFields.add("completed");
    openapiFields.add("order");
    openapiFields.add("roleId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopeFlowInfoDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopeFlowInfoDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopeFlowInfoDTO is not found in the empty JSON string", EnvelopeFlowInfoDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvelopeFlowInfoDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvelopeFlowInfoDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("mailboxName") != null && !jsonObj.get("mailboxName").isJsonNull()) && !jsonObj.get("mailboxName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxName").toString()));
      }
      if ((jsonObj.get("delegatedTo") != null && !jsonObj.get("delegatedTo").isJsonNull()) && !jsonObj.get("delegatedTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delegatedTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delegatedTo").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("roleId") != null && !jsonObj.get("roleId").isJsonNull()) && !jsonObj.get("roleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopeFlowInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopeFlowInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopeFlowInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopeFlowInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopeFlowInfoDTO>() {
           @Override
           public void write(JsonWriter out, EnvelopeFlowInfoDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvelopeFlowInfoDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnvelopeFlowInfoDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopeFlowInfoDTO
   * @throws IOException if the JSON string is invalid with respect to EnvelopeFlowInfoDTO
   */
  public static EnvelopeFlowInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopeFlowInfoDTO.class);
  }

  /**
   * Convert an instance of EnvelopeFlowInfoDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

