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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
/**
 * Supported locales
 */
@Schema(description = "Supported locales")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-14T13:27:59.020080107Z[GMT]")
public class AppLocales {
  @SerializedName("defaultAsLanguage")
  private Boolean defaultAsLanguage = null;

  @SerializedName("defaultCountry")
  private String defaultCountry = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("defaultLocale")
  private String defaultLocale = null;

  @SerializedName("supported")
  private List<LocaleItemDTO> supported = null;

  public AppLocales defaultAsLanguage(Boolean defaultAsLanguage) {
    this.defaultAsLanguage = defaultAsLanguage;
    return this;
  }

   /**
   * Get defaultAsLanguage
   * @return defaultAsLanguage
  **/
  @Schema(description = "")
  public Boolean isDefaultAsLanguage() {
    return defaultAsLanguage;
  }

  public void setDefaultAsLanguage(Boolean defaultAsLanguage) {
    this.defaultAsLanguage = defaultAsLanguage;
  }

  public AppLocales defaultCountry(String defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

   /**
   * Get defaultCountry
   * @return defaultCountry
  **/
  @Schema(description = "")
  public String getDefaultCountry() {
    return defaultCountry;
  }

  public void setDefaultCountry(String defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  public AppLocales timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @Schema(description = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public AppLocales defaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

   /**
   * Get defaultLocale
   * @return defaultLocale
  **/
  @Schema(description = "")
  public String getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  public AppLocales supported(List<LocaleItemDTO> supported) {
    this.supported = supported;
    return this;
  }

  public AppLocales addSupportedItem(LocaleItemDTO supportedItem) {
    if (this.supported == null) {
      this.supported = new ArrayList<LocaleItemDTO>();
    }
    this.supported.add(supportedItem);
    return this;
  }

   /**
   * Get supported
   * @return supported
  **/
  @Schema(description = "")
  public List<LocaleItemDTO> getSupported() {
    return supported;
  }

  public void setSupported(List<LocaleItemDTO> supported) {
    this.supported = supported;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppLocales appLocales = (AppLocales) o;
    return Objects.equals(this.defaultAsLanguage, appLocales.defaultAsLanguage) &&
        Objects.equals(this.defaultCountry, appLocales.defaultCountry) &&
        Objects.equals(this.timezone, appLocales.timezone) &&
        Objects.equals(this.defaultLocale, appLocales.defaultLocale) &&
        Objects.equals(this.supported, appLocales.supported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultAsLanguage, defaultCountry, timezone, defaultLocale, supported);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLocales {\n");
    
    sb.append("    defaultAsLanguage: ").append(toIndentedString(defaultAsLanguage)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
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