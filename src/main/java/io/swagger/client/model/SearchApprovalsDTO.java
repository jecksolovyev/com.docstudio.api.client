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
import org.threeten.bp.OffsetDateTime;
/**
 * SearchApprovalsDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class SearchApprovalsDTO {
  /**
   * Envelope approval scope
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    INBOX("inbox"),
    OUTBOX("outbox");

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
    public static ScopeEnum fromValue(String input) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ScopeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("scope")
  private ScopeEnum scope = null;

  /**
   * Envelope statuses
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NOT_STARTED("NOT_STARTED"),
    WAITING("WAITING"),
    APPROVED("APPROVED"),
    REJECTED("REJECTED"),
    CANCELLED("CANCELLED");

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
  private List<StatusEnum> status = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("receiveDateFrom")
  private OffsetDateTime receiveDateFrom = null;

  @SerializedName("receiveDateTo")
  private OffsetDateTime receiveDateTo = null;

  @SerializedName("template")
  private List<UUID> template = null;

  @SerializedName("initiator")
  private List<UUID> initiator = null;

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
    public static SortEnum fromValue(String input) {
      for (SortEnum b : SortEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SortEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SortEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SortEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("sort")
  private SortEnum sort = null;

  @SerializedName("urgent")
  private Boolean urgent = null;

  public SearchApprovalsDTO scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Envelope approval scope
   * @return scope
  **/
  @Schema(required = true, description = "Envelope approval scope")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public SearchApprovalsDTO status(List<StatusEnum> status) {
    this.status = status;
    return this;
  }

  public SearchApprovalsDTO addStatusItem(StatusEnum statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<StatusEnum>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Envelope statuses
   * @return status
  **/
  @Schema(description = "Envelope statuses")
  public List<StatusEnum> getStatus() {
    return status;
  }

  public void setStatus(List<StatusEnum> status) {
    this.status = status;
  }

  public SearchApprovalsDTO subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Envelope subject
   * @return subject
  **/
  @Schema(description = "Envelope subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public SearchApprovalsDTO receiveDateFrom(OffsetDateTime receiveDateFrom) {
    this.receiveDateFrom = receiveDateFrom;
    return this;
  }

   /**
   * Receive date from
   * @return receiveDateFrom
  **/
  @Schema(description = "Receive date from")
  public OffsetDateTime getReceiveDateFrom() {
    return receiveDateFrom;
  }

  public void setReceiveDateFrom(OffsetDateTime receiveDateFrom) {
    this.receiveDateFrom = receiveDateFrom;
  }

  public SearchApprovalsDTO receiveDateTo(OffsetDateTime receiveDateTo) {
    this.receiveDateTo = receiveDateTo;
    return this;
  }

   /**
   * Receive date to
   * @return receiveDateTo
  **/
  @Schema(description = "Receive date to")
  public OffsetDateTime getReceiveDateTo() {
    return receiveDateTo;
  }

  public void setReceiveDateTo(OffsetDateTime receiveDateTo) {
    this.receiveDateTo = receiveDateTo;
  }

  public SearchApprovalsDTO template(List<UUID> template) {
    this.template = template;
    return this;
  }

  public SearchApprovalsDTO addTemplateItem(UUID templateItem) {
    if (this.template == null) {
      this.template = new ArrayList<UUID>();
    }
    this.template.add(templateItem);
    return this;
  }

   /**
   * Template uuids
   * @return template
  **/
  @Schema(description = "Template uuids")
  public List<UUID> getTemplate() {
    return template;
  }

  public void setTemplate(List<UUID> template) {
    this.template = template;
  }

  public SearchApprovalsDTO initiator(List<UUID> initiator) {
    this.initiator = initiator;
    return this;
  }

  public SearchApprovalsDTO addInitiatorItem(UUID initiatorItem) {
    if (this.initiator == null) {
      this.initiator = new ArrayList<UUID>();
    }
    this.initiator.add(initiatorItem);
    return this;
  }

   /**
   * Envelope approval initiator uuids
   * @return initiator
  **/
  @Schema(description = "Envelope approval initiator uuids")
  public List<UUID> getInitiator() {
    return initiator;
  }

  public void setInitiator(List<UUID> initiator) {
    this.initiator = initiator;
  }

  public SearchApprovalsDTO sort(SortEnum sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Sort order, asc or desc
   * @return sort
  **/
  @Schema(description = "Sort order, asc or desc")
  public SortEnum getSort() {
    return sort;
  }

  public void setSort(SortEnum sort) {
    this.sort = sort;
  }

  public SearchApprovalsDTO urgent(Boolean urgent) {
    this.urgent = urgent;
    return this;
  }

   /**
   * Is approval urgent?
   * @return urgent
  **/
  @Schema(description = "Is approval urgent?")
  public Boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(Boolean urgent) {
    this.urgent = urgent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchApprovalsDTO searchApprovalsDTO = (SearchApprovalsDTO) o;
    return Objects.equals(this.scope, searchApprovalsDTO.scope) &&
        Objects.equals(this.status, searchApprovalsDTO.status) &&
        Objects.equals(this.subject, searchApprovalsDTO.subject) &&
        Objects.equals(this.receiveDateFrom, searchApprovalsDTO.receiveDateFrom) &&
        Objects.equals(this.receiveDateTo, searchApprovalsDTO.receiveDateTo) &&
        Objects.equals(this.template, searchApprovalsDTO.template) &&
        Objects.equals(this.initiator, searchApprovalsDTO.initiator) &&
        Objects.equals(this.sort, searchApprovalsDTO.sort) &&
        Objects.equals(this.urgent, searchApprovalsDTO.urgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, status, subject, receiveDateFrom, receiveDateTo, template, initiator, sort, urgent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchApprovalsDTO {\n");
    
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    receiveDateFrom: ").append(toIndentedString(receiveDateFrom)).append("\n");
    sb.append("    receiveDateTo: ").append(toIndentedString(receiveDateTo)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    urgent: ").append(toIndentedString(urgent)).append("\n");
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
