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


package dev.langchain4j.langsmith.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Logprobs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-24T16:07:41.765433+02:00[Europe/Rome]")
public class Logprobs {
  public static final String SERIALIZED_NAME_TOKENS = "tokens";
  @SerializedName(SERIALIZED_NAME_TOKENS)
  private List<String> tokens = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKEN_LOGPROBS = "token_logprobs";
  @SerializedName(SERIALIZED_NAME_TOKEN_LOGPROBS)
  private List<BigDecimal> tokenLogprobs = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOP_LOGPROBS = "top_logprobs";
  @SerializedName(SERIALIZED_NAME_TOP_LOGPROBS)
  private List<Map<String, Integer>> topLogprobs = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEXT_OFFSET = "text_offset";
  @SerializedName(SERIALIZED_NAME_TEXT_OFFSET)
  private List<Integer> textOffset = new ArrayList<>();

  public Logprobs() {
  }

  public Logprobs tokens(List<String> tokens) {
    
    this.tokens = tokens;
    return this;
  }

  public Logprobs addTokensItem(String tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  @javax.annotation.Nullable

  public List<String> getTokens() {
    return tokens;
  }


  public void setTokens(List<String> tokens) {
    this.tokens = tokens;
  }


  public Logprobs tokenLogprobs(List<BigDecimal> tokenLogprobs) {
    
    this.tokenLogprobs = tokenLogprobs;
    return this;
  }

  public Logprobs addTokenLogprobsItem(BigDecimal tokenLogprobsItem) {
    if (this.tokenLogprobs == null) {
      this.tokenLogprobs = new ArrayList<>();
    }
    this.tokenLogprobs.add(tokenLogprobsItem);
    return this;
  }

   /**
   * Get tokenLogprobs
   * @return tokenLogprobs
  **/
  @javax.annotation.Nullable

  public List<BigDecimal> getTokenLogprobs() {
    return tokenLogprobs;
  }


  public void setTokenLogprobs(List<BigDecimal> tokenLogprobs) {
    this.tokenLogprobs = tokenLogprobs;
  }


  public Logprobs topLogprobs(List<Map<String, Integer>> topLogprobs) {
    
    this.topLogprobs = topLogprobs;
    return this;
  }

  public Logprobs addTopLogprobsItem(Map<String, Integer> topLogprobsItem) {
    if (this.topLogprobs == null) {
      this.topLogprobs = new ArrayList<>();
    }
    this.topLogprobs.add(topLogprobsItem);
    return this;
  }

   /**
   * Get topLogprobs
   * @return topLogprobs
  **/
  @javax.annotation.Nullable

  public List<Map<String, Integer>> getTopLogprobs() {
    return topLogprobs;
  }


  public void setTopLogprobs(List<Map<String, Integer>> topLogprobs) {
    this.topLogprobs = topLogprobs;
  }


  public Logprobs textOffset(List<Integer> textOffset) {
    
    this.textOffset = textOffset;
    return this;
  }

  public Logprobs addTextOffsetItem(Integer textOffsetItem) {
    if (this.textOffset == null) {
      this.textOffset = new ArrayList<>();
    }
    this.textOffset.add(textOffsetItem);
    return this;
  }

   /**
   * Get textOffset
   * @return textOffset
  **/
  @javax.annotation.Nullable

  public List<Integer> getTextOffset() {
    return textOffset;
  }


  public void setTextOffset(List<Integer> textOffset) {
    this.textOffset = textOffset;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Logprobs logprobs = (Logprobs) o;
    return Objects.equals(this.tokens, logprobs.tokens) &&
        Objects.equals(this.tokenLogprobs, logprobs.tokenLogprobs) &&
        Objects.equals(this.topLogprobs, logprobs.topLogprobs) &&
        Objects.equals(this.textOffset, logprobs.textOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokens, tokenLogprobs, topLogprobs, textOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Logprobs {\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    tokenLogprobs: ").append(toIndentedString(tokenLogprobs)).append("\n");
    sb.append("    topLogprobs: ").append(toIndentedString(topLogprobs)).append("\n");
    sb.append("    textOffset: ").append(toIndentedString(textOffset)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

