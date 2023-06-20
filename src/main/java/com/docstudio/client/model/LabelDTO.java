/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R82.8
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
 * Label to save
 */
@Schema(description = "Label to save")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-19T23:56:47.469723923Z[GMT]")

public class LabelDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("colorText")
  private String colorText = null;

  @SerializedName("colorBg")
  private String colorBg = null;

  public LabelDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of Label. Only for entity read from server.
   * @return uuid
  **/
  @Schema(description = "UUID of Label. Only for entity read from server.")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public LabelDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Label name
   * @return name
  **/
  @Schema(description = "Label name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LabelDTO colorText(String colorText) {
    this.colorText = colorText;
    return this;
  }

   /**
   * Label text color, hex, 6 symbols
   * @return colorText
  **/
  @Schema(required = true, description = "Label text color, hex, 6 symbols")
  public String getColorText() {
    return colorText;
  }

  public void setColorText(String colorText) {
    this.colorText = colorText;
  }

  public LabelDTO colorBg(String colorBg) {
    this.colorBg = colorBg;
    return this;
  }

   /**
   * Label background color, hex, 6 symbols
   * @return colorBg
  **/
  @Schema(required = true, description = "Label background color, hex, 6 symbols")
  public String getColorBg() {
    return colorBg;
  }

  public void setColorBg(String colorBg) {
    this.colorBg = colorBg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelDTO labelDTO = (LabelDTO) o;
    return Objects.equals(this.uuid, labelDTO.uuid) &&
        Objects.equals(this.name, labelDTO.name) &&
        Objects.equals(this.colorText, labelDTO.colorText) &&
        Objects.equals(this.colorBg, labelDTO.colorBg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, colorText, colorBg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    colorText: ").append(toIndentedString(colorText)).append("\n");
    sb.append("    colorBg: ").append(toIndentedString(colorBg)).append("\n");
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
