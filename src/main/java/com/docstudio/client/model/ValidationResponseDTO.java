/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R75.3
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

import java.util.ArrayList;
import java.util.List;
/**
 * ValidationResponseDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-14T13:27:59.020080107Z[GMT]")
public class ValidationResponseDTO {
  @SerializedName("errors")
  private List<EnvelopeValidationError> errors = null;

  public ValidationResponseDTO errors(List<EnvelopeValidationError> errors) {
    this.errors = errors;
    return this;
  }

  public ValidationResponseDTO addErrorsItem(EnvelopeValidationError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<EnvelopeValidationError>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @Schema(description = "")
  public List<EnvelopeValidationError> getErrors() {
    return errors;
  }

  public void setErrors(List<EnvelopeValidationError> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationResponseDTO validationResponseDTO = (ValidationResponseDTO) o;
    return Objects.equals(this.errors, validationResponseDTO.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationResponseDTO {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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