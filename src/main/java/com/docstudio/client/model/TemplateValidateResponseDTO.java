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

import java.util.UUID;
/**
 * TemplateValidateResponseDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-14T22:02:04.375144579Z[GMT]")

public class TemplateValidateResponseDTO {
  @SerializedName("templateUuid")
  private UUID templateUuid = null;

  @SerializedName("versionUuid")
  private UUID versionUuid = null;

  @SerializedName("templateName")
  private String templateName = null;

  public TemplateValidateResponseDTO templateUuid(UUID templateUuid) {
    this.templateUuid = templateUuid;
    return this;
  }

   /**
   * Get templateUuid
   * @return templateUuid
  **/
  @Schema(description = "")
  public UUID getTemplateUuid() {
    return templateUuid;
  }

  public void setTemplateUuid(UUID templateUuid) {
    this.templateUuid = templateUuid;
  }

  public TemplateValidateResponseDTO versionUuid(UUID versionUuid) {
    this.versionUuid = versionUuid;
    return this;
  }

   /**
   * Get versionUuid
   * @return versionUuid
  **/
  @Schema(description = "")
  public UUID getVersionUuid() {
    return versionUuid;
  }

  public void setVersionUuid(UUID versionUuid) {
    this.versionUuid = versionUuid;
  }

  public TemplateValidateResponseDTO templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @Schema(description = "")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateValidateResponseDTO templateValidateResponseDTO = (TemplateValidateResponseDTO) o;
    return Objects.equals(this.templateUuid, templateValidateResponseDTO.templateUuid) &&
        Objects.equals(this.versionUuid, templateValidateResponseDTO.versionUuid) &&
        Objects.equals(this.templateName, templateValidateResponseDTO.templateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateUuid, versionUuid, templateName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateValidateResponseDTO {\n");
    
    sb.append("    templateUuid: ").append(toIndentedString(templateUuid)).append("\n");
    sb.append("    versionUuid: ").append(toIndentedString(versionUuid)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
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
