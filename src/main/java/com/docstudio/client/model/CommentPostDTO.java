/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R110.4
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
 * CommentPostDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class CommentPostDTO {
  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private String documentId;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  /**
   * Access level (&#39;official&#39; is not allowed here)
   */
  @JsonAdapter(AccessTypeEnum.Adapter.class)
  public enum AccessTypeEnum {
    MAILBOX("mailbox"),

    ACCOUNT("account"),

    PUB("pub"),

    OFFICIAL("official"),

    SHARED("shared");

    private String value;

    AccessTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessTypeEnum fromValue(String value) {
      for (AccessTypeEnum b : AccessTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccessTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccessTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AccessTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ACCESS_TYPE = "accessType";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private AccessTypeEnum accessType;

  public static final String SERIALIZED_NAME_SHARED_TO = "sharedTo";
  @SerializedName(SERIALIZED_NAME_SHARED_TO)
  private Set<UUID> sharedTo = new LinkedHashSet<>();

  public CommentPostDTO() {
  }

  public CommentPostDTO documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Document ID to create new comment thread
   * @return documentId
   */
  @javax.annotation.Nonnull
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public CommentPostDTO text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Text of the message
   * @return text
   */
  @javax.annotation.Nonnull
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public CommentPostDTO xpath(String xpath) {
    this.xpath = xpath;
    return this;
  }

  /**
   * xPath to find selected area
   * @return xpath
   */
  @javax.annotation.Nullable
  public String getXpath() {
    return xpath;
  }

  public void setXpath(String xpath) {
    this.xpath = xpath;
  }


  public CommentPostDTO accessType(AccessTypeEnum accessType) {
    this.accessType = accessType;
    return this;
  }

  /**
   * Access level (&#39;official&#39; is not allowed here)
   * @return accessType
   */
  @javax.annotation.Nonnull
  public AccessTypeEnum getAccessType() {
    return accessType;
  }

  public void setAccessType(AccessTypeEnum accessType) {
    this.accessType = accessType;
  }


  public CommentPostDTO sharedTo(Set<UUID> sharedTo) {
    this.sharedTo = sharedTo;
    return this;
  }

  public CommentPostDTO addSharedToItem(UUID sharedToItem) {
    if (this.sharedTo == null) {
      this.sharedTo = new LinkedHashSet<>();
    }
    this.sharedTo.add(sharedToItem);
    return this;
  }

  /**
   * Get sharedTo
   * @return sharedTo
   */
  @javax.annotation.Nullable
  public Set<UUID> getSharedTo() {
    return sharedTo;
  }

  public void setSharedTo(Set<UUID> sharedTo) {
    this.sharedTo = sharedTo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentPostDTO commentPostDTO = (CommentPostDTO) o;
    return Objects.equals(this.documentId, commentPostDTO.documentId) &&
        Objects.equals(this.text, commentPostDTO.text) &&
        Objects.equals(this.xpath, commentPostDTO.xpath) &&
        Objects.equals(this.accessType, commentPostDTO.accessType) &&
        Objects.equals(this.sharedTo, commentPostDTO.sharedTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, text, xpath, accessType, sharedTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentPostDTO {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    sharedTo: ").append(toIndentedString(sharedTo)).append("\n");
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
    openapiFields.add("documentId");
    openapiFields.add("text");
    openapiFields.add("xpath");
    openapiFields.add("accessType");
    openapiFields.add("sharedTo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("documentId");
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("accessType");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CommentPostDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CommentPostDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommentPostDTO is not found in the empty JSON string", CommentPostDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CommentPostDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommentPostDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CommentPostDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("documentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentId").toString()));
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("xpath") != null && !jsonObj.get("xpath").isJsonNull()) && !jsonObj.get("xpath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xpath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xpath").toString()));
      }
      if (!jsonObj.get("accessType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessType").toString()));
      }
      // validate the required field `accessType`
      AccessTypeEnum.validateJsonElement(jsonObj.get("accessType"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("sharedTo") != null && !jsonObj.get("sharedTo").isJsonNull() && !jsonObj.get("sharedTo").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedTo` to be an array in the JSON string but got `%s`", jsonObj.get("sharedTo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommentPostDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommentPostDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommentPostDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommentPostDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CommentPostDTO>() {
           @Override
           public void write(JsonWriter out, CommentPostDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommentPostDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CommentPostDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CommentPostDTO
   * @throws IOException if the JSON string is invalid with respect to CommentPostDTO
   */
  public static CommentPostDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommentPostDTO.class);
  }

  /**
   * Convert an instance of CommentPostDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
