/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R127.4
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
 * Action performed
 */
@JsonAdapter(ActivityLogAction.Adapter.class)
public enum ActivityLogAction {
  
  TEMPLATE_READ("template-read"),
  
  TEMPLATE_CREATED("template-created"),
  
  TEMPLATE_UPDATED("template-updated"),
  
  TEMPLATE_ARCHIVED("template-archived"),
  
  TEMPLATE_ZIP_STRUCTURE_CREATED("template-zip-structure-created"),
  
  TEMPLATE_ZIP_STRUCTURE_DELETED("template-zip-structure-deleted"),
  
  MAILBOX_CREATED("mailbox-created"),
  
  MAILBOX_ARCHIVED("mailbox-archived"),
  
  MAILBOX_NAME_CHANGED("mailbox-name-changed"),
  
  MAILBOX_FILTER_CREATED("mailbox-filter-created"),
  
  MAILBOX_FILTER_UPDATED("mailbox-filter-updated"),
  
  MAILBOX_FILTER_DELETED("mailbox-filter-deleted"),
  
  MAILBOX_LABEL_CREATED("mailbox-label-created"),
  
  MAILBOX_LABEL_UPDATED("mailbox-label-updated"),
  
  MAILBOX_LABEL_DELETED("mailbox-label-deleted"),
  
  MAILBOX_ALIAS_CREATED("mailbox-alias-created"),
  
  MAILBOX_ALIAS_DELETED("mailbox-alias-deleted"),
  
  MAILBOX_INTEGRATION_UPDATED("mailbox-integration-updated"),
  
  MAILBOX_ENTITIES_TRANSFERRED("mailbox-entities-transferred"),
  
  USER_INVITED("user-invited"),
  
  USER_INVITATION_REVOKED("user-invitation-revoked"),
  
  USER_ACCEPTED_INVITATION("user-accepted-invitation"),
  
  USER_DECLINED_INVITATION("user-declined-invitation"),
  
  USER_PERMISSIONS_CHANGED("user-permissions-changed"),
  
  USER_PASSWORD_RESET("user-password-reset"),
  
  USER_PASSWORD_RENEW("user-password-renew"),
  
  USER_BLOCKED("user-blocked"),
  
  USER_UNBLOCKED("user-unblocked"),
  
  USER_CREATED("user-created"),
  
  USER_DELETED("user-deleted"),
  
  USER_LEFT_MAILBOX("user-left-mailbox"),
  
  USER_PROFILE_UPDATED_BY_ADMIN("user-profile-updated-by-admin"),
  
  CATEGORY_CREATED("category-created"),
  
  CATEGORY_UPDATED("category-updated"),
  
  CATEGORY_DELETED("category-deleted"),
  
  CATEGORY_MOVED("category-moved"),
  
  DICTIONARY_CREATED("dictionary-created"),
  
  DICTIONARY_UPDATED("dictionary-updated"),
  
  DICTIONARY_ACCESS_CHANGED("dictionary-access-changed"),
  
  DICTIONARY_COLUMN_CREATED("dictionary-column-created"),
  
  DICTIONARY_COLUMN_UPDATED("dictionary-column-updated"),
  
  DICTIONARY_COLUMN_DELETED("dictionary-column-deleted"),
  
  DICTIONARY_RECORD_CREATED("dictionary-record-created"),
  
  DICTIONARY_RECORD_UPDATED("dictionary-record-updated"),
  
  DICTIONARY_RECORD_DELETED("dictionary-record-deleted"),
  
  DICTIONARY_ARCHIVED("dictionary-archived"),
  
  DICTIONARY_DOWNLOAD("dictionary-download"),
  
  DICTIONARY_UPLOADED("dictionary-uploaded"),
  
  ENVELOPE_READ("envelope-read"),
  
  ENVELOPE_DRAFT_CREATED("envelope-draft-created"),
  
  ENVELOPE_DRAFT_UPDATED("envelope-draft-updated"),
  
  ENVELOPE_DRAFT_DELETED("envelope-draft-deleted"),
  
  ENVELOPE_LABEL_ASSIGNED("envelope-label-assigned"),
  
  ENVELOPE_LABEL_UNASSIGNED("envelope-label-unassigned"),
  
  ENVELOPE_SENT("envelope-sent"),
  
  ENVELOPE_ARCHIVED("envelope-archived"),
  
  ENVELOPE_UNARCHIVED("envelope-unarchived"),
  
  ENVELOPE_UPDATED("envelope-updated"),
  
  ENVELOPE_DATA_UPDATED("envelope-data-updated"),
  
  ENVELOPE_RECEIVED("envelope-received"),
  
  ENVELOPE_COMPLETED("envelope-completed"),
  
  ENVELOPE_CANCELLED("envelope-cancelled"),
  
  ENVELOPE_EXPIRED("envelope-expired"),
  
  ENVELOPE_INVITATION_ACCEPTED("envelope-invitation-accepted"),
  
  ENVELOPE_REPORT_DOWNLOAD("envelope-report-download"),
  
  ENVELOPE_DELEGATED("envelope-delegated"),
  
  ENVELOPE_DELEGATION_CANCELLED("envelope-delegation-cancelled"),
  
  ENVELOPE_SENT_FOR_APPROVAL("envelope-sent-for-approval"),
  
  ENVELOPE_APPROVAL_CANCELLED("envelope-approval-cancelled"),
  
  ENVELOPE_APPROVED("envelope-approved"),
  
  ENVELOPE_REJECTED("envelope-rejected"),
  
  ENVELOPE_DELETED("envelope-deleted"),
  
  ENVELOPE_RESTORED("envelope-restored"),
  
  ENVELOPE_ARCHIVE_SHARED("envelope-archive-shared"),
  
  ENVELOPE_ARCHIVE_DOWNLOADED("envelope-archive-downloaded"),
  
  ENVELOPE_COPY_SHARED("envelope-copy-shared"),
  
  ENVELOPE_SHARED_COPY_REVOKED("envelope-shared-copy-revoked"),
  
  ENVELOPE_ERASED("envelope-erased"),
  
  ENVELOPE_COLUMNS_SETTINGS_RESET("envelope-columns-settings-reset"),
  
  ENVELOPE_ADDED_INTO_CHAIN("envelope-added-into-chain"),
  
  ENVELOPE_REMOVED_FROM_CHAIN("envelope-removed-from-chain"),
  
  APPROVAL_FLOW_CREATED("approval-flow-created"),
  
  APPROVAL_FLOW_UPDATED("approval-flow-updated"),
  
  APPROVAL_FLOW_DELETED("approval-flow-deleted"),
  
  SCENARIO_CREATED("scenario-created"),
  
  SCENARIO_UPDATED("scenario-updated"),
  
  SCENARIO_DELETED("scenario-deleted"),
  
  SCENARIO_CLONED("scenario-cloned"),
  
  SCENARIO_RUN("scenario-run"),
  
  ACCOUNT_CREATED("account-created"),
  
  ACCOUNT_UPDATED("account-updated"),
  
  ACCOUNT_POLICIES_UPDATED("account-policies-updated"),
  
  ACCOUNT_CRYPTO_CONFIG_CREATED("account-crypto-config-created"),
  
  ACCOUNT_CRYPTO_CONFIG_DELETED("account-crypto-config-deleted"),
  
  ACCOUNT_EXTERNAL_LINK_CREATED("account-external-link-created"),
  
  ACCOUNT_EXTERNAL_LINK_UPDATED("account-external-link-updated"),
  
  ACCOUNT_EXTERNAL_LINK_DELETED("account-external-link-deleted"),
  
  ACCOUNT_DOMAIN_CREATED("account-domain-created"),
  
  ACCOUNT_DOMAIN_UPDATED("account-domain-updated"),
  
  ACCOUNT_DOMAIN_DELETED("account-domain-deleted"),
  
  ACCOUNT_AUDIT_READ("account-audit-read"),
  
  ACCOUNT_MAILBOXES_REPORT_DOWNLOAD("account-mailboxes-report-download"),
  
  ACCOUNT_USERS_REPORT_DOWNLOAD("account-users-report-download"),
  
  ACCOUNT_TARIFF_CHANGED("account-tariff-changed"),
  
  ACCOUNT_SSO_IDP_CREATED("account-sso-idp-created"),
  
  ACCOUNT_SSO_IDP_UPDATED("account-sso-idp-updated"),
  
  ACCOUNT_SSO_IDP_DELETED("account-sso-idp-deleted"),
  
  ROLE_CREATED("role-created"),
  
  ROLE_UPDATED("role-updated"),
  
  ROLE_DELETED("role-deleted"),
  
  INTEGRATION_RULE_CREATED("integration-rule-created"),
  
  INTEGRATION_RULE_UPDATED("integration-rule-updated"),
  
  INTEGRATION_RULE_DELETED("integration-rule-deleted"),
  
  FORBIDDEN_ERROR("forbidden-error"),
  
  NOT_FOUND_ERROR("not-found-error"),
  
  UNAUTHORIZED_ERROR("unauthorized-error");

  private String value;

  ActivityLogAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActivityLogAction fromValue(String value) {
    for (ActivityLogAction b : ActivityLogAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ActivityLogAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final ActivityLogAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActivityLogAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ActivityLogAction.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ActivityLogAction.fromValue(value);
  }
}

