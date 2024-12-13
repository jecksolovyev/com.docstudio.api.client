/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R120.9
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Object type
 */
@JsonAdapter(ActivityLogObjectType.Adapter.class)
public enum ActivityLogObjectType {

  TEMPLATE("template"),

  ENVELOPE("envelope"),

  DICTIONARY("dictionary"),

  MAILBOX("mailbox"),

  MAILBOX_ALIAS("mailbox_alias"),

  CATEGORY("category"),

  MAILBOX_FILTER("mailbox_filter"),

  MAILBOX_LABEL("mailbox_label"),

  USER("user"),

  ACCOUNT("account"),

  SCENARIO("scenario"),

  ACCOUNT_DOMAIN("account_domain"),

  ROLE("role"),

  INTEGRATION_RULE("integration_rule"),

  CRYPTO_CONFIG("crypto_config"),

  EXTERNAL_LINK("external_link"),

  APPROVAL_FLOW("approval_flow"),

  ACCOUNT_TARIFF("account_tariff"),

  ACCOUNT_SSO_ID_PROVIDER("account_sso_id_provider");

  private String value;

  ActivityLogObjectType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActivityLogObjectType fromValue(String value) {
    for (ActivityLogObjectType b : ActivityLogObjectType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ActivityLogObjectType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ActivityLogObjectType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActivityLogObjectType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ActivityLogObjectType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ActivityLogObjectType.fromValue(value);
  }
}

