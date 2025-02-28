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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
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
 * LabelAssociationDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T22:10:42.565042-07:00[America/Edmonton]", comments = "Generator version: 7.11.0")
public class LabelAssociationDTO {
  public static final String SERIALIZED_NAME_LABEL_NAME = "labelName";
  @SerializedName(SERIALIZED_NAME_LABEL_NAME)
  @javax.annotation.Nullable
  private String labelName;

  public static final String SERIALIZED_NAME_LABEL_UUID = "labelUuid";
  @SerializedName(SERIALIZED_NAME_LABEL_UUID)
  @javax.annotation.Nullable
  private UUID labelUuid;

  public static final String SERIALIZED_NAME_ENVELOPES = "envelopes";
  @SerializedName(SERIALIZED_NAME_ENVELOPES)
  @javax.annotation.Nonnull
  private Set<UUID> envelopes = new LinkedHashSet<>();

  public LabelAssociationDTO() {
  }

  public LabelAssociationDTO labelName(@javax.annotation.Nullable String labelName) {
    this.labelName = labelName;
    return this;
  }

  /**
   * Name of label to assign
   * @return labelName
   */
  @javax.annotation.Nullable
  public String getLabelName() {
    return labelName;
  }

  public void setLabelName(@javax.annotation.Nullable String labelName) {
    this.labelName = labelName;
  }


  public LabelAssociationDTO labelUuid(@javax.annotation.Nullable UUID labelUuid) {
    this.labelUuid = labelUuid;
    return this;
  }

  /**
   * UUID of label to assign
   * @return labelUuid
   */
  @javax.annotation.Nullable
  public UUID getLabelUuid() {
    return labelUuid;
  }

  public void setLabelUuid(@javax.annotation.Nullable UUID labelUuid) {
    this.labelUuid = labelUuid;
  }


  public LabelAssociationDTO envelopes(@javax.annotation.Nonnull Set<UUID> envelopes) {
    this.envelopes = envelopes;
    return this;
  }

  public LabelAssociationDTO addEnvelopesItem(UUID envelopesItem) {
    if (this.envelopes == null) {
      this.envelopes = new LinkedHashSet<>();
    }
    this.envelopes.add(envelopesItem);
    return this;
  }

  /**
   * Get envelopes
   * @return envelopes
   */
  @javax.annotation.Nonnull
  public Set<UUID> getEnvelopes() {
    return envelopes;
  }

  public void setEnvelopes(@javax.annotation.Nonnull Set<UUID> envelopes) {
    this.envelopes = envelopes;
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
   * @return the LabelAssociationDTO instance itself
   */
  public LabelAssociationDTO putAdditionalProperty(String key, Object value) {
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
    LabelAssociationDTO labelAssociationDTO = (LabelAssociationDTO) o;
    return Objects.equals(this.labelName, labelAssociationDTO.labelName) &&
        Objects.equals(this.labelUuid, labelAssociationDTO.labelUuid) &&
        Objects.equals(this.envelopes, labelAssociationDTO.envelopes)&&
        Objects.equals(this.additionalProperties, labelAssociationDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelName, labelUuid, envelopes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelAssociationDTO {\n");
    sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
    sb.append("    labelUuid: ").append(toIndentedString(labelUuid)).append("\n");
    sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
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
    openapiFields.add("labelName");
    openapiFields.add("labelUuid");
    openapiFields.add("envelopes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("envelopes");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LabelAssociationDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LabelAssociationDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LabelAssociationDTO is not found in the empty JSON string", LabelAssociationDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LabelAssociationDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("labelName") != null && !jsonObj.get("labelName").isJsonNull()) && !jsonObj.get("labelName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `labelName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("labelName").toString()));
      }
      if ((jsonObj.get("labelUuid") != null && !jsonObj.get("labelUuid").isJsonNull()) && !jsonObj.get("labelUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `labelUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("labelUuid").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("envelopes") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("envelopes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `envelopes` to be an array in the JSON string but got `%s`", jsonObj.get("envelopes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LabelAssociationDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LabelAssociationDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LabelAssociationDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LabelAssociationDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<LabelAssociationDTO>() {
           @Override
           public void write(JsonWriter out, LabelAssociationDTO value) throws IOException {
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
           public LabelAssociationDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             LabelAssociationDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of LabelAssociationDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LabelAssociationDTO
   * @throws IOException if the JSON string is invalid with respect to LabelAssociationDTO
   */
  public static LabelAssociationDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LabelAssociationDTO.class);
  }

  /**
   * Convert an instance of LabelAssociationDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

