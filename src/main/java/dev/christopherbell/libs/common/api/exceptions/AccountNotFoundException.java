package dev.christopherbell.libs.common.api.exceptions;

import lombok.Builder;

/**
 * Exception to throw if we cannot find an account for a request.
 */
@Builder
public class AccountNotFoundException extends Exception {

  public AccountNotFoundException() {
    super();
  }

  public AccountNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public AccountNotFoundException(String message) {
    super(message);
  }

  public AccountNotFoundException(Throwable cause) {
    super(cause);
  }
}
