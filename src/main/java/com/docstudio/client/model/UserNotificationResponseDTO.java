/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R82.8
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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
/**
 * Data records
 */
@Schema(description = "Data records")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-19T23:56:47.469723923Z[GMT]")

public class UserNotificationResponseDTO {
  @SerializedName("id")
  private UUID id = null;

  /**
   * Notification type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("user")
    USER("user"),
    @SerializedName("account")
    ACCOUNT("account"),
    @SerializedName("mailbox")
    MAILBOX("mailbox");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * Notification code
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    @SerializedName("1")
    _1("1"),
    @SerializedName("101")
    _101("101"),
    @SerializedName("102")
    _102("102"),
    @SerializedName("103")
    _103("103"),
    @SerializedName("104")
    _104("104"),
    @SerializedName("105")
    _105("105"),
    @SerializedName("106")
    _106("106"),
    @SerializedName("107")
    _107("107"),
    @SerializedName("201")
    _201("201"),
    @SerializedName("202")
    _202("202"),
    @SerializedName("301")
    _301("301"),
    @SerializedName("302")
    _302("302"),
    @SerializedName("303")
    _303("303"),
    @SerializedName("304")
    _304("304"),
    @SerializedName("305")
    _305("305"),
    @SerializedName("306")
    _306("306"),
    @SerializedName("307")
    _307("307"),
    @SerializedName("308")
    _308("308"),
    @SerializedName("309")
    _309("309"),
    @SerializedName("310")
    _310("310"),
    @SerializedName("311")
    _311("311"),
    @SerializedName("312")
    _312("312"),
    @SerializedName("313")
    _313("313"),
    @SerializedName("314")
    _314("314"),
    @SerializedName("315")
    _315("315"),
    @SerializedName("401")
    _401("401"),
    @SerializedName("402")
    _402("402");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CodeEnum fromValue(String input) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CodeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("code")
  private CodeEnum code = null;

  @SerializedName("data")
  private Object data = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("mailboxUuid")
  private UUID mailboxUuid = null;

  @SerializedName("accountUuid")
  private UUID accountUuid = null;

  public UserNotificationResponseDTO id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Notification uuid
   * @return id
  **/
  @Schema(required = true, description = "Notification uuid")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UserNotificationResponseDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Notification type
   * @return type
  **/
  @Schema(required = true, description = "Notification type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public UserNotificationResponseDTO code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * Notification code
   * @return code
  **/
  @Schema(required = true, description = "Notification code")
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public UserNotificationResponseDTO data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Notification data
   * @return data
  **/
  @Schema(required = true, description = "Notification data")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public UserNotificationResponseDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Notification date
   * @return createdAt
  **/
  @Schema(required = true, description = "Notification date")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UserNotificationResponseDTO mailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
    return this;
  }

   /**
   * Mailbox UUID for mailbox-wide notifications
   * @return mailboxUuid
  **/
  @Schema(description = "Mailbox UUID for mailbox-wide notifications")
  public UUID getMailboxUuid() {
    return mailboxUuid;
  }

  public void setMailboxUuid(UUID mailboxUuid) {
    this.mailboxUuid = mailboxUuid;
  }

  public UserNotificationResponseDTO accountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

   /**
   * Account UUID for account-wide notifications
   * @return accountUuid
  **/
  @Schema(description = "Account UUID for account-wide notifications")
  public UUID getAccountUuid() {
    return accountUuid;
  }

  public void setAccountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserNotificationResponseDTO userNotificationResponseDTO = (UserNotificationResponseDTO) o;
    return Objects.equals(this.id, userNotificationResponseDTO.id) &&
        Objects.equals(this.type, userNotificationResponseDTO.type) &&
        Objects.equals(this.code, userNotificationResponseDTO.code) &&
        Objects.equals(this.data, userNotificationResponseDTO.data) &&
        Objects.equals(this.createdAt, userNotificationResponseDTO.createdAt) &&
        Objects.equals(this.mailboxUuid, userNotificationResponseDTO.mailboxUuid) &&
        Objects.equals(this.accountUuid, userNotificationResponseDTO.accountUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, code, data, createdAt, mailboxUuid, accountUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserNotificationResponseDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    mailboxUuid: ").append(toIndentedString(mailboxUuid)).append("\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
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
