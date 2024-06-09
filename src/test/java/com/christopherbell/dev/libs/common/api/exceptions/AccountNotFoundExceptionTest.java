package com.christopherbell.dev.libs.common.api.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountNotFoundExceptionTest {

  @Test
  public void testAccountNotFoundException() {
    var exception = AccountNotFoundException.builder().build();

    Assertions.assertNotNull(exception);
  }

  @Test
  public void testAccountNotFoundExceptionWithMessage() {
    var exception = new AccountNotFoundException("Account Not Found");

    Assertions.assertNotNull(exception);
    Assertions.assertEquals("Account Not Found", exception.getMessage());
  }

  @Test
  public void testAccountNotFoundExceptionWithMessageAndException() {
    var exception = new AccountNotFoundException("Account Not Found", new Exception("Another Exception"));

    Assertions.assertNotNull(exception);
    Assertions.assertEquals("Account Not Found", exception.getMessage());
    Assertions.assertNotNull(exception.getCause());
    Assertions.assertEquals("Another Exception", exception.getCause().getMessage());
  }

  @Test
  public void testAccountNotFoundExceptionWithException() {
    var exception = new AccountNotFoundException(new Exception("Another Exception"));

    Assertions.assertNotNull(exception.getCause());
    Assertions.assertEquals("Another Exception", exception.getCause().getMessage());
  }
}
