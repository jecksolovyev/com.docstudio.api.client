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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * Senders
 */
@Schema(description = "Senders")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class EnvelopeSenderDTO {
  @SerializedName("mailboxUuid")
  private UUID mailboxUuid = null;

  @SerializedName("mailboxName")
  private String mailboxName = null;

  @SerializedName("accountUuid")
  private UUID accountUuid = null;

  @SerializedName("accountName")
  private String accountName = null;

  public EnvelopeSenderDTO mailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

   /**
   * Mailbox uuid
   * @return mailboxUuid
  **/
  @Schema(description = "Mailbox uuid")
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }

  public EnvelopeSenderDTO mailboxName(String mailboxName) {
    this.mailboxName = mailboxName;
    return this;
  }

   /**
   * Mailbox name
   * @return mailboxName
  **/
  @Schema(description = "Mailbox name")
  public String getMailboxName() {
    return mailboxName;
  }

  public void setMailboxName(String mailboxName) {
    this.mailboxName = mailboxName;
  }

  public EnvelopeSenderDTO accountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

   /**
   * Account uuid
   * @return accountUuid
  **/
  @Schema(description = "Account uuid")
  public UUID getAccountUuid() {
    return accountUuid;
  }

  public void setAccountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
  }

  public EnvelopeSenderDTO accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Account name
   * @return accountName
  **/
  @Schema(description = "Account name")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeSenderDTO envelopeSenderDTO = (EnvelopeSenderDTO) o;
    return Objects.equals(this.mailboxUuid, envelopeSenderDTO.mailboxUuid) &&
        Objects.equals(this.mailboxName, envelopeSenderDTO.mailboxName) &&
        Objects.equals(this.accountUuid, envelopeSenderDTO.accountUuid) &&
        Objects.equals(this.accountName, envelopeSenderDTO.accountName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailboxUuid, mailboxName, accountUuid, accountName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeSenderDTO {\n");
    
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    mailboxName: ").append(toIndentedString(mailboxName)).append("\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
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
