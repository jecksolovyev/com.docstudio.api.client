/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R86.31
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
 * FullTemplateResponseDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-14T22:02:04.375144579Z[GMT]")

public class FullTemplateResponseDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("data")
  private String data = null;

  @SerializedName("version")
  private UUID version = null;

  @SerializedName("dataCreatedAt")
  private OffsetDateTime dataCreatedAt = null;

  @SerializedName("dataModifiedAt")
  private OffsetDateTime dataModifiedAt = null;

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

  @SerializedName("mailbox")
  private UUID mailbox = null;

  @SerializedName("archive")
  private Boolean archive = null;

  @SerializedName("newEnvelopeCanBeCreated")
  private Boolean newEnvelopeCanBeCreated = null;

  @SerializedName("defaultDownloadOptions")
  private Boolean defaultDownloadOptions = null;

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

  @SerializedName("modifiedAt")
  private OffsetDateTime modifiedAt = null;

  public FullTemplateResponseDTO uuid(UUID uuid) {
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

  public FullTemplateResponseDTO name(String name) {
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

  public FullTemplateResponseDTO description(String description) {
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

  public FullTemplateResponseDTO data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Template data
   * @return data
  **/
  @Schema(description = "Template data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public FullTemplateResponseDTO version(UUID version) {
    this.version = version;
    return this;
  }

   /**
   * Template version
   * @return version
  **/
  @Schema(description = "Template version")
  public UUID getVersion() {
    return version;
  }

  public void setVersion(UUID version) {
    this.version = version;
  }

  public FullTemplateResponseDTO dataCreatedAt(OffsetDateTime dataCreatedAt) {
    this.dataCreatedAt = dataCreatedAt;
    return this;
  }

   /**
   * Template data create date
   * @return dataCreatedAt
  **/
  @Schema(description = "Template data create date")
  public OffsetDateTime getDataCreatedAt() {
    return dataCreatedAt;
  }

  public void setDataCreatedAt(OffsetDateTime dataCreatedAt) {
    this.dataCreatedAt = dataCreatedAt;
  }

  public FullTemplateResponseDTO dataModifiedAt(OffsetDateTime dataModifiedAt) {
    this.dataModifiedAt = dataModifiedAt;
    return this;
  }

   /**
   * Template data update date
   * @return dataModifiedAt
  **/
  @Schema(description = "Template data update date")
  public OffsetDateTime getDataModifiedAt() {
    return dataModifiedAt;
  }

  public void setDataModifiedAt(OffsetDateTime dataModifiedAt) {
    this.dataModifiedAt = dataModifiedAt;
  }

  public FullTemplateResponseDTO access(AccessEnum access) {
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

  public FullTemplateResponseDTO mailbox(UUID mailbox) {
    this.mailbox = mailbox;
    return this;
  }

   /**
   * Template creator&#x27;s mailbox
   * @return mailbox
  **/
  @Schema(description = "Template creator's mailbox")
  public UUID getMailbox() {
    return mailbox;
  }

  public void setMailbox(UUID mailbox) {
    this.mailbox = mailbox;
  }

  public FullTemplateResponseDTO archive(Boolean archive) {
    this.archive = archive;
    return this;
  }

   /**
   * Template archived
   * @return archive
  **/
  @Schema(description = "Template archived")
  public Boolean isArchive() {
    return archive;
  }

  public void setArchive(Boolean archive) {
    this.archive = archive;
  }

  public FullTemplateResponseDTO newEnvelopeCanBeCreated(Boolean newEnvelopeCanBeCreated) {
    this.newEnvelopeCanBeCreated = newEnvelopeCanBeCreated;
    return this;
  }

   /**
   * Returns a flag whether a new envelope can be created using this template
   * @return newEnvelopeCanBeCreated
  **/
  @Schema(description = "Returns a flag whether a new envelope can be created using this template")
  public Boolean isNewEnvelopeCanBeCreated() {
    return newEnvelopeCanBeCreated;
  }

  public void setNewEnvelopeCanBeCreated(Boolean newEnvelopeCanBeCreated) {
    this.newEnvelopeCanBeCreated = newEnvelopeCanBeCreated;
  }

  public FullTemplateResponseDTO defaultDownloadOptions(Boolean defaultDownloadOptions) {
    this.defaultDownloadOptions = defaultDownloadOptions;
    return this;
  }

   /**
   * Returns a flag whether default download options should appear or only custom one
   * @return defaultDownloadOptions
  **/
  @Schema(description = "Returns a flag whether default download options should appear or only custom one")
  public Boolean isDefaultDownloadOptions() {
    return defaultDownloadOptions;
  }

  public void setDefaultDownloadOptions(Boolean defaultDownloadOptions) {
    this.defaultDownloadOptions = defaultDownloadOptions;
  }

  public FullTemplateResponseDTO categories(List<Long> categories) {
    this.categories = categories;
    return this;
  }

  public FullTemplateResponseDTO addCategoriesItem(Long categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<Long>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Template categories ids. Empty array if not within any category.
   * @return categories
  **/
  @Schema(description = "Template categories ids. Empty array if not within any category.")
  public List<Long> getCategories() {
    return categories;
  }

  public void setCategories(List<Long> categories) {
    this.categories = categories;
  }

  public FullTemplateResponseDTO sharedCategories(List<Long> sharedCategories) {
    this.sharedCategories = sharedCategories;
    return this;
  }

  public FullTemplateResponseDTO addSharedCategoriesItem(Long sharedCategoriesItem) {
    if (this.sharedCategories == null) {
      this.sharedCategories = new ArrayList<Long>();
    }
    this.sharedCategories.add(sharedCategoriesItem);
    return this;
  }

   /**
   * Template shared categories ids. Absent if not within any shared category.
   * @return sharedCategories
  **/
  @Schema(description = "Template shared categories ids. Absent if not within any shared category.")
  public List<Long> getSharedCategories() {
    return sharedCategories;
  }

  public void setSharedCategories(List<Long> sharedCategories) {
    this.sharedCategories = sharedCategories;
  }

  public FullTemplateResponseDTO sharedTo(List<UUID> sharedTo) {
    this.sharedTo = sharedTo;
    return this;
  }

  public FullTemplateResponseDTO addSharedToItem(UUID sharedToItem) {
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

  public FullTemplateResponseDTO logoImageUuid(UUID logoImageUuid) {
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

  public FullTemplateResponseDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Template create date
   * @return createdAt
  **/
  @Schema(description = "Template create date")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public FullTemplateResponseDTO modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Template update date
   * @return modifiedAt
  **/
  @Schema(description = "Template update date")
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
    FullTemplateResponseDTO fullTemplateResponseDTO = (FullTemplateResponseDTO) o;
    return Objects.equals(this.uuid, fullTemplateResponseDTO.uuid) &&
        Objects.equals(this.name, fullTemplateResponseDTO.name) &&
        Objects.equals(this.description, fullTemplateResponseDTO.description) &&
        Objects.equals(this.data, fullTemplateResponseDTO.data) &&
        Objects.equals(this.version, fullTemplateResponseDTO.version) &&
        Objects.equals(this.dataCreatedAt, fullTemplateResponseDTO.dataCreatedAt) &&
        Objects.equals(this.dataModifiedAt, fullTemplateResponseDTO.dataModifiedAt) &&
        Objects.equals(this.access, fullTemplateResponseDTO.access) &&
        Objects.equals(this.mailbox, fullTemplateResponseDTO.mailbox) &&
        Objects.equals(this.archive, fullTemplateResponseDTO.archive) &&
        Objects.equals(this.newEnvelopeCanBeCreated, fullTemplateResponseDTO.newEnvelopeCanBeCreated) &&
        Objects.equals(this.defaultDownloadOptions, fullTemplateResponseDTO.defaultDownloadOptions) &&
        Objects.equals(this.categories, fullTemplateResponseDTO.categories) &&
        Objects.equals(this.sharedCategories, fullTemplateResponseDTO.sharedCategories) &&
        Objects.equals(this.sharedTo, fullTemplateResponseDTO.sharedTo) &&
        Objects.equals(this.logoImageUuid, fullTemplateResponseDTO.logoImageUuid) &&
        Objects.equals(this.createdAt, fullTemplateResponseDTO.createdAt) &&
        Objects.equals(this.modifiedAt, fullTemplateResponseDTO.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, description, data, version, dataCreatedAt, dataModifiedAt, access, mailbox, archive, newEnvelopeCanBeCreated, defaultDownloadOptions, categories, sharedCategories, sharedTo, logoImageUuid, createdAt, modifiedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullTemplateResponseDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dataCreatedAt: ").append(toIndentedString(dataCreatedAt)).append("\n");
    sb.append("    dataModifiedAt: ").append(toIndentedString(dataModifiedAt)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    mailbox: ").append(toIndentedString(mailbox)).append("\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    newEnvelopeCanBeCreated: ").append(toIndentedString(newEnvelopeCanBeCreated)).append("\n");
    sb.append("    defaultDownloadOptions: ").append(toIndentedString(defaultDownloadOptions)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    sharedCategories: ").append(toIndentedString(sharedCategories)).append("\n");
    sb.append("    sharedTo: ").append(toIndentedString(sharedTo)).append("\n");
    sb.append("    logoImageUuid: ").append(toIndentedString(logoImageUuid)).append("\n");
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
