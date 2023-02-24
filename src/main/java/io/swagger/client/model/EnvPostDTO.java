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
import io.swagger.client.model.DocStampDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * Envelope to send
 */
@Schema(description = "Envelope to send")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class EnvPostDTO {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("data")
  private String data = null;

  @SerializedName("stamps")
  private List<DocStampDTO> stamps = null;

  public EnvPostDTO uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of envelope
   * @return uuid
  **/
  @Schema(description = "UUID of envelope")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public EnvPostDTO data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Envelope XML
   * @return data
  **/
  @Schema(description = "Envelope XML")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public EnvPostDTO stamps(List<DocStampDTO> stamps) {
    this.stamps = stamps;
    return this;
  }

  public EnvPostDTO addStampsItem(DocStampDTO stampsItem) {
    if (this.stamps == null) {
      this.stamps = new ArrayList<DocStampDTO>();
    }
    this.stamps.add(stampsItem);
    return this;
  }

   /**
   * Stamps for external documents
   * @return stamps
  **/
  @Schema(description = "Stamps for external documents")
  public List<DocStampDTO> getStamps() {
    return stamps;
  }

  public void setStamps(List<DocStampDTO> stamps) {
    this.stamps = stamps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvPostDTO envPostDTO = (EnvPostDTO) o;
    return Objects.equals(this.uuid, envPostDTO.uuid) &&
        Objects.equals(this.data, envPostDTO.data) &&
        Objects.equals(this.stamps, envPostDTO.stamps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, data, stamps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvPostDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    stamps: ").append(toIndentedString(stamps)).append("\n");
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
