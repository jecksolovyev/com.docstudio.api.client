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
/**
 * UserAuthorizationDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-19T23:56:47.469723923Z[GMT]")

public class UserAuthorizationDTO {
  @SerializedName("roles")
  private List<RoleShortDTO> roles = null;

  @SerializedName("permissions")
  private List<Integer> permissions = null;

  public UserAuthorizationDTO roles(List<RoleShortDTO> roles) {
    this.roles = roles;
    return this;
  }

  public UserAuthorizationDTO addRolesItem(RoleShortDTO rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<RoleShortDTO>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Schema(description = "")
  public List<RoleShortDTO> getRoles() {
    return roles;
  }

  public void setRoles(List<RoleShortDTO> roles) {
    this.roles = roles;
  }

  public UserAuthorizationDTO permissions(List<Integer> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UserAuthorizationDTO addPermissionsItem(Integer permissionsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAuthorizationDTO userAuthorizationDTO = (UserAuthorizationDTO) o;
    return Objects.equals(this.roles, userAuthorizationDTO.roles) &&
        Objects.equals(this.permissions, userAuthorizationDTO.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthorizationDTO {\n");
    
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
