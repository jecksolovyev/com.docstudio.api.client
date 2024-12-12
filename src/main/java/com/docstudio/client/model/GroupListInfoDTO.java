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
import org.threeten.bp.OffsetDateTime;
/**
 * Data records
 */
@Schema(description = "Data records")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class GroupListInfoDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("mailboxesCount")
  private Long mailboxesCount = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("modifiedAt")
  private OffsetDateTime modifiedAt = null;

  public GroupListInfoDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Group id
   * @return uuid
  **/
  @Schema(description = "Group id")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public GroupListInfoDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Group name
   * @return name
  **/
  @Schema(description = "Group name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GroupListInfoDTO mailboxesCount(Long mailboxesCount) {
    this.mailboxesCount = mailboxesCount;
    return this;
  }

   /**
   * Group mailboxes count
   * @return mailboxesCount
  **/
  @Schema(description = "Group mailboxes count")
  public Long getMailboxesCount() {
    return mailboxesCount;
  }

  public void setMailboxesCount(Long mailboxesCount) {
    this.mailboxesCount = mailboxesCount;
  }

  public GroupListInfoDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Created at
   * @return createdAt
  **/
  @Schema(description = "Created at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public GroupListInfoDTO modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Modified at
   * @return modifiedAt
  **/
  @Schema(description = "Modified at")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupListInfoDTO groupListInfoDTO = (GroupListInfoDTO) o;
    return Objects.equals(this.uuid, groupListInfoDTO.uuid) &&
        Objects.equals(this.name, groupListInfoDTO.name) &&
        Objects.equals(this.mailboxesCount, groupListInfoDTO.mailboxesCount) &&
        Objects.equals(this.createdAt, groupListInfoDTO.createdAt) &&
        Objects.equals(this.modifiedAt, groupListInfoDTO.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, mailboxesCount, createdAt, modifiedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupListInfoDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mailboxesCount: ").append(toIndentedString(mailboxesCount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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
