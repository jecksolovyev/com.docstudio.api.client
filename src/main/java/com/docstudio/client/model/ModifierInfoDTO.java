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

import java.util.UUID;
/**
 * ModifierInfoDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-14T13:27:59.020080107Z[GMT]")
public class ModifierInfoDTO {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("refillAmount")
  private Long refillAmount = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("order")
  private Integer order = null;

  public ModifierInfoDTO id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ModifierInfoDTO refillAmount(Long refillAmount) {
    this.refillAmount = refillAmount;
    return this;
  }

   /**
   * Get refillAmount
   * @return refillAmount
  **/
  @Schema(description = "")
  public Long getRefillAmount() {
    return refillAmount;
  }

  public void setRefillAmount(Long refillAmount) {
    this.refillAmount = refillAmount;
  }

  public ModifierInfoDTO displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ModifierInfoDTO order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @Schema(description = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifierInfoDTO modifierInfoDTO = (ModifierInfoDTO) o;
    return Objects.equals(this.id, modifierInfoDTO.id) &&
        Objects.equals(this.refillAmount, modifierInfoDTO.refillAmount) &&
        Objects.equals(this.displayName, modifierInfoDTO.displayName) &&
        Objects.equals(this.order, modifierInfoDTO.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, refillAmount, displayName, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifierInfoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    refillAmount: ").append(toIndentedString(refillAmount)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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