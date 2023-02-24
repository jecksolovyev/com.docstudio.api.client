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
import java.util.UUID;
/**
 * Updated domain
 */
@Schema(description = "Updated domain")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:56:46.674358341Z[GMT]")
public class AccountDomainUpdateDTO {
  @SerializedName("ssoIdProviderUuid")
  private UUID ssoIdProviderUuid = null;

  public AccountDomainUpdateDTO ssoIdProviderUuid(UUID ssoIdProviderUuid) {
    this.ssoIdProviderUuid = ssoIdProviderUuid;
    return this;
  }

   /**
   * Get ssoIdProviderUuid
   * @return ssoIdProviderUuid
  **/
  @Schema(description = "")
  public UUID getSsoIdProviderUuid() {
    return ssoIdProviderUuid;
  }

  public void setSsoIdProviderUuid(UUID ssoIdProviderUuid) {
    this.ssoIdProviderUuid = ssoIdProviderUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDomainUpdateDTO accountDomainUpdateDTO = (AccountDomainUpdateDTO) o;
    return Objects.equals(this.ssoIdProviderUuid, accountDomainUpdateDTO.ssoIdProviderUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssoIdProviderUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDomainUpdateDTO {\n");
    
    sb.append("    ssoIdProviderUuid: ").append(toIndentedString(ssoIdProviderUuid)).append("\n");
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