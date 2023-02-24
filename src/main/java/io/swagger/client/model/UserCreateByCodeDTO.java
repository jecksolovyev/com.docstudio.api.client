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
 * UserCreateByCodeDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class UserCreateByCodeDTO {
  @SerializedName("code")
  private String code = null;

  @SerializedName("agreed")
  private Boolean agreed = null;

  public UserCreateByCodeDTO code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The invitation code
   * @return code
  **/
  @Schema(description = "The invitation code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public UserCreateByCodeDTO agreed(Boolean agreed) {
    this.agreed = agreed;
    return this;
  }

   /**
   * Agreed with terms of service
   * @return agreed
  **/
  @Schema(description = "Agreed with terms of service")
  public Boolean isAgreed() {
    return agreed;
  }

  public void setAgreed(Boolean agreed) {
    this.agreed = agreed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreateByCodeDTO userCreateByCodeDTO = (UserCreateByCodeDTO) o;
    return Objects.equals(this.code, userCreateByCodeDTO.code) &&
        Objects.equals(this.agreed, userCreateByCodeDTO.agreed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, agreed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateByCodeDTO {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    agreed: ").append(toIndentedString(agreed)).append("\n");
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