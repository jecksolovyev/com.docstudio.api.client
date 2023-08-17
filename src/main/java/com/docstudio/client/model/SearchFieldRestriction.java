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
 * SearchFieldRestriction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class SearchFieldRestriction {
  @SerializedName("autocompleteLimit")
  private Integer autocompleteLimit = null;

  public SearchFieldRestriction autocompleteLimit(Integer autocompleteLimit) {
    this.autocompleteLimit = autocompleteLimit;
    return this;
  }

   /**
   * Get autocompleteLimit
   * @return autocompleteLimit
  **/
  @Schema(description = "")
  public Integer getAutocompleteLimit() {
    return autocompleteLimit;
  }

  public void setAutocompleteLimit(Integer autocompleteLimit) {
    this.autocompleteLimit = autocompleteLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchFieldRestriction searchFieldRestriction = (SearchFieldRestriction) o;
    return Objects.equals(this.autocompleteLimit, searchFieldRestriction.autocompleteLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autocompleteLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchFieldRestriction {\n");
    
    sb.append("    autocompleteLimit: ").append(toIndentedString(autocompleteLimit)).append("\n");
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
