/*
 * DocStudio Api Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: R121.14
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.docstudio.client.model;

import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Source of activity
 */
@JsonAdapter(OperationSource.Adapter.class)
public enum OperationSource {

  WEB("WEB"),

  API("API"),

  JOB("JOB"),

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

  public static OperationSource fromValue(String value) {
    for (OperationSource b : OperationSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OperationSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final OperationSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OperationSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OperationSource.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    OperationSource.fromValue(value);
  }
}

