package com.christopherbell.dev.libs.common.api.exceptions;

import lombok.Builder;

@Builder
public class InvalidTokenException extends Exception {

  public InvalidTokenException() {
    super();
  }

  public InvalidTokenException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidTokenException(String message) {
    super(message);
  }

  public InvalidTokenException(Throwable cause) {
    super(cause);
  }
}
