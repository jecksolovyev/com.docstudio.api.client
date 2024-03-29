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
import org.threeten.bp.OffsetDateTime;
/**
 * MailboxAccountSimpleDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class MailboxAccountSimpleDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("permissions")
  private List<UserPermissionDTO> permissions = null;

  public MailboxAccountSimpleDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Mailbox UUID
   * @return uuid
  **/
  @Schema(description = "Mailbox UUID")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public MailboxAccountSimpleDTO name(String name) {
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

  public MailboxAccountSimpleDTO createdAt(OffsetDateTime createdAt) {
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

  public MailboxAccountSimpleDTO permissions(List<UserPermissionDTO> permissions) {
    this.permissions = permissions;
    return this;
  }

  public MailboxAccountSimpleDTO addPermissionsItem(UserPermissionDTO permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<UserPermissionDTO>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
  public List<UserPermissionDTO> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<UserPermissionDTO> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailboxAccountSimpleDTO mailboxAccountSimpleDTO = (MailboxAccountSimpleDTO) o;
    return Objects.equals(this.uuid, mailboxAccountSimpleDTO.uuid) &&
        Objects.equals(this.name, mailboxAccountSimpleDTO.name) &&
        Objects.equals(this.createdAt, mailboxAccountSimpleDTO.createdAt) &&
        Objects.equals(this.permissions, mailboxAccountSimpleDTO.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, createdAt, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailboxAccountSimpleDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
