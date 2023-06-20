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

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
/**
 * MailboxSimpleDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-19T23:56:47.469723923Z[GMT]")

public class MailboxSimpleDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("userPermissions")
  private List<UserPermissionDTO> userPermissions = null;

  public MailboxSimpleDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MailboxSimpleDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public MailboxSimpleDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public MailboxSimpleDTO userPermissions(List<UserPermissionDTO> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  public MailboxSimpleDTO addUserPermissionsItem(UserPermissionDTO userPermissionsItem) {
    if (this.userPermissions == null) {
      this.userPermissions = new ArrayList<UserPermissionDTO>();
    }
    this.userPermissions.add(userPermissionsItem);
    return this;
  }

   /**
   * Get userPermissions
   * @return userPermissions
  **/
  @Schema(description = "")
  public List<UserPermissionDTO> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<UserPermissionDTO> userPermissions) {
    this.userPermissions = userPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailboxSimpleDTO mailboxSimpleDTO = (MailboxSimpleDTO) o;
    return Objects.equals(this.name, mailboxSimpleDTO.name) &&
        Objects.equals(this.createdAt, mailboxSimpleDTO.createdAt) &&
        Objects.equals(this.uuid, mailboxSimpleDTO.uuid) &&
        Objects.equals(this.userPermissions, mailboxSimpleDTO.userPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, createdAt, uuid, userPermissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailboxSimpleDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
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
