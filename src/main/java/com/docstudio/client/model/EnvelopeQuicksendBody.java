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
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 * EnvelopeQuicksendBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-19T23:56:47.469723923Z[GMT]")

public class EnvelopeQuicksendBody {
  @SerializedName("files")
  private List<File> files = new ArrayList<File>();

  @SerializedName("data")
  private QuickSendDTO data = null;

  public EnvelopeQuicksendBody files(List<File> files) {
    this.files = files;
    return this;
  }

  public EnvelopeQuicksendBody addFilesItem(File filesItem) {
    this.files.add(filesItem);
    return this;
  }

   /**
   * Files for external documents
   * @return files
  **/
  @Schema(required = true, description = "Files for external documents")
  public List<File> getFiles() {
    return files;
  }

  public void setFiles(List<File> files) {
    this.files = files;
  }

  public EnvelopeQuicksendBody data(QuickSendDTO data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(required = true, description = "")
  public QuickSendDTO getData() {
    return data;
  }

  public void setData(QuickSendDTO data) {
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
    EnvelopeQuicksendBody envelopeQuicksendBody = (EnvelopeQuicksendBody) o;
    return Objects.equals(this.files, envelopeQuicksendBody.files) &&
        Objects.equals(this.data, envelopeQuicksendBody.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeQuicksendBody {\n");
    
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
