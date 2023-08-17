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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * DeleteEnvColumnDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class DeleteEnvColumnDTO {
  @SerializedName("extraFieldUuids")
  private List<UUID> extraFieldUuids = new ArrayList<UUID>();

  public DeleteEnvColumnDTO extraFieldUuids(List<UUID> extraFieldUuids) {
    this.extraFieldUuids = extraFieldUuids;
    return this;
  }

  public DeleteEnvColumnDTO addExtraFieldUuidsItem(UUID extraFieldUuidsItem) {
    this.extraFieldUuids.add(extraFieldUuidsItem);
    return this;
  }

   /**
   * Get extraFieldUuids
   * @return extraFieldUuids
  **/
  @Schema(required = true, description = "")
  public List<UUID> getExtraFieldUuids() {
    return extraFieldUuids;
  }

  public void setExtraFieldUuids(List<UUID> extraFieldUuids) {
    this.extraFieldUuids = extraFieldUuids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteEnvColumnDTO deleteEnvColumnDTO = (DeleteEnvColumnDTO) o;
    return Objects.equals(this.extraFieldUuids, deleteEnvColumnDTO.extraFieldUuids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraFieldUuids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteEnvColumnDTO {\n");
    
    sb.append("    extraFieldUuids: ").append(toIndentedString(extraFieldUuids)).append("\n");
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
