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

import java.util.UUID;
/**
 * User2MailboxDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class User2MailboxDTO {
  @SerializedName("mailboxUuid")
  private UUID mailboxUuid = null;

  @SerializedName("userUuid")
  private UUID userUuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("accountUuid")
  private UUID accountUuid = null;

  @SerializedName("accountName")
  private String accountName = null;

  @SerializedName("authorization")
  private UserAuthorizationDTO authorization = null;

  public User2MailboxDTO mailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

   /**
   * Get mailboxUuid
   * @return mailboxUuid
  **/
  @Schema(description = "")
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }

  public User2MailboxDTO userUuid(UUID userUuid) {
    this.userUuid = userUuid;
    return this;
  }

   /**
   * Get userUuid
   * @return userUuid
  **/
  @Schema(description = "")
  public UUID getUserUuid() {
    return userUuid;
  }

  public void setUserUuid(UUID userUuid) {
    this.userUuid = userUuid;
  }

  public User2MailboxDTO name(String name) {
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

  public User2MailboxDTO accountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

   /**
   * Get accountUuid
   * @return accountUuid
  **/
  @Schema(description = "")
  public UUID getAccountUuid() {
    return accountUuid;
  }

  public void setAccountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
  }

  public User2MailboxDTO accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @Schema(description = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public User2MailboxDTO authorization(UserAuthorizationDTO authorization) {
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @Schema(description = "")
  public UserAuthorizationDTO getAuthorization() {
    return authorization;
  }

  public void setAuthorization(UserAuthorizationDTO authorization) {
    this.authorization = authorization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User2MailboxDTO user2MailboxDTO = (User2MailboxDTO) o;
    return Objects.equals(this.mailboxUuid, user2MailboxDTO.mailboxUuid) &&
        Objects.equals(this.userUuid, user2MailboxDTO.userUuid) &&
        Objects.equals(this.name, user2MailboxDTO.name) &&
        Objects.equals(this.accountUuid, user2MailboxDTO.accountUuid) &&
        Objects.equals(this.accountName, user2MailboxDTO.accountName) &&
        Objects.equals(this.authorization, user2MailboxDTO.authorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailboxUuid, userUuid, name, accountUuid, accountName, authorization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User2MailboxDTO {\n");
    
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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
