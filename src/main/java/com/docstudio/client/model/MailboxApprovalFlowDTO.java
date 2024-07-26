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
 * Flow to create
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class MailboxApprovalFlowDTO {
  public static final String SERIALIZED_NAME_SHARED_FOR_ACCOUNT = "sharedForAccount";
  @SerializedName(SERIALIZED_NAME_SHARED_FOR_ACCOUNT)
  private Boolean sharedForAccount;

  public static final String SERIALIZED_NAME_SHARED_FOR_MAILBOXES = "sharedForMailboxes";
  @SerializedName(SERIALIZED_NAME_SHARED_FOR_MAILBOXES)
  private Set<UUID> sharedForMailboxes = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets flowType
   */
  @JsonAdapter(FlowTypeEnum.Adapter.class)
  public enum FlowTypeEnum {
    AUTO("auto"),

    MANUAL("manual");

    private String value;

    FlowTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FlowTypeEnum fromValue(String value) {
      for (FlowTypeEnum b : FlowTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FlowTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FlowTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FlowTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FlowTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FlowTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FLOW_TYPE = "flowType";
  @SerializedName(SERIALIZED_NAME_FLOW_TYPE)
  private FlowTypeEnum flowType;

  public static final String SERIALIZED_NAME_APPROVERS = "approvers";
  @SerializedName(SERIALIZED_NAME_APPROVERS)
  private List<EnvelopeApproverDTO> approvers = new ArrayList<>();

  public MailboxApprovalFlowDTO() {
  }

  public MailboxApprovalFlowDTO sharedForAccount(Boolean sharedForAccount) {
    this.sharedForAccount = sharedForAccount;
    return this;
  }

  /**
   * Get sharedForAccount
   * @return sharedForAccount
   */
  @javax.annotation.Nullable
  public Boolean getSharedForAccount() {
    return sharedForAccount;
  }

  public void setSharedForAccount(Boolean sharedForAccount) {
    this.sharedForAccount = sharedForAccount;
  }


  public MailboxApprovalFlowDTO sharedForMailboxes(Set<UUID> sharedForMailboxes) {
    this.sharedForMailboxes = sharedForMailboxes;
    return this;
  }

  public MailboxApprovalFlowDTO addSharedForMailboxesItem(UUID sharedForMailboxesItem) {
    if (this.sharedForMailboxes == null) {
      this.sharedForMailboxes = new LinkedHashSet<>();
    }
    this.sharedForMailboxes.add(sharedForMailboxesItem);
    return this;
  }

  /**
   * Get sharedForMailboxes
   * @return sharedForMailboxes
   */
  @javax.annotation.Nullable
  public Set<UUID> getSharedForMailboxes() {
    return sharedForMailboxes;
  }

  public void setSharedForMailboxes(Set<UUID> sharedForMailboxes) {
    this.sharedForMailboxes = sharedForMailboxes;
  }


  public MailboxApprovalFlowDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public MailboxApprovalFlowDTO flowType(FlowTypeEnum flowType) {
    this.flowType = flowType;
    return this;
  }

  /**
   * Get flowType
   * @return flowType
   */
  @javax.annotation.Nonnull
  public FlowTypeEnum getFlowType() {
    return flowType;
  }

  public void setFlowType(FlowTypeEnum flowType) {
    this.flowType = flowType;
  }


  public MailboxApprovalFlowDTO approvers(List<EnvelopeApproverDTO> approvers) {
    this.approvers = approvers;
    return this;
  }

  public MailboxApprovalFlowDTO addApproversItem(EnvelopeApproverDTO approversItem) {
    if (this.approvers == null) {
      this.approvers = new ArrayList<>();
    }
    this.approvers.add(approversItem);
    return this;
  }

  /**
   * Get approvers
   * @return approvers
   */
  @javax.annotation.Nonnull
  public List<EnvelopeApproverDTO> getApprovers() {
    return approvers;
  }

  public void setApprovers(List<EnvelopeApproverDTO> approvers) {
    this.approvers = approvers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailboxApprovalFlowDTO mailboxApprovalFlowDTO = (MailboxApprovalFlowDTO) o;
    return Objects.equals(this.sharedForAccount, mailboxApprovalFlowDTO.sharedForAccount) &&
        Objects.equals(this.sharedForMailboxes, mailboxApprovalFlowDTO.sharedForMailboxes) &&
        Objects.equals(this.name, mailboxApprovalFlowDTO.name) &&
        Objects.equals(this.flowType, mailboxApprovalFlowDTO.flowType) &&
        Objects.equals(this.approvers, mailboxApprovalFlowDTO.approvers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedForAccount, sharedForMailboxes, name, flowType, approvers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailboxApprovalFlowDTO {\n");
    sb.append("    sharedForAccount: ").append(toIndentedString(sharedForAccount)).append("\n");
    sb.append("    sharedForMailboxes: ").append(toIndentedString(sharedForMailboxes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    flowType: ").append(toIndentedString(flowType)).append("\n");
    sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
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
    openapiFields.add("sharedForAccount");
    openapiFields.add("sharedForMailboxes");
    openapiFields.add("name");
    openapiFields.add("flowType");
    openapiFields.add("approvers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("flowType");
    openapiRequiredFields.add("approvers");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MailboxApprovalFlowDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MailboxApprovalFlowDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MailboxApprovalFlowDTO is not found in the empty JSON string", MailboxApprovalFlowDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MailboxApprovalFlowDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MailboxApprovalFlowDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MailboxApprovalFlowDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("sharedForMailboxes") != null && !jsonObj.get("sharedForMailboxes").isJsonNull() && !jsonObj.get("sharedForMailboxes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedForMailboxes` to be an array in the JSON string but got `%s`", jsonObj.get("sharedForMailboxes").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("flowType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flowType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flowType").toString()));
      }
      // validate the required field `flowType`
      FlowTypeEnum.validateJsonElement(jsonObj.get("flowType"));
      // ensure the json data is an array
      if (!jsonObj.get("approvers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvers` to be an array in the JSON string but got `%s`", jsonObj.get("approvers").toString()));
      }

      JsonArray jsonArrayapprovers = jsonObj.getAsJsonArray("approvers");
      // validate the required field `approvers` (array)
      for (int i = 0; i < jsonArrayapprovers.size(); i++) {
        EnvelopeApproverDTO.validateJsonElement(jsonArrayapprovers.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MailboxApprovalFlowDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MailboxApprovalFlowDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MailboxApprovalFlowDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MailboxApprovalFlowDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<MailboxApprovalFlowDTO>() {
           @Override
           public void write(JsonWriter out, MailboxApprovalFlowDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MailboxApprovalFlowDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MailboxApprovalFlowDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MailboxApprovalFlowDTO
   * @throws IOException if the JSON string is invalid with respect to MailboxApprovalFlowDTO
   */
  public static MailboxApprovalFlowDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MailboxApprovalFlowDTO.class);
  }

  /**
   * Convert an instance of MailboxApprovalFlowDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

