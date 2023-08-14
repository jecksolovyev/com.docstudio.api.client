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

import java.util.UUID;
/**
 * UpdateProfileDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-14T22:02:04.375144579Z[GMT]")

public class UpdateProfileDTO {
  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("dateLocale")
  private String dateLocale = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("autoDepositMailboxUuid")
  private UUID autoDepositMailboxUuid = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("displayExactDate")
  private Boolean displayExactDate = null;

  @SerializedName("avatar")
  private String avatar = null;

  public UpdateProfileDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * User first name
   * @return firstName
  **/
  @Schema(required = true, description = "User first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UpdateProfileDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * User last name
   * @return lastName
  **/
  @Schema(required = true, description = "User last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UpdateProfileDTO locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * User locale
   * @return locale
  **/
  @Schema(required = true, description = "User locale")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public UpdateProfileDTO dateLocale(String dateLocale) {
    this.dateLocale = dateLocale;
    return this;
  }

   /**
   * User locale for dates
   * @return dateLocale
  **/
  @Schema(required = true, description = "User locale for dates")
  public String getDateLocale() {
    return dateLocale;
  }

  public void setDateLocale(String dateLocale) {
    this.dateLocale = dateLocale;
  }

  public UpdateProfileDTO timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * User timezone
   * @return timezone
  **/
  @Schema(required = true, description = "User timezone")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public UpdateProfileDTO autoDepositMailboxUuid(UUID autoDepositMailboxUuid) {
    this.autoDepositMailboxUuid = autoDepositMailboxUuid;
    return this;
  }

   /**
   * Auto Deposit Mailbox UUID
   * @return autoDepositMailboxUuid
  **/
  @Schema(description = "Auto Deposit Mailbox UUID")
  public UUID getAutoDepositMailboxUuid() {
    return autoDepositMailboxUuid;
  }

  public void setAutoDepositMailboxUuid(UUID autoDepositMailboxUuid) {
    this.autoDepositMailboxUuid = autoDepositMailboxUuid;
  }

  public UpdateProfileDTO phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * User phone
   * @return phone
  **/
  @Schema(description = "User phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UpdateProfileDTO displayExactDate(Boolean displayExactDate) {
    this.displayExactDate = displayExactDate;
    return this;
  }

   /**
   * Display exact date instead of relative
   * @return displayExactDate
  **/
  @Schema(description = "Display exact date instead of relative")
  public Boolean isDisplayExactDate() {
    return displayExactDate;
  }

  public void setDisplayExactDate(Boolean displayExactDate) {
    this.displayExactDate = displayExactDate;
  }

  public UpdateProfileDTO avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * User avatar in base64 format (svg, png, jpeg)
   * @return avatar
  **/
  @Schema(description = "User avatar in base64 format (svg, png, jpeg)")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateProfileDTO updateProfileDTO = (UpdateProfileDTO) o;
    return Objects.equals(this.firstName, updateProfileDTO.firstName) &&
        Objects.equals(this.lastName, updateProfileDTO.lastName) &&
        Objects.equals(this.locale, updateProfileDTO.locale) &&
        Objects.equals(this.dateLocale, updateProfileDTO.dateLocale) &&
        Objects.equals(this.timezone, updateProfileDTO.timezone) &&
        Objects.equals(this.autoDepositMailboxUuid, updateProfileDTO.autoDepositMailboxUuid) &&
        Objects.equals(this.phone, updateProfileDTO.phone) &&
        Objects.equals(this.displayExactDate, updateProfileDTO.displayExactDate) &&
        Objects.equals(this.avatar, updateProfileDTO.avatar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, locale, dateLocale, timezone, autoDepositMailboxUuid, phone, displayExactDate, avatar);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProfileDTO {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateLocale: ").append(toIndentedString(dateLocale)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    autoDepositMailboxUuid: ").append(toIndentedString(autoDepositMailboxUuid)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    displayExactDate: ").append(toIndentedString(displayExactDate)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
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
