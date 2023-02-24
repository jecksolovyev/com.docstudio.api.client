/*
 * Centredo Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R74.21
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
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
  USER_INVITED_TO_ACCOUNT("user-invited-to-account"),
  USER_INVITED_TO_MAILBOX("user-invited-to-mailbox"),
  USER_PERMISSIONS_CHANGED("user-permissions-changed"),
  USER_PASSWORD_RESET("user-password-reset"),
  USER_PASSWORD_RENEW("user-password-renew"),
  USER_BLOCKED("user-blocked"),
  USER_UNBLOCKED("user-unblocked"),
  USER_CREATED("user-created"),
  USER_DELETED("user-deleted"),
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

  public static ActivityLogAction fromValue(String input) {
    for (ActivityLogAction b : ActivityLogAction.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ActivityLogAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final ActivityLogAction enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ActivityLogAction read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ActivityLogAction.fromValue((String)(value));
    }
  }
}
