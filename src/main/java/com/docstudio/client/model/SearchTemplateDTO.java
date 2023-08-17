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
import org.threeten.bp.OffsetDateTime;
/**
 * Data records
 */
@Schema(description = "Data records")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class SearchTemplateDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("mailboxUuid")
  private UUID mailboxUuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Template access level
   */
  @JsonAdapter(AccessEnum.Adapter.class)
  public enum AccessEnum {
    @SerializedName("mailbox")
    MAILBOX("mailbox"),
    @SerializedName("account")
    ACCOUNT("account"),
    @SerializedName("pub")
    PUB("pub"),
    @SerializedName("official")
    OFFICIAL("official"),
    @SerializedName("shared")
    SHARED("shared");

    private String value;

    AccessEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AccessEnum fromValue(String input) {
      for (AccessEnum b : AccessEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AccessEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AccessEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AccessEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("access")
  private AccessEnum access = null;

  @SerializedName("categories")
  private List<Long> categories = null;

  @SerializedName("sharedCategories")
  private List<Long> sharedCategories = null;

  @SerializedName("sharedTo")
  private List<UUID> sharedTo = null;

  @SerializedName("logoImageUuid")
  private UUID logoImageUuid = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  public SearchTemplateDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Template UUID
   * @return uuid
  **/
  @Schema(required = true, description = "Template UUID")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public SearchTemplateDTO mailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

   /**
   * Template owner mailbox UUID
   * @return mailboxUuid
  **/
  @Schema(required = true, description = "Template owner mailbox UUID")
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }

  public SearchTemplateDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Template name
   * @return name
  **/
  @Schema(required = true, description = "Template name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SearchTemplateDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Template description
   * @return description
  **/
  @Schema(required = true, description = "Template description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SearchTemplateDTO access(AccessEnum access) {
    this.access = access;
    return this;
  }

   /**
   * Template access level
   * @return access
  **/
  @Schema(description = "Template access level")
  public AccessEnum getAccess() {
    return access;
  }

  public void setAccess(AccessEnum access) {
    this.access = access;
  }

  public SearchTemplateDTO categories(List<Long> categories) {
    this.categories = categories;
    return this;
  }

  public SearchTemplateDTO addCategoriesItem(Long categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<Long>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Template categories
   * @return categories
  **/
  @Schema(description = "Template categories")
  public List<Long> getCategories() {
    return categories;
  }

  public void setCategories(List<Long> categories) {
    this.categories = categories;
  }

  public SearchTemplateDTO sharedCategories(List<Long> sharedCategories) {
    this.sharedCategories = sharedCategories;
    return this;
  }

  public SearchTemplateDTO addSharedCategoriesItem(Long sharedCategoriesItem) {
    if (this.sharedCategories == null) {
      this.sharedCategories = new ArrayList<Long>();
    }
    this.sharedCategories.add(sharedCategoriesItem);
    return this;
  }

   /**
   * Template shared categories
   * @return sharedCategories
  **/
  @Schema(description = "Template shared categories")
  public List<Long> getSharedCategories() {
    return sharedCategories;
  }

  public void setSharedCategories(List<Long> sharedCategories) {
    this.sharedCategories = sharedCategories;
  }

  public SearchTemplateDTO sharedTo(List<UUID> sharedTo) {
    this.sharedTo = sharedTo;
    return this;
  }

  public SearchTemplateDTO addSharedToItem(UUID sharedToItem) {
    if (this.sharedTo == null) {
      this.sharedTo = new ArrayList<UUID>();
    }
    this.sharedTo.add(sharedToItem);
    return this;
  }

   /**
   * Mailboxes to which template is shared to
   * @return sharedTo
  **/
  @Schema(description = "Mailboxes to which template is shared to")
  public List<UUID> getSharedTo() {
    return sharedTo;
  }

  public void setSharedTo(List<UUID> sharedTo) {
    this.sharedTo = sharedTo;
  }

  public SearchTemplateDTO logoImageUuid(UUID logoImageUuid) {
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

  public SearchTemplateDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date of Template creation
   * @return createdAt
  **/
  @Schema(description = "Date of Template creation")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTemplateDTO searchTemplateDTO = (SearchTemplateDTO) o;
    return Objects.equals(this.uuid, searchTemplateDTO.uuid) &&
        Objects.equals(this.mailboxUuid, searchTemplateDTO.mailboxUuid) &&
        Objects.equals(this.name, searchTemplateDTO.name) &&
        Objects.equals(this.description, searchTemplateDTO.description) &&
        Objects.equals(this.access, searchTemplateDTO.access) &&
        Objects.equals(this.categories, searchTemplateDTO.categories) &&
        Objects.equals(this.sharedCategories, searchTemplateDTO.sharedCategories) &&
        Objects.equals(this.sharedTo, searchTemplateDTO.sharedTo) &&
        Objects.equals(this.logoImageUuid, searchTemplateDTO.logoImageUuid) &&
        Objects.equals(this.createdAt, searchTemplateDTO.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, mailboxUuid, name, description, access, categories, sharedCategories, sharedTo, logoImageUuid, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTemplateDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    sharedCategories: ").append(toIndentedString(sharedCategories)).append("\n");
    sb.append("    sharedTo: ").append(toIndentedString(sharedTo)).append("\n");
    sb.append("    logoImageUuid: ").append(toIndentedString(logoImageUuid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
