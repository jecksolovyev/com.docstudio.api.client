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
 * Mailbox properties
 */
@Schema(description = "Mailbox properties")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class MailboxProperties {
  @SerializedName("hideEmptyMailboxFolders")
  private Boolean hideEmptyMailboxFolders = null;

  public MailboxProperties hideEmptyMailboxFolders(Boolean hideEmptyMailboxFolders) {
    this.hideEmptyMailboxFolders = hideEmptyMailboxFolders;
    return this;
  }

   /**
   * Get hideEmptyMailboxFolders
   * @return hideEmptyMailboxFolders
  **/
  @Schema(description = "")
  public Boolean isHideEmptyMailboxFolders() {
    return hideEmptyMailboxFolders;
  }

  public void setHideEmptyMailboxFolders(Boolean hideEmptyMailboxFolders) {
    this.hideEmptyMailboxFolders = hideEmptyMailboxFolders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailboxProperties mailboxProperties = (MailboxProperties) o;
    return Objects.equals(this.hideEmptyMailboxFolders, mailboxProperties.hideEmptyMailboxFolders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideEmptyMailboxFolders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailboxProperties {\n");
    
    sb.append("    hideEmptyMailboxFolders: ").append(toIndentedString(hideEmptyMailboxFolders)).append("\n");
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
