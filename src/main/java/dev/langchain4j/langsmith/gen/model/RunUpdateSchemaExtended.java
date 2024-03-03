/*
 * LangSmith
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package dev.langchain4j.langsmith.gen.model;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Value;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * RunUpdateSchemaExtended
 */
@Value
@Builder
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T19:56:33.363170+01:00[Europe/Rome]")
public class RunUpdateSchemaExtended {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  String error;

  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  Inputs inputs;

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  Outputs outputs;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  List<Object> events;

}
