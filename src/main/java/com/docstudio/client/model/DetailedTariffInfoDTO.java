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
import java.util.UUID;
/**
 * DetailedTariffInfoDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-14T13:27:59.020080107Z[GMT]")
public class DetailedTariffInfoDTO {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tariffPrice")
  private Long tariffPrice = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("attributes")
  private List<AttributeInfoDTO> attributes = null;

  @SerializedName("counters")
  private List<CounterInfoDTO> counters = null;

  public DetailedTariffInfoDTO id(UUID id) {
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

  public DetailedTariffInfoDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DetailedTariffInfoDTO tariffPrice(Long tariffPrice) {
    this.tariffPrice = tariffPrice;
    return this;
  }

   /**
   * Get tariffPrice
   * @return tariffPrice
  **/
  @Schema(description = "")
  public Long getTariffPrice() {
    return tariffPrice;
  }

  public void setTariffPrice(Long tariffPrice) {
    this.tariffPrice = tariffPrice;
  }

  public DetailedTariffInfoDTO displayName(String displayName) {
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

  public DetailedTariffInfoDTO attributes(List<AttributeInfoDTO> attributes) {
    this.attributes = attributes;
    return this;
  }

  public DetailedTariffInfoDTO addAttributesItem(AttributeInfoDTO attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<AttributeInfoDTO>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(description = "")
  public List<AttributeInfoDTO> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<AttributeInfoDTO> attributes) {
    this.attributes = attributes;
  }

  public DetailedTariffInfoDTO counters(List<CounterInfoDTO> counters) {
    this.counters = counters;
    return this;
  }

  public DetailedTariffInfoDTO addCountersItem(CounterInfoDTO countersItem) {
    if (this.counters == null) {
      this.counters = new ArrayList<CounterInfoDTO>();
    }
    this.counters.add(countersItem);
    return this;
  }

   /**
   * Get counters
   * @return counters
  **/
  @Schema(description = "")
  public List<CounterInfoDTO> getCounters() {
    return counters;
  }

  public void setCounters(List<CounterInfoDTO> counters) {
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
    DetailedTariffInfoDTO detailedTariffInfoDTO = (DetailedTariffInfoDTO) o;
    return Objects.equals(this.id, detailedTariffInfoDTO.id) &&
        Objects.equals(this.name, detailedTariffInfoDTO.name) &&
        Objects.equals(this.tariffPrice, detailedTariffInfoDTO.tariffPrice) &&
        Objects.equals(this.displayName, detailedTariffInfoDTO.displayName) &&
        Objects.equals(this.attributes, detailedTariffInfoDTO.attributes) &&
        Objects.equals(this.counters, detailedTariffInfoDTO.counters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, tariffPrice, displayName, attributes, counters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedTariffInfoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tariffPrice: ").append(toIndentedString(tariffPrice)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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