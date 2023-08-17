/*
 * DocStudio Api Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: R86.33
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

/**
 * file content
 */
@Schema(description = "file content")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T21:01:07.775897713Z[GMT]")

public class IntegrationConvertbinaryBody {
  @SerializedName("short")
  private Integer _short = null;

  @SerializedName("char")
  private String _char = null;

  @SerializedName("int")
  private Integer _int = null;

  @SerializedName("long")
  private Long _long = null;

  @SerializedName("float")
  private Float _float = null;

  @SerializedName("double")
  private Double _double = null;

  @SerializedName("direct")
  private Boolean direct = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  public IntegrationConvertbinaryBody _short(Integer _short) {
    this._short = _short;
    return this;
  }

   /**
   * Get _short
   * @return _short
  **/
  @Schema(description = "")
  public Integer getShort() {
    return _short;
  }

  public void setShort(Integer _short) {
    this._short = _short;
  }

  public IntegrationConvertbinaryBody _char(String _char) {
    this._char = _char;
    return this;
  }

   /**
   * Get _char
   * @return _char
  **/
  @Schema(description = "")
  public String getChar() {
    return _char;
  }

  public void setChar(String _char) {
    this._char = _char;
  }

  public IntegrationConvertbinaryBody _int(Integer _int) {
    this._int = _int;
    return this;
  }

   /**
   * Get _int
   * @return _int
  **/
  @Schema(description = "")
  public Integer getInt() {
    return _int;
  }

  public void setInt(Integer _int) {
    this._int = _int;
  }

  public IntegrationConvertbinaryBody _long(Long _long) {
    this._long = _long;
    return this;
  }

   /**
   * Get _long
   * @return _long
  **/
  @Schema(description = "")
  public Long getLong() {
    return _long;
  }

  public void setLong(Long _long) {
    this._long = _long;
  }

  public IntegrationConvertbinaryBody _float(Float _float) {
    this._float = _float;
    return this;
  }

   /**
   * Get _float
   * @return _float
  **/
  @Schema(description = "")
  public Float getFloat() {
    return _float;
  }

  public void setFloat(Float _float) {
    this._float = _float;
  }

  public IntegrationConvertbinaryBody _double(Double _double) {
    this._double = _double;
    return this;
  }

   /**
   * Get _double
   * @return _double
  **/
  @Schema(description = "")
  public Double getDouble() {
    return _double;
  }

  public void setDouble(Double _double) {
    this._double = _double;
  }

  public IntegrationConvertbinaryBody direct(Boolean direct) {
    this.direct = direct;
    return this;
  }

   /**
   * Get direct
   * @return direct
  **/
  @Schema(description = "")
  public Boolean isDirect() {
    return direct;
  }

  public void setDirect(Boolean direct) {
    this.direct = direct;
  }

  public IntegrationConvertbinaryBody readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @Schema(description = "")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationConvertbinaryBody integrationConvertbinaryBody = (IntegrationConvertbinaryBody) o;
    return Objects.equals(this._short, integrationConvertbinaryBody._short) &&
        Objects.equals(this._char, integrationConvertbinaryBody._char) &&
        Objects.equals(this._int, integrationConvertbinaryBody._int) &&
        Objects.equals(this._long, integrationConvertbinaryBody._long) &&
        Objects.equals(this._float, integrationConvertbinaryBody._float) &&
        Objects.equals(this._double, integrationConvertbinaryBody._double) &&
        Objects.equals(this.direct, integrationConvertbinaryBody.direct) &&
        Objects.equals(this.readOnly, integrationConvertbinaryBody.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_short, _char, _int, _long, _float, _double, direct, readOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationConvertbinaryBody {\n");
    
    sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
    sb.append("    _char: ").append(toIndentedString(_char)).append("\n");
    sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    direct: ").append(toIndentedString(direct)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
