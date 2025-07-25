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
import com.docstudio.client.model.FormViewEnvelope;
import com.docstudio.client.model.FormViewTemplate;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
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
 * FormView
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-23T12:49:56.203839-06:00[America/Edmonton]", comments = "Generator version: 7.14.0")
public class FormView {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_MAILBOX_ID = "mailboxId";
  @SerializedName(SERIALIZED_NAME_MAILBOX_ID)
  @javax.annotation.Nullable
  private UUID mailboxId;

  public static final String SERIALIZED_NAME_ALLOW_MICROSOFT_OFFICE_VIEWER = "allowMicrosoftOfficeViewer";
  @SerializedName(SERIALIZED_NAME_ALLOW_MICROSOFT_OFFICE_VIEWER)
  @javax.annotation.Nullable
  private Boolean allowMicrosoftOfficeViewer;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  @javax.annotation.Nullable
  private FormViewTemplate template;

  public static final String SERIALIZED_NAME_ENVELOPE = "envelope";
  @SerializedName(SERIALIZED_NAME_ENVELOPE)
  @javax.annotation.Nullable
  private FormViewEnvelope envelope;

  public FormView() {
  }

  public FormView id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public FormView name(@javax.annotation.Nullable String name) {
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


  public FormView mailboxId(@javax.annotation.Nullable UUID mailboxId) {
    this.mailboxId = mailboxId;
    return this;
  }

  /**
   * Get mailboxId
   * @return mailboxId
   */
  @javax.annotation.Nullable
  public UUID getMailboxId() {
    return mailboxId;
  }

  public void setMailboxId(@javax.annotation.Nullable UUID mailboxId) {
    this.mailboxId = mailboxId;
  }


  public FormView allowMicrosoftOfficeViewer(@javax.annotation.Nullable Boolean allowMicrosoftOfficeViewer) {
    this.allowMicrosoftOfficeViewer = allowMicrosoftOfficeViewer;
    return this;
  }

  /**
   * Get allowMicrosoftOfficeViewer
   * @return allowMicrosoftOfficeViewer
   */
  @javax.annotation.Nullable
  public Boolean getAllowMicrosoftOfficeViewer() {
    return allowMicrosoftOfficeViewer;
  }

  public void setAllowMicrosoftOfficeViewer(@javax.annotation.Nullable Boolean allowMicrosoftOfficeViewer) {
    this.allowMicrosoftOfficeViewer = allowMicrosoftOfficeViewer;
  }


  public FormView template(@javax.annotation.Nullable FormViewTemplate template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
   */
  @javax.annotation.Nullable
  public FormViewTemplate getTemplate() {
    return template;
  }

  public void setTemplate(@javax.annotation.Nullable FormViewTemplate template) {
    this.template = template;
  }


  public FormView envelope(@javax.annotation.Nullable FormViewEnvelope envelope) {
    this.envelope = envelope;
    return this;
  }

  /**
   * Get envelope
   * @return envelope
   */
  @javax.annotation.Nullable
  public FormViewEnvelope getEnvelope() {
    return envelope;
  }

  public void setEnvelope(@javax.annotation.Nullable FormViewEnvelope envelope) {
    this.envelope = envelope;
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
   * @return the FormView instance itself
   */
  public FormView putAdditionalProperty(String key, Object value) {
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
    FormView formView = (FormView) o;
    return Objects.equals(this.id, formView.id) &&
        Objects.equals(this.name, formView.name) &&
        Objects.equals(this.mailboxId, formView.mailboxId) &&
        Objects.equals(this.allowMicrosoftOfficeViewer, formView.allowMicrosoftOfficeViewer) &&
        Objects.equals(this.template, formView.template) &&
        Objects.equals(this.envelope, formView.envelope)&&
        Objects.equals(this.additionalProperties, formView.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, mailboxId, allowMicrosoftOfficeViewer, template, envelope, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormView {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mailboxId: ").append(toIndentedString(mailboxId)).append("\n");
    sb.append("    allowMicrosoftOfficeViewer: ").append(toIndentedString(allowMicrosoftOfficeViewer)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    envelope: ").append(toIndentedString(envelope)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("id", "name", "mailboxId", "allowMicrosoftOfficeViewer", "template", "envelope"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FormView
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FormView.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FormView is not found in the empty JSON string", FormView.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("mailboxId") != null && !jsonObj.get("mailboxId").isJsonNull()) && !jsonObj.get("mailboxId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxId").toString()));
      }
      // validate the optional field `template`
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) {
        FormViewTemplate.validateJsonElement(jsonObj.get("template"));
      }
      // validate the optional field `envelope`
      if (jsonObj.get("envelope") != null && !jsonObj.get("envelope").isJsonNull()) {
        FormViewEnvelope.validateJsonElement(jsonObj.get("envelope"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FormView.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FormView' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FormView> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FormView.class));

       return (TypeAdapter<T>) new TypeAdapter<FormView>() {
           @Override
           public void write(JsonWriter out, FormView value) throws IOException {
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
           public FormView read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             FormView instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of FormView given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FormView
   * @throws IOException if the JSON string is invalid with respect to FormView
   */
  public static FormView fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FormView.class);
  }

  /**
   * Convert an instance of FormView to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

