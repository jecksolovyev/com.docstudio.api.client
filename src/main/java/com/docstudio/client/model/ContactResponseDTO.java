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
 * ContactResponseDTO
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class ContactResponseDTO {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("mailboxUuid")
  private UUID mailboxUuid = null;

  @SerializedName("mailboxName")
  private String mailboxName = null;

  @SerializedName("accountUuid")
  private UUID accountUuid = null;

  public ContactResponseDTO id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * UUID of contact record
   * @return id
  **/
  @Schema(description = "UUID of contact record")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ContactResponseDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Contact name
   * @return name
  **/
  @Schema(description = "Contact name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContactResponseDTO mailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

   /**
   * Contact mailbox uuid
   * @return mailboxUuid
  **/
  @Schema(description = "Contact mailbox uuid")
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }

  public ContactResponseDTO mailboxName(String mailboxName) {
    this.mailboxName = mailboxName;
    return this;
  }

   /**
   * Contact mailbox name
   * @return mailboxName
  **/
  @Schema(description = "Contact mailbox name")
  public String getMailboxName() {
    return mailboxName;
  }

  public void setMailboxName(String mailboxName) {
    this.mailboxName = mailboxName;
  }

  public ContactResponseDTO accountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

   /**
   * Contact mailbox account uuid
   * @return accountUuid
  **/
  @Schema(description = "Contact mailbox account uuid")
  public UUID getAccountUuid() {
    return accountUuid;
  }

  public void setAccountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactResponseDTO contactResponseDTO = (ContactResponseDTO) o;
    return Objects.equals(this.id, contactResponseDTO.id) &&
        Objects.equals(this.name, contactResponseDTO.name) &&
        Objects.equals(this.mailboxUuid, contactResponseDTO.mailboxUuid) &&
        Objects.equals(this.mailboxName, contactResponseDTO.mailboxName) &&
        Objects.equals(this.accountUuid, contactResponseDTO.accountUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, mailboxUuid, mailboxName, accountUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactResponseDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    mailboxName: ").append(toIndentedString(mailboxName)).append("\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
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
