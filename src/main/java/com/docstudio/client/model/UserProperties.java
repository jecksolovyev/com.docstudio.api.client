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
import com.docstudio.client.model.PasswordPolicy;
import com.docstudio.client.model.SessionPolicy;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * User settings
 */
@Schema(description = "User settings")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class UserProperties {
  @SerializedName("profilePhone")
  private Boolean profilePhone = null;

  @SerializedName("passwordPolicy")
  private PasswordPolicy passwordPolicy = null;

  @SerializedName("sessionPolicy")
  private SessionPolicy sessionPolicy = null;

  /**
   * Gets or Sets measurementSystem
   */
  @JsonAdapter(MeasurementSystemEnum.Adapter.class)
  public enum MeasurementSystemEnum {
    @SerializedName("METRIC")
    METRIC("METRIC"),
    @SerializedName("IMPERIAL")
    IMPERIAL("IMPERIAL");

    private String value;

    MeasurementSystemEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MeasurementSystemEnum fromValue(String input) {
      for (MeasurementSystemEnum b : MeasurementSystemEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MeasurementSystemEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MeasurementSystemEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public MeasurementSystemEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return MeasurementSystemEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("measurementSystem")
  private MeasurementSystemEnum measurementSystem = null;

  @SerializedName("allowSelfDeletion")
  private Boolean allowSelfDeletion = null;

  @SerializedName("allowUserApplicationTokens")
  private Boolean allowUserApplicationTokens = null;

  @SerializedName("allowUsersToRegister")
  private Boolean allowUsersToRegister = null;

  @SerializedName("allowAutoDeposite")
  private Boolean allowAutoDeposite = null;

  @SerializedName("allowManageNotification")
  private Boolean allowManageNotification = null;

  public UserProperties profilePhone(Boolean profilePhone) {
    this.profilePhone = profilePhone;
    return this;
  }

   /**
   * Get profilePhone
   * @return profilePhone
  **/
  @Schema(description = "")
  public Boolean isProfilePhone() {
    return profilePhone;
  }

  public void setProfilePhone(Boolean profilePhone) {
    this.profilePhone = profilePhone;
  }

  public UserProperties passwordPolicy(PasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
    return this;
  }

   /**
   * Get passwordPolicy
   * @return passwordPolicy
  **/
  @Schema(description = "")
  public PasswordPolicy getPasswordPolicy() {
    return passwordPolicy;
  }

  public void setPasswordPolicy(PasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
  }

  public UserProperties sessionPolicy(SessionPolicy sessionPolicy) {
    this.sessionPolicy = sessionPolicy;
    return this;
  }

   /**
   * Get sessionPolicy
   * @return sessionPolicy
  **/
  @Schema(description = "")
  public SessionPolicy getSessionPolicy() {
    return sessionPolicy;
  }

  public void setSessionPolicy(SessionPolicy sessionPolicy) {
    this.sessionPolicy = sessionPolicy;
  }

  public UserProperties measurementSystem(MeasurementSystemEnum measurementSystem) {
    this.measurementSystem = measurementSystem;
    return this;
  }

   /**
   * Get measurementSystem
   * @return measurementSystem
  **/
  @Schema(description = "")
  public MeasurementSystemEnum getMeasurementSystem() {
    return measurementSystem;
  }

  public void setMeasurementSystem(MeasurementSystemEnum measurementSystem) {
    this.measurementSystem = measurementSystem;
  }

  public UserProperties allowSelfDeletion(Boolean allowSelfDeletion) {
    this.allowSelfDeletion = allowSelfDeletion;
    return this;
  }

   /**
   * Get allowSelfDeletion
   * @return allowSelfDeletion
  **/
  @Schema(description = "")
  public Boolean isAllowSelfDeletion() {
    return allowSelfDeletion;
  }

  public void setAllowSelfDeletion(Boolean allowSelfDeletion) {
    this.allowSelfDeletion = allowSelfDeletion;
  }

  public UserProperties allowUserApplicationTokens(Boolean allowUserApplicationTokens) {
    this.allowUserApplicationTokens = allowUserApplicationTokens;
    return this;
  }

   /**
   * Allow or deny user application tokens
   * @return allowUserApplicationTokens
  **/
  @Schema(description = "Allow or deny user application tokens")
  public Boolean isAllowUserApplicationTokens() {
    return allowUserApplicationTokens;
  }

  public void setAllowUserApplicationTokens(Boolean allowUserApplicationTokens) {
    this.allowUserApplicationTokens = allowUserApplicationTokens;
  }

  public UserProperties allowUsersToRegister(Boolean allowUsersToRegister) {
    this.allowUsersToRegister = allowUsersToRegister;
    return this;
  }

   /**
   * Allow or deny users to register
   * @return allowUsersToRegister
  **/
  @Schema(description = "Allow or deny users to register")
  public Boolean isAllowUsersToRegister() {
    return allowUsersToRegister;
  }

  public void setAllowUsersToRegister(Boolean allowUsersToRegister) {
    this.allowUsersToRegister = allowUsersToRegister;
  }

  public UserProperties allowAutoDeposite(Boolean allowAutoDeposite) {
    this.allowAutoDeposite = allowAutoDeposite;
    return this;
  }

   /**
   * Allow or deny users to set Auto Deposit Mailbox
   * @return allowAutoDeposite
  **/
  @Schema(description = "Allow or deny users to set Auto Deposit Mailbox")
  public Boolean isAllowAutoDeposite() {
    return allowAutoDeposite;
  }

  public void setAllowAutoDeposite(Boolean allowAutoDeposite) {
    this.allowAutoDeposite = allowAutoDeposite;
  }

  public UserProperties allowManageNotification(Boolean allowManageNotification) {
    this.allowManageNotification = allowManageNotification;
    return this;
  }

   /**
   * Allow or deny users to manage notifications
   * @return allowManageNotification
  **/
  @Schema(description = "Allow or deny users to manage notifications")
  public Boolean isAllowManageNotification() {
    return allowManageNotification;
  }

  public void setAllowManageNotification(Boolean allowManageNotification) {
    this.allowManageNotification = allowManageNotification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProperties userProperties = (UserProperties) o;
    return Objects.equals(this.profilePhone, userProperties.profilePhone) &&
        Objects.equals(this.passwordPolicy, userProperties.passwordPolicy) &&
        Objects.equals(this.sessionPolicy, userProperties.sessionPolicy) &&
        Objects.equals(this.measurementSystem, userProperties.measurementSystem) &&
        Objects.equals(this.allowSelfDeletion, userProperties.allowSelfDeletion) &&
        Objects.equals(this.allowUserApplicationTokens, userProperties.allowUserApplicationTokens) &&
        Objects.equals(this.allowUsersToRegister, userProperties.allowUsersToRegister) &&
        Objects.equals(this.allowAutoDeposite, userProperties.allowAutoDeposite) &&
        Objects.equals(this.allowManageNotification, userProperties.allowManageNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profilePhone, passwordPolicy, sessionPolicy, measurementSystem, allowSelfDeletion, allowUserApplicationTokens, allowUsersToRegister, allowAutoDeposite, allowManageNotification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProperties {\n");
    
    sb.append("    profilePhone: ").append(toIndentedString(profilePhone)).append("\n");
    sb.append("    passwordPolicy: ").append(toIndentedString(passwordPolicy)).append("\n");
    sb.append("    sessionPolicy: ").append(toIndentedString(sessionPolicy)).append("\n");
    sb.append("    measurementSystem: ").append(toIndentedString(measurementSystem)).append("\n");
    sb.append("    allowSelfDeletion: ").append(toIndentedString(allowSelfDeletion)).append("\n");
    sb.append("    allowUserApplicationTokens: ").append(toIndentedString(allowUserApplicationTokens)).append("\n");
    sb.append("    allowUsersToRegister: ").append(toIndentedString(allowUsersToRegister)).append("\n");
    sb.append("    allowAutoDeposite: ").append(toIndentedString(allowAutoDeposite)).append("\n");
    sb.append("    allowManageNotification: ").append(toIndentedString(allowManageNotification)).append("\n");
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
