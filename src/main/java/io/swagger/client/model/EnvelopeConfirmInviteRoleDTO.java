/*
 * Centredo Api Documentation
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
 * Confirmed mailboxes to roles
 */
@Schema(description = "Confirmed mailboxes to roles")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class EnvelopeConfirmInviteRoleDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("mailboxUuid")
  private UUID mailboxUuid = null;

  public EnvelopeConfirmInviteRoleDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Role id
   * @return id
  **/
  @Schema(required = true, description = "Role id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EnvelopeConfirmInviteRoleDTO mailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

   /**
   * UUID of mailbox assigned to role
   * @return mailboxUuid
  **/
  @Schema(required = true, description = "UUID of mailbox assigned to role")
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeConfirmInviteRoleDTO envelopeConfirmInviteRoleDTO = (EnvelopeConfirmInviteRoleDTO) o;
    return Objects.equals(this.id, envelopeConfirmInviteRoleDTO.id) &&
        Objects.equals(this.mailboxUuid, envelopeConfirmInviteRoleDTO.mailboxUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mailboxUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeConfirmInviteRoleDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
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
