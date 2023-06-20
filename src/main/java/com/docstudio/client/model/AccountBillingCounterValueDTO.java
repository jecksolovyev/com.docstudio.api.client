/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R82.8
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
 * Counters
 */
@Schema(description = "Counters")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-19T23:56:47.469723923Z[GMT]")

public class AccountBillingCounterValueDTO {
  @SerializedName("counterName")
  private String counterName = null;

  @SerializedName("counterValue")
  private Long counterValue = null;

  public AccountBillingCounterValueDTO counterName(String counterName) {
    this.counterName = counterName;
    return this;
  }

   /**
   * Name
   * @return counterName
  **/
  @Schema(description = "Name")
  public String getCounterName() {
    return counterName;
  }

  public void setCounterName(String counterName) {
    this.counterName = counterName;
  }

  public AccountBillingCounterValueDTO counterValue(Long counterValue) {
    this.counterValue = counterValue;
    return this;
  }

   /**
   * Value
   * @return counterValue
  **/
  @Schema(description = "Value")
  public Long getCounterValue() {
    return counterValue;
  }

  public void setCounterValue(Long counterValue) {
    this.counterValue = counterValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBillingCounterValueDTO accountBillingCounterValueDTO = (AccountBillingCounterValueDTO) o;
    return Objects.equals(this.counterName, accountBillingCounterValueDTO.counterName) &&
        Objects.equals(this.counterValue, accountBillingCounterValueDTO.counterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counterName, counterValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBillingCounterValueDTO {\n");
    
    sb.append("    counterName: ").append(toIndentedString(counterName)).append("\n");
    sb.append("    counterValue: ").append(toIndentedString(counterValue)).append("\n");
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
