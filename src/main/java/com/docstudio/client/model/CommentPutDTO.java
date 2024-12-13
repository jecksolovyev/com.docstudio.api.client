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
 * CommentPutDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:03:07.416970900+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class CommentPutDTO {
  public static final String SERIALIZED_NAME_THREAD_UUID = "threadUuid";
  @SerializedName(SERIALIZED_NAME_THREAD_UUID)
  @javax.annotation.Nonnull
  private UUID threadUuid;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  @javax.annotation.Nonnull
  private String text;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  @javax.annotation.Nullable
  private Integer messageId;

  public CommentPutDTO() {
  }

  public CommentPutDTO threadUuid(@javax.annotation.Nonnull UUID threadUuid) {
    this.threadUuid = threadUuid;
    return this;
  }

  /**
   * Thread UUID to update
   * @return threadUuid
   */
  @javax.annotation.Nonnull
  public UUID getThreadUuid() {
    return threadUuid;
  }

  public void setThreadUuid(@javax.annotation.Nonnull UUID threadUuid) {
    this.threadUuid = threadUuid;
  }


  public CommentPutDTO text(@javax.annotation.Nonnull String text) {
    this.text = text;
    return this;
  }

  /**
   * Text of the comment
   * @return text
   */
  @javax.annotation.Nonnull
  public String getText() {
    return text;
  }

  public void setText(@javax.annotation.Nonnull String text) {
    this.text = text;
  }


  public CommentPutDTO messageId(@javax.annotation.Nullable Integer messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * Message ID to update (optional)
   * @return messageId
   */
  @javax.annotation.Nullable
  public Integer getMessageId() {
    return messageId;
  }

  public void setMessageId(@javax.annotation.Nullable Integer messageId) {
    this.messageId = messageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentPutDTO commentPutDTO = (CommentPutDTO) o;
    return Objects.equals(this.threadUuid, commentPutDTO.threadUuid) &&
        Objects.equals(this.text, commentPutDTO.text) &&
        Objects.equals(this.messageId, commentPutDTO.messageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadUuid, text, messageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentPutDTO {\n");
    sb.append("    threadUuid: ").append(toIndentedString(threadUuid)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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
    openapiFields.add("threadUuid");
    openapiFields.add("text");
    openapiFields.add("messageId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("threadUuid");
    openapiRequiredFields.add("text");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CommentPutDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CommentPutDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommentPutDTO is not found in the empty JSON string", CommentPutDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CommentPutDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommentPutDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CommentPutDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("threadUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threadUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threadUuid").toString()));
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommentPutDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommentPutDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommentPutDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommentPutDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CommentPutDTO>() {
           @Override
           public void write(JsonWriter out, CommentPutDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommentPutDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CommentPutDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CommentPutDTO
   * @throws IOException if the JSON string is invalid with respect to CommentPutDTO
   */
  public static CommentPutDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommentPutDTO.class);
  }

  /**
   * Convert an instance of CommentPutDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

