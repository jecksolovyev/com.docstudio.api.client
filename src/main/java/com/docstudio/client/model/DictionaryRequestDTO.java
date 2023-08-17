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
/**
 * Dictionary info
 */
@Schema(description = "Dictionary info")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class DictionaryRequestDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Dictionary access level
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

  @SerializedName("filteredAccessOnly")
  private Boolean filteredAccessOnly = null;

  public DictionaryRequestDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Dictionary name
   * @return name
  **/
  @Schema(required = true, description = "Dictionary name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DictionaryRequestDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Dictionary description
   * @return description
  **/
  @Schema(description = "Dictionary description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DictionaryRequestDTO access(AccessEnum access) {
    this.access = access;
    return this;
  }

   /**
   * Dictionary access level
   * @return access
  **/
  @Schema(required = true, description = "Dictionary access level")
  public AccessEnum getAccess() {
    return access;
  }

  public void setAccess(AccessEnum access) {
    this.access = access;
  }

  public DictionaryRequestDTO filteredAccessOnly(Boolean filteredAccessOnly) {
    this.filteredAccessOnly = filteredAccessOnly;
    return this;
  }

   /**
   * Dictionary filtered access only
   * @return filteredAccessOnly
  **/
  @Schema(required = true, description = "Dictionary filtered access only")
  public Boolean isFilteredAccessOnly() {
    return filteredAccessOnly;
  }

  public void setFilteredAccessOnly(Boolean filteredAccessOnly) {
    this.filteredAccessOnly = filteredAccessOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryRequestDTO dictionaryRequestDTO = (DictionaryRequestDTO) o;
    return Objects.equals(this.name, dictionaryRequestDTO.name) &&
        Objects.equals(this.description, dictionaryRequestDTO.description) &&
        Objects.equals(this.access, dictionaryRequestDTO.access) &&
        Objects.equals(this.filteredAccessOnly, dictionaryRequestDTO.filteredAccessOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, access, filteredAccessOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryRequestDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    filteredAccessOnly: ").append(toIndentedString(filteredAccessOnly)).append("\n");
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
