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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * ProfileDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class ProfileDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  /**
   * User status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("PENDING_INVITE")
    PENDING_INVITE("PENDING_INVITE"),
    @SerializedName("ACTIVE")
    ACTIVE("ACTIVE"),
    @SerializedName("BLOCKED")
    BLOCKED("BLOCKED"),
    @SerializedName("PENDING_PASSWORD")
    PENDING_PASSWORD("PENDING_PASSWORD"),
    @SerializedName("DELETED")
    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("dateLocale")
  private String dateLocale = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("corporateUser")
  private Boolean corporateUser = null;

  @SerializedName("ssoEnabled")
  private Boolean ssoEnabled = null;

  @SerializedName("autoDepositMailboxUuid")
  private UUID autoDepositMailboxUuid = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("displayExactDate")
  private Boolean displayExactDate = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("accounts")
  private List<User2AccountWithMailboxesDTO> accounts = null;

  public ProfileDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * User uuid
   * @return uuid
  **/
  @Schema(description = "User uuid")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public ProfileDTO email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User email
   * @return email
  **/
  @Schema(description = "User email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ProfileDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * User first name
   * @return firstName
  **/
  @Schema(description = "User first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ProfileDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * User last name
   * @return lastName
  **/
  @Schema(description = "User last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ProfileDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * User status
   * @return status
  **/
  @Schema(description = "User status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ProfileDTO dateLocale(String dateLocale) {
    this.dateLocale = dateLocale;
    return this;
  }

   /**
   * User locale for dates
   * @return dateLocale
  **/
  @Schema(description = "User locale for dates")
  public String getDateLocale() {
    return dateLocale;
  }

  public void setDateLocale(String dateLocale) {
    this.dateLocale = dateLocale;
  }

  public ProfileDTO locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * User locale
   * @return locale
  **/
  @Schema(description = "User locale")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public ProfileDTO timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * User timezone
   * @return timezone
  **/
  @Schema(description = "User timezone")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public ProfileDTO corporateUser(Boolean corporateUser) {
    this.corporateUser = corporateUser;
    return this;
  }

   /**
   * Is corporate user
   * @return corporateUser
  **/
  @Schema(description = "Is corporate user")
  public Boolean isCorporateUser() {
    return corporateUser;
  }

  public void setCorporateUser(Boolean corporateUser) {
    this.corporateUser = corporateUser;
  }

  public ProfileDTO ssoEnabled(Boolean ssoEnabled) {
    this.ssoEnabled = ssoEnabled;
    return this;
  }

   /**
   * Is SSO enabled for user
   * @return ssoEnabled
  **/
  @Schema(description = "Is SSO enabled for user")
  public Boolean isSsoEnabled() {
    return ssoEnabled;
  }

  public void setSsoEnabled(Boolean ssoEnabled) {
    this.ssoEnabled = ssoEnabled;
  }

  public ProfileDTO autoDepositMailboxUuid(UUID autoDepositMailboxUuid) {
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

  public ProfileDTO phone(String phone) {
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

  public ProfileDTO displayExactDate(Boolean displayExactDate) {
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

  public ProfileDTO signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Saved eInk signature
   * @return signature
  **/
  @Schema(description = "Saved eInk signature")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public ProfileDTO accounts(List<User2AccountWithMailboxesDTO> accounts) {
    this.accounts = accounts;
    return this;
  }

  public ProfileDTO addAccountsItem(User2AccountWithMailboxesDTO accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<User2AccountWithMailboxesDTO>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * User accounts belongs to
   * @return accounts
  **/
  @Schema(description = "User accounts belongs to")
  public List<User2AccountWithMailboxesDTO> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<User2AccountWithMailboxesDTO> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileDTO profileDTO = (ProfileDTO) o;
    return Objects.equals(this.uuid, profileDTO.uuid) &&
        Objects.equals(this.email, profileDTO.email) &&
        Objects.equals(this.firstName, profileDTO.firstName) &&
        Objects.equals(this.lastName, profileDTO.lastName) &&
        Objects.equals(this.status, profileDTO.status) &&
        Objects.equals(this.dateLocale, profileDTO.dateLocale) &&
        Objects.equals(this.locale, profileDTO.locale) &&
        Objects.equals(this.timezone, profileDTO.timezone) &&
        Objects.equals(this.corporateUser, profileDTO.corporateUser) &&
        Objects.equals(this.ssoEnabled, profileDTO.ssoEnabled) &&
        Objects.equals(this.autoDepositMailboxUuid, profileDTO.autoDepositMailboxUuid) &&
        Objects.equals(this.phone, profileDTO.phone) &&
        Objects.equals(this.displayExactDate, profileDTO.displayExactDate) &&
        Objects.equals(this.signature, profileDTO.signature) &&
        Objects.equals(this.accounts, profileDTO.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, email, firstName, lastName, status, dateLocale, locale, timezone, corporateUser, ssoEnabled, autoDepositMailboxUuid, phone, displayExactDate, signature, accounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateLocale: ").append(toIndentedString(dateLocale)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    corporateUser: ").append(toIndentedString(corporateUser)).append("\n");
    sb.append("    ssoEnabled: ").append(toIndentedString(ssoEnabled)).append("\n");
    sb.append("    autoDepositMailboxUuid: ").append(toIndentedString(autoDepositMailboxUuid)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    displayExactDate: ").append(toIndentedString(displayExactDate)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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
