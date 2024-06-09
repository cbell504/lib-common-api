package com.christopherbell.dev.libs.common.api.contracts;

import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResponseTest {

  @Test
  public void testResponseBuilder() {
    var requestId = UUID.randomUUID();
    var response = Response.<String>builder()
        .messages(List.of(Message.builder()
            .code("testCode")
            .description("testDescription")
            .build()))
        .payload("testPayload")
        .requestId(requestId)
        .success(true)
        .build();

    Assertions.assertNotNull(response);
    Assertions.assertEquals(1, response.getMessages().size());
    Assertions.assertNotNull(response.getMessages().getFirst());
    Assertions.assertEquals("testCode", response.getMessages().getFirst().getCode());
    Assertions.assertEquals("testDescription", response.getMessages().getFirst().getDescription());
    Assertions.assertEquals("testPayload", response.getPayload());
    Assertions.assertEquals(requestId, response.getRequestId());
    Assertions.assertTrue(response.isSuccess());
  }

  @Test
  public void testResponseSetters() {
    var requestId = UUID.randomUUID();
    var response = new Response<String>();
    response.setMessages(List.of(Message.builder()
        .code("testCode")
        .description("testDescription")
        .build()));
    response.setPayload("testPayload");
    response.setRequestId(requestId);
    response.setSuccess(true);

    Assertions.assertNotNull(response);
    Assertions.assertEquals(1, response.getMessages().size());
    Assertions.assertNotNull(response.getMessages().getFirst());
    Assertions.assertEquals("testCode", response.getMessages().getFirst().getCode());
    Assertions.assertEquals("testDescription", response.getMessages().getFirst().getDescription());
    Assertions.assertEquals("testPayload", response.getPayload());
    Assertions.assertEquals(requestId, response.getRequestId());
    Assertions.assertTrue(response.isSuccess());
  }
}
