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
/**
 * Request body
 */
@Schema(description = "Request body")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class TemplateCreateDTO {
  @SerializedName("data")
  private String data = null;

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

  @SerializedName("sharedTo")
  private List<UUID> sharedTo = null;

  @SerializedName("logoImageUuid")
  private UUID logoImageUuid = null;

  public TemplateCreateDTO data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Template data
   * @return data
  **/
  @Schema(required = true, description = "Template data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public TemplateCreateDTO access(AccessEnum access) {
    this.access = access;
    return this;
  }

   /**
   * Template access level
   * @return access
  **/
  @Schema(required = true, description = "Template access level")
  public AccessEnum getAccess() {
    return access;
  }

  public void setAccess(AccessEnum access) {
    this.access = access;
  }

  public TemplateCreateDTO categories(List<Long> categories) {
    this.categories = categories;
    return this;
  }

  public TemplateCreateDTO addCategoriesItem(Long categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<Long>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Template categories ids and their accessLevels. Null or empty array if not within any category.
   * @return categories
  **/
  @Schema(description = "Template categories ids and their accessLevels. Null or empty array if not within any category.")
  public List<Long> getCategories() {
    return categories;
  }

  public void setCategories(List<Long> categories) {
    this.categories = categories;
  }

  public TemplateCreateDTO sharedTo(List<UUID> sharedTo) {
    this.sharedTo = sharedTo;
    return this;
  }

  public TemplateCreateDTO addSharedToItem(UUID sharedToItem) {
    if (this.sharedTo == null) {
      this.sharedTo = new ArrayList<UUID>();
    }
    this.sharedTo.add(sharedToItem);
    return this;
  }

   /**
   * Mailboxes list, which have access to template
   * @return sharedTo
  **/
  @Schema(description = "Mailboxes list, which have access to template")
  public List<UUID> getSharedTo() {
    return sharedTo;
  }

  public void setSharedTo(List<UUID> sharedTo) {
    this.sharedTo = sharedTo;
  }

  public TemplateCreateDTO logoImageUuid(UUID logoImageUuid) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateCreateDTO templateCreateDTO = (TemplateCreateDTO) o;
    return Objects.equals(this.data, templateCreateDTO.data) &&
        Objects.equals(this.access, templateCreateDTO.access) &&
        Objects.equals(this.categories, templateCreateDTO.categories) &&
        Objects.equals(this.sharedTo, templateCreateDTO.sharedTo) &&
        Objects.equals(this.logoImageUuid, templateCreateDTO.logoImageUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, access, categories, sharedTo, logoImageUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateCreateDTO {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    sharedTo: ").append(toIndentedString(sharedTo)).append("\n");
    sb.append("    logoImageUuid: ").append(toIndentedString(logoImageUuid)).append("\n");
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
