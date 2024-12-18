/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R121.14
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import com.docstudio.client.JSON;
import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * Supported barcodes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:19:30.369078200+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class SupportedBarcodeDTO {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UPCA("upca"),

    UPCE("upce"),

    EAN8("ean8"),

    EAN13("ean13"),

    CODE39("code39"),

    CODE128("code128"),

    ITF14("itf14"),

    CODE93("code93"),

    RATIONALIZED_CODABAR("rationalizedCodabar"),

    DATABAREXPANDEDSTACKED("databarexpandedstacked"),

    QRCODE("qrcode"),

    DATAMATRIX("datamatrix"),

    PDF417("pdf417");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private TypeEnum type;

  public static final String SERIALIZED_NAME_DEFAULT_WIDTH = "defaultWidth";
  @SerializedName(SERIALIZED_NAME_DEFAULT_WIDTH)
  @javax.annotation.Nullable
  private Integer defaultWidth;

  public static final String SERIALIZED_NAME_DEFAULT_HEIGHT = "defaultHeight";
  @SerializedName(SERIALIZED_NAME_DEFAULT_HEIGHT)
  @javax.annotation.Nullable
  private Integer defaultHeight;

  public static final String SERIALIZED_NAME_LINK_SUPPORTED = "linkSupported";
  @SerializedName(SERIALIZED_NAME_LINK_SUPPORTED)
  @javax.annotation.Nullable
  private Boolean linkSupported;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_STATIC_SIZE = "staticSize";
  @SerializedName(SERIALIZED_NAME_STATIC_SIZE)
  @javax.annotation.Nullable
  private Boolean staticSize;

  public SupportedBarcodeDTO() {
  }

  public SupportedBarcodeDTO type(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
  }


  public SupportedBarcodeDTO defaultWidth(@javax.annotation.Nullable Integer defaultWidth) {
    this.defaultWidth = defaultWidth;
    return this;
  }

  /**
   * Get defaultWidth
   * @return defaultWidth
   */
  @javax.annotation.Nullable
  public Integer getDefaultWidth() {
    return defaultWidth;
  }

  public void setDefaultWidth(@javax.annotation.Nullable Integer defaultWidth) {
    this.defaultWidth = defaultWidth;
  }


  public SupportedBarcodeDTO defaultHeight(@javax.annotation.Nullable Integer defaultHeight) {
    this.defaultHeight = defaultHeight;
    return this;
  }

  /**
   * Get defaultHeight
   * @return defaultHeight
   */
  @javax.annotation.Nullable
  public Integer getDefaultHeight() {
    return defaultHeight;
  }

  public void setDefaultHeight(@javax.annotation.Nullable Integer defaultHeight) {
    this.defaultHeight = defaultHeight;
  }


  public SupportedBarcodeDTO linkSupported(@javax.annotation.Nullable Boolean linkSupported) {
    this.linkSupported = linkSupported;
    return this;
  }

  /**
   * Get linkSupported
   * @return linkSupported
   */
  @javax.annotation.Nullable
  public Boolean getLinkSupported() {
    return linkSupported;
  }

  public void setLinkSupported(@javax.annotation.Nullable Boolean linkSupported) {
    this.linkSupported = linkSupported;
  }


  public SupportedBarcodeDTO name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public SupportedBarcodeDTO staticSize(@javax.annotation.Nullable Boolean staticSize) {
    this.staticSize = staticSize;
    return this;
  }

  /**
   * Get staticSize
   * @return staticSize
   */
  @javax.annotation.Nullable
  public Boolean getStaticSize() {
    return staticSize;
  }

  public void setStaticSize(@javax.annotation.Nullable Boolean staticSize) {
    this.staticSize = staticSize;
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
   * @return the SupportedBarcodeDTO instance itself
   */
  public SupportedBarcodeDTO putAdditionalProperty(String key, Object value) {
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
    SupportedBarcodeDTO supportedBarcodeDTO = (SupportedBarcodeDTO) o;
    return Objects.equals(this.type, supportedBarcodeDTO.type) &&
        Objects.equals(this.defaultWidth, supportedBarcodeDTO.defaultWidth) &&
        Objects.equals(this.defaultHeight, supportedBarcodeDTO.defaultHeight) &&
        Objects.equals(this.linkSupported, supportedBarcodeDTO.linkSupported) &&
        Objects.equals(this.name, supportedBarcodeDTO.name) &&
        Objects.equals(this.staticSize, supportedBarcodeDTO.staticSize)&&
        Objects.equals(this.additionalProperties, supportedBarcodeDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, defaultWidth, defaultHeight, linkSupported, name, staticSize, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedBarcodeDTO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    defaultWidth: ").append(toIndentedString(defaultWidth)).append("\n");
    sb.append("    defaultHeight: ").append(toIndentedString(defaultHeight)).append("\n");
    sb.append("    linkSupported: ").append(toIndentedString(linkSupported)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    staticSize: ").append(toIndentedString(staticSize)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("defaultWidth");
    openapiFields.add("defaultHeight");
    openapiFields.add("linkSupported");
    openapiFields.add("name");
    openapiFields.add("staticSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SupportedBarcodeDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SupportedBarcodeDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SupportedBarcodeDTO is not found in the empty JSON string", SupportedBarcodeDTO.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SupportedBarcodeDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SupportedBarcodeDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SupportedBarcodeDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SupportedBarcodeDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<SupportedBarcodeDTO>() {
           @Override
           public void write(JsonWriter out, SupportedBarcodeDTO value) throws IOException {
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
           public SupportedBarcodeDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SupportedBarcodeDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of SupportedBarcodeDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SupportedBarcodeDTO
   * @throws IOException if the JSON string is invalid with respect to SupportedBarcodeDTO
   */
  public static SupportedBarcodeDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SupportedBarcodeDTO.class);
  }

  /**
   * Convert an instance of SupportedBarcodeDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

