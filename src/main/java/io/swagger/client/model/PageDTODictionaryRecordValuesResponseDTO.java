/*
 * Centredo Api Documentation
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
import io.swagger.client.model.DictionaryRecordValuesResponseDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PageDTODictionaryRecordValuesResponseDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class PageDTODictionaryRecordValuesResponseDTO {
  @SerializedName("totalElements")
  private Long totalElements = null;

  @SerializedName("sizeRequested")
  private Long sizeRequested = null;

  @SerializedName("numberOfElements")
  private Long numberOfElements = null;

  @SerializedName("data")
  private List<DictionaryRecordValuesResponseDTO> data = null;

  public PageDTODictionaryRecordValuesResponseDTO totalElements(Long totalElements) {
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

  public PageDTODictionaryRecordValuesResponseDTO sizeRequested(Long sizeRequested) {
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

  public PageDTODictionaryRecordValuesResponseDTO numberOfElements(Long numberOfElements) {
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

  public PageDTODictionaryRecordValuesResponseDTO data(List<DictionaryRecordValuesResponseDTO> data) {
    this.data = data;
    return this;
  }

  public PageDTODictionaryRecordValuesResponseDTO addDataItem(DictionaryRecordValuesResponseDTO dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<DictionaryRecordValuesResponseDTO>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Data records
   * @return data
  **/
  @Schema(description = "Data records")
  public List<DictionaryRecordValuesResponseDTO> getData() {
    return data;
  }

  public void setData(List<DictionaryRecordValuesResponseDTO> data) {
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
    PageDTODictionaryRecordValuesResponseDTO pageDTODictionaryRecordValuesResponseDTO = (PageDTODictionaryRecordValuesResponseDTO) o;
    return Objects.equals(this.totalElements, pageDTODictionaryRecordValuesResponseDTO.totalElements) &&
        Objects.equals(this.sizeRequested, pageDTODictionaryRecordValuesResponseDTO.sizeRequested) &&
        Objects.equals(this.numberOfElements, pageDTODictionaryRecordValuesResponseDTO.numberOfElements) &&
        Objects.equals(this.data, pageDTODictionaryRecordValuesResponseDTO.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalElements, sizeRequested, numberOfElements, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageDTODictionaryRecordValuesResponseDTO {\n");
    
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
