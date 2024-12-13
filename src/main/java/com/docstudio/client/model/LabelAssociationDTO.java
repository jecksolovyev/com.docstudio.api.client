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
 * LabelAssociationDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
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
        Objects.equals(this.envelopes, labelAssociationDTO.envelopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelName, labelUuid, envelopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelAssociationDTO {\n");
    sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
    sb.append("    labelUuid: ").append(toIndentedString(labelUuid)).append("\n");
    sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
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

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LabelAssociationDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LabelAssociationDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
             elementAdapter.write(out, obj);
           }

           @Override
           public LabelAssociationDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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

