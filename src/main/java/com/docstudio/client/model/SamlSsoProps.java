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
 * SamlSsoProps
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class SamlSsoProps {
  @SerializedName("entityId")
  private String entityId = null;

  @SerializedName("acsUrl")
  private String acsUrl = null;

  public SamlSsoProps entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @Schema(description = "")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public SamlSsoProps acsUrl(String acsUrl) {
    this.acsUrl = acsUrl;
    return this;
  }

   /**
   * Get acsUrl
   * @return acsUrl
  **/
  @Schema(description = "")
  public String getAcsUrl() {
    return acsUrl;
  }

  public void setAcsUrl(String acsUrl) {
    this.acsUrl = acsUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlSsoProps samlSsoProps = (SamlSsoProps) o;
    return Objects.equals(this.entityId, samlSsoProps.entityId) &&
        Objects.equals(this.acsUrl, samlSsoProps.acsUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, acsUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlSsoProps {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    acsUrl: ").append(toIndentedString(acsUrl)).append("\n");
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
