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
import com.docstudio.client.model.DocumentPageSizeDTO;
import com.docstudio.client.model.ImageRestriction;
import com.docstudio.client.model.LogoImageRestriction;
import com.docstudio.client.model.TemplTableRestriction;
import com.docstudio.client.model.TextFieldPattern;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * TemplateRestriction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-23T12:49:56.203839-06:00[America/Edmonton]", comments = "Generator version: 7.14.0")
public class TemplateRestriction {
  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  @javax.annotation.Nullable
  private ImageRestriction image;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  @javax.annotation.Nullable
  private LogoImageRestriction logo;

  public static final String SERIALIZED_NAME_TABLE = "table";
  @SerializedName(SERIALIZED_NAME_TABLE)
  @javax.annotation.Nullable
  private TemplTableRestriction table;

  public static final String SERIALIZED_NAME_PATTERNS = "patterns";
  @SerializedName(SERIALIZED_NAME_PATTERNS)
  @javax.annotation.Nullable
  private List<TextFieldPattern> patterns = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXPIRE_AFTER_DAYS = "expireAfterDays";
  @SerializedName(SERIALIZED_NAME_EXPIRE_AFTER_DAYS)
  @javax.annotation.Nullable
  private Integer expireAfterDays;

  public static final String SERIALIZED_NAME_NOTIFY_IN_DAYS = "notifyInDays";
  @SerializedName(SERIALIZED_NAME_NOTIFY_IN_DAYS)
  @javax.annotation.Nullable
  private Integer notifyInDays;

  public static final String SERIALIZED_NAME_MAX_EXTERNAL_DOCS_COUNT = "maxExternalDocsCount";
  @SerializedName(SERIALIZED_NAME_MAX_EXTERNAL_DOCS_COUNT)
  @javax.annotation.Nullable
  private Integer maxExternalDocsCount;

  /**
   * Gets or Sets defaultPageSize
   */
  @JsonAdapter(DefaultPageSizeEnum.Adapter.class)
  public enum DefaultPageSizeEnum {
    A2("A2"),
    
    A3("A3"),
    
    A4("A4"),
    
    A5("A5"),
    
    LETTER("letter");

    private String value;

    DefaultPageSizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DefaultPageSizeEnum fromValue(String value) {
      for (DefaultPageSizeEnum b : DefaultPageSizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DefaultPageSizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultPageSizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DefaultPageSizeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DefaultPageSizeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DefaultPageSizeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DEFAULT_PAGE_SIZE = "defaultPageSize";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PAGE_SIZE)
  @javax.annotation.Nullable
  private DefaultPageSizeEnum defaultPageSize;

  public static final String SERIALIZED_NAME_SUPPORTED_PAGE_SIZES = "supportedPageSizes";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_PAGE_SIZES)
  @javax.annotation.Nullable
  private List<DocumentPageSizeDTO> supportedPageSizes = new ArrayList<>();

  public TemplateRestriction() {
  }

  public TemplateRestriction image(@javax.annotation.Nullable ImageRestriction image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @javax.annotation.Nullable
  public ImageRestriction getImage() {
    return image;
  }

  public void setImage(@javax.annotation.Nullable ImageRestriction image) {
    this.image = image;
  }


  public TemplateRestriction logo(@javax.annotation.Nullable LogoImageRestriction logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  @javax.annotation.Nullable
  public LogoImageRestriction getLogo() {
    return logo;
  }

  public void setLogo(@javax.annotation.Nullable LogoImageRestriction logo) {
    this.logo = logo;
  }


  public TemplateRestriction table(@javax.annotation.Nullable TemplTableRestriction table) {
    this.table = table;
    return this;
  }

  /**
   * Get table
   * @return table
   */
  @javax.annotation.Nullable
  public TemplTableRestriction getTable() {
    return table;
  }

  public void setTable(@javax.annotation.Nullable TemplTableRestriction table) {
    this.table = table;
  }


  public TemplateRestriction patterns(@javax.annotation.Nullable List<TextFieldPattern> patterns) {
    this.patterns = patterns;
    return this;
  }

  public TemplateRestriction addPatternsItem(TextFieldPattern patternsItem) {
    if (this.patterns == null) {
      this.patterns = new ArrayList<>();
    }
    this.patterns.add(patternsItem);
    return this;
  }

  /**
   * Get patterns
   * @return patterns
   */
  @javax.annotation.Nullable
  public List<TextFieldPattern> getPatterns() {
    return patterns;
  }

  public void setPatterns(@javax.annotation.Nullable List<TextFieldPattern> patterns) {
    this.patterns = patterns;
  }


  public TemplateRestriction expireAfterDays(@javax.annotation.Nullable Integer expireAfterDays) {
    this.expireAfterDays = expireAfterDays;
    return this;
  }

  /**
   * Get expireAfterDays
   * @return expireAfterDays
   */
  @javax.annotation.Nullable
  public Integer getExpireAfterDays() {
    return expireAfterDays;
  }

  public void setExpireAfterDays(@javax.annotation.Nullable Integer expireAfterDays) {
    this.expireAfterDays = expireAfterDays;
  }


  public TemplateRestriction notifyInDays(@javax.annotation.Nullable Integer notifyInDays) {
    this.notifyInDays = notifyInDays;
    return this;
  }

  /**
   * Get notifyInDays
   * @return notifyInDays
   */
  @javax.annotation.Nullable
  public Integer getNotifyInDays() {
    return notifyInDays;
  }

  public void setNotifyInDays(@javax.annotation.Nullable Integer notifyInDays) {
    this.notifyInDays = notifyInDays;
  }


  public TemplateRestriction maxExternalDocsCount(@javax.annotation.Nullable Integer maxExternalDocsCount) {
    this.maxExternalDocsCount = maxExternalDocsCount;
    return this;
  }

  /**
   * Get maxExternalDocsCount
   * @return maxExternalDocsCount
   */
  @javax.annotation.Nullable
  public Integer getMaxExternalDocsCount() {
    return maxExternalDocsCount;
  }

  public void setMaxExternalDocsCount(@javax.annotation.Nullable Integer maxExternalDocsCount) {
    this.maxExternalDocsCount = maxExternalDocsCount;
  }


  public TemplateRestriction defaultPageSize(@javax.annotation.Nullable DefaultPageSizeEnum defaultPageSize) {
    this.defaultPageSize = defaultPageSize;
    return this;
  }

  /**
   * Get defaultPageSize
   * @return defaultPageSize
   */
  @javax.annotation.Nullable
  public DefaultPageSizeEnum getDefaultPageSize() {
    return defaultPageSize;
  }

  public void setDefaultPageSize(@javax.annotation.Nullable DefaultPageSizeEnum defaultPageSize) {
    this.defaultPageSize = defaultPageSize;
  }


  public TemplateRestriction supportedPageSizes(@javax.annotation.Nullable List<DocumentPageSizeDTO> supportedPageSizes) {
    this.supportedPageSizes = supportedPageSizes;
    return this;
  }

  public TemplateRestriction addSupportedPageSizesItem(DocumentPageSizeDTO supportedPageSizesItem) {
    if (this.supportedPageSizes == null) {
      this.supportedPageSizes = new ArrayList<>();
    }
    this.supportedPageSizes.add(supportedPageSizesItem);
    return this;
  }

  /**
   * Get supportedPageSizes
   * @return supportedPageSizes
   */
  @javax.annotation.Nullable
  public List<DocumentPageSizeDTO> getSupportedPageSizes() {
    return supportedPageSizes;
  }

  public void setSupportedPageSizes(@javax.annotation.Nullable List<DocumentPageSizeDTO> supportedPageSizes) {
    this.supportedPageSizes = supportedPageSizes;
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
   * @return the TemplateRestriction instance itself
   */
  public TemplateRestriction putAdditionalProperty(String key, Object value) {
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
    TemplateRestriction templateRestriction = (TemplateRestriction) o;
    return Objects.equals(this.image, templateRestriction.image) &&
        Objects.equals(this.logo, templateRestriction.logo) &&
        Objects.equals(this.table, templateRestriction.table) &&
        Objects.equals(this.patterns, templateRestriction.patterns) &&
        Objects.equals(this.expireAfterDays, templateRestriction.expireAfterDays) &&
        Objects.equals(this.notifyInDays, templateRestriction.notifyInDays) &&
        Objects.equals(this.maxExternalDocsCount, templateRestriction.maxExternalDocsCount) &&
        Objects.equals(this.defaultPageSize, templateRestriction.defaultPageSize) &&
        Objects.equals(this.supportedPageSizes, templateRestriction.supportedPageSizes)&&
        Objects.equals(this.additionalProperties, templateRestriction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, logo, table, patterns, expireAfterDays, notifyInDays, maxExternalDocsCount, defaultPageSize, supportedPageSizes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateRestriction {\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    patterns: ").append(toIndentedString(patterns)).append("\n");
    sb.append("    expireAfterDays: ").append(toIndentedString(expireAfterDays)).append("\n");
    sb.append("    notifyInDays: ").append(toIndentedString(notifyInDays)).append("\n");
    sb.append("    maxExternalDocsCount: ").append(toIndentedString(maxExternalDocsCount)).append("\n");
    sb.append("    defaultPageSize: ").append(toIndentedString(defaultPageSize)).append("\n");
    sb.append("    supportedPageSizes: ").append(toIndentedString(supportedPageSizes)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("image", "logo", "table", "patterns", "expireAfterDays", "notifyInDays", "maxExternalDocsCount", "defaultPageSize", "supportedPageSizes"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TemplateRestriction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TemplateRestriction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateRestriction is not found in the empty JSON string", TemplateRestriction.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `image`
      if (jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) {
        ImageRestriction.validateJsonElement(jsonObj.get("image"));
      }
      // validate the optional field `logo`
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) {
        LogoImageRestriction.validateJsonElement(jsonObj.get("logo"));
      }
      // validate the optional field `table`
      if (jsonObj.get("table") != null && !jsonObj.get("table").isJsonNull()) {
        TemplTableRestriction.validateJsonElement(jsonObj.get("table"));
      }
      if (jsonObj.get("patterns") != null && !jsonObj.get("patterns").isJsonNull()) {
        JsonArray jsonArraypatterns = jsonObj.getAsJsonArray("patterns");
        if (jsonArraypatterns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("patterns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `patterns` to be an array in the JSON string but got `%s`", jsonObj.get("patterns").toString()));
          }

          // validate the optional field `patterns` (array)
          for (int i = 0; i < jsonArraypatterns.size(); i++) {
            TextFieldPattern.validateJsonElement(jsonArraypatterns.get(i));
          };
        }
      }
      if ((jsonObj.get("defaultPageSize") != null && !jsonObj.get("defaultPageSize").isJsonNull()) && !jsonObj.get("defaultPageSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultPageSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultPageSize").toString()));
      }
      // validate the optional field `defaultPageSize`
      if (jsonObj.get("defaultPageSize") != null && !jsonObj.get("defaultPageSize").isJsonNull()) {
        DefaultPageSizeEnum.validateJsonElement(jsonObj.get("defaultPageSize"));
      }
      if (jsonObj.get("supportedPageSizes") != null && !jsonObj.get("supportedPageSizes").isJsonNull()) {
        JsonArray jsonArraysupportedPageSizes = jsonObj.getAsJsonArray("supportedPageSizes");
        if (jsonArraysupportedPageSizes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("supportedPageSizes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `supportedPageSizes` to be an array in the JSON string but got `%s`", jsonObj.get("supportedPageSizes").toString()));
          }

          // validate the optional field `supportedPageSizes` (array)
          for (int i = 0; i < jsonArraysupportedPageSizes.size(); i++) {
            DocumentPageSizeDTO.validateJsonElement(jsonArraysupportedPageSizes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateRestriction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateRestriction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateRestriction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateRestriction.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateRestriction>() {
           @Override
           public void write(JsonWriter out, TemplateRestriction value) throws IOException {
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
           public TemplateRestriction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TemplateRestriction instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of TemplateRestriction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TemplateRestriction
   * @throws IOException if the JSON string is invalid with respect to TemplateRestriction
   */
  public static TemplateRestriction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateRestriction.class);
  }

  /**
   * Convert an instance of TemplateRestriction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

