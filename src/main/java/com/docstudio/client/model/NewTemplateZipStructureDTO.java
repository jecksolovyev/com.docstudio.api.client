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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * NewTemplateZipStructureDTO
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class NewTemplateZipStructureDTO {
  @SerializedName("title")
  private String title = null;

  @SerializedName("names")
  private List<String> names = new ArrayList<String>();

  @SerializedName("defaultDownloadOptions")
  private Boolean defaultDownloadOptions = null;

  public NewTemplateZipStructureDTO title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(required = true, description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public NewTemplateZipStructureDTO names(List<String> names) {
    this.names = names;
    return this;
  }

  public NewTemplateZipStructureDTO addNamesItem(String namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @Schema(required = true, description = "")
  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  public NewTemplateZipStructureDTO defaultDownloadOptions(Boolean defaultDownloadOptions) {
    this.defaultDownloadOptions = defaultDownloadOptions;
    return this;
  }

   /**
   * Get defaultDownloadOptions
   * @return defaultDownloadOptions
  **/
  @Schema(description = "")
  public Boolean isDefaultDownloadOptions() {
    return defaultDownloadOptions;
  }

  public void setDefaultDownloadOptions(Boolean defaultDownloadOptions) {
    this.defaultDownloadOptions = defaultDownloadOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewTemplateZipStructureDTO newTemplateZipStructureDTO = (NewTemplateZipStructureDTO) o;
    return Objects.equals(this.title, newTemplateZipStructureDTO.title) &&
        Objects.equals(this.names, newTemplateZipStructureDTO.names) &&
        Objects.equals(this.defaultDownloadOptions, newTemplateZipStructureDTO.defaultDownloadOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, names, defaultDownloadOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewTemplateZipStructureDTO {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    defaultDownloadOptions: ").append(toIndentedString(defaultDownloadOptions)).append("\n");
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
