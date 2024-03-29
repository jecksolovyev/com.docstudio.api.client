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

import java.util.UUID;
/**
 * UploadedImageDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class UploadedImageDTO {
  @SerializedName("imageUuid")
  private UUID imageUuid = null;

  @SerializedName("src")
  private String src = null;

  @SerializedName("hash")
  private String hash = null;

  public UploadedImageDTO imageUuid(UUID imageUuid) {
    this.imageUuid = imageUuid;
    return this;
  }

   /**
   * Get imageUuid
   * @return imageUuid
  **/
  @Schema(description = "")
  public UUID getImageUuid() {
    return imageUuid;
  }

  public void setImageUuid(UUID imageUuid) {
    this.imageUuid = imageUuid;
  }

  public UploadedImageDTO src(String src) {
    this.src = src;
    return this;
  }

   /**
   * Get src
   * @return src
  **/
  @Schema(description = "")
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public UploadedImageDTO hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @Schema(description = "")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedImageDTO uploadedImageDTO = (UploadedImageDTO) o;
    return Objects.equals(this.imageUuid, uploadedImageDTO.imageUuid) &&
        Objects.equals(this.src, uploadedImageDTO.src) &&
        Objects.equals(this.hash, uploadedImageDTO.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUuid, src, hash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedImageDTO {\n");
    
    sb.append("    imageUuid: ").append(toIndentedString(imageUuid)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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
