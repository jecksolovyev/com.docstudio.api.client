/*
 * Centredo Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R74.21
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * RenewPasswordDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class RenewPasswordDTO {
  @SerializedName("oldPassword")
  private String oldPassword = null;

  @SerializedName("newPassword")
  private String newPassword = null;

  @SerializedName("email")
  private String email = null;

  public RenewPasswordDTO oldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

   /**
   * Old password
   * @return oldPassword
  **/
  @Schema(required = true, description = "Old password")
  public String getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  public RenewPasswordDTO newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

   /**
   * New Password
   * @return newPassword
  **/
  @Schema(required = true, description = "New Password")
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  public RenewPasswordDTO email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User&#x27;s email
   * @return email
  **/
  @Schema(description = "User's email")
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
    RenewPasswordDTO renewPasswordDTO = (RenewPasswordDTO) o;
    return Objects.equals(this.oldPassword, renewPasswordDTO.oldPassword) &&
        Objects.equals(this.newPassword, renewPasswordDTO.newPassword) &&
        Objects.equals(this.email, renewPasswordDTO.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldPassword, newPassword, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewPasswordDTO {\n");
    
    sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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
