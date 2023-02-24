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
 * User accounts belongs to
 */
@Schema(description = "User accounts belongs to")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class User2AccountWithMailboxesDTO {
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

  public User2AccountWithMailboxesDTO uuid(UUID uuid) {
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

  public User2AccountWithMailboxesDTO name(String name) {
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

  public User2AccountWithMailboxesDTO system(Boolean system) {
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

  public User2AccountWithMailboxesDTO permissions(List<Integer> permissions) {
    this.permissions = permissions;
    return this;
  }

  public User2AccountWithMailboxesDTO addPermissionsItem(Integer permissionsItem) {
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

  public User2AccountWithMailboxesDTO mailboxes(List<MailboxProfileDTO> mailboxes) {
    this.mailboxes = mailboxes;
    return this;
  }

  public User2AccountWithMailboxesDTO addMailboxesItem(MailboxProfileDTO mailboxesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User2AccountWithMailboxesDTO user2AccountWithMailboxesDTO = (User2AccountWithMailboxesDTO) o;
    return Objects.equals(this.uuid, user2AccountWithMailboxesDTO.uuid) &&
        Objects.equals(this.name, user2AccountWithMailboxesDTO.name) &&
        Objects.equals(this.system, user2AccountWithMailboxesDTO.system) &&
        Objects.equals(this.permissions, user2AccountWithMailboxesDTO.permissions) &&
        Objects.equals(this.mailboxes, user2AccountWithMailboxesDTO.mailboxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, system, permissions, mailboxes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User2AccountWithMailboxesDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    mailboxes: ").append(toIndentedString(mailboxes)).append("\n");
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
