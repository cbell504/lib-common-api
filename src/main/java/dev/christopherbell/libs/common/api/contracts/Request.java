package dev.christopherbell.libs.common.api.contracts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Represents the base level request object.
 */
@AllArgsConstructor
@Data
@SuperBuilder
@NoArgsConstructor
public abstract class Request {

  @JsonProperty("requestId")
  private UUID requestId;
}
