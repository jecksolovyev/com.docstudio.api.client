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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * SearchApprovalsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T18:50:48.300154-07:00[America/Edmonton]", comments = "Generator version: 7.10.0")
public class SearchApprovalsDTO {
  /**
   * Envelope approval scope
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    INBOX("inbox"),
    
    OUTBOX("outbox");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ScopeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  @javax.annotation.Nonnull
  private ScopeEnum scope;

  /**
   * Envelope statuses
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NOT_STARTED("NOT_STARTED"),
    
    WAITING("WAITING"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED"),
    
    CANCELLED("CANCELLED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private Set<StatusEnum> status = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  @javax.annotation.Nullable
  private String subject;

  public static final String SERIALIZED_NAME_RECEIVE_DATE_FROM = "receiveDateFrom";
  @SerializedName(SERIALIZED_NAME_RECEIVE_DATE_FROM)
  @javax.annotation.Nullable
  private OffsetDateTime receiveDateFrom;

  public static final String SERIALIZED_NAME_RECEIVE_DATE_TO = "receiveDateTo";
  @SerializedName(SERIALIZED_NAME_RECEIVE_DATE_TO)
  @javax.annotation.Nullable
  private OffsetDateTime receiveDateTo;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  @javax.annotation.Nullable
  private Set<UUID> template = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_INITIATOR = "initiator";
  @SerializedName(SERIALIZED_NAME_INITIATOR)
  @javax.annotation.Nullable
  private Set<UUID> initiator = new LinkedHashSet<>();

  /**
   * Sort order, asc or desc
   */
  @JsonAdapter(SortEnum.Adapter.class)
  public enum SortEnum {
    DESC("desc"),
    
    ASC("asc");

    private String value;

    SortEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortEnum fromValue(String value) {
      for (SortEnum b : SortEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SortEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SortEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SortEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  @javax.annotation.Nullable
  private SortEnum sort;

  public static final String SERIALIZED_NAME_URGENT = "urgent";
  @SerializedName(SERIALIZED_NAME_URGENT)
  @javax.annotation.Nullable
  private Boolean urgent;

  public SearchApprovalsDTO() {
  }

  public SearchApprovalsDTO scope(@javax.annotation.Nonnull ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Envelope approval scope
   * @return scope
   */
  @javax.annotation.Nonnull
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(@javax.annotation.Nonnull ScopeEnum scope) {
    this.scope = scope;
  }


  public SearchApprovalsDTO status(@javax.annotation.Nullable Set<StatusEnum> status) {
    this.status = status;
    return this;
  }

  public SearchApprovalsDTO addStatusItem(StatusEnum statusItem) {
    if (this.status == null) {
      this.status = new LinkedHashSet<>();
    }
    this.status.add(statusItem);
    return this;
  }

  /**
   * Envelope statuses
   * @return status
   */
  @javax.annotation.Nullable
  public Set<StatusEnum> getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable Set<StatusEnum> status) {
    this.status = status;
  }


  public SearchApprovalsDTO subject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Envelope subject
   * @return subject
   */
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
  }


  public SearchApprovalsDTO receiveDateFrom(@javax.annotation.Nullable OffsetDateTime receiveDateFrom) {
    this.receiveDateFrom = receiveDateFrom;
    return this;
  }

  /**
   * Receive date from
   * @return receiveDateFrom
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReceiveDateFrom() {
    return receiveDateFrom;
  }

  public void setReceiveDateFrom(@javax.annotation.Nullable OffsetDateTime receiveDateFrom) {
    this.receiveDateFrom = receiveDateFrom;
  }


  public SearchApprovalsDTO receiveDateTo(@javax.annotation.Nullable OffsetDateTime receiveDateTo) {
    this.receiveDateTo = receiveDateTo;
    return this;
  }

  /**
   * Receive date to
   * @return receiveDateTo
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReceiveDateTo() {
    return receiveDateTo;
  }

  public void setReceiveDateTo(@javax.annotation.Nullable OffsetDateTime receiveDateTo) {
    this.receiveDateTo = receiveDateTo;
  }


  public SearchApprovalsDTO template(@javax.annotation.Nullable Set<UUID> template) {
    this.template = template;
    return this;
  }

  public SearchApprovalsDTO addTemplateItem(UUID templateItem) {
    if (this.template == null) {
      this.template = new LinkedHashSet<>();
    }
    this.template.add(templateItem);
    return this;
  }

  /**
   * Template uuids
   * @return template
   */
  @javax.annotation.Nullable
  public Set<UUID> getTemplate() {
    return template;
  }

  public void setTemplate(@javax.annotation.Nullable Set<UUID> template) {
    this.template = template;
  }


  public SearchApprovalsDTO initiator(@javax.annotation.Nullable Set<UUID> initiator) {
    this.initiator = initiator;
    return this;
  }

  public SearchApprovalsDTO addInitiatorItem(UUID initiatorItem) {
    if (this.initiator == null) {
      this.initiator = new LinkedHashSet<>();
    }
    this.initiator.add(initiatorItem);
    return this;
  }

  /**
   * Envelope approval initiator uuids
   * @return initiator
   */
  @javax.annotation.Nullable
  public Set<UUID> getInitiator() {
    return initiator;
  }

  public void setInitiator(@javax.annotation.Nullable Set<UUID> initiator) {
    this.initiator = initiator;
  }


  public SearchApprovalsDTO sort(@javax.annotation.Nullable SortEnum sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Sort order, asc or desc
   * @return sort
   */
  @javax.annotation.Nullable
  public SortEnum getSort() {
    return sort;
  }

  public void setSort(@javax.annotation.Nullable SortEnum sort) {
    this.sort = sort;
  }


  public SearchApprovalsDTO urgent(@javax.annotation.Nullable Boolean urgent) {
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
   * @return the SearchApprovalsDTO instance itself
   */
  public SearchApprovalsDTO putAdditionalProperty(String key, Object value) {
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
    SearchApprovalsDTO searchApprovalsDTO = (SearchApprovalsDTO) o;
    return Objects.equals(this.scope, searchApprovalsDTO.scope) &&
        Objects.equals(this.status, searchApprovalsDTO.status) &&
        Objects.equals(this.subject, searchApprovalsDTO.subject) &&
        Objects.equals(this.receiveDateFrom, searchApprovalsDTO.receiveDateFrom) &&
        Objects.equals(this.receiveDateTo, searchApprovalsDTO.receiveDateTo) &&
        Objects.equals(this.template, searchApprovalsDTO.template) &&
        Objects.equals(this.initiator, searchApprovalsDTO.initiator) &&
        Objects.equals(this.sort, searchApprovalsDTO.sort) &&
        Objects.equals(this.urgent, searchApprovalsDTO.urgent)&&
        Objects.equals(this.additionalProperties, searchApprovalsDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, status, subject, receiveDateFrom, receiveDateTo, template, initiator, sort, urgent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchApprovalsDTO {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    receiveDateFrom: ").append(toIndentedString(receiveDateFrom)).append("\n");
    sb.append("    receiveDateTo: ").append(toIndentedString(receiveDateTo)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    urgent: ").append(toIndentedString(urgent)).append("\n");
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
    openapiFields.add("scope");
    openapiFields.add("status");
    openapiFields.add("subject");
    openapiFields.add("receiveDateFrom");
    openapiFields.add("receiveDateTo");
    openapiFields.add("template");
    openapiFields.add("initiator");
    openapiFields.add("sort");
    openapiFields.add("urgent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("scope");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchApprovalsDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchApprovalsDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchApprovalsDTO is not found in the empty JSON string", SearchApprovalsDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchApprovalsDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      // validate the required field `scope`
      ScopeEnum.validateJsonElement(jsonObj.get("scope"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull() && !jsonObj.get("status").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be an array in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull() && !jsonObj.get("template").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be an array in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("initiator") != null && !jsonObj.get("initiator").isJsonNull() && !jsonObj.get("initiator").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `initiator` to be an array in the JSON string but got `%s`", jsonObj.get("initiator").toString()));
      }
      if ((jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) && !jsonObj.get("sort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort").toString()));
      }
      // validate the optional field `sort`
      if (jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) {
        SortEnum.validateJsonElement(jsonObj.get("sort"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchApprovalsDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchApprovalsDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchApprovalsDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchApprovalsDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchApprovalsDTO>() {
           @Override
           public void write(JsonWriter out, SearchApprovalsDTO value) throws IOException {
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
           public SearchApprovalsDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SearchApprovalsDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of SearchApprovalsDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchApprovalsDTO
   * @throws IOException if the JSON string is invalid with respect to SearchApprovalsDTO
   */
  public static SearchApprovalsDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchApprovalsDTO.class);
  }

  /**
   * Convert an instance of SearchApprovalsDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

