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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * RecommendedTemplateResponseDTO
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class RecommendedTemplateResponseDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("logoImageUuid")
  private UUID logoImageUuid = null;

  @SerializedName("mailboxUuid")
  private UUID mailboxUuid = null;

  @SerializedName("sharedTo")
  private List<UUID> sharedTo = null;

  @SerializedName("sharedToMailboxGroups")
  private List<UUID> sharedToMailboxGroups = null;

  public RecommendedTemplateResponseDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Template UUID
   * @return uuid
  **/
  @Schema(description = "Template UUID")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public RecommendedTemplateResponseDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Template name
   * @return name
  **/
  @Schema(description = "Template name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RecommendedTemplateResponseDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Template description
   * @return description
  **/
  @Schema(description = "Template description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RecommendedTemplateResponseDTO logoImageUuid(UUID logoImageUuid) {
    this.logoImageUuid = logoImageUuid;
    return this;
  }

   /**
   * UUID of the template logo image
   * @return logoImageUuid
  **/
  @Schema(description = "UUID of the template logo image")
  public UUID getLogoImageUuid() {
    return logoImageUuid;
  }

  public void setLogoImageUuid(UUID logoImageUuid) {
    this.logoImageUuid = logoImageUuid;
  }

  public RecommendedTemplateResponseDTO mailboxUuid(UUID mailboxUuid) {
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

  public RecommendedTemplateResponseDTO sharedTo(List<UUID> sharedTo) {
    this.sharedTo = sharedTo;
    return this;
  }

  public RecommendedTemplateResponseDTO addSharedToItem(UUID sharedToItem) {
    if (this.sharedTo == null) {
      this.sharedTo = new ArrayList<UUID>();
    }
    this.sharedTo.add(sharedToItem);
    return this;
  }

   /**
   * Get sharedTo
   * @return sharedTo
  **/
  @Schema(description = "")
  public List<UUID> getSharedTo() {
    return sharedTo;
  }

  public void setSharedTo(List<UUID> sharedTo) {
    this.sharedTo = sharedTo;
  }

  public RecommendedTemplateResponseDTO sharedToMailboxGroups(List<UUID> sharedToMailboxGroups) {
    this.sharedToMailboxGroups = sharedToMailboxGroups;
    return this;
  }

  public RecommendedTemplateResponseDTO addSharedToMailboxGroupsItem(UUID sharedToMailboxGroupsItem) {
    if (this.sharedToMailboxGroups == null) {
      this.sharedToMailboxGroups = new ArrayList<UUID>();
    }
    this.sharedToMailboxGroups.add(sharedToMailboxGroupsItem);
    return this;
  }

   /**
   * Get sharedToMailboxGroups
   * @return sharedToMailboxGroups
  **/
  @Schema(description = "")
  public List<UUID> getSharedToMailboxGroups() {
    return sharedToMailboxGroups;
  }

  public void setSharedToMailboxGroups(List<UUID> sharedToMailboxGroups) {
    this.sharedToMailboxGroups = sharedToMailboxGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendedTemplateResponseDTO recommendedTemplateResponseDTO = (RecommendedTemplateResponseDTO) o;
    return Objects.equals(this.uuid, recommendedTemplateResponseDTO.uuid) &&
        Objects.equals(this.name, recommendedTemplateResponseDTO.name) &&
        Objects.equals(this.description, recommendedTemplateResponseDTO.description) &&
        Objects.equals(this.logoImageUuid, recommendedTemplateResponseDTO.logoImageUuid) &&
        Objects.equals(this.mailboxUuid, recommendedTemplateResponseDTO.mailboxUuid) &&
        Objects.equals(this.sharedTo, recommendedTemplateResponseDTO.sharedTo) &&
        Objects.equals(this.sharedToMailboxGroups, recommendedTemplateResponseDTO.sharedToMailboxGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, description, logoImageUuid, mailboxUuid, sharedTo, sharedToMailboxGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendedTemplateResponseDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logoImageUuid: ").append(toIndentedString(logoImageUuid)).append("\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    sharedTo: ").append(toIndentedString(sharedTo)).append("\n");
    sb.append("    sharedToMailboxGroups: ").append(toIndentedString(sharedToMailboxGroups)).append("\n");
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
