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
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;

/**
 * Data records
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class ActivityLogRecordDTO {
  public static final String SERIALIZED_NAME_MAILBOX_UUID = "mailboxUuid";
  @SerializedName(SERIALIZED_NAME_MAILBOX_UUID)
  private UUID mailboxUuid;

  public static final String SERIALIZED_NAME_MAILBOX_NAME = "mailboxName";
  @SerializedName(SERIALIZED_NAME_MAILBOX_NAME)
  private String mailboxName;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActivityLogAction action;

  public static final String SERIALIZED_NAME_OBJECT_NAME = "objectName";
  @SerializedName(SERIALIZED_NAME_OBJECT_NAME)
  private String objectName;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "objectType";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private ActivityLogObjectType objectType;

  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private UUID objectId;

  public static final String SERIALIZED_NAME_OPERATOR_ID = "operatorId";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ID)
  private UUID operatorId;

  public static final String SERIALIZED_NAME_OPERATOR_NAME = "operatorName";
  @SerializedName(SERIALIZED_NAME_OPERATOR_NAME)
  private String operatorName;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private OperationSource source;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_BROWSER = "browser";
  @SerializedName(SERIALIZED_NAME_BROWSER)
  private String browser;

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public ActivityLogRecordDTO() {
  }

  public ActivityLogRecordDTO mailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

  /**
   * UUID of mailbox
   * @return mailboxUuid
   */
  @javax.annotation.Nullable
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }


  public ActivityLogRecordDTO mailboxName(String mailboxName) {
    this.mailboxName = mailboxName;
    return this;
  }

  /**
   * Name of mailbox
   * @return mailboxName
   */
  @javax.annotation.Nullable
  public String getMailboxName() {
    return mailboxName;
  }

  public void setMailboxName(String mailboxName) {
    this.mailboxName = mailboxName;
  }


  public ActivityLogRecordDTO action(ActivityLogAction action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  @javax.annotation.Nullable
  public ActivityLogAction getAction() {
    return action;
  }

  public void setAction(ActivityLogAction action) {
    this.action = action;
  }


  public ActivityLogRecordDTO objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

  /**
   * Object name
   * @return objectName
   */
  @javax.annotation.Nullable
  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }


  public ActivityLogRecordDTO objectType(ActivityLogObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * Get objectType
   * @return objectType
   */
  @javax.annotation.Nullable
  public ActivityLogObjectType getObjectType() {
    return objectType;
  }

  public void setObjectType(ActivityLogObjectType objectType) {
    this.objectType = objectType;
  }


  public ActivityLogRecordDTO objectId(UUID objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * Object UUID
   * @return objectId
   */
  @javax.annotation.Nullable
  public UUID getObjectId() {
    return objectId;
  }

  public void setObjectId(UUID objectId) {
    this.objectId = objectId;
  }


  public ActivityLogRecordDTO operatorId(UUID operatorId) {
    this.operatorId = operatorId;
    return this;
  }

  /**
   * Operator UUID
   * @return operatorId
   */
  @javax.annotation.Nullable
  public UUID getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(UUID operatorId) {
    this.operatorId = operatorId;
  }


  public ActivityLogRecordDTO operatorName(String operatorName) {
    this.operatorName = operatorName;
    return this;
  }

  /**
   * Operator name
   * @return operatorName
   */
  @javax.annotation.Nullable
  public String getOperatorName() {
    return operatorName;
  }

  public void setOperatorName(String operatorName) {
    this.operatorName = operatorName;
  }


  public ActivityLogRecordDTO timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Action timestamp
   * @return timestamp
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public ActivityLogRecordDTO source(OperationSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @javax.annotation.Nullable
  public OperationSource getSource() {
    return source;
  }

  public void setSource(OperationSource source) {
    this.source = source;
  }


  public ActivityLogRecordDTO ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * IP address
   * @return ip
   */
  @javax.annotation.Nullable
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public ActivityLogRecordDTO browser(String browser) {
    this.browser = browser;
    return this;
  }

  /**
   * Browser
   * @return browser
   */
  @javax.annotation.Nullable
  public String getBrowser() {
    return browser;
  }

  public void setBrowser(String browser) {
    this.browser = browser;
  }


  public ActivityLogRecordDTO os(String os) {
    this.os = os;
    return this;
  }

  /**
   * Operation System
   * @return os
   */
  @javax.annotation.Nullable
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }


  public ActivityLogRecordDTO errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Error code
   * @return errorCode
   */
  @javax.annotation.Nullable
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityLogRecordDTO activityLogRecordDTO = (ActivityLogRecordDTO) o;
    return Objects.equals(this.mailboxUuid, activityLogRecordDTO.mailboxUuid) &&
        Objects.equals(this.mailboxName, activityLogRecordDTO.mailboxName) &&
        Objects.equals(this.action, activityLogRecordDTO.action) &&
        Objects.equals(this.objectName, activityLogRecordDTO.objectName) &&
        Objects.equals(this.objectType, activityLogRecordDTO.objectType) &&
        Objects.equals(this.objectId, activityLogRecordDTO.objectId) &&
        Objects.equals(this.operatorId, activityLogRecordDTO.operatorId) &&
        Objects.equals(this.operatorName, activityLogRecordDTO.operatorName) &&
        Objects.equals(this.timestamp, activityLogRecordDTO.timestamp) &&
        Objects.equals(this.source, activityLogRecordDTO.source) &&
        Objects.equals(this.ip, activityLogRecordDTO.ip) &&
        Objects.equals(this.browser, activityLogRecordDTO.browser) &&
        Objects.equals(this.os, activityLogRecordDTO.os) &&
        Objects.equals(this.errorCode, activityLogRecordDTO.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailboxUuid, mailboxName, action, objectName, objectType, objectId, operatorId, operatorName, timestamp, source, ip, browser, os, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityLogRecordDTO {\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    mailboxName: ").append(toIndentedString(mailboxName)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
    sb.append("    operatorName: ").append(toIndentedString(operatorName)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("objectName");
    openapiFields.add("objectType");
    openapiFields.add("objectId");
    openapiFields.add("operatorId");
    openapiFields.add("operatorName");
    openapiFields.add("timestamp");
    openapiFields.add("source");
    openapiFields.add("ip");
    openapiFields.add("browser");
    openapiFields.add("os");
    openapiFields.add("errorCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ActivityLogRecordDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ActivityLogRecordDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActivityLogRecordDTO is not found in the empty JSON string", ActivityLogRecordDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ActivityLogRecordDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActivityLogRecordDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("mailboxUuid") != null && !jsonObj.get("mailboxUuid").isJsonNull()) && !jsonObj.get("mailboxUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxUuid").toString()));
      }
      if ((jsonObj.get("mailboxName") != null && !jsonObj.get("mailboxName").isJsonNull()) && !jsonObj.get("mailboxName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxName").toString()));
      }
      // validate the optional field `action`
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) {
        ActivityLogAction.validateJsonElement(jsonObj.get("action"));
      }
      if ((jsonObj.get("objectName") != null && !jsonObj.get("objectName").isJsonNull()) && !jsonObj.get("objectName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectName").toString()));
      }
      // validate the optional field `objectType`
      if (jsonObj.get("objectType") != null && !jsonObj.get("objectType").isJsonNull()) {
        ActivityLogObjectType.validateJsonElement(jsonObj.get("objectType"));
      }
      if ((jsonObj.get("objectId") != null && !jsonObj.get("objectId").isJsonNull()) && !jsonObj.get("objectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectId").toString()));
      }
      if ((jsonObj.get("operatorId") != null && !jsonObj.get("operatorId").isJsonNull()) && !jsonObj.get("operatorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operatorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operatorId").toString()));
      }
      if ((jsonObj.get("operatorName") != null && !jsonObj.get("operatorName").isJsonNull()) && !jsonObj.get("operatorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operatorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operatorName").toString()));
      }
      // validate the optional field `source`
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) {
        OperationSource.validateJsonElement(jsonObj.get("source"));
      }
      if ((jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull()) && !jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
      if ((jsonObj.get("browser") != null && !jsonObj.get("browser").isJsonNull()) && !jsonObj.get("browser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browser").toString()));
      }
      if ((jsonObj.get("os") != null && !jsonObj.get("os").isJsonNull()) && !jsonObj.get("os").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActivityLogRecordDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActivityLogRecordDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActivityLogRecordDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActivityLogRecordDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ActivityLogRecordDTO>() {
           @Override
           public void write(JsonWriter out, ActivityLogRecordDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActivityLogRecordDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ActivityLogRecordDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ActivityLogRecordDTO
   * @throws IOException if the JSON string is invalid with respect to ActivityLogRecordDTO
   */
  public static ActivityLogRecordDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivityLogRecordDTO.class);
  }

  /**
   * Convert an instance of ActivityLogRecordDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

