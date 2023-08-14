/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R86.31
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
/**
 * Document signatures
 */
@Schema(description = "Document signatures")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-14T22:02:04.375144579Z[GMT]")

public class EnvelopeDocumentSignatureDTO {
  /**
   * Signature source type
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    @SerializedName("binary")
    BINARY("binary"),
    @SerializedName("text")
    TEXT("text");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SourceEnum fromValue(String input) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SourceEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("source")
  private SourceEnum source = null;

  @SerializedName("stamp")
  private Boolean stamp = null;

  @SerializedName("data")
  private String data = null;

  @SerializedName("certificate")
  private String certificate = null;

  public EnvelopeDocumentSignatureDTO source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * Signature source type
   * @return source
  **/
  @Schema(required = true, description = "Signature source type")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public EnvelopeDocumentSignatureDTO stamp(Boolean stamp) {
    this.stamp = stamp;
    return this;
  }

   /**
   * Is stamp signature?
   * @return stamp
  **/
  @Schema(required = true, description = "Is stamp signature?")
  public Boolean isStamp() {
    return stamp;
  }

  public void setStamp(Boolean stamp) {
    this.stamp = stamp;
  }

  public EnvelopeDocumentSignatureDTO data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Signature in base64
   * @return data
  **/
  @Schema(required = true, description = "Signature in base64")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public EnvelopeDocumentSignatureDTO certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Optional X.509 certificate in base64
   * @return certificate
  **/
  @Schema(description = "Optional X.509 certificate in base64")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeDocumentSignatureDTO envelopeDocumentSignatureDTO = (EnvelopeDocumentSignatureDTO) o;
    return Objects.equals(this.source, envelopeDocumentSignatureDTO.source) &&
        Objects.equals(this.stamp, envelopeDocumentSignatureDTO.stamp) &&
        Objects.equals(this.data, envelopeDocumentSignatureDTO.data) &&
        Objects.equals(this.certificate, envelopeDocumentSignatureDTO.certificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, stamp, data, certificate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDocumentSignatureDTO {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    stamp: ").append(toIndentedString(stamp)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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
