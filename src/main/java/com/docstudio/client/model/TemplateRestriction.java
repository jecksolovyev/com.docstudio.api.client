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
 * Template Restrictions
 */
@Schema(description = "Template Restrictions")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-14T13:27:59.020080107Z[GMT]")
public class TemplateRestriction {
  @SerializedName("image")
  private ImageRestriction image = null;

  @SerializedName("logo")
  private LogoImageRestriction logo = null;

  @SerializedName("expireAfterDays")
  private Integer expireAfterDays = null;

  @SerializedName("notifyInDays")
  private Integer notifyInDays = null;

  /**
   * Gets or Sets defaultPageSize
   */
  @JsonAdapter(DefaultPageSizeEnum.Adapter.class)
  public enum DefaultPageSizeEnum {
    A2("A2"),
    A3("A3"),
    A4("A4"),
    A5("A5"),
    LETTER("letter");

    private String value;

    DefaultPageSizeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DefaultPageSizeEnum fromValue(String input) {
      for (DefaultPageSizeEnum b : DefaultPageSizeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DefaultPageSizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultPageSizeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DefaultPageSizeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DefaultPageSizeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("defaultPageSize")
  private DefaultPageSizeEnum defaultPageSize = null;

  @SerializedName("supportedPageSizes")
  private List<DocumentPageSizeDTO> supportedPageSizes = null;

  public TemplateRestriction image(ImageRestriction image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @Schema(description = "")
  public ImageRestriction getImage() {
    return image;
  }

  public void setImage(ImageRestriction image) {
    this.image = image;
  }

  public TemplateRestriction logo(LogoImageRestriction logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  @Schema(description = "")
  public LogoImageRestriction getLogo() {
    return logo;
  }

  public void setLogo(LogoImageRestriction logo) {
    this.logo = logo;
  }

  public TemplateRestriction expireAfterDays(Integer expireAfterDays) {
    this.expireAfterDays = expireAfterDays;
    return this;
  }

   /**
   * Get expireAfterDays
   * @return expireAfterDays
  **/
  @Schema(description = "")
  public Integer getExpireAfterDays() {
    return expireAfterDays;
  }

  public void setExpireAfterDays(Integer expireAfterDays) {
    this.expireAfterDays = expireAfterDays;
  }

  public TemplateRestriction notifyInDays(Integer notifyInDays) {
    this.notifyInDays = notifyInDays;
    return this;
  }

   /**
   * Get notifyInDays
   * @return notifyInDays
  **/
  @Schema(description = "")
  public Integer getNotifyInDays() {
    return notifyInDays;
  }

  public void setNotifyInDays(Integer notifyInDays) {
    this.notifyInDays = notifyInDays;
  }

  public TemplateRestriction defaultPageSize(DefaultPageSizeEnum defaultPageSize) {
    this.defaultPageSize = defaultPageSize;
    return this;
  }

   /**
   * Get defaultPageSize
   * @return defaultPageSize
  **/
  @Schema(description = "")
  public DefaultPageSizeEnum getDefaultPageSize() {
    return defaultPageSize;
  }

  public void setDefaultPageSize(DefaultPageSizeEnum defaultPageSize) {
    this.defaultPageSize = defaultPageSize;
  }

  public TemplateRestriction supportedPageSizes(List<DocumentPageSizeDTO> supportedPageSizes) {
    this.supportedPageSizes = supportedPageSizes;
    return this;
  }

  public TemplateRestriction addSupportedPageSizesItem(DocumentPageSizeDTO supportedPageSizesItem) {
    if (this.supportedPageSizes == null) {
      this.supportedPageSizes = new ArrayList<DocumentPageSizeDTO>();
    }
    this.supportedPageSizes.add(supportedPageSizesItem);
    return this;
  }

   /**
   * Get supportedPageSizes
   * @return supportedPageSizes
  **/
  @Schema(description = "")
  public List<DocumentPageSizeDTO> getSupportedPageSizes() {
    return supportedPageSizes;
  }

  public void setSupportedPageSizes(List<DocumentPageSizeDTO> supportedPageSizes) {
    this.supportedPageSizes = supportedPageSizes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateRestriction templateRestriction = (TemplateRestriction) o;
    return Objects.equals(this.image, templateRestriction.image) &&
        Objects.equals(this.logo, templateRestriction.logo) &&
        Objects.equals(this.expireAfterDays, templateRestriction.expireAfterDays) &&
        Objects.equals(this.notifyInDays, templateRestriction.notifyInDays) &&
        Objects.equals(this.defaultPageSize, templateRestriction.defaultPageSize) &&
        Objects.equals(this.supportedPageSizes, templateRestriction.supportedPageSizes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, logo, expireAfterDays, notifyInDays, defaultPageSize, supportedPageSizes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateRestriction {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    expireAfterDays: ").append(toIndentedString(expireAfterDays)).append("\n");
    sb.append("    notifyInDays: ").append(toIndentedString(notifyInDays)).append("\n");
    sb.append("    defaultPageSize: ").append(toIndentedString(defaultPageSize)).append("\n");
    sb.append("    supportedPageSizes: ").append(toIndentedString(supportedPageSizes)).append("\n");
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