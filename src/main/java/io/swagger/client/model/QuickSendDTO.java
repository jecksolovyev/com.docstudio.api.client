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
import io.swagger.client.model.QuickSendRecipientDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Send QuickSendDTO in BLOB format
 */
@Schema(description = "Send QuickSendDTO in BLOB format")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class QuickSendDTO {
  @SerializedName("subject")
  private String subject = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("recipients")
  private List<QuickSendRecipientDTO> recipients = new ArrayList<QuickSendRecipientDTO>();

  public QuickSendDTO subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of envelope
   * @return subject
  **/
  @Schema(required = true, description = "Subject of envelope")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public QuickSendDTO message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message of envelope
   * @return message
  **/
  @Schema(description = "Message of envelope")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public QuickSendDTO recipients(List<QuickSendRecipientDTO> recipients) {
    this.recipients = recipients;
    return this;
  }

  public QuickSendDTO addRecipientsItem(QuickSendRecipientDTO recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @Schema(required = true, description = "")
  public List<QuickSendRecipientDTO> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<QuickSendRecipientDTO> recipients) {
    this.recipients = recipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuickSendDTO quickSendDTO = (QuickSendDTO) o;
    return Objects.equals(this.subject, quickSendDTO.subject) &&
        Objects.equals(this.message, quickSendDTO.message) &&
        Objects.equals(this.recipients, quickSendDTO.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, message, recipients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuickSendDTO {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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
