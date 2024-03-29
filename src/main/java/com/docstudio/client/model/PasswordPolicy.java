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

/**
 * Password policy
 */
@Schema(description = "Password policy")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class PasswordPolicy {
  @SerializedName("minLength")
  private Integer minLength = null;

  @SerializedName("maxLength")
  private Integer maxLength = null;

  @SerializedName("uppercase")
  private Integer uppercase = null;

  @SerializedName("lowercase")
  private Integer lowercase = null;

  @SerializedName("digit")
  private Integer digit = null;

  @SerializedName("specialSymbol")
  private Integer specialSymbol = null;

  @SerializedName("repeatCharacter")
  private Integer repeatCharacter = null;

  @SerializedName("allowWhitespace")
  private Boolean allowWhitespace = null;

  @SerializedName("preventCommonPasswords")
  private Boolean preventCommonPasswords = null;

  @SerializedName("preventCommonWords")
  private Boolean preventCommonWords = null;

  @SerializedName("expirationDays")
  private Integer expirationDays = null;

  @SerializedName("notifyBeforeDays")
  private Integer notifyBeforeDays = null;

  @SerializedName("preventReuseMonths")
  private Integer preventReuseMonths = null;

  @SerializedName("preventReuseCount")
  private Integer preventReuseCount = null;

  public PasswordPolicy minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * Get minLength
   * @return minLength
  **/
  @Schema(description = "")
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public PasswordPolicy maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Get maxLength
   * @return maxLength
  **/
  @Schema(description = "")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public PasswordPolicy uppercase(Integer uppercase) {
    this.uppercase = uppercase;
    return this;
  }

   /**
   * Get uppercase
   * @return uppercase
  **/
  @Schema(description = "")
  public Integer getUppercase() {
    return uppercase;
  }

  public void setUppercase(Integer uppercase) {
    this.uppercase = uppercase;
  }

  public PasswordPolicy lowercase(Integer lowercase) {
    this.lowercase = lowercase;
    return this;
  }

   /**
   * Get lowercase
   * @return lowercase
  **/
  @Schema(description = "")
  public Integer getLowercase() {
    return lowercase;
  }

  public void setLowercase(Integer lowercase) {
    this.lowercase = lowercase;
  }

  public PasswordPolicy digit(Integer digit) {
    this.digit = digit;
    return this;
  }

   /**
   * Get digit
   * @return digit
  **/
  @Schema(description = "")
  public Integer getDigit() {
    return digit;
  }

  public void setDigit(Integer digit) {
    this.digit = digit;
  }

  public PasswordPolicy specialSymbol(Integer specialSymbol) {
    this.specialSymbol = specialSymbol;
    return this;
  }

   /**
   * Get specialSymbol
   * @return specialSymbol
  **/
  @Schema(description = "")
  public Integer getSpecialSymbol() {
    return specialSymbol;
  }

  public void setSpecialSymbol(Integer specialSymbol) {
    this.specialSymbol = specialSymbol;
  }

  public PasswordPolicy repeatCharacter(Integer repeatCharacter) {
    this.repeatCharacter = repeatCharacter;
    return this;
  }

   /**
   * Get repeatCharacter
   * @return repeatCharacter
  **/
  @Schema(description = "")
  public Integer getRepeatCharacter() {
    return repeatCharacter;
  }

  public void setRepeatCharacter(Integer repeatCharacter) {
    this.repeatCharacter = repeatCharacter;
  }

  public PasswordPolicy allowWhitespace(Boolean allowWhitespace) {
    this.allowWhitespace = allowWhitespace;
    return this;
  }

   /**
   * Get allowWhitespace
   * @return allowWhitespace
  **/
  @Schema(description = "")
  public Boolean isAllowWhitespace() {
    return allowWhitespace;
  }

  public void setAllowWhitespace(Boolean allowWhitespace) {
    this.allowWhitespace = allowWhitespace;
  }

  public PasswordPolicy preventCommonPasswords(Boolean preventCommonPasswords) {
    this.preventCommonPasswords = preventCommonPasswords;
    return this;
  }

   /**
   * Get preventCommonPasswords
   * @return preventCommonPasswords
  **/
  @Schema(description = "")
  public Boolean isPreventCommonPasswords() {
    return preventCommonPasswords;
  }

  public void setPreventCommonPasswords(Boolean preventCommonPasswords) {
    this.preventCommonPasswords = preventCommonPasswords;
  }

  public PasswordPolicy preventCommonWords(Boolean preventCommonWords) {
    this.preventCommonWords = preventCommonWords;
    return this;
  }

   /**
   * Get preventCommonWords
   * @return preventCommonWords
  **/
  @Schema(description = "")
  public Boolean isPreventCommonWords() {
    return preventCommonWords;
  }

  public void setPreventCommonWords(Boolean preventCommonWords) {
    this.preventCommonWords = preventCommonWords;
  }

  public PasswordPolicy expirationDays(Integer expirationDays) {
    this.expirationDays = expirationDays;
    return this;
  }

   /**
   * Get expirationDays
   * @return expirationDays
  **/
  @Schema(description = "")
  public Integer getExpirationDays() {
    return expirationDays;
  }

  public void setExpirationDays(Integer expirationDays) {
    this.expirationDays = expirationDays;
  }

  public PasswordPolicy notifyBeforeDays(Integer notifyBeforeDays) {
    this.notifyBeforeDays = notifyBeforeDays;
    return this;
  }

   /**
   * Get notifyBeforeDays
   * @return notifyBeforeDays
  **/
  @Schema(description = "")
  public Integer getNotifyBeforeDays() {
    return notifyBeforeDays;
  }

  public void setNotifyBeforeDays(Integer notifyBeforeDays) {
    this.notifyBeforeDays = notifyBeforeDays;
  }

  public PasswordPolicy preventReuseMonths(Integer preventReuseMonths) {
    this.preventReuseMonths = preventReuseMonths;
    return this;
  }

   /**
   * Get preventReuseMonths
   * @return preventReuseMonths
  **/
  @Schema(description = "")
  public Integer getPreventReuseMonths() {
    return preventReuseMonths;
  }

  public void setPreventReuseMonths(Integer preventReuseMonths) {
    this.preventReuseMonths = preventReuseMonths;
  }

  public PasswordPolicy preventReuseCount(Integer preventReuseCount) {
    this.preventReuseCount = preventReuseCount;
    return this;
  }

   /**
   * Get preventReuseCount
   * @return preventReuseCount
  **/
  @Schema(description = "")
  public Integer getPreventReuseCount() {
    return preventReuseCount;
  }

  public void setPreventReuseCount(Integer preventReuseCount) {
    this.preventReuseCount = preventReuseCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordPolicy passwordPolicy = (PasswordPolicy) o;
    return Objects.equals(this.minLength, passwordPolicy.minLength) &&
        Objects.equals(this.maxLength, passwordPolicy.maxLength) &&
        Objects.equals(this.uppercase, passwordPolicy.uppercase) &&
        Objects.equals(this.lowercase, passwordPolicy.lowercase) &&
        Objects.equals(this.digit, passwordPolicy.digit) &&
        Objects.equals(this.specialSymbol, passwordPolicy.specialSymbol) &&
        Objects.equals(this.repeatCharacter, passwordPolicy.repeatCharacter) &&
        Objects.equals(this.allowWhitespace, passwordPolicy.allowWhitespace) &&
        Objects.equals(this.preventCommonPasswords, passwordPolicy.preventCommonPasswords) &&
        Objects.equals(this.preventCommonWords, passwordPolicy.preventCommonWords) &&
        Objects.equals(this.expirationDays, passwordPolicy.expirationDays) &&
        Objects.equals(this.notifyBeforeDays, passwordPolicy.notifyBeforeDays) &&
        Objects.equals(this.preventReuseMonths, passwordPolicy.preventReuseMonths) &&
        Objects.equals(this.preventReuseCount, passwordPolicy.preventReuseCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minLength, maxLength, uppercase, lowercase, digit, specialSymbol, repeatCharacter, allowWhitespace, preventCommonPasswords, preventCommonWords, expirationDays, notifyBeforeDays, preventReuseMonths, preventReuseCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicy {\n");
    
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    uppercase: ").append(toIndentedString(uppercase)).append("\n");
    sb.append("    lowercase: ").append(toIndentedString(lowercase)).append("\n");
    sb.append("    digit: ").append(toIndentedString(digit)).append("\n");
    sb.append("    specialSymbol: ").append(toIndentedString(specialSymbol)).append("\n");
    sb.append("    repeatCharacter: ").append(toIndentedString(repeatCharacter)).append("\n");
    sb.append("    allowWhitespace: ").append(toIndentedString(allowWhitespace)).append("\n");
    sb.append("    preventCommonPasswords: ").append(toIndentedString(preventCommonPasswords)).append("\n");
    sb.append("    preventCommonWords: ").append(toIndentedString(preventCommonWords)).append("\n");
    sb.append("    expirationDays: ").append(toIndentedString(expirationDays)).append("\n");
    sb.append("    notifyBeforeDays: ").append(toIndentedString(notifyBeforeDays)).append("\n");
    sb.append("    preventReuseMonths: ").append(toIndentedString(preventReuseMonths)).append("\n");
    sb.append("    preventReuseCount: ").append(toIndentedString(preventReuseCount)).append("\n");
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
