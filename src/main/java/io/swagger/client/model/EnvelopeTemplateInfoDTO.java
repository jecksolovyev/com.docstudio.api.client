/*
 * Centredo Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R74.21
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * Templates
 */
@Schema(description = "Templates")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class EnvelopeTemplateInfoDTO {
  @SerializedName("templateUuid")
  private UUID templateUuid = null;

  @SerializedName("templateName")
  private String templateName = null;

  public EnvelopeTemplateInfoDTO templateUuid(UUID templateUuid) {
    this.templateUuid = templateUuid;
    return this;
  }

   /**
   * Template uuid
   * @return templateUuid
  **/
  @Schema(description = "Template uuid")
  public UUID getTemplateUuid() {
    return templateUuid;
  }

  public void setTemplateUuid(UUID templateUuid) {
    this.templateUuid = templateUuid;
  }

  public EnvelopeTemplateInfoDTO templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Template name
   * @return templateName
  **/
  @Schema(description = "Template name")
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
    EnvelopeTemplateInfoDTO envelopeTemplateInfoDTO = (EnvelopeTemplateInfoDTO) o;
    return Objects.equals(this.templateUuid, envelopeTemplateInfoDTO.templateUuid) &&
        Objects.equals(this.templateName, envelopeTemplateInfoDTO.templateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateUuid, templateName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeTemplateInfoDTO {\n");
    
    sb.append("    templateUuid: ").append(toIndentedString(templateUuid)).append("\n");
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
