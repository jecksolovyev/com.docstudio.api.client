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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;
/**
 * CommentPutDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-19T23:56:47.469723923Z[GMT]")

public class CommentPutDTO {
  @SerializedName("threadUuid")
  private UUID threadUuid = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("messageId")
  private Integer messageId = null;

  public CommentPutDTO threadUuid(UUID threadUuid) {
    this.threadUuid = threadUuid;
    return this;
  }

   /**
   * Thread UUID to update
   * @return threadUuid
  **/
  @Schema(required = true, description = "Thread UUID to update")
  public UUID getThreadUuid() {
    return threadUuid;
  }

  public void setThreadUuid(UUID threadUuid) {
    this.threadUuid = threadUuid;
  }

  public CommentPutDTO text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text of the comment
   * @return text
  **/
  @Schema(required = true, description = "Text of the comment")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CommentPutDTO messageId(Integer messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Message ID to update (optional)
   * @return messageId
  **/
  @Schema(description = "Message ID to update (optional)")
  public Integer getMessageId() {
    return messageId;
  }

  public void setMessageId(Integer messageId) {
    this.messageId = messageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentPutDTO commentPutDTO = (CommentPutDTO) o;
    return Objects.equals(this.threadUuid, commentPutDTO.threadUuid) &&
        Objects.equals(this.text, commentPutDTO.text) &&
        Objects.equals(this.messageId, commentPutDTO.messageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadUuid, text, messageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentPutDTO {\n");
    
    sb.append("    threadUuid: ").append(toIndentedString(threadUuid)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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
