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
/**
 * Mailboxes roles and permissions
 */
@Schema(description = "Mailboxes roles and permissions")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-19T23:56:47.469723923Z[GMT]")

public class PermissionsWithUuidDTO {
  @SerializedName("permissions")
  private List<Integer> permissions = null;

  @SerializedName("roles")
  private List<UUID> roles = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  public PermissionsWithUuidDTO permissions(List<Integer> permissions) {
    this.permissions = permissions;
    return this;
  }

  public PermissionsWithUuidDTO addPermissionsItem(Integer permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<Integer>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
  public List<Integer> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Integer> permissions) {
    this.permissions = permissions;
  }

  public PermissionsWithUuidDTO roles(List<UUID> roles) {
    this.roles = roles;
    return this;
  }

  public PermissionsWithUuidDTO addRolesItem(UUID rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<UUID>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Schema(description = "")
  public List<UUID> getRoles() {
    return roles;
  }

  public void setRoles(List<UUID> roles) {
    this.roles = roles;
  }

  public PermissionsWithUuidDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of mailbox or account
   * @return uuid
  **/
  @Schema(required = true, description = "UUID of mailbox or account")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionsWithUuidDTO permissionsWithUuidDTO = (PermissionsWithUuidDTO) o;
    return Objects.equals(this.permissions, permissionsWithUuidDTO.permissions) &&
        Objects.equals(this.roles, permissionsWithUuidDTO.roles) &&
        Objects.equals(this.uuid, permissionsWithUuidDTO.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, roles, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionsWithUuidDTO {\n");
    
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
