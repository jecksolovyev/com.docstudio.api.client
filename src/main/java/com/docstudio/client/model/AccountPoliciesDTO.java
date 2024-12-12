/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R120.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.docstudio.client.model.PasswordPolicy;
import com.docstudio.client.model.SessionPolicy;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Policies map
 */
@Schema(description = "Policies map")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class AccountPoliciesDTO {
  @SerializedName("passwordPolicy")
  private PasswordPolicy passwordPolicy = null;

  @SerializedName("sessionPolicy")
  private SessionPolicy sessionPolicy = null;

  public AccountPoliciesDTO passwordPolicy(PasswordPolicy passwordPolicy) {
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

  public AccountPoliciesDTO sessionPolicy(SessionPolicy sessionPolicy) {
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
    AccountPoliciesDTO accountPoliciesDTO = (AccountPoliciesDTO) o;
    return Objects.equals(this.passwordPolicy, accountPoliciesDTO.passwordPolicy) &&
        Objects.equals(this.sessionPolicy, accountPoliciesDTO.sessionPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordPolicy, sessionPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPoliciesDTO {\n");
    
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
