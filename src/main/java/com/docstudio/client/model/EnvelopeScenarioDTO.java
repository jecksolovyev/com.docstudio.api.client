/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R86.31
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * Scenario
 */
@Schema(description = "Scenario")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-14T22:02:04.375144579Z[GMT]")

public class EnvelopeScenarioDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("nextSteps")
  private List<ScenarioShortStepDTO> nextSteps = null;

  public EnvelopeScenarioDTO uuid(UUID uuid) {
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

  public EnvelopeScenarioDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Scenario name
   * @return name
  **/
  @Schema(description = "Scenario name")
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
  **/
  @Schema(description = "Scenario description")
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
      this.nextSteps = new ArrayList<ScenarioShortStepDTO>();
    }
    this.nextSteps.add(nextStepsItem);
    return this;
  }

   /**
   * Scenario next steps
   * @return nextSteps
  **/
  @Schema(description = "Scenario next steps")
  public List<ScenarioShortStepDTO> getNextSteps() {
    return nextSteps;
  }

  public void setNextSteps(List<ScenarioShortStepDTO> nextSteps) {
    this.nextSteps = nextSteps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
