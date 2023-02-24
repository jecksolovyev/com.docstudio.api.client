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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * E-mails for support
 */
@Schema(description = "E-mails for support")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class EmailProperties {
  @SerializedName("salesSupportEmail")
  private String salesSupportEmail = null;

  @SerializedName("issueSupportEmail")
  private String issueSupportEmail = null;

  public EmailProperties salesSupportEmail(String salesSupportEmail) {
    this.salesSupportEmail = salesSupportEmail;
    return this;
  }

   /**
   * Get salesSupportEmail
   * @return salesSupportEmail
  **/
  @Schema(description = "")
  public String getSalesSupportEmail() {
    return salesSupportEmail;
  }

  public void setSalesSupportEmail(String salesSupportEmail) {
    this.salesSupportEmail = salesSupportEmail;
  }

  public EmailProperties issueSupportEmail(String issueSupportEmail) {
    this.issueSupportEmail = issueSupportEmail;
    return this;
  }

   /**
   * Get issueSupportEmail
   * @return issueSupportEmail
  **/
  @Schema(description = "")
  public String getIssueSupportEmail() {
    return issueSupportEmail;
  }

  public void setIssueSupportEmail(String issueSupportEmail) {
    this.issueSupportEmail = issueSupportEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailProperties emailProperties = (EmailProperties) o;
    return Objects.equals(this.salesSupportEmail, emailProperties.salesSupportEmail) &&
        Objects.equals(this.issueSupportEmail, emailProperties.issueSupportEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesSupportEmail, issueSupportEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailProperties {\n");
    
    sb.append("    salesSupportEmail: ").append(toIndentedString(salesSupportEmail)).append("\n");
    sb.append("    issueSupportEmail: ").append(toIndentedString(issueSupportEmail)).append("\n");
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
