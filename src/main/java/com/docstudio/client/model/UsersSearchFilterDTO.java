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
 * UsersSearchFilterDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class UsersSearchFilterDTO {
  @SerializedName("mailbox")
  private String mailbox = null;

  @SerializedName("keyword")
  private String keyword = null;

  @SerializedName("domains")
  private List<String> domains = null;

  @SerializedName("roleUuids")
  private List<UUID> roleUuids = null;

  /**
   * User status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("PENDING_INVITE")
    PENDING_INVITE("PENDING_INVITE"),
    @SerializedName("ACTIVE")
    ACTIVE("ACTIVE"),
    @SerializedName("BLOCKED")
    BLOCKED("BLOCKED"),
    @SerializedName("PENDING_PASSWORD")
    PENDING_PASSWORD("PENDING_PASSWORD"),
    @SerializedName("DELETED")
    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("createdFrom")
  private OffsetDateTime createdFrom = null;

  @SerializedName("createdTo")
  private OffsetDateTime createdTo = null;

  /**
   * Sort order by creation date, asc or desc
   */
  @JsonAdapter(SortEnum.Adapter.class)
  public enum SortEnum {
    @SerializedName("desc")
    DESC("desc"),
    @SerializedName("asc")
    ASC("asc");

    private String value;

    SortEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SortEnum fromValue(String input) {
      for (SortEnum b : SortEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SortEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SortEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SortEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("sort")
  private SortEnum sort = null;

  public UsersSearchFilterDTO mailbox(String mailbox) {
    this.mailbox = mailbox;
    return this;
  }

   /**
   * UUID of Mailbox or &#x27;no_access&#x27; value
   * @return mailbox
  **/
  @Schema(description = "UUID of Mailbox or 'no_access' value")
  public String getMailbox() {
    return mailbox;
  }

  public void setMailbox(String mailbox) {
    this.mailbox = mailbox;
  }

  public UsersSearchFilterDTO keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * Keyword to search by in: firstName, lastName, email
   * @return keyword
  **/
  @Schema(description = "Keyword to search by in: firstName, lastName, email")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public UsersSearchFilterDTO domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public UsersSearchFilterDTO addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<String>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * Domains
   * @return domains
  **/
  @Schema(description = "Domains")
  public List<String> getDomains() {
    return domains;
  }

  public void setDomains(List<String> domains) {
    this.domains = domains;
  }

  public UsersSearchFilterDTO roleUuids(List<UUID> roleUuids) {
    this.roleUuids = roleUuids;
    return this;
  }

  public UsersSearchFilterDTO addRoleUuidsItem(UUID roleUuidsItem) {
    if (this.roleUuids == null) {
      this.roleUuids = new ArrayList<UUID>();
    }
    this.roleUuids.add(roleUuidsItem);
    return this;
  }

   /**
   * UUIDs of Roles
   * @return roleUuids
  **/
  @Schema(description = "UUIDs of Roles")
  public List<UUID> getRoleUuids() {
    return roleUuids;
  }

  public void setRoleUuids(List<UUID> roleUuids) {
    this.roleUuids = roleUuids;
  }

  public UsersSearchFilterDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * User status
   * @return status
  **/
  @Schema(description = "User status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public UsersSearchFilterDTO createdFrom(OffsetDateTime createdFrom) {
    this.createdFrom = createdFrom;
    return this;
  }

   /**
   * Created date from
   * @return createdFrom
  **/
  @Schema(description = "Created date from")
  public OffsetDateTime getCreatedFrom() {
    return createdFrom;
  }

  public void setCreatedFrom(OffsetDateTime createdFrom) {
    this.createdFrom = createdFrom;
  }

  public UsersSearchFilterDTO createdTo(OffsetDateTime createdTo) {
    this.createdTo = createdTo;
    return this;
  }

   /**
   * Created date to
   * @return createdTo
  **/
  @Schema(description = "Created date to")
  public OffsetDateTime getCreatedTo() {
    return createdTo;
  }

  public void setCreatedTo(OffsetDateTime createdTo) {
    this.createdTo = createdTo;
  }

  public UsersSearchFilterDTO sort(SortEnum sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Sort order by creation date, asc or desc
   * @return sort
  **/
  @Schema(description = "Sort order by creation date, asc or desc")
  public SortEnum getSort() {
    return sort;
  }

  public void setSort(SortEnum sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersSearchFilterDTO usersSearchFilterDTO = (UsersSearchFilterDTO) o;
    return Objects.equals(this.mailbox, usersSearchFilterDTO.mailbox) &&
        Objects.equals(this.keyword, usersSearchFilterDTO.keyword) &&
        Objects.equals(this.domains, usersSearchFilterDTO.domains) &&
        Objects.equals(this.roleUuids, usersSearchFilterDTO.roleUuids) &&
        Objects.equals(this.status, usersSearchFilterDTO.status) &&
        Objects.equals(this.createdFrom, usersSearchFilterDTO.createdFrom) &&
        Objects.equals(this.createdTo, usersSearchFilterDTO.createdTo) &&
        Objects.equals(this.sort, usersSearchFilterDTO.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailbox, keyword, domains, roleUuids, status, createdFrom, createdTo, sort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersSearchFilterDTO {\n");
    
    sb.append("    mailbox: ").append(toIndentedString(mailbox)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    roleUuids: ").append(toIndentedString(roleUuids)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdFrom: ").append(toIndentedString(createdFrom)).append("\n");
    sb.append("    createdTo: ").append(toIndentedString(createdTo)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
