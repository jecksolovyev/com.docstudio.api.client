/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R110.5
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
 * CommentThreadDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class CommentThreadDTO {
  public static final String SERIALIZED_NAME_MAILBOX_UUID = "mailboxUuid";
  @SerializedName(SERIALIZED_NAME_MAILBOX_UUID)
  private UUID mailboxUuid;

  public static final String SERIALIZED_NAME_MAILBOX_NAME = "mailboxName";
  @SerializedName(SERIALIZED_NAME_MAILBOX_NAME)
  private String mailboxName;

  public static final String SERIALIZED_NAME_THREAD_UUID = "threadUuid";
  @SerializedName(SERIALIZED_NAME_THREAD_UUID)
  private UUID threadUuid;

  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<CommentMessageDTO> messages = new ArrayList<>();

  /**
   * Access level
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
  private Set<NameUuidDTO> sharedTo = new LinkedHashSet<>();

  public CommentThreadDTO() {
  }

  public CommentThreadDTO mailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

  /**
   * UUID of Mailbox created this comment
   * @return mailboxUuid
   */
  @javax.annotation.Nullable
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }


  public CommentThreadDTO mailboxName(String mailboxName) {
    this.mailboxName = mailboxName;
    return this;
  }

  /**
   * Name of Mailbox created this comment
   * @return mailboxName
   */
  @javax.annotation.Nullable
  public String getMailboxName() {
    return mailboxName;
  }

  public void setMailboxName(String mailboxName) {
    this.mailboxName = mailboxName;
  }


  public CommentThreadDTO threadUuid(UUID threadUuid) {
    this.threadUuid = threadUuid;
    return this;
  }

  /**
   * Thread UUID
   * @return threadUuid
   */
  @javax.annotation.Nullable
  public UUID getThreadUuid() {
    return threadUuid;
  }

  public void setThreadUuid(UUID threadUuid) {
    this.threadUuid = threadUuid;
  }


  public CommentThreadDTO xpath(String xpath) {
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


  public CommentThreadDTO messages(List<CommentMessageDTO> messages) {
    this.messages = messages;
    return this;
  }

  public CommentThreadDTO addMessagesItem(CommentMessageDTO messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * All messages in the thread
   * @return messages
   */
  @javax.annotation.Nullable
  public List<CommentMessageDTO> getMessages() {
    return messages;
  }

  public void setMessages(List<CommentMessageDTO> messages) {
    this.messages = messages;
  }


  public CommentThreadDTO accessType(AccessTypeEnum accessType) {
    this.accessType = accessType;
    return this;
  }

  /**
   * Access level
   * @return accessType
   */
  @javax.annotation.Nullable
  public AccessTypeEnum getAccessType() {
    return accessType;
  }

  public void setAccessType(AccessTypeEnum accessType) {
    this.accessType = accessType;
  }


  public CommentThreadDTO sharedTo(Set<NameUuidDTO> sharedTo) {
    this.sharedTo = sharedTo;
    return this;
  }

  public CommentThreadDTO addSharedToItem(NameUuidDTO sharedToItem) {
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
  public Set<NameUuidDTO> getSharedTo() {
    return sharedTo;
  }

  public void setSharedTo(Set<NameUuidDTO> sharedTo) {
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
    CommentThreadDTO commentThreadDTO = (CommentThreadDTO) o;
    return Objects.equals(this.mailboxUuid, commentThreadDTO.mailboxUuid) &&
        Objects.equals(this.mailboxName, commentThreadDTO.mailboxName) &&
        Objects.equals(this.threadUuid, commentThreadDTO.threadUuid) &&
        Objects.equals(this.xpath, commentThreadDTO.xpath) &&
        Objects.equals(this.messages, commentThreadDTO.messages) &&
        Objects.equals(this.accessType, commentThreadDTO.accessType) &&
        Objects.equals(this.sharedTo, commentThreadDTO.sharedTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailboxUuid, mailboxName, threadUuid, xpath, messages, accessType, sharedTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentThreadDTO {\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    mailboxName: ").append(toIndentedString(mailboxName)).append("\n");
    sb.append("    threadUuid: ").append(toIndentedString(threadUuid)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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
    openapiFields.add("mailboxUuid");
    openapiFields.add("mailboxName");
    openapiFields.add("threadUuid");
    openapiFields.add("xpath");
    openapiFields.add("messages");
    openapiFields.add("accessType");
    openapiFields.add("sharedTo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CommentThreadDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CommentThreadDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommentThreadDTO is not found in the empty JSON string", CommentThreadDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CommentThreadDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommentThreadDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("mailboxUuid") != null && !jsonObj.get("mailboxUuid").isJsonNull()) && !jsonObj.get("mailboxUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxUuid").toString()));
      }
      if ((jsonObj.get("mailboxName") != null && !jsonObj.get("mailboxName").isJsonNull()) && !jsonObj.get("mailboxName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxName").toString()));
      }
      if ((jsonObj.get("threadUuid") != null && !jsonObj.get("threadUuid").isJsonNull()) && !jsonObj.get("threadUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threadUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threadUuid").toString()));
      }
      if ((jsonObj.get("xpath") != null && !jsonObj.get("xpath").isJsonNull()) && !jsonObj.get("xpath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xpath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xpath").toString()));
      }
      if (jsonObj.get("messages") != null && !jsonObj.get("messages").isJsonNull()) {
        JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
        if (jsonArraymessages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("messages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
          }

          // validate the optional field `messages` (array)
          for (int i = 0; i < jsonArraymessages.size(); i++) {
            CommentMessageDTO.validateJsonElement(jsonArraymessages.get(i));
          };
        }
      }
      if ((jsonObj.get("accessType") != null && !jsonObj.get("accessType").isJsonNull()) && !jsonObj.get("accessType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessType").toString()));
      }
      // validate the optional field `accessType`
      if (jsonObj.get("accessType") != null && !jsonObj.get("accessType").isJsonNull()) {
        AccessTypeEnum.validateJsonElement(jsonObj.get("accessType"));
      }
      if (jsonObj.get("sharedTo") != null && !jsonObj.get("sharedTo").isJsonNull()) {
        JsonArray jsonArraysharedTo = jsonObj.getAsJsonArray("sharedTo");
        if (jsonArraysharedTo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sharedTo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sharedTo` to be an array in the JSON string but got `%s`", jsonObj.get("sharedTo").toString()));
          }

          // validate the optional field `sharedTo` (array)
          for (int i = 0; i < jsonArraysharedTo.size(); i++) {
            NameUuidDTO.validateJsonElement(jsonArraysharedTo.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommentThreadDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommentThreadDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommentThreadDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommentThreadDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CommentThreadDTO>() {
           @Override
           public void write(JsonWriter out, CommentThreadDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommentThreadDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CommentThreadDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CommentThreadDTO
   * @throws IOException if the JSON string is invalid with respect to CommentThreadDTO
   */
  public static CommentThreadDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommentThreadDTO.class);
  }

  /**
   * Convert an instance of CommentThreadDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

