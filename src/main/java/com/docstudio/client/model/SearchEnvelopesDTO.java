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

import java.util.Objects;
import com.docstudio.client.model.SearchFieldValueDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.docstudio.client.JSON;

/**
 * Search parameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T18:50:48.300154-07:00[America/Edmonton]", comments = "Generator version: 7.10.0")
public class SearchEnvelopesDTO {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private Set<String> label = new LinkedHashSet<>();

  /**
   * Envelope scope
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    INBOX("inbox"),
    
    OUTBOX("outbox"),
    
    DRAFT("draft"),
    
    SHARED("shared");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ScopeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  @javax.annotation.Nullable
  private Set<ScopeEnum> scope = new LinkedHashSet<>();

  /**
   * Envelope status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFT("DRAFT"),
    
    SENT("SENT"),
    
    WAITING("WAITING"),
    
    COMPLETED("COMPLETED"),
    
    CANCELLED("CANCELLED"),
    
    EXPIRED("EXPIRED"),
    
    ON_APPROVAL("ON_APPROVAL");

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

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private Set<StatusEnum> status = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  @javax.annotation.Nullable
  private String subject;

  public static final String SERIALIZED_NAME_CREATE_DATE_FROM = "createDateFrom";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE_FROM)
  @javax.annotation.Nullable
  private OffsetDateTime createDateFrom;

  public static final String SERIALIZED_NAME_CREATE_DATE_TO = "createDateTo";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE_TO)
  @javax.annotation.Nullable
  private OffsetDateTime createDateTo;

  public static final String SERIALIZED_NAME_RECEIVE_DATE_FROM = "receiveDateFrom";
  @SerializedName(SERIALIZED_NAME_RECEIVE_DATE_FROM)
  @javax.annotation.Nullable
  private OffsetDateTime receiveDateFrom;

  public static final String SERIALIZED_NAME_RECEIVE_DATE_TO = "receiveDateTo";
  @SerializedName(SERIALIZED_NAME_RECEIVE_DATE_TO)
  @javax.annotation.Nullable
  private OffsetDateTime receiveDateTo;

  public static final String SERIALIZED_NAME_EXPIRE_DATE_FROM = "expireDateFrom";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_FROM)
  @javax.annotation.Nullable
  private OffsetDateTime expireDateFrom;

  public static final String SERIALIZED_NAME_EXPIRE_DATE_TO = "expireDateTo";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_TO)
  @javax.annotation.Nullable
  private OffsetDateTime expireDateTo;

  public static final String SERIALIZED_NAME_SEND_DATE_FROM = "sendDateFrom";
  @SerializedName(SERIALIZED_NAME_SEND_DATE_FROM)
  @javax.annotation.Nullable
  private OffsetDateTime sendDateFrom;

  public static final String SERIALIZED_NAME_SEND_DATE_TO = "sendDateTo";
  @SerializedName(SERIALIZED_NAME_SEND_DATE_TO)
  @javax.annotation.Nullable
  private OffsetDateTime sendDateTo;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  @javax.annotation.Nullable
  private Boolean archived;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  @javax.annotation.Nullable
  private Boolean deleted;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  @javax.annotation.Nullable
  private Set<UUID> template = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_ACTIVE_ROLE = "activeRole";
  @SerializedName(SERIALIZED_NAME_ACTIVE_ROLE)
  @javax.annotation.Nullable
  private Set<String> activeRole = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  @javax.annotation.Nullable
  private Set<UUID> sender = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  @javax.annotation.Nullable
  private Set<UUID> recipient = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_SORT_FIELD = "sortField";
  @SerializedName(SERIALIZED_NAME_SORT_FIELD)
  @javax.annotation.Nullable
  private String sortField;

  /**
   * Sort order, asc or desc
   */
  @JsonAdapter(SortEnum.Adapter.class)
  public enum SortEnum {
    DESC("desc"),
    
    ASC("asc");

    private String value;

    SortEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortEnum fromValue(String value) {
      for (SortEnum b : SortEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SortEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SortEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SortEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  @javax.annotation.Nullable
  private SortEnum sort;

  public static final String SERIALIZED_NAME_SEARCH_FIELDS = "searchFields";
  @SerializedName(SERIALIZED_NAME_SEARCH_FIELDS)
  @javax.annotation.Nullable
  private Set<SearchFieldValueDTO> searchFields = new LinkedHashSet<>();

  public SearchEnvelopesDTO() {
  }

  public SearchEnvelopesDTO label(@javax.annotation.Nullable Set<String> label) {
    this.label = label;
    return this;
  }

  public SearchEnvelopesDTO addLabelItem(String labelItem) {
    if (this.label == null) {
      this.label = new LinkedHashSet<>();
    }
    this.label.add(labelItem);
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nullable
  public Set<String> getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nullable Set<String> label) {
    this.label = label;
  }


  public SearchEnvelopesDTO scope(@javax.annotation.Nullable Set<ScopeEnum> scope) {
    this.scope = scope;
    return this;
  }

  public SearchEnvelopesDTO addScopeItem(ScopeEnum scopeItem) {
    if (this.scope == null) {
      this.scope = new LinkedHashSet<>();
    }
    this.scope.add(scopeItem);
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  @javax.annotation.Nullable
  public Set<ScopeEnum> getScope() {
    return scope;
  }

  public void setScope(@javax.annotation.Nullable Set<ScopeEnum> scope) {
    this.scope = scope;
  }


  public SearchEnvelopesDTO status(@javax.annotation.Nullable Set<StatusEnum> status) {
    this.status = status;
    return this;
  }

  public SearchEnvelopesDTO addStatusItem(StatusEnum statusItem) {
    if (this.status == null) {
      this.status = new LinkedHashSet<>();
    }
    this.status.add(statusItem);
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public Set<StatusEnum> getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable Set<StatusEnum> status) {
    this.status = status;
  }


  public SearchEnvelopesDTO subject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Envelope subject
   * @return subject
   */
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
  }


  public SearchEnvelopesDTO createDateFrom(@javax.annotation.Nullable OffsetDateTime createDateFrom) {
    this.createDateFrom = createDateFrom;
    return this;
  }

  /**
   * Creation date from
   * @return createDateFrom
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreateDateFrom() {
    return createDateFrom;
  }

  public void setCreateDateFrom(@javax.annotation.Nullable OffsetDateTime createDateFrom) {
    this.createDateFrom = createDateFrom;
  }


  public SearchEnvelopesDTO createDateTo(@javax.annotation.Nullable OffsetDateTime createDateTo) {
    this.createDateTo = createDateTo;
    return this;
  }

  /**
   * Creation date to
   * @return createDateTo
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreateDateTo() {
    return createDateTo;
  }

  public void setCreateDateTo(@javax.annotation.Nullable OffsetDateTime createDateTo) {
    this.createDateTo = createDateTo;
  }


  public SearchEnvelopesDTO receiveDateFrom(@javax.annotation.Nullable OffsetDateTime receiveDateFrom) {
    this.receiveDateFrom = receiveDateFrom;
    return this;
  }

  /**
   * Receive date from
   * @return receiveDateFrom
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReceiveDateFrom() {
    return receiveDateFrom;
  }

  public void setReceiveDateFrom(@javax.annotation.Nullable OffsetDateTime receiveDateFrom) {
    this.receiveDateFrom = receiveDateFrom;
  }


  public SearchEnvelopesDTO receiveDateTo(@javax.annotation.Nullable OffsetDateTime receiveDateTo) {
    this.receiveDateTo = receiveDateTo;
    return this;
  }

  /**
   * Receive date to
   * @return receiveDateTo
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReceiveDateTo() {
    return receiveDateTo;
  }

  public void setReceiveDateTo(@javax.annotation.Nullable OffsetDateTime receiveDateTo) {
    this.receiveDateTo = receiveDateTo;
  }


  public SearchEnvelopesDTO expireDateFrom(@javax.annotation.Nullable OffsetDateTime expireDateFrom) {
    this.expireDateFrom = expireDateFrom;
    return this;
  }

  /**
   * Expire date from
   * @return expireDateFrom
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpireDateFrom() {
    return expireDateFrom;
  }

  public void setExpireDateFrom(@javax.annotation.Nullable OffsetDateTime expireDateFrom) {
    this.expireDateFrom = expireDateFrom;
  }


  public SearchEnvelopesDTO expireDateTo(@javax.annotation.Nullable OffsetDateTime expireDateTo) {
    this.expireDateTo = expireDateTo;
    return this;
  }

  /**
   * Expire date to
   * @return expireDateTo
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpireDateTo() {
    return expireDateTo;
  }

  public void setExpireDateTo(@javax.annotation.Nullable OffsetDateTime expireDateTo) {
    this.expireDateTo = expireDateTo;
  }


  public SearchEnvelopesDTO sendDateFrom(@javax.annotation.Nullable OffsetDateTime sendDateFrom) {
    this.sendDateFrom = sendDateFrom;
    return this;
  }

  /**
   * Envelope sending date from
   * @return sendDateFrom
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSendDateFrom() {
    return sendDateFrom;
  }

  public void setSendDateFrom(@javax.annotation.Nullable OffsetDateTime sendDateFrom) {
    this.sendDateFrom = sendDateFrom;
  }


  public SearchEnvelopesDTO sendDateTo(@javax.annotation.Nullable OffsetDateTime sendDateTo) {
    this.sendDateTo = sendDateTo;
    return this;
  }

  /**
   * Envelope sending date to
   * @return sendDateTo
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSendDateTo() {
    return sendDateTo;
  }

  public void setSendDateTo(@javax.annotation.Nullable OffsetDateTime sendDateTo) {
    this.sendDateTo = sendDateTo;
  }


  public SearchEnvelopesDTO archived(@javax.annotation.Nullable Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Archived
   * @return archived
   */
  @javax.annotation.Nullable
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(@javax.annotation.Nullable Boolean archived) {
    this.archived = archived;
  }


  public SearchEnvelopesDTO deleted(@javax.annotation.Nullable Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Deleted to Recycle Bin
   * @return deleted
   */
  @javax.annotation.Nullable
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(@javax.annotation.Nullable Boolean deleted) {
    this.deleted = deleted;
  }


  public SearchEnvelopesDTO template(@javax.annotation.Nullable Set<UUID> template) {
    this.template = template;
    return this;
  }

  public SearchEnvelopesDTO addTemplateItem(UUID templateItem) {
    if (this.template == null) {
      this.template = new LinkedHashSet<>();
    }
    this.template.add(templateItem);
    return this;
  }

  /**
   * Get template
   * @return template
   */
  @javax.annotation.Nullable
  public Set<UUID> getTemplate() {
    return template;
  }

  public void setTemplate(@javax.annotation.Nullable Set<UUID> template) {
    this.template = template;
  }


  public SearchEnvelopesDTO activeRole(@javax.annotation.Nullable Set<String> activeRole) {
    this.activeRole = activeRole;
    return this;
  }

  public SearchEnvelopesDTO addActiveRoleItem(String activeRoleItem) {
    if (this.activeRole == null) {
      this.activeRole = new LinkedHashSet<>();
    }
    this.activeRole.add(activeRoleItem);
    return this;
  }

  /**
   * Get activeRole
   * @return activeRole
   */
  @javax.annotation.Nullable
  public Set<String> getActiveRole() {
    return activeRole;
  }

  public void setActiveRole(@javax.annotation.Nullable Set<String> activeRole) {
    this.activeRole = activeRole;
  }


  public SearchEnvelopesDTO sender(@javax.annotation.Nullable Set<UUID> sender) {
    this.sender = sender;
    return this;
  }

  public SearchEnvelopesDTO addSenderItem(UUID senderItem) {
    if (this.sender == null) {
      this.sender = new LinkedHashSet<>();
    }
    this.sender.add(senderItem);
    return this;
  }

  /**
   * Get sender
   * @return sender
   */
  @javax.annotation.Nullable
  public Set<UUID> getSender() {
    return sender;
  }

  public void setSender(@javax.annotation.Nullable Set<UUID> sender) {
    this.sender = sender;
  }


  public SearchEnvelopesDTO recipient(@javax.annotation.Nullable Set<UUID> recipient) {
    this.recipient = recipient;
    return this;
  }

  public SearchEnvelopesDTO addRecipientItem(UUID recipientItem) {
    if (this.recipient == null) {
      this.recipient = new LinkedHashSet<>();
    }
    this.recipient.add(recipientItem);
    return this;
  }

  /**
   * Get recipient
   * @return recipient
   */
  @javax.annotation.Nullable
  public Set<UUID> getRecipient() {
    return recipient;
  }

  public void setRecipient(@javax.annotation.Nullable Set<UUID> recipient) {
    this.recipient = recipient;
  }


  public SearchEnvelopesDTO sortField(@javax.annotation.Nullable String sortField) {
    this.sortField = sortField;
    return this;
  }

  /**
   * Field for sorting (&#39;createdAt&#39; by default)
   * @return sortField
   */
  @javax.annotation.Nullable
  public String getSortField() {
    return sortField;
  }

  public void setSortField(@javax.annotation.Nullable String sortField) {
    this.sortField = sortField;
  }


  public SearchEnvelopesDTO sort(@javax.annotation.Nullable SortEnum sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Sort order, asc or desc
   * @return sort
   */
  @javax.annotation.Nullable
  public SortEnum getSort() {
    return sort;
  }

  public void setSort(@javax.annotation.Nullable SortEnum sort) {
    this.sort = sort;
  }


  public SearchEnvelopesDTO searchFields(@javax.annotation.Nullable Set<SearchFieldValueDTO> searchFields) {
    this.searchFields = searchFields;
    return this;
  }

  public SearchEnvelopesDTO addSearchFieldsItem(SearchFieldValueDTO searchFieldsItem) {
    if (this.searchFields == null) {
      this.searchFields = new LinkedHashSet<>();
    }
    this.searchFields.add(searchFieldsItem);
    return this;
  }

  /**
   * Get searchFields
   * @return searchFields
   */
  @javax.annotation.Nullable
  public Set<SearchFieldValueDTO> getSearchFields() {
    return searchFields;
  }

  public void setSearchFields(@javax.annotation.Nullable Set<SearchFieldValueDTO> searchFields) {
    this.searchFields = searchFields;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SearchEnvelopesDTO instance itself
   */
  public SearchEnvelopesDTO putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchEnvelopesDTO searchEnvelopesDTO = (SearchEnvelopesDTO) o;
    return Objects.equals(this.label, searchEnvelopesDTO.label) &&
        Objects.equals(this.scope, searchEnvelopesDTO.scope) &&
        Objects.equals(this.status, searchEnvelopesDTO.status) &&
        Objects.equals(this.subject, searchEnvelopesDTO.subject) &&
        Objects.equals(this.createDateFrom, searchEnvelopesDTO.createDateFrom) &&
        Objects.equals(this.createDateTo, searchEnvelopesDTO.createDateTo) &&
        Objects.equals(this.receiveDateFrom, searchEnvelopesDTO.receiveDateFrom) &&
        Objects.equals(this.receiveDateTo, searchEnvelopesDTO.receiveDateTo) &&
        Objects.equals(this.expireDateFrom, searchEnvelopesDTO.expireDateFrom) &&
        Objects.equals(this.expireDateTo, searchEnvelopesDTO.expireDateTo) &&
        Objects.equals(this.sendDateFrom, searchEnvelopesDTO.sendDateFrom) &&
        Objects.equals(this.sendDateTo, searchEnvelopesDTO.sendDateTo) &&
        Objects.equals(this.archived, searchEnvelopesDTO.archived) &&
        Objects.equals(this.deleted, searchEnvelopesDTO.deleted) &&
        Objects.equals(this.template, searchEnvelopesDTO.template) &&
        Objects.equals(this.activeRole, searchEnvelopesDTO.activeRole) &&
        Objects.equals(this.sender, searchEnvelopesDTO.sender) &&
        Objects.equals(this.recipient, searchEnvelopesDTO.recipient) &&
        Objects.equals(this.sortField, searchEnvelopesDTO.sortField) &&
        Objects.equals(this.sort, searchEnvelopesDTO.sort) &&
        Objects.equals(this.searchFields, searchEnvelopesDTO.searchFields)&&
        Objects.equals(this.additionalProperties, searchEnvelopesDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, scope, status, subject, createDateFrom, createDateTo, receiveDateFrom, receiveDateTo, expireDateFrom, expireDateTo, sendDateFrom, sendDateTo, archived, deleted, template, activeRole, sender, recipient, sortField, sort, searchFields, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchEnvelopesDTO {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    createDateFrom: ").append(toIndentedString(createDateFrom)).append("\n");
    sb.append("    createDateTo: ").append(toIndentedString(createDateTo)).append("\n");
    sb.append("    receiveDateFrom: ").append(toIndentedString(receiveDateFrom)).append("\n");
    sb.append("    receiveDateTo: ").append(toIndentedString(receiveDateTo)).append("\n");
    sb.append("    expireDateFrom: ").append(toIndentedString(expireDateFrom)).append("\n");
    sb.append("    expireDateTo: ").append(toIndentedString(expireDateTo)).append("\n");
    sb.append("    sendDateFrom: ").append(toIndentedString(sendDateFrom)).append("\n");
    sb.append("    sendDateTo: ").append(toIndentedString(sendDateTo)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    activeRole: ").append(toIndentedString(activeRole)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    searchFields: ").append(toIndentedString(searchFields)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("label");
    openapiFields.add("scope");
    openapiFields.add("status");
    openapiFields.add("subject");
    openapiFields.add("createDateFrom");
    openapiFields.add("createDateTo");
    openapiFields.add("receiveDateFrom");
    openapiFields.add("receiveDateTo");
    openapiFields.add("expireDateFrom");
    openapiFields.add("expireDateTo");
    openapiFields.add("sendDateFrom");
    openapiFields.add("sendDateTo");
    openapiFields.add("archived");
    openapiFields.add("deleted");
    openapiFields.add("template");
    openapiFields.add("activeRole");
    openapiFields.add("sender");
    openapiFields.add("recipient");
    openapiFields.add("sortField");
    openapiFields.add("sort");
    openapiFields.add("searchFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchEnvelopesDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchEnvelopesDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchEnvelopesDTO is not found in the empty JSON string", SearchEnvelopesDTO.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull() && !jsonObj.get("label").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be an array in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull() && !jsonObj.get("scope").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be an array in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull() && !jsonObj.get("status").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be an array in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull() && !jsonObj.get("template").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be an array in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("activeRole") != null && !jsonObj.get("activeRole").isJsonNull() && !jsonObj.get("activeRole").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `activeRole` to be an array in the JSON string but got `%s`", jsonObj.get("activeRole").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonNull() && !jsonObj.get("sender").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender` to be an array in the JSON string but got `%s`", jsonObj.get("sender").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("recipient") != null && !jsonObj.get("recipient").isJsonNull() && !jsonObj.get("recipient").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient` to be an array in the JSON string but got `%s`", jsonObj.get("recipient").toString()));
      }
      if ((jsonObj.get("sortField") != null && !jsonObj.get("sortField").isJsonNull()) && !jsonObj.get("sortField").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sortField` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sortField").toString()));
      }
      if ((jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) && !jsonObj.get("sort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort").toString()));
      }
      // validate the optional field `sort`
      if (jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) {
        SortEnum.validateJsonElement(jsonObj.get("sort"));
      }
      if (jsonObj.get("searchFields") != null && !jsonObj.get("searchFields").isJsonNull()) {
        JsonArray jsonArraysearchFields = jsonObj.getAsJsonArray("searchFields");
        if (jsonArraysearchFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("searchFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `searchFields` to be an array in the JSON string but got `%s`", jsonObj.get("searchFields").toString()));
          }

          // validate the optional field `searchFields` (array)
          for (int i = 0; i < jsonArraysearchFields.size(); i++) {
            SearchFieldValueDTO.validateJsonElement(jsonArraysearchFields.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchEnvelopesDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchEnvelopesDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchEnvelopesDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchEnvelopesDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchEnvelopesDTO>() {
           @Override
           public void write(JsonWriter out, SearchEnvelopesDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchEnvelopesDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SearchEnvelopesDTO instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchEnvelopesDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchEnvelopesDTO
   * @throws IOException if the JSON string is invalid with respect to SearchEnvelopesDTO
   */
  public static SearchEnvelopesDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchEnvelopesDTO.class);
  }

  /**
   * Convert an instance of SearchEnvelopesDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

