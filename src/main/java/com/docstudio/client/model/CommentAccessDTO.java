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

import java.util.Objects;

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
/**
 * CommentAccessDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class CommentAccessDTO {
  @SerializedName("threadUuid")
  private UUID threadUuid = null;

  /**
   * Access level (&#x27;official&#x27; is not allowed here)
   */
  @JsonAdapter(AccessTypeEnum.Adapter.class)
  public enum AccessTypeEnum {
    @SerializedName("mailbox")
    MAILBOX("mailbox"),
    @SerializedName("account")
    ACCOUNT("account"),
    @SerializedName("pub")
    PUB("pub"),
    @SerializedName("official")
    OFFICIAL("official"),
    @SerializedName("shared")
    SHARED("shared");

    private String value;

    AccessTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AccessTypeEnum fromValue(String input) {
      for (AccessTypeEnum b : AccessTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AccessTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AccessTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AccessTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("accessType")
  private AccessTypeEnum accessType = null;

  @SerializedName("sharedTo")
  private List<UUID> sharedTo = null;

  public CommentAccessDTO threadUuid(UUID threadUuid) {
    this.threadUuid = threadUuid;
    return this;
  }

   /**
   * UUID of comment thread
   * @return threadUuid
  **/
  @Schema(required = true, description = "UUID of comment thread")
  public UUID getThreadUuid() {
    return threadUuid;
  }

  public void setThreadUuid(UUID threadUuid) {
    this.threadUuid = threadUuid;
  }

  public CommentAccessDTO accessType(AccessTypeEnum accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Access level (&#x27;official&#x27; is not allowed here)
   * @return accessType
  **/
  @Schema(required = true, description = "Access level ('official' is not allowed here)")
  public AccessTypeEnum getAccessType() {
    return accessType;
  }

  public void setAccessType(AccessTypeEnum accessType) {
    this.accessType = accessType;
  }

  public CommentAccessDTO sharedTo(List<UUID> sharedTo) {
    this.sharedTo = sharedTo;
    return this;
  }

  public CommentAccessDTO addSharedToItem(UUID sharedToItem) {
    if (this.sharedTo == null) {
      this.sharedTo = new ArrayList<UUID>();
    }
    this.sharedTo.add(sharedToItem);
    return this;
  }

   /**
   * Get sharedTo
   * @return sharedTo
  **/
  @Schema(description = "")
  public List<UUID> getSharedTo() {
    return sharedTo;
  }

  public void setSharedTo(List<UUID> sharedTo) {
    this.sharedTo = sharedTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentAccessDTO commentAccessDTO = (CommentAccessDTO) o;
    return Objects.equals(this.threadUuid, commentAccessDTO.threadUuid) &&
        Objects.equals(this.accessType, commentAccessDTO.accessType) &&
        Objects.equals(this.sharedTo, commentAccessDTO.sharedTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadUuid, accessType, sharedTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentAccessDTO {\n");
    
    sb.append("    threadUuid: ").append(toIndentedString(threadUuid)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    sharedTo: ").append(toIndentedString(sharedTo)).append("\n");
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
