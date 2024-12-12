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
/**
 * Info menu links
 */
@Schema(description = "Info menu links")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class ExternalLinkShortResponseDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("url")
  private String url = null;

  public ExternalLinkShortResponseDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Link name
   * @return name
  **/
  @Schema(required = true, description = "Link name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExternalLinkShortResponseDTO url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Link url
   * @return url
  **/
  @Schema(required = true, description = "Link url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalLinkShortResponseDTO externalLinkShortResponseDTO = (ExternalLinkShortResponseDTO) o;
    return Objects.equals(this.name, externalLinkShortResponseDTO.name) &&
        Objects.equals(this.url, externalLinkShortResponseDTO.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalLinkShortResponseDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
