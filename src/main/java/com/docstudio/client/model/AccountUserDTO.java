/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R120.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.docstudio.client.model.RoleShortDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * AccountUserDTO
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class AccountUserDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("permissions")
  private List<Integer> permissions = null;

  @SerializedName("roles")
  private List<RoleShortDTO> roles = null;

  public AccountUserDTO uuid(UUID uuid) {
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

  public AccountUserDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @Schema(description = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public AccountUserDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public AccountUserDTO permissions(List<Integer> permissions) {
    this.permissions = permissions;
    return this;
  }

  public AccountUserDTO addPermissionsItem(Integer permissionsItem) {
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

  public AccountUserDTO roles(List<RoleShortDTO> roles) {
    this.roles = roles;
    return this;
  }

  public AccountUserDTO addRolesItem(RoleShortDTO rolesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUserDTO accountUserDTO = (AccountUserDTO) o;
    return Objects.equals(this.uuid, accountUserDTO.uuid) &&
        Objects.equals(this.firstName, accountUserDTO.firstName) &&
        Objects.equals(this.lastName, accountUserDTO.lastName) &&
        Objects.equals(this.permissions, accountUserDTO.permissions) &&
        Objects.equals(this.roles, accountUserDTO.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, firstName, lastName, permissions, roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUserDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
