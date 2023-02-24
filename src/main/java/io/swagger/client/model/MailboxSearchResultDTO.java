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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * MailboxSearchResultDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class MailboxSearchResultDTO {
  @SerializedName("mailboxName")
  private String mailboxName = null;

  @SerializedName("mailboxUuid")
  private UUID mailboxUuid = null;

  @SerializedName("alias")
  private String alias = null;

  @SerializedName("accountUuid")
  private UUID accountUuid = null;

  @SerializedName("inContacts")
  private Boolean inContacts = null;

  public MailboxSearchResultDTO mailboxName(String mailboxName) {
    this.mailboxName = mailboxName;
    return this;
  }

   /**
   * Mailbox Name
   * @return mailboxName
  **/
  @Schema(description = "Mailbox Name")
  public String getMailboxName() {
    return mailboxName;
  }

  public void setMailboxName(String mailboxName) {
    this.mailboxName = mailboxName;
  }

  public MailboxSearchResultDTO mailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

   /**
   * Mailbox UUID
   * @return mailboxUuid
  **/
  @Schema(description = "Mailbox UUID")
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }

  public MailboxSearchResultDTO alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Mailbox Alias/Contact Name
   * @return alias
  **/
  @Schema(description = "Mailbox Alias/Contact Name")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public MailboxSearchResultDTO accountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

   /**
   * Mailbox Account UUID
   * @return accountUuid
  **/
  @Schema(description = "Mailbox Account UUID")
  public UUID getAccountUuid() {
    return accountUuid;
  }

  public void setAccountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
  }

  public MailboxSearchResultDTO inContacts(Boolean inContacts) {
    this.inContacts = inContacts;
    return this;
  }

   /**
   * Presence of mailbox in contacts
   * @return inContacts
  **/
  @Schema(description = "Presence of mailbox in contacts")
  public Boolean isInContacts() {
    return inContacts;
  }

  public void setInContacts(Boolean inContacts) {
    this.inContacts = inContacts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailboxSearchResultDTO mailboxSearchResultDTO = (MailboxSearchResultDTO) o;
    return Objects.equals(this.mailboxName, mailboxSearchResultDTO.mailboxName) &&
        Objects.equals(this.mailboxUuid, mailboxSearchResultDTO.mailboxUuid) &&
        Objects.equals(this.alias, mailboxSearchResultDTO.alias) &&
        Objects.equals(this.accountUuid, mailboxSearchResultDTO.accountUuid) &&
        Objects.equals(this.inContacts, mailboxSearchResultDTO.inContacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailboxName, mailboxUuid, alias, accountUuid, inContacts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailboxSearchResultDTO {\n");
    
    sb.append("    mailboxName: ").append(toIndentedString(mailboxName)).append("\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
    sb.append("    inContacts: ").append(toIndentedString(inContacts)).append("\n");
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