/*
 * Docstudio Api Documentation
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
import io.swagger.client.model.PasswordPolicy;
import io.swagger.client.model.SessionPolicy;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * User settings
 */
@Schema(description = "User settings")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class UserProperties {
  @SerializedName("profilePhone")
  private Boolean profilePhone = null;

  @SerializedName("passwordPolicy")
  private PasswordPolicy passwordPolicy = null;

  @SerializedName("sessionPolicy")
  private SessionPolicy sessionPolicy = null;

  public UserProperties profilePhone(Boolean profilePhone) {
    this.profilePhone = profilePhone;
    return this;
  }

   /**
   * Get profilePhone
   * @return profilePhone
  **/
  @Schema(description = "")
  public Boolean isProfilePhone() {
    return profilePhone;
  }

  public void setProfilePhone(Boolean profilePhone) {
    this.profilePhone = profilePhone;
  }

  public UserProperties passwordPolicy(PasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
    return this;
  }

   /**
   * Get passwordPolicy
   * @return passwordPolicy
  **/
  @Schema(description = "")
  public PasswordPolicy getPasswordPolicy() {
    return passwordPolicy;
  }

  public void setPasswordPolicy(PasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
  }

  public UserProperties sessionPolicy(SessionPolicy sessionPolicy) {
    this.sessionPolicy = sessionPolicy;
    return this;
  }

   /**
   * Get sessionPolicy
   * @return sessionPolicy
  **/
  @Schema(description = "")
  public SessionPolicy getSessionPolicy() {
    return sessionPolicy;
  }

  public void setSessionPolicy(SessionPolicy sessionPolicy) {
    this.sessionPolicy = sessionPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProperties userProperties = (UserProperties) o;
    return Objects.equals(this.profilePhone, userProperties.profilePhone) &&
        Objects.equals(this.passwordPolicy, userProperties.passwordPolicy) &&
        Objects.equals(this.sessionPolicy, userProperties.sessionPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profilePhone, passwordPolicy, sessionPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProperties {\n");
    
    sb.append("    profilePhone: ").append(toIndentedString(profilePhone)).append("\n");
    sb.append("    passwordPolicy: ").append(toIndentedString(passwordPolicy)).append("\n");
    sb.append("    sessionPolicy: ").append(toIndentedString(sessionPolicy)).append("\n");
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