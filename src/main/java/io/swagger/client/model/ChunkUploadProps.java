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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Chunk Upload properties
 */
@Schema(description = "Chunk Upload properties")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class ChunkUploadProps {
  @SerializedName("maxFileSize")
  private Long maxFileSize = null;

  @SerializedName("chunkSize")
  private Long chunkSize = null;

  @SerializedName("maxRequestFileSize")
  private Long maxRequestFileSize = null;

  public ChunkUploadProps maxFileSize(Long maxFileSize) {
    this.maxFileSize = maxFileSize;
    return this;
  }

   /**
   * Get maxFileSize
   * @return maxFileSize
  **/
  @Schema(description = "")
  public Long getMaxFileSize() {
    return maxFileSize;
  }

  public void setMaxFileSize(Long maxFileSize) {
    this.maxFileSize = maxFileSize;
  }

  public ChunkUploadProps chunkSize(Long chunkSize) {
    this.chunkSize = chunkSize;
    return this;
  }

   /**
   * Get chunkSize
   * @return chunkSize
  **/
  @Schema(description = "")
  public Long getChunkSize() {
    return chunkSize;
  }

  public void setChunkSize(Long chunkSize) {
    this.chunkSize = chunkSize;
  }

  public ChunkUploadProps maxRequestFileSize(Long maxRequestFileSize) {
    this.maxRequestFileSize = maxRequestFileSize;
    return this;
  }

   /**
   * Get maxRequestFileSize
   * @return maxRequestFileSize
  **/
  @Schema(description = "")
  public Long getMaxRequestFileSize() {
    return maxRequestFileSize;
  }

  public void setMaxRequestFileSize(Long maxRequestFileSize) {
    this.maxRequestFileSize = maxRequestFileSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChunkUploadProps chunkUploadProps = (ChunkUploadProps) o;
    return Objects.equals(this.maxFileSize, chunkUploadProps.maxFileSize) &&
        Objects.equals(this.chunkSize, chunkUploadProps.chunkSize) &&
        Objects.equals(this.maxRequestFileSize, chunkUploadProps.maxRequestFileSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxFileSize, chunkSize, maxRequestFileSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChunkUploadProps {\n");
    
    sb.append("    maxFileSize: ").append(toIndentedString(maxFileSize)).append("\n");
    sb.append("    chunkSize: ").append(toIndentedString(chunkSize)).append("\n");
    sb.append("    maxRequestFileSize: ").append(toIndentedString(maxRequestFileSize)).append("\n");
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
