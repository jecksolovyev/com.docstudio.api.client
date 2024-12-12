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
/**
 * NewEnvColumnDTO
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-12T19:25:03.673810363Z[GMT]")

public class NewEnvColumnDTO {
  @SerializedName("fieldName")
  private String fieldName = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("text")
    TEXT("text"),
    @SerializedName("datetime")
    DATETIME("datetime"),
    @SerializedName("yesno")
    YESNO("yesno"),
    @SerializedName("selectDictionary")
    SELECTDICTIONARY("selectDictionary"),
    @SerializedName("einksign")
    EINKSIGN("einksign"),
    @SerializedName("initials")
    INITIALS("initials"),
    @SerializedName("pades")
    PADES("pades"),
    @SerializedName("number")
    NUMBER("number"),
    @SerializedName("money")
    MONEY("money"),
    @SerializedName("lookup")
    LOOKUP("lookup"),
    @SerializedName("duplicate")
    DUPLICATE("duplicate"),
    @SerializedName("attachment")
    ATTACHMENT("attachment"),
    @SerializedName("formula")
    FORMULA("formula"),
    @SerializedName("autonumber")
    AUTONUMBER("autonumber"),
    @SerializedName("checkbox")
    CHECKBOX("checkbox"),
    @SerializedName("dropdown")
    DROPDOWN("dropdown"),
    @SerializedName("radio")
    RADIO("radio"),
    @SerializedName("barcode")
    BARCODE("barcode");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("visible")
  private Boolean visible = null;

  @SerializedName("width")
  private Integer width = null;

  public NewEnvColumnDTO fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Get fieldName
   * @return fieldName
  **/
  @Schema(required = true, description = "")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public NewEnvColumnDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public NewEnvColumnDTO order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @Schema(description = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public NewEnvColumnDTO visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Get visible
   * @return visible
  **/
  @Schema(description = "")
  public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public NewEnvColumnDTO width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @Schema(description = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewEnvColumnDTO newEnvColumnDTO = (NewEnvColumnDTO) o;
    return Objects.equals(this.fieldName, newEnvColumnDTO.fieldName) &&
        Objects.equals(this.type, newEnvColumnDTO.type) &&
        Objects.equals(this.order, newEnvColumnDTO.order) &&
        Objects.equals(this.visible, newEnvColumnDTO.visible) &&
        Objects.equals(this.width, newEnvColumnDTO.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, type, order, visible, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewEnvColumnDTO {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
