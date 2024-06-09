package com.christopherbell.dev.libs.common.api.exceptions;

import lombok.Builder;

@Builder
public class ResourceExistsException extends Exception {

  public ResourceExistsException() {
    super();
  }

  public ResourceExistsException(String message, Throwable cause) {
    super(message, cause);
  }

  public ResourceExistsException(String message) {
    super(message);
  }

  public ResourceExistsException(Throwable cause) {
    super(cause);
  }
}
