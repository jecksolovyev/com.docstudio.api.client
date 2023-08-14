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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
/**
 * AccountSsoIdProviderDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-14T22:02:04.375144579Z[GMT]")

public class AccountSsoIdProviderDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("firstNameMapping")
  private String firstNameMapping = null;

  @SerializedName("lastNameMapping")
  private String lastNameMapping = null;

  @SerializedName("phoneMapping")
  private String phoneMapping = null;

  @SerializedName("metadataUrl")
  private String metadataUrl = null;

  @SerializedName("metadataXml")
  private String metadataXml = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  public AccountSsoIdProviderDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountSsoIdProviderDTO firstNameMapping(String firstNameMapping) {
    this.firstNameMapping = firstNameMapping;
    return this;
  }

   /**
   * Get firstNameMapping
   * @return firstNameMapping
  **/
  @Schema(description = "")
  public String getFirstNameMapping() {
    return firstNameMapping;
  }

  public void setFirstNameMapping(String firstNameMapping) {
    this.firstNameMapping = firstNameMapping;
  }

  public AccountSsoIdProviderDTO lastNameMapping(String lastNameMapping) {
    this.lastNameMapping = lastNameMapping;
    return this;
  }

   /**
   * Get lastNameMapping
   * @return lastNameMapping
  **/
  @Schema(description = "")
  public String getLastNameMapping() {
    return lastNameMapping;
  }

  public void setLastNameMapping(String lastNameMapping) {
    this.lastNameMapping = lastNameMapping;
  }

  public AccountSsoIdProviderDTO phoneMapping(String phoneMapping) {
    this.phoneMapping = phoneMapping;
    return this;
  }

   /**
   * Get phoneMapping
   * @return phoneMapping
  **/
  @Schema(description = "")
  public String getPhoneMapping() {
    return phoneMapping;
  }

  public void setPhoneMapping(String phoneMapping) {
    this.phoneMapping = phoneMapping;
  }

  public AccountSsoIdProviderDTO metadataUrl(String metadataUrl) {
    this.metadataUrl = metadataUrl;
    return this;
  }

   /**
   * Get metadataUrl
   * @return metadataUrl
  **/
  @Schema(description = "")
  public String getMetadataUrl() {
    return metadataUrl;
  }

  public void setMetadataUrl(String metadataUrl) {
    this.metadataUrl = metadataUrl;
  }

  public AccountSsoIdProviderDTO metadataXml(String metadataXml) {
    this.metadataXml = metadataXml;
    return this;
  }

   /**
   * Get metadataXml
   * @return metadataXml
  **/
  @Schema(description = "")
  public String getMetadataXml() {
    return metadataXml;
  }

  public void setMetadataXml(String metadataXml) {
    this.metadataXml = metadataXml;
  }

  public AccountSsoIdProviderDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public AccountSsoIdProviderDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
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
    AccountSsoIdProviderDTO accountSsoIdProviderDTO = (AccountSsoIdProviderDTO) o;
    return Objects.equals(this.name, accountSsoIdProviderDTO.name) &&
        Objects.equals(this.firstNameMapping, accountSsoIdProviderDTO.firstNameMapping) &&
        Objects.equals(this.lastNameMapping, accountSsoIdProviderDTO.lastNameMapping) &&
        Objects.equals(this.phoneMapping, accountSsoIdProviderDTO.phoneMapping) &&
        Objects.equals(this.metadataUrl, accountSsoIdProviderDTO.metadataUrl) &&
        Objects.equals(this.metadataXml, accountSsoIdProviderDTO.metadataXml) &&
        Objects.equals(this.uuid, accountSsoIdProviderDTO.uuid) &&
        Objects.equals(this.createdAt, accountSsoIdProviderDTO.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, firstNameMapping, lastNameMapping, phoneMapping, metadataUrl, metadataXml, uuid, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSsoIdProviderDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstNameMapping: ").append(toIndentedString(firstNameMapping)).append("\n");
    sb.append("    lastNameMapping: ").append(toIndentedString(lastNameMapping)).append("\n");
    sb.append("    phoneMapping: ").append(toIndentedString(phoneMapping)).append("\n");
    sb.append("    metadataUrl: ").append(toIndentedString(metadataUrl)).append("\n");
    sb.append("    metadataXml: ").append(toIndentedString(metadataXml)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
