/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R125.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Billing event
 */
@JsonAdapter(BillingEventType.Adapter.class)
public enum BillingEventType {
  
  NEW_CORP_USER("new-corp-user"),
  
  NEW_ACCOUNT_INVITE("new-account-invite"),
  
  INCOME_ENVELOPE("income-envelope"),
  
  SENT_ENVELOPE("sent-envelope"),
  
  ARCHIVE_ENVELOPE("archive-envelope"),
  
  UNARCHIVE_ENVELOPE("unarchive-envelope"),
  
  DELETE_ENVELOPE("delete-envelope"),
  
  RESTORE_ENVELOPE("restore-envelope"),
  
  ACCOUNT_MAILBOX("account-mailbox"),
  
  DIG_SIGN_ENVELOPE("dig-sign-envelope"),
  
  ACCOUNT_DOMAIN("account-domain"),
  
  INTEGRATION_RULE("integration-rule"),
  
  ENVELOPE_SCENARIO("envelope-scenario"),
  
  CLOUD_SIGNATURE("cloud-signature"),
  
  ENVELOPE_APPROVAL("envelope-approval"),
  
  PASSWORD_POLICY("password-policy"),
  
  CALLBACK_SENT("callback-sent"),
  
  CREATE_TEMPLATE("create-template"),
  
  DELETE_TEMPLATE("delete-template"),
  
  ALLOW_TEMPLATE("allow-template");

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

  public static BillingEventType fromValue(String value) {
    for (BillingEventType b : BillingEventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BillingEventType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BillingEventType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BillingEventType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BillingEventType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    BillingEventType.fromValue(value);
  }
}

