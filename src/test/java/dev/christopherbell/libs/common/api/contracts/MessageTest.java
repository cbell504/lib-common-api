package dev.christopherbell.libs.common.api.contracts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessageTest {

  @Test
  public void testMessageBuilder() {
    var message = Message.builder()
        .code("testCode")
        .description("testDescription")
        .build();

    Assertions.assertNotNull(message);
    Assertions.assertEquals("testCode", message.getCode());
    Assertions.assertEquals("testDescription", message.getDescription());
  }

  @Test
  public void testMessageSetters() {
    var message = new Message();
    message.setCode("testCode");
    message.setDescription("testDescription");

    Assertions.assertNotNull(message);
    Assertions.assertEquals("testCode", message.getCode());
    Assertions.assertEquals("testDescription", message.getDescription());
  }
}
