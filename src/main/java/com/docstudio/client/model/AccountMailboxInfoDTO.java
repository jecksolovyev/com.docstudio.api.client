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
 * AccountMailboxInfoDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-19T23:56:47.469723923Z[GMT]")

public class AccountMailboxInfoDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("hideNameForAccounts")
  private Boolean hideNameForAccounts = null;

  @SerializedName("usersCount")
  private Long usersCount = null;

  @SerializedName("aliases")
  private List<AliasNameDTO> aliases = null;

  @SerializedName("system")
  private Boolean system = null;

  @SerializedName("delegateTo")
  private UUID delegateTo = null;

  @SerializedName("autoDelegationEnabled")
  private Boolean autoDelegationEnabled = null;

  @SerializedName("autoDelegateUntil")
  private String autoDelegateUntil = null;

  public AccountMailboxInfoDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Mailbox uuid
   * @return uuid
  **/
  @Schema(required = true, description = "Mailbox uuid")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public AccountMailboxInfoDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Mailbox name
   * @return name
  **/
  @Schema(required = true, description = "Mailbox name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountMailboxInfoDTO hideNameForAccounts(Boolean hideNameForAccounts) {
    this.hideNameForAccounts = hideNameForAccounts;
    return this;
  }

   /**
   * Hide mailbox name/aliases from other accounts
   * @return hideNameForAccounts
  **/
  @Schema(description = "Hide mailbox name/aliases from other accounts")
  public Boolean isHideNameForAccounts() {
    return hideNameForAccounts;
  }

  public void setHideNameForAccounts(Boolean hideNameForAccounts) {
    this.hideNameForAccounts = hideNameForAccounts;
  }

  public AccountMailboxInfoDTO usersCount(Long usersCount) {
    this.usersCount = usersCount;
    return this;
  }

   /**
   * Mailbox users count
   * @return usersCount
  **/
  @Schema(description = "Mailbox users count")
  public Long getUsersCount() {
    return usersCount;
  }

  public void setUsersCount(Long usersCount) {
    this.usersCount = usersCount;
  }

  public AccountMailboxInfoDTO aliases(List<AliasNameDTO> aliases) {
    this.aliases = aliases;
    return this;
  }

  public AccountMailboxInfoDTO addAliasesItem(AliasNameDTO aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<AliasNameDTO>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Mailbox aliases
   * @return aliases
  **/
  @Schema(description = "Mailbox aliases")
  public List<AliasNameDTO> getAliases() {
    return aliases;
  }

  public void setAliases(List<AliasNameDTO> aliases) {
    this.aliases = aliases;
  }

  public AccountMailboxInfoDTO system(Boolean system) {
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

  public AccountMailboxInfoDTO delegateTo(UUID delegateTo) {
    this.delegateTo = delegateTo;
    return this;
  }

   /**
   * Auto delegate envelopes to mailbox
   * @return delegateTo
  **/
  @Schema(description = "Auto delegate envelopes to mailbox")
  public UUID getDelegateTo() {
    return delegateTo;
  }

  public void setDelegateTo(UUID delegateTo) {
    this.delegateTo = delegateTo;
  }

  public AccountMailboxInfoDTO autoDelegationEnabled(Boolean autoDelegationEnabled) {
    this.autoDelegationEnabled = autoDelegationEnabled;
    return this;
  }

   /**
   * Auto delegate is enabled
   * @return autoDelegationEnabled
  **/
  @Schema(description = "Auto delegate is enabled")
  public Boolean isAutoDelegationEnabled() {
    return autoDelegationEnabled;
  }

  public void setAutoDelegationEnabled(Boolean autoDelegationEnabled) {
    this.autoDelegationEnabled = autoDelegationEnabled;
  }

  public AccountMailboxInfoDTO autoDelegateUntil(String autoDelegateUntil) {
    this.autoDelegateUntil = autoDelegateUntil;
    return this;
  }

   /**
   * Auto delegate until date
   * @return autoDelegateUntil
  **/
  @Schema(description = "Auto delegate until date")
  public String getAutoDelegateUntil() {
    return autoDelegateUntil;
  }

  public void setAutoDelegateUntil(String autoDelegateUntil) {
    this.autoDelegateUntil = autoDelegateUntil;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountMailboxInfoDTO accountMailboxInfoDTO = (AccountMailboxInfoDTO) o;
    return Objects.equals(this.uuid, accountMailboxInfoDTO.uuid) &&
        Objects.equals(this.name, accountMailboxInfoDTO.name) &&
        Objects.equals(this.hideNameForAccounts, accountMailboxInfoDTO.hideNameForAccounts) &&
        Objects.equals(this.usersCount, accountMailboxInfoDTO.usersCount) &&
        Objects.equals(this.aliases, accountMailboxInfoDTO.aliases) &&
        Objects.equals(this.system, accountMailboxInfoDTO.system) &&
        Objects.equals(this.delegateTo, accountMailboxInfoDTO.delegateTo) &&
        Objects.equals(this.autoDelegationEnabled, accountMailboxInfoDTO.autoDelegationEnabled) &&
        Objects.equals(this.autoDelegateUntil, accountMailboxInfoDTO.autoDelegateUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, hideNameForAccounts, usersCount, aliases, system, delegateTo, autoDelegationEnabled, autoDelegateUntil);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountMailboxInfoDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hideNameForAccounts: ").append(toIndentedString(hideNameForAccounts)).append("\n");
    sb.append("    usersCount: ").append(toIndentedString(usersCount)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    delegateTo: ").append(toIndentedString(delegateTo)).append("\n");
    sb.append("    autoDelegationEnabled: ").append(toIndentedString(autoDelegationEnabled)).append("\n");
    sb.append("    autoDelegateUntil: ").append(toIndentedString(autoDelegateUntil)).append("\n");
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
