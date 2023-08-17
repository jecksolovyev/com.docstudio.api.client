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
import java.util.UUID;
/**
 * ExportTaskStatusDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class ExportTaskStatusDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  /**
   * Task status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("PENDING")
    PENDING("PENDING"),
    @SerializedName("STARTED")
    STARTED("STARTED"),
    @SerializedName("COMPLETED")
    COMPLETED("COMPLETED"),
    @SerializedName("CLEANED")
    CLEANED("CLEANED");

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
  private StatusEnum status = null;

  @SerializedName("fileUrl")
  private String fileUrl = null;

  public ExportTaskStatusDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Task uuid
   * @return uuid
  **/
  @Schema(required = true, description = "Task uuid")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public ExportTaskStatusDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Task status
   * @return status
  **/
  @Schema(required = true, description = "Task status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ExportTaskStatusDTO fileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
  }

   /**
   * Exported dictionary url
   * @return fileUrl
  **/
  @Schema(description = "Exported dictionary url")
  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportTaskStatusDTO exportTaskStatusDTO = (ExportTaskStatusDTO) o;
    return Objects.equals(this.uuid, exportTaskStatusDTO.uuid) &&
        Objects.equals(this.status, exportTaskStatusDTO.status) &&
        Objects.equals(this.fileUrl, exportTaskStatusDTO.fileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, status, fileUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportTaskStatusDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
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
