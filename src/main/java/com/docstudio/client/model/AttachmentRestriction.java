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
import com.docstudio.client.model.AttachmentFileAllowance;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AttachmentRestriction
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class AttachmentRestriction {
  @SerializedName("maxSize")
  private Long maxSize = null;

  @SerializedName("totalMaxSize")
  private Long totalMaxSize = null;

  @SerializedName("fileNameLength")
  private Integer fileNameLength = null;

  @SerializedName("document")
  private AttachmentFileAllowance document = null;

  @SerializedName("file")
  private AttachmentFileAllowance file = null;

  @SerializedName("image")
  private AttachmentFileAllowance image = null;

  @SerializedName("archive")
  private AttachmentFileAllowance archive = null;

  public AttachmentRestriction maxSize(Long maxSize) {
    this.maxSize = maxSize;
    return this;
  }

   /**
   * Get maxSize
   * @return maxSize
  **/
  @Schema(description = "")
  public Long getMaxSize() {
    return maxSize;
  }

  public void setMaxSize(Long maxSize) {
    this.maxSize = maxSize;
  }

  public AttachmentRestriction totalMaxSize(Long totalMaxSize) {
    this.totalMaxSize = totalMaxSize;
    return this;
  }

   /**
   * Get totalMaxSize
   * @return totalMaxSize
  **/
  @Schema(description = "")
  public Long getTotalMaxSize() {
    return totalMaxSize;
  }

  public void setTotalMaxSize(Long totalMaxSize) {
    this.totalMaxSize = totalMaxSize;
  }

  public AttachmentRestriction fileNameLength(Integer fileNameLength) {
    this.fileNameLength = fileNameLength;
    return this;
  }

   /**
   * Get fileNameLength
   * @return fileNameLength
  **/
  @Schema(description = "")
  public Integer getFileNameLength() {
    return fileNameLength;
  }

  public void setFileNameLength(Integer fileNameLength) {
    this.fileNameLength = fileNameLength;
  }

  public AttachmentRestriction document(AttachmentFileAllowance document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @Schema(description = "")
  public AttachmentFileAllowance getDocument() {
    return document;
  }

  public void setDocument(AttachmentFileAllowance document) {
    this.document = document;
  }

  public AttachmentRestriction file(AttachmentFileAllowance file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @Schema(description = "")
  public AttachmentFileAllowance getFile() {
    return file;
  }

  public void setFile(AttachmentFileAllowance file) {
    this.file = file;
  }

  public AttachmentRestriction image(AttachmentFileAllowance image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @Schema(description = "")
  public AttachmentFileAllowance getImage() {
    return image;
  }

  public void setImage(AttachmentFileAllowance image) {
    this.image = image;
  }

  public AttachmentRestriction archive(AttachmentFileAllowance archive) {
    this.archive = archive;
    return this;
  }

   /**
   * Get archive
   * @return archive
  **/
  @Schema(description = "")
  public AttachmentFileAllowance getArchive() {
    return archive;
  }

  public void setArchive(AttachmentFileAllowance archive) {
    this.archive = archive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentRestriction attachmentRestriction = (AttachmentRestriction) o;
    return Objects.equals(this.maxSize, attachmentRestriction.maxSize) &&
        Objects.equals(this.totalMaxSize, attachmentRestriction.totalMaxSize) &&
        Objects.equals(this.fileNameLength, attachmentRestriction.fileNameLength) &&
        Objects.equals(this.document, attachmentRestriction.document) &&
        Objects.equals(this.file, attachmentRestriction.file) &&
        Objects.equals(this.image, attachmentRestriction.image) &&
        Objects.equals(this.archive, attachmentRestriction.archive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSize, totalMaxSize, fileNameLength, document, file, image, archive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentRestriction {\n");
    
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    totalMaxSize: ").append(toIndentedString(totalMaxSize)).append("\n");
    sb.append("    fileNameLength: ").append(toIndentedString(fileNameLength)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
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
