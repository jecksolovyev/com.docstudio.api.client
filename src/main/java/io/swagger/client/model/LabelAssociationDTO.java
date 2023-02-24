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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * LabelAssociationDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class LabelAssociationDTO {
  @SerializedName("labelName")
  private String labelName = null;

  @SerializedName("labelUuid")
  private UUID labelUuid = null;

  @SerializedName("envelopes")
  private List<UUID> envelopes = new ArrayList<UUID>();

  public LabelAssociationDTO labelName(String labelName) {
    this.labelName = labelName;
    return this;
  }

   /**
   * Name of label to assign
   * @return labelName
  **/
  @Schema(description = "Name of label to assign")
  public String getLabelName() {
    return labelName;
  }

  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }

  public LabelAssociationDTO labelUuid(UUID labelUuid) {
    this.labelUuid = labelUuid;
    return this;
  }

   /**
   * UUID of label to assign
   * @return labelUuid
  **/
  @Schema(description = "UUID of label to assign")
  public UUID getLabelUuid() {
    return labelUuid;
  }

  public void setLabelUuid(UUID labelUuid) {
    this.labelUuid = labelUuid;
  }

  public LabelAssociationDTO envelopes(List<UUID> envelopes) {
    this.envelopes = envelopes;
    return this;
  }

  public LabelAssociationDTO addEnvelopesItem(UUID envelopesItem) {
    this.envelopes.add(envelopesItem);
    return this;
  }

   /**
   * Get envelopes
   * @return envelopes
  **/
  @Schema(required = true, description = "")
  public List<UUID> getEnvelopes() {
    return envelopes;
  }

  public void setEnvelopes(List<UUID> envelopes) {
    this.envelopes = envelopes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelAssociationDTO labelAssociationDTO = (LabelAssociationDTO) o;
    return Objects.equals(this.labelName, labelAssociationDTO.labelName) &&
        Objects.equals(this.labelUuid, labelAssociationDTO.labelUuid) &&
        Objects.equals(this.envelopes, labelAssociationDTO.envelopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelName, labelUuid, envelopes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelAssociationDTO {\n");
    
    sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
    sb.append("    labelUuid: ").append(toIndentedString(labelUuid)).append("\n");
    sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
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
