package com.christopherbell.dev.libs.common.api.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class Response implements Serializable {
  @JsonProperty("httpStatus")
  private HttpStatus httpStatus;
  @JsonProperty("messages")
  private List<Message> messages;
  @JsonProperty("requestId")
  private UUID requestId;
  @JsonProperty("success")
  private boolean success;
}
