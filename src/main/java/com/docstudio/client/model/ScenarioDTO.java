/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R86.33
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * ScenarioDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class ScenarioDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("mailboxUuid")
  private UUID mailboxUuid = null;

  /**
   * Scenario access level
   */
  @JsonAdapter(AccessEnum.Adapter.class)
  public enum AccessEnum {
    @SerializedName("mailbox")
    MAILBOX("mailbox"),
    @SerializedName("account")
    ACCOUNT("account"),
    @SerializedName("pub")
    PUB("pub"),
    @SerializedName("official")
    OFFICIAL("official"),
    @SerializedName("shared")
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
    public static AccessEnum fromValue(String input) {
      for (AccessEnum b : AccessEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AccessEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AccessEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AccessEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("access")
  private AccessEnum access = null;

  @SerializedName("steps")
  private List<ScenarioStepDTO> steps = new ArrayList<ScenarioStepDTO>();

  @SerializedName("addToChain")
  private Boolean addToChain = null;

  public ScenarioDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Scenario uuid
   * @return uuid
  **/
  @Schema(description = "Scenario uuid")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public ScenarioDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Scenario name
   * @return name
  **/
  @Schema(required = true, description = "Scenario name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScenarioDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Scenario description
   * @return description
  **/
  @Schema(required = true, description = "Scenario description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ScenarioDTO mailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

   /**
   * Scenario mailbox
   * @return mailboxUuid
  **/
  @Schema(description = "Scenario mailbox")
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }

  public ScenarioDTO access(AccessEnum access) {
    this.access = access;
    return this;
  }

   /**
   * Scenario access level
   * @return access
  **/
  @Schema(required = true, description = "Scenario access level")
  public AccessEnum getAccess() {
    return access;
  }

  public void setAccess(AccessEnum access) {
    this.access = access;
  }

  public ScenarioDTO steps(List<ScenarioStepDTO> steps) {
    this.steps = steps;
    return this;
  }

  public ScenarioDTO addStepsItem(ScenarioStepDTO stepsItem) {
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Scenario steps
   * @return steps
  **/
  @Schema(required = true, description = "Scenario steps")
  public List<ScenarioStepDTO> getSteps() {
    return steps;
  }

  public void setSteps(List<ScenarioStepDTO> steps) {
    this.steps = steps;
  }

  public ScenarioDTO addToChain(Boolean addToChain) {
    this.addToChain = addToChain;
    return this;
  }

   /**
   * Should envelopes be chained?
   * @return addToChain
  **/
  @Schema(description = "Should envelopes be chained?")
  public Boolean isAddToChain() {
    return addToChain;
  }

  public void setAddToChain(Boolean addToChain) {
    this.addToChain = addToChain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
        Objects.equals(this.steps, scenarioDTO.steps) &&
        Objects.equals(this.addToChain, scenarioDTO.addToChain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, description, mailboxUuid, access, steps, addToChain);
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
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    addToChain: ").append(toIndentedString(addToChain)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
