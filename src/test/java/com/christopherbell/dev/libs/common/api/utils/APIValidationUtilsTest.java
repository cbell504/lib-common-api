package com.christopherbell.dev.libs.common.api.utils;

import com.christopherbell.dev.libs.common.api.exceptions.InvalidRequestException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class APIValidationUtilsTest {

  private static final String TEST_CLIENT_ID = "testClientId";

  @Test
  public void testIsValidClientId_success() throws InvalidRequestException {
    var result = APIValidationUtils.isValidClientId(List.of(TEST_CLIENT_ID), TEST_CLIENT_ID);

    Assertions.assertTrue(result);
  }

  @Test
  public void testIsValidClientId_failure_exceptionThrow() throws InvalidRequestException {

    var exception = Assertions.assertThrows(InvalidRequestException.class, () -> {
      APIValidationUtils.isValidClientId(List.of(TEST_CLIENT_ID), "");
    });

    Assertions.assertEquals(APIConstants.VALIDATION_BAD_CLIENT_ID, exception.getMessage());
  }

  @Test
  public void testIsValidResource_success() throws InvalidRequestException {
    var result = APIValidationUtils.isValidResource(APIConstants.VALIDATION_BAD_EMAIL, "test@test.com");

    Assertions.assertTrue(result);
  }

  @Test
  public void testIsValidResource_failure_exceptionThrow() throws InvalidRequestException {

    var exception = Assertions.assertThrows(InvalidRequestException.class, () -> {
      APIValidationUtils.isValidResource(APIConstants.VALIDATION_BAD_EMAIL, "");
    });

    Assertions.assertEquals(APIConstants.VALIDATION_BAD_EMAIL, exception.getMessage());
  }

}
