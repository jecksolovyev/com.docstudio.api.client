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

import java.util.HashMap;
import java.util.Map;
/**
 * StatDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-19T23:56:47.469723923Z[GMT]")

public class StatDTO {
  @SerializedName("counters")
  private Map<String, Integer> counters = null;

  public StatDTO counters(Map<String, Integer> counters) {
    this.counters = counters;
    return this;
  }

  public StatDTO putCountersItem(String key, Integer countersItem) {
    if (this.counters == null) {
      this.counters = new HashMap<String, Integer>();
    }
    this.counters.put(key, countersItem);
    return this;
  }

   /**
   * Get counters
   * @return counters
  **/
  @Schema(description = "")
  public Map<String, Integer> getCounters() {
    return counters;
  }

  public void setCounters(Map<String, Integer> counters) {
    this.counters = counters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatDTO statDTO = (StatDTO) o;
    return Objects.equals(this.counters, statDTO.counters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatDTO {\n");
    
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
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
