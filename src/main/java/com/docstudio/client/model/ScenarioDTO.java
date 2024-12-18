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
 * ScenarioDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:19:30.369078200+02:00[Europe/Kiev]", comments = "Generator version: 7.10.0")
public class ScenarioDTO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_MAILBOX_UUID = "mailboxUuid";
  @SerializedName(SERIALIZED_NAME_MAILBOX_UUID)
  @javax.annotation.Nullable
  private UUID mailboxUuid;

  /**
   * Scenario access level
   */
  @JsonAdapter(AccessEnum.Adapter.class)
  public enum AccessEnum {
    MAILBOX("mailbox"),

    ACCOUNT("account"),

    PUB("pub"),

    OFFICIAL("official"),

    SHARED("shared");

    private String value;

    AccessEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessEnum fromValue(String value) {
      for (AccessEnum b : AccessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccessEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccessEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AccessEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ACCESS = "access";
  @SerializedName(SERIALIZED_NAME_ACCESS)
  @javax.annotation.Nonnull
  private AccessEnum access;

  public static final String SERIALIZED_NAME_SHARED_TO = "sharedTo";
  @SerializedName(SERIALIZED_NAME_SHARED_TO)
  @javax.annotation.Nullable
  private Set<UUID> sharedTo = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  @javax.annotation.Nonnull
  private List<ScenarioStepDTO> steps = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADD_TO_CHAIN = "addToChain";
  @SerializedName(SERIALIZED_NAME_ADD_TO_CHAIN)
  @javax.annotation.Nullable
  private Boolean addToChain;

  public ScenarioDTO() {
  }

  public ScenarioDTO uuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Scenario uuid
   * @return uuid
   */
  @javax.annotation.Nullable
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
  }


  public ScenarioDTO name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Scenario name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public ScenarioDTO description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Scenario description
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public ScenarioDTO mailboxUuid(@javax.annotation.Nullable UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

  /**
   * Scenario mailbox
   * @return mailboxUuid
   */
  @javax.annotation.Nullable
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(@javax.annotation.Nullable UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }


  public ScenarioDTO access(@javax.annotation.Nonnull AccessEnum access) {
    this.access = access;
    return this;
  }

  /**
   * Scenario access level
   * @return access
   */
  @javax.annotation.Nonnull
  public AccessEnum getAccess() {
    return access;
  }

  public void setAccess(@javax.annotation.Nonnull AccessEnum access) {
    this.access = access;
  }


  public ScenarioDTO sharedTo(@javax.annotation.Nullable Set<UUID> sharedTo) {
    this.sharedTo = sharedTo;
    return this;
  }

  public ScenarioDTO addSharedToItem(UUID sharedToItem) {
    if (this.sharedTo == null) {
      this.sharedTo = new LinkedHashSet<>();
    }
    this.sharedTo.add(sharedToItem);
    return this;
  }

  /**
   * Mailboxes list, which have access to scenario
   * @return sharedTo
   */
  @javax.annotation.Nullable
  public Set<UUID> getSharedTo() {
    return sharedTo;
  }

  public void setSharedTo(@javax.annotation.Nullable Set<UUID> sharedTo) {
    this.sharedTo = sharedTo;
  }


  public ScenarioDTO steps(@javax.annotation.Nonnull List<ScenarioStepDTO> steps) {
    this.steps = steps;
    return this;
  }

  public ScenarioDTO addStepsItem(ScenarioStepDTO stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * Scenario steps
   * @return steps
   */
  @javax.annotation.Nonnull
  public List<ScenarioStepDTO> getSteps() {
    return steps;
  }

  public void setSteps(@javax.annotation.Nonnull List<ScenarioStepDTO> steps) {
    this.steps = steps;
  }


  public ScenarioDTO addToChain(@javax.annotation.Nullable Boolean addToChain) {
    this.addToChain = addToChain;
    return this;
  }

  /**
   * Should envelopes be chained?
   * @return addToChain
   */
  @javax.annotation.Nullable
  public Boolean getAddToChain() {
    return addToChain;
  }

  public void setAddToChain(@javax.annotation.Nullable Boolean addToChain) {
    this.addToChain = addToChain;
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
   * @return the ScenarioDTO instance itself
   */
  public ScenarioDTO putAdditionalProperty(String key, Object value) {
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
    ScenarioDTO scenarioDTO = (ScenarioDTO) o;
    return Objects.equals(this.uuid, scenarioDTO.uuid) &&
        Objects.equals(this.name, scenarioDTO.name) &&
        Objects.equals(this.description, scenarioDTO.description) &&
        Objects.equals(this.mailboxUuid, scenarioDTO.mailboxUuid) &&
        Objects.equals(this.access, scenarioDTO.access) &&
        Objects.equals(this.sharedTo, scenarioDTO.sharedTo) &&
        Objects.equals(this.steps, scenarioDTO.steps) &&
        Objects.equals(this.addToChain, scenarioDTO.addToChain)&&
        Objects.equals(this.additionalProperties, scenarioDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, description, mailboxUuid, access, sharedTo, steps, addToChain, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioDTO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    sharedTo: ").append(toIndentedString(sharedTo)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    addToChain: ").append(toIndentedString(addToChain)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("mailboxUuid");
    openapiFields.add("access");
    openapiFields.add("sharedTo");
    openapiFields.add("steps");
    openapiFields.add("addToChain");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("access");
    openapiRequiredFields.add("steps");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ScenarioDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ScenarioDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScenarioDTO is not found in the empty JSON string", ScenarioDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ScenarioDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("mailboxUuid") != null && !jsonObj.get("mailboxUuid").isJsonNull()) && !jsonObj.get("mailboxUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailboxUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailboxUuid").toString()));
      }
      if (!jsonObj.get("access").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access").toString()));
      }
      // validate the required field `access`
      AccessEnum.validateJsonElement(jsonObj.get("access"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("sharedTo") != null && !jsonObj.get("sharedTo").isJsonNull() && !jsonObj.get("sharedTo").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedTo` to be an array in the JSON string but got `%s`", jsonObj.get("sharedTo").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("steps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `steps` to be an array in the JSON string but got `%s`", jsonObj.get("steps").toString()));
      }

      JsonArray jsonArraysteps = jsonObj.getAsJsonArray("steps");
      // validate the required field `steps` (array)
      for (int i = 0; i < jsonArraysteps.size(); i++) {
        ScenarioStepDTO.validateJsonElement(jsonArraysteps.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScenarioDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScenarioDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScenarioDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScenarioDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ScenarioDTO>() {
           @Override
           public void write(JsonWriter out, ScenarioDTO value) throws IOException {
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
           public ScenarioDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ScenarioDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of ScenarioDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ScenarioDTO
   * @throws IOException if the JSON string is invalid with respect to ScenarioDTO
   */
  public static ScenarioDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScenarioDTO.class);
  }

  /**
   * Convert an instance of ScenarioDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

