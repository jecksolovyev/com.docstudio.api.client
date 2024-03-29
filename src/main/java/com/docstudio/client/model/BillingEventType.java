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

import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Billing event
 */
@JsonAdapter(BillingEventType.Adapter.class)
public enum BillingEventType {
  @SerializedName("new-corp-user")
  NEW_CORP_USER("new-corp-user"),
  @SerializedName("new-account-invite")
  NEW_ACCOUNT_INVITE("new-account-invite"),
  @SerializedName("income-envelope")
  INCOME_ENVELOPE("income-envelope"),
  @SerializedName("sent-envelope")
  SENT_ENVELOPE("sent-envelope"),
  @SerializedName("archive-envelope")
  ARCHIVE_ENVELOPE("archive-envelope"),
  @SerializedName("unarchive-envelope")
  UNARCHIVE_ENVELOPE("unarchive-envelope"),
  @SerializedName("delete-envelope")
  DELETE_ENVELOPE("delete-envelope"),
  @SerializedName("restore-envelope")
  RESTORE_ENVELOPE("restore-envelope"),
  @SerializedName("account-mailbox")
  ACCOUNT_MAILBOX("account-mailbox"),
  @SerializedName("dig-sign-envelope")
  DIG_SIGN_ENVELOPE("dig-sign-envelope"),
  @SerializedName("account-domain")
  ACCOUNT_DOMAIN("account-domain"),
  @SerializedName("integration-rule")
  INTEGRATION_RULE("integration-rule"),
  @SerializedName("envelope-scenario")
  ENVELOPE_SCENARIO("envelope-scenario"),
  @SerializedName("cloud-signature")
  CLOUD_SIGNATURE("cloud-signature"),
  @SerializedName("envelope-approval")
  ENVELOPE_APPROVAL("envelope-approval"),
  @SerializedName("password-policy")
  PASSWORD_POLICY("password-policy"),
  @SerializedName("callback-sent")
  CALLBACK_SENT("callback-sent");

  private String value;

  BillingEventType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BillingEventType fromValue(String input) {
    for (BillingEventType b : BillingEventType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BillingEventType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BillingEventType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public BillingEventType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return BillingEventType.fromValue((String)(value));
    }
  }
}
