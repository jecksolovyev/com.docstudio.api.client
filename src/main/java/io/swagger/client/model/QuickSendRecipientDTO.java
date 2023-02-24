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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * QuickSendRecipientDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class QuickSendRecipientDTO {
  @SerializedName("recipient")
  private String recipient = null;

  @SerializedName("signer")
  private Boolean signer = null;

  @SerializedName("eInkSignature")
  private Boolean eInkSignature = null;

  public QuickSendRecipientDTO recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * UUID or email of recipient
   * @return recipient
  **/
  @Schema(required = true, description = "UUID or email of recipient")
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public QuickSendRecipientDTO signer(Boolean signer) {
    this.signer = signer;
    return this;
  }

   /**
   * Is recipient a signer? (copy by default)
   * @return signer
  **/
  @Schema(description = "Is recipient a signer? (copy by default)")
  public Boolean isSigner() {
    return signer;
  }

  public void setSigner(Boolean signer) {
    this.signer = signer;
  }

  public QuickSendRecipientDTO eInkSignature(Boolean eInkSignature) {
    this.eInkSignature = eInkSignature;
    return this;
  }

   /**
   * Apply eInk signature on file
   * @return eInkSignature
  **/
  @Schema(description = "Apply eInk signature on file")
  public Boolean isEInkSignature() {
    return eInkSignature;
  }

  public void setEInkSignature(Boolean eInkSignature) {
    this.eInkSignature = eInkSignature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuickSendRecipientDTO quickSendRecipientDTO = (QuickSendRecipientDTO) o;
    return Objects.equals(this.recipient, quickSendRecipientDTO.recipient) &&
        Objects.equals(this.signer, quickSendRecipientDTO.signer) &&
        Objects.equals(this.eInkSignature, quickSendRecipientDTO.eInkSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipient, signer, eInkSignature);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuickSendRecipientDTO {\n");
    
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    signer: ").append(toIndentedString(signer)).append("\n");
    sb.append("    eInkSignature: ").append(toIndentedString(eInkSignature)).append("\n");
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
