/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R135.5
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
 * EnvelopeDocumentSignatureDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-23T12:49:56.203839-06:00[America/Edmonton]", comments = "Generator version: 7.14.0")
public class EnvelopeDocumentSignatureDTO {
  /**
   * Signature source type
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    BINARY("binary"),
    
    TEXT("text");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceEnum fromValue(String value) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SourceEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SourceEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  @javax.annotation.Nonnull
  private SourceEnum source;

  public static final String SERIALIZED_NAME_STAMP = "stamp";
  @SerializedName(SERIALIZED_NAME_STAMP)
  @javax.annotation.Nonnull
  private Boolean stamp;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nonnull
  private byte[] data;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  @javax.annotation.Nullable
  private byte[] certificate;

  public EnvelopeDocumentSignatureDTO() {
  }

  public EnvelopeDocumentSignatureDTO source(@javax.annotation.Nonnull SourceEnum source) {
    this.source = source;
    return this;
  }

  /**
   * Signature source type
   * @return source
   */
  @javax.annotation.Nonnull
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(@javax.annotation.Nonnull SourceEnum source) {
    this.source = source;
  }


  public EnvelopeDocumentSignatureDTO stamp(@javax.annotation.Nonnull Boolean stamp) {
    this.stamp = stamp;
    return this;
  }

  /**
   * Is stamp signature?
   * @return stamp
   */
  @javax.annotation.Nonnull
  public Boolean getStamp() {
    return stamp;
  }

  public void setStamp(@javax.annotation.Nonnull Boolean stamp) {
    this.stamp = stamp;
  }


  public EnvelopeDocumentSignatureDTO data(@javax.annotation.Nonnull byte[] data) {
    this.data = data;
    return this;
  }

  /**
   * Signature in base64
   * @return data
   */
  @javax.annotation.Nonnull
  public byte[] getData() {
    return data;
  }

  public void setData(@javax.annotation.Nonnull byte[] data) {
    this.data = data;
  }


  public EnvelopeDocumentSignatureDTO certificate(@javax.annotation.Nullable byte[] certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * Optional X.509 certificate in base64
   * @return certificate
   */
  @javax.annotation.Nullable
  public byte[] getCertificate() {
    return certificate;
  }

  public void setCertificate(@javax.annotation.Nullable byte[] certificate) {
    this.certificate = certificate;
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
   * @return the EnvelopeDocumentSignatureDTO instance itself
   */
  public EnvelopeDocumentSignatureDTO putAdditionalProperty(String key, Object value) {
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
    EnvelopeDocumentSignatureDTO envelopeDocumentSignatureDTO = (EnvelopeDocumentSignatureDTO) o;
    return Objects.equals(this.source, envelopeDocumentSignatureDTO.source) &&
        Objects.equals(this.stamp, envelopeDocumentSignatureDTO.stamp) &&
        Arrays.equals(this.data, envelopeDocumentSignatureDTO.data) &&
        Arrays.equals(this.certificate, envelopeDocumentSignatureDTO.certificate)&&
        Objects.equals(this.additionalProperties, envelopeDocumentSignatureDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, stamp, Arrays.hashCode(data), Arrays.hashCode(certificate), additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDocumentSignatureDTO {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    stamp: ").append(toIndentedString(stamp)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("source", "stamp", "data", "certificate"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("source", "stamp", "data"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopeDocumentSignatureDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopeDocumentSignatureDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopeDocumentSignatureDTO is not found in the empty JSON string", EnvelopeDocumentSignatureDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EnvelopeDocumentSignatureDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      // validate the required field `source`
      SourceEnum.validateJsonElement(jsonObj.get("source"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopeDocumentSignatureDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopeDocumentSignatureDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopeDocumentSignatureDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopeDocumentSignatureDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopeDocumentSignatureDTO>() {
           @Override
           public void write(JsonWriter out, EnvelopeDocumentSignatureDTO value) throws IOException {
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
           public EnvelopeDocumentSignatureDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             EnvelopeDocumentSignatureDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of EnvelopeDocumentSignatureDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopeDocumentSignatureDTO
   * @throws IOException if the JSON string is invalid with respect to EnvelopeDocumentSignatureDTO
   */
  public static EnvelopeDocumentSignatureDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopeDocumentSignatureDTO.class);
  }

  /**
   * Convert an instance of EnvelopeDocumentSignatureDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

