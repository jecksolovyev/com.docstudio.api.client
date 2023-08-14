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
/**
 * UserInfoDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-14T22:02:04.375144579Z[GMT]")

public class UserInfoDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("email")
  private String email = null;

  public UserInfoDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Unique identifier of user
   * @return uuid
  **/
  @Schema(description = "Unique identifier of user")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public UserInfoDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of user
   * @return firstName
  **/
  @Schema(description = "First name of user")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserInfoDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of user
   * @return lastName
  **/
  @Schema(description = "Last name of user")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserInfoDTO email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User e-mail
   * @return email
  **/
  @Schema(description = "User e-mail")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfoDTO userInfoDTO = (UserInfoDTO) o;
    return Objects.equals(this.uuid, userInfoDTO.uuid) &&
        Objects.equals(this.firstName, userInfoDTO.firstName) &&
        Objects.equals(this.lastName, userInfoDTO.lastName) &&
        Objects.equals(this.email, userInfoDTO.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, firstName, lastName, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfoDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
