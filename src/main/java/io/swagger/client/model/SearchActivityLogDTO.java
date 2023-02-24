/*
 * Docstudio Api Documentation
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
import io.swagger.client.model.ActivityLogAction;
import io.swagger.client.model.ActivityLogObjectType;
import io.swagger.client.model.OperationSource;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
/**
 * SearchActivityLogDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class SearchActivityLogDTO {
  @SerializedName("accountUuid")
  private UUID accountUuid = null;

  @SerializedName("mailboxUuid")
  private UUID mailboxUuid = null;

  @SerializedName("action")
  private ActivityLogAction action = null;

  @SerializedName("objectName")
  private String objectName = null;

  @SerializedName("objectType")
  private ActivityLogObjectType objectType = null;

  @SerializedName("objectId")
  private UUID objectId = null;

  @SerializedName("operatorId")
  private UUID operatorId = null;

  @SerializedName("source")
  private OperationSource source = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("errorCode")
  private Integer errorCode = null;

  @SerializedName("dateFrom")
  private OffsetDateTime dateFrom = null;

  @SerializedName("dateTo")
  private OffsetDateTime dateTo = null;

  public SearchActivityLogDTO accountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

   /**
   * Get accountUuid
   * @return accountUuid
  **/
  @Schema(required = true, description = "")
  public UUID getAccountUuid() {
    return accountUuid;
  }

  public void setAccountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
  }

  public SearchActivityLogDTO mailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

   /**
   * Get mailboxUuid
   * @return mailboxUuid
  **/
  @Schema(description = "")
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }

  public SearchActivityLogDTO action(ActivityLogAction action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public ActivityLogAction getAction() {
    return action;
  }

  public void setAction(ActivityLogAction action) {
    this.action = action;
  }

  public SearchActivityLogDTO objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

   /**
   * Get objectName
   * @return objectName
  **/
  @Schema(description = "")
  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }

  public SearchActivityLogDTO objectType(ActivityLogObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @Schema(description = "")
  public ActivityLogObjectType getObjectType() {
    return objectType;
  }

  public void setObjectType(ActivityLogObjectType objectType) {
    this.objectType = objectType;
  }

  public SearchActivityLogDTO objectId(UUID objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @Schema(description = "")
  public UUID getObjectId() {
    return objectId;
  }

  public void setObjectId(UUID objectId) {
    this.objectId = objectId;
  }

  public SearchActivityLogDTO operatorId(UUID operatorId) {
    this.operatorId = operatorId;
    return this;
  }

   /**
   * Get operatorId
   * @return operatorId
  **/
  @Schema(description = "")
  public UUID getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(UUID operatorId) {
    this.operatorId = operatorId;
  }

  public SearchActivityLogDTO source(OperationSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public OperationSource getSource() {
    return source;
  }

  public void setSource(OperationSource source) {
    this.source = source;
  }

  public SearchActivityLogDTO ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @Schema(description = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public SearchActivityLogDTO errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(description = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public SearchActivityLogDTO dateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Get dateFrom
   * @return dateFrom
  **/
  @Schema(description = "")
  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }

  public SearchActivityLogDTO dateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * Get dateTo
   * @return dateTo
  **/
  @Schema(description = "")
  public OffsetDateTime getDateTo() {
    return dateTo;
  }

  public void setDateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchActivityLogDTO searchActivityLogDTO = (SearchActivityLogDTO) o;
    return Objects.equals(this.accountUuid, searchActivityLogDTO.accountUuid) &&
        Objects.equals(this.mailboxUuid, searchActivityLogDTO.mailboxUuid) &&
        Objects.equals(this.action, searchActivityLogDTO.action) &&
        Objects.equals(this.objectName, searchActivityLogDTO.objectName) &&
        Objects.equals(this.objectType, searchActivityLogDTO.objectType) &&
        Objects.equals(this.objectId, searchActivityLogDTO.objectId) &&
        Objects.equals(this.operatorId, searchActivityLogDTO.operatorId) &&
        Objects.equals(this.source, searchActivityLogDTO.source) &&
        Objects.equals(this.ip, searchActivityLogDTO.ip) &&
        Objects.equals(this.errorCode, searchActivityLogDTO.errorCode) &&
        Objects.equals(this.dateFrom, searchActivityLogDTO.dateFrom) &&
        Objects.equals(this.dateTo, searchActivityLogDTO.dateTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountUuid, mailboxUuid, action, objectName, objectType, objectId, operatorId, source, ip, errorCode, dateFrom, dateTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchActivityLogDTO {\n");
    
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
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
