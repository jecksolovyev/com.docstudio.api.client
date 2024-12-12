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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * PaymentMethodInfo
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class PaymentMethodInfo {
  @SerializedName("type")
  private String type = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("data")
  private Map<String, String> data = null;

  public PaymentMethodInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Payment method type
   * @return type
  **/
  @Schema(description = "Payment method type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PaymentMethodInfo address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Payment method address
   * @return address
  **/
  @Schema(description = "Payment method address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public PaymentMethodInfo data(Map<String, String> data) {
    this.data = data;
    return this;
  }

  public PaymentMethodInfo putDataItem(String key, String dataItem) {
    if (this.data == null) {
      this.data = new HashMap<String, String>();
    }
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * Payment method details
   * @return data
  **/
  @Schema(description = "Payment method details")
  public Map<String, String> getData() {
    return data;
  }

  public void setData(Map<String, String> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodInfo paymentMethodInfo = (PaymentMethodInfo) o;
    return Objects.equals(this.type, paymentMethodInfo.type) &&
        Objects.equals(this.address, paymentMethodInfo.address) &&
        Objects.equals(this.data, paymentMethodInfo.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, address, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodInfo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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