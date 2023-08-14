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

/**
 * EnvelopeWithTemplateDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-14T22:02:04.375144579Z[GMT]")

public class EnvelopeWithTemplateDTO {
  @SerializedName("envelope")
  private EnvGetDTO envelope = null;

  @SerializedName("template")
  private FullTemplateResponseDTO template = null;

  @SerializedName("scenario")
  private EnvelopeScenarioDTO scenario = null;

  public EnvelopeWithTemplateDTO envelope(EnvGetDTO envelope) {
    this.envelope = envelope;
    return this;
  }

   /**
   * Get envelope
   * @return envelope
  **/
  @Schema(description = "")
  public EnvGetDTO getEnvelope() {
    return envelope;
  }

  public void setEnvelope(EnvGetDTO envelope) {
    this.envelope = envelope;
  }

  public EnvelopeWithTemplateDTO template(FullTemplateResponseDTO template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @Schema(description = "")
  public FullTemplateResponseDTO getTemplate() {
    return template;
  }

  public void setTemplate(FullTemplateResponseDTO template) {
    this.template = template;
  }

  public EnvelopeWithTemplateDTO scenario(EnvelopeScenarioDTO scenario) {
    this.scenario = scenario;
    return this;
  }

   /**
   * Get scenario
   * @return scenario
  **/
  @Schema(description = "")
  public EnvelopeScenarioDTO getScenario() {
    return scenario;
  }

  public void setScenario(EnvelopeScenarioDTO scenario) {
    this.scenario = scenario;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeWithTemplateDTO envelopeWithTemplateDTO = (EnvelopeWithTemplateDTO) o;
    return Objects.equals(this.envelope, envelopeWithTemplateDTO.envelope) &&
        Objects.equals(this.template, envelopeWithTemplateDTO.template) &&
        Objects.equals(this.scenario, envelopeWithTemplateDTO.scenario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelope, template, scenario);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeWithTemplateDTO {\n");
    
    sb.append("    envelope: ").append(toIndentedString(envelope)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
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
