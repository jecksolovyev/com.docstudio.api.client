/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R120.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.docstudio.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.docstudio.client.model.TariffDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Tariff info
 */
@Schema(description = "Tariff info")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class AccountTariffInfo {
  @SerializedName("validFrom")
  private OffsetDateTime validFrom = null;

  @SerializedName("validTo")
  private OffsetDateTime validTo = null;

  @SerializedName("tariff")
  private TariffDetails tariff = null;

  public AccountTariffInfo validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Valid from datetime
   * @return validFrom
  **/
  @Schema(description = "Valid from datetime")
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public AccountTariffInfo validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

   /**
   * Valid to datetime
   * @return validTo
  **/
  @Schema(description = "Valid to datetime")
  public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public AccountTariffInfo tariff(TariffDetails tariff) {
    this.tariff = tariff;
    return this;
  }

   /**
   * Get tariff
   * @return tariff
  **/
  @Schema(description = "")
  public TariffDetails getTariff() {
    return tariff;
  }

  public void setTariff(TariffDetails tariff) {
    this.tariff = tariff;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTariffInfo accountTariffInfo = (AccountTariffInfo) o;
    return Objects.equals(this.validFrom, accountTariffInfo.validFrom) &&
        Objects.equals(this.validTo, accountTariffInfo.validTo) &&
        Objects.equals(this.tariff, accountTariffInfo.tariff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validFrom, validTo, tariff);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTariffInfo {\n");
    
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    tariff: ").append(toIndentedString(tariff)).append("\n");
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
