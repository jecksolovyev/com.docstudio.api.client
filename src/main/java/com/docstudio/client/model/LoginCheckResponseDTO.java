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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * LoginCheckResponseDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class LoginCheckResponseDTO {
  @SerializedName("canLoginWithCode")
  private Boolean canLoginWithCode = null;

  @SerializedName("existingUser")
  private Boolean existingUser = null;

  public LoginCheckResponseDTO canLoginWithCode(Boolean canLoginWithCode) {
    this.canLoginWithCode = canLoginWithCode;
    return this;
  }

   /**
   * User can be logged in by invitation code
   * @return canLoginWithCode
  **/
  @Schema(description = "User can be logged in by invitation code")
  public Boolean isCanLoginWithCode() {
    return canLoginWithCode;
  }

  public void setCanLoginWithCode(Boolean canLoginWithCode) {
    this.canLoginWithCode = canLoginWithCode;
  }

  public LoginCheckResponseDTO existingUser(Boolean existingUser) {
    this.existingUser = existingUser;
    return this;
  }

   /**
   * Is used already created in the service?
   * @return existingUser
  **/
  @Schema(description = "Is used already created in the service?")
  public Boolean isExistingUser() {
    return existingUser;
  }

  public void setExistingUser(Boolean existingUser) {
    this.existingUser = existingUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginCheckResponseDTO loginCheckResponseDTO = (LoginCheckResponseDTO) o;
    return Objects.equals(this.canLoginWithCode, loginCheckResponseDTO.canLoginWithCode) &&
        Objects.equals(this.existingUser, loginCheckResponseDTO.existingUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canLoginWithCode, existingUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginCheckResponseDTO {\n");
    
    sb.append("    canLoginWithCode: ").append(toIndentedString(canLoginWithCode)).append("\n");
    sb.append("    existingUser: ").append(toIndentedString(existingUser)).append("\n");
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
