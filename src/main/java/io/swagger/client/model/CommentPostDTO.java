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
/**
 * CommentPostDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class CommentPostDTO {
  @SerializedName("documentId")
  private String documentId = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("xpath")
  private String xpath = null;

  /**
   * Access level (&#x27;official&#x27; is not allowed here)
   */
  @JsonAdapter(AccessTypeEnum.Adapter.class)
  public enum AccessTypeEnum {
    MAILBOX("mailbox"),
    ACCOUNT("account"),
    PUB("pub"),
    OFFICIAL("official"),
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

  public CommentPostDTO documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Document ID to create new comment thread
   * @return documentId
  **/
  @Schema(required = true, description = "Document ID to create new comment thread")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public CommentPostDTO text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text of the message
   * @return text
  **/
  @Schema(required = true, description = "Text of the message")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CommentPostDTO xpath(String xpath) {
    this.xpath = xpath;
    return this;
  }

   /**
   * xPath to find selected area
   * @return xpath
  **/
  @Schema(description = "xPath to find selected area")
  public String getXpath() {
    return xpath;
  }

  public void setXpath(String xpath) {
    this.xpath = xpath;
  }

  public CommentPostDTO accessType(AccessTypeEnum accessType) {
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

  public CommentPostDTO sharedTo(List<UUID> sharedTo) {
    this.sharedTo = sharedTo;
    return this;
  }

  public CommentPostDTO addSharedToItem(UUID sharedToItem) {
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
    CommentPostDTO commentPostDTO = (CommentPostDTO) o;
    return Objects.equals(this.documentId, commentPostDTO.documentId) &&
        Objects.equals(this.text, commentPostDTO.text) &&
        Objects.equals(this.xpath, commentPostDTO.xpath) &&
        Objects.equals(this.accessType, commentPostDTO.accessType) &&
        Objects.equals(this.sharedTo, commentPostDTO.sharedTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, text, xpath, accessType, sharedTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentPostDTO {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
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
