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

import java.util.ArrayList;
import java.util.List;
/**
 * ImageRestriction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class ImageRestriction {
  @SerializedName("extensions")
  private List<String> extensions = null;

  @SerializedName("mimeTypes")
  private List<String> mimeTypes = null;

  @SerializedName("maxSize")
  private Integer maxSize = null;

  @SerializedName("maxWidth")
  private Integer maxWidth = null;

  @SerializedName("maxHeight")
  private Integer maxHeight = null;

  public ImageRestriction extensions(List<String> extensions) {
    this.extensions = extensions;
    return this;
  }

  public ImageRestriction addExtensionsItem(String extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<String>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * Get extensions
   * @return extensions
  **/
  @Schema(description = "")
  public List<String> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<String> extensions) {
    this.extensions = extensions;
  }

  public ImageRestriction mimeTypes(List<String> mimeTypes) {
    this.mimeTypes = mimeTypes;
    return this;
  }

  public ImageRestriction addMimeTypesItem(String mimeTypesItem) {
    if (this.mimeTypes == null) {
      this.mimeTypes = new ArrayList<String>();
    }
    this.mimeTypes.add(mimeTypesItem);
    return this;
  }

   /**
   * Get mimeTypes
   * @return mimeTypes
  **/
  @Schema(description = "")
  public List<String> getMimeTypes() {
    return mimeTypes;
  }

  public void setMimeTypes(List<String> mimeTypes) {
    this.mimeTypes = mimeTypes;
  }

  public ImageRestriction maxSize(Integer maxSize) {
    this.maxSize = maxSize;
    return this;
  }

   /**
   * Get maxSize
   * @return maxSize
  **/
  @Schema(description = "")
  public Integer getMaxSize() {
    return maxSize;
  }

  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }

  public ImageRestriction maxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

   /**
   * Get maxWidth
   * @return maxWidth
  **/
  @Schema(description = "")
  public Integer getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
  }

  public ImageRestriction maxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
    return this;
  }

   /**
   * Get maxHeight
   * @return maxHeight
  **/
  @Schema(description = "")
  public Integer getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageRestriction imageRestriction = (ImageRestriction) o;
    return Objects.equals(this.extensions, imageRestriction.extensions) &&
        Objects.equals(this.mimeTypes, imageRestriction.mimeTypes) &&
        Objects.equals(this.maxSize, imageRestriction.maxSize) &&
        Objects.equals(this.maxWidth, imageRestriction.maxWidth) &&
        Objects.equals(this.maxHeight, imageRestriction.maxHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensions, mimeTypes, maxSize, maxWidth, maxHeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageRestriction {\n");
    
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
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
