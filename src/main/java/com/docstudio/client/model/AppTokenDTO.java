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
 * AppTokenDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-14T22:02:04.375144579Z[GMT]")

public class AppTokenDTO {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("expireAt")
  private OffsetDateTime expireAt = null;

  @SerializedName("lastUsedAt")
  private OffsetDateTime lastUsedAt = null;

  public AppTokenDTO id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/
  @Schema(description = "Id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public AppTokenDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @Schema(description = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AppTokenDTO token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Token
   * @return token
  **/
  @Schema(description = "Token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public AppTokenDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Created at date
   * @return createdAt
  **/
  @Schema(description = "Created at date")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AppTokenDTO expireAt(OffsetDateTime expireAt) {
    this.expireAt = expireAt;
    return this;
  }

   /**
   * Expire at date
   * @return expireAt
  **/
  @Schema(description = "Expire at date")
  public OffsetDateTime getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(OffsetDateTime expireAt) {
    this.expireAt = expireAt;
  }

  public AppTokenDTO lastUsedAt(OffsetDateTime lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
    return this;
  }

   /**
   * Last used at date
   * @return lastUsedAt
  **/
  @Schema(description = "Last used at date")
  public OffsetDateTime getLastUsedAt() {
    return lastUsedAt;
  }

  public void setLastUsedAt(OffsetDateTime lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppTokenDTO appTokenDTO = (AppTokenDTO) o;
    return Objects.equals(this.id, appTokenDTO.id) &&
        Objects.equals(this.name, appTokenDTO.name) &&
        Objects.equals(this.token, appTokenDTO.token) &&
        Objects.equals(this.createdAt, appTokenDTO.createdAt) &&
        Objects.equals(this.expireAt, appTokenDTO.expireAt) &&
        Objects.equals(this.lastUsedAt, appTokenDTO.lastUsedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, token, createdAt, expireAt, lastUsedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppTokenDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    lastUsedAt: ").append(toIndentedString(lastUsedAt)).append("\n");
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
