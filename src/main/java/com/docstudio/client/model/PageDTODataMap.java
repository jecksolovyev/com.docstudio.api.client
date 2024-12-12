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
import com.docstudio.client.model.DataMap;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PageDTODataMap
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class PageDTODataMap {
  @SerializedName("totalElements")
  private Long totalElements = null;

  @SerializedName("sizeRequested")
  private Long sizeRequested = null;

  @SerializedName("numberOfElements")
  private Long numberOfElements = null;

  @SerializedName("data")
  private List<DataMap> data = null;

  public PageDTODataMap totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Total elements by request
   * @return totalElements
  **/
  @Schema(description = "Total elements by request")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public PageDTODataMap sizeRequested(Long sizeRequested) {
    this.sizeRequested = sizeRequested;
    return this;
  }

   /**
   * Requested size
   * @return sizeRequested
  **/
  @Schema(description = "Requested size")
  public Long getSizeRequested() {
    return sizeRequested;
  }

  public void setSizeRequested(Long sizeRequested) {
    this.sizeRequested = sizeRequested;
  }

  public PageDTODataMap numberOfElements(Long numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

   /**
   * Fetched records count
   * @return numberOfElements
  **/
  @Schema(description = "Fetched records count")
  public Long getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Long numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public PageDTODataMap data(List<DataMap> data) {
    this.data = data;
    return this;
  }

  public PageDTODataMap addDataItem(DataMap dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<DataMap>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Data records
   * @return data
  **/
  @Schema(description = "Data records")
  public List<DataMap> getData() {
    return data;
  }

  public void setData(List<DataMap> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageDTODataMap pageDTODataMap = (PageDTODataMap) o;
    return Objects.equals(this.totalElements, pageDTODataMap.totalElements) &&
        Objects.equals(this.sizeRequested, pageDTODataMap.sizeRequested) &&
        Objects.equals(this.numberOfElements, pageDTODataMap.numberOfElements) &&
        Objects.equals(this.data, pageDTODataMap.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalElements, sizeRequested, numberOfElements, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageDTODataMap {\n");
    
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    sizeRequested: ").append(toIndentedString(sizeRequested)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
