/*
 * Docstudio Api Documentation
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
import io.swagger.client.model.MailboxProfileDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * Data records
 */
@Schema(description = "Data records")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class UserInvitationDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("system")
  private Boolean system = null;

  @SerializedName("permissions")
  private List<Integer> permissions = null;

  @SerializedName("mailboxes")
  private List<MailboxProfileDTO> mailboxes = null;

  @SerializedName("code")
  private String code = null;

  public UserInvitationDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Account UUID
   * @return uuid
  **/
  @Schema(description = "Account UUID")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public UserInvitationDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Account Name
   * @return name
  **/
  @Schema(description = "Account Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserInvitationDTO system(Boolean system) {
    this.system = system;
    return this;
  }

   /**
   * Get system
   * @return system
  **/
  @Schema(description = "")
  public Boolean isSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }

  public UserInvitationDTO permissions(List<Integer> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UserInvitationDTO addPermissionsItem(Integer permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<Integer>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Permissions for current user
   * @return permissions
  **/
  @Schema(description = "Permissions for current user")
  public List<Integer> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Integer> permissions) {
    this.permissions = permissions;
  }

  public UserInvitationDTO mailboxes(List<MailboxProfileDTO> mailboxes) {
    this.mailboxes = mailboxes;
    return this;
  }

  public UserInvitationDTO addMailboxesItem(MailboxProfileDTO mailboxesItem) {
    if (this.mailboxes == null) {
      this.mailboxes = new ArrayList<MailboxProfileDTO>();
    }
    this.mailboxes.add(mailboxesItem);
    return this;
  }

   /**
   * Mailboxes linked to this account
   * @return mailboxes
  **/
  @Schema(description = "Mailboxes linked to this account")
  public List<MailboxProfileDTO> getMailboxes() {
    return mailboxes;
  }

  public void setMailboxes(List<MailboxProfileDTO> mailboxes) {
    this.mailboxes = mailboxes;
  }

  public UserInvitationDTO code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Invitation code
   * @return code
  **/
  @Schema(description = "Invitation code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInvitationDTO userInvitationDTO = (UserInvitationDTO) o;
    return Objects.equals(this.uuid, userInvitationDTO.uuid) &&
        Objects.equals(this.name, userInvitationDTO.name) &&
        Objects.equals(this.system, userInvitationDTO.system) &&
        Objects.equals(this.permissions, userInvitationDTO.permissions) &&
        Objects.equals(this.mailboxes, userInvitationDTO.mailboxes) &&
        Objects.equals(this.code, userInvitationDTO.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, system, permissions, mailboxes, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInvitationDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    mailboxes: ").append(toIndentedString(mailboxes)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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