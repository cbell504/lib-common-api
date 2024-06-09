package com.christopherbell.dev.libs.common.api.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * This class represents a base level response class with common fields that every response should contain.
 */
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@SuperBuilder
public class Response<T> implements Serializable {

  @JsonProperty("messages")
  private List<Message> messages;
  @JsonProperty("payload")
  private T payload;
  @JsonProperty("requestId")
  private UUID requestId;
  @JsonProperty("success")
  private boolean success;
}
