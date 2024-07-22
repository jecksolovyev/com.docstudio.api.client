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
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * Scenario
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:22:53.618811800+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class EnvelopeScenarioDTO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NEXT_STEPS = "nextSteps";
  @SerializedName(SERIALIZED_NAME_NEXT_STEPS)
  private List<ScenarioShortStepDTO> nextSteps = new ArrayList<>();

  public EnvelopeScenarioDTO() {
  }

  public EnvelopeScenarioDTO uuid(UUID uuid) {
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

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public EnvelopeScenarioDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Scenario name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public EnvelopeScenarioDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Scenario description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public EnvelopeScenarioDTO nextSteps(List<ScenarioShortStepDTO> nextSteps) {
    this.nextSteps = nextSteps;
    return this;
  }

  public EnvelopeScenarioDTO addNextStepsItem(ScenarioShortStepDTO nextStepsItem) {
    if (this.nextSteps == null) {
      this.nextSteps = new ArrayList<>();
    }
    this.nextSteps.add(nextStepsItem);
    return this;
  }

  /**
   * Scenario next steps
   * @return nextSteps
   */
  @javax.annotation.Nullable
  public List<ScenarioShortStepDTO> getNextSteps() {
    return nextSteps;
  }

  public void setNextSteps(List<ScenarioShortStepDTO> nextSteps) {
    this.nextSteps = nextSteps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeScenarioDTO envelopeScenarioDTO = (EnvelopeScenarioDTO) o;
    return Objects.equals(this.uuid, envelopeScenarioDTO.uuid) &&
        Objects.equals(this.name, envelopeScenarioDTO.name) &&
        Objects.equals(this.description, envelopeScenarioDTO.description) &&
        Objects.equals(this.nextSteps, envelopeScenarioDTO.nextSteps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, description, nextSteps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeScenarioDTO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nextSteps: ").append(toIndentedString(nextSteps)).append("\n");
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
    openapiFields.add("nextSteps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnvelopeScenarioDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnvelopeScenarioDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvelopeScenarioDTO is not found in the empty JSON string", EnvelopeScenarioDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnvelopeScenarioDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvelopeScenarioDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("nextSteps") != null && !jsonObj.get("nextSteps").isJsonNull()) {
        JsonArray jsonArraynextSteps = jsonObj.getAsJsonArray("nextSteps");
        if (jsonArraynextSteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("nextSteps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `nextSteps` to be an array in the JSON string but got `%s`", jsonObj.get("nextSteps").toString()));
          }

          // validate the optional field `nextSteps` (array)
          for (int i = 0; i < jsonArraynextSteps.size(); i++) {
            ScenarioShortStepDTO.validateJsonElement(jsonArraynextSteps.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvelopeScenarioDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvelopeScenarioDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvelopeScenarioDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvelopeScenarioDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvelopeScenarioDTO>() {
           @Override
           public void write(JsonWriter out, EnvelopeScenarioDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvelopeScenarioDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnvelopeScenarioDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnvelopeScenarioDTO
   * @throws IOException if the JSON string is invalid with respect to EnvelopeScenarioDTO
   */
  public static EnvelopeScenarioDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvelopeScenarioDTO.class);
  }

  /**
   * Convert an instance of EnvelopeScenarioDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

