/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R125.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import java.util.Objects;
import com.docstudio.client.model.EnvelopeApproverDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.docstudio.client.JSON;

/**
 * Fill only flow UUID or list of approvers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T22:10:42.565042-07:00[America/Edmonton]", comments = "Generator version: 7.11.0")
public class EnvelopeApprovalRequestDTO {
  public static final String SERIALIZED_NAME_UUIDS = "uuids";
  @SerializedName(SERIALIZED_NAME_UUIDS)
  @javax.annotation.Nonnull
  private Set<UUID> uuids = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_URGENT = "urgent";
  @SerializedName(SERIALIZED_NAME_URGENT)
  @javax.annotation.Nullable
  private Boolean urgent;

  public static final String SERIALIZED_NAME_FLOW_UUID = "flowUuid";
  @SerializedName(SERIALIZED_NAME_FLOW_UUID)
  @javax.annotation.Nullable
  private UUID flowUuid;

  public static final String SERIALIZED_NAME_APPROVERS = "approvers";
  @SerializedName(SERIALIZED_NAME_APPROVERS)
  @javax.annotation.Nullable
  private List<EnvelopeApproverDTO> approvers = new ArrayList<>();

  public EnvelopeApprovalRequestDTO() {
  }

  public EnvelopeApprovalRequestDTO uuids(@javax.annotation.Nonnull Set<UUID> uuids) {
    this.uuids = uuids;
    return this;
  }

  public EnvelopeApprovalRequestDTO addUuidsItem(UUID uuidsItem) {
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
  @javax.annotation.Nonnull
  public Set<UUID> getUuids() {
    return uuids;
  }

  public void setUuids(@javax.annotation.Nonnull Set<UUID> uuids) {
    this.uuids = uuids;
  }


  public EnvelopeApprovalRequestDTO urgent(@javax.annotation.Nullable Boolean urgent) {
    this.urgent = urgent;
    return this;
  }

  /**
   * Is approval urgent?
   * @return urgent
   */
  @javax.annotation.Nullable
  public Boolean getUrgent() {
    return urgent;
  }

  public void setUrgent(@javax.annotation.Nullable Boolean urgent) {
    this.urgent = urgent;
  }


  public EnvelopeApprovalRequestDTO flowUuid(@javax.annotation.Nullable UUID flowUuid) {
    this.flowUuid = flowUuid;
    return this;
  }

  /**
   * UUID of saved approval flow (Approvers must not be set)
   * @return flowUuid
   */
  @javax.annotation.Nullable
  public UUID getFlowUuid() {
    return flowUuid;
  }

  public void setFlowUuid(@javax.annotation.Nullable UUID flowUuid) {
    this.flowUuid = flowUuid;
  }


  public EnvelopeApprovalRequestDTO approvers(@javax.annotation.Nullable List<EnvelopeApproverDTO> approvers) {
    this.approvers = approvers;
    return this;
  }

  public EnvelopeApprovalRequestDTO addApproversItem(EnvelopeApproverDTO approversItem) {
    if (this.approvers == null) {
      this.approvers = new ArrayList<>();
    }
    this.approvers.add(approversItem);
    return this;
  }

  /**
   * Set of approvers (Flow UUID must not be set)
   * @return approvers
   */
  @javax.annotation.Nullable
  public List<EnvelopeApproverDTO> getApprovers() {
    return approvers;
  }

  public void setApprovers(@javax.annotation.Nullable List<EnvelopeApproverDTO> approvers) {
    this.approvers = approvers;
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
   * @return the EnvelopeApprovalRequestDTO instance itself
   */
  public EnvelopeApprovalRequestDTO putAdditionalProperty(String key, Object value) {
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
    EnvelopeApprovalRequestDTO envelopeApprovalRequestDTO = (EnvelopeApprovalRequestDTO) o;
    return Objects.equals(this.uuids, envelopeApprovalRequestDTO.uuids) &&
        Objects.equals(this.urgent, envelopeApprovalRequestDTO.urgent) &&
        Objects.equals(this.flowUuid, envelopeApprovalRequestDTO.flowUuid) &&
        Objects.equals(this.approvers, envelopeApprovalRequestDTO.approvers)&&
        Objects.equals(this.additionalProperties, envelopeApprovalRequestDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuids, urgent, flowUuid, approvers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeApprovalRequestDTO {\n");
    sb.append("    uuids: ").append(toIndentedString(uuids)).append("\n");
    sb.append("    urgent: ").append(toIndentedString(urgent)).append("\n");
    sb.append("    flowUuid: ").append(toIndentedString(flowUuid)).append("\n");
    sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
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
    openapiFields.add("uuids");
    openapiFields.add("urgent");
    openapiFields.add("flowUuid");
    openapiFields.add("approvers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuids");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopeApprovalRequestDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopeApprovalRequestDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopeApprovalRequestDTO is not found in the empty JSON string", EnvelopeApprovalRequestDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EnvelopeApprovalRequestDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("uuids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("uuids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuids` to be an array in the JSON string but got `%s`", jsonObj.get("uuids").toString()));
      }
      if ((jsonObj.get("flowUuid") != null && !jsonObj.get("flowUuid").isJsonNull()) && !jsonObj.get("flowUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flowUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flowUuid").toString()));
      }
      if (jsonObj.get("approvers") != null && !jsonObj.get("approvers").isJsonNull()) {
        JsonArray jsonArrayapprovers = jsonObj.getAsJsonArray("approvers");
        if (jsonArrayapprovers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("approvers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `approvers` to be an array in the JSON string but got `%s`", jsonObj.get("approvers").toString()));
          }

          // validate the optional field `approvers` (array)
          for (int i = 0; i < jsonArrayapprovers.size(); i++) {
            EnvelopeApproverDTO.validateJsonElement(jsonArrayapprovers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopeApprovalRequestDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopeApprovalRequestDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopeApprovalRequestDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopeApprovalRequestDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopeApprovalRequestDTO>() {
           @Override
           public void write(JsonWriter out, EnvelopeApprovalRequestDTO value) throws IOException {
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
           public EnvelopeApprovalRequestDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             EnvelopeApprovalRequestDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of EnvelopeApprovalRequestDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopeApprovalRequestDTO
   * @throws IOException if the JSON string is invalid with respect to EnvelopeApprovalRequestDTO
   */
  public static EnvelopeApprovalRequestDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopeApprovalRequestDTO.class);
  }

  /**
   * Convert an instance of EnvelopeApprovalRequestDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

