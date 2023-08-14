/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R86.31
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

/**
 * Application Links
 */
@Schema(description = "Application Links")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-14T22:02:04.375144579Z[GMT]")

public class AppLinks {
  @SerializedName("officialUrl")
  private String officialUrl = null;

  @SerializedName("baseUrl")
  private String baseUrl = null;

  @SerializedName("docsUrl")
  private String docsUrl = null;

  @SerializedName("errorListUrl")
  private String errorListUrl = null;

  @SerializedName("termsAndConditions")
  private String termsAndConditions = null;

  @SerializedName("privacyPolicy")
  private String privacyPolicy = null;

  @SerializedName("youtubeUrl")
  private String youtubeUrl = null;

  @SerializedName("videoUrl")
  private String videoUrl = null;

  @SerializedName("whatsNewUrl")
  private String whatsNewUrl = null;

  public AppLinks officialUrl(String officialUrl) {
    this.officialUrl = officialUrl;
    return this;
  }

   /**
   * Get officialUrl
   * @return officialUrl
  **/
  @Schema(description = "")
  public String getOfficialUrl() {
    return officialUrl;
  }

  public void setOfficialUrl(String officialUrl) {
    this.officialUrl = officialUrl;
  }

  public AppLinks baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

   /**
   * Get baseUrl
   * @return baseUrl
  **/
  @Schema(description = "")
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public AppLinks docsUrl(String docsUrl) {
    this.docsUrl = docsUrl;
    return this;
  }

   /**
   * Get docsUrl
   * @return docsUrl
  **/
  @Schema(description = "")
  public String getDocsUrl() {
    return docsUrl;
  }

  public void setDocsUrl(String docsUrl) {
    this.docsUrl = docsUrl;
  }

  public AppLinks errorListUrl(String errorListUrl) {
    this.errorListUrl = errorListUrl;
    return this;
  }

   /**
   * Get errorListUrl
   * @return errorListUrl
  **/
  @Schema(description = "")
  public String getErrorListUrl() {
    return errorListUrl;
  }

  public void setErrorListUrl(String errorListUrl) {
    this.errorListUrl = errorListUrl;
  }

  public AppLinks termsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

   /**
   * Get termsAndConditions
   * @return termsAndConditions
  **/
  @Schema(description = "")
  public String getTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  public AppLinks privacyPolicy(String privacyPolicy) {
    this.privacyPolicy = privacyPolicy;
    return this;
  }

   /**
   * Get privacyPolicy
   * @return privacyPolicy
  **/
  @Schema(description = "")
  public String getPrivacyPolicy() {
    return privacyPolicy;
  }

  public void setPrivacyPolicy(String privacyPolicy) {
    this.privacyPolicy = privacyPolicy;
  }

  public AppLinks youtubeUrl(String youtubeUrl) {
    this.youtubeUrl = youtubeUrl;
    return this;
  }

   /**
   * Get youtubeUrl
   * @return youtubeUrl
  **/
  @Schema(description = "")
  public String getYoutubeUrl() {
    return youtubeUrl;
  }

  public void setYoutubeUrl(String youtubeUrl) {
    this.youtubeUrl = youtubeUrl;
  }

  public AppLinks videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * Get videoUrl
   * @return videoUrl
  **/
  @Schema(description = "")
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  public AppLinks whatsNewUrl(String whatsNewUrl) {
    this.whatsNewUrl = whatsNewUrl;
    return this;
  }

   /**
   * Get whatsNewUrl
   * @return whatsNewUrl
  **/
  @Schema(description = "")
  public String getWhatsNewUrl() {
    return whatsNewUrl;
  }

  public void setWhatsNewUrl(String whatsNewUrl) {
    this.whatsNewUrl = whatsNewUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppLinks appLinks = (AppLinks) o;
    return Objects.equals(this.officialUrl, appLinks.officialUrl) &&
        Objects.equals(this.baseUrl, appLinks.baseUrl) &&
        Objects.equals(this.docsUrl, appLinks.docsUrl) &&
        Objects.equals(this.errorListUrl, appLinks.errorListUrl) &&
        Objects.equals(this.termsAndConditions, appLinks.termsAndConditions) &&
        Objects.equals(this.privacyPolicy, appLinks.privacyPolicy) &&
        Objects.equals(this.youtubeUrl, appLinks.youtubeUrl) &&
        Objects.equals(this.videoUrl, appLinks.videoUrl) &&
        Objects.equals(this.whatsNewUrl, appLinks.whatsNewUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officialUrl, baseUrl, docsUrl, errorListUrl, termsAndConditions, privacyPolicy, youtubeUrl, videoUrl, whatsNewUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLinks {\n");
    
    sb.append("    officialUrl: ").append(toIndentedString(officialUrl)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    docsUrl: ").append(toIndentedString(docsUrl)).append("\n");
    sb.append("    errorListUrl: ").append(toIndentedString(errorListUrl)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    privacyPolicy: ").append(toIndentedString(privacyPolicy)).append("\n");
    sb.append("    youtubeUrl: ").append(toIndentedString(youtubeUrl)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    whatsNewUrl: ").append(toIndentedString(whatsNewUrl)).append("\n");
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
