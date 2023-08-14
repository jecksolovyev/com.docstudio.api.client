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

import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Source of activity
 */
@JsonAdapter(OperationSource.Adapter.class)
public enum OperationSource {
  @SerializedName("WEB")
  WEB("WEB"),
  @SerializedName("API")
  API("API"),
  @SerializedName("JOB")
  JOB("JOB"),
  @SerializedName("INTEGRATION")
  INTEGRATION("INTEGRATION");

  private String value;

  OperationSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OperationSource fromValue(String input) {
    for (OperationSource b : OperationSource.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OperationSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final OperationSource enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public OperationSource read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return OperationSource.fromValue((String)(value));
    }
  }
}
